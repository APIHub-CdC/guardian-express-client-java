package io.GuardianExpress.client.api;

import java.util.concurrent.TimeUnit;

import io.GuardianExpress.client.ApiClient;
import io.GuardianExpress.client.model.CatalogoEstados;
import io.GuardianExpress.client.model.RequestBody;
import io.GuardianExpress.client.model.RequestDatosGenerales;
import io.GuardianExpress.client.model.RequestDatosGeneralesPersona;
import io.GuardianExpress.client.model.RequestDatosGeneralesPersonaDomicilio;
import io.GuardianExpress.client.model.ResponseBody;
import io.GuardianExpress.client.model.CreditReport;
import io.GuardianExpress.client.model.ResponseGuardianDG;
import io.GuardianExpress.interceptor.SignerInterceptor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import okhttp3.OkHttpClient;

public class GuardIAnScoreApiTest {
    private final GuardIAnScoreApi api = new GuardIAnScoreApi();

    private Logger logger = LoggerFactory.getLogger(GuardIAnScoreApiTest.class.getName());

    private ApiClient apiClient;
    private String xApiKey = "your_api_key";
    private String url = "the_url";
    private String username = "your_username";
    private String password = "your_password";

    @Before()
    public void setUp() {
    	 
		this.apiClient = api.getApiClient();
        this.apiClient.setBasePath(url);
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
               .readTimeout(30, TimeUnit.SECONDS)
               .addInterceptor(new SignerInterceptor())
               .build();
        apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void creditreportTest() throws Exception {
        RequestDatosGenerales requestDatosGenerales = new RequestDatosGenerales();
        requestDatosGenerales.setFolioOtorgante(100000001);
        RequestDatosGeneralesPersona requestDatosGeneralesPersona = new RequestDatosGeneralesPersona();
        requestDatosGeneralesPersona.setPrimerNombre("your name");
        requestDatosGeneralesPersona.setApellidoPaterno("");
        requestDatosGeneralesPersona.setApellidoMaterno("");
        requestDatosGeneralesPersona.setFechaNacimiento("");
        requestDatosGeneralesPersona.setRFC("");
        RequestDatosGeneralesPersonaDomicilio requestDatosGeneralesPersonaDomicilio = new RequestDatosGeneralesPersonaDomicilio();
        requestDatosGeneralesPersonaDomicilio.setDireccion("");
        requestDatosGeneralesPersonaDomicilio.setColonia("");
        requestDatosGeneralesPersonaDomicilio.setDelegacionMunicipio("");
        requestDatosGeneralesPersonaDomicilio.setCiudad("");
        requestDatosGeneralesPersonaDomicilio.setEstado(CatalogoEstados.CDMX);
        requestDatosGeneralesPersonaDomicilio.setCp("");
        requestDatosGeneralesPersona.setDomicilio(requestDatosGeneralesPersonaDomicilio);
        requestDatosGenerales.setPersona(requestDatosGeneralesPersona);

        ResponseGuardianDG response = api.creditreport(xApiKey, username, password, requestDatosGenerales);
        System.out.println(response.toString());
        logger.info("Report: "+response.toString());
        
        Assert.assertTrue(response.getFolioConsulta() != null);
    }
}
