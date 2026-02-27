package Jh;

import Ah.f;
import Eh.d;
import Kh.I;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import mg.c;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements f, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1916a f2539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f2540b;
    public final c c;

    public a() {
        C1916a c1916a = d.c;
        I i = d.f1366d;
        c cVar = d.f1365b;
        this.f2539a = c1916a;
        this.f2540b = i;
        this.c = cVar;
    }

    @Override // Ah.f
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.a.d(this, bVar);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // Ah.f
    public final void onComplete() {
        lazySet(Dh.a.f1154a);
        try {
            this.c.getClass();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
        }
    }

    @Override // Ah.f
    public final void onError(Throwable th2) {
        lazySet(Dh.a.f1154a);
        try {
            this.f2540b.accept(th2);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            E1.c.k(new CompositeException(th2, th3));
        }
    }

    @Override // Ah.f
    public final void onSuccess(Object obj) {
        lazySet(Dh.a.f1154a);
        try {
            this.f2539a.getClass();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
        }
    }
}
