package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;

/* JADX INFO: renamed from: ph.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2088k implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19525b;
    public final hh.o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1486b f19526d;
    public boolean e;

    public /* synthetic */ C2088k(ch.r rVar, hh.o oVar, int i) {
        this.f19524a = i;
        this.f19525b = rVar;
        this.c = oVar;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19524a) {
            case 0:
                this.f19526d.dispose();
                break;
            case 1:
                this.f19526d.dispose();
                break;
            case 2:
                this.f19526d.dispose();
                break;
            case 3:
                this.f19526d.dispose();
                break;
            default:
                this.f19526d.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19524a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    Boolean bool = Boolean.TRUE;
                    ch.r rVar = this.f19525b;
                    rVar.onNext(bool);
                    rVar.onComplete();
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    Boolean bool2 = Boolean.FALSE;
                    ch.r rVar2 = this.f19525b;
                    rVar2.onNext(bool2);
                    rVar2.onComplete();
                }
                break;
            case 2:
                this.f19525b.onComplete();
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onComplete();
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19524a) {
            case 0:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 1:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            case 2:
                this.f19525b.onError(th2);
                break;
            case 3:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                if (!this.e) {
                    this.e = true;
                    this.f19525b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19524a) {
            case 0:
                if (!this.e) {
                    try {
                        if (!this.c.test(obj)) {
                            this.e = true;
                            this.f19526d.dispose();
                            Boolean bool = Boolean.FALSE;
                            ch.r rVar = this.f19525b;
                            rVar.onNext(bool);
                            rVar.onComplete();
                        }
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        this.f19526d.dispose();
                        onError(th2);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                if (!this.e) {
                    try {
                        if (this.c.test(obj)) {
                            this.e = true;
                            this.f19526d.dispose();
                            Boolean bool2 = Boolean.TRUE;
                            ch.r rVar2 = this.f19525b;
                            rVar2.onNext(bool2);
                            rVar2.onComplete();
                        }
                    } catch (Throwable th3) {
                        of.p.F(th3);
                        this.f19526d.dispose();
                        onError(th3);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                boolean z4 = this.e;
                ch.r rVar3 = this.f19525b;
                if (z4) {
                    rVar3.onNext(obj);
                } else {
                    try {
                        if (!this.c.test(obj)) {
                            this.e = true;
                            rVar3.onNext(obj);
                        }
                    } catch (Throwable th4) {
                        of.p.F(th4);
                        this.f19526d.dispose();
                        rVar3.onError(th4);
                        return;
                    }
                }
                break;
            case 3:
                if (!this.e) {
                    ch.r rVar4 = this.f19525b;
                    rVar4.onNext(obj);
                    try {
                        if (this.c.test(obj)) {
                            this.e = true;
                            this.f19526d.dispose();
                            rVar4.onComplete();
                        }
                    } catch (Throwable th5) {
                        of.p.F(th5);
                        this.f19526d.dispose();
                        onError(th5);
                        return;
                    }
                }
                break;
            default:
                if (!this.e) {
                    try {
                        boolean zTest = this.c.test(obj);
                        ch.r rVar5 = this.f19525b;
                        if (!zTest) {
                            this.e = true;
                            this.f19526d.dispose();
                            rVar5.onComplete();
                        } else {
                            rVar5.onNext(obj);
                        }
                    } catch (Throwable th6) {
                        of.p.F(th6);
                        this.f19526d.dispose();
                        onError(th6);
                    }
                    break;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19524a) {
            case 0:
                if (EnumC1604b.f(this.f19526d, interfaceC1486b)) {
                    this.f19526d = interfaceC1486b;
                    this.f19525b.onSubscribe(this);
                }
                break;
            case 1:
                if (EnumC1604b.f(this.f19526d, interfaceC1486b)) {
                    this.f19526d = interfaceC1486b;
                    this.f19525b.onSubscribe(this);
                }
                break;
            case 2:
                if (EnumC1604b.f(this.f19526d, interfaceC1486b)) {
                    this.f19526d = interfaceC1486b;
                    this.f19525b.onSubscribe(this);
                }
                break;
            case 3:
                if (EnumC1604b.f(this.f19526d, interfaceC1486b)) {
                    this.f19526d = interfaceC1486b;
                    this.f19525b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.f19526d, interfaceC1486b)) {
                    this.f19526d = interfaceC1486b;
                    this.f19525b.onSubscribe(this);
                }
                break;
        }
    }
}
