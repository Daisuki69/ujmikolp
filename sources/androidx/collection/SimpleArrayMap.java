package androidx.collection;

import We.s;
import androidx.camera.core.impl.a;
import androidx.collection.internal.ContainerHelpersKt;
import cj.C1127m;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t5) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (T) this.array[(iIndexOfKey << 1) + 1] : t5;
    }

    private final int indexOf(K k8, int i) {
        int i4 = this.size;
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i4, i);
        if (iBinarySearch < 0 || j.b(k8, this.array[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i6 = iBinarySearch + 1;
        while (i6 < i4 && this.hashes[i6] == i) {
            if (j.b(k8, this.array[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i10 = iBinarySearch - 1; i10 >= 0 && this.hashes[i10] == i; i10--) {
            if (j.b(k8, this.array[i10 << 1])) {
                return i10;
            }
        }
        return ~i6;
    }

    private final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i4 = iBinarySearch + 1;
        while (i4 < i && this.hashes[i4] == 0) {
            if (this.array[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i6 = iBinarySearch - 1; i6 >= 0 && this.hashes[i6] == 0; i6--) {
            if (this.array[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i4;
    }

    public final int __restricted$indexOfValue(V v7) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (v7 == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (v7.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k8) {
        return indexOfKey(k8) >= 0;
    }

    public boolean containsValue(V v7) {
        return __restricted$indexOfValue(v7) >= 0;
    }

    public void ensureCapacity(int i) {
        int i4 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i * 2);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
        }
        if (this.size != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this.size;
                for (int i4 = 0; i4 < i; i4++) {
                    K kKeyAt = keyAt(i4);
                    V vValueAt = valueAt(i4);
                    Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i6 = this.size;
            for (int i10 = 0; i10 < i6; i10++) {
                K kKeyAt2 = keyAt(i10);
                V vValueAt2 = valueAt(i10);
                Object obj3 = ((Map) obj).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!vValueAt2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k8) {
        int iIndexOfKey = indexOfKey(k8);
        if (iIndexOfKey >= 0) {
            return (V) this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v7) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : v7;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i4 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i4];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i6];
            i6++;
            i4 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K k8) {
        return k8 == null ? indexOfNull() : indexOf(k8, k8.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (K) this.array[i << 1];
    }

    public V put(K k8, V v7) {
        int i = this.size;
        int iHashCode = k8 != null ? k8.hashCode() : 0;
        int iIndexOf = k8 != null ? indexOf(k8, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i4 = (iIndexOf << 1) + 1;
            Object[] objArr = this.array;
            V v8 = (V) objArr[i4];
            objArr[i4] = v7;
            return v8;
        }
        int i6 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i10 = 8;
            if (i >= 8) {
                i10 = (i >> 1) + i;
            } else if (i < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i10 << 1);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i) {
            int[] iArr2 = this.hashes;
            int i11 = i6 + 1;
            C1127m.e(i11, i6, i, iArr2, iArr2);
            Object[] objArr2 = this.array;
            C1127m.h(objArr2, i11 << 1, objArr2, i6 << 1, this.size << 1);
        }
        int i12 = this.size;
        if (i == i12) {
            int[] iArr3 = this.hashes;
            if (i6 < iArr3.length) {
                iArr3[i6] = iHashCode;
                Object[] objArr3 = this.array;
                int i13 = i6 << 1;
                objArr3[i13] = k8;
                objArr3[i13 + 1] = v7;
                this.size = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        j.g(map, "map");
        int i = map.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(map.keyAt(i4), map.valueAt(i4));
            }
        } else if (i > 0) {
            C1127m.e(0, 0, i, map.hashes, this.hashes);
            C1127m.h(map.array, 0, this.array, 0, i << 1);
            this.size = i;
        }
    }

    public V putIfAbsent(K k8, V v7) {
        V v8 = get(k8);
        return v8 == null ? put(k8, v7) : v8;
    }

    public V remove(K k8) {
        int iIndexOfKey = indexOfKey(k8);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        int i4;
        if (i < 0 || i >= (i4 = this.size)) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.array;
        int i6 = i << 1;
        V v7 = (V) objArr[i6 + 1];
        if (i4 <= 1) {
            clear();
            return v7;
        }
        int i10 = i4 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i < i10) {
                int i11 = i + 1;
                C1127m.e(i, i11, i4, iArr, iArr);
                Object[] objArr2 = this.array;
                C1127m.h(objArr2, i6, objArr2, i11 << 1, i4 << 1);
            }
            Object[] objArr3 = this.array;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            j.f(iArrCopyOf, "copyOf(this, newSize)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i13 << 1);
            j.f(objArrCopyOf, "copyOf(this, newSize)");
            this.array = objArrCopyOf;
            if (i4 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                C1127m.e(0, 0, i, iArr, this.hashes);
                C1127m.h(objArr, 0, this.array, 0, i6);
            }
            if (i < i10) {
                int i14 = i + 1;
                C1127m.e(i, i14, i4, iArr, this.hashes);
                C1127m.h(objArr, i6, this.array, i14 << 1, i4 << 1);
            }
        }
        if (i4 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i10;
        return v7;
    }

    public V replace(K k8, V v7) {
        int iIndexOfKey = indexOfKey(k8);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v7);
        }
        return null;
    }

    public V setValueAt(int i, V v7) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i4 = (i << 1) + 1;
        Object[] objArr = this.array;
        V v8 = (V) objArr[i4];
        objArr[i4] = v7;
        return v8;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i = this.size;
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 > 0) {
                sb2.append(", ");
            }
            K kKeyAt = keyAt(i4);
            if (kKeyAt != sb2) {
                sb2.append(kKeyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vValueAt = valueAt(i4);
            if (vValueAt != sb2) {
                sb2.append(vValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return a.k(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public V valueAt(int i) {
        if (i < 0 || i >= this.size) {
            throw new IllegalArgumentException(s.f(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return (V) this.array[(i << 1) + 1];
    }

    public SimpleArrayMap(int i) {
        this.hashes = i == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i];
        this.array = i == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i << 1];
    }

    public boolean remove(K k8, V v7) {
        int iIndexOfKey = indexOfKey(k8);
        if (iIndexOfKey < 0 || !j.b(v7, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K k8, V v7, V v8) {
        int iIndexOfKey = indexOfKey(k8);
        if (iIndexOfKey < 0 || !j.b(v7, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, v8);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
