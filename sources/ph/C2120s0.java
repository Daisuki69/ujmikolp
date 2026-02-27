package ph;

import fh.C1487c;
import hh.InterfaceC1568a;
import hh.InterfaceC1570c;
import hh.InterfaceC1571d;
import hh.InterfaceC1573f;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import jh.CallableC1682a;

/* JADX INFO: renamed from: ph.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120s0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19629b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2120s0(ch.l lVar, Object obj, int i) {
        super(lVar);
        this.f19629b = i;
        this.c = obj;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19629b) {
            case 0:
                this.f19404a.subscribe(new C2116r0(rVar, (InterfaceC1573f) this.c, 0));
                break;
            case 1:
                this.f19404a.subscribe(new C2124t0(rVar, (InterfaceC1568a) this.c));
                break;
            case 2:
                C1487c c1487c = new C1487c();
                rVar.onSubscribe(c1487c);
                new C2067e2(rVar, (InterfaceC1571d) this.c, c1487c, this.f19404a).a();
                break;
            case 3:
                this.f19404a.subscribe(new C2107o2(rVar, (InterfaceC1570c) this.c));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.c).call();
                    jh.e.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f19404a.subscribe(new C2098m1(rVar, (Collection) objCall, 2));
                } catch (Throwable th2) {
                    of.p.F(th2);
                    EnumC1605c.c(th2, rVar);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120s0(ch.p pVar) {
        super(pVar);
        this.f19629b = 4;
        this.c = new CallableC1682a(16);
    }
}
