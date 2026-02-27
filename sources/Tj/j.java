package Tj;

import We.s;
import cj.C1112C;
import java.util.List;
import o1.AbstractC1955a;
import zj.y;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Rj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rj.d f5867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rj.d f5868b;

    public j(Rj.d keyDesc, Rj.d valueDesc) {
        kotlin.jvm.internal.j.g(keyDesc, "keyDesc");
        kotlin.jvm.internal.j.g(valueDesc, "valueDesc");
        this.f5867a = keyDesc;
        this.f5868b = valueDesc;
    }

    @Override // Rj.d
    public final boolean b() {
        return false;
    }

    @Override // Rj.d
    public final int c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        Integer numF = y.f(name);
        if (numF != null) {
            return numF.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // Rj.d
    public final int d() {
        return 2;
    }

    @Override // Rj.d
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        jVar.getClass();
        return kotlin.jvm.internal.j.b(this.f5867a, jVar.f5867a) && kotlin.jvm.internal.j.b(this.f5868b, jVar.f5868b);
    }

    @Override // Rj.d
    public final List f(int i) {
        if (i >= 0) {
            return C1112C.f9377a;
        }
        throw new IllegalArgumentException(s.g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // Rj.d
    public final Rj.d g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(s.g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
        }
        int i4 = i % 2;
        if (i4 == 0) {
            return this.f5867a;
        }
        if (i4 == 1) {
            return this.f5868b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // Rj.d
    public final List getAnnotations() {
        return C1112C.f9377a;
    }

    @Override // Rj.d
    public final AbstractC1955a getKind() {
        return Rj.i.e;
    }

    @Override // Rj.d
    public final String h() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final int hashCode() {
        return this.f5868b.hashCode() + ((this.f5867a.hashCode() + 710441009) * 31);
    }

    @Override // Rj.d
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(s.g(i, "Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices").toString());
    }

    @Override // Rj.d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f5867a + ", " + this.f5868b + ')';
    }
}
