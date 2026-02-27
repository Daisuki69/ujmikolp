package W0;

import We.s;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6182b;

    public e(String str, String str2) {
        this.f6181a = str;
        this.f6182b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.j.b(this.f6181a, eVar.f6181a) && kotlin.jvm.internal.j.b(this.f6182b, eVar.f6182b);
    }

    public final int hashCode() {
        return this.f6182b.hashCode() + (this.f6181a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactPhone(number=");
        sb2.append(this.f6181a);
        sb2.append(", label=");
        return s.p(sb2, this.f6182b, ")");
    }
}
