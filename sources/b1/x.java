package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f8345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f8346b;

    public x(J j, I i) {
        this.f8345a = j;
        this.f8346b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k8 = (K) obj;
            J j = this.f8345a;
            if (j != null ? j.equals(((x) k8).f8345a) : ((x) k8).f8345a == null) {
                I i = this.f8346b;
                if (i != null ? i.equals(((x) k8).f8346b) : ((x) k8).f8346b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        J j = this.f8345a;
        int iHashCode = ((j == null ? 0 : j.hashCode()) ^ 1000003) * 1000003;
        I i = this.f8346b;
        return (i != null ? i.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8345a + ", mobileSubtype=" + this.f8346b + "}";
    }
}
