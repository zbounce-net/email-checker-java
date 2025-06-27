# PublicApi

All URIs are relative to *https://api.zbounce.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1DomainsDomainPatch**](PublicApi.md#v1DomainsDomainPatch) | **PATCH** /v1/domains/{domain} | Verify DNS TXT records of domain |
| [**v1DomainsGet**](PublicApi.md#v1DomainsGet) | **GET** /v1/domains | List sender domains |
| [**v1DomainsPost**](PublicApi.md#v1DomainsPost) | **POST** /v1/domains | Register new sender domain |
| [**v1FastVerifyPost**](PublicApi.md#v1FastVerifyPost) | **POST** /v1/fast-verify | Fast single-address verification |
| [**v1ScheduledMailingsGet**](PublicApi.md#v1ScheduledMailingsGet) | **GET** /v1/scheduled-mailings | List scheduled mailings |
| [**v1ScheduledMailingsMailingIdDelete**](PublicApi.md#v1ScheduledMailingsMailingIdDelete) | **DELETE** /v1/scheduled-mailings/{mailing_id} | Delete a scheduled mailing |
| [**v1ScheduledMailingsMailingIdGet**](PublicApi.md#v1ScheduledMailingsMailingIdGet) | **GET** /v1/scheduled-mailings/{mailing_id} | Get a scheduled mailing by ID |
| [**v1ScheduledMailingsMailingIdPut**](PublicApi.md#v1ScheduledMailingsMailingIdPut) | **PUT** /v1/scheduled-mailings/{mailing_id} | Update a scheduled mailing |
| [**v1ScheduledMailingsPost**](PublicApi.md#v1ScheduledMailingsPost) | **POST** /v1/scheduled-mailings | Create a new scheduled mailing |
| [**v1SendBatchPost**](PublicApi.md#v1SendBatchPost) | **POST** /v1/send-batch | Send templated e-mails to many recipients |
| [**v1TasksPost**](PublicApi.md#v1TasksPost) | **POST** /v1/tasks | Create verification task |
| [**v1TasksResultsTaskIdGet**](PublicApi.md#v1TasksResultsTaskIdGet) | **GET** /v1/tasks-results/{task_id} | Paginated verification results |
| [**v1TasksTaskIdGet**](PublicApi.md#v1TasksTaskIdGet) | **GET** /v1/tasks/{task_id} | Get verification task status |


<a id="v1DomainsDomainPatch"></a>
# **v1DomainsDomainPatch**
> V1DomainsDomainPatch200Response v1DomainsDomainPatch(domain)

Verify DNS TXT records of domain

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
    String domain = "example.org"; // String | 
    try {
      V1DomainsDomainPatch200Response result = apiInstance.v1DomainsDomainPatch(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1DomainsDomainPatch");
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
| **domain** | **String**|  | |

### Return type

[**V1DomainsDomainPatch200Response**](V1DomainsDomainPatch200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verification result |  -  |
| **400** | Invalid request |  -  |
| **404** | Domain not found |  -  |

<a id="v1DomainsGet"></a>
# **v1DomainsGet**
> List&lt;DomainInfo&gt; v1DomainsGet()

List sender domains

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
    try {
      List<DomainInfo> result = apiInstance.v1DomainsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1DomainsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DomainInfo&gt;**](DomainInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of registered domains |  -  |

<a id="v1DomainsPost"></a>
# **v1DomainsPost**
> DomainInfo v1DomainsPost(domainRegisterReq)

Register new sender domain

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
    DomainRegisterReq domainRegisterReq = new DomainRegisterReq(); // DomainRegisterReq | 
    try {
      DomainInfo result = apiInstance.v1DomainsPost(domainRegisterReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1DomainsPost");
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
| **domainRegisterReq** | [**DomainRegisterReq**](DomainRegisterReq.md)|  | |

### Return type

[**DomainInfo**](DomainInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Registration info with TXT records |  -  |
| **400** | Bad request |  -  |

<a id="v1FastVerifyPost"></a>
# **v1FastVerifyPost**
> EmailReport v1FastVerifyPost(fastVerifyRequest)

Fast single-address verification

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

<a id="v1ScheduledMailingsGet"></a>
# **v1ScheduledMailingsGet**
> ListScheduledMailingsResp v1ScheduledMailingsGet()

List scheduled mailings

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
    try {
      ListScheduledMailingsResp result = apiInstance.v1ScheduledMailingsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1ScheduledMailingsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListScheduledMailingsResp**](ListScheduledMailingsResp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of scheduled mailings |  -  |

<a id="v1ScheduledMailingsMailingIdDelete"></a>
# **v1ScheduledMailingsMailingIdDelete**
> DeleteScheduledMailingResp v1ScheduledMailingsMailingIdDelete(mailingId)

Delete a scheduled mailing

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
    String mailingId = "mailingId_example"; // String | 
    try {
      DeleteScheduledMailingResp result = apiInstance.v1ScheduledMailingsMailingIdDelete(mailingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1ScheduledMailingsMailingIdDelete");
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
| **mailingId** | **String**|  | |

### Return type

[**DeleteScheduledMailingResp**](DeleteScheduledMailingResp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled mailing deleted |  -  |
| **404** | Scheduled mailing not found |  -  |

<a id="v1ScheduledMailingsMailingIdGet"></a>
# **v1ScheduledMailingsMailingIdGet**
> GetScheduledMailingResp v1ScheduledMailingsMailingIdGet(mailingId)

Get a scheduled mailing by ID

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
    String mailingId = "mailingId_example"; // String | 
    try {
      GetScheduledMailingResp result = apiInstance.v1ScheduledMailingsMailingIdGet(mailingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1ScheduledMailingsMailingIdGet");
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
| **mailingId** | **String**|  | |

### Return type

[**GetScheduledMailingResp**](GetScheduledMailingResp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled mailing details |  -  |
| **404** | Scheduled mailing not found |  -  |

<a id="v1ScheduledMailingsMailingIdPut"></a>
# **v1ScheduledMailingsMailingIdPut**
> UpdateScheduledMailingResp v1ScheduledMailingsMailingIdPut(mailingId, updateScheduledMailingReq)

Update a scheduled mailing

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
    String mailingId = "mailingId_example"; // String | 
    UpdateScheduledMailingReq updateScheduledMailingReq = new UpdateScheduledMailingReq(); // UpdateScheduledMailingReq | 
    try {
      UpdateScheduledMailingResp result = apiInstance.v1ScheduledMailingsMailingIdPut(mailingId, updateScheduledMailingReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1ScheduledMailingsMailingIdPut");
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
| **mailingId** | **String**|  | |
| **updateScheduledMailingReq** | [**UpdateScheduledMailingReq**](UpdateScheduledMailingReq.md)|  | |

### Return type

[**UpdateScheduledMailingResp**](UpdateScheduledMailingResp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled mailing updated |  -  |
| **400** | Invalid input |  -  |

<a id="v1ScheduledMailingsPost"></a>
# **v1ScheduledMailingsPost**
> CreateScheduledMailingResp v1ScheduledMailingsPost(createScheduledMailingReq)

Create a new scheduled mailing

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
    CreateScheduledMailingReq createScheduledMailingReq = new CreateScheduledMailingReq(); // CreateScheduledMailingReq | 
    try {
      CreateScheduledMailingResp result = apiInstance.v1ScheduledMailingsPost(createScheduledMailingReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1ScheduledMailingsPost");
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
| **createScheduledMailingReq** | [**CreateScheduledMailingReq**](CreateScheduledMailingReq.md)|  | |

### Return type

[**CreateScheduledMailingResp**](CreateScheduledMailingResp.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Scheduled mailing created successfully |  -  |
| **400** | Invalid input |  -  |
| **403** | Insufficient credits or scheduled mailing quota exceeded |  -  |

<a id="v1SendBatchPost"></a>
# **v1SendBatchPost**
> BatchResponse v1SendBatchPost(batchEmail)

Send templated e-mails to many recipients

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
    BatchEmail batchEmail = new BatchEmail(); // BatchEmail | 
    try {
      BatchResponse result = apiInstance.v1SendBatchPost(batchEmail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicApi#v1SendBatchPost");
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
| **batchEmail** | [**BatchEmail**](BatchEmail.md)|  | |

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task accepted |  -  |
| **400** | Invalid template/request format. Inactive sender domain |  -  |
| **403** | Quota exhausted or invalid API key |  -  |

<a id="v1TasksPost"></a>
# **v1TasksPost**
> TaskResponse v1TasksPost(createTaskRequest)

Create verification task

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

Paginated verification results

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

Get verification task status

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
| **404** | Task not found |  -  |

