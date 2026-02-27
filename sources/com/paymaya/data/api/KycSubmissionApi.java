package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import com.paymaya.domain.model.KycLatestSubmissionContentData;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.KycPreSubmissionId;
import com.paymaya.domain.model.KycPreSubmissionRequest;
import com.paymaya.domain.model.KycSubmissionContentData;
import com.paymaya.domain.model.KycSubmissionContentDataV2;
import com.paymaya.domain.model.KycSubmissionContentDataV3;
import com.paymaya.domain.model.KycSubmissionNotify;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface KycSubmissionApi {
    @POST("pre-submissions")
    p<KycPreSubmissionId> createPreSubmissionId(@Body KycPreSubmissionRequest kycPreSubmissionRequest);

    @POST("submissions")
    a createSubmission(@Header("x-presubmission-id") String str, @Body KycSubmissionContentData kycSubmissionContentData);

    @POST("submissions/notify")
    p<KycSubmissionNotify> createSubmissionNotifyResponse(@Body KycSubmissionNotify kycSubmissionNotify);

    @POST("v2/submissions")
    a createSubmissionV2(@Header("x-presubmission-id") String str, @Body KycSubmissionContentDataV2 kycSubmissionContentDataV2);

    @POST("v2/submissions")
    a createSubmissionV2WithCaptureMethod(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Body KycSubmissionContentDataV2 kycSubmissionContentDataV2);

    @POST("v2/submissions")
    a createSubmissionV2WithCaptureMethodWithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Header("x-entrypoint-ctx") String str3, @Body KycSubmissionContentDataV2 kycSubmissionContentDataV2);

    @POST("v2/submissions")
    a createSubmissionV2WithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-entrypoint-ctx") String str2, @Body KycSubmissionContentDataV2 kycSubmissionContentDataV2);

    @POST("v3/submissions")
    a createSubmissionV3(@Header("x-presubmission-id") String str, @Body KycSubmissionContentDataV3 kycSubmissionContentDataV3);

    @POST("v3/submissions")
    a createSubmissionV3WithCaptureMethod(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Body KycSubmissionContentDataV3 kycSubmissionContentDataV3);

    @POST("v3/submissions")
    a createSubmissionV3WithCaptureMethodWithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Header("x-entrypoint-ctx") String str3, @Body KycSubmissionContentDataV3 kycSubmissionContentDataV3);

    @POST("v3/submissions")
    a createSubmissionV3WithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-entrypoint-ctx") String str2, @Body KycSubmissionContentDataV3 kycSubmissionContentDataV3);

    @POST("submissions")
    a createSubmissionWithCaptureMethod(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Body KycSubmissionContentData kycSubmissionContentData);

    @POST("submissions")
    a createSubmissionWithCaptureMethodWithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-capture-method") String str2, @Header("x-entrypoint-ctx") String str3, @Body KycSubmissionContentData kycSubmissionContentData);

    @POST("submissions")
    a createSubmissionWithEntrypoint(@Header("x-presubmission-id") String str, @Header("x-entrypoint-ctx") String str2, @Body KycSubmissionContentData kycSubmissionContentData);

    @Headers({"x-file-content-type: base64,privateUrl"})
    @GET("pre-submissions/{preSubmissionId}")
    p<KycPreSubmissionContent> getPreSubmissionContent(@Path("preSubmissionId") String str);

    @Headers({"x-file-content-type: base64,privateUrl"})
    @GET("v2/pre-submissions/{preSubmissionId}")
    p<KycPreSubmissionContent> getPreSubmissionContentV2(@Path("preSubmissionId") String str);

    @Headers({"x-file-content-type: base64"})
    @GET("submissions/latest")
    p<KycLatestSubmissionContentData> getSubmissionResponse();
}
