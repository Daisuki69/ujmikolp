package mh;

import S1.s;
import ch.InterfaceC1108g;
import java.util.concurrent.atomic.AtomicLong;
import of.p;
import uh.EnumC2313a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicLong implements InterfaceC1108g, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1108g f18431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18432b;
    public nk.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18433d;

    public f(InterfaceC1108g interfaceC1108g, g gVar) {
        this.f18431a = interfaceC1108g;
        this.f18432b = gVar;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (EnumC2313a.b(this.c, cVar)) {
            this.c = cVar;
            this.f18431a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nk.c
    public final void cancel() {
        this.c.cancel();
    }

    @Override // nk.b
    public final void onComplete() {
        if (this.f18433d) {
            return;
        }
        this.f18433d = true;
        this.f18431a.onComplete();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        if (this.f18433d) {
            s.r(th2);
        } else {
            this.f18433d = true;
            this.f18431a.onError(th2);
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.f18433d) {
            return;
        }
        if (get() != 0) {
            this.f18431a.onNext(obj);
            X5.f.A(this, 1L);
            return;
        }
        try {
            this.f18432b.getClass();
        } catch (Throwable th2) {
            p.F(th2);
            cancel();
            onError(th2);
        }
    }

    @Override // nk.c
    public final void request(long j) {
        if (EnumC2313a.a(j)) {
            X5.f.e(this, j);
        }
    }
}
