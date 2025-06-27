

# UpdateScheduledMailingReq

Request schema for updating an existing scheduled mailing. All fields are optional; only provided fields will be updated.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mailingId** | **String** | Unique identifier of the scheduled mailing. |  [optional] |
|**template** | [**Template**](Template.md) |  |  [optional] |
|**recipients** | **List&lt;String&gt;** | Updated list of recipient email addresses. |  [optional] |
|**scheduledTime** | **String** | Updated scheduled start time in ISO8601 format. |  [optional] |
|**timezone** | **String** | Updated client timezone. |  [optional] |
|**recurring** | **Boolean** | Updated recurring flag. |  [optional] |
|**recurrenceInterval** | **String** | Updated recurrence interval (e.g., &#39;1 week&#39;). |  [optional] |
|**credits** | **Integer** | Updated number of credits to reserve. |  [optional] |
|**hook** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Updated tags associated with this scheduled mailing. |  [optional] |


## Implemented Interfaces

* Serializable


