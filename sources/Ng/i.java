package Ng;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4429b;

    public i(String name, String value) {
        kotlin.jvm.internal.j.g(name, "name");
        kotlin.jvm.internal.j.g(value, "value");
        this.f4428a = name;
        this.f4429b = value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return zj.z.o(iVar.f4428a, this.f4428a, true) && zj.z.o(iVar.f4429b, this.f4429b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f4428a.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f4429b.toLowerCase(locale);
        kotlin.jvm.internal.j.f(lowerCase2, "toLowerCase(...)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f4428a);
        sb2.append(", value=");
        return We.s.p(sb2, this.f4429b, ", escapeValue=false)");
    }
}
