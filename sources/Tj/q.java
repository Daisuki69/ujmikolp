package Tj;

import java.util.List;
import java.util.Set;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Rj.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rj.d f5884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5885b;
    public final Set c;

    public q(Rj.d original) {
        kotlin.jvm.internal.j.g(original, "original");
        this.f5884a = original;
        this.f5885b = original.h() + '?';
        this.c = m.a(original);
    }

    @Override // Tj.b
    public final Set a() {
        return this.c;
    }

    @Override // Rj.d
    public final boolean b() {
        return true;
    }

    @Override // Rj.d
    public final int c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        return this.f5884a.c(name);
    }

    @Override // Rj.d
    public final int d() {
        return this.f5884a.d();
    }

    @Override // Rj.d
    public final String e(int i) {
        return this.f5884a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return kotlin.jvm.internal.j.b(this.f5884a, ((q) obj).f5884a);
        }
        return false;
    }

    @Override // Rj.d
    public final List f(int i) {
        return this.f5884a.f(i);
    }

    @Override // Rj.d
    public final Rj.d g(int i) {
        return this.f5884a.g(i);
    }

    @Override // Rj.d
    public final List getAnnotations() {
        return this.f5884a.getAnnotations();
    }

    @Override // Rj.d
    public final AbstractC1955a getKind() {
        return this.f5884a.getKind();
    }

    @Override // Rj.d
    public final String h() {
        return this.f5885b;
    }

    public final int hashCode() {
        return this.f5884a.hashCode() * 31;
    }

    @Override // Rj.d
    public final boolean i(int i) {
        return this.f5884a.i(i);
    }

    @Override // Rj.d
    public final boolean isInline() {
        return this.f5884a.isInline();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5884a);
        sb2.append('?');
        return sb2.toString();
    }
}
