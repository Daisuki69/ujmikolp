package ph;

import java.util.concurrent.TimeUnit;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19570b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19571d;
    public final ch.v e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19572g;
    public final boolean h;

    public n3(ch.l lVar, long j, long j6, TimeUnit timeUnit, ch.v vVar, long j7, int i, boolean z4) {
        super(lVar);
        this.f19570b = j;
        this.c = j6;
        this.f19571d = timeUnit;
        this.e = vVar;
        this.f = j7;
        this.f19572g = i;
        this.h = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        C2479c c2479c = new C2479c(rVar);
        long j = this.f19570b;
        long j6 = this.c;
        TimeUnit timeUnit = this.f19571d;
        ch.v vVar = this.e;
        ch.p pVar = this.f19404a;
        if (j != j6) {
            pVar.subscribe(new m3(c2479c, j, j6, timeUnit, vVar.b(), this.f19572g));
            return;
        }
        long j7 = this.f;
        if (j7 == Long.MAX_VALUE) {
            pVar.subscribe(new k3(c2479c, j, timeUnit, vVar, this.f19572g));
        } else {
            pVar.subscribe(new j3(c2479c, j, timeUnit, vVar, this.f19572g, j7, this.h));
        }
    }
}
