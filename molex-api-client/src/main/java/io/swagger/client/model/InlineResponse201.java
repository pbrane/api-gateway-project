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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse201
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-08-29T19:29:38.424806759Z[GMT]")

public class InlineResponse201 {
  @SerializedName("attachmentId")
  private String attachmentId = null;

  @SerializedName("href")
  private String href = null;

  public InlineResponse201 attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * The unique identifier of the uploaded attachment
   * @return attachmentId
  **/
  @Schema(description = "The unique identifier of the uploaded attachment")
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public InlineResponse201 href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The URL to access the uploaded attachment
   * @return href
  **/
  @Schema(description = "The URL to access the uploaded attachment")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201 inlineResponse201 = (InlineResponse201) o;
    return Objects.equals(this.attachmentId, inlineResponse201.attachmentId) &&
        Objects.equals(this.href, inlineResponse201.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, href);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201 {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}