package com.paymaya.domain.store;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.database.repository.s f11404b;

    public final List a() {
        return com.paymaya.data.database.repository.s.a(this.f11404b.f11321a.f2811a.query(String.format("SELECT * FROM %1$s", "fund_source")));
    }
}
