package ph;

import hh.InterfaceC1570c;
import ih.EnumC1605c;
import java.util.concurrent.Callable;
import lh.C1836g;

/* JADX INFO: loaded from: classes4.dex */
public final class I1 extends ch.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f19222b;
    public final InterfaceC1570c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19223d;

    public /* synthetic */ I1(ch.l lVar, Object obj, InterfaceC1570c interfaceC1570c, int i) {
        this.f19221a = i;
        this.f19222b = lVar;
        this.f19223d = obj;
        this.c = interfaceC1570c;
    }

    @Override // ch.w
    public final void d(ch.x xVar) {
        switch (this.f19221a) {
            case 0:
                this.f19222b.subscribe(new C1836g(2, xVar, this.c, this.f19223d));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.f19223d).call();
                    jh.e.b(objCall, "The seedSupplier returned a null value");
                    this.f19222b.subscribe(new C1836g(2, xVar, this.c, objCall));
                } catch (Throwable th2) {
                    of.p.F(th2);
                    xVar.onSubscribe(EnumC1605c.f17149a);
                    xVar.onError(th2);
                    return;
                }
                break;
        }
    }
}
