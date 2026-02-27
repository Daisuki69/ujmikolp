package Kh;

import bg.AbstractC0983W;

/* JADX INFO: renamed from: Kh.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0308m extends Gh.b implements Ah.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bb.c f2738b;
    public io.reactivex.rxjava3.disposables.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Fh.b f2739d;

    public C0308m(Ah.j jVar, Bb.c cVar) {
        this.f2737a = jVar;
        this.f2738b = cVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.c, bVar)) {
            this.c = bVar;
            if (bVar instanceof Fh.b) {
                this.f2739d = (Fh.b) bVar;
            }
            this.f2737a.a(this);
        }
    }

    @Override // Fh.c
    public final int b(int i) {
        return 0;
    }

    public final void c() {
        if (compareAndSet(0, 1)) {
            try {
                this.f2738b.run();
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                E1.c.k(th2);
            }
        }
    }

    @Override // Fh.g
    public final void clear() {
        this.f2739d.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.c.dispose();
        c();
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.f2739d.isEmpty();
    }

    @Override // Ah.j
    public final void onComplete() {
        this.f2737a.onComplete();
        c();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        this.f2737a.onError(th2);
        c();
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        this.f2737a.onNext(obj);
    }

    @Override // Fh.g
    public final Object poll() {
        return this.f2739d.poll();
    }
}
