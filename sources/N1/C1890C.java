package n1;

/* JADX INFO: renamed from: n1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1890C {
    public static final C1890C c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18551b;

    static {
        C1890C c1890c = new C1890C(0L, 0L);
        new C1890C(Long.MAX_VALUE, Long.MAX_VALUE);
        new C1890C(Long.MAX_VALUE, 0L);
        new C1890C(0L, Long.MAX_VALUE);
        c = c1890c;
    }

    public C1890C(long j, long j6) {
        Xh.i.e(j >= 0);
        Xh.i.e(j6 >= 0);
        this.f18550a = j;
        this.f18551b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1890C.class == obj.getClass()) {
            C1890C c1890c = (C1890C) obj;
            if (this.f18550a == c1890c.f18550a && this.f18551b == c1890c.f18551b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18550a) * 31) + ((int) this.f18551b);
    }
}
