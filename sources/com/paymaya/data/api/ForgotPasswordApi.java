package com.paymaya.data.api;

import Ah.a;
import com.paymaya.domain.model.ForgotPasswordSubmitPasswordRequest;
import com.paymaya.domain.model.ForgotPasswordValidateIdentityRequest;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface ForgotPasswordApi {
    @POST("submit-password")
    a submitPassword(@Body ForgotPasswordSubmitPasswordRequest forgotPasswordSubmitPasswordRequest);

    @POST("validate-identity")
    a validateIdentity(@Body ForgotPasswordValidateIdentityRequest forgotPasswordValidateIdentityRequest);
}
