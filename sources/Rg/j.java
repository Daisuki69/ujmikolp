package Rg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5540a = new ConcurrentHashMap();

    public final Object a(a key, Function0 function0) {
        kotlin.jvm.internal.j.g(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f5540a;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = function0.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        kotlin.jvm.internal.j.e(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    public final boolean b(a key) {
        kotlin.jvm.internal.j.g(key, "key");
        return d().containsKey(key);
    }

    public final Object c(a key) {
        kotlin.jvm.internal.j.g(key, "key");
        Object objE = e(key);
        if (objE != null) {
            return objE;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    public final Map d() {
        return this.f5540a;
    }

    public final Object e(a key) {
        kotlin.jvm.internal.j.g(key, "key");
        return d().get(key);
    }

    public final void f(a key, Object value) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        d().put(key, value);
    }
}
