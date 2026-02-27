package cj;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class L extends K {
    public static int b(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map c(Pair pair) {
        kotlin.jvm.internal.j.g(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f18160a, pair.f18161b);
        kotlin.jvm.internal.j.f(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map d(Map map) {
        kotlin.jvm.internal.j.g(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.j.f(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
