package net.zbounce.emailchecker;

import org.openapitools.client.ApiClient;
import org.openapitools.client.api.PublicApi;
import org.openapitools.client.model.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Удобная надстройка над сгенерированным PublicApi.
 */
public class ZBounceClient {

    private final PublicApi api;

    /* ──────────── КОНСТРУКТОРЫ ──────────── */

    /** Базовый URL по умолчанию. */
    public static final String DEFAULT_URL = "https://api.zbounce.net";

    /** Быстрый конструктор с дефолтным URL. */
    public ZBounceClient(String apiKey) {
        this(DEFAULT_URL, apiKey);
    }

    /** Полный конструктор. */
    public ZBounceClient(String baseUrl, String apiKey) {
        ApiClient raw = new ApiClient()
                .setBasePath(baseUrl);
        raw.setApiKey(apiKey);              // <-- встроенный helper
        this.api = new PublicApi(raw);
    }

    /* ──────────── КОРОТКИЕ ВЫЗОВЫ ──────────── */

    /** /v1/fast-verify */
    public EmailReport fastVerify(String email) throws Exception {
        FastVerifyRequest req = new FastVerifyRequest().email(email);
        return api.v1FastVerifyPost(req);
    }

    /** /v1/tasks (создание пачки) */
    public String createTask(List<String> emails, WebhookConfig hook) throws Exception {
        CreateTaskRequest req = new CreateTaskRequest().emails(emails).webhook(hook);
        TaskResponse resp = api.v1TasksPost(req);
        return resp.getTaskId();
    }

    /** /v1/tasks/{id} (статус) */
    public TaskStatusResponse getTask(String id) throws Exception {
        return api.v1TasksTaskIdGet(id);
    }

    /* ──────────── ПОЛЛИНГ ДО ГОТОВНОСТИ ──────────── */

    /** Ожидаем статус «completed». */
    public TaskStatusResponse waitUntilDone(String id,
                                            long interval,
                                            TimeUnit unit) throws Exception {
        long ms = unit.toMillis(interval);
        while (true) {
            TaskStatusResponse st = getTask(id);
            if ("completed".equalsIgnoreCase(st.getStatus())) {
                return st;
            }
            Thread.sleep(ms);
        }
    }

    /* ──────────── ЛЕНИВАЯ ИТЕРАЦИЯ РЕЗУЛЬТАТОВ ──────────── */

    /**
     * Возвращает Iterable, которое вытягивает результаты по страницам.
     *
     * @param pageSize 1-1000 (API лимит ― 1000)
     */
    public Iterable<EmailReport> iterResults(final String taskId, final int pageSize) {
        return new Iterable<EmailReport>() {
            @Override
            public Iterator<EmailReport> iterator() {
                return new ResultsIterator(api, taskId, pageSize);
            }
        };
    }

    /* ========== приватный класс-итератор ========== */

    private static class ResultsIterator implements Iterator<EmailReport> {
        private final PublicApi api;
        private final String taskId;
        private final int pageSize;

        private int currentPage = 1;                 // ← 1-based
        private List<EmailReport> buffer = Collections.emptyList();
        private int indexInBuffer = 0;
        private boolean noMorePages = false;

        ResultsIterator(PublicApi api, String taskId, int pageSize) {
            this.api = api;
            this.taskId = taskId;
            this.pageSize = pageSize;
        }

        @Override
        public boolean hasNext() {
            try {
                // буфер закончился, а страницы ещё есть ― подгружаем
                while (indexInBuffer >= buffer.size() && !noMorePages) {
                    PaginatedResults resp =
                            api.v1TasksResultsTaskIdGet(taskId, currentPage, pageSize);
                    buffer = resp.getData();
                    indexInBuffer = 0;
                    currentPage++;

                    if (buffer == null || buffer.isEmpty()) {
                        noMorePages = true;      // пустая страница ― больше нет данных
                    }
                }
                return indexInBuffer < buffer.size();
            } catch (Exception e) {
                throw new RuntimeException(e);    // unchecked ↔ Iterator contract
            }
        }

        @Override
        public EmailReport next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return buffer.get(indexInBuffer++);
        }
    }
}
