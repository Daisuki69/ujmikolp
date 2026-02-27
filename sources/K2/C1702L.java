package k2;

/* JADX INFO: renamed from: k2.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1702L extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17868b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17869d;
    public final String e;
    public final String f;

    public C1702L(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f17867a = str;
        this.f17868b = str2;
        this.c = str3;
        this.f17869d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f17867a.equals(((C1702L) w0Var).f17867a)) {
                C1702L c1702l = (C1702L) w0Var;
                if (this.f17868b.equals(c1702l.f17868b)) {
                    String str = c1702l.c;
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = c1702l.f17869d;
                        String str4 = this.f17869d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
                            String str5 = c1702l.e;
                            String str6 = this.e;
                            if (str6 != null ? str6.equals(str5) : str5 == null) {
                                String str7 = c1702l.f;
                                String str8 = this.f;
                                if (str8 != null ? str8.equals(str7) : str7 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17867a.hashCode() ^ 1000003) * 1000003) ^ this.f17868b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f17869d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f17867a);
        sb2.append(", version=");
        sb2.append(this.f17868b);
        sb2.append(", displayVersion=");
        sb2.append(this.c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f17869d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.e);
        sb2.append(", developmentPlatformVersion=");
        return We.s.p(sb2, this.f, "}");
    }
}
