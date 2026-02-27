package Lh;

import Ah.p;
import Ah.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f2988b;
    public boolean c;

    public b(q qVar, p pVar) {
        this.f2987a = qVar;
        this.f2988b = pVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.d(this, bVar)) {
            this.f2987a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f2988b.f(new A7.f(16, this, this.f2987a));
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.c) {
            E1.c.k(th2);
        } else {
            this.c = true;
            this.f2987a.onError(th2);
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        ((io.reactivex.rxjava3.disposables.b) get()).dispose();
        onComplete();
    }
}
