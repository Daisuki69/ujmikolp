package bg;

/* JADX INFO: renamed from: bg.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0994d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8940b;
    public final long c;

    public C0994d0(String str, long j, long j6) {
        this.f8939a = str;
        this.f8940b = j;
        this.c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0994d0)) {
            return false;
        }
        C0994d0 c0994d0 = (C0994d0) obj;
        return kotlin.jvm.internal.j.b(this.f8939a, c0994d0.f8939a) && this.f8940b == c0994d0.f8940b && this.c == c0994d0.c;
    }

    public final int hashCode() {
        String str = this.f8939a;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.f8940b;
        int i = (((int) (j ^ (j >>> 32))) + (iHashCode * 31)) * 31;
        long j6 = this.c;
        return ((int) ((j6 >>> 32) ^ j6)) + i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtractorsPerformanceItem(name=");
        sb2.append(this.f8939a);
        sb2.append(", startedAt=");
        sb2.append(this.f8940b);
        sb2.append(", endedAt=");
        return We.s.h(this.c, ")", sb2);
    }
}
