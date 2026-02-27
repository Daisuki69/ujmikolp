package ph;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19189b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19190d;
    public final ch.v e;
    public final Callable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19191g;
    public final boolean h;

    public G(ch.l lVar, long j, long j6, TimeUnit timeUnit, ch.v vVar, Callable callable, int i, boolean z4) {
        super(lVar);
        this.f19189b = j;
        this.c = j6;
        this.f19190d = timeUnit;
        this.e = vVar;
        this.f = callable;
        this.f19191g = i;
        this.h = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        long j = this.f19189b;
        long j6 = this.c;
        ch.v vVar = this.e;
        Callable callable = this.f;
        TimeUnit timeUnit = this.f19190d;
        ch.p pVar = this.f19404a;
        if (j == j6 && this.f19191g == Integer.MAX_VALUE) {
            pVar.subscribe(new RunnableC2047D(new C2479c(rVar), callable, j, timeUnit, vVar));
            return;
        }
        ch.u uVarB = vVar.b();
        long j7 = this.f19189b;
        long j9 = this.c;
        if (j7 == j9) {
            pVar.subscribe(new RunnableC2046C(new C2479c(rVar), callable, j7, timeUnit, this.f19191g, this.h, uVarB));
        } else {
            pVar.subscribe(new F(new C2479c(rVar), callable, j7, j9, timeUnit, uVarB));
        }
    }
}
