/*
 * ZBounce Email Engine Platform
 * ZBounce Email Engine Platform API Reference
 *
 * The version of the OpenAPI document: 3.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Recipient;
import org.openapitools.client.model.Template;
import org.openapitools.client.model.WebhookConfig;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Task for asynchronous batch sending
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-27T09:35:58.468477+03:00[Europe/Minsk]", comments = "Generator version: 7.13.0")
public class BatchEmail implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  @javax.annotation.Nonnull
  private Template template;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  @javax.annotation.Nonnull
  private List<Recipient> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALIDATE = "validate";
  @SerializedName(SERIALIZED_NAME_VALIDATE)
  @javax.annotation.Nullable
  private Boolean validate = false;

  public static final String SERIALIZED_NAME_SKIP_DISPOSABLE = "skip_disposable";
  @SerializedName(SERIALIZED_NAME_SKIP_DISPOSABLE)
  @javax.annotation.Nullable
  private Boolean skipDisposable = false;

  public static final String SERIALIZED_NAME_SKIP_RISKY = "skip_risky";
  @SerializedName(SERIALIZED_NAME_SKIP_RISKY)
  @javax.annotation.Nullable
  private Boolean skipRisky = false;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  @javax.annotation.Nullable
  private Boolean priority = false;

  public static final String SERIALIZED_NAME_HOOK = "hook";
  @SerializedName(SERIALIZED_NAME_HOOK)
  @javax.annotation.Nullable
  private WebhookConfig hook;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public BatchEmail() {
  }

  public BatchEmail template(@javax.annotation.Nonnull Template template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   */
  @javax.annotation.Nonnull
  public Template getTemplate() {
    return template;
  }

  public void setTemplate(@javax.annotation.Nonnull Template template) {
    this.template = template;
  }


  public BatchEmail recipients(@javax.annotation.Nonnull List<Recipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public BatchEmail addRecipientsItem(Recipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * Get recipients
   * @return recipients
   */
  @javax.annotation.Nonnull
  public List<Recipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(@javax.annotation.Nonnull List<Recipient> recipients) {
    this.recipients = recipients;
  }


  public BatchEmail validate(@javax.annotation.Nullable Boolean validate) {
    this.validate = validate;
    return this;
  }

  /**
   * Probe mailbox existence via SMTP
   * @return validate
   */
  @javax.annotation.Nullable
  public Boolean getValidate() {
    return validate;
  }

  public void setValidate(@javax.annotation.Nullable Boolean validate) {
    this.validate = validate;
  }


  public BatchEmail skipDisposable(@javax.annotation.Nullable Boolean skipDisposable) {
    this.skipDisposable = skipDisposable;
    return this;
  }

  /**
   * Drop addresses on disposable domains
   * @return skipDisposable
   */
  @javax.annotation.Nullable
  public Boolean getSkipDisposable() {
    return skipDisposable;
  }

  public void setSkipDisposable(@javax.annotation.Nullable Boolean skipDisposable) {
    this.skipDisposable = skipDisposable;
  }


  public BatchEmail skipRisky(@javax.annotation.Nullable Boolean skipRisky) {
    this.skipRisky = skipRisky;
    return this;
  }

  /**
   * Drop domains detected as accept-all &#x60;risky&#x60; by SMTP probe
   * @return skipRisky
   */
  @javax.annotation.Nullable
  public Boolean getSkipRisky() {
    return skipRisky;
  }

  public void setSkipRisky(@javax.annotation.Nullable Boolean skipRisky) {
    this.skipRisky = skipRisky;
  }


  public BatchEmail priority(@javax.annotation.Nullable Boolean priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
   */
  @javax.annotation.Nullable
  public Boolean getPriority() {
    return priority;
  }

  public void setPriority(@javax.annotation.Nullable Boolean priority) {
    this.priority = priority;
  }


  public BatchEmail hook(@javax.annotation.Nullable WebhookConfig hook) {
    this.hook = hook;
    return this;
  }

  /**
   * Get hook
   * @return hook
   */
  @javax.annotation.Nullable
  public WebhookConfig getHook() {
    return hook;
  }

  public void setHook(@javax.annotation.Nullable WebhookConfig hook) {
    this.hook = hook;
  }


  public BatchEmail tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BatchEmail addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Optional tags associated with this batch task
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchEmail batchEmail = (BatchEmail) o;
    return Objects.equals(this.template, batchEmail.template) &&
        Objects.equals(this.recipients, batchEmail.recipients) &&
        Objects.equals(this.validate, batchEmail.validate) &&
        Objects.equals(this.skipDisposable, batchEmail.skipDisposable) &&
        Objects.equals(this.skipRisky, batchEmail.skipRisky) &&
        Objects.equals(this.priority, batchEmail.priority) &&
        Objects.equals(this.hook, batchEmail.hook) &&
        Objects.equals(this.tags, batchEmail.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(template, recipients, validate, skipDisposable, skipRisky, priority, hook, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchEmail {\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
    sb.append("    skipDisposable: ").append(toIndentedString(skipDisposable)).append("\n");
    sb.append("    skipRisky: ").append(toIndentedString(skipRisky)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("template");
    openapiFields.add("recipients");
    openapiFields.add("validate");
    openapiFields.add("skip_disposable");
    openapiFields.add("skip_risky");
    openapiFields.add("priority");
    openapiFields.add("hook");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("template");
    openapiRequiredFields.add("recipients");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchEmail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchEmail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchEmail is not found in the empty JSON string", BatchEmail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchEmail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchEmail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchEmail.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `template`
      Template.validateJsonElement(jsonObj.get("template"));
      // ensure the json data is an array
      if (!jsonObj.get("recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
      }

      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      // validate the required field `recipients` (array)
      for (int i = 0; i < jsonArrayrecipients.size(); i++) {
        Recipient.validateJsonElement(jsonArrayrecipients.get(i));
      };
      // validate the optional field `hook`
      if (jsonObj.get("hook") != null && !jsonObj.get("hook").isJsonNull()) {
        WebhookConfig.validateJsonElement(jsonObj.get("hook"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchEmail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchEmail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchEmail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchEmail.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchEmail>() {
           @Override
           public void write(JsonWriter out, BatchEmail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchEmail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchEmail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchEmail
   * @throws IOException if the JSON string is invalid with respect to BatchEmail
   */
  public static BatchEmail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchEmail.class);
  }

  /**
   * Convert an instance of BatchEmail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

