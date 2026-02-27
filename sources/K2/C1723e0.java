package k2;

/* JADX INFO: renamed from: k2.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1723e0 extends H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17939a;

    public C1723e0(String str) {
        this.f17939a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        return this.f17939a.equals(((C1723e0) ((H0) obj)).f17939a);
    }

    public final int hashCode() {
        return this.f17939a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return We.s.p(new StringBuilder("Log{content="), this.f17939a, "}");
    }
}
