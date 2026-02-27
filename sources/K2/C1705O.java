package k2;

/* JADX INFO: renamed from: k2.O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1705O extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17875b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17876d;
    public final long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17877g;
    public final String h;
    public final String i;

    public C1705O(int i, String str, int i4, long j, long j6, boolean z4, int i6, String str2, String str3) {
        this.f17874a = i;
        this.f17875b = str;
        this.c = i4;
        this.f17876d = j;
        this.e = j6;
        this.f = z4;
        this.f17877g = i6;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (this.f17874a == ((C1705O) x0Var).f17874a) {
                C1705O c1705o = (C1705O) x0Var;
                if (this.f17875b.equals(c1705o.f17875b) && this.c == c1705o.c && this.f17876d == c1705o.f17876d && this.e == c1705o.e && this.f == c1705o.f && this.f17877g == c1705o.f17877g && this.h.equals(c1705o.h) && this.i.equals(c1705o.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f17874a ^ 1000003) * 1000003) ^ this.f17875b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.f17876d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j6 = this.e;
        return ((((((((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.f17877g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f17874a);
        sb2.append(", model=");
        sb2.append(this.f17875b);
        sb2.append(", cores=");
        sb2.append(this.c);
        sb2.append(", ram=");
        sb2.append(this.f17876d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f);
        sb2.append(", state=");
        sb2.append(this.f17877g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return We.s.p(sb2, this.i, "}");
    }
}
