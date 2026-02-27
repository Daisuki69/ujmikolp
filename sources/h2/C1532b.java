package h2;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1532b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16856b;
    public final String c;

    public C1532b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f16855a = str;
        this.f16856b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1532b) {
            C1532b c1532b = (C1532b) obj;
            if (this.f16855a.equals(c1532b.f16855a)) {
                String str = c1532b.f16856b;
                String str2 = this.f16856b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c1532b.c;
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f16855a.hashCode() ^ 1000003) * 1000003;
        String str = this.f16856b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f16855a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f16856b);
        sb2.append(", firebaseAuthenticationToken=");
        return We.s.p(sb2, this.c, "}");
    }
}
