package e5;

import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: e5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1429b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("data")
    private final c f16602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("meta")
    private final d f16603b;

    public final c a() {
        return this.f16602a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1429b)) {
            return false;
        }
        C1429b c1429b = (C1429b) obj;
        return j.b(this.f16602a, c1429b.f16602a) && j.b(this.f16603b, c1429b.f16603b);
    }

    public final int hashCode() {
        return this.f16603b.hashCode() + (this.f16602a.hashCode() * 31);
    }

    public final String toString() {
        return "UserTagResponseAttrs(data=" + this.f16602a + ", meta=" + this.f16603b + ")";
    }
}
