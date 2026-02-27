package com.paymaya.data.api;

import Ah.p;
import com.paymaya.domain.model.AutoCashInCustomerSetup;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes3.dex */
public interface PayMayaAutoCashInApi {
    @GET("v1/customer-setup/accounts/default")
    p<AutoCashInCustomerSetup> customerSetupAccountsDefault();
}
