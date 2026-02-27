package k2;

/* JADX INFO: renamed from: k2.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1712W extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17900b;
    public final long c;

    public C1712W(String str, String str2, long j) {
        this.f17899a = str;
        this.f17900b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f17899a.equals(((C1712W) a02).f17899a)) {
                C1712W c1712w = (C1712W) a02;
                if (this.f17900b.equals(c1712w.f17900b) && this.c == c1712w.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f17899a.hashCode() ^ 1000003) * 1000003) ^ this.f17900b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f17899a);
        sb2.append(", code=");
        sb2.append(this.f17900b);
        sb2.append(", address=");
        return We.s.h(this.c, "}", sb2);
    }
}
