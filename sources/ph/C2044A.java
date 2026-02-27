package ph;

import hh.InterfaceC1568a;
import hh.InterfaceC1569b;
import hh.InterfaceC1570c;
import hh.InterfaceC1571d;
import hh.InterfaceC1573f;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import lh.C1836g;
import lh.C1840k;
import xh.C2479c;

/* JADX INFO: renamed from: ph.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2044A extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19117b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2044A(ch.l lVar, Object obj, Object obj2, int i) {
        super(lVar);
        this.f19117b = i;
        this.c = obj;
        this.f19118d = obj2;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19117b) {
            case 0:
                this.f19404a.subscribe(new C2147z(new C2479c(rVar), (Callable) this.f19118d, (Callable) this.c));
                break;
            case 1:
                this.f19404a.subscribe(new C2147z(new C2479c(rVar), (Callable) this.c, (ch.p) this.f19118d));
                break;
            case 2:
                try {
                    Object objCall = ((Callable) this.c).call();
                    jh.e.b(objCall, "The initialSupplier returned a null value");
                    this.f19404a.subscribe(new J(rVar, objCall, (InterfaceC1569b) this.f19118d, 0));
                } catch (Throwable th2) {
                    EnumC1605c.c(th2, rVar);
                    return;
                }
                break;
            case 3:
                try {
                    Object objCall2 = ((Callable) this.c).call();
                    jh.e.b(objCall2, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f19404a.subscribe(new C2109p0(rVar, (hh.n) this.f19118d, (Collection) objCall2));
                } catch (Throwable th3) {
                    of.p.F(th3);
                    EnumC1605c.c(th3, rVar);
                    return;
                }
                break;
            case 4:
                this.f19404a.subscribe(new C2113q0(rVar, (hh.n) this.c, (InterfaceC1571d) this.f19118d));
                break;
            case 5:
                this.f19404a.subscribe(new C1836g(0, rVar, (InterfaceC1573f) this.c, (InterfaceC1568a) this.f19118d));
                break;
            case 6:
                try {
                    Object objCall3 = ((Callable) this.c).call();
                    jh.e.b(objCall3, "The seed supplied is null");
                    this.f19404a.subscribe(new C2107o2(rVar, (InterfaceC1570c) this.f19118d, objCall3));
                } catch (Throwable th4) {
                    of.p.F(th4);
                    EnumC1605c.c(th4, rVar);
                    return;
                }
                break;
            case 7:
                this.f19404a.subscribe(new L2(rVar, (TimeUnit) this.f19118d, (ch.v) this.c));
                break;
            default:
                C2479c c2479c = new C2479c(rVar);
                C1840k c1840k = new C1840k(c2479c, (InterfaceC1570c) this.c);
                c2479c.onSubscribe(c1840k);
                ((ch.p) this.f19118d).subscribe(new C2093l0(c1840k, 2));
                this.f19404a.subscribe(c1840k);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2044A(ch.l lVar, Object obj, Object obj2, int i, boolean z4) {
        super(lVar);
        this.f19117b = i;
        this.f19118d = obj;
        this.c = obj2;
    }
}
