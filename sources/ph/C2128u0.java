package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1568a;
import hh.InterfaceC1573f;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: renamed from: ph.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2128u0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1573f f19649b;
    public final InterfaceC1573f c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1568a f19650d;
    public final InterfaceC1568a e;
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19651g;

    public C2128u0(ch.r rVar, InterfaceC1573f interfaceC1573f, InterfaceC1573f interfaceC1573f2, InterfaceC1568a interfaceC1568a, InterfaceC1568a interfaceC1568a2) {
        this.f19648a = rVar;
        this.f19649b = interfaceC1573f;
        this.c = interfaceC1573f2;
        this.f19650d = interfaceC1568a;
        this.e = interfaceC1568a2;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19651g) {
            return;
        }
        try {
            this.f19650d.run();
            this.f19651g = true;
            this.f19648a.onComplete();
            try {
                this.e.run();
            } catch (Throwable th2) {
                of.p.F(th2);
                S1.s.r(th2);
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            onError(th3);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.f19651g) {
            S1.s.r(th2);
            return;
        }
        this.f19651g = true;
        try {
            this.c.accept(th2);
        } catch (Throwable th3) {
            of.p.F(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f19648a.onError(th2);
        try {
            this.e.run();
        } catch (Throwable th4) {
            of.p.F(th4);
            S1.s.r(th4);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19651g) {
            return;
        }
        try {
            this.f19649b.accept(obj);
            this.f19648a.onNext(obj);
        } catch (Throwable th2) {
            of.p.F(th2);
            this.f.dispose();
            onError(th2);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            this.f19648a.onSubscribe(this);
        }
    }
}
