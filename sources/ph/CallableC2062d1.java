package ph;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ph.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class CallableC2062d1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19436b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f19437d;
    public final ch.v e;

    public CallableC2062d1(int i, long j, ch.l lVar, ch.v vVar, TimeUnit timeUnit) {
        this.f19435a = lVar;
        this.f19436b = i;
        this.c = j;
        this.f19437d = timeUnit;
        this.e = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f19435a.replay(this.f19436b, this.c, this.f19437d, this.e);
    }
}
