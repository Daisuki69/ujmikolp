package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.EDDSettings;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.database.repository.o f11374b;
    public final PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11375d;

    public N(com.paymaya.data.database.repository.o mEDDSettingsRepository, PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mEDDSettingsRepository, "mEDDSettingsRepository");
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11374b = mEDDSettingsRepository;
        this.c = mPayMayaClientApi;
        this.f11375d = mPreference;
    }

    public final EDDSettings a() {
        M2.b bVar = new M2.b(7);
        com.paymaya.data.database.repository.o oVar = this.f11374b;
        oVar.getClass();
        if (oVar.a(bVar).isEmpty()) {
            return null;
        }
        return (EDDSettings) oVar.a(bVar).get(0);
    }
}
