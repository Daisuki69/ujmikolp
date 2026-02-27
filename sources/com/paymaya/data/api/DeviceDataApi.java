package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.DeviceDataChallenge;
import com.paymaya.domain.model.DeviceExtract;
import java.util.HashMap;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface DeviceDataApi {
    @GET("v3/devicedata/challenge")
    p<DeviceDataChallenge> getDeviceDataChallenge(@HeaderMap HashMap<String, String> map);

    @POST("v1/devicedata")
    p<DeviceExtract> sendExtractedData(@HeaderMap HashMap<String, String> map, @Body RequestBody requestBody);

    @Headers({"Content-Type: multipart/form-data"})
    @POST("v2/devicedata")
    p<DeviceExtract> sendExtractedDataCompressed(@HeaderMap HashMap<String, String> map, @Body RequestBody requestBody);

    @Headers({"Content-Type: multipart/form-data"})
    @POST("v3/devicedata")
    p<DeviceExtract> sendExtractedDataEncrypted(@HeaderMap HashMap<String, String> map, @Body RequestBody requestBody);
}
