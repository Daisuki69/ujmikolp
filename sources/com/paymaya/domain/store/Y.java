package com.paymaya.domain.store;

import com.paymaya.domain.model.Identity;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.database.repository.t f11407b;

    public final String a() {
        Identity identityB = this.f11407b.b(new C2011b(8));
        return identityB != null ? identityB.mValue() : "";
    }

    public final String b() {
        Identity identityB = this.f11407b.b(new mg.c(8));
        return identityB != null ? identityB.mValue() : "";
    }
}
