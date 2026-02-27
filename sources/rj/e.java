package Rj;

import M8.C0332a;
import Tj.m;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import cj.H;
import cj.M;
import cj.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements d, Tj.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1955a f5562b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1112C f5563d;
    public final HashSet e;
    public final String[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d[] f5564g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d[] f5565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1033d f5566l;

    public e(String serialName, AbstractC1955a abstractC1955a, int i, List typeParameters, Ci.b bVar) {
        kotlin.jvm.internal.j.g(serialName, "serialName");
        kotlin.jvm.internal.j.g(typeParameters, "typeParameters");
        this.f5561a = serialName;
        this.f5562b = abstractC1955a;
        this.c = i;
        this.f5563d = (C1112C) bVar.f785b;
        ArrayList arrayList = (ArrayList) bVar.c;
        this.e = C1110A.T(arrayList);
        int i4 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.f5564g = m.b((ArrayList) bVar.f786d);
        this.h = (List[]) ((ArrayList) bVar.e).toArray(new List[0]);
        ArrayList arrayList2 = (ArrayList) bVar.f;
        kotlin.jvm.internal.j.g(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i4] = ((Boolean) it.next()).booleanValue();
            i4++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        kotlin.jvm.internal.j.g(strArr, "<this>");
        g gVar = new g(new W4.b(strArr, 10), 1);
        ArrayList arrayList3 = new ArrayList(t.l(gVar, 10));
        Iterator it2 = gVar.iterator();
        while (true) {
            H h = (H) it2;
            if (!h.f9381b.hasNext()) {
                this.j = M.l(arrayList3);
                this.f5565k = m.b(typeParameters);
                this.f5566l = C1034e.b(new C0332a(this, 26));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) h.next();
            arrayList3.add(new Pair(indexedValue.f18164b, Integer.valueOf(indexedValue.f18163a)));
        }
    }

    @Override // Tj.b
    public final Set a() {
        return this.e;
    }

    @Override // Rj.d
    public final boolean b() {
        return false;
    }

    @Override // Rj.d
    public final int c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Rj.d
    public final int d() {
        return this.c;
    }

    @Override // Rj.d
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            d dVar = (d) obj;
            if (kotlin.jvm.internal.j.b(this.f5561a, dVar.h()) && Arrays.equals(this.f5565k, ((e) obj).f5565k)) {
                int iD = dVar.d();
                int i = this.c;
                if (i == iD) {
                    for (int i4 = 0; i4 < i; i4++) {
                        d[] dVarArr = this.f5564g;
                        if (kotlin.jvm.internal.j.b(dVarArr[i4].h(), dVar.g(i4).h()) && kotlin.jvm.internal.j.b(dVarArr[i4].getKind(), dVar.g(i4).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Rj.d
    public final List f(int i) {
        return this.h[i];
    }

    @Override // Rj.d
    public final d g(int i) {
        return this.f5564g[i];
    }

    @Override // Rj.d
    public final List getAnnotations() {
        return this.f5563d;
    }

    @Override // Rj.d
    public final AbstractC1955a getKind() {
        return this.f5562b;
    }

    @Override // Rj.d
    public final String h() {
        return this.f5561a;
    }

    public final int hashCode() {
        return ((Number) this.f5566l.getValue()).intValue();
    }

    @Override // Rj.d
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // Rj.d
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return C1110A.F(kotlin.ranges.d.f(0, this.c), ", ", androidx.camera.core.impl.a.n(new StringBuilder(), this.f5561a, '('), ")", new N9.f(this, 10), 24);
    }
}
