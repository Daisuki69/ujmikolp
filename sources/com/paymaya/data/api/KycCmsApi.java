package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.KycCmsContent;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface KycCmsApi {
    @GET("kyc-view/")
    p<KycCmsContent> getCmsContent();

    @GET("simple-capture-view-v1/")
    p<KycCmsContent> getCmsEkycShortFlowContent();

    @GET("simple-capture-view-v2")
    p<KycCmsContent> getCmsEkycShortFlowContentV2();

    @GET("simple-capture-view-v3")
    p<KycCmsContent> getCmsEkycShortFlowContentV3();

    @GET("simple-capture-view-v4")
    p<KycCmsContent> getCmsEkycShortFlowContentV4();

    @GET("simple-capture-view-v5")
    p<KycCmsContent> getCmsEkycShortFlowContentV5();

    @GET("simple-capture-view-v6")
    p<KycCmsContent> getCmsEkycShortFlowContentV6();

    @GET("simple-capture-view-v7")
    p<KycCmsContent> getCmsEkycShortFlowContentV7();

    @GET("simple-capture-view-v8")
    p<KycCmsContent> getCmsEkycShortFlowContentV8();
}
