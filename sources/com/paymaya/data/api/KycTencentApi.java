package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import com.paymaya.domain.model.TencentCompleteRequest;
import com.paymaya.domain.model.TencentInitiateV2Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface KycTencentApi {
    @POST("journey/complete")
    a journeyComplete(@Body TencentCompleteRequest tencentCompleteRequest);

    @POST("v2/journey/initiate")
    p<TencentInitiateV2Response> journeyInitiateV2();
}
