package W0;

import We.s;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6210b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6211d;
    public final String e;
    public final String f;

    public p(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6209a = str;
        this.f6210b = str2;
        this.c = str3;
        this.f6211d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.j.b(this.f6209a, pVar.f6209a) && kotlin.jvm.internal.j.b(this.f6210b, pVar.f6210b) && kotlin.jvm.internal.j.b(this.c, pVar.c) && kotlin.jvm.internal.j.b(this.f6211d, pVar.f6211d) && kotlin.jvm.internal.j.b(this.e, pVar.e) && kotlin.jvm.internal.j.b(this.f, pVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.f6209a.hashCode() * 31, 31, this.f6210b), 31, this.c), 31, this.f6211d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StructuredName(displayName=");
        sb2.append(this.f6209a);
        sb2.append(", namePrefix=");
        sb2.append(this.f6210b);
        sb2.append(", givenName=");
        sb2.append(this.c);
        sb2.append(", middleName=");
        sb2.append(this.f6211d);
        sb2.append(", familyName=");
        sb2.append(this.e);
        sb2.append(", nameSuffix=");
        return s.p(sb2, this.f, ")");
    }
}
