package Gh;

import Ah.j;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicReference implements j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ch.c f1993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.c f1994b;
    public final mg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1916a f1995d;

    public f(Ch.c cVar, Ch.c cVar2) {
        mg.c cVar3 = Eh.d.f1365b;
        C1916a c1916a = Eh.d.c;
        this.f1993a = cVar;
        this.f1994b = cVar2;
        this.c = cVar3;
        this.f1995d = c1916a;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.d(this, bVar)) {
            try {
                this.f1995d.getClass();
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }

    public final boolean b() {
        return get() == Dh.a.f1154a;
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // Ah.j
    public final void onComplete() {
        if (b()) {
            return;
        }
        lazySet(Dh.a.f1154a);
        try {
            this.c.getClass();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (b()) {
            E1.c.k(th2);
            return;
        }
        lazySet(Dh.a.f1154a);
        try {
            this.f1994b.accept(th2);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            E1.c.k(new CompositeException(th2, th3));
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (b()) {
            return;
        }
        try {
            this.f1993a.accept(obj);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            ((io.reactivex.rxjava3.disposables.b) get()).dispose();
            onError(th2);
        }
    }
}
