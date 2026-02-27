package Ah;

import ch.u;
import ch.v;
import fh.C1487c;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f320b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f321d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f322g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m(Object obj, long j, Runnable runnable, long j6, AtomicReference atomicReference, long j7, int i) {
        this.f319a = i;
        this.h = obj;
        this.f320b = runnable;
        this.f322g = atomicReference;
        this.c = j7;
        this.e = j6;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j6;
        switch (this.f319a) {
            case 0:
                this.f320b.run();
                Dh.d dVar = (Dh.d) this.f322g;
                if (!dVar.b()) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    n nVar = (n) this.h;
                    long jA = nVar.a(timeUnit);
                    long j7 = o.f323a;
                    long j9 = jA + j7;
                    long j10 = this.e;
                    long j11 = this.c;
                    if (j9 < j10 || jA >= j10 + j11 + j7) {
                        j = jA + j11;
                        long j12 = this.f321d + 1;
                        this.f321d = j12;
                        this.f = j - (j11 * j12);
                    } else {
                        long j13 = this.f;
                        long j14 = this.f321d + 1;
                        this.f321d = j14;
                        j = (j14 * j11) + j13;
                    }
                    this.e = jA;
                    Dh.a.c(dVar, nVar.c(this, j - jA, timeUnit));
                }
                break;
            default:
                this.f320b.run();
                C1487c c1487c = (C1487c) this.f322g;
                if (!c1487c.a()) {
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    u uVar = (u) this.h;
                    long jA2 = uVar.a(timeUnit2);
                    long j15 = v.f9375b;
                    long j16 = jA2 + j15;
                    long j17 = this.e;
                    long j18 = this.c;
                    if (j16 < j17 || jA2 >= j17 + j18 + j15) {
                        j6 = jA2 + j18;
                        long j19 = this.f321d + 1;
                        this.f321d = j19;
                        this.f = j6 - (j18 * j19);
                    } else {
                        long j20 = this.f;
                        long j21 = this.f321d + 1;
                        this.f321d = j21;
                        j6 = (j21 * j18) + j20;
                    }
                    this.e = jA2;
                    EnumC1604b.c(c1487c, uVar.b(this, j6 - jA2, timeUnit2));
                }
                break;
        }
    }
}
