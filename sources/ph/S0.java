package ph;

import hh.InterfaceC1570c;
import hh.InterfaceC1573f;
import ih.EnumC1605c;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19333a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1570c f19334b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19335d;

    public S0(ch.l lVar, Iterable iterable, InterfaceC1570c interfaceC1570c) {
        this.c = lVar;
        this.f19335d = iterable;
        this.f19334b = interfaceC1570c;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19333a) {
            case 0:
                try {
                    Object objCall = ((Callable) this.c).call();
                    InterfaceC1570c interfaceC1570c = this.f19334b;
                    R0 r02 = new R0(rVar, interfaceC1570c, (InterfaceC1573f) this.f19335d, objCall);
                    rVar.onSubscribe(r02);
                    Object objA = r02.c;
                    if (!r02.f19323d) {
                        while (!r02.f19323d) {
                            try {
                                objA = interfaceC1570c.a(objA, r02);
                                if (r02.e) {
                                    r02.f19323d = true;
                                    r02.c = null;
                                    r02.a(objA);
                                    break;
                                }
                            } catch (Throwable th2) {
                                of.p.F(th2);
                                r02.c = null;
                                r02.f19323d = true;
                                if (r02.e) {
                                    S1.s.r(th2);
                                } else {
                                    r02.e = true;
                                    r02.f19321a.onError(th2);
                                }
                                r02.a(objA);
                                return;
                            }
                        }
                        r02.c = null;
                        r02.a(objA);
                    } else {
                        r02.c = null;
                        r02.a(objA);
                    }
                } catch (Throwable th3) {
                    of.p.F(th3);
                    EnumC1605c.c(th3, rVar);
                    return;
                }
                break;
            default:
                try {
                    Iterator it = ((Iterable) this.f19335d).iterator();
                    jh.e.b(it, "The iterator returned by other is null");
                    try {
                        if (!it.hasNext()) {
                            EnumC1605c.a(rVar);
                        } else {
                            ((ch.l) this.c).subscribe(new J(rVar, it, this.f19334b));
                        }
                    } catch (Throwable th4) {
                        of.p.F(th4);
                        EnumC1605c.c(th4, rVar);
                        return;
                    }
                } catch (Throwable th5) {
                    of.p.F(th5);
                    EnumC1605c.c(th5, rVar);
                }
                break;
        }
    }

    public S0(Callable callable, InterfaceC1570c interfaceC1570c, InterfaceC1573f interfaceC1573f) {
        this.c = callable;
        this.f19334b = interfaceC1570c;
        this.f19335d = interfaceC1573f;
    }
}
