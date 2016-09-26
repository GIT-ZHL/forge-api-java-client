/**
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. From visualizing data to 3D printing, take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Object Signed Object json response
 */
@ApiModel(description = "Object Signed Object json response")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.ADSKJavaClientCodegen", date = "2016-09-25T18:48:45.159+03:00")
public class PostObjectSigned   {
  @JsonProperty("signedUrl")
  private String signedUrl = null;

  @JsonProperty("expiration")
  private Integer expiration = null;

  public PostObjectSigned signedUrl(String signedUrl) {
    this.signedUrl = signedUrl;
    return this;
  }

   /**
   * URL created for downloading the object
   * @return signedUrl
  **/
  @ApiModelProperty(example = "null", required = true, value = "URL created for downloading the object")
  public String getSignedUrl() {
    return signedUrl;
  }

  public void setSignedUrl(String signedUrl) {
    this.signedUrl = signedUrl;
  }

  public PostObjectSigned expiration(Integer expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Value for expiration in minutes
   * @return expiration
  **/
  @ApiModelProperty(example = "null", required = true, value = "Value for expiration in minutes")
  public Integer getExpiration() {
    return expiration;
  }

  public void setExpiration(Integer expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostObjectSigned postObjectSigned = (PostObjectSigned) o;
    return Objects.equals(this.signedUrl, postObjectSigned.signedUrl) &&
        Objects.equals(this.expiration, postObjectSigned.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUrl, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostObjectSigned {\n");
    
    sb.append("    signedUrl: ").append(toIndentedString(signedUrl)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
