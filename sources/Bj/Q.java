package Bj;

import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q extends Ij.i {
    public int c;

    public Q(int i) {
        super(0L, false);
        this.c = i;
    }

    public void c(CancellationException cancellationException) {
    }

    public abstract InterfaceC1526a d();

    public Throwable f(Object obj) {
        C0162u c0162u = obj instanceof C0162u ? (C0162u) obj : null;
        if (c0162u != null) {
            return c0162u.f642a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th2) {
        H.r(d().getContext(), new G("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1526a interfaceC1526aD = d();
            kotlin.jvm.internal.j.e(interfaceC1526aD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Gj.e eVar = (Gj.e) interfaceC1526aD;
            InterfaceC1526a interfaceC1526a = eVar.e;
            Object obj = eVar.f2010g;
            CoroutineContext context = interfaceC1526a.getContext();
            Object objC = Gj.v.c(context, obj);
            InterfaceC0156n0 interfaceC0156n0 = null;
            K0 k0C = objC != Gj.v.f2034a ? AbstractC0166y.c(interfaceC1526a, context, objC) : null;
            try {
                CoroutineContext context2 = interfaceC1526a.getContext();
                Object objI = i();
                Throwable thF = f(objI);
                if (thF == null) {
                    int i = this.c;
                    boolean z4 = true;
                    if (i != 1 && i != 2) {
                        z4 = false;
                    }
                    if (z4) {
                        interfaceC0156n0 = (InterfaceC0156n0) context2.get(C0154m0.f630a);
                    }
                }
                if (interfaceC0156n0 != null && !interfaceC0156n0.isActive()) {
                    CancellationException cancellationExceptionG = interfaceC0156n0.g();
                    c(cancellationExceptionG);
                    C1037h.a aVar = C1037h.f9166b;
                    interfaceC1526a.resumeWith(AbstractC1039j.a(cancellationExceptionG));
                } else if (thF != null) {
                    C1037h.a aVar2 = C1037h.f9166b;
                    interfaceC1526a.resumeWith(AbstractC1039j.a(thF));
                } else {
                    C1037h.a aVar3 = C1037h.f9166b;
                    interfaceC1526a.resumeWith(g(objI));
                }
                Unit unit = Unit.f18162a;
                if (k0C == null || k0C.k0()) {
                    Gj.v.a(context, objC);
                }
            } catch (Throwable th2) {
                if (k0C == null || k0C.k0()) {
                    Gj.v.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            h(th3);
        }
    }
}
