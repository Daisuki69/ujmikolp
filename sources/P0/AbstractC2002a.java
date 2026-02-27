package p0;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: p0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2002a {
    public static Object a(Object obj, Object obj2) {
        if (obj2 == null) {
            return obj;
        }
        if ((obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof String) || (obj2 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Character)) {
            return obj2;
        }
        boolean z4 = obj2 instanceof Map;
        Iterable iterableKeySet = z4 ? ((Map) obj2).keySet() : (Iterable) obj2;
        boolean z5 = obj instanceof Map;
        Iterable iterableKeySet2 = z5 ? ((Map) obj).keySet() : (Iterable) obj;
        Map map = z4 ? (Map) obj2 : null;
        Map map2 = z5 ? (Map) obj : null;
        if (!z5 && !z4) {
            return null;
        }
        HashMap map3 = new HashMap();
        if (iterableKeySet2 != null) {
            for (Object obj3 : iterableKeySet2) {
                if (map != null && map2 != null) {
                    Object obj4 = map.get(obj3);
                    Object obj5 = map2.get(obj3);
                    if (obj4 == null && obj5 != null) {
                        map3.put(obj3, obj5);
                    }
                }
            }
        }
        for (Object obj6 : iterableKeySet) {
            map3.put(obj6, a(map2 != null ? map2.get(obj6) : null, map != null ? map.get(obj6) : null));
        }
        return map3;
    }
}
