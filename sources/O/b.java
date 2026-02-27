package O;

import G7.F;
import We.s;
import cj.C1110A;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P.b f4509b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4510d;
    public final h e;

    public b(String str, P.b bVar, boolean z4, ArrayList arrayList, h hVar, boolean z5) {
        this.f4508a = str;
        this.f4509b = bVar;
        this.c = z4;
        this.f4510d = arrayList;
        this.e = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.e(obj, numX49.tnTj78("Pzw"));
        return kotlin.jvm.internal.j.b(this.f4508a, ((b) obj).f4508a);
    }

    public final int hashCode() {
        return this.f4508a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("Pzc"));
        sb2.append(this.f4508a);
        sb2.append(numX49.tnTj78("Pzm"));
        sb2.append(this.c);
        sb2.append(numX49.tnTj78("PzD"));
        sb2.append(this.e);
        sb2.append(numX49.tnTj78("Pzh"));
        return s.p(sb2, C1110A.F(this.f4510d, numX49.tnTj78("PzM"), null, null, new F(21), 30), numX49.tnTj78("PzN"));
    }
}
