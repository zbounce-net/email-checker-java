

# ScheduledMailing

A scheduled mailing object representing a mailing job scheduled for future execution. It includes details such as the email template, recipient list, scheduled time (in ISO8601 UTC), client timezone, recurring options, and the number of credits reserved automatically (calculated as the count of recipients). It also contains the current status, any associated webhook configuration, and timestamps.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Unique identifier (UUID) of the scheduled mailing. |  |
|**apiKey** | **String** | Owner&#39;s API key. This field may be omitted in client responses if not required. |  [optional] |
|**template** | [**Template**](Template.md) |  |  |
|**recipients** | **List&lt;String&gt;** | List of recipient email addresses. |  |
|**scheduledTime** | **Date** | Scheduled start time in ISO8601 format (UTC). |  |
|**timezone** | **String** | The client&#39;s timezone, e.g., \&quot;America/New_York\&quot;, \&quot;America/Toronto\&quot;, or \&quot;Europe/Paris\&quot;. |  |
|**recurring** | **Boolean** | Indicates whether the mailing is recurring. |  |
|**recurrenceInterval** | **String** | Recurrence interval (e.g., \&quot;1 week\&quot;); applicable if &#39;recurring&#39; is true. |  [optional] |
|**credits** | **Integer** | Number of credits automatically reserved for the mailing (calculated as the number of recipients). |  |
|**status** | **String** | Status of the mailing: e.g., \&quot;pending\&quot;, \&quot;running\&quot;, \&quot;paused_due_to_insufficient_credits\&quot;, \&quot;completed\&quot;, or \&quot;cancelled\&quot;. |  |
|**hook** | [**WebhookConfig**](WebhookConfig.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Optional tags associated with this scheduled mailing. |  [optional] |
|**createdAt** | **Integer** | Creation timestamp (Unix timestamp). |  |
|**updatedAt** | **Integer** | Last update timestamp (Unix timestamp). |  |


## Implemented Interfaces

* Serializable


