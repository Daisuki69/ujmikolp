package cj;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import rj.InterfaceC2210a;
import rj.InterfaceC2213d;

/* JADX INFO: loaded from: classes4.dex */
public class G {
    public static Map a(F f) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = f.b();
        while (itB.hasNext()) {
            Object objA = f.a(itB.next());
            Object wVar = linkedHashMap.get(objA);
            if (wVar == null && !linkedHashMap.containsKey(objA)) {
                wVar = new kotlin.jvm.internal.w();
            }
            kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) wVar;
            wVar2.f18193a++;
            linkedHashMap.put(objA, wVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.j.e(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            if ((entry instanceof InterfaceC2210a) && !(entry instanceof InterfaceC2213d)) {
                kotlin.jvm.internal.D.g(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((kotlin.jvm.internal.w) entry.getValue()).f18193a));
        }
        return kotlin.jvm.internal.D.c(linkedHashMap);
    }
}
