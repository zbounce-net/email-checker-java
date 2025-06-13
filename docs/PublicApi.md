# PublicApi

All URIs are relative to *https://api.zbounce.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1FastVerifyPost**](PublicApi.md#v1FastVerifyPost) | **POST** /v1/fast-verify | Fast single-email verification |
| [**v1TasksPost**](PublicApi.md#v1TasksPost) | **POST** /v1/tasks | Create batch verification task |
| [**v1TasksResultsTaskIdGet**](PublicApi.md#v1TasksResultsTaskIdGet) | **GET** /v1/tasks-results/{task_id} | Paginated task results |
| [**v1TasksTaskIdGet**](PublicApi.md#v1TasksTaskIdGet) | **GET** /v1/tasks/{task_id} | Get task status |


<a id="v1FastVerifyPost"></a>
# **v1FastVerifyPost**
> EmailReport v1FastVerifyPost(fastVerifyRequest)

Fast single-email verification

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.zbounce.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicApi apiInstance = new PublicApi(defaultClient);
    FastVerifyRequest fastVerifyRequest = new FastVerifyRequest(); // FastVerifyRequest | 
    try {
      EmailReport result = apiInstance.v1FastVerifyPost(fastVerifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1FastVerifyPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fastVerifyRequest** | [**FastVerifyRequest**](FastVerifyRequest.md)|  | |

### Return type

[**EmailReport**](EmailReport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid JSON |  -  |
| **403** | Invalid key / exhausted quota |  -  |
| **429** | Server busy |  -  |

<a id="v1TasksPost"></a>
# **v1TasksPost**
> TaskResponse v1TasksPost(createTaskRequest)

Create batch verification task

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.zbounce.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicApi apiInstance = new PublicApi(defaultClient);
    CreateTaskRequest createTaskRequest = new CreateTaskRequest(); // CreateTaskRequest | 
    try {
      TaskResponse result = apiInstance.v1TasksPost(createTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1TasksPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createTaskRequest** | [**CreateTaskRequest**](CreateTaskRequest.md)|  | |

### Return type

[**TaskResponse**](TaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task created |  -  |
| **400** | Bad request |  -  |
| **403** | Quota exhausted / invalid key |  -  |

<a id="v1TasksResultsTaskIdGet"></a>
# **v1TasksResultsTaskIdGet**
> PaginatedResults v1TasksResultsTaskIdGet(taskId, page, perPage)

Paginated task results

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.zbounce.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String taskId = "taskId_example"; // String | 
    Integer page = 1; // Integer | 
    Integer perPage = 100; // Integer | 
    try {
      PaginatedResults result = apiInstance.v1TasksResultsTaskIdGet(taskId, page, perPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1TasksResultsTaskIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 1] |
| **perPage** | **Integer**|  | [optional] [default to 100] |

### Return type

[**PaginatedResults**](PaginatedResults.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

<a id="v1TasksTaskIdGet"></a>
# **v1TasksTaskIdGet**
> TaskStatusResponse v1TasksTaskIdGet(taskId)

Get task status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.zbounce.net");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicApi apiInstance = new PublicApi(defaultClient);
    String taskId = "taskId_example"; // String | 
    try {
      TaskStatusResponse result = apiInstance.v1TasksTaskIdGet(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1TasksTaskIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taskId** | **String**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |

