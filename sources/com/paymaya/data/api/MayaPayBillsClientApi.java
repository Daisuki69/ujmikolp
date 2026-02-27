package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.BillerV3Transaction;
import com.paymaya.domain.model.BillsPayRequest;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
public interface MayaPayBillsClientApi {
    @POST("v3/bills/pay")
    p<BillerV3Transaction> createBillsPaymentV3(@Body BillsPayRequest billsPayRequest);

    @POST("v3/bills/pay/{payment_id}/checkout")
    p<BillerV3Transaction> executeBillsPaymentV3(@Path("payment_id") String str, @Body RequestBody requestBody);

    @GET("v3/bills/pay/{bills_payment_id}")
    p<BillerV3Transaction> getBillsPaymentV3(@Path("bills_payment_id") String str);
}
