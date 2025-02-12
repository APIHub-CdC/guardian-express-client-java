package io.GuardianExpress.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class RequestBody {
  @SerializedName("creditReport")
  private CreditReport creditReport = null;
  public RequestBody creditReport(CreditReport creditReport) {
    this.creditReport = creditReport;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public CreditReport getCreditReport() {
    return creditReport;
  }
  public void setCreditReport(CreditReport creditReport) {
    this.creditReport = creditReport;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestBody requestBody = (RequestBody) o;
    return Objects.equals(this.creditReport, requestBody.creditReport);
  }
  @Override
  public int hashCode() {
    return Objects.hash(creditReport);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestBody {\n");
    
    sb.append("    creditReport: ").append(toIndentedString(creditReport)).append("\n");
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
