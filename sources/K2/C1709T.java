package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.T, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1709T extends D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1711V f17891b;
    public final r0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1712W f17892d;
    public final List e;

    public C1709T(List list, C1711V c1711v, r0 r0Var, C1712W c1712w, List list2) {
        this.f17890a = list;
        this.f17891b = c1711v;
        this.c = r0Var;
        this.f17892d = c1712w;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        List list = this.f17890a;
        if (list == null) {
            if (((C1709T) d02).f17890a != null) {
                return false;
            }
        } else if (!list.equals(((C1709T) d02).f17890a)) {
            return false;
        }
        C1711V c1711v = this.f17891b;
        if (c1711v == null) {
            if (((C1709T) d02).f17891b != null) {
                return false;
            }
        } else if (!c1711v.equals(((C1709T) d02).f17891b)) {
            return false;
        }
        r0 r0Var = this.c;
        if (r0Var == null) {
            if (((C1709T) d02).c != null) {
                return false;
            }
        } else if (!r0Var.equals(((C1709T) d02).c)) {
            return false;
        }
        C1709T c1709t = (C1709T) d02;
        return this.f17892d.equals(c1709t.f17892d) && this.e.equals(c1709t.e);
    }

    public final int hashCode() {
        List list = this.f17890a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        C1711V c1711v = this.f17891b;
        int iHashCode2 = (iHashCode ^ (c1711v == null ? 0 : c1711v.hashCode())) * 1000003;
        r0 r0Var = this.c;
        return (((((r0Var != null ? r0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f17892d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Execution{threads=");
        sb2.append(this.f17890a);
        sb2.append(", exception=");
        sb2.append(this.f17891b);
        sb2.append(", appExitInfo=");
        sb2.append(this.c);
        sb2.append(", signal=");
        sb2.append(this.f17892d);
        sb2.append(", binaries=");
        return We.s.r(sb2, this.e, "}");
    }
}
