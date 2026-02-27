package ph;

import java.util.concurrent.Callable;
import lh.C1835f;

/* JADX INFO: loaded from: classes4.dex */
public final class N0 extends ch.l implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f19281a;

    public N0(Callable callable) {
        this.f19281a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Object objCall = this.f19281a.call();
        jh.e.b(objCall, "The callable returned a null value");
        return objCall;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        C1835f c1835f = new C1835f(rVar);
        rVar.onSubscribe(c1835f);
        if (c1835f.c()) {
            return;
        }
        try {
            Object objCall = this.f19281a.call();
            jh.e.b(objCall, "Callable returned null");
            c1835f.a(objCall);
        } catch (Throwable th2) {
            of.p.F(th2);
            if (c1835f.c()) {
                S1.s.r(th2);
            } else {
                rVar.onError(th2);
            }
        }
    }
}
