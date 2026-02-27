package n1;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import pi.C2151a;
import s1.InterfaceC2231f;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: n1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1889B extends AbstractC1894G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2231f f18547b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18548d;
    public final int[] e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC1894G[] f18549g;
    public final Object[] h;
    public final HashMap i;

    public C1889B(ArrayList arrayList, InterfaceC2231f interfaceC2231f) {
        this.f18547b = interfaceC2231f;
        this.f18546a = ((int[]) ((C2151a) interfaceC2231f).f19708b).length;
        int size = arrayList.size();
        this.e = new int[size];
        this.f = new int[size];
        this.f18549g = new AbstractC1894G[size];
        this.h = new Object[size];
        this.i = new HashMap();
        Iterator it = arrayList.iterator();
        int iM = 0;
        int iG = 0;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC1907m interfaceC1907m = (InterfaceC1907m) it.next();
            this.f18549g[i] = interfaceC1907m.getTimeline();
            this.f[i] = iM;
            this.e[i] = iG;
            iM += this.f18549g[i].m();
            iG += this.f18549g[i].g();
            this.h[i] = interfaceC1907m.getUid();
            this.i.put(this.h[i], Integer.valueOf(i));
            i++;
        }
        this.c = iM;
        this.f18548d = iG;
    }

    @Override // n1.AbstractC1894G
    public final int a(boolean z4) {
        if (this.f18546a != 0) {
            int iO = 0;
            if (z4) {
                int[] iArr = (int[]) ((C2151a) this.f18547b).f19708b;
                iO = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC1894G[] abstractC1894GArr = this.f18549g;
                if (!abstractC1894GArr[iO].n()) {
                    return abstractC1894GArr[iO].a(z4) + this.f[iO];
                }
                iO = o(iO, z4);
            } while (iO != -1);
        }
        return -1;
    }

    @Override // n1.AbstractC1894G
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.i.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.f18549g[iIntValue].b(obj3)) != -1) {
                return this.e[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // n1.AbstractC1894G
    public final int c(boolean z4) {
        int iP;
        int i = this.f18546a;
        if (i != 0) {
            if (z4) {
                int[] iArr = (int[]) ((C2151a) this.f18547b).f19708b;
                iP = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iP = i - 1;
            }
            do {
                AbstractC1894G[] abstractC1894GArr = this.f18549g;
                if (!abstractC1894GArr[iP].n()) {
                    return abstractC1894GArr[iP].c(z4) + this.f[iP];
                }
                iP = p(iP, z4);
            } while (iP != -1);
        }
        return -1;
    }

    @Override // n1.AbstractC1894G
    public final int d(int i, int i4, boolean z4) {
        int[] iArr = this.f;
        int iB = AbstractC2550e.b(i + 1, iArr);
        int i6 = iArr[iB];
        AbstractC1894G[] abstractC1894GArr = this.f18549g;
        int iD = abstractC1894GArr[iB].d(i - i6, i4 == 2 ? 0 : i4, z4);
        if (iD != -1) {
            return i6 + iD;
        }
        int iO = o(iB, z4);
        while (iO != -1 && abstractC1894GArr[iO].n()) {
            iO = o(iO, z4);
        }
        if (iO != -1) {
            return abstractC1894GArr[iO].a(z4) + iArr[iO];
        }
        if (i4 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // n1.AbstractC1894G
    public final C1892E e(int i, C1892E c1892e, boolean z4) {
        int[] iArr = this.e;
        int iB = AbstractC2550e.b(i + 1, iArr);
        int i4 = this.f[iB];
        this.f18549g[iB].e(i - iArr[iB], c1892e, z4);
        c1892e.c += i4;
        if (z4) {
            Object obj = this.h[iB];
            Object obj2 = c1892e.f18553b;
            obj2.getClass();
            c1892e.f18553b = Pair.create(obj, obj2);
        }
        return c1892e;
    }

    @Override // n1.AbstractC1894G
    public final C1892E f(Object obj, C1892E c1892e) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.i.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f[iIntValue];
        this.f18549g[iIntValue].f(obj3, c1892e);
        c1892e.c += i;
        c1892e.f18553b = obj;
        return c1892e;
    }

    @Override // n1.AbstractC1894G
    public final int g() {
        return this.f18548d;
    }

    @Override // n1.AbstractC1894G
    public final int i(int i, int i4, boolean z4) {
        int[] iArr = this.f;
        int iB = AbstractC2550e.b(i + 1, iArr);
        int i6 = iArr[iB];
        AbstractC1894G[] abstractC1894GArr = this.f18549g;
        int i10 = abstractC1894GArr[iB].i(i - i6, i4 == 2 ? 0 : i4, z4);
        if (i10 != -1) {
            return i6 + i10;
        }
        int iP = p(iB, z4);
        while (iP != -1 && abstractC1894GArr[iP].n()) {
            iP = p(iP, z4);
        }
        if (iP != -1) {
            return abstractC1894GArr[iP].c(z4) + iArr[iP];
        }
        if (i4 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // n1.AbstractC1894G
    public final Object j(int i) {
        int[] iArr = this.e;
        int iB = AbstractC2550e.b(i + 1, iArr);
        return Pair.create(this.h[iB], this.f18549g[iB].j(i - iArr[iB]));
    }

    @Override // n1.AbstractC1894G
    public final C1893F k(int i, C1893F c1893f, long j) {
        int[] iArr = this.f;
        int iB = AbstractC2550e.b(i + 1, iArr);
        int i4 = iArr[iB];
        int i6 = this.e[iB];
        this.f18549g[iB].k(i - i4, c1893f, j);
        Object objCreate = this.h[iB];
        if (!C1893F.f18555l.equals(c1893f.f18556a)) {
            objCreate = Pair.create(objCreate, c1893f.f18556a);
        }
        c1893f.f18556a = objCreate;
        c1893f.i += i6;
        c1893f.j += i6;
        return c1893f;
    }

    @Override // n1.AbstractC1894G
    public final int m() {
        return this.c;
    }

    public final int o(int i, boolean z4) {
        if (!z4) {
            if (i < this.f18546a - 1) {
                return i + 1;
            }
            return -1;
        }
        C2151a c2151a = (C2151a) this.f18547b;
        int i4 = ((int[]) c2151a.c)[i] + 1;
        int[] iArr = (int[]) c2151a.f19708b;
        if (i4 < iArr.length) {
            return iArr[i4];
        }
        return -1;
    }

    public final int p(int i, boolean z4) {
        if (!z4) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C2151a c2151a = (C2151a) this.f18547b;
        int i4 = ((int[]) c2151a.c)[i] - 1;
        if (i4 >= 0) {
            return ((int[]) c2151a.f19708b)[i4];
        }
        return -1;
    }
}
