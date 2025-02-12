package io.GuardianExpress.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
@ApiModel(description = "error")


public class Error {
  @SerializedName("code")
  private String code = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("title")
  private String title = null;
  
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    _100("100"),
    
    _101("101"),
    
    _102("102"),
    
    _103("103"),
    
    _200("200"),
    
    _201("201"),
    
    _202("202"),
    
    _203("203"),
    
    _204("204"),
    
    _205("205"),
    
    _206("206"),
    
    _207("207"),
    
    _208("208"),
    
    _226("226"),
    
    _300("300"),
    
    _301("301"),
    
    _302("302"),
    
    _303("303"),
    
    _304("304"),
    
    _305("305"),
    
    _307("307"),
    
    _308("308"),
    
    _400("400"),
    
    _401("401"),
    
    _402("402"),
    
    _403("403"),
    
    _404("404"),
    
    _405("405"),
    
    _406("406"),
    
    _407("407"),
    
    _408("408"),
    
    _409("409"),
    
    _410("410"),
    
    _411("411"),
    
    _412("412"),
    
    _413("413"),
    
    _414("414"),
    
    _415("415"),
    
    _416("416"),
    
    _417("417"),
    
    _418("418"),
    
    _419("419"),
    
    _420("420"),
    
    _421("421"),
    
    _422("422"),
    
    _423("423"),
    
    _424("424"),
    
    _426("426"),
    
    _428("428"),
    
    _429("429"),
    
    _431("431"),
    
    _451("451"),
    
    _500("500"),
    
    _501("501"),
    
    _502("502"),
    
    _503("503"),
    
    _504("504"),
    
    _505("505"),
    
    _506("506"),
    
    _507("507"),
    
    _508("508"),
    
    _509("509"),
    
    _510("510"),
    
    _511("511");
    private String value;
    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("status")
  private StatusEnum status = null;
  public Error code(String code) {
    this.code = code;
    return this;
  }
   
  @ApiModelProperty(example = "VA003", value = "Código de error")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public Error message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "El campo \"campo\" es requerido.", value = "Mensaje de error")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public Error title(String title) {
    this.title = title;
    return this;
  }
   
  @ApiModelProperty(example = "Alerta", value = "Titulo de error")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public Error status(StatusEnum status) {
    this.status = status;
    return this;
  }
   
  @ApiModelProperty(example = "BAD_REQUEST", value = "Status Http")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.status, error.status);
  }
  @Override
  public int hashCode() {
    return Objects.hash(code, message, title, status);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
