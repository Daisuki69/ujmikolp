package We;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: We.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0602f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f6386b;

    public /* synthetic */ RunnableC0602f(M m, int i) {
        this.f6385a = i;
        this.f6386b = m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6385a) {
            case 0:
                throw new IllegalStateException(numX49.tnTj78("bkRQ") + this.f6386b.a() + numX49.tnTj78("bkRt"));
            default:
                throw new IllegalStateException(numX49.tnTj78("bkRH") + this.f6386b.a() + numX49.tnTj78("bkRO"));
        }
    }
}
