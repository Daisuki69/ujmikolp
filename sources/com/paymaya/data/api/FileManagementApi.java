package com.paymaya.data.api;

import Ah.p;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.paymaya.domain.model.FileUploadRequest;
import com.paymaya.domain.model.FileUploadResponse;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes3.dex */
public interface FileManagementApi {
    @Headers({"Content-Type: application/json"})
    @POST("/{environment}/v1/uploads/urls")
    p<FileUploadResponse> requestUploadUrl(@Path("environment") String str, @Header("x-api-key") String str2, @Body FileUploadRequest fileUploadRequest);

    @PUT
    p<ResponseBody> upload(@Url String str, @Header(RtspHeaders.CONTENT_TYPE) String str2, @Header("x-api-key") String str3, @Body RequestBody requestBody);

    @PUT
    p<ResponseBody> upload(@Url String str, @Body RequestBody requestBody);
}
