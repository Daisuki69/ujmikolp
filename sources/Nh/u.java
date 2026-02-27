package Nh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f4489b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4490d;

    public /* synthetic */ u(Runnable runnable, Object obj, long j, int i) {
        this.f4488a = i;
        this.f4489b = runnable;
        this.f4490d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4488a) {
            case 0:
                if (!((w) this.f4490d).f4496d) {
                    long jA = ((w) this.f4490d).a(TimeUnit.MILLISECONDS);
                    long j = this.c;
                    if (j > jA) {
                        try {
                            Thread.sleep(j - jA);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            E1.c.k(e);
                            return;
                        }
                    }
                    if (!((w) this.f4490d).f4496d) {
                        this.f4489b.run();
                    }
                }
                break;
            default:
                if (!((sh.t) this.f4490d).f20116d) {
                    sh.t tVar = (sh.t) this.f4490d;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    tVar.getClass();
                    long jA2 = ch.v.a(timeUnit);
                    long j6 = this.c;
                    if (j6 > jA2) {
                        try {
                            Thread.sleep(j6 - jA2);
                        } catch (InterruptedException e7) {
                            Thread.currentThread().interrupt();
                            S1.s.r(e7);
                            return;
                        }
                    }
                    if (!((sh.t) this.f4490d).f20116d) {
                        this.f4489b.run();
                    }
                }
                break;
        }
    }
}
