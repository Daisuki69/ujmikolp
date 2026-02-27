package O1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S extends M implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f4555b = new P(0, t0.e);

    public static t0 i(int i, Object[] objArr) {
        return i == 0 ? t0.e : new t0(objArr, i);
    }

    public static O j() {
        return new O(4);
    }

    public static S k(Collection collection) {
        if (!(collection instanceof M)) {
            Object[] array = collection.toArray();
            AbstractC0529x.b(array.length, array);
            return i(array.length, array);
        }
        S sA = ((M) collection).a();
        if (!sA.g()) {
            return sA;
        }
        Object[] array2 = sA.toArray(M.f4551a);
        return i(array2.length, array2);
    }

    public static t0 l(Object[] objArr) {
        if (objArr.length == 0) {
            return t0.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC0529x.b(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static t0 o(Number number, Number number2, Number number3, Number number4, Number number5) {
        Object[] objArr = {number, number2, number3, number4, number5};
        AbstractC0529x.b(5, objArr);
        return i(5, objArr);
    }

    public static t0 p(Object obj) {
        Object[] objArr = {obj};
        AbstractC0529x.b(1, objArr);
        return i(1, objArr);
    }

    public static t0 q(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC0529x.b(2, objArr);
        return i(2, objArr);
    }

    public static t0 s(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        AbstractC0529x.b(3, objArr);
        return i(3, objArr);
    }

    public static t0 t(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        qk.i.g("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        AbstractC0529x.b(length, objArr2);
        return i(length, objArr2);
    }

    public static t0 u(s0 s0Var, Collection collection) {
        Collection collection2;
        s0Var.getClass();
        if (collection instanceof Collection) {
            collection2 = collection;
        } else {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        AbstractC0529x.b(array.length, array);
        Arrays.sort(array, s0Var);
        return i(array.length, array);
    }

    @Override // O1.M
    public final S a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // O1.M
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i + i4] = get(i4);
        }
        return i + size;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && of.p.p(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (of.p.p(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i = ~(~(get(i4).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final P listIterator(int i) {
        qk.i.n(i, size());
        return isEmpty() ? f4555b : new P(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public S subList(int i, int i4) {
        qk.i.o(i, i4, size());
        int i6 = i4 - i;
        return i6 == size() ? this : i6 == 0 ? t0.e : new Q(this, i, i6);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
