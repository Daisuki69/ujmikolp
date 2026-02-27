package cj;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class S extends Q {
    public static LinkedHashSet d(Set set, Iterable elements) {
        kotlin.jvm.internal.j.g(set, "<this>");
        kotlin.jvm.internal.j.g(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.b(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        x.p(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet e(Set set, Object obj) {
        kotlin.jvm.internal.j.g(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(L.b(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
