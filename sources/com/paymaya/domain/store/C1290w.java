package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Country;

/* JADX INFO: renamed from: com.paymaya.domain.store.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1290w extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.database.repository.l f11491b;
    public PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.preference.a f11492d;

    public final Country a(String str) {
        F1.k kVar = new F1.k(1);
        kVar.f1526b = str;
        com.paymaya.data.database.repository.l lVar = this.f11491b;
        if (lVar.a(kVar).isEmpty()) {
            return null;
        }
        return (Country) lVar.a(kVar).get(0);
    }
}
