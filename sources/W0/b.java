package W0;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6169b;

    public b(String str, String str2) {
        this.f6168a = str;
        this.f6169b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.j.b(this.f6168a, bVar.f6168a) && kotlin.jvm.internal.j.b(this.f6169b, bVar.f6169b);
    }

    public final int hashCode() {
        return this.f6169b.hashCode() + (this.f6168a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactEmail(address=");
        sb2.append(this.f6168a);
        sb2.append(", label=");
        return s.p(sb2, this.f6169b, ")");
    }
}
