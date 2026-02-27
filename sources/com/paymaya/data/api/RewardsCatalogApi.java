package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.RewardsCatalogData;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface RewardsCatalogApi {
    @GET("v1/rewards/products")
    p<RewardsCatalogData> getRewardsCatalog();
}
