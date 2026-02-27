package k2;

/* JADX INFO: renamed from: k2.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1717b0 extends E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17920b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17921d;

    public C1717b0(String str, int i, int i4, boolean z4) {
        this.f17919a = str;
        this.f17920b = i;
        this.c = i4;
        this.f17921d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E0) {
            E0 e02 = (E0) obj;
            if (this.f17919a.equals(((C1717b0) e02).f17919a)) {
                C1717b0 c1717b0 = (C1717b0) e02;
                if (this.f17920b == c1717b0.f17920b && this.c == c1717b0.c && this.f17921d == c1717b0.f17921d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f17919a.hashCode() ^ 1000003) * 1000003) ^ this.f17920b) * 1000003) ^ this.c) * 1000003) ^ (this.f17921d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails{processName=");
        sb2.append(this.f17919a);
        sb2.append(", pid=");
        sb2.append(this.f17920b);
        sb2.append(", importance=");
        sb2.append(this.c);
        sb2.append(", defaultProcess=");
        return We.s.s(sb2, this.f17921d, "}");
    }
}
