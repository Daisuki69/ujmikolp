package b5;

/* JADX INFO: renamed from: b5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0920l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0909a f8533a;

    public C0920l(C0909a c0909a) {
        this.f8533a = c0909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0920l) && kotlin.jvm.internal.j.b(this.f8533a, ((C0920l) obj).f8533a);
    }

    public final int hashCode() {
        return this.f8533a.hashCode();
    }

    public final String toString() {
        return "Failure(adKitError=" + this.f8533a + ")";
    }
}
