package Kh;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AtomicReference implements Ah.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0313s f2746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f2747b;
    public volatile Fh.g c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2748d;

    public r(C0313s c0313s) {
        this.f2746a = c0313s;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.d(this, bVar) && (bVar instanceof Fh.b)) {
            Fh.b bVar2 = (Fh.b) bVar;
            int iB = bVar2.b(7);
            if (iB == 1) {
                this.f2748d = iB;
                this.c = bVar2;
                this.f2747b = true;
                this.f2746a.d();
                return;
            }
            if (iB == 2) {
                this.f2748d = iB;
                this.c = bVar2;
            }
        }
    }

    @Override // Ah.j
    public final void onComplete() {
        this.f2747b = true;
        this.f2746a.d();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f2746a.f2754g.a(th2)) {
            C0313s c0313s = this.f2746a;
            c0313s.getClass();
            c0313s.c();
            this.f2747b = true;
            this.f2746a.d();
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f2748d != 0) {
            this.f2746a.d();
            return;
        }
        C0313s c0313s = this.f2746a;
        if (c0313s.get() == 0 && c0313s.compareAndSet(0, 1)) {
            c0313s.f2751a.onNext(obj);
            if (c0313s.decrementAndGet() == 0) {
                return;
            }
        } else {
            Fh.g bVar = this.c;
            if (bVar == null) {
                bVar = new Mh.b(c0313s.f2753d);
                this.c = bVar;
            }
            bVar.offer(obj);
            if (c0313s.getAndIncrement() != 0) {
                return;
            }
        }
        c0313s.e();
    }
}
