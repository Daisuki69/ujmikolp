package k2;

/* JADX INFO: renamed from: k2.U, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1710U extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17894b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17895d;

    public C1710U(String str, String str2, long j, long j6) {
        this.f17893a = j;
        this.f17894b = j6;
        this.c = str;
        this.f17895d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y0 y0Var = (y0) obj;
            if (this.f17893a == ((C1710U) y0Var).f17893a) {
                C1710U c1710u = (C1710U) y0Var;
                if (this.f17894b == c1710u.f17894b && this.c.equals(c1710u.c)) {
                    String str = c1710u.f17895d;
                    String str2 = this.f17895d;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17893a;
        long j6 = this.f17894b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f17895d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f17893a);
        sb2.append(", size=");
        sb2.append(this.f17894b);
        sb2.append(", name=");
        sb2.append(this.c);
        sb2.append(", uuid=");
        return We.s.p(sb2, this.f17895d, "}");
    }
}
