package com.paymaya.common.utility;

import d2.C1328c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f10412a = new LinkedHashSet();

    public static void a(String str, String message) {
        kotlin.jvm.internal.j.g(message, "message");
        C1328c c1328cA = C1328c.a();
        String strJ = androidx.camera.core.impl.a.j(str, " - ", message);
        h2.q qVar = c1328cA.f16255a;
        qVar.f16905p.f17092a.a(new h2.n(qVar, System.currentTimeMillis() - qVar.f16899d, strJ, 1));
    }

    public static void b(Throwable throwable, Map map) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        C1328c c1328cA = C1328c.a();
        LinkedHashSet linkedHashSet = f10412a;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            c1328cA.c((String) it.next(), "");
        }
        linkedHashSet.clear();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                linkedHashSet.add(str);
                if (value != null) {
                    if (value instanceof String) {
                        c1328cA.c(str, (String) value);
                    } else {
                        boolean z4 = value instanceof Boolean;
                        h2.q qVar = c1328cA.f16255a;
                        if (z4) {
                            qVar.e(str, Boolean.toString(((Boolean) value).booleanValue()));
                        } else if (value instanceof Double) {
                            qVar.e(str, Double.toString(((Number) value).doubleValue()));
                        } else if (value instanceof Float) {
                            qVar.e(str, Float.toString(((Number) value).floatValue()));
                        } else if (value instanceof Integer) {
                            qVar.e(str, Integer.toString(((Number) value).intValue()));
                        } else if (value instanceof Long) {
                            qVar.e(str, Long.toString(((Number) value).longValue()));
                        } else {
                            c1328cA.c(str, value.toString());
                        }
                    }
                }
            }
        }
        c1328cA.b(throwable);
    }
}
