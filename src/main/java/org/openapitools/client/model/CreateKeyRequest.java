/*
 * ZBounce Email-Checker API
 * Batch and real-time email verification.
 *
 * The version of the OpenAPI document: 2.2.0
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
 * CreateKeyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-13T15:19:56.609676+03:00[Europe/Minsk]", comments = "Generator version: 7.13.0")
public class CreateKeyRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAY_AS_YOU_GO("pay_as_you_go"),
    
    MONTHLY("monthly");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_INITIAL_CHECKS = "initial_checks";
  @SerializedName(SERIALIZED_NAME_INITIAL_CHECKS)
  @javax.annotation.Nonnull
  private Integer initialChecks;

  public static final String SERIALIZED_NAME_VALIDITY_DAYS = "validity_days";
  @SerializedName(SERIALIZED_NAME_VALIDITY_DAYS)
  @javax.annotation.Nonnull
  private Integer validityDays;

  public CreateKeyRequest() {
  }

  public CreateKeyRequest type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public CreateKeyRequest initialChecks(@javax.annotation.Nonnull Integer initialChecks) {
    this.initialChecks = initialChecks;
    return this;
  }

  /**
   * Get initialChecks
   * minimum: 1
   * @return initialChecks
   */
  @javax.annotation.Nonnull
  public Integer getInitialChecks() {
    return initialChecks;
  }

  public void setInitialChecks(@javax.annotation.Nonnull Integer initialChecks) {
    this.initialChecks = initialChecks;
  }


  public CreateKeyRequest validityDays(@javax.annotation.Nonnull Integer validityDays) {
    this.validityDays = validityDays;
    return this;
  }

  /**
   * Get validityDays
   * minimum: 1
   * @return validityDays
   */
  @javax.annotation.Nonnull
  public Integer getValidityDays() {
    return validityDays;
  }

  public void setValidityDays(@javax.annotation.Nonnull Integer validityDays) {
    this.validityDays = validityDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateKeyRequest createKeyRequest = (CreateKeyRequest) o;
    return Objects.equals(this.type, createKeyRequest.type) &&
        Objects.equals(this.initialChecks, createKeyRequest.initialChecks) &&
        Objects.equals(this.validityDays, createKeyRequest.validityDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, initialChecks, validityDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateKeyRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    initialChecks: ").append(toIndentedString(initialChecks)).append("\n");
    sb.append("    validityDays: ").append(toIndentedString(validityDays)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("initial_checks");
    openapiFields.add("validity_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("initial_checks");
    openapiRequiredFields.add("validity_days");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateKeyRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateKeyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateKeyRequest is not found in the empty JSON string", CreateKeyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateKeyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateKeyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateKeyRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateKeyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateKeyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateKeyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateKeyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateKeyRequest>() {
           @Override
           public void write(JsonWriter out, CreateKeyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateKeyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateKeyRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateKeyRequest
   * @throws IOException if the JSON string is invalid with respect to CreateKeyRequest
   */
  public static CreateKeyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateKeyRequest.class);
  }

  /**
   * Convert an instance of CreateKeyRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

