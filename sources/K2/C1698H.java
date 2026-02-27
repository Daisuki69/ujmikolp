package k2;

import java.util.List;

/* JADX INFO: renamed from: k2.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1698H extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17852b;

    public C1698H(List list, String str) {
        this.f17851a = list;
        this.f17852b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            if (this.f17851a.equals(((C1698H) u0Var).f17851a) && ((str = this.f17852b) != null ? str.equals(((C1698H) u0Var).f17852b) : ((C1698H) u0Var).f17852b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f17851a.hashCode() ^ 1000003) * 1000003;
        String str = this.f17852b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f17851a);
        sb2.append(", orgId=");
        return We.s.p(sb2, this.f17852b, "}");
    }
}
