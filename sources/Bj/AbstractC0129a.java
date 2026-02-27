package Bj;

import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1607a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: Bj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0129a extends u0 implements InterfaceC1526a, E {
    public final CoroutineContext c;

    public AbstractC0129a(CoroutineContext coroutineContext, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            P((InterfaceC0156n0) coroutineContext.get(C0154m0.f630a));
        }
        this.c = coroutineContext.plus(this);
    }

    @Override // Bj.u0
    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // Bj.u0
    public final void O(CompletionHandlerException completionHandlerException) {
        H.r(this.c, completionHandlerException);
    }

    @Override // Bj.u0
    public final void Z(Object obj) {
        if (!(obj instanceof C0162u)) {
            i0(obj);
        } else {
            C0162u c0162u = (C0162u) obj;
            h0(c0162u.f642a, C0162u.f641b.get(c0162u) != 0);
        }
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return this.c;
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.c;
    }

    public void h0(Throwable th2, boolean z4) {
    }

    public void i0(Object obj) {
    }

    public final void j0(F f, AbstractC0129a abstractC0129a, Function2 function2) {
        Object objInvoke;
        int iOrdinal = f.ordinal();
        if (iOrdinal == 0) {
            Hj.a.b(function2, abstractC0129a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.j.g(function2, "<this>");
                InterfaceC1526a interfaceC1526aB = hj.h.b(hj.h.a(abstractC0129a, this, function2));
                C1037h.a aVar = C1037h.f9166b;
                interfaceC1526aB.resumeWith(Unit.f18162a);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                CoroutineContext coroutineContext = this.c;
                Object objC = Gj.v.c(coroutineContext, null);
                try {
                    if (function2 instanceof AbstractC1607a) {
                        kotlin.jvm.internal.D.d(2, function2);
                        objInvoke = function2.invoke(abstractC0129a, this);
                    } else {
                        objInvoke = hj.h.c(function2, abstractC0129a, this);
                    }
                    Gj.v.a(coroutineContext, objC);
                    if (objInvoke != EnumC1578a.f17050a) {
                        C1037h.a aVar2 = C1037h.f9166b;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    Gj.v.a(coroutineContext, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                C1037h.a aVar3 = C1037h.f9166b;
                resumeWith(AbstractC1039j.a(th3));
            }
        }
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        Throwable thA = C1037h.a(obj);
        if (thA != null) {
            obj = new C0162u(thA, false);
        }
        Object objU = U(obj);
        if (objU == H.e) {
            return;
        }
        x(objU);
    }
}
