package androidx.collection;

import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Arrays;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        j.g(sparseArrayCompat, "<this>");
        int i4 = sparseArrayCompat.size;
        if (i4 != 0 && i <= sparseArrayCompat.keys[i4 - 1]) {
            sparseArrayCompat.put(i, e);
            return;
        }
        if (sparseArrayCompat.garbage && i4 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i6 = sparseArrayCompat.size;
        if (i6 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i6] = i;
        sparseArrayCompat.values[i6] = e;
        sparseArrayCompat.size = i6 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        j.g(sparseArrayCompat, "<this>");
        int i = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i) >= 0;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                i4 = -1;
                break;
            }
            if (sparseArrayCompat.values[i4] == e) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i) {
        E e;
        j.g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch < 0 || (e = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i = sparseArrayCompat.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (sparseArrayCompat.values[i4] == e) {
                return i4;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        j.g(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        j.g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e;
            return;
        }
        int i4 = ~iBinarySearch;
        if (i4 < sparseArrayCompat.size && sparseArrayCompat.values[i4] == DELETED) {
            sparseArrayCompat.keys[i4] = i;
            sparseArrayCompat.values[i4] = e;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i4 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        }
        int i6 = sparseArrayCompat.size;
        if (i6 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i10 = sparseArrayCompat.size;
        if (i10 - i4 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i11 = i4 + 1;
            C1127m.e(i11, i4, i10, iArr, iArr);
            Object[] objArr = sparseArrayCompat.values;
            C1127m.h(objArr, i11, objArr, i4, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i4] = i;
        sparseArrayCompat.values[i4] = e;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> sparseArrayCompat, SparseArrayCompat<? extends E> other) {
        j.g(sparseArrayCompat, "<this>");
        j.g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = other.keyAt(i);
            E eValueAt = other.valueAt(i);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i4 = ~iBinarySearch;
                if (i4 >= sparseArrayCompat.size || sparseArrayCompat.values[i4] != DELETED) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        gc(sparseArrayCompat);
                        i4 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i6 = sparseArrayCompat.size;
                    if (i6 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        j.f(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        j.f(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i10 = sparseArrayCompat.size;
                    if (i10 - i4 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i11 = i4 + 1;
                        C1127m.e(i11, i4, i10, iArr, iArr);
                        Object[] objArr = sparseArrayCompat.values;
                        C1127m.h(objArr, i11, objArr, i4, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i4] = iKeyAt;
                    sparseArrayCompat.values[i4] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i4] = iKeyAt;
                    sparseArrayCompat.values[i4] = eValueAt;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        j.g(sparseArrayCompat, "<this>");
        E e7 = (E) commonGet(sparseArrayCompat, i);
        if (e7 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e;
                return e7;
            }
            int i4 = ~iBinarySearch;
            if (i4 < sparseArrayCompat.size && sparseArrayCompat.values[i4] == DELETED) {
                sparseArrayCompat.keys[i4] = i;
                sparseArrayCompat.values[i4] = e;
                return e7;
            }
            if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                gc(sparseArrayCompat);
                i4 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
            }
            int i6 = sparseArrayCompat.size;
            if (i6 >= sparseArrayCompat.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
                int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                j.f(iArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                j.f(objArrCopyOf, "copyOf(this, newSize)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i10 = sparseArrayCompat.size;
            if (i10 - i4 != 0) {
                int[] iArr = sparseArrayCompat.keys;
                int i11 = i4 + 1;
                C1127m.e(i11, i4, i10, iArr, iArr);
                Object[] objArr = sparseArrayCompat.values;
                C1127m.h(objArr, i11, objArr, i4, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i4] = i;
            sparseArrayCompat.values[i4] = e;
            sparseArrayCompat.size++;
        }
        return e7;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i] != DELETED) {
            sparseArrayCompat.values[i] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i, int i4) {
        j.g(sparseArrayCompat, "<this>");
        int iMin = Math.min(i4, i + i4);
        while (i < iMin) {
            sparseArrayCompat.removeAt(i);
            i++;
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        j.g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e7 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e7;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i] = e;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(sparseArrayCompat.size * 28);
        sb2.append('{');
        int i = sparseArrayCompat.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            sb2.append(sparseArrayCompat.keyAt(i4));
            sb2.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i4);
            if (eValueAt != sparseArrayCompat) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return a.k(sb2, '}', "buffer.toString()");
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i) {
        j.g(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i4 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != DELETED) {
                if (i6 != i4) {
                    iArr[i4] = iArr[i6];
                    objArr[i4] = obj;
                    objArr[i6] = null;
                }
                i4++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i4;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i, T t5) {
        T t10;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (iBinarySearch < 0 || (t10 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t5 : t10;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i, E e) {
        E e7;
        j.g(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i);
        return (iBinarySearch < 0 || (e7 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e : e7;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i, E e, E e7) {
        j.g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0 || !j.b(sparseArrayCompat.values[iIndexOfKey], e)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e7;
        return true;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i, Object obj) {
        j.g(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i);
        if (iIndexOfKey < 0 || !j.b(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
