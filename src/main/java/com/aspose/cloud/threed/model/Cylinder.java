/*
 * Aspose.ThreeD Cloud API Reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.threed.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Cylinder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T10:19:53.827+08:00")
public class Cylinder {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("RadiusTop")
  private Double radiusTop = null;

  @SerializedName("RadiusBottom")
  private Double radiusBottom = null;

  @SerializedName("Height")
  private Double height = null;

  @SerializedName("RadialSegments")
  private Integer radialSegments = null;

  @SerializedName("HeightSegments")
  private Integer heightSegments = null;

  @SerializedName("OpenEnded")
  private Boolean openEnded = null;

  @SerializedName("ThetaStart")
  private Double thetaStart = null;

  @SerializedName("ThetaLength")
  private Double thetaLength = null;

  public Cylinder name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name of the cylinder             
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name of the cylinder             ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cylinder radiusTop(Double radiusTop) {
    this.radiusTop = radiusTop;
    return this;
  }

   /**
   * Gets or sets the radius of cylinder&#39;s top cap.
   * @return radiusTop
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the radius of cylinder's top cap.")
  public Double getRadiusTop() {
    return radiusTop;
  }

  public void setRadiusTop(Double radiusTop) {
    this.radiusTop = radiusTop;
  }

  public Cylinder radiusBottom(Double radiusBottom) {
    this.radiusBottom = radiusBottom;
    return this;
  }

   /**
   * Gets or sets the radius bottoof cylinder&#39;s bottom cap.             
   * @return radiusBottom
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the radius bottoof cylinder's bottom cap.             ")
  public Double getRadiusBottom() {
    return radiusBottom;
  }

  public void setRadiusBottom(Double radiusBottom) {
    this.radiusBottom = radiusBottom;
  }

  public Cylinder height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height of the cylinder.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the height of the cylinder.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Cylinder radialSegments(Integer radialSegments) {
    this.radialSegments = radialSegments;
    return this;
  }

   /**
   * Gets or sets the radial segments.
   * @return radialSegments
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the radial segments.")
  public Integer getRadialSegments() {
    return radialSegments;
  }

  public void setRadialSegments(Integer radialSegments) {
    this.radialSegments = radialSegments;
  }

  public Cylinder heightSegments(Integer heightSegments) {
    this.heightSegments = heightSegments;
    return this;
  }

   /**
   * Gets or sets the height segments.
   * @return heightSegments
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the height segments.")
  public Integer getHeightSegments() {
    return heightSegments;
  }

  public void setHeightSegments(Integer heightSegments) {
    this.heightSegments = heightSegments;
  }

  public Cylinder openEnded(Boolean openEnded) {
    this.openEnded = openEnded;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this Aspose.ThreeD.Entities.Cylinder open ended. The default value is false.
   * @return openEnded
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether this Aspose.ThreeD.Entities.Cylinder open ended. The default value is false.")
  public Boolean OpenEnded() {
    return openEnded;
  }

  public void setOpenEnded(Boolean openEnded) {
    this.openEnded = openEnded;
  }

  public Cylinder thetaStart(Double thetaStart) {
    this.thetaStart = thetaStart;
    return this;
  }

   /**
   * Gets or sets the theta start. The default value is 0.             
   * @return thetaStart
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the theta start. The default value is 0.             ")
  public Double getThetaStart() {
    return thetaStart;
  }

  public void setThetaStart(Double thetaStart) {
    this.thetaStart = thetaStart;
  }

  public Cylinder thetaLength(Double thetaLength) {
    this.thetaLength = thetaLength;
    return this;
  }

   /**
   * Gets or sets the length of the theta. The default value is 2��.
   * @return thetaLength
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the length of the theta. The default value is 2p.")
  public Double getThetaLength() {
    return thetaLength;
  }

  public void setThetaLength(Double thetaLength) {
    this.thetaLength = thetaLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cylinder cylinder = (Cylinder) o;
    return Objects.equals(this.name, cylinder.name) &&
        Objects.equals(this.radiusTop, cylinder.radiusTop) &&
        Objects.equals(this.radiusBottom, cylinder.radiusBottom) &&
        Objects.equals(this.height, cylinder.height) &&
        Objects.equals(this.radialSegments, cylinder.radialSegments) &&
        Objects.equals(this.heightSegments, cylinder.heightSegments) &&
        Objects.equals(this.openEnded, cylinder.openEnded) &&
        Objects.equals(this.thetaStart, cylinder.thetaStart) &&
        Objects.equals(this.thetaLength, cylinder.thetaLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, radiusTop, radiusBottom, height, radialSegments, heightSegments, openEnded, thetaStart, thetaLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cylinder {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radiusTop: ").append(toIndentedString(radiusTop)).append("\n");
    sb.append("    radiusBottom: ").append(toIndentedString(radiusBottom)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    radialSegments: ").append(toIndentedString(radialSegments)).append("\n");
    sb.append("    heightSegments: ").append(toIndentedString(heightSegments)).append("\n");
    sb.append("    openEnded: ").append(toIndentedString(openEnded)).append("\n");
    sb.append("    thetaStart: ").append(toIndentedString(thetaStart)).append("\n");
    sb.append("    thetaLength: ").append(toIndentedString(thetaLength)).append("\n");
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

