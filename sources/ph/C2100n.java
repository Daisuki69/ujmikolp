package ph;

import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import jh.CallableC1682a;
import kh.InterfaceC1774a;

/* JADX INFO: renamed from: ph.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100n extends ch.w implements InterfaceC1774a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19562b;
    public final Object c;

    public /* synthetic */ C2100n(ch.l lVar, Object obj, int i) {
        this.f19561a = i;
        this.f19562b = lVar;
        this.c = obj;
    }

    @Override // kh.InterfaceC1774a
    public final ch.l a() {
        switch (this.f19561a) {
            case 0:
                return new C2092l(this.f19562b, (hh.o) this.c, 0);
            case 1:
                return new C2092l(this.f19562b, (hh.o) this.c, 1);
            default:
                return new C2120s0(this.f19562b, (Callable) this.c, 4);
        }
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        switch (this.f19561a) {
            case 0:
                this.f19562b.subscribe(new C2096m(xVar, (hh.o) this.c, 0));
                break;
            case 1:
                this.f19562b.subscribe(new C2096m(xVar, (hh.o) this.c, 1));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.c).call();
                    jh.e.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f19562b.subscribe(new C2098m1(xVar, (Collection) objCall, 3));
                } catch (Throwable th2) {
                    of.p.F(th2);
                    xVar.onSubscribe(EnumC1605c.f17149a);
                    xVar.onError(th2);
                    return;
                }
                break;
        }
    }

    public C2100n(ch.l lVar, int i) {
        this.f19561a = 2;
        this.f19562b = lVar;
        this.c = new CallableC1682a(i);
    }
}
