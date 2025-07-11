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
import org.openapitools.client.model.KeySummary;
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
 * TaskStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-27T09:35:58.468477+03:00[Europe/Minsk]", comments = "Generator version: 7.13.0")
public class TaskStatusResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  @javax.annotation.Nullable
  private Integer total;

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  @javax.annotation.Nullable
  private Integer done;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  @javax.annotation.Nullable
  private Integer totalPages;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  @javax.annotation.Nullable
  private Integer createdAt;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @javax.annotation.Nullable
  private KeySummary key;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public TaskStatusResponse() {
  }

  public TaskStatusResponse status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public TaskStatusResponse total(@javax.annotation.Nullable Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @javax.annotation.Nullable
  public Integer getTotal() {
    return total;
  }

  public void setTotal(@javax.annotation.Nullable Integer total) {
    this.total = total;
  }


  public TaskStatusResponse done(@javax.annotation.Nullable Integer done) {
    this.done = done;
    return this;
  }

  /**
   * Get done
   * @return done
   */
  @javax.annotation.Nullable
  public Integer getDone() {
    return done;
  }

  public void setDone(@javax.annotation.Nullable Integer done) {
    this.done = done;
  }


  public TaskStatusResponse totalPages(@javax.annotation.Nullable Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   */
  @javax.annotation.Nullable
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(@javax.annotation.Nullable Integer totalPages) {
    this.totalPages = totalPages;
  }


  public TaskStatusResponse createdAt(@javax.annotation.Nullable Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Unix timestamp
   * @return createdAt
   */
  @javax.annotation.Nullable
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@javax.annotation.Nullable Integer createdAt) {
    this.createdAt = createdAt;
  }


  public TaskStatusResponse key(@javax.annotation.Nullable KeySummary key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   */
  @javax.annotation.Nullable
  public KeySummary getKey() {
    return key;
  }

  public void setKey(@javax.annotation.Nullable KeySummary key) {
    this.key = key;
  }


  public TaskStatusResponse tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public TaskStatusResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the task
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
    TaskStatusResponse taskStatusResponse = (TaskStatusResponse) o;
    return Objects.equals(this.status, taskStatusResponse.status) &&
        Objects.equals(this.total, taskStatusResponse.total) &&
        Objects.equals(this.done, taskStatusResponse.done) &&
        Objects.equals(this.totalPages, taskStatusResponse.totalPages) &&
        Objects.equals(this.createdAt, taskStatusResponse.createdAt) &&
        Objects.equals(this.key, taskStatusResponse.key) &&
        Objects.equals(this.tags, taskStatusResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, total, done, totalPages, createdAt, key, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatusResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("total");
    openapiFields.add("done");
    openapiFields.add("total_pages");
    openapiFields.add("created_at");
    openapiFields.add("key");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaskStatusResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskStatusResponse is not found in the empty JSON string", TaskStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaskStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaskStatusResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `key`
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) {
        KeySummary.validateJsonElement(jsonObj.get("key"));
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
       if (!TaskStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskStatusResponse>() {
           @Override
           public void write(JsonWriter out, TaskStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaskStatusResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaskStatusResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaskStatusResponse
   * @throws IOException if the JSON string is invalid with respect to TaskStatusResponse
   */
  public static TaskStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskStatusResponse.class);
  }

  /**
   * Convert an instance of TaskStatusResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

