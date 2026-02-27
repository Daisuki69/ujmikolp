package Yf;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6787b;
    public final String c;

    public a(String str, String versionCode, String str2) {
        j.h(versionCode, "versionCode");
        this.f6786a = str;
        this.f6787b = versionCode;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f6786a, aVar.f6786a) && j.b(this.f6787b, aVar.f6787b) && j.b(this.c, aVar.c);
    }

    public final int hashCode() {
        String str = this.f6786a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6787b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModuleInfo(version=");
        sb2.append(this.f6786a);
        sb2.append(", versionCode=");
        sb2.append(this.f6787b);
        sb2.append(", moduleName=");
        return s.p(sb2, this.c, ")");
    }
}
