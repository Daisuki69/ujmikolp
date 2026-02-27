package Bj;

import gj.InterfaceC1526a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 extends Gj.q {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public K0(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext) {
        L0 l02 = L0.f597a;
        super(interfaceC1526a, coroutineContext.get(l02) == null ? coroutineContext.plus(l02) : coroutineContext);
        this.e = new ThreadLocal();
        if (interfaceC1526a.getContext().get(kotlin.coroutines.d.f18169N) instanceof A) {
            return;
        }
        Object objC = Gj.v.c(coroutineContext, null);
        Gj.v.a(coroutineContext, objC);
        l0(coroutineContext, objC);
    }

    public final boolean k0() {
        boolean z4 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z4;
    }

    public final void l0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new Pair(coroutineContext, obj));
    }

    @Override // Gj.q, Bj.u0
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.e.get();
            if (pair != null) {
                Gj.v.a((CoroutineContext) pair.f18160a, pair.f18161b);
            }
            this.e.remove();
        }
        Object objA = AbstractC0163v.a(obj);
        InterfaceC1526a interfaceC1526a = this.f2028d;
        CoroutineContext context = interfaceC1526a.getContext();
        Object objC = Gj.v.c(context, null);
        K0 k0C = objC != Gj.v.f2034a ? AbstractC0166y.c(interfaceC1526a, context, objC) : null;
        try {
            this.f2028d.resumeWith(objA);
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
