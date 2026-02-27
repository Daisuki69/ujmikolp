package com.paymaya.domain.store;

import M8.T2;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.data.api.CreditApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.CreditTransaction;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11331b;
    public final CreditApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.database.repository.m f11332d;
    public final S5.c e;

    public A(PayMayaClientApi payMayaClientApi, CreditApi creditApi, com.paymaya.data.database.repository.m mVar, S5.c cVar) {
        this.f11331b = payMayaClientApi;
        this.c = creditApi;
        this.f11332d = mVar;
        this.e = cVar;
    }

    public final Lh.d a(int i, String str) {
        if (!this.e.a(A5.b.f71P)) {
            Ah.p<CreditTransaction> creditTransactions = this.f11331b.getCreditTransactions(str, T2.q(0, i));
            C1296z c1296z = new C1296z(this, 0);
            creditTransactions.getClass();
            return new Lh.d(creditTransactions, c1296z, 2);
        }
        Ah.p<CreditTransaction> creditTransactions2 = this.c.getCreditTransactions(T2.v(EventMetricsAggregator.OS_NAME.toLowerCase(), UUID.randomUUID().toString()), str, T2.q(0, i));
        C1296z c1296z2 = new C1296z(this, 0);
        creditTransactions2.getClass();
        return new Lh.d(creditTransactions2, c1296z2, 2);
    }
}
