package k2;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17907b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17908d;
    public final int e;

    public Z(String str, int i, long j, long j6, String str2) {
        this.f17906a = j;
        this.f17907b = str;
        this.c = str2;
        this.f17908d = j6;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B0) {
            B0 b02 = (B0) obj;
            if (this.f17906a == ((Z) b02).f17906a) {
                Z z4 = (Z) b02;
                if (this.f17907b.equals(z4.f17907b)) {
                    String str = z4.c;
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f17908d == z4.f17908d && this.e == z4.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17906a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17907b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f17908d;
        return ((iHashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f17906a);
        sb2.append(", symbol=");
        sb2.append(this.f17907b);
        sb2.append(", file=");
        sb2.append(this.c);
        sb2.append(", offset=");
        sb2.append(this.f17908d);
        sb2.append(", importance=");
        return We.s.o(sb2, "}", this.e);
    }
}
