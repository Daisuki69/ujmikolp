package c2;

import Q6.n;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledFutureC1065h extends AbstractResolvableFuture implements ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f9267a;

    public ScheduledFutureC1065h(InterfaceC1064g interfaceC1064g) {
        this.f9267a = interfaceC1064g.a(new n(this, 27));
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public final void afterDone() {
        this.f9267a.cancel(wasInterrupted());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f9267a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f9267a.getDelay(timeUnit);
    }
}
