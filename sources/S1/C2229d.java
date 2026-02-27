package s1;

/* JADX INFO: renamed from: s1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2229d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19997b = -1;
    public final int c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19998d = -1;
    public final int e = -1;

    public C2229d(Object obj) {
        this.f19996a = obj;
    }

    public final boolean a() {
        return this.f19997b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2229d)) {
            return false;
        }
        C2229d c2229d = (C2229d) obj;
        return this.f19996a.equals(c2229d.f19996a) && this.f19997b == c2229d.f19997b && this.c == c2229d.c && this.f19998d == c2229d.f19998d && this.e == c2229d.e;
    }

    public final int hashCode() {
        return ((((((((this.f19996a.hashCode() + 527) * 31) + this.f19997b) * 31) + this.c) * 31) + ((int) this.f19998d)) * 31) + this.e;
    }
}
