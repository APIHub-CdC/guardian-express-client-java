package io.GuardianExpress.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class CreditReport {
  @SerializedName("idFolioConsultaReporte")
  private String idFolioConsultaReporte = null;
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  public CreditReport idFolioConsultaReporte(String idFolioConsultaReporte) {
    this.idFolioConsultaReporte = idFolioConsultaReporte;
    return this;
  }
   
  @ApiModelProperty(example = "389844067", required = true, value = "Folio de consulta del RC o RCC para identificar al solicitante de crédito")
  public String getIdFolioConsultaReporte() {
    return idFolioConsultaReporte;
  }
  public void setIdFolioConsultaReporte(String idFolioConsultaReporte) {
    this.idFolioConsultaReporte = idFolioConsultaReporte;
  }
  public CreditReport folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "202", required = true, value = "Folio interno único o número consecutivo para identificar a la persona")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditReport creditReport = (CreditReport) o;
    return Objects.equals(this.idFolioConsultaReporte, creditReport.idFolioConsultaReporte) &&
        Objects.equals(this.folioOtorgante, creditReport.folioOtorgante);
  }
  @Override
  public int hashCode() {
    return Objects.hash(idFolioConsultaReporte, folioOtorgante);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditReport {\n");
    
    sb.append("    idFolioConsultaReporte: ").append(toIndentedString(idFolioConsultaReporte)).append("\n");
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
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
