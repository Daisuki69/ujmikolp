package yf;

import We.s;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends l {
    public static final i[] c = new i[357];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21163d = m(0);
    public static final i e;
    public static final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f21164g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21166b;

    static {
        m(1L);
        m(2L);
        e = m(3L);
        f = new i(Long.MAX_VALUE, false);
        f21164g = new i(Long.MIN_VALUE, false);
    }

    public i(long j, boolean z4) {
        this.f21165a = j;
        this.f21166b = z4;
    }

    public static i m(long j) {
        if (-100 > j || j > 256) {
            return new i(j, true);
        }
        int i = ((int) j) + 100;
        i[] iVarArr = c;
        if (iVarArr[i] == null) {
            iVarArr[i] = new i(j, true);
        }
        return iVarArr[i];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((int) ((i) obj).f21165a) == ((int) this.f21165a);
    }

    @Override // yf.l
    public final float f() {
        return this.f21165a;
    }

    public final int hashCode() {
        long j = this.f21165a;
        return (int) (j ^ (j >> 32));
    }

    @Override // yf.l
    public final int i() {
        return (int) this.f21165a;
    }

    @Override // yf.l
    public final long k() {
        return this.f21165a;
    }

    public final String toString() {
        return s.h(this.f21165a, "}", new StringBuilder("COSInt{"));
    }
}
