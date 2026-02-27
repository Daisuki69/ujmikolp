package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.AccountLimits;

/* JADX INFO: renamed from: com.paymaya.domain.store.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1249b extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11426b;

    public C1249b(PayMayaClientApi mPayMayaClientApi) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        this.f11426b = mPayMayaClientApi;
    }

    public final Ah.p a() {
        Ah.p<AccountLimits> accountLimits = this.f11426b.getAccountLimits();
        kotlin.jvm.internal.j.f(accountLimits, "getAccountLimits(...)");
        return accountLimits;
    }
}
