package Tj;

import bj.C1034e;
import bj.EnumC1035f;
import cj.C1110A;
import cj.C1112C;
import cj.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class o implements Rj.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f5878b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5879d = -1;
    public final String[] e;
    public final List[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f5880g;
    public Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f5881k;

    public o(String str, h hVar, int i) {
        this.f5877a = str;
        this.f5878b = hVar;
        this.c = i;
        String[] strArr = new String[i];
        for (int i4 = 0; i4 < i; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i6 = this.c;
        this.f = new List[i6];
        this.f5880g = new boolean[i6];
        this.h = M.e();
        EnumC1035f enumC1035f = EnumC1035f.f9164b;
        final int i10 = 0;
        this.i = C1034e.a(enumC1035f, new Function0(this) { // from class: Tj.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5876b;

            {
                this.f5876b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [bj.d, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        h hVar2 = this.f5876b.f5878b;
                        return hVar2 != null ? hVar2.b() : m.f5874b;
                    case 1:
                        return m.b(this.f5876b.f5878b != null ? new ArrayList(0) : null);
                    default:
                        o oVar = this.f5876b;
                        return Integer.valueOf(m.c(oVar, (Rj.d[]) oVar.j.getValue()));
                }
            }
        });
        final int i11 = 1;
        this.j = C1034e.a(enumC1035f, new Function0(this) { // from class: Tj.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5876b;

            {
                this.f5876b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [bj.d, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        h hVar2 = this.f5876b.f5878b;
                        return hVar2 != null ? hVar2.b() : m.f5874b;
                    case 1:
                        return m.b(this.f5876b.f5878b != null ? new ArrayList(0) : null);
                    default:
                        o oVar = this.f5876b;
                        return Integer.valueOf(m.c(oVar, (Rj.d[]) oVar.j.getValue()));
                }
            }
        });
        final int i12 = 2;
        this.f5881k = C1034e.a(enumC1035f, new Function0(this) { // from class: Tj.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f5876b;

            {
                this.f5876b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [bj.d, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        h hVar2 = this.f5876b.f5878b;
                        return hVar2 != null ? hVar2.b() : m.f5874b;
                    case 1:
                        return m.b(this.f5876b.f5878b != null ? new ArrayList(0) : null);
                    default:
                        o oVar = this.f5876b;
                        return Integer.valueOf(m.c(oVar, (Rj.d[]) oVar.j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Tj.b
    public final Set a() {
        return this.h.keySet();
    }

    @Override // Rj.d
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // Rj.d
    public final int c(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        Integer num = (Integer) this.h.get(name);
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
        return this.e[i];
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bj.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [bj.d, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            Rj.d dVar = (Rj.d) obj;
            if (this.f5877a.equals(dVar.h()) && Arrays.equals((Rj.d[]) this.j.getValue(), (Rj.d[]) ((o) obj).j.getValue())) {
                int iD = dVar.d();
                int i = this.c;
                if (i == iD) {
                    for (int i4 = 0; i4 < i; i4++) {
                        if (kotlin.jvm.internal.j.b(g(i4).h(), dVar.g(i4).h()) && kotlin.jvm.internal.j.b(g(i4).getKind(), dVar.g(i4).getKind())) {
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
        List list = this.f[i];
        return list == null ? C1112C.f9377a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bj.d, java.lang.Object] */
    @Override // Rj.d
    public Rj.d g(int i) {
        return ((Pj.a[]) this.i.getValue())[i].d();
    }

    @Override // Rj.d
    public final List getAnnotations() {
        return C1112C.f9377a;
    }

    @Override // Rj.d
    public AbstractC1955a getKind() {
        return Rj.i.c;
    }

    @Override // Rj.d
    public final String h() {
        return this.f5877a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bj.d, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f5881k.getValue()).intValue();
    }

    @Override // Rj.d
    public final boolean i(int i) {
        return this.f5880g[i];
    }

    @Override // Rj.d
    public boolean isInline() {
        return false;
    }

    public final void j(String name, boolean z4) {
        kotlin.jvm.internal.j.g(name, "name");
        int i = this.f5879d + 1;
        this.f5879d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.f5880g[i] = z4;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                map.put(strArr[i4], Integer.valueOf(i4));
            }
            this.h = map;
        }
    }

    public String toString() {
        return C1110A.F(kotlin.ranges.d.f(0, this.c), ", ", this.f5877a.concat("("), ")", new N9.f(this, 14), 24);
    }
}
