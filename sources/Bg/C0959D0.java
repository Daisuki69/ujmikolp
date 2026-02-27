package bg;

import ag.C0703m;

/* JADX INFO: renamed from: bg.D0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0959D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0703m f8723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8724b;

    public C0959D0(C0703m c0703m, long j) {
        this.f8723a = c0703m;
        this.f8724b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959D0)) {
            return false;
        }
        C0959D0 c0959d0 = (C0959D0) obj;
        return kotlin.jvm.internal.j.b(this.f8723a, c0959d0.f8723a) && this.f8724b == c0959d0.f8724b;
    }

    public final int hashCode() {
        C0703m c0703m = this.f8723a;
        int iHashCode = c0703m != null ? c0703m.hashCode() : 0;
        long j = this.f8724b;
        return ((int) (j ^ (j >>> 32))) + (iHashCode * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackgroundExtractorWrapper(conf=");
        sb2.append(this.f8723a);
        sb2.append(", startedAt=");
        return We.s.h(this.f8724b, ")", sb2);
    }
}
