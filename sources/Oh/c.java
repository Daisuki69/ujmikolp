package Oh;

import Ah.e;
import Ih.r;
import Kh.I;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements e, nk.c, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1916a f4807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f4808b;
    public final mg.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f4809d;

    public c() {
        C1916a c1916a = Eh.d.c;
        I i = Eh.d.f1366d;
        mg.c cVar = Eh.d.f1365b;
        r rVar = r.f2324a;
        this.f4807a = c1916a;
        this.f4808b = i;
        this.c = cVar;
        this.f4809d = rVar;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.b(this, cVar)) {
            try {
                this.f4809d.accept(this);
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // nk.c
    public final void cancel() {
        Ph.d.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Ph.d.a(this);
    }

    @Override // nk.b
    public final void onComplete() {
        Object obj = get();
        Ph.d dVar = Ph.d.f5178a;
        if (obj != dVar) {
            lazySet(dVar);
            try {
                this.c.getClass();
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                E1.c.k(th2);
            }
        }
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        Object obj = get();
        Ph.d dVar = Ph.d.f5178a;
        if (obj == dVar) {
            E1.c.k(th2);
            return;
        }
        lazySet(dVar);
        try {
            this.f4808b.accept(th2);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            E1.c.k(new CompositeException(th2, th3));
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (get() == Ph.d.f5178a) {
            return;
        }
        try {
            this.f4807a.getClass();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            ((nk.c) get()).cancel();
            onError(th2);
        }
    }

    @Override // nk.c
    public final void request(long j) {
        ((nk.c) get()).request(j);
    }
}
