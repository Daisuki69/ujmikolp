package b3;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8466b;
    public final long c;

    public /* synthetic */ h0(long j, long j6, int i, long j7) {
        if (1 != (i & 1)) {
            Tj.m.d(i, 1, f0.f8457a.d());
            throw null;
        }
        this.f8465a = j;
        this.f8466b = (i & 2) == 0 ? ((long) 1000) * j : j6;
        if ((i & 4) == 0) {
            this.c = j / ((long) 1000);
        } else {
            this.c = j7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && this.f8465a == ((h0) obj).f8465a;
    }

    public final int hashCode() {
        long j = this.f8465a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f8465a + ')';
    }

    public h0(long j) {
        this.f8465a = j;
        long j6 = 1000;
        this.f8466b = j * j6;
        this.c = j / j6;
    }
}
