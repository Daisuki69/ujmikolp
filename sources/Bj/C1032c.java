package bj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1032c implements Comparable<C1032c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9161b = new a(null);
    public static final C1032c c = new C1032c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9162a = 131348;

    /* JADX INFO: renamed from: bj.c$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1032c c1032c) {
        C1032c other = c1032c;
        kotlin.jvm.internal.j.g(other, "other");
        return this.f9162a - other.f9162a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1032c c1032c = obj instanceof C1032c ? (C1032c) obj : null;
        return c1032c != null && this.f9162a == c1032c.f9162a;
    }

    public final int hashCode() {
        return this.f9162a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
