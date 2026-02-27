package Kh;

import bg.AbstractC0983W;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import pi.C2151a;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends AtomicInteger implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2760a;
    public final C2151a e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f2763g;
    public volatile boolean h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dh.c f2761b = new Dh.c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qh.c f2762d = new Qh.c();
    public final AtomicInteger c = new AtomicInteger(1);
    public final AtomicReference f = new AtomicReference();

    public u(Ah.j jVar, C2151a c2151a) {
        this.f2760a = jVar;
        this.e = c2151a;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.f2763g, bVar)) {
            this.f2763g = bVar;
            this.f2760a.a(this);
        }
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            c();
        }
    }

    public final void c() {
        Ah.j jVar = this.f2760a;
        AtomicInteger atomicInteger = this.c;
        AtomicReference atomicReference = this.f;
        int iAddAndGet = 1;
        while (!this.h) {
            if (((Throwable) this.f2762d.get()) != null) {
                Mh.b bVar = (Mh.b) this.f.get();
                if (bVar != null) {
                    bVar.clear();
                }
                this.f2762d.b(jVar);
                return;
            }
            boolean z4 = atomicInteger.get() == 0;
            Mh.b bVar2 = (Mh.b) atomicReference.get();
            Object objPoll = bVar2 != null ? bVar2.poll() : null;
            boolean z5 = objPoll == null;
            if (z4 && z5) {
                this.f2762d.b(this.f2760a);
                return;
            } else if (z5) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                jVar.onNext(objPoll);
            }
        }
        Mh.b bVar3 = (Mh.b) this.f.get();
        if (bVar3 != null) {
            bVar3.clear();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.h = true;
        this.f2763g.dispose();
        this.f2761b.dispose();
        Qh.c cVar = this.f2762d;
        cVar.getClass();
        Throwable thC = Qh.e.c(cVar);
        if (thC == null || thC == Qh.e.f5385a) {
            return;
        }
        E1.c.k(thC);
    }

    @Override // Ah.j
    public final void onComplete() {
        this.c.decrementAndGet();
        b();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        this.c.decrementAndGet();
        if (this.f2762d.a(th2)) {
            this.f2761b.dispose();
            b();
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        try {
            Ah.p pVar = (Ah.p) this.e.apply(obj);
            this.c.getAndIncrement();
            Hh.b bVar = new Hh.b(this);
            if (this.h || !this.f2761b.a(bVar)) {
                return;
            }
            pVar.f(bVar);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.f2763g.dispose();
            onError(th2);
        }
    }
}
