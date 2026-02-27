package F;

import D.S;
import dOYHB6.tiZVw8.numX49;
import kotlin.NoWhenBranchMatchedException;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1500b;
    public final S c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f1501d;
    public final i e;
    public final Cg.c f;

    public h(String str, int i, S s9, Cg.c cVar, i iVar, Cg.c cVar2) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("PcG"));
        this.f1499a = str;
        this.f1500b = i;
        this.c = s9;
        this.f1501d = cVar;
        this.e = iVar;
        this.f = cVar2;
    }

    public final m a(String str, boolean z4) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("Pc3"));
        l lVar = (z.w(str, 2, numX49.tnTj78("Pcy"), false) && z.n(str, 2, numX49.tnTj78("Pcv"), false)) ? l.f1510a : (z.w(str, 2, numX49.tnTj78("Pc7"), false) && z.n(str, 2, numX49.tnTj78("PcA"), false)) ? l.f1511b : l.c;
        l lVar2 = z4 ? l.f1511b : l.c;
        if (lVar == lVar2) {
            return new m(str, true);
        }
        int iOrdinal = lVar.ordinal();
        Cg.c cVar = this.f1501d;
        String str2 = this.f1499a;
        if (iOrdinal == 0) {
            String strD = cVar.d(str, e.f1495a);
            int iOrdinal2 = lVar2.ordinal();
            if (iOrdinal2 == 1) {
                String strG = strD != null ? cVar.g(strD) : null;
                return new m(strG == null ? strD : strG, strG != null || strD == null);
            }
            if (iOrdinal2 == 2) {
                if (strD != null) {
                    str = strD;
                }
                return new m(str, strD != null);
            }
            S.s(str2, numX49.tnTj78("PcR") + lVar2);
            return new m(str, false);
        }
        if (iOrdinal == 1) {
            String strD2 = cVar.d(str, e.f1496b);
            if (g.f1498a[lVar2.ordinal()] == 3) {
                if (strD2 != null) {
                    str = strD2;
                }
                return new m(str, strD2 != null);
            }
            S.s(str2, numX49.tnTj78("PcT") + lVar2);
            return new m(str, false);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (g.f1498a[lVar2.ordinal()] != 2) {
            S.s(str2, numX49.tnTj78("PcY") + lVar2);
            return new m(str, false);
        }
        e eVar = e.f1495a;
        String strG2 = cVar.g(str);
        if (strG2 != null) {
            str = strG2;
        }
        return new m(str, strG2 != null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.j.b(this.f1499a, hVar.f1499a) && this.f1500b == hVar.f1500b && kotlin.jvm.internal.j.b(this.c, hVar.c) && kotlin.jvm.internal.j.b(this.f1501d, hVar.f1501d) && kotlin.jvm.internal.j.b(this.e, hVar.e) && kotlin.jvm.internal.j.b(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.f1501d.hashCode() + ((this.c.hashCode() + (((this.f1499a.hashCode() * 31) + this.f1500b) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return numX49.tnTj78("Pcp") + this.f1499a + numX49.tnTj78("Pc0") + this.f1500b + numX49.tnTj78("Pcg") + this.c + numX49.tnTj78("Pcf") + this.f1501d + numX49.tnTj78("Pc1") + this.e + numX49.tnTj78("Pcn") + this.f + ')';
    }
}
