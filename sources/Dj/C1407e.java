package dj;

import a.AbstractC0617a;
import cj.AbstractC1117c;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rj.InterfaceC2214e;

/* JADX INFO: renamed from: dj.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1407e<K, V> implements Map<K, V>, Serializable, InterfaceC2214e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f16520n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1407e f16521o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16523b;
    public int[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f16524d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16525g;
    public int h;
    public int i;
    public C1411i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C1412j f16526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1410h f16527l;
    public boolean m;

    /* JADX INFO: renamed from: dj.e$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C1407e c1407e = new C1407e(0);
        c1407e.m = true;
        f16521o = c1407e;
    }

    public C1407e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.e * 2;
            int length = this.f16524d.length / 2;
            if (i > length) {
                i = length;
            }
            int i4 = 0;
            while (true) {
                int[] iArr = this.f16524d;
                int i6 = iArr[iJ];
                if (i6 <= 0) {
                    int i10 = this.f;
                    Object[] objArr = this.f16522a;
                    if (i10 < objArr.length) {
                        int i11 = i10 + 1;
                        this.f = i11;
                        objArr[i10] = obj;
                        this.c[i10] = iJ;
                        iArr[iJ] = i11;
                        this.i++;
                        this.h++;
                        if (i4 > this.e) {
                            this.e = i4;
                        }
                        return i10;
                    }
                    g(1);
                } else {
                    if (kotlin.jvm.internal.j.b(this.f16522a[i6 - 1], obj)) {
                        return -i6;
                    }
                    i4++;
                    if (i4 > i) {
                        k(this.f16524d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f16524d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final C1407e b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        C1407e c1407e = f16521o;
        kotlin.jvm.internal.j.e(c1407e, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c1407e;
    }

    public final void c() {
        if (this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i4 = 0;
            while (true) {
                int[] iArr = this.c;
                int i6 = iArr[i4];
                if (i6 >= 0) {
                    this.f16524d[i6] = 0;
                    iArr[i4] = -1;
                }
                if (i4 == i) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        AbstractC0617a.L(0, this.f, this.f16522a);
        Object[] objArr = this.f16523b;
        if (objArr != null) {
            AbstractC0617a.L(0, this.f, objArr);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z4) {
        int i;
        Object[] objArr = this.f16523b;
        int i4 = 0;
        int i6 = 0;
        while (true) {
            i = this.f;
            if (i4 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i10 = iArr[i4];
            if (i10 >= 0) {
                Object[] objArr2 = this.f16522a;
                objArr2[i6] = objArr2[i4];
                if (objArr != null) {
                    objArr[i6] = objArr[i4];
                }
                if (z4) {
                    iArr[i6] = i10;
                    this.f16524d[i10] = i6 + 1;
                }
                i6++;
            }
            i4++;
        }
        AbstractC0617a.L(i6, i, this.f16522a);
        if (objArr != null) {
            AbstractC0617a.L(i6, this.f, objArr);
        }
        this.f = i6;
    }

    public final boolean e(Collection m) {
        kotlin.jvm.internal.j.g(m, "m");
        for (Object obj : m) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1410h c1410h = this.f16527l;
        if (c1410h != null) {
            return c1410h;
        }
        C1410h c1410h2 = new C1410h(this);
        this.f16527l = c1410h2;
        return c1410h2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        kotlin.jvm.internal.j.g(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f16523b;
        kotlin.jvm.internal.j.d(objArr);
        return kotlin.jvm.internal.j.b(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f16522a;
        int length = objArr.length;
        int i4 = this.f;
        int i6 = length - i4;
        int i10 = i4 - this.i;
        if (i6 < i && i6 + i10 >= i && i10 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i11 = i4 + i;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        if (i11 > objArr.length) {
            AbstractC1117c.a aVar = AbstractC1117c.Companion;
            int length2 = objArr.length;
            aVar.getClass();
            int iE = AbstractC1117c.a.e(length2, i11);
            Object[] objArr2 = this.f16522a;
            kotlin.jvm.internal.j.g(objArr2, "<this>");
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, iE);
            kotlin.jvm.internal.j.f(objArrCopyOf2, "copyOf(...)");
            this.f16522a = objArrCopyOf2;
            Object[] objArr3 = this.f16523b;
            if (objArr3 != null) {
                objArrCopyOf = Arrays.copyOf(objArr3, iE);
                kotlin.jvm.internal.j.f(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f16523b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.c, iE);
            kotlin.jvm.internal.j.f(iArrCopyOf, "copyOf(...)");
            this.c = iArrCopyOf;
            f16520n.getClass();
            int iHighestOneBit = Integer.highestOneBit((iE >= 1 ? iE : 1) * 3);
            if (iHighestOneBit > this.f16524d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f16523b;
        kotlin.jvm.internal.j.d(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.e;
        while (true) {
            int i4 = this.f16524d[iJ];
            if (i4 == 0) {
                return -1;
            }
            if (i4 > 0) {
                int i6 = i4 - 1;
                if (kotlin.jvm.internal.j.b(this.f16522a[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f16524d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1408f c1408f = new C1408f(this, 0);
        int i = 0;
        while (c1408f.hasNext()) {
            int i4 = c1408f.f16529b;
            C1407e c1407e = c1408f.f16528a;
            if (i4 >= c1407e.f) {
                throw new NoSuchElementException();
            }
            c1408f.f16529b = i4 + 1;
            c1408f.c = i4;
            Object obj = c1407e.f16522a[i4];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c1407e.f16523b;
            kotlin.jvm.internal.j.d(objArr);
            Object obj2 = objArr[c1408f.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1408f.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.f16523b;
                kotlin.jvm.internal.j.d(objArr);
                if (kotlin.jvm.internal.j.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f16525g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.h
            int r0 = r0 + 1
            r5.h = r0
            int r0 = r5.f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f16524d = r0
            dj.e$a r0 = dj.C1407e.f16520n
            r0.getClass()
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f16525g = r6
        L21:
            int r6 = r5.f
            if (r2 >= r6) goto L55
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f16522a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.e
        L31:
            int[] r3 = r5.f16524d
            r4 = r3[r0]
            if (r4 != 0) goto L3f
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L21
        L3f:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4d
            int r4 = r0 + (-1)
            if (r0 != 0) goto L4b
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L31
        L4b:
            r0 = r4
            goto L31
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C1407e.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1411i c1411i = this.j;
        if (c1411i != null) {
            return c1411i;
        }
        C1411i c1411i2 = new C1411i(this);
        this.j = c1411i2;
        return c1411i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f16522a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.j.g(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f16523b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.e
            int r1 = r1 * 2
            int[] r2 = r11.f16524d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f16524d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f16524d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f16524d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f16522a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f16524d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f16524d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.i
            int r12 = r12 + r6
            r11.i = r12
            int r12 = r11.h
            int r12 = r12 + 1
            r11.h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.C1407e.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f16523b;
        if (objArr == null) {
            int length = this.f16522a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f16523b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.j.g(from, "from");
        c();
        Set<Map.Entry<K, V>> setEntrySet = from.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f16523b;
            if (objArr == null) {
                int length = this.f16522a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f16523b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!kotlin.jvm.internal.j.b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f16523b;
        kotlin.jvm.internal.j.d(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.i * 3) + 2);
        sb2.append("{");
        C1408f c1408f = new C1408f(this, 0);
        int i = 0;
        while (c1408f.hasNext()) {
            if (i > 0) {
                sb2.append(", ");
            }
            int i4 = c1408f.f16529b;
            C1407e c1407e = c1408f.f16528a;
            if (i4 >= c1407e.f) {
                throw new NoSuchElementException();
            }
            c1408f.f16529b = i4 + 1;
            c1408f.c = i4;
            Object obj = c1407e.f16522a[i4];
            if (obj == c1407e) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = c1407e.f16523b;
            kotlin.jvm.internal.j.d(objArr);
            Object obj2 = objArr[c1408f.c];
            if (obj2 == c1407e) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            c1408f.b();
            i++;
        }
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C1412j c1412j = this.f16526k;
        if (c1412j != null) {
            return c1412j;
        }
        C1412j c1412j2 = new C1412j(this);
        this.f16526k = c1412j2;
        return c1412j2;
    }

    public C1407e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        f16520n.getClass();
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f16522a = objArr;
        this.f16523b = null;
        this.c = iArr;
        this.f16524d = new int[iHighestOneBit];
        this.e = 2;
        this.f = 0;
        this.f16525g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
