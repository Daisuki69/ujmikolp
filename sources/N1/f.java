package N1;

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f3495a = new WeakHashMap();

    public static i a(Class cls, String str) {
        Map map;
        str.getClass();
        WeakHashMap weakHashMap = f3495a;
        synchronized (weakHashMap) {
            Map map2 = (Map) weakHashMap.get(cls);
            map = map2;
            if (map2 == null) {
                HashMap map3 = new HashMap();
                for (Enum r32 : EnumSet.allOf(cls)) {
                    map3.put(r32.name(), new WeakReference(r32));
                }
                f3495a.put(cls, map3);
                map = map3;
            }
        }
        WeakReference weakReference = (WeakReference) map.get(str);
        if (weakReference == null) {
            return a.f3489a;
        }
        Enum r62 = (Enum) cls.cast(weakReference.get());
        r62.getClass();
        return new l(r62);
    }
}
