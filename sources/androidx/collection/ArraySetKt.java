package androidx.collection;

import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1110A;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        j.g(arraySet, "<this>");
        j.g(array, "array");
        int i = array.get_size$collection();
        arraySet.ensureCapacity(arraySet.get_size$collection() + i);
        if (arraySet.get_size$collection() != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                arraySet.add(array.valueAt(i4));
            }
        } else if (i > 0) {
            C1127m.i(0, i, 6, array.getHashes$collection(), arraySet.getHashes$collection());
            C1127m.j(array.getArray$collection(), arraySet.getArray$collection(), 0, 0, i, 6);
            if (arraySet.get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            arraySet.set_size$collection(i);
        }
    }

    public static final <E> boolean addInternal(ArraySet<E> arraySet, E e) {
        int i;
        int iIndexOf;
        j.g(arraySet, "<this>");
        int i4 = arraySet.get_size$collection();
        if (e == null) {
            iIndexOf = indexOfNull(arraySet);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(arraySet, e, iHashCode);
        }
        if (iIndexOf >= 0) {
            return false;
        }
        int i6 = ~iIndexOf;
        if (i4 >= arraySet.getHashes$collection().length) {
            int i10 = 8;
            if (i4 >= 8) {
                i10 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i10 = 4;
            }
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i10);
            if (i4 != arraySet.get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (arraySet.getHashes$collection().length != 0) {
                C1127m.i(0, hashes$collection.length, 6, hashes$collection, arraySet.getHashes$collection());
                C1127m.j(array$collection, arraySet.getArray$collection(), 0, 0, array$collection.length, 6);
            }
        }
        if (i6 < i4) {
            int i11 = i6 + 1;
            C1127m.e(i11, i6, i4, arraySet.getHashes$collection(), arraySet.getHashes$collection());
            C1127m.h(arraySet.getArray$collection(), i11, arraySet.getArray$collection(), i6, i4);
        }
        if (i4 != arraySet.get_size$collection() || i6 >= arraySet.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        arraySet.getHashes$collection()[i6] = i;
        arraySet.getArray$collection()[i6] = e;
        arraySet.set_size$collection(arraySet.get_size$collection() + 1);
        return true;
    }

    public static final <E> void allocArrays(ArraySet<E> arraySet, int i) {
        j.g(arraySet, "<this>");
        arraySet.setHashes$collection(new int[i]);
        arraySet.setArray$collection(new Object[i]);
    }

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, null);
    }

    public static final <E> int binarySearchInternal(ArraySet<E> arraySet, int i) {
        j.g(arraySet, "<this>");
        try {
            return ContainerHelpersKt.binarySearch(arraySet.getHashes$collection(), arraySet.get_size$collection(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void clearInternal(ArraySet<E> arraySet) {
        j.g(arraySet, "<this>");
        if (arraySet.get_size$collection() != 0) {
            arraySet.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            arraySet.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            arraySet.set_size$collection(0);
        }
        if (arraySet.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        j.g(arraySet, "<this>");
        j.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!arraySet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean containsInternal(ArraySet<E> arraySet, E e) {
        j.g(arraySet, "<this>");
        return arraySet.indexOf(e) >= 0;
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> arraySet, int i) {
        j.g(arraySet, "<this>");
        int i4 = arraySet.get_size$collection();
        if (arraySet.getHashes$collection().length < i) {
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i);
            if (arraySet.get_size$collection() > 0) {
                C1127m.i(0, arraySet.get_size$collection(), 6, hashes$collection, arraySet.getHashes$collection());
                C1127m.j(array$collection, arraySet.getArray$collection(), 0, 0, arraySet.get_size$collection(), 6);
            }
        }
        if (arraySet.get_size$collection() != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean equalsInternal(ArraySet<E> arraySet, Object obj) {
        j.g(arraySet, "<this>");
        if (arraySet == obj) {
            return true;
        }
        if (!(obj instanceof Set) || arraySet.size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = arraySet.get_size$collection();
            for (int i4 = 0; i4 < i; i4++) {
                if (!((Set) obj).contains(arraySet.valueAt(i4))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> arraySet) {
        j.g(arraySet, "<this>");
        int[] hashes$collection = arraySet.getHashes$collection();
        int i = arraySet.get_size$collection();
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i4 += hashes$collection[i6];
        }
        return i4;
    }

    public static final <E> int indexOf(ArraySet<E> arraySet, Object obj, int i) {
        j.g(arraySet, "<this>");
        int i4 = arraySet.get_size$collection();
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearchInternal = binarySearchInternal(arraySet, i);
        if (iBinarySearchInternal < 0 || j.b(obj, arraySet.getArray$collection()[iBinarySearchInternal])) {
            return iBinarySearchInternal;
        }
        int i6 = iBinarySearchInternal + 1;
        while (i6 < i4 && arraySet.getHashes$collection()[i6] == i) {
            if (j.b(obj, arraySet.getArray$collection()[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i10 = iBinarySearchInternal - 1; i10 >= 0 && arraySet.getHashes$collection()[i10] == i; i10--) {
            if (j.b(obj, arraySet.getArray$collection()[i10])) {
                return i10;
            }
        }
        return ~i6;
    }

    public static final <E> int indexOfInternal(ArraySet<E> arraySet, Object obj) {
        j.g(arraySet, "<this>");
        return obj == null ? indexOfNull(arraySet) : indexOf(arraySet, obj, obj.hashCode());
    }

    public static final <E> int indexOfNull(ArraySet<E> arraySet) {
        j.g(arraySet, "<this>");
        return indexOf(arraySet, null, 0);
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> arraySet) {
        j.g(arraySet, "<this>");
        return arraySet.get_size$collection() <= 0;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, ArraySet<? extends E> array) {
        j.g(arraySet, "<this>");
        j.g(array, "array");
        int i = array.get_size$collection();
        int i4 = arraySet.get_size$collection();
        for (int i6 = 0; i6 < i; i6++) {
            arraySet.remove(array.valueAt(i6));
        }
        return i4 != arraySet.get_size$collection();
    }

    public static final <E> E removeAtInternal(ArraySet<E> arraySet, int i) {
        int i4;
        j.g(arraySet, "<this>");
        int i6 = arraySet.get_size$collection();
        E e = (E) arraySet.getArray$collection()[i];
        if (i6 <= 1) {
            arraySet.clear();
            return e;
        }
        int i10 = i6 - 1;
        if (arraySet.getHashes$collection().length <= 8 || arraySet.get_size$collection() >= arraySet.getHashes$collection().length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                C1127m.e(i, i11, i6, arraySet.getHashes$collection(), arraySet.getHashes$collection());
                C1127m.h(arraySet.getArray$collection(), i, arraySet.getArray$collection(), i11, i6);
            }
            arraySet.getArray$collection()[i10] = null;
        } else {
            int i12 = arraySet.get_size$collection() > 8 ? arraySet.get_size$collection() + (arraySet.get_size$collection() >> 1) : 8;
            int[] hashes$collection = arraySet.getHashes$collection();
            Object[] array$collection = arraySet.getArray$collection();
            allocArrays(arraySet, i12);
            if (i > 0) {
                C1127m.i(0, i, 6, hashes$collection, arraySet.getHashes$collection());
                i4 = i;
                C1127m.j(array$collection, arraySet.getArray$collection(), 0, 0, i4, 6);
            } else {
                i4 = i;
            }
            if (i4 < i10) {
                int i13 = i4 + 1;
                C1127m.e(i4, i13, i6, hashes$collection, arraySet.getHashes$collection());
                C1127m.h(array$collection, i4, arraySet.getArray$collection(), i13, i6);
            }
        }
        if (i6 != arraySet.get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        arraySet.set_size$collection(i10);
        return e;
    }

    public static final <E> boolean removeInternal(ArraySet<E> arraySet, E e) {
        j.g(arraySet, "<this>");
        int iIndexOf = arraySet.indexOf(e);
        if (iIndexOf < 0) {
            return false;
        }
        arraySet.removeAt(iIndexOf);
        return true;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        j.g(arraySet, "<this>");
        j.g(elements, "elements");
        boolean z4 = false;
        for (int i = arraySet.get_size$collection() - 1; -1 < i; i--) {
            if (!C1110A.v(elements, arraySet.getArray$collection()[i])) {
                arraySet.removeAt(i);
                z4 = true;
            }
        }
        return z4;
    }

    public static final <E> String toStringInternal(ArraySet<E> arraySet) {
        j.g(arraySet, "<this>");
        if (arraySet.isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(arraySet.get_size$collection() * 14);
        sb2.append('{');
        int i = arraySet.get_size$collection();
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            E eValueAt = arraySet.valueAt(i4);
            if (eValueAt != arraySet) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        return a.k(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public static final <E> E valueAtInternal(ArraySet<E> arraySet, int i) {
        j.g(arraySet, "<this>");
        return (E) arraySet.getArray$collection()[i];
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        j.g(values, "values");
        ArraySet<T> arraySet = new ArraySet<>(values.length);
        for (T t5 : values) {
            arraySet.add(t5);
        }
        return arraySet;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        j.g(arraySet, "<this>");
        j.g(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= arraySet.remove(it.next());
        }
        return zRemove;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> arraySet, Collection<? extends E> elements) {
        j.g(arraySet, "<this>");
        j.g(elements, "elements");
        arraySet.ensureCapacity(elements.size() + arraySet.get_size$collection());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= arraySet.add(it.next());
        }
        return zAdd;
    }
}
