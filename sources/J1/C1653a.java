package j1;

import We.s;

/* JADX INFO: renamed from: j1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1653a {
    public static final C1653a f = new C1653a(200, 10000, 10485760, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17657b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17658d;
    public final int e;

    public C1653a(int i, int i4, long j, long j6, int i6) {
        this.f17656a = j;
        this.f17657b = i;
        this.c = i4;
        this.f17658d = j6;
        this.e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1653a) {
            C1653a c1653a = (C1653a) obj;
            if (this.f17656a == c1653a.f17656a && this.f17657b == c1653a.f17657b && this.c == c1653a.c && this.f17658d == c1653a.f17658d && this.e == c1653a.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17656a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17657b) * 1000003) ^ this.c) * 1000003;
        long j6 = this.f17658d;
        return ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f17656a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f17657b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f17658d);
        sb2.append(", maxBlobByteSizePerRow=");
        return s.o(sb2, "}", this.e);
    }
}
