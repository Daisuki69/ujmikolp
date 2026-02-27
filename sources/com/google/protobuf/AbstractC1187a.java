package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1187a {
    protected int memoizedHashCode;

    public static void g(List list, List list2) {
        Charset charset = AbstractC1207v.f10124a;
        list.getClass();
        if (list instanceof InterfaceC1210y) {
            List underlyingElements = ((InterfaceC1210y) list).getUnderlyingElements();
            InterfaceC1210y interfaceC1210y = (InterfaceC1210y) list2;
            int size = list2.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC1210y.size() - size) + " is null.";
                    for (int size2 = interfaceC1210y.size() - 1; size2 >= size; size2--) {
                        interfaceC1210y.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof C1192f) {
                    interfaceC1210y.b((C1192f) obj);
                } else {
                    interfaceC1210y.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof S) {
            list2.addAll(list);
            return;
        }
        if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size3 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list2.size() - size3) + " is null.";
                for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                    list2.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list2.add(obj2);
        }
    }

    public abstract int h(W w6);

    public abstract void i(C1193g c1193g);
}
