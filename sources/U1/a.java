package U1;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5893b;
    public final long c;

    public a(long j, long j6, long j7) {
        this.f5892a = j;
        this.f5893b = j6;
        this.c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5892a == aVar.f5892a && this.f5893b == aVar.f5893b && this.c == aVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5892a;
        long j6 = this.f5893b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.c;
        return i ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f5892a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f5893b);
        sb2.append(", uptimeMillis=");
        return s.h(this.c, "}", sb2);
    }
}
