package Xh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6630a = 32768;

    public final Si.a a(Map map) {
        if (map == null) {
            return new Si.a(true, null, 0, null);
        }
        if (map.size() > 300) {
            Ri.a.q("trackEvent has more than 300 properties. Some of them will be trimmed when processed");
        }
        HashMap map2 = new HashMap(map);
        int length = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value != null && !(value instanceof Number) && !(value instanceof Boolean) && !(value instanceof String)) {
                map2.put(str, null);
            }
            length += ((value == null || value.getClass() != String.class) ? 0 : value.toString().getBytes().length) + str.getBytes().length;
            if (length > f6630a) {
                Ri.a.q("trackThe maximum size allowed for the  properties is 32kb. Current is " + str + ". Event not queued");
                return new Si.a(false, null, length, "Event properties size is too large");
            }
        }
        return new Si.a(true, map2, length, null);
    }
}
