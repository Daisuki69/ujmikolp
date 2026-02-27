package ph;

import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ph.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2090k1 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.v f19529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19530b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19531d;
    public final long e;
    public final TimeUnit f;

    public C2090k1(long j, long j6, long j7, long j9, TimeUnit timeUnit, ch.v vVar) {
        this.f19531d = j7;
        this.e = j9;
        this.f = timeUnit;
        this.f19529a = vVar;
        this.f19530b = j;
        this.c = j6;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        RunnableC2086j1 runnableC2086j1 = new RunnableC2086j1(rVar, this.f19530b, this.c);
        rVar.onSubscribe(runnableC2086j1);
        ch.v vVar = this.f19529a;
        boolean z4 = vVar instanceof sh.u;
        TimeUnit timeUnit = this.f;
        if (!z4) {
            EnumC1604b.e(runnableC2086j1, vVar.f(runnableC2086j1, this.f19531d, this.e, timeUnit));
            return;
        }
        sh.t tVar = new sh.t();
        EnumC1604b.e(runnableC2086j1, tVar);
        tVar.d(runnableC2086j1, this.f19531d, this.e, timeUnit);
    }
}
