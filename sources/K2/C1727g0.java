package k2;

/* JADX INFO: renamed from: k2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1727g0 extends J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1729h0 f17949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17950b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17951d;

    public C1727g0(C1729h0 c1729h0, String str, String str2, long j) {
        this.f17949a = c1729h0;
        this.f17950b = str;
        this.c = str2;
        this.f17951d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        C1727g0 c1727g0 = (C1727g0) ((J0) obj);
        if (this.f17949a.equals(c1727g0.f17949a)) {
            return this.f17950b.equals(c1727g0.f17950b) && this.c.equals(c1727g0.c) && this.f17951d == c1727g0.f17951d;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f17949a.hashCode() ^ 1000003) * 1000003) ^ this.f17950b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.f17951d;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f17949a);
        sb2.append(", parameterKey=");
        sb2.append(this.f17950b);
        sb2.append(", parameterValue=");
        sb2.append(this.c);
        sb2.append(", templateVersion=");
        return We.s.h(this.f17951d, "}", sb2);
    }
}
