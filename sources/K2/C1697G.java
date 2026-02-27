package k2;

/* JADX INFO: renamed from: k2.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1697G extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17850b;

    public C1697G(String str, String str2) {
        this.f17849a = str;
        this.f17850b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f17849a.equals(((C1697G) s0Var).f17849a) && this.f17850b.equals(((C1697G) s0Var).f17850b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17849a.hashCode() ^ 1000003) * 1000003) ^ this.f17850b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f17849a);
        sb2.append(", value=");
        return We.s.p(sb2, this.f17850b, "}");
    }
}
