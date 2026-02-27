package com.paymaya.domain.store;

import Kh.C0301f;
import Kh.C0305j;
import Kh.C0311p;
import Kh.C0314t;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1237a;
import com.paymaya.domain.model.AccountBalance;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.paymaya.domain.store.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1247a extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11422b;
    public C1237a c;

    public final Lh.d a() {
        Ah.p<AccountBalance> balance = this.f11422b.getBalance();
        androidx.work.impl.e eVar = new androidx.work.impl.e(this, 19);
        balance.getClass();
        return new Lh.d(balance, eVar, 2);
    }

    public final AccountBalance b() {
        C1237a c1237a = this.c;
        if (C1237a.a(c1237a.f11303a.f2811a.query(String.format("SELECT * FROM %1$s", "account_balance"))).isEmpty()) {
            return null;
        }
        return (AccountBalance) C1237a.a(c1237a.f11303a.f2811a.query(String.format("SELECT * FROM %1$s", "account_balance"))).get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Ah.h c() {
        Kh.I i = new Kh.I(8);
        C1237a c1237a = this.c;
        C0301f c0301fD = c1237a.f11303a.d("account_balance", i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C0305j c0305jC = new Kh.z(c0301fD.b(300L), new com.paymaya.data.database.repository.x(c1237a, 1), 0).c(new com.google.firebase.messaging.n(14));
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(15);
        int i4 = Ah.d.f312a;
        Eh.d.a(Integer.MAX_VALUE, "maxConcurrency");
        Eh.d.a(i4, "bufferSize");
        if (!(c0305jC instanceof Fh.e)) {
            return new C0314t(c0305jC, nVar, Integer.MAX_VALUE, i4);
        }
        Object obj = ((Fh.e) c0305jC).get();
        return obj == null ? C0311p.f2745a : new Kh.G(obj, nVar);
    }
}
