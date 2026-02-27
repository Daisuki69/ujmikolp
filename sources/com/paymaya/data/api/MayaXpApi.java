package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.MayaXPEntrypointData;
import com.paymaya.domain.model.MayaXPScoreData;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface MayaXpApi {
    @GET("v1/score")
    p<MayaXPScoreData> getMayaXp();

    @GET("v1/entrypoints/mec")
    p<MayaXPEntrypointData> getMayaXpEntrypointEasyCredit();
}
