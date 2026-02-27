package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.MayaUpdateProfileData;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes3.dex */
public interface UpdateProfileApi {
    @GET("/profile")
    p<MayaUpdateProfileData> getUserProfile();

    @Headers({"Content-Type: application/json"})
    @PATCH("/profile")
    p<MayaUpdateProfileData> saveUserProfile(@Body RequestBody requestBody);
}
