package com.paymaya.adkit.data.network;

import e5.C1428a;
import gj.InterfaceC1526a;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface AdUserTagApi {
    @Headers({"Content-Type: application/json"})
    @POST("api/v1/userTag")
    Object getUserTags(@Body RequestBody requestBody, InterfaceC1526a<? super C1428a> interfaceC1526a);
}
