package Bj;

import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class S {
    public static final void a(C0151l c0151l, InterfaceC1526a interfaceC1526a, boolean z4) {
        Object objG;
        Object obj = C0151l.f628g.get(c0151l);
        Throwable thF = c0151l.f(obj);
        if (thF != null) {
            C1037h.a aVar = C1037h.f9166b;
            objG = AbstractC1039j.a(thF);
        } else {
            C1037h.a aVar2 = C1037h.f9166b;
            objG = c0151l.g(obj);
        }
        if (!z4) {
            interfaceC1526a.resumeWith(objG);
            return;
        }
        kotlin.jvm.internal.j.e(interfaceC1526a, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Gj.e eVar = (Gj.e) interfaceC1526a;
        InterfaceC1526a interfaceC1526a2 = eVar.e;
        CoroutineContext context = interfaceC1526a2.getContext();
        Object objC = Gj.v.c(context, eVar.f2010g);
        K0 k0C = objC != Gj.v.f2034a ? AbstractC0166y.c(interfaceC1526a2, context, objC) : null;
        try {
            interfaceC1526a2.resumeWith(objG);
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
    }
}
