package cj;

import dj.C1407e;
import dj.C1413k;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class P {
    public static C1413k a(C1413k c1413k) {
        C1407e c1407e = c1413k.f16537a;
        c1407e.b();
        return c1407e.i > 0 ? c1413k : C1413k.f16536b;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.j.f(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
