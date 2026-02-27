package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1711V extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17897b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f17898d;
    public final int e;

    public C1711V(String str, String str2, List list, z0 z0Var, int i) {
        this.f17896a = str;
        this.f17897b = str2;
        this.c = list;
        this.f17898d = z0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (this.f17896a.equals(((C1711V) z0Var).f17896a) && ((str = this.f17897b) != null ? str.equals(((C1711V) z0Var).f17897b) : ((C1711V) z0Var).f17897b == null)) {
                C1711V c1711v = (C1711V) z0Var;
                if (this.c.equals(c1711v.c)) {
                    z0 z0Var2 = c1711v.f17898d;
                    z0 z0Var3 = this.f17898d;
                    if (z0Var3 != null ? z0Var3.equals(z0Var2) : z0Var2 == null) {
                        if (this.e == c1711v.e) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17896a.hashCode() ^ 1000003) * 1000003;
        String str = this.f17897b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        z0 z0Var = this.f17898d;
        return ((iHashCode2 ^ (z0Var != null ? z0Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f17896a);
        sb2.append(", reason=");
        sb2.append(this.f17897b);
        sb2.append(", frames=");
        sb2.append(this.c);
        sb2.append(", causedBy=");
        sb2.append(this.f17898d);
        sb2.append(", overflowCount=");
        return We.s.o(sb2, "}", this.e);
    }
}
