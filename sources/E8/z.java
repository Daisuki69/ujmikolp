package E8;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1327b;
    public final ArrayList c;

    public z(ArrayList arrayList, ArrayList arrayList2, String str) {
        this.f1326a = str;
        this.f1327b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f1326a.equals(zVar.f1326a) && this.f1327b.equals(zVar.f1327b) && this.c.equals(zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f1327b.hashCode() + (this.f1326a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StoredIdSession(sessionId=" + this.f1326a + ", primaryIdFiles=" + this.f1327b + ", secondaryIdFiles=" + this.c + ")";
    }
}
