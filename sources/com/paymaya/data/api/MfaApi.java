package com.paymaya.data.api;

import Ah.p;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.paymaya.domain.model.CreateChallengeRequest;
import com.paymaya.domain.model.CreateChallengeResponse;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MFAChallengeVerificationResultV2;
import com.paymaya.domain.model.MFAVerifyChallengeOtpRequest;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.OpenMFAStartChallengeOtpRequest;
import com.paymaya.domain.model.OpenMfaChallengeRequest;
import com.paymaya.domain.model.OpenMfaVerifyRequestOtp;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface MfaApi {
    @POST(ClientData.KEY_CHALLENGE)
    p<CreateChallengeResponse> createChallenge(@Body CreateChallengeRequest createChallengeRequest);

    @POST("open/challenge")
    p<CreateChallengeResponse> openCreateChallenge(@Body CreateChallengeRequest createChallengeRequest);

    @GET("open/challenge/{id}/resend")
    p<MFAChallengeInformationV2> openResendChallengeOtp(@Path(TtmlNode.ATTR_ID) String str);

    @PUT("open/challenge/{id}/start")
    p<MFAChallengeInformationV2> openStartChallenge(@Path(TtmlNode.ATTR_ID) String str, @Body OpenMfaChallengeRequest openMfaChallengeRequest);

    @PUT("open/challenge/{id}/start")
    p<MFAChallengeInformationV2> openStartChallengeOTP(@Path(TtmlNode.ATTR_ID) String str, @Body OpenMFAStartChallengeOtpRequest openMFAStartChallengeOtpRequest);

    @PUT("open/challenge/{id}/verify")
    p<MFAChallengeVerificationResultV2> openVerifyChallenge(@Path(TtmlNode.ATTR_ID) String str, @Body OpenMfaChallengeRequest openMfaChallengeRequest);

    @PUT("open/challenge/{id}/verify")
    p<MFAChallengeVerificationResultV2> openVerifyChallenge(@Path(TtmlNode.ATTR_ID) String str, @Body OpenMfaVerifyRequestOtp openMfaVerifyRequestOtp);

    @PUT("open/challenge/{id}/verify")
    p<MFAChallengeVerificationResultV2> openVerifyChallengeOtp(@Path(TtmlNode.ATTR_ID) String str, @Body MFAVerifyChallengeOtpRequest mFAVerifyChallengeOtpRequest);

    @GET("challenge/{id}/resend")
    p<MFAChallengeInformationV2> resendChallengeOtp(@Path(TtmlNode.ATTR_ID) String str);

    @POST("challenge/{id}/start")
    p<MFAChallengeInformationV2> startChallenge(@Path(TtmlNode.ATTR_ID) String str, @Body MfaMeta mfaMeta);

    @PUT("challenge/{id}/verify")
    p<MFAChallengeVerificationResultV2> verifyChallenge(@Path(TtmlNode.ATTR_ID) String str, @Body MfaMeta mfaMeta);

    @PUT("challenge/{id}/verify")
    p<MFAChallengeVerificationResultV2> verifyChallengeOtp(@Path(TtmlNode.ATTR_ID) String str, @Body MFAVerifyChallengeOtpRequest mFAVerifyChallengeOtpRequest);
}
