package kotlin.coroutines;

import Sb.i;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static Object a(CoroutineContext.Element element, Object obj, Function2 operation) {
        j.g(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static CoroutineContext.Element b(CoroutineContext.Element element, f key) {
        j.g(key, "key");
        if (j.b(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext c(CoroutineContext.Element element, f key) {
        j.g(key, "key");
        return j.b(element.getKey(), key) ? g.f18170a : element;
    }

    public static CoroutineContext d(CoroutineContext.Element element, CoroutineContext context) {
        j.g(context, "context");
        return context == g.f18170a ? element : (CoroutineContext) context.fold(element, new i(6));
    }
}
