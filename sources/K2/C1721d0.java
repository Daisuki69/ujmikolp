package k2;

/* JADX INFO: renamed from: k2.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1721d0 extends G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f17934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17935b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17936d;
    public final long e;
    public final long f;

    public C1721d0(Double d10, int i, boolean z4, int i4, long j, long j6) {
        this.f17934a = d10;
        this.f17935b = i;
        this.c = z4;
        this.f17936d = i4;
        this.e = j;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            G0 g02 = (G0) obj;
            Double d10 = this.f17934a;
            if (d10 != null ? d10.equals(((C1721d0) g02).f17934a) : ((C1721d0) g02).f17934a == null) {
                if (this.f17935b == ((C1721d0) g02).f17935b) {
                    C1721d0 c1721d0 = (C1721d0) g02;
                    if (this.c == c1721d0.c && this.f17936d == c1721d0.f17936d && this.e == c1721d0.e && this.f == c1721d0.f) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f17934a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f17935b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.f17936d) * 1000003;
        long j = this.e;
        long j6 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f17934a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f17935b);
        sb2.append(", proximityOn=");
        sb2.append(this.c);
        sb2.append(", orientation=");
        sb2.append(this.f17936d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return We.s.h(this.f, "}", sb2);
    }
}
