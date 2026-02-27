package bg;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9135b;

    public w0(double d10, double d11) {
        this.f9134a = d10;
        this.f9135b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Double.compare(this.f9134a, w0Var.f9134a) == 0 && Double.compare(this.f9135b, w0Var.f9135b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f9134a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f9135b);
        return ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2)) + i;
    }

    public final String toString() {
        return "Location(latitude=" + this.f9134a + ", longitude=" + this.f9135b + ")";
    }
}
