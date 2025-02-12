package io.GuardianExpress.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;


public class ResponseBody {
  @SerializedName("score")
  private String score = null;
  @SerializedName("razones")
  private List<String> razones = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("mensaje")
  private String mensaje = null;
  public ResponseBody score(String score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(example = "3.5", value = "Valor del score  (0, 10)")
  public String getScore() {
    return score;
  }
  public void setScore(String score) {
    this.score = score;
  }
  public ResponseBody razones(List<String> razones) {
    this.razones = razones;
    return this;
  }
  public ResponseBody addRazonesItem(String razonesItem) {
    if (this.razones == null) {
      this.razones = new ArrayList<String>();
    }
    this.razones.add(razonesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[\"CDC22\",\"CDC23\",\"CDC224\",\"CDC27\",\"CDC06\"]", value = "Reglas activadas")
  public List<String> getRazones() {
    return razones;
  }
  public void setRazones(List<String> razones) {
    this.razones = razones;
  }
  public ResponseBody folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "390008494", value = "Folio de conuslta de  score de fraude")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public ResponseBody success(Boolean success) {
    this.success = success;
    return this;
  }
   
  @ApiModelProperty(example = "true", value = "")
  public Boolean isSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }
  public ResponseBody mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }
   
  @ApiModelProperty(example = "La peticion se proceso de manera exitosa", value = "")
  public String getMensaje() {
    return mensaje;
  }
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBody responseBody = (ResponseBody) o;
    return Objects.equals(this.score, responseBody.score) &&
        Objects.equals(this.razones, responseBody.razones) &&
        Objects.equals(this.folioConsulta, responseBody.folioConsulta) &&
        Objects.equals(this.success, responseBody.success) &&
        Objects.equals(this.mensaje, responseBody.mensaje);
  }
  @Override
  public int hashCode() {
    return Objects.hash(score, razones, folioConsulta, success, mensaje);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBody {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
