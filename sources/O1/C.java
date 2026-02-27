package O1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f4532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f4533b;
    public transient Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f4534d;
    public transient int e;
    public transient int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient C0531z f4535g;
    public transient C0531z h;
    public transient B i;

    public static C a() {
        C c = new C();
        c.e = AbstractC1955a.f(3, 1);
        return c;
    }

    public static C b(int i) {
        C c = new C();
        qk.i.g("Expected size must be >= 0", i >= 0);
        c.e = AbstractC1955a.f(i, 1);
        return c;
    }

    public final Map c() {
        Object obj = this.f4532a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = AbstractC1955a.f(size(), 3);
            mapC.clear();
            this.f4532a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f, (Object) null);
        Arrays.fill(k(), 0, this.f, (Object) null);
        Object obj = this.f4532a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (of.p.p(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iV = AbstractC0529x.v(obj);
        int iD = d();
        Object obj2 = this.f4532a;
        Objects.requireNonNull(obj2);
        int iW = AbstractC0529x.w(iV & iD, obj2);
        if (iW == 0) {
            return -1;
        }
        int i = ~iD;
        int i4 = iV & i;
        do {
            int i6 = iW - 1;
            int i10 = i()[i6];
            if ((i10 & i) == i4 && of.p.p(obj, j()[i6])) {
                return i6;
            }
            iW = i10 & iD;
        } while (iW != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0531z c0531z = this.h;
        if (c0531z != null) {
            return c0531z;
        }
        C0531z c0531z2 = new C0531z(this, 0);
        this.h = c0531z2;
        return c0531z2;
    }

    public final void f(int i, int i4) {
        Object obj = this.f4532a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i6];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i6];
        objArrJ[i6] = null;
        objArrK[i6] = null;
        iArrI[i] = iArrI[i6];
        iArrI[i6] = 0;
        int iV = AbstractC0529x.v(obj2) & i4;
        int iW = AbstractC0529x.w(iV, obj);
        if (iW == size) {
            AbstractC0529x.x(iV, i + 1, obj);
            return;
        }
        while (true) {
            int i10 = iW - 1;
            int i11 = iArrI[i10];
            int i12 = i11 & i4;
            if (i12 == size) {
                iArrI[i10] = AbstractC0529x.o(i11, i + 1, i4);
                return;
            }
            iW = i12;
        }
    }

    public final boolean g() {
        return this.f4532a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        boolean zG = g();
        Object obj2 = j;
        if (!zG) {
            int iD = d();
            Object obj3 = this.f4532a;
            Objects.requireNonNull(obj3);
            int iR = AbstractC0529x.r(obj, null, iD, obj3, i(), j(), null);
            if (iR != -1) {
                Object obj4 = k()[iR];
                f(iR, iD);
                this.f--;
                this.e += 32;
                return obj4;
            }
        }
        return obj2;
    }

    public final int[] i() {
        int[] iArr = this.f4533b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f4534d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0531z c0531z = this.f4535g;
        if (c0531z != null) {
            return c0531z;
        }
        C0531z c0531z2 = new C0531z(this, 1);
        this.f4535g = c0531z2;
        return c0531z2;
    }

    public final int l(int i, int i4, int i6, int i10) {
        Object objF = AbstractC0529x.f(i4);
        int i11 = i4 - 1;
        if (i10 != 0) {
            AbstractC0529x.x(i6 & i11, i10 + 1, objF);
        }
        Object obj = this.f4532a;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i12 = 0; i12 <= i; i12++) {
            int iW = AbstractC0529x.w(i12, obj);
            while (iW != 0) {
                int i13 = iW - 1;
                int i14 = iArrI[i13];
                int i15 = ((~i) & i14) | i12;
                int i16 = i15 & i11;
                int iW2 = AbstractC0529x.w(i16, objF);
                AbstractC0529x.x(i16, iW, objF);
                iArrI[i13] = AbstractC0529x.o(i15, iW2, i11);
                iW = i14 & i;
            }
        }
        this.f4532a = objF;
        this.e = AbstractC0529x.o(this.e, 32 - Integer.numberOfLeadingZeros(i11), 31);
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.C.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == j) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        B b8 = this.i;
        if (b8 != null) {
            return b8;
        }
        B b10 = new B(this);
        this.i = b10;
        return b10;
    }
}
