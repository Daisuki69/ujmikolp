package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import com.paymaya.domain.model.ImageQualityRequest;
import com.paymaya.domain.model.KycAdditionalDocsUploadRequest;
import com.paymaya.domain.model.KycAdditionalDocsUploadResponse;
import com.paymaya.domain.model.KycUploadRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface KycInHouseApi {
    @Headers({"x-file-content-type: privateUrl"})
    @POST("journey/additional-docs/upload")
    p<KycAdditionalDocsUploadResponse> postAdditionalDocs(@Body KycAdditionalDocsUploadRequest kycAdditionalDocsUploadRequest);

    @POST("journey/image-quality")
    a postImageQuality(@Body ImageQualityRequest imageQualityRequest);

    @Headers({"x-file-content-type: privateUrl"})
    @POST("journey/upload")
    a postSimpleCaptureUpload(@Body KycUploadRequest kycUploadRequest);

    @Headers({"x-file-content-type: privateUrl"})
    @POST("journey/upload")
    a postSimpleCaptureUploadWithOrder(@Header("x-upload-order") int i, @Body KycUploadRequest kycUploadRequest);
}
