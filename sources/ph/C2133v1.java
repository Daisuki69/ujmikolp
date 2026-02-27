package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: renamed from: ph.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133v1 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19666b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1487c f19667d = new C1487c();
    public boolean e;
    public boolean f;

    public C2133v1(ch.r rVar, hh.n nVar, boolean z4) {
        this.f19665a = rVar;
        this.f19666b = nVar;
        this.c = z4;
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e = true;
        this.f19665a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        boolean z4 = this.e;
        ch.r rVar = this.f19665a;
        if (z4) {
            if (this.f) {
                S1.s.r(th2);
                return;
            } else {
                rVar.onError(th2);
                return;
            }
        }
        this.e = true;
        if (this.c && !(th2 instanceof Exception)) {
            rVar.onError(th2);
            return;
        }
        try {
            ch.p pVar = (ch.p) this.f19666b.apply(th2);
            if (pVar != null) {
                pVar.subscribe(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th2);
            rVar.onError(nullPointerException);
        } catch (Throwable th3) {
            of.p.F(th3);
            rVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        this.f19665a.onNext(obj);
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C1487c c1487c = this.f19667d;
        c1487c.getClass();
        EnumC1604b.c(c1487c, interfaceC1486b);
    }
}
