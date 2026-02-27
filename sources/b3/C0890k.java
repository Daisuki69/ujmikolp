package b3;

/* JADX INFO: renamed from: b3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0890k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0889j f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0889j f8481b;
    public final double c;

    public C0890k(EnumC0889j enumC0889j, EnumC0889j enumC0889j2, double d10) {
        this.f8480a = enumC0889j;
        this.f8481b = enumC0889j2;
        this.c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0890k)) {
            return false;
        }
        C0890k c0890k = (C0890k) obj;
        return this.f8480a == c0890k.f8480a && this.f8481b == c0890k.f8481b && Double.compare(this.c, c0890k.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f8481b.hashCode() + (this.f8480a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f8480a + ", crashlytics=" + this.f8481b + ", sessionSamplingRate=" + this.c + ')';
    }
}
