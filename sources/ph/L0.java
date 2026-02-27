package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19257b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19258d;

    public /* synthetic */ L0(ch.r rVar, hh.n nVar, int i) {
        this.f19256a = i;
        this.f19257b = rVar;
        this.c = nVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19256a) {
            case 0:
                this.f19258d.dispose();
                this.f19258d = EnumC1604b.f17147a;
                break;
            default:
                this.f19258d.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19256a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.f19258d;
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b != enumC1604b) {
                    this.f19258d = enumC1604b;
                    this.f19257b.onComplete();
                    break;
                }
                break;
            default:
                this.f19257b.onComplete();
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        ch.r rVar = this.f19257b;
        switch (this.f19256a) {
            case 0:
                InterfaceC1486b interfaceC1486b = this.f19258d;
                EnumC1604b enumC1604b = EnumC1604b.f17147a;
                if (interfaceC1486b != enumC1604b) {
                    this.f19258d = enumC1604b;
                    rVar.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                try {
                    Object objApply = this.c.apply(th2);
                    if (objApply != null) {
                        rVar.onNext(objApply);
                        rVar.onComplete();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th2);
                        rVar.onError(nullPointerException);
                    }
                } catch (Throwable th3) {
                    of.p.F(th3);
                    rVar.onError(new CompositeException(th2, th3));
                    return;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19256a) {
            case 0:
                if (this.f19258d != EnumC1604b.f17147a) {
                    try {
                        for (Object obj2 : (Iterable) this.c.apply(obj)) {
                            try {
                                try {
                                    jh.e.b(obj2, "The iterator returned a null value");
                                    this.f19257b.onNext(obj2);
                                } catch (Throwable th2) {
                                    of.p.F(th2);
                                    this.f19258d.dispose();
                                    onError(th2);
                                    return;
                                }
                            } catch (Throwable th3) {
                                of.p.F(th3);
                                this.f19258d.dispose();
                                onError(th3);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        of.p.F(th4);
                        this.f19258d.dispose();
                        onError(th4);
                        return;
                    }
                    break;
                }
                break;
            default:
                this.f19257b.onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19256a) {
            case 0:
                if (EnumC1604b.f(this.f19258d, interfaceC1486b)) {
                    this.f19258d = interfaceC1486b;
                    this.f19257b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19258d, interfaceC1486b)) {
                    this.f19258d = interfaceC1486b;
                    this.f19257b.onSubscribe(this);
                }
                break;
        }
    }
}
