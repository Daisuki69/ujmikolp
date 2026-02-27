package W0;

import We.s;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6208b;
    public final String c;

    public o(String str, String str2, String str3) {
        this.f6207a = str;
        this.f6208b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.j.b(this.f6207a, oVar.f6207a) && kotlin.jvm.internal.j.b(this.f6208b, oVar.f6208b) && kotlin.jvm.internal.j.b(this.c, oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + AbstractC1414e.c(this.f6207a.hashCode() * 31, 31, this.f6208b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Organization(company=");
        sb2.append(this.f6207a);
        sb2.append(", department=");
        sb2.append(this.f6208b);
        sb2.append(", jobDescription=");
        return s.p(sb2, this.c, ")");
    }
}
