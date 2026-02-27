package ej;

import java.util.Comparator;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: ej.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C1450b implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1450b f16682a = new C1450b();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> a8 = comparable;
        Comparable<? super Object> b8 = comparable2;
        j.g(a8, "a");
        j.g(b8, "b");
        return a8.compareTo(b8);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C1451c.f16683a;
    }
}
