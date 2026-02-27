package ph;

import fh.InterfaceC1486b;
import hh.InterfaceC1570c;
import ih.EnumC1604b;

/* JADX INFO: renamed from: ph.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107o2 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19579a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19580b;
    public final InterfaceC1570c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f19581d;
    public InterfaceC1486b e;
    public boolean f;

    public C2107o2(ch.r rVar, InterfaceC1570c interfaceC1570c) {
        this.f19580b = rVar;
        this.c = interfaceC1570c;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19579a) {
            case 0:
                this.e.dispose();
                break;
            default:
                this.e.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19579a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f19580b.onComplete();
                    break;
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f19580b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19579a) {
            case 0:
                if (!this.f) {
                    this.f = true;
                    this.f19580b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.f) {
                    this.f = true;
                    this.f19580b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19579a) {
            case 0:
                if (!this.f) {
                    Object obj2 = this.f19581d;
                    ch.r rVar = this.f19580b;
                    if (obj2 == null) {
                        this.f19581d = obj;
                        rVar.onNext(obj);
                    } else {
                        try {
                            Object objA = this.c.a(obj2, obj);
                            jh.e.b(objA, "The value returned by the accumulator is null");
                            this.f19581d = objA;
                            rVar.onNext(objA);
                        } catch (Throwable th2) {
                            of.p.F(th2);
                            this.e.dispose();
                            onError(th2);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!this.f) {
                    try {
                        Object objA2 = this.c.a(this.f19581d, obj);
                        jh.e.b(objA2, "The accumulator returned a null value");
                        this.f19581d = objA2;
                        this.f19580b.onNext(objA2);
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        this.e.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19579a) {
            case 0:
                if (EnumC1604b.f(this.e, interfaceC1486b)) {
                    this.e = interfaceC1486b;
                    this.f19580b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.e, interfaceC1486b)) {
                    this.e = interfaceC1486b;
                    ch.r rVar = this.f19580b;
                    rVar.onSubscribe(this);
                    rVar.onNext(this.f19581d);
                }
                break;
        }
    }

    public C2107o2(ch.r rVar, InterfaceC1570c interfaceC1570c, Object obj) {
        this.f19580b = rVar;
        this.c = interfaceC1570c;
        this.f19581d = obj;
    }
}
