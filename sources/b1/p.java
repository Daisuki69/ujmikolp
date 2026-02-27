package b1;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8328a;

    public p(s sVar) {
        B b8 = B.f8283a;
        this.f8328a = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        if (!this.f8328a.equals(((p) c).f8328a)) {
            return false;
        }
        Object obj2 = B.f8283a;
        ((p) c).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f8328a.hashCode() ^ 1000003) * 1000003) ^ B.f8283a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f8328a + ", productIdOrigin=" + B.f8283a + "}";
    }
}
