package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1241e;
import com.paymaya.domain.model.BackUpIdentity;

/* JADX INFO: renamed from: com.paymaya.domain.store.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1265j extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1241e f11451b;
    public PayMayaClientApi c;

    public final BackUpIdentity a() {
        N4.d dVar = new N4.d(8);
        C1241e c1241e = this.f11451b;
        if (c1241e.a(dVar).isEmpty()) {
            return null;
        }
        return (BackUpIdentity) c1241e.a(dVar).get(0);
    }
}
