package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.MerchantPaymentV2;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface MayaMerchantPaymentApi {
    @POST("v1/payments")
    p<MerchantPaymentV2> createMerchantPayment(@Body RequestBody requestBody);

    @GET("v1/payments/{merchantPaymentID}")
    p<MerchantPaymentV2> getMerchantPayment(@Path("merchantPaymentID") String str);
}
