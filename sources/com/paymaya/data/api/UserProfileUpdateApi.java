package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.ProfileCmsData;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface UserProfileUpdateApi {
    @GET("/cms/profile-update-view")
    p<ProfileCmsData> getProfileCMSData();
}
