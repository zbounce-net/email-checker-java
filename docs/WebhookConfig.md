

# WebhookConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** |  |  |
|**secret** | **String** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**maxRetries** | **Integer** |  |  [optional] |
|**timeoutMs** | **Integer** |  |  [optional] |
|**dlqUrl** | **URI** |  |  [optional] |
|**basicAuth** | [**BasicAuth**](BasicAuth.md) |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |
| RESULTS | &quot;results&quot; |


## Implemented Interfaces

* Serializable


