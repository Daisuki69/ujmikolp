package Tj;

import cj.C1112C;
import java.util.List;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Rj.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rj.c f5883b;

    public p(String str, Rj.c kind) {
        kotlin.jvm.internal.j.g(kind, "kind");
        this.f5882a = str;
        this.f5883b = kind;
    }

    @Override // Rj.d
    public final boolean b() {
        return false;
    }

    @Override // Rj.d
    public final int c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Rj.d
    public final int d() {
        return 0;
    }

    @Override // Rj.d
    public final String e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.j.b(this.f5882a, pVar.f5882a)) {
            if (kotlin.jvm.internal.j.b(this.f5883b, pVar.f5883b)) {
                return true;
            }
        }
        return false;
    }

    @Override // Rj.d
    public final List f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Rj.d
    public final Rj.d g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Rj.d
    public final List getAnnotations() {
        return C1112C.f9377a;
    }

    @Override // Rj.d
    public final AbstractC1955a getKind() {
        return this.f5883b;
    }

    @Override // Rj.d
    public final String h() {
        return this.f5882a;
    }

    public final int hashCode() {
        return (this.f5883b.hashCode() * 31) + this.f5882a.hashCode();
    }

    @Override // Rj.d
    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Rj.d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return androidx.camera.core.impl.a.n(new StringBuilder("PrimitiveDescriptor("), this.f5882a, ')');
    }
}
