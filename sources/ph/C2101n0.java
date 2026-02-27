package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import vh.C2356g;

/* JADX INFO: renamed from: ph.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101n0 implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19563a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1486b f19564b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19565d;
    public Object e;

    public C2101n0(ch.i iVar) {
        this.f19565d = iVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19563a) {
            case 0:
                this.f19564b.dispose();
                break;
            default:
                this.f19564b.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19563a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    ((ch.r) this.f19565d).onComplete();
                    break;
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    Object obj = this.e;
                    this.e = null;
                    ch.i iVar = (ch.i) this.f19565d;
                    if (obj != null) {
                        iVar.onSuccess(obj);
                    } else {
                        iVar.onComplete();
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19563a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    ((ch.r) this.f19565d).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    ((ch.i) this.f19565d).onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19563a) {
            case 0:
                if (!this.c) {
                    try {
                        Object objApply = ((hh.n) this.e).apply(obj);
                        jh.e.b(objApply, "The selector returned a null Notification");
                        ch.k kVar = (ch.k) objApply;
                        Object obj2 = kVar.f9369a;
                        if (obj2 instanceof C2356g) {
                            this.f19564b.dispose();
                            onError(kVar.a());
                        } else if (obj2 != null) {
                            if (obj2 == null || (obj2 instanceof C2356g)) {
                                obj2 = null;
                            }
                            ((ch.r) this.f19565d).onNext(obj2);
                        } else {
                            this.f19564b.dispose();
                            onComplete();
                        }
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        this.f19564b.dispose();
                        onError(th2);
                        return;
                    }
                } else if (obj instanceof ch.k) {
                    ch.k kVar2 = (ch.k) obj;
                    if (kVar2.f9369a instanceof C2356g) {
                        S1.s.r(kVar2.a());
                    }
                }
                break;
            default:
                if (!this.c) {
                    if (this.e == null) {
                        this.e = obj;
                    } else {
                        this.c = true;
                        this.f19564b.dispose();
                        ((ch.i) this.f19565d).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19563a) {
            case 0:
                if (EnumC1604b.f(this.f19564b, interfaceC1486b)) {
                    this.f19564b = interfaceC1486b;
                    ((ch.r) this.f19565d).onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19564b, interfaceC1486b)) {
                    this.f19564b = interfaceC1486b;
                    ((ch.i) this.f19565d).onSubscribe(this);
                }
                break;
        }
    }

    public C2101n0(ch.r rVar, hh.n nVar) {
        this.f19565d = rVar;
        this.e = nVar;
    }
}
