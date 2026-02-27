package Kh;

import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: renamed from: Kh.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0309n implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.c f2741b;
    public final Ch.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ch.a f2742d;
    public io.reactivex.rxjava3.disposables.b e;
    public boolean f;

    public C0309n(Ah.j jVar, Ch.c cVar, Ch.c cVar2, Ch.a aVar) {
        this.f2740a = jVar;
        this.f2741b = cVar;
        this.c = cVar2;
        this.f2742d = aVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.e, bVar)) {
            this.e = bVar;
            this.f2740a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.e.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f) {
            return;
        }
        try {
            this.f2742d.run();
            this.f = true;
            this.f2740a.onComplete();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            onError(th2);
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f) {
            E1.c.k(th2);
            return;
        }
        this.f = true;
        try {
            this.c.accept(th2);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f2740a.onError(th2);
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        try {
            this.f2741b.accept(obj);
            this.f2740a.onNext(obj);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            this.e.dispose();
            onError(th2);
        }
    }
}
