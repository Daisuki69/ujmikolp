package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class C2 extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19144b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile InterfaceC1779f f19145d;
    public volatile boolean e;

    public C2(D2 d22, long j, int i) {
        this.f19143a = d22;
        this.f19144b = j;
        this.c = i;
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f19144b == this.f19143a.j) {
            this.e = true;
            this.f19143a.b();
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        D2 d22 = this.f19143a;
        d22.getClass();
        if (this.f19144b == d22.j) {
            Qh.c cVar = d22.e;
            cVar.getClass();
            if (AbstractC2353d.a(cVar, th2)) {
                if (!d22.f19166d) {
                    d22.h.dispose();
                    d22.f = true;
                }
                this.e = true;
                d22.b();
                return;
            }
        }
        S1.s.r(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19144b == this.f19143a.j) {
            if (obj != null) {
                this.f19145d.offer(obj);
            }
            this.f19143a.b();
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this, interfaceC1486b)) {
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(7);
                if (iB == 1) {
                    this.f19145d = interfaceC1775b;
                    this.e = true;
                    this.f19143a.b();
                    return;
                } else if (iB == 2) {
                    this.f19145d = interfaceC1775b;
                    return;
                }
            }
            this.f19145d = new rh.c(this.c);
        }
    }
}
