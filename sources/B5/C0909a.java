package b5;

import We.s;
import defpackage.AbstractC1414e;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0909a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8515b;
    public final String c;

    public C0909a(int i, String description, String str) {
        kotlin.jvm.internal.j.g(description, "description");
        this.f8514a = i;
        this.f8515b = description;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0909a)) {
            return false;
        }
        C0909a c0909a = (C0909a) obj;
        return this.f8514a == c0909a.f8514a && kotlin.jvm.internal.j.b(this.f8515b, c0909a.f8515b) && kotlin.jvm.internal.j.b(this.c, c0909a.c);
    }

    public final int hashCode() {
        int iC = AbstractC1414e.c(this.f8514a * 31, 31, this.f8515b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdKitError(code=");
        sb2.append(this.f8514a);
        sb2.append(", description=");
        sb2.append(this.f8515b);
        sb2.append(", reason=");
        return s.p(sb2, this.c, ")");
    }
}
