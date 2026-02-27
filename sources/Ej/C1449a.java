package ej;

import java.util.Comparator;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ej.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1449a {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Comparator b() {
        C1450b c1450b = C1450b.f16682a;
        j.e(c1450b, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c1450b;
    }
}
