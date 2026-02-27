package Lh;

import Ah.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AtomicReference implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2986a;

    public a(q qVar) {
        this.f2986a = qVar;
    }

    public final void a(Throwable th2) {
        io.reactivex.rxjava3.disposables.b bVar;
        Object obj = get();
        Dh.a aVar = Dh.a.f1154a;
        if (obj == aVar || (bVar = (io.reactivex.rxjava3.disposables.b) getAndSet(aVar)) == aVar) {
            E1.c.k(th2);
            return;
        }
        try {
            this.f2986a.onError(th2);
        } finally {
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    public final void b(Object obj) {
        io.reactivex.rxjava3.disposables.b bVar;
        Object obj2 = get();
        Dh.a aVar = Dh.a.f1154a;
        if (obj2 == aVar || (bVar = (io.reactivex.rxjava3.disposables.b) getAndSet(aVar)) == aVar) {
            return;
        }
        q qVar = this.f2986a;
        try {
            if (obj == null) {
                qVar.onError(Qh.e.b("onSuccess called with a null value."));
            } else {
                qVar.onSuccess(obj);
            }
            if (bVar != null) {
                bVar.dispose();
            }
        } catch (Throwable th2) {
            if (bVar != null) {
                bVar.dispose();
            }
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return androidx.media3.datasource.cache.c.l(a.class.getSimpleName(), "{", super.toString(), "}");
    }
}
