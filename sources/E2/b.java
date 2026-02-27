package E2;

import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1242b;
    public final int c;

    public b(String str, long j, int i) {
        this.f1241a = str;
        this.f1242b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f1241a;
        if (str == null) {
            if (bVar.f1241a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f1241a)) {
            return false;
        }
        if (this.f1242b != bVar.f1242b) {
            return false;
        }
        int i = bVar.c;
        int i4 = this.c;
        return i4 == 0 ? i == 0 : AbstractC2217b.b(i4, i);
    }

    public final int hashCode() {
        String str = this.f1241a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f1242b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i4 = this.c;
        return (i4 != 0 ? AbstractC2217b.c(i4) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f1241a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f1242b);
        sb2.append(", responseCode=");
        int i = this.c;
        sb2.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb2.append("}");
        return sb2.toString();
    }
}
