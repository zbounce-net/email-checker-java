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
import java.util.Arrays;
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
 * BatchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-27T09:35:58.468477+03:00[Europe/Minsk]", comments = "Generator version: 7.13.0")
public class BatchResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  @javax.annotation.Nullable
  private String taskId;

  public static final String SERIALIZED_NAME_ACCEPTED = "accepted";
  @SerializedName(SERIALIZED_NAME_ACCEPTED)
  @javax.annotation.Nullable
  private Integer accepted;

  public static final String SERIALIZED_NAME_SKIPPED = "skipped";
  @SerializedName(SERIALIZED_NAME_SKIPPED)
  @javax.annotation.Nullable
  private Integer skipped;

  public BatchResponse() {
  }

  public BatchResponse taskId(@javax.annotation.Nullable String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   */
  @javax.annotation.Nullable
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(@javax.annotation.Nullable String taskId) {
    this.taskId = taskId;
  }


  public BatchResponse accepted(@javax.annotation.Nullable Integer accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * Get accepted
   * @return accepted
   */
  @javax.annotation.Nullable
  public Integer getAccepted() {
    return accepted;
  }

  public void setAccepted(@javax.annotation.Nullable Integer accepted) {
    this.accepted = accepted;
  }


  public BatchResponse skipped(@javax.annotation.Nullable Integer skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Get skipped
   * @return skipped
   */
  @javax.annotation.Nullable
  public Integer getSkipped() {
    return skipped;
  }

  public void setSkipped(@javax.annotation.Nullable Integer skipped) {
    this.skipped = skipped;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.taskId, batchResponse.taskId) &&
        Objects.equals(this.accepted, batchResponse.accepted) &&
        Objects.equals(this.skipped, batchResponse.skipped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, accepted, skipped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
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
    openapiFields.add("task_id");
    openapiFields.add("accepted");
    openapiFields.add("skipped");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchResponse is not found in the empty JSON string", BatchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("task_id") != null && !jsonObj.get("task_id").isJsonNull()) && !jsonObj.get("task_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `task_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("task_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchResponse>() {
           @Override
           public void write(JsonWriter out, BatchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchResponse
   * @throws IOException if the JSON string is invalid with respect to BatchResponse
   */
  public static BatchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchResponse.class);
  }

  /**
   * Convert an instance of BatchResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

