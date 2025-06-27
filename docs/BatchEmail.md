

# BatchEmail

Task for asynchronous batch sending

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**template** | [**Template**](Template.md) |  |  |
|**recipients** | [**List&lt;Recipient&gt;**](Recipient.md) |  |  |
|**validate** | **Boolean** | Probe mailbox existence via SMTP |  [optional] |
|**skipDisposable** | **Boolean** | Drop addresses on disposable domains |  [optional] |
|**skipRisky** | **Boolean** | Drop domains detected as accept-all &#x60;risky&#x60; by SMTP probe |  [optional] |
|**priority** | **Boolean** |  |  [optional] |
|**hook** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags associated with this batch task |  [optional] |


## Implemented Interfaces

* Serializable


