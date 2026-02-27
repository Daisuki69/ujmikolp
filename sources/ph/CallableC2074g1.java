package ph;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ph.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class CallableC2074g1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19476b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19477d;

    public CallableC2074g1(ch.l lVar, long j, TimeUnit timeUnit, ch.v vVar) {
        this.f19475a = lVar;
        this.f19476b = j;
        this.c = timeUnit;
        this.f19477d = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f19475a.replay(this.f19476b, this.c, this.f19477d);
    }
}
