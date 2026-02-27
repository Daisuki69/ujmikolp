package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;

/* JADX INFO: renamed from: ph.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097m0 implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19548b;
    public final C1487c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19549d;
    public final ch.p e;

    public C2097m0(ch.r rVar, ch.p pVar) {
        this.f19547a = 1;
        this.f19548b = rVar;
        this.e = pVar;
        this.f19549d = true;
        this.c = new C1487c();
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19547a) {
            case 0:
                if (!this.f19549d) {
                    this.f19549d = true;
                    ((ch.l) ((C2112q) this.e).f19600b).subscribe(new C2093l0(this, 0));
                    break;
                }
                break;
            default:
                if (!this.f19549d) {
                    this.f19548b.onComplete();
                } else {
                    this.f19549d = false;
                    this.e.subscribe(this);
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19547a) {
            case 0:
                if (!this.f19549d) {
                    this.f19549d = true;
                    this.f19548b.onError(th2);
                } else {
                    S1.s.r(th2);
                }
                break;
            default:
                this.f19548b.onError(th2);
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19547a) {
            case 0:
                onComplete();
                break;
            default:
                if (this.f19549d) {
                    this.f19549d = false;
                }
                this.f19548b.onNext(obj);
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19547a) {
            case 0:
                C1487c c1487c = this.c;
                c1487c.getClass();
                EnumC1604b.d(c1487c, interfaceC1486b);
                break;
            default:
                C1487c c1487c2 = this.c;
                c1487c2.getClass();
                EnumC1604b.d(c1487c2, interfaceC1486b);
                break;
        }
    }

    public C2097m0(C2112q c2112q, C1487c c1487c, ch.r rVar) {
        this.f19547a = 0;
        this.e = c2112q;
        this.c = c1487c;
        this.f19548b = rVar;
    }
}
