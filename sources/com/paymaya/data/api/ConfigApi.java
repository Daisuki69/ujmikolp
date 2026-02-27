package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.Config;
import com.paymaya.domain.model.FormSeries;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.OnlinePayment;
import java.util.List;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface ConfigApi {
    @GET("paymaya-config.json")
    p<Config> getConfig();

    @GET("v1/billers/BIR/otherFields/formSeries")
    p<List<FormSeries>> getFormSeries();

    @HEAD("v1/billers/BIR/otherFields/formSeries")
    @Headers({"Connection: close"})
    p<Response<Void>> getFormSeriesHead();

    @GET("load-up-partners/{partnerID}")
    p<LoadUpPartner> getLoadUpPartner(@Path("partnerID") String str);

    @GET("load-up-partners")
    p<List<LoadUpPartner>> getLoadUpPartners();

    @GET("online-payments/{category}")
    p<List<OnlinePayment>> getOnlinePaymentPartners(@Path("category") String str);
}
