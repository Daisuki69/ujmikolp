package Kh;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Kh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0300e extends AtomicReference implements Ah.c, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2724a;

    public C0300e(Ah.j jVar) {
        this.f2724a = jVar;
    }

    public final boolean a() {
        return Dh.a.b((io.reactivex.rxjava3.disposables.b) get());
    }

    public final void b(Throwable th2) {
        if (a()) {
            E1.c.k(th2);
            return;
        }
        try {
            this.f2724a.onError(th2);
        } finally {
            Dh.a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this);
    }

    @Override // Ah.c
    public final void onNext(Object obj) {
        if (obj == null) {
            b(Qh.e.b("onNext called with a null value."));
        } else {
            if (a()) {
                return;
            }
            this.f2724a.onNext(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return androidx.media3.datasource.cache.c.l(C0300e.class.getSimpleName(), "{", super.toString(), "}");
    }
}
