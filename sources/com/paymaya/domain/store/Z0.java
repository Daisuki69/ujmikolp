package com.paymaya.domain.store;

import com.paymaya.domain.model.User;

/* JADX INFO: loaded from: classes4.dex */
public final class Z0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.database.repository.H f11421b;

    public final User a() {
        z2.d dVar = new z2.d(8);
        com.paymaya.data.database.repository.H h = this.f11421b;
        if (h.a(dVar).isEmpty()) {
            return null;
        }
        return (User) h.a(dVar).get(0);
    }
}
