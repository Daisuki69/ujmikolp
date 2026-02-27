package ag;

import We.s;
import cj.C1112C;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ag.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0702l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1112C f7214b;
    public final List c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7215d;
    public final Function1 e;
    public final int f;

    public C0702l(int i, C1112C c1112c, List list, int i4, Function1 function1, int i6) {
        kotlin.jvm.internal.j.h(c1112c, numX49.tnTj78("bueQ"));
        kotlin.jvm.internal.j.h(list, numX49.tnTj78("buet"));
        this.f7213a = i;
        this.f7214b = c1112c;
        this.c = list;
        this.f7215d = i4;
        this.e = function1;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702l)) {
            return false;
        }
        C0702l c0702l = (C0702l) obj;
        return this.f7213a == c0702l.f7213a && kotlin.jvm.internal.j.b(this.f7214b, c0702l.f7214b) && kotlin.jvm.internal.j.b(this.c, c0702l.c) && this.f7215d == c0702l.f7215d && kotlin.jvm.internal.j.b(this.e, c0702l.e) && this.f == c0702l.f;
    }

    public final int hashCode() {
        int i = ((this.f7213a * 31) + (this.f7214b != null ? 1 : 0)) * 31;
        List list = this.c;
        int iHashCode = (this.f7215d + ((i + (list != null ? list.hashCode() : 0)) * 31)) * 31;
        Function1 function1 = this.e;
        return this.f + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("bueU"));
        sb2.append(this.f7213a);
        sb2.append(numX49.tnTj78("buee"));
        sb2.append(this.f7214b);
        sb2.append(numX49.tnTj78("bue8"));
        sb2.append(this.c);
        sb2.append(numX49.tnTj78("bueC"));
        sb2.append(this.f7215d);
        sb2.append(numX49.tnTj78("bue4"));
        sb2.append(this.e);
        sb2.append(numX49.tnTj78("bueo"));
        return s.o(sb2, numX49.tnTj78("bueK"), this.f);
    }

    public C0702l(int i, C1112C c1112c, List list, int i4) {
        this(i, c1112c, (i4 & 4) != 0 ? C1112C.f9377a : list, 21, null, 9999);
    }
}
