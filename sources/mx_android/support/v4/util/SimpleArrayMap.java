package mx_android.support.v4.util;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    int indexOf(Object obj, int i) {
        int i4 = this.mSize;
        if (i4 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpers.binarySearch(this.mHashes, i4, i);
        if (iBinarySearch < 0 || obj.equals(this.mArray[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i6 = iBinarySearch + 1;
        while (i6 < i4 && this.mHashes[i6] == i) {
            if (obj.equals(this.mArray[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i10 = iBinarySearch - 1; i10 >= 0 && this.mHashes[i10] == i; i10--) {
            if (obj.equals(this.mArray[i10 << 1])) {
                return i10;
            }
        }
        return i6 ^ (-1);
    }

    int indexOfNull() {
        int i = this.mSize;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpers.binarySearch(this.mHashes, i, 0);
        if (iBinarySearch < 0 || this.mArray[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i4 = iBinarySearch + 1;
        while (i4 < i && this.mHashes[i4] == 0) {
            if (this.mArray[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i6 = iBinarySearch - 1; i6 >= 0 && this.mHashes[i6] == 0; i6--) {
            if (this.mArray[i6 << 1] == null) {
                return i6;
            }
        }
        return i4 ^ (-1);
    }

    private void allocArrays(int i) {
        if (i == 8) {
            synchronized (ArrayMap.class) {
                Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArrayMap.class) {
                Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i];
        this.mArray = new Object[i << 1];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i4 = (i << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i6 = (i << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i);
        }
        this.mSize = 0;
    }

    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this();
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    public void clear() {
        int i = this.mSize;
        if (i != 0) {
            freeArrays(this.mHashes, this.mArray, i);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        }
    }

    public void ensureCapacity(int i) {
        int[] iArr = this.mHashes;
        if (iArr.length < i) {
            Object[] objArr = this.mArray;
            allocArrays(i);
            int i4 = this.mSize;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i4);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize << 1);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    int indexOfValue(Object obj) {
        int i = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i4 = 1; i4 < i; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public V get(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return (V) this.mArray[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public K keyAt(int i) {
        return (K) this.mArray[i << 1];
    }

    public V valueAt(int i) {
        return (V) this.mArray[(i << 1) + 1];
    }

    public V setValueAt(int i, V v7) {
        int i4 = (i << 1) + 1;
        Object[] objArr = this.mArray;
        V v8 = (V) objArr[i4];
        objArr[i4] = v7;
        return v8;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public V put(K k8, V v7) {
        int i;
        int iIndexOf;
        if (k8 == null) {
            iIndexOf = indexOfNull();
            i = 0;
        } else {
            int iHashCode = k8.hashCode();
            i = iHashCode;
            iIndexOf = indexOf(k8, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i4 = (iIndexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v8 = (V) objArr[i4];
            objArr[i4] = v7;
            return v8;
        }
        int i6 = iIndexOf ^ (-1);
        int i10 = this.mSize;
        int[] iArr = this.mHashes;
        if (i10 >= iArr.length) {
            int i11 = 4;
            if (i10 >= 8) {
                i11 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i11 = 8;
            }
            Object[] objArr2 = this.mArray;
            allocArrays(i11);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, this.mSize);
        }
        int i12 = this.mSize;
        if (i6 < i12) {
            int[] iArr3 = this.mHashes;
            int i13 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i13, i12 - i6);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i6 << 1, objArr3, i13 << 1, (this.mSize - i6) << 1);
        }
        this.mHashes[i6] = i;
        Object[] objArr4 = this.mArray;
        int i14 = i6 << 1;
        objArr4[i14] = k8;
        objArr4[i14 + 1] = v7;
        this.mSize++;
        return null;
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i);
        if (this.mSize != 0) {
            for (int i4 = 0; i4 < i; i4++) {
                put(simpleArrayMap.keyAt(i4), simpleArrayMap.valueAt(i4));
            }
        } else if (i > 0) {
            System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i);
            System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i << 1);
            this.mSize = i;
        }
    }

    public V remove(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        Object[] objArr = this.mArray;
        int i4 = i << 1;
        V v7 = (V) objArr[i4 + 1];
        int i6 = this.mSize;
        if (i6 <= 1) {
            freeArrays(this.mHashes, objArr, i6);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && i6 < iArr.length / 3) {
                allocArrays(i6 > 8 ? i6 + (i6 >> 1) : 8);
                this.mSize--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i);
                    System.arraycopy(objArr, 0, this.mArray, 0, i4);
                }
                int i10 = this.mSize;
                if (i < i10) {
                    int i11 = i + 1;
                    System.arraycopy(iArr, i11, this.mHashes, i, i10 - i);
                    System.arraycopy(objArr, i11 << 1, this.mArray, i4, (this.mSize - i) << 1);
                }
            } else {
                int i12 = i6 - 1;
                this.mSize = i12;
                if (i < i12) {
                    int i13 = i + 1;
                    System.arraycopy(iArr, i13, iArr, i, i12 - i);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i13 << 1, objArr2, i4, (this.mSize - i) << 1);
                }
                Object[] objArr3 = this.mArray;
                int i14 = this.mSize;
                objArr3[i14 << 1] = null;
                objArr3[(i14 << 1) + 1] = null;
            }
        }
        return v7;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.mSize; i++) {
                try {
                    K kKeyAt = keyAt(i);
                    V vValueAt = valueAt(i);
                    Object obj2 = map.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !map.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i = this.mSize;
        int i4 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i4];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i4 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(this.mSize * 28);
        sb2.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            K kKeyAt = keyAt(i);
            if (kKeyAt != this) {
                sb2.append(kKeyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vValueAt = valueAt(i);
            if (vValueAt != this) {
                sb2.append(vValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
