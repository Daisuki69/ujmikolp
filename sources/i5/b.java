package I5;

import cj.C1110A;
import cj.M;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Map a(Boolean bool, Integer num, String str, String str2, List list, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap, "exclude_with_fees", bool != null ? bool.toString() : null);
        b(linkedHashMap, "page", num != null ? num.toString() : null);
        b(linkedHashMap, "keyword", str);
        b(linkedHashMap, "categorySlug", str2);
        b(linkedHashMap, "limit", null);
        b(linkedHashMap, "fields", list != null ? C1110A.F(list, ",", null, null, null, 62) : null);
        return M.m(linkedHashMap);
    }

    public static void b(LinkedHashMap linkedHashMap, String str, Object obj) {
        if (obj != null) {
            linkedHashMap.put(str, obj);
        }
    }
}
