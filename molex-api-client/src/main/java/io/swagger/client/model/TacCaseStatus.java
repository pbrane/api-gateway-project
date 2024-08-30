/*
 * RMA_RestAPI_Design_1
 * Customer Requirements from Excel Document RMA_RestAPI_Design 1.xlsx
 *
 * OpenAPI spec version: 0.0.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Possible values for the status of the trouble ticket
 */
@JsonAdapter(TacCaseStatus.Adapter.class)
public enum TacCaseStatus {
  @SerializedName("open")
  OPEN("open"),
  @SerializedName("acknowledged")
  ACKNOWLEDGED("acknowledged"),
  @SerializedName("rejected")
  REJECTED("rejected"),
  @SerializedName("pending")
  PENDING("pending"),
  @SerializedName("held")
  HELD("held"),
  @SerializedName("inprogress")
  INPROGRESS("inprogress"),
  @SerializedName("cancelled")
  CANCELLED("cancelled"),
  @SerializedName("closed")
  CLOSED("closed"),
  @SerializedName("resolved")
  RESOLVED("resolved");

  private String value;

  TacCaseStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TacCaseStatus fromValue(String input) {
    for (TacCaseStatus b : TacCaseStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TacCaseStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TacCaseStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public TacCaseStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return TacCaseStatus.fromValue((String)(value));
    }
  }
}