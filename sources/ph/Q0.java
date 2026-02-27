package ph;

import ch.InterfaceC1108g;
import fh.InterfaceC1486b;
import uh.EnumC2313a;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 implements InterfaceC1108g, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f19313b;

    public Q0(ch.r rVar) {
        this.f19312a = rVar;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (EnumC2313a.b(this.f19313b, cVar)) {
            this.f19313b = cVar;
            this.f19312a.onSubscribe(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19313b.cancel();
        this.f19313b = EnumC2313a.f20320a;
    }

    @Override // nk.b
    public final void onComplete() {
        this.f19312a.onComplete();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f19312a.onError(th2);
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        this.f19312a.onNext(obj);
    }
}
