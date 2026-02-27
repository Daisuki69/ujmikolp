package J9;

import We.s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2489b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2490d;
    public final String e;
    public final String f;

    public /* synthetic */ b(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.b(this.f2488a, bVar.f2488a) && j.b(this.f2489b, bVar.f2489b) && j.b(this.c, bVar.c) && j.b(this.f2490d, bVar.f2490d) && j.b(this.e, bVar.e) && j.b(this.f, bVar.f);
    }

    public final int hashCode() {
        String str = this.f2488a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2489b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2490d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreditContactReferenceUiModel(gender=");
        sb2.append(this.f2488a);
        sb2.append(", maritalStatus=");
        sb2.append(this.f2489b);
        sb2.append(", contactFirstName=");
        sb2.append(this.c);
        sb2.append(", contactLastName=");
        sb2.append(this.f2490d);
        sb2.append(", contactRelationship=");
        sb2.append(this.e);
        sb2.append(", contactMobile=");
        return s.p(sb2, this.f, ")");
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2488a = str;
        this.f2489b = str2;
        this.c = str3;
        this.f2490d = str4;
        this.e = str5;
        this.f = str6;
    }
}
