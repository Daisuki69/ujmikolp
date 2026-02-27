package cj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class M extends L {
    public static Map e() {
        C1113D c1113d = C1113D.f9378a;
        kotlin.jvm.internal.j.e(c1113d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1113d;
    }

    public static Object f(Map map, Object obj) {
        kotlin.jvm.internal.j.g(map, "<this>");
        if (map instanceof O) {
            O o8 = (O) map;
            LinkedHashMap linkedHashMap = o8.f9382a;
            Object obj2 = linkedHashMap.get(obj);
            if (obj2 != null || linkedHashMap.containsKey(obj)) {
                return obj2;
            }
            o8.f9383b.invoke(obj);
            return Boolean.FALSE;
        }
        Object obj3 = map.get(obj);
        if (obj3 != null || map.containsKey(obj)) {
            return obj3;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap g(Pair... pairArr) {
        HashMap map = new HashMap(L.b(pairArr.length));
        k(map, pairArr);
        return map;
    }

    public static Map h(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return e();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(pairArr.length));
        k(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap i(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(L.b(pairArr.length));
        k(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static Map j(Map map, Pair pair) {
        kotlin.jvm.internal.j.g(map, "<this>");
        kotlin.jvm.internal.j.g(pair, "pair");
        if (map.isEmpty()) {
            return L.c(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.f18160a, pair.f18161b);
        return linkedHashMap;
    }

    public static final void k(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.f18160a, pair.f18161b);
        }
    }

    public static Map l(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            n(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : L.d(linkedHashMap) : e();
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return e();
        }
        if (size2 == 1) {
            return L.c((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.b(collection.size()));
        n(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static Map m(Map map) {
        kotlin.jvm.internal.j.g(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? o(map) : L.d(map) : e();
    }

    public static final void n(Iterable iterable, LinkedHashMap linkedHashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f18160a, pair.f18161b);
        }
    }

    public static LinkedHashMap o(Map map) {
        kotlin.jvm.internal.j.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}
