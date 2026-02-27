package L9;

import Kh.T;
import M8.T2;
import cj.L;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1296z;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransactionListFragment;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: L9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0331i extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.domain.store.A f2890d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2891g;
    public String h;
    public final A7.l i;

    public C0331i(com.paymaya.domain.store.A a8, Uh.d dVar) {
        super(dVar);
        this.f2890d = a8;
        this.h = "";
        this.i = new A7.l(1);
    }

    public final void k(boolean z4) {
        int i = 0;
        e(new T(5, new Lh.d(new Lh.d(new Lh.h(this.f2890d.a(25, this.h), zh.b.a(), 0), new Gb.d(this, 7), 2), new A3.i(this, z4, 4), i), new C0328f(this, i)).e());
    }

    public final void l() {
        Lh.d dVar;
        int i = 5;
        int i4 = 0;
        int i6 = 2;
        int i10 = 1;
        if (this.e || this.f2891g) {
            return;
        }
        this.f++;
        this.e = true;
        O9.b bVar = ((MayaCreditTransactionListFragment) ((P9.c) this.c.get())).t0;
        if ((bVar == null || !bVar.f4769d) && bVar != null) {
            bVar.e(true);
        }
        com.paymaya.domain.store.A a8 = this.f2890d;
        String str = this.h;
        int i11 = this.f;
        if (a8.e.a(A5.b.f71P)) {
            Ah.p<CreditTransaction> creditTransactions = a8.c.getCreditTransactions(T2.v(EventMetricsAggregator.OS_NAME.toLowerCase(), UUID.randomUUID().toString()), str, T2.q(i11, 25));
            C1296z c1296z = new C1296z(a8, 1);
            creditTransactions.getClass();
            dVar = new Lh.d(creditTransactions, c1296z, i6);
        } else {
            Ah.p<CreditTransaction> creditTransactions2 = a8.f11331b.getCreditTransactions(str, T2.q(i11, 25));
            C1296z c1296z2 = new C1296z(a8, 1);
            creditTransactions2.getClass();
            dVar = new Lh.d(creditTransactions2, c1296z2, i6);
        }
        e(new T(i, new Lh.d(new Lh.d(new Lh.h(dVar, zh.b.a(), 0), new G6.v(this, 9), i6), new Gc.h(this, i), i4), new C0328f(this, i10)).e());
    }

    public final void m(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.c cVar = (P9.c) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((MayaCreditTransactionListFragment) cVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }
}
