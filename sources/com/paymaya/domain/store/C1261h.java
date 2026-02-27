package com.paymaya.domain.store;

import com.paymaya.data.api.ApigeeApi;
import com.paymaya.domain.model.AccessToken;

/* JADX INFO: renamed from: com.paymaya.domain.store.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1261h extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ApigeeApi f11444b;
    public com.paymaya.data.preference.a c;

    public final Lh.d a(String str, String str2) {
        Ah.p<AccessToken> apigeeToken = this.f11444b.getApigeeToken("client_credentials", str, str2);
        androidx.work.impl.e eVar = new androidx.work.impl.e(this, 20);
        apigeeToken.getClass();
        return new Lh.d(apigeeToken, eVar, 2);
    }
}
