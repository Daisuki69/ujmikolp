package oh;

import S1.s;
import a.AbstractC0617a;
import ch.InterfaceC1104c;
import ch.x;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ph.C2114q1;
import ph.C2117r1;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: oh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1979a extends AtomicReference implements InterfaceC1104c, ch.i, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f18851b;

    public /* synthetic */ C1979a(AtomicInteger atomicInteger, int i) {
        this.f18850a = i;
        this.f18851b = atomicInteger;
    }

    @Override // ch.InterfaceC1104c, ch.i
    public void onComplete() {
        switch (this.f18850a) {
            case 0:
                C1980b c1980b = (C1980b) this.f18851b;
                c1980b.i = false;
                c1980b.a();
                break;
            case 1:
                C1982d c1982d = (C1982d) this.f18851b;
                c1982d.f18864k = 0;
                c1982d.a();
                break;
            case 2:
            default:
                C2117r1 c2117r1 = (C2117r1) this.f18851b;
                c2117r1.i = 2;
                if (c2117r1.getAndIncrement() == 0) {
                    c2117r1.a();
                }
                break;
            case 3:
                C2114q1 c2114q1 = (C2114q1) this.f18851b;
                c2114q1.f = true;
                if (c2114q1.e) {
                    AbstractC0617a.H(c2114q1.f19602a, c2114q1, c2114q1.f19604d);
                }
                break;
        }
    }

    @Override // ch.InterfaceC1104c, ch.i, ch.x
    public final void onError(Throwable th2) {
        switch (this.f18850a) {
            case 0:
                C1980b c1980b = (C1980b) this.f18851b;
                Qh.c cVar = c1980b.f18854d;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    s.r(th2);
                } else if (c1980b.c != 1) {
                    c1980b.i = false;
                    c1980b.a();
                } else {
                    c1980b.f18856k = true;
                    c1980b.h.dispose();
                    Qh.c cVar2 = c1980b.f18854d;
                    cVar2.getClass();
                    Throwable thB = AbstractC2353d.b(cVar2);
                    if (thB != AbstractC2353d.f20501a) {
                        c1980b.f18852a.onError(thB);
                    }
                    if (c1980b.getAndIncrement() == 0) {
                        c1980b.f18855g.clear();
                    }
                }
                break;
            case 1:
                C1982d c1982d = (C1982d) this.f18851b;
                Qh.c cVar3 = c1982d.f18862d;
                cVar3.getClass();
                if (!AbstractC2353d.a(cVar3, th2)) {
                    s.r(th2);
                } else {
                    if (c1982d.f != 3) {
                        c1982d.f18863g.dispose();
                    }
                    c1982d.f18864k = 0;
                    c1982d.a();
                }
                break;
            case 2:
                C1982d c1982d2 = (C1982d) this.f18851b;
                Qh.c cVar4 = c1982d2.f18862d;
                cVar4.getClass();
                if (!AbstractC2353d.a(cVar4, th2)) {
                    s.r(th2);
                } else {
                    if (c1982d2.f != 3) {
                        c1982d2.f18863g.dispose();
                    }
                    c1982d2.f18864k = 0;
                    c1982d2.a();
                }
                break;
            case 3:
                C2114q1 c2114q1 = (C2114q1) this.f18851b;
                EnumC1604b.a(c2114q1.f19603b);
                AbstractC0617a.I(c2114q1.f19602a, th2, c2114q1, c2114q1.f19604d);
                break;
            case 4:
                C2117r1 c2117r1 = (C2117r1) this.f18851b;
                Qh.c cVar5 = c2117r1.f19617d;
                cVar5.getClass();
                if (!AbstractC2353d.a(cVar5, th2)) {
                    s.r(th2);
                } else {
                    EnumC1604b.a(c2117r1.c);
                    if (c2117r1.getAndIncrement() == 0) {
                        c2117r1.a();
                    }
                }
                break;
            default:
                C2117r1 c2117r12 = (C2117r1) this.f18851b;
                Qh.c cVar6 = c2117r12.f19617d;
                cVar6.getClass();
                if (!AbstractC2353d.a(cVar6, th2)) {
                    s.r(th2);
                } else {
                    EnumC1604b.a(c2117r12.c);
                    if (c2117r12.getAndIncrement() == 0) {
                        c2117r12.a();
                    }
                }
                break;
        }
    }

    @Override // ch.InterfaceC1104c, ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f18850a) {
            case 0:
                EnumC1604b.c(this, interfaceC1486b);
                break;
            case 1:
                EnumC1604b.c(this, interfaceC1486b);
                break;
            case 2:
                EnumC1604b.c(this, interfaceC1486b);
                break;
            case 3:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            case 4:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            default:
                EnumC1604b.e(this, interfaceC1486b);
                break;
        }
    }

    @Override // ch.i, ch.x
    public void onSuccess(Object obj) {
        switch (this.f18850a) {
            case 1:
                C1982d c1982d = (C1982d) this.f18851b;
                c1982d.j = obj;
                c1982d.f18864k = 2;
                c1982d.a();
                break;
            case 2:
                C1982d c1982d2 = (C1982d) this.f18851b;
                c1982d2.j = obj;
                c1982d2.f18864k = 2;
                c1982d2.a();
                break;
            case 3:
            default:
                C2117r1 c2117r1 = (C2117r1) this.f18851b;
                if (c2117r1.compareAndSet(0, 1)) {
                    c2117r1.f19616b.onNext(obj);
                    c2117r1.i = 2;
                } else {
                    c2117r1.f = obj;
                    c2117r1.i = 1;
                    if (c2117r1.getAndIncrement() != 0) {
                    }
                }
                c2117r1.a();
                break;
            case 4:
                C2117r1 c2117r12 = (C2117r1) this.f18851b;
                if (c2117r12.compareAndSet(0, 1)) {
                    c2117r12.f19616b.onNext(obj);
                    c2117r12.i = 2;
                } else {
                    c2117r12.f = obj;
                    c2117r12.i = 1;
                    if (c2117r12.getAndIncrement() != 0) {
                    }
                }
                c2117r12.a();
                break;
        }
    }
}
