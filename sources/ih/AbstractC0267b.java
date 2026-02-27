package Ih;

import java.util.concurrent.atomic.AtomicLong;
import k2.v0;

/* JADX INFO: renamed from: Ih.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0267b extends AtomicLong implements Ah.c, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.e f2301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dh.d f2302b = new Dh.d(0);

    public AbstractC0267b(Ah.e eVar) {
        this.f2301a = eVar;
    }

    public final void a() {
        Dh.d dVar = this.f2302b;
        if (dVar.b()) {
            return;
        }
        try {
            this.f2301a.onComplete();
        } finally {
            Dh.a.a(dVar);
        }
    }

    public final boolean b(Throwable th2) {
        Dh.d dVar = this.f2302b;
        if (dVar.b()) {
            return false;
        }
        try {
            this.f2301a.onError(th2);
            Dh.a.a(dVar);
            return true;
        } catch (Throwable th3) {
            Dh.a.a(dVar);
            throw th3;
        }
    }

    public final void c(Throwable th2) {
        if (f(th2)) {
            return;
        }
        E1.c.k(th2);
    }

    @Override // nk.c
    public final void cancel() {
        Dh.d dVar = this.f2302b;
        dVar.getClass();
        Dh.a.a(dVar);
        e();
    }

    public void d() {
    }

    public void e() {
    }

    public boolean f(Throwable th2) {
        return b(th2);
    }

    @Override // Ah.c
    public void onComplete() {
        a();
    }

    @Override // nk.c
    public final void request(long j) {
        if (Ph.d.c(j)) {
            v0.c(this, j);
            d();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return androidx.media3.datasource.cache.c.l(getClass().getSimpleName(), "{", super.toString(), "}");
    }
}
