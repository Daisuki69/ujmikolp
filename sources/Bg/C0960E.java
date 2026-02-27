package bg;

import cj.C1112C;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0960E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8726b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8727d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8728g;

    public C0960E(int i, List fieldsToCollect, List permissions, int i4, Function1 function1, Function1 function12, int i6) {
        kotlin.jvm.internal.j.h(fieldsToCollect, "fieldsToCollect");
        kotlin.jvm.internal.j.h(permissions, "permissions");
        this.f8725a = i;
        this.f8726b = fieldsToCollect;
        this.c = permissions;
        this.f8727d = i4;
        this.e = function1;
        this.f = function12;
        this.f8728g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0960E)) {
            return false;
        }
        C0960E c0960e = (C0960E) obj;
        return this.f8725a == c0960e.f8725a && kotlin.jvm.internal.j.b(this.f8726b, c0960e.f8726b) && kotlin.jvm.internal.j.b(this.c, c0960e.c) && this.f8727d == c0960e.f8727d && kotlin.jvm.internal.j.b(this.e, c0960e.e) && kotlin.jvm.internal.j.b(this.f, c0960e.f) && this.f8728g == c0960e.f8728g;
    }

    public final int hashCode() {
        int i = this.f8725a * 31;
        List list = this.f8726b;
        int iHashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.c;
        int iHashCode2 = (this.f8727d + ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31;
        Function1 function1 = this.e;
        int iHashCode3 = (iHashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function1 function12 = this.f;
        return this.f8728g + ((iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Field(id=");
        sb2.append(this.f8725a);
        sb2.append(", fieldsToCollect=");
        sb2.append(this.f8726b);
        sb2.append(", permissions=");
        sb2.append(this.c);
        sb2.append(", minSdkVersion=");
        sb2.append(this.f8727d);
        sb2.append(", extract=");
        sb2.append(this.e);
        sb2.append(", map=");
        sb2.append(this.f);
        sb2.append(", maxSdkVersion=");
        return We.s.o(sb2, ")", this.f8728g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0960E(int i, String str, C1112C c1112c, int i4, int i6) {
        C1112C permissions = (i6 & 4) != 0 ? C1112C.f9377a : c1112c;
        int i10 = (i6 & 8) != 0 ? 21 : i4;
        int i11 = (i6 & 16) != 0 ? 9999 : 29;
        kotlin.jvm.internal.j.h(permissions, "permissions");
        this(i, cj.r.c(str), permissions, i10, i11, 48);
    }

    public C0960E(int i, List list, List list2, int i4, int i6, int i10) {
        this(i, list, (i10 & 4) != 0 ? C1112C.f9377a : list2, (i10 & 8) != 0 ? 21 : i4, null, null, (i10 & 64) != 0 ? 9999 : i6);
    }
}
