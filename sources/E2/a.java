package E2;

import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1239b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f1240d;
    public final int e;

    public a(String str, String str2, String str3, b bVar, int i) {
        this.f1238a = str;
        this.f1239b = str2;
        this.c = str3;
        this.f1240d = bVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f1238a;
        if (str == null) {
            if (aVar.f1238a != null) {
                return false;
            }
        } else if (!str.equals(aVar.f1238a)) {
            return false;
        }
        String str2 = this.f1239b;
        if (str2 == null) {
            if (aVar.f1239b != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f1239b)) {
            return false;
        }
        String str3 = this.c;
        if (str3 == null) {
            if (aVar.c != null) {
                return false;
            }
        } else if (!str3.equals(aVar.c)) {
            return false;
        }
        b bVar = this.f1240d;
        if (bVar == null) {
            if (aVar.f1240d != null) {
                return false;
            }
        } else if (!bVar.equals(aVar.f1240d)) {
            return false;
        }
        int i = this.e;
        return i == 0 ? aVar.e == 0 : AbstractC2217b.b(i, aVar.e);
    }

    public final int hashCode() {
        String str = this.f1238a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1239b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f1240d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? AbstractC2217b.c(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f1238a);
        sb2.append(", fid=");
        sb2.append(this.f1239b);
        sb2.append(", refreshToken=");
        sb2.append(this.c);
        sb2.append(", authToken=");
        sb2.append(this.f1240d);
        sb2.append(", responseCode=");
        int i = this.e;
        sb2.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
