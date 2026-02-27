package com.paymaya.data.api;

import Ah.a;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface MayaInboxNotificationsClientApi {
    @POST("account/push_token/remove")
    a deleteFcmToken(@Body RequestBody requestBody);
}
