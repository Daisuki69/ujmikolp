package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.OrderV2;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface MayaShopClientApi {
    @POST("v1/orders/createAndExecute")
    p<OrderV2> createAndExecutePurchaseOrder(@Body RequestBody requestBody);
}
