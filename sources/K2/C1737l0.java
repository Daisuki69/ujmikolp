package k2;

/* JADX INFO: renamed from: k2.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1737l0 extends N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17979a;

    public C1737l0(String str) {
        this.f17979a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        return this.f17979a.equals(((C1737l0) ((N0) obj)).f17979a);
    }

    public final int hashCode() {
        return this.f17979a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return We.s.p(new StringBuilder("User{identifier="), this.f17979a, "}");
    }
}
