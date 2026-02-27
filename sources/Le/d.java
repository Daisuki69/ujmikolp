package Le;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2968b;
    public final String c;

    public d(String str, String str2, String hasPermissions) {
        kotlin.jvm.internal.j.g(hasPermissions, "hasPermissions");
        this.f2967a = str;
        this.f2968b = str2;
        this.c = hasPermissions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.j.b(this.f2967a, dVar.f2967a) && kotlin.jvm.internal.j.b(this.f2968b, dVar.f2968b) && kotlin.jvm.internal.j.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f2967a.hashCode() * 31;
        String str = this.f2968b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(code=");
        sb2.append(this.f2967a);
        sb2.append(", dataReferenceId=");
        sb2.append(this.f2968b);
        sb2.append(", hasPermissions=");
        return s.p(sb2, this.c, ")");
    }
}
