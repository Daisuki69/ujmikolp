package Ih;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends AtomicReference implements Ah.e, nk.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.e f2339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ah.n f2340b;
    public final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f2341d = new AtomicLong();
    public final boolean e;
    public nk.a f;

    public z(Ah.e eVar, Ah.n nVar, nk.a aVar, boolean z4) {
        this.f2339a = eVar;
        this.f2340b = nVar;
        this.f = aVar;
        this.e = !z4;
    }

    public final void a(long j, nk.c cVar) {
        if (this.e || Thread.currentThread() == get()) {
            cVar.request(j);
        } else {
            this.f2340b.b(new y(cVar, j, 0));
        }
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.b(this.c, cVar)) {
            long andSet = this.f2341d.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, cVar);
            }
        }
    }

    @Override // nk.c
    public final void cancel() {
        Ph.d.a(this.c);
        this.f2340b.dispose();
    }

    @Override // nk.b
    public final void onComplete() {
        this.f2339a.onComplete();
        this.f2340b.dispose();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f2339a.onError(th2);
        this.f2340b.dispose();
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        this.f2339a.onNext(obj);
    }

    @Override // nk.c
    public final void request(long j) {
        if (Ph.d.c(j)) {
            AtomicReference atomicReference = this.c;
            nk.c cVar = (nk.c) atomicReference.get();
            if (cVar != null) {
                a(j, cVar);
                return;
            }
            AtomicLong atomicLong = this.f2341d;
            v0.c(atomicLong, j);
            nk.c cVar2 = (nk.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, cVar2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        nk.a aVar = this.f;
        this.f = null;
        aVar.a(this);
    }
}
