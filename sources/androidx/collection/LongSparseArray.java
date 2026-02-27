package androidx.collection;

import We.s;
import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

    public void append(long j, E e) {
        int i = this.size;
        if (i != 0 && j <= this.keys[i - 1]) {
            put(j, e);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i >= jArr.length) {
                Object[] objArr = this.values;
                int i4 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    Object obj = objArr[i6];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i6 != i4) {
                            jArr[i4] = jArr[i6];
                            objArr[i4] = obj;
                            objArr[i6] = null;
                        }
                        i4++;
                    }
                }
                this.garbage = false;
                this.size = i4;
            }
        }
        int i10 = this.size;
        if (i10 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i10 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        this.keys[i10] = j;
        this.values[i10] = e;
        this.size = i10 + 1;
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

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    public void delete(long j) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public E get(long j) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[iBinarySearch];
    }

    public int indexOfKey(long j) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j);
    }

    public int indexOfValue(E e) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
        }
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == e) {
                return i11;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        return this.keys[i];
    }

    public void put(long j, E e) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        if (i < this.size && this.values[i] == LongSparseArrayKt.DELETED) {
            this.keys[i] = j;
            this.values[i] = e;
            return;
        }
        if (this.garbage) {
            int i4 = this.size;
            long[] jArr = this.keys;
            if (i4 >= jArr.length) {
                Object[] objArr = this.values;
                int i6 = 0;
                for (int i10 = 0; i10 < i4; i10++) {
                    Object obj = objArr[i10];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i10 != i6) {
                            jArr[i6] = jArr[i10];
                            objArr[i6] = obj;
                            objArr[i10] = null;
                        }
                        i6++;
                    }
                }
                this.garbage = false;
                this.size = i6;
                i = ~ContainerHelpersKt.binarySearch(this.keys, i6, j);
            }
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i11 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iIdealLongArraySize);
            j.f(jArrCopyOf, "copyOf(this, newSize)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealLongArraySize);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.values = objArrCopyOf;
        }
        int i12 = this.size;
        if (i12 - i != 0) {
            long[] jArr2 = this.keys;
            int i13 = i + 1;
            C1127m.g(jArr2, jArr2, i13, i, i12);
            Object[] objArr2 = this.values;
            C1127m.h(objArr2, i13, objArr2, i, this.size);
        }
        this.keys[i] = j;
        this.values[i] = e;
        this.size++;
    }

    public void putAll(LongSparseArray<? extends E> other) {
        j.g(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            put(other.keyAt(i), other.valueAt(i));
        }
    }

    public E putIfAbsent(long j, E e) {
        E e7 = get(j);
        if (e7 == null) {
            put(j, e);
        }
        return e7;
    }

    public void remove(long j) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[iBinarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void removeAt(int i) {
        if (this.values[i] != LongSparseArrayKt.DELETED) {
            this.values[i] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public E replace(long j, E e) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e7 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e7;
    }

    public void setValueAt(int i, E e) {
        int i4;
        if (i < 0 || i >= (i4 = this.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        this.values[i] = e;
    }

    public int size() {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i4 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i6 != i4) {
                        jArr[i4] = jArr[i6];
                        objArr[i4] = obj;
                        objArr[i6] = null;
                    }
                    i4++;
                }
            }
            this.garbage = false;
            this.size = i4;
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
            if (eValueAt != sb2) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return a.k(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public E valueAt(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i10 = 0; i10 < i4; i10++) {
                Object obj = objArr[i10];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i10 != i6) {
                        jArr[i6] = jArr[i10];
                        objArr[i6] = obj;
                        objArr[i10] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        return (E) this.values[i];
    }

    public LongSparseArray(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealLongArraySize = ContainerHelpersKt.idealLongArraySize(i);
            this.keys = new long[iIdealLongArraySize];
            this.values = new Object[iIdealLongArraySize];
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m70clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        j.e(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) objClone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j, E e) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        return (iBinarySearch < 0 || this.values[iBinarySearch] == LongSparseArrayKt.DELETED) ? e : (E) this.values[iBinarySearch];
    }

    public boolean replace(long j, E e, E e7) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0 || !j.b(this.values[iIndexOfKey], e)) {
            return false;
        }
        this.values[iIndexOfKey] = e7;
        return true;
    }

    public boolean remove(long j, E e) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0 || !j.b(e, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 10 : i);
    }
}
