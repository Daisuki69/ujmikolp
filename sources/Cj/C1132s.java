package cj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: cj.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1132s extends r {
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C1123i(objArr, true));
    }

    public static IntRange e(Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int f(List list) {
        kotlin.jvm.internal.j.g(list, "<this>");
        return list.size() - 1;
    }

    public static List g(Object... elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return elements.length > 0 ? C1127m.c(elements) : C1112C.f9377a;
    }

    public static ArrayList h(Object... elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1123i(elements, true));
    }

    public static final List i(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : r.c(list.get(0)) : C1112C.f9377a;
    }

    public static void j() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
