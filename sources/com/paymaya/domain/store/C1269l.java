package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.data.database.repository.C1242f;
import java.util.List;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1269l extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1242f f11457b;
    public PayMayaCardApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.preference.a f11458d;

    public final Lh.f a() {
        Ah.p<Response<Void>> banksHead = this.c.getBanksHead();
        C1267k c1267k = new C1267k(this, 0);
        banksHead.getClass();
        return new Lh.f(new Lh.f(banksHead, c1267k, 0), new C1267k(this, 1), 0);
    }

    public final List b() {
        return C1242f.a(this.f11457b.f11308a.f2811a.query(String.format("SELECT * FROM %1$s ORDER BY %2$s", "bank", "bank_name")));
    }

    public final Lh.f c() {
        Ah.p<Response<Void>> banksHead = this.c.getBanksHead();
        C1267k c1267k = new C1267k(this, 2);
        banksHead.getClass();
        return new Lh.f(new Lh.d(new Lh.f(banksHead, c1267k, 0), new C1267k(this, 3), 2), new com.google.firebase.messaging.n(16), 0);
    }
}
