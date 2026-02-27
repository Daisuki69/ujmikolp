package mh;

import S1.s;
import ch.InterfaceC1108g;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import uh.EnumC2313a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AtomicLong implements InterfaceC1108g, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1108g f18434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f18435b;
    public boolean c;

    public h(InterfaceC1108g interfaceC1108g) {
        this.f18434a = interfaceC1108g;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (EnumC2313a.b(this.f18435b, cVar)) {
            this.f18435b = cVar;
            this.f18434a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nk.c
    public final void cancel() {
        this.f18435b.cancel();
    }

    @Override // nk.b
    public final void onComplete() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f18434a.onComplete();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        if (this.c) {
            s.r(th2);
        } else {
            this.c = true;
            this.f18434a.onError(th2);
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.c) {
            return;
        }
        if (get() != 0) {
            this.f18434a.onNext(obj);
            X5.f.A(this, 1L);
        } else {
            this.f18435b.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }
    }

    @Override // nk.c
    public final void request(long j) {
        if (EnumC2313a.a(j)) {
            X5.f.e(this, j);
        }
    }
}
