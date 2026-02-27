package com.paymaya.domain.store;

import com.paymaya.data.api.ConfigApi;
import com.paymaya.data.api.PayMayaClientApi;

/* JADX INFO: renamed from: com.paymaya.domain.store.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1262h0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigApi f11445b;
    public PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.database.repository.v f11446d;
    public com.paymaya.data.preference.a e;

    public final Ah.p a(String str) {
        return this.e.e().isTopUpServiceEnabled() ? this.c.getLoadUpPartner(str) : this.f11445b.getLoadUpPartner(str);
    }
}
