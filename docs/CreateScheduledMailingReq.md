

# CreateScheduledMailingReq

Request schema for creating a new scheduled mailing. Contains the email template, recipient list, client-provided scheduled time (ISO8601), timezone, recurring flag, recurrence interval (if applicable), number of credits to reserve, and an optional webhook configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**template** | [**Template**](Template.md) |  |  |
|**recipients** | **List&lt;String&gt;** | List of recipient email addresses. |  |
|**scheduledTime** | **String** | Client-provided scheduled start time in ISO8601 format (with timezone). |  |
|**timezone** | **String** | The client&#39;s timezone (e.g., &#39;America/New_York&#39;, &#39;America/Toronto&#39;, &#39;Europe/Paris&#39;). |  |
|**recurring** | **Boolean** | Indicates whether the mailing is recurring. |  |
|**recurrenceInterval** | **String** | Interval for recurring mailings (e.g., &#39;1 week&#39;). |  [optional] |
|**hook** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags associated with this scheduled mailing. |  [optional] |


## Implemented Interfaces

* Serializable


