package O1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import o1.AbstractC1955a;

/* JADX INFO: renamed from: O1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0529x {
    public static int a(int i) {
        if (i < 3) {
            d(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void b(int i, Object[] objArr) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(We.s.f(i4, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.h(i, str, " cannot be negative but was: "));
        }
    }

    public static boolean e(H0 h02, Object obj) {
        Iterator it = h02.f4547a;
        if (obj == null) {
            while (it.hasNext()) {
                if (h02.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(h02.next())) {
                return true;
            }
        }
        return false;
    }

    public static Object f(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(We.s.f(i, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean g(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static D0 i(Set set, N1.j jVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof D0)) {
                set.getClass();
                return new D0(set, jVar);
            }
            D0 d02 = (D0) set;
            N1.j jVar2 = d02.f4540b;
            jVar2.getClass();
            return new D0(d02.f4539a, new N1.k(Arrays.asList(jVar2, jVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof D0)) {
            set2.getClass();
            return new E0(set2, jVar);
        }
        D0 d03 = (D0) set2;
        N1.j jVar3 = d03.f4540b;
        jVar3.getClass();
        return new E0((SortedSet) d03.f4539a, new N1.k(Arrays.asList(jVar3, jVar)));
    }

    public static Object j(String str, Collection collection) {
        Iterator it = collection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object k(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return We.s.e(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return We.s.e(1, (List) iterable);
            }
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static C0 n(AbstractC0505d0 abstractC0505d0, AbstractC0505d0 abstractC0505d02) {
        qk.i.l(abstractC0505d0, "set1");
        qk.i.l(abstractC0505d02, "set2");
        return new C0(abstractC0505d0, abstractC0505d02, 1);
    }

    public static int o(int i, int i4, int i6) {
        return (i & (~i6)) | (i4 & i6);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC1955a.z(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int q(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int r(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i4;
        int i6;
        int iV = v(obj);
        int i10 = iV & i;
        int iW = w(i10, obj3);
        if (iW != 0) {
            int i11 = ~i;
            int i12 = iV & i11;
            int i13 = -1;
            while (true) {
                i4 = iW - 1;
                i6 = iArr[i4];
                if ((i6 & i11) == i12 && of.p.p(obj, objArr[i4]) && (objArr2 == null || of.p.p(obj2, objArr2[i4]))) {
                    break;
                }
                int i14 = i6 & i;
                if (i14 == 0) {
                    break;
                }
                i13 = i4;
                iW = i14;
            }
            int i15 = i6 & i;
            if (i13 == -1) {
                x(i10, i15, obj3);
                return i4;
            }
            iArr[i13] = o(iArr[i13], i15, i);
            return i4;
        }
        return -1;
    }

    public static boolean s(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof q0) {
            collection = ((q0) collection).elementSet();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void t(List list, N1.j jVar, int i, int i4) {
        for (int size = list.size() - 1; size > i4; size--) {
            if (jVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i4 - 1; i6 >= i; i6--) {
            list.remove(i6);
        }
    }

    public static int u(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int v(Object obj) {
        return u(obj == null ? 0 : obj.hashCode());
    }

    public static int w(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void x(int i, int i4, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i4;
        } else {
            ((int[]) obj)[i] = i4;
        }
    }

    public static String y(Map map) {
        int size = map.size();
        d(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z4 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z4) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z4 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static AbstractList z(List list, N1.g gVar) {
        return list instanceof RandomAccess ? new k0(list, gVar) : new l0(list, gVar);
    }
}
