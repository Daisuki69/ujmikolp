package b2;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f8360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8361b;

    public g(n nVar, boolean z4) {
        this.f8360a = nVar;
        this.f8361b = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f8360a.equals(this.f8360a) && gVar.f8361b == this.f8361b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f8360a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8361b).hashCode();
    }
}
