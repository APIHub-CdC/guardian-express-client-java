package io.GuardianExpress.client.api;

import io.GuardianExpress.client.ApiClient;
import io.GuardianExpress.client.ApiException;
import io.GuardianExpress.client.ApiResponse;
import io.GuardianExpress.client.Configuration;
import io.GuardianExpress.client.Pair;
import io.GuardianExpress.client.ProgressRequestBody;
import io.GuardianExpress.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.GuardianExpress.client.model.RequestDatosGenerales;
import io.GuardianExpress.client.model.ResponseBody;
import io.GuardianExpress.client.model.ResponseGuardianDG;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardIAnScoreApi {
    private ApiClient apiClient;
    public GuardIAnScoreApi() {
        this(Configuration.getDefaultApiClient());
    }
    public GuardIAnScoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call creditreportCall(String xApiKey, String username, String password, RequestDatosGenerales body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "/datos-generales";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call creditreportValidateBeforeCall(String xApiKey, String username, String password, RequestDatosGenerales body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling creditreport(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling creditreport(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling creditreport(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling creditreport(Async)");
        }
        
        okhttp3.Call call = creditreportCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseGuardianDG creditreport(String xApiKey, String username, String password, RequestDatosGenerales body) throws ApiException {
        ApiResponse<ResponseGuardianDG> resp = creditreportWithHttpInfo(xApiKey, username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<ResponseGuardianDG> creditreportWithHttpInfo(String xApiKey, String username, String password, RequestDatosGenerales body) throws ApiException {
        okhttp3.Call call = creditreportValidateBeforeCall(xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<ResponseGuardianDG>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    

}
