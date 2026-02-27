package hj;

import gj.InterfaceC1526a;
import ij.AbstractC1607a;
import ij.AbstractC1609c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1526a a(InterfaceC1526a interfaceC1526a, InterfaceC1526a interfaceC1526a2, Function2 function2) {
        j.g(function2, "<this>");
        if (function2 instanceof AbstractC1607a) {
            return ((AbstractC1607a) function2).create(interfaceC1526a, interfaceC1526a2);
        }
        CoroutineContext context = interfaceC1526a2.getContext();
        return context == kotlin.coroutines.g.f18170a ? new d(interfaceC1526a2, interfaceC1526a, function2) : new e(interfaceC1526a2, context, function2, interfaceC1526a);
    }

    public static InterfaceC1526a b(InterfaceC1526a interfaceC1526a) {
        InterfaceC1526a<Object> interfaceC1526aIntercepted;
        j.g(interfaceC1526a, "<this>");
        AbstractC1609c abstractC1609c = interfaceC1526a instanceof AbstractC1609c ? (AbstractC1609c) interfaceC1526a : null;
        return (abstractC1609c == null || (interfaceC1526aIntercepted = abstractC1609c.intercepted()) == null) ? interfaceC1526a : interfaceC1526aIntercepted;
    }

    public static Object c(Function2 function2, Object obj, InterfaceC1526a interfaceC1526a) {
        j.g(function2, "<this>");
        CoroutineContext context = interfaceC1526a.getContext();
        Object fVar = context == kotlin.coroutines.g.f18170a ? new f(interfaceC1526a) : new g(interfaceC1526a, context);
        D.d(2, function2);
        return function2.invoke(obj, fVar);
    }
}
