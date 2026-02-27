package c3;

import h2.i;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: c3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kj.d f9275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f9276b = null;

    public C1069a(Kj.d dVar) {
        this.f9275a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069a)) {
            return false;
        }
        C1069a c1069a = (C1069a) obj;
        return this.f9275a.equals(c1069a.f9275a) && j.b(this.f9276b, c1069a.f9276b);
    }

    public final int hashCode() {
        int iHashCode = this.f9275a.hashCode() * 31;
        i iVar = this.f9276b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f9275a + ", subscriber=" + this.f9276b + ')';
    }
}
