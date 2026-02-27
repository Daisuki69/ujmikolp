package b1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8342b;
    public final o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f8343d;
    public final String e;
    public final ArrayList f;

    public v(long j, long j6, o oVar, Integer num, String str, ArrayList arrayList) {
        L l6 = L.f8289a;
        this.f8341a = j;
        this.f8342b = j6;
        this.c = oVar;
        this.f8343d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        v vVar = (v) ((H) obj);
        if (this.f8341a != vVar.f8341a) {
            return false;
        }
        if (this.f8342b != vVar.f8342b) {
            return false;
        }
        if (!this.c.equals(vVar.c)) {
            return false;
        }
        Integer num = vVar.f8343d;
        Integer num2 = this.f8343d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = vVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(vVar.f)) {
            return false;
        }
        Object obj2 = L.f8289a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f8341a;
        long j6 = this.f8342b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.f8343d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ L.f8289a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f8341a + ", requestUptimeMs=" + this.f8342b + ", clientInfo=" + this.c + ", logSource=" + this.f8343d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + L.f8289a + "}";
    }
}
