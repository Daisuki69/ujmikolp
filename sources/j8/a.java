package J8;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2453b;

    public a(String str, String str2) {
        this.f2452a = str;
        this.f2453b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.j.b(this.f2452a, aVar.f2452a) && kotlin.jvm.internal.j.b(this.f2453b, aVar.f2453b);
    }

    public final int hashCode() {
        return this.f2453b.hashCode() + (this.f2452a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderData(title=");
        sb2.append(this.f2452a);
        sb2.append(", subtitle=");
        return s.p(sb2, this.f2453b, ")");
    }
}
