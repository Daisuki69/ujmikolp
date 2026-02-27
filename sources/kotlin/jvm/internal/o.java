package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements InterfaceC1789d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18190a;

    public o(Class jClass) {
        j.g(jClass, "jClass");
        this.f18190a = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC1789d
    public final Class a() {
        return this.f18190a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return j.b(this.f18190a, ((o) obj).f18190a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18190a.hashCode();
    }

    public final String toString() {
        return this.f18190a + " (Kotlin reflection is not available)";
    }
}
