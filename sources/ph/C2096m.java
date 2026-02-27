package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;

/* JADX INFO: renamed from: ph.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096m implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.x f19545b;
    public final hh.o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19546d;
    public boolean e;

    public /* synthetic */ C2096m(ch.x xVar, hh.o oVar, int i) {
        this.f19544a = i;
        this.f19545b = xVar;
        this.c = oVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19544a) {
            case 0:
                this.f19546d.dispose();
                break;
            default:
                this.f19546d.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19544a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f19545b.onSuccess(Boolean.TRUE);
                    break;
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f19545b.onSuccess(Boolean.FALSE);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19544a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f19545b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f19545b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19544a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.c.test(obj)) {
                            this.e = true;
                            this.f19546d.dispose();
                            this.f19545b.onSuccess(Boolean.FALSE);
                        }
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        this.f19546d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!this.e) {
                    try {
                        if (this.c.test(obj)) {
                            this.e = true;
                            this.f19546d.dispose();
                            this.f19545b.onSuccess(Boolean.TRUE);
                        }
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        this.f19546d.dispose();
                        onError(th3);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19544a) {
            case 0:
                if (EnumC1604b.f(this.f19546d, interfaceC1486b)) {
                    this.f19546d = interfaceC1486b;
                    this.f19545b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19546d, interfaceC1486b)) {
                    this.f19546d = interfaceC1486b;
                    this.f19545b.onSubscribe(this);
                }
                break;
        }
    }
}
