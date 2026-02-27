package ph;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import xh.C2479c;

/* JADX INFO: renamed from: ph.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079h2 extends AbstractRunnableC2087j2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f19487g;

    public C2079h2(C2479c c2479c, long j, TimeUnit timeUnit, ch.v vVar) {
        super(c2479c, j, timeUnit, vVar);
        this.f19487g = new AtomicInteger(1);
    }

    @Override // ph.AbstractRunnableC2087j2
    public final void a() {
        Object andSet = getAndSet(null);
        C2479c c2479c = this.f19511a;
        if (andSet != null) {
            c2479c.onNext(andSet);
        }
        if (this.f19487g.decrementAndGet() == 0) {
            c2479c.onComplete();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f19487g;
        if (atomicInteger.incrementAndGet() == 2) {
            Object andSet = getAndSet(null);
            C2479c c2479c = this.f19511a;
            if (andSet != null) {
                c2479c.onNext(andSet);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                c2479c.onComplete();
            }
        }
    }
}
