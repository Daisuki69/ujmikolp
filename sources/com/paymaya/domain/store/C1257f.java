package com.paymaya.domain.store;

import com.paymaya.data.database.repository.C1240d;
import com.paymaya.domain.model.Address;

/* JADX INFO: renamed from: com.paymaya.domain.store.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1257f extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1240d f11439b;

    public final Address a() {
        M2.b bVar = new M2.b(8);
        C1240d c1240d = this.f11439b;
        if (c1240d.a(bVar).isEmpty()) {
            return null;
        }
        return (Address) c1240d.a(bVar).get(0);
    }
}
