package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.KycCmsAddressContentData;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
public interface KycCmsAddressApi {
    @GET("/cms/provinces")
    p<KycCmsAddressContentData> getCities(@Query("pagination[limit]") int i, @Query("filters[name][%24eq]") String str, @Query("populate") String str2);

    @GET("/cms/provinces")
    p<KycCmsAddressContentData> getLocalitiesAndZipCodes(@Query("pagination[limit]") int i, @Query("filters[name][%24eq]") String str, @Query("populate[cities][filters][name]") String str2, @Query("populate[cities][populate][localities][populate]") String str3);

    @GET("/cms/provinces")
    p<KycCmsAddressContentData> getProvinces(@Query("pagination[limit]") int i, @Query("populate") String str);
}
