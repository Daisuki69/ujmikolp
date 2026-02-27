package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1238b;

/* JADX INFO: renamed from: com.paymaya.domain.store.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1255e extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1238b f11436b;
    public final PayMayaClientApi c;

    public C1255e(C1238b mAccountUsageRepository, PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mAccountUsageRepository, "mAccountUsageRepository");
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11436b = mAccountUsageRepository;
        this.c = mPayMayaClientApi;
    }
}
