package k2;

import android.os.Build;

/* JADX INFO: renamed from: k2.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1743o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17995b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17996d;
    public final boolean e;
    public final int f;

    public C1743o0(int i, int i4, long j, long j6, boolean z4, int i6) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f17994a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f17995b = i4;
        this.c = j;
        this.f17996d = j6;
        this.e = z4;
        this.f = i6;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1743o0)) {
            return false;
        }
        C1743o0 c1743o0 = (C1743o0) obj;
        if (this.f17994a != c1743o0.f17994a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f17995b != c1743o0.f17995b || this.c != c1743o0.c || this.f17996d != c1743o0.f17996d || this.e != c1743o0.e || this.f != c1743o0.f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f17994a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f17995b) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.f17996d;
        return Build.PRODUCT.hashCode() ^ ((((((((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f17994a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f17995b);
        sb2.append(", totalRam=");
        sb2.append(this.c);
        sb2.append(", diskSpace=");
        sb2.append(this.f17996d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return We.s.p(sb2, Build.PRODUCT, "}");
    }
}
