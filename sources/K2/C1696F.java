package k2;

/* JADX INFO: renamed from: k2.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1696F extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17848b;
    public final String c;

    public C1696F(String str, String str2, String str3) {
        this.f17847a = str;
        this.f17848b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f17847a.equals(((C1696F) q0Var).f17847a)) {
                C1696F c1696f = (C1696F) q0Var;
                if (this.f17848b.equals(c1696f.f17848b) && this.c.equals(c1696f.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17847a.hashCode() ^ 1000003) * 1000003) ^ this.f17848b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f17847a);
        sb2.append(", libraryName=");
        sb2.append(this.f17848b);
        sb2.append(", buildId=");
        return We.s.p(sb2, this.c, "}");
    }
}
