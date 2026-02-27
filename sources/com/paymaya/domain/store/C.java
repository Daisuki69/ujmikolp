package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.CustomerAccount;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11340b;
    public final com.paymaya.data.preference.a c;

    public C(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11340b = mPayMayaClientApi;
        this.c = mPreference;
    }

    public final Lh.d a() {
        Ah.p<CustomerAccount> customerAccountDetails = this.f11340b.getCustomerAccountDetails();
        R4.i iVar = new R4.i(this, 27);
        customerAccountDetails.getClass();
        return new Lh.d(customerAccountDetails, iVar, 2);
    }
}
