package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.AccessToken;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface ApigeeApi {
    @FormUrlEncoded
    @POST("v3/accesstoken/noexpiry")
    p<AccessToken> getApigeeToken(@Field("grant_type") String str, @Field("client_id") String str2, @Field("client_secret") String str3);
}
