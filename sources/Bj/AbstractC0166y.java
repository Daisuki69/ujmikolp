package Bj;

import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: Bj.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0166y {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new C0165x(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new C0165x(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f18170a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new C0165x(1));
        Object objFold = coroutineContext2;
        if (zBooleanValue2) {
            objFold = coroutineContext2.fold(gVar, new C0165x(2));
        }
        return coroutineContext3.plus((CoroutineContext) objFold);
    }

    public static final CoroutineContext b(E e, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(e.getCoroutineContext(), coroutineContext, true);
        Ij.e eVar = U.f603a;
        return (coroutineContextA == eVar || coroutineContextA.get(kotlin.coroutines.d.f18169N) != null) ? coroutineContextA : coroutineContextA.plus(eVar);
    }

    public static final K0 c(InterfaceC1526a interfaceC1526a, CoroutineContext coroutineContext, Object obj) {
        K0 k02 = null;
        if ((interfaceC1526a instanceof InterfaceC1610d) && coroutineContext.get(L0.f597a) != null) {
            InterfaceC1610d callerFrame = (InterfaceC1610d) interfaceC1526a;
            while (true) {
                if ((callerFrame instanceof P) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof K0) {
                    k02 = (K0) callerFrame;
                    break;
                }
            }
            if (k02 != null) {
                k02.l0(coroutineContext, obj);
            }
        }
        return k02;
    }
}
