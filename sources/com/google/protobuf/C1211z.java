package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1211z extends B {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.google.protobuf.B
    public final void a(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) o0.c.i(obj, j);
        if (list instanceof InterfaceC1210y) {
            objUnmodifiableList = ((InterfaceC1210y) list).getUnmodifiableView();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof S) && (list instanceof InterfaceC1206u)) {
                AbstractC1188b abstractC1188b = (AbstractC1188b) ((InterfaceC1206u) list);
                boolean z4 = abstractC1188b.f10078a;
                if (z4 && z4) {
                    abstractC1188b.f10078a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        o0.o(obj, j, objUnmodifiableList);
    }

    @Override // com.google.protobuf.B
    public final void b(Object obj, Object obj2, long j) {
        List list;
        List list2;
        n0 n0Var = o0.c;
        List list3 = (List) n0Var.i(obj2, j);
        int size = list3.size();
        List list4 = (List) n0Var.i(obj, j);
        if (list4.isEmpty()) {
            List c1209x = list4 instanceof InterfaceC1210y ? new C1209x(size) : ((list4 instanceof S) && (list4 instanceof InterfaceC1206u)) ? ((InterfaceC1206u) list4).mutableCopyWithCapacity(size) : new ArrayList(size);
            o0.o(obj, j, c1209x);
            list2 = c1209x;
        } else {
            if (c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size);
                arrayList.addAll(list4);
                o0.o(obj, j, arrayList);
                list = arrayList;
            } else if (list4 instanceof j0) {
                C1209x c1209x2 = new C1209x(list4.size() + size);
                c1209x2.addAll((j0) list4);
                o0.o(obj, j, c1209x2);
                list = c1209x2;
            } else {
                boolean z4 = list4 instanceof S;
                list2 = list4;
                if (z4) {
                    boolean z5 = list4 instanceof InterfaceC1206u;
                    list2 = list4;
                    if (z5) {
                        InterfaceC1206u interfaceC1206u = (InterfaceC1206u) list4;
                        list2 = list4;
                        if (!((AbstractC1188b) interfaceC1206u).f10078a) {
                            InterfaceC1206u interfaceC1206uMutableCopyWithCapacity = interfaceC1206u.mutableCopyWithCapacity(list4.size() + size);
                            o0.o(obj, j, interfaceC1206uMutableCopyWithCapacity);
                            list2 = interfaceC1206uMutableCopyWithCapacity;
                        }
                    }
                }
            }
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = list3.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list3);
        }
        if (size2 > 0) {
            list3 = list2;
        }
        o0.o(obj, j, list3);
    }
}
