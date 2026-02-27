package androidx.collection;

import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public void append(int i, E e) {
        int i4 = this.size;
        if (i4 != 0 && i <= this.keys[i4 - 1]) {
            put(i, e);
            return;
        }
        if (this.garbage && i4 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i6 = this.size;
        if (i6 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i6] = i;
        this.values[i6] = e;
        this.size = i6 + 1;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                i4 = -1;
                break;
            }
            if (this.values[i4] == e) {
                break;
            }
            i4++;
        }
        return i4 >= 0;
    }

    public void delete(int i) {
        remove(i);
    }

    public E get(int i) {
        return (E) SparseArrayCompatKt.commonGet(this, i);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.values[i4] == e) {
                return i4;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[i];
    }

    public void put(int i, E e) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e;
            return;
        }
        int i4 = ~iBinarySearch;
        if (i4 < this.size && this.values[i4] == SparseArrayCompatKt.DELETED) {
            this.keys[i4] = i;
            this.values[i4] = e;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i4 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
        }
        int i6 = this.size;
        if (i6 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i10 = this.size;
        if (i10 - i4 != 0) {
            int[] iArr = this.keys;
            int i11 = i4 + 1;
            C1127m.e(i11, i4, i10, iArr, iArr);
            Object[] objArr = this.values;
            C1127m.h(objArr, i11, objArr, i4, this.size);
        }
        this.keys[i4] = i;
        this.values[i4] = e;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> other) {
        j.g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = other.keyAt(i);
            E eValueAt = other.valueAt(i);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i4 = ~iBinarySearch;
                if (i4 >= this.size || this.values[i4] != SparseArrayCompatKt.DELETED) {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i4 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i6 = this.size;
                    if (i6 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        j.f(iArrCopyOf, "copyOf(this, newSize)");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        j.f(objArrCopyOf, "copyOf(this, newSize)");
                        this.values = objArrCopyOf;
                    }
                    int i10 = this.size;
                    if (i10 - i4 != 0) {
                        int[] iArr = this.keys;
                        int i11 = i4 + 1;
                        C1127m.e(i11, i4, i10, iArr, iArr);
                        Object[] objArr = this.values;
                        C1127m.h(objArr, i11, objArr, i4, this.size);
                    }
                    this.keys[i4] = iKeyAt;
                    this.values[i4] = eValueAt;
                    this.size++;
                } else {
                    this.keys[i4] = iKeyAt;
                    this.values[i4] = eValueAt;
                }
            }
        }
    }

    public E putIfAbsent(int i, E e) {
        E e7 = (E) SparseArrayCompatKt.commonGet(this, i);
        if (e7 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = e;
                return e7;
            }
            int i4 = ~iBinarySearch;
            if (i4 < this.size && this.values[i4] == SparseArrayCompatKt.DELETED) {
                this.keys[i4] = i;
                this.values[i4] = e;
                return e7;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.gc(this);
                i4 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i);
            }
            int i6 = this.size;
            if (i6 >= this.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i6 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                j.f(iArrCopyOf, "copyOf(this, newSize)");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                j.f(objArrCopyOf, "copyOf(this, newSize)");
                this.values = objArrCopyOf;
            }
            int i10 = this.size;
            if (i10 - i4 != 0) {
                int[] iArr = this.keys;
                int i11 = i4 + 1;
                C1127m.e(i11, i4, i10, iArr, iArr);
                Object[] objArr = this.values;
                C1127m.h(objArr, i11, objArr, i4, this.size);
            }
            this.keys[i4] = i;
            this.values[i4] = e;
            this.size++;
        }
        return e7;
    }

    public void remove(int i) {
        SparseArrayCompatKt.commonRemove(this, i);
    }

    public void removeAt(int i) {
        if (this.values[i] != SparseArrayCompatKt.DELETED) {
            this.values[i] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i, int i4) {
        int iMin = Math.min(i4, i + i4);
        while (i < iMin) {
            removeAt(i);
            i++;
        }
    }

    public E replace(int i, E e) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e7 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e7;
    }

    public void setValueAt(int i, E e) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i] = e;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i = this.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i4));
            sb2.append('=');
            E eValueAt = valueAt(i4);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return a.k(sb2, '}', "buffer.toString()");
    }

    public E valueAt(int i) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return (E) this.values[i];
    }

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m71clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        j.e(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int i, E e) {
        return (E) SparseArrayCompatKt.commonGet(this, i, e);
    }

    public boolean remove(int i, Object obj) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0 || !j.b(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i, E e, E e7) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0 || !j.b(this.values[iIndexOfKey], e)) {
            return false;
        }
        this.values[iIndexOfKey] = e7;
        return true;
    }

    public /* synthetic */ SparseArrayCompat(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 10 : i);
    }
}
