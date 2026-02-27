package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import com.paymaya.domain.model.ComplianceUpdateProfileData;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes3.dex */
public interface ComplianceApi {
    @Headers({"Content-Type: application/json"})
    @PATCH("/profile")
    p<ComplianceUpdateProfileData> saveDosriProfile(@Body RequestBody requestBody);

    @Headers({"Content-Type: application/json"})
    @PATCH("/profile")
    a saveFatcaProfile(@Body RequestBody requestBody);
}
