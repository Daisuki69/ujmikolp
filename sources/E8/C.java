package E8;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f1266a = new LinkedHashMap();

    public static Object a(Object obj, String str) {
        Object obj2 = f1266a.get(str);
        if (obj2 == null) {
            obj2 = null;
        }
        return obj2 == null ? obj : obj2;
    }

    public static void b(Object obj, String str) {
        LinkedHashMap linkedHashMap = f1266a;
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.Any");
        linkedHashMap.put(str, obj);
    }
}
