package Le;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2966b;

    public c(String str, String str2) {
        this.f2965a = str;
        this.f2966b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.j.b(this.f2965a, cVar.f2965a) && kotlin.jvm.internal.j.b(this.f2966b, cVar.f2966b);
    }

    public final int hashCode() {
        return this.f2966b.hashCode() + (this.f2965a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Failure(code=");
        sb2.append(this.f2965a);
        sb2.append(", message=");
        return s.p(sb2, this.f2966b, ")");
    }
}
