package com.paymaya.domain.store;

import com.paymaya.data.api.CreditApi;
import com.paymaya.data.api.PayMayaClientApi;

/* JADX INFO: renamed from: com.paymaya.domain.store.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1292x extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11494b;
    public final CreditApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f11495d;

    public C1292x(PayMayaClientApi mPayMayaClientApi, CreditApi mCreditApi, S5.c mFlagConfigurationService) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mCreditApi, "mCreditApi");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f11494b = mPayMayaClientApi;
        this.c = mCreditApi;
        this.f11495d = mFlagConfigurationService;
    }
}
