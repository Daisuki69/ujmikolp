package ph;

import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ph.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2082i1 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.v f19500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19501b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19502d;

    public C2082i1(long j, long j6, TimeUnit timeUnit, ch.v vVar) {
        this.f19501b = j;
        this.c = j6;
        this.f19502d = timeUnit;
        this.f19500a = vVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        RunnableC2078h1 runnableC2078h1 = new RunnableC2078h1(rVar);
        rVar.onSubscribe(runnableC2078h1);
        ch.v vVar = this.f19500a;
        boolean z4 = vVar instanceof sh.u;
        TimeUnit timeUnit = this.f19502d;
        if (!z4) {
            EnumC1604b.e(runnableC2078h1, vVar.f(runnableC2078h1, this.f19501b, this.c, timeUnit));
            return;
        }
        sh.t tVar = new sh.t();
        EnumC1604b.e(runnableC2078h1, tVar);
        tVar.d(runnableC2078h1, this.f19501b, this.c, timeUnit);
    }
}
