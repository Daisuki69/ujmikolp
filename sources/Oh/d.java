package Oh;

import Ah.e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicInteger implements e, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.b f4810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qh.c f4811b = new Qh.c();
    public final AtomicLong c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f4812d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public d(nk.b bVar) {
        this.f4810a = bVar;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (!this.e.compareAndSet(false, true)) {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f4810a.c(this);
        AtomicReference atomicReference = this.f4812d;
        AtomicLong atomicLong = this.c;
        if (Ph.d.b(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
            }
        }
    }

    @Override // nk.c
    public final void cancel() {
        if (this.f) {
            return;
        }
        Ph.d.a(this.f4812d);
    }

    @Override // nk.b
    public final void onComplete() {
        this.f = true;
        nk.b bVar = this.f4810a;
        Qh.c cVar = this.f4811b;
        if (getAndIncrement() == 0) {
            cVar.c(bVar);
        }
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f = true;
        nk.b bVar = this.f4810a;
        Qh.c cVar = this.f4811b;
        if (cVar.a(th2) && getAndIncrement() == 0) {
            cVar.c(bVar);
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            nk.b bVar = this.f4810a;
            bVar.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
            this.f4811b.c(bVar);
        }
    }

    @Override // nk.c
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(androidx.camera.core.impl.a.f(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.f4812d;
        AtomicLong atomicLong = this.c;
        nk.c cVar = (nk.c) atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
            return;
        }
        if (Ph.d.c(j)) {
            v0.c(atomicLong, j);
            nk.c cVar2 = (nk.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }
}
