/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * represents the current status of a scale subresource.
 */
@ApiModel(description = "represents the current status of a scale subresource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-06T10:41:07.822Z[Etc/UTC]")
public class ExtensionsV1beta1ScaleStatus {
  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private Map<String, String> selector = null;

  public static final String SERIALIZED_NAME_TARGET_SELECTOR = "targetSelector";
  @SerializedName(SERIALIZED_NAME_TARGET_SELECTOR)
  private String targetSelector;


  public ExtensionsV1beta1ScaleStatus replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * actual number of observed instances of the scaled object.
   * @return replicas
  **/
  @ApiModelProperty(required = true, value = "actual number of observed instances of the scaled object.")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }


  public ExtensionsV1beta1ScaleStatus selector(Map<String, String> selector) {
    
    this.selector = selector;
    return this;
  }

  public ExtensionsV1beta1ScaleStatus putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<String, String>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * label query over pods that should match the replicas count. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "label query over pods that should match the replicas count. More info: http://kubernetes.io/docs/user-guide/labels#label-selectors")

  public Map<String, String> getSelector() {
    return selector;
  }


  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }


  public ExtensionsV1beta1ScaleStatus targetSelector(String targetSelector) {
    
    this.targetSelector = targetSelector;
    return this;
  }

   /**
   * label selector for pods that should match the replicas count. This is a serializated version of both map-based and more expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based selector field are populated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
   * @return targetSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "label selector for pods that should match the replicas count. This is a serializated version of both map-based and more expressive set-based selectors. This is done to avoid introspection in the clients. The string will be in the same format as the query-param syntax. If the target type only supports map-based selectors, both this field and map-based selector field are populated. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors")

  public String getTargetSelector() {
    return targetSelector;
  }


  public void setTargetSelector(String targetSelector) {
    this.targetSelector = targetSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1ScaleStatus {\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    targetSelector: ").append(toIndentedString(targetSelector)).append("\n");
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
