package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.KycRegulatoryProfileStatusResponse;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface KycProfileRegulatoryApi {
    @GET("/profile-eligibility-status/regulatory")
    p<KycRegulatoryProfileStatusResponse> getProfileEligibilityStatus();
}
