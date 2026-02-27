package ph;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import vh.C2356g;
import xh.AbstractC2477a;

/* JADX INFO: renamed from: ph.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084j extends AbstractC2477a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayBlockingQueue f19505b = new ArrayBlockingQueue(1);
    public final AtomicInteger c = new AtomicInteger();

    @Override // ch.r
    public final void onComplete() {
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        S1.s.r(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        Object obj2;
        Object obj3;
        ch.k kVar = (ch.k) obj;
        if (this.c.getAndSet(0) != 1 && (obj3 = kVar.f9369a) != null && !(obj3 instanceof C2356g)) {
            return;
        }
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f19505b;
            if (arrayBlockingQueue.offer(kVar)) {
                return;
            }
            ch.k kVar2 = (ch.k) arrayBlockingQueue.poll();
            if (kVar2 != null && ((obj2 = kVar2.f9369a) == null || (obj2 instanceof C2356g))) {
                kVar = kVar2;
            }
        }
    }
}
