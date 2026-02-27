package Ng;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f4440d = new u("HTTP", 2, 0);
    public static final u e = new u("HTTP", 1, 1);
    public static final u f = new u("HTTP", 1, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f4441g = new u("SPDY", 3, 0);
    public static final u h = new u("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4443b;
    public final int c;

    public u(String str, int i, int i4) {
        this.f4442a = str;
        this.f4443b = i;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.j.b(this.f4442a, uVar.f4442a) && this.f4443b == uVar.f4443b && this.c == uVar.c;
    }

    public final int hashCode() {
        return (((this.f4442a.hashCode() * 31) + this.f4443b) * 31) + this.c;
    }

    public final String toString() {
        return this.f4442a + '/' + this.f4443b + '.' + this.c;
    }
}
