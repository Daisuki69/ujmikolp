package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface KycRegulatoryProfileCmsApi {
    @GET("/cms/profile-regulatory-update-view")
    p<KycRegulatoryProfileCMSResponse> getRegulatoryProfileCMSData();
}
