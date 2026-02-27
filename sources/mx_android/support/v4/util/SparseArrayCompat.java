package mx_android.support.v4.util;

import com.tencent.youtu.sdkkitframework.common.WeJson;

/* JADX INFO: loaded from: classes7.dex */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i);
            this.mKeys = new int[iIdealIntArraySize];
            this.mValues = new Object[iIdealIntArraySize];
        }
        this.mSize = 0;
    }

    public SparseArrayCompat<E> clone() {
        SparseArrayCompat<E> sparseArrayCompat = null;
        try {
            SparseArrayCompat<E> sparseArrayCompat2 = (SparseArrayCompat) super.clone();
            try {
                sparseArrayCompat2.mKeys = (int[]) this.mKeys.clone();
                sparseArrayCompat2.mValues = (Object[]) this.mValues.clone();
                return sparseArrayCompat2;
            } catch (CloneNotSupportedException unused) {
                sparseArrayCompat = sparseArrayCompat2;
                return sparseArrayCompat;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public E get(int i) {
        return get(i, null);
    }

    public E get(int i, E e) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[iBinarySearch] != DELETED) {
                return (E) objArr[iBinarySearch];
            }
        }
        return e;
    }

    public void delete(int i) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public void remove(int i) {
        delete(i);
    }

    public void removeAt(int i) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int i, int i4) {
        int iMin = Math.min(this.mSize, i4 + i);
        while (i < iMin) {
            removeAt(i);
            i++;
        }
    }

    private void gc() {
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
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
        this.mGarbage = false;
        this.mSize = i4;
    }

    public void put(int i, E e) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e;
            return;
        }
        int iBinarySearch2 = iBinarySearch ^ (-1);
        int i4 = this.mSize;
        if (iBinarySearch2 < i4) {
            Object[] objArr = this.mValues;
            if (objArr[iBinarySearch2] == DELETED) {
                this.mKeys[iBinarySearch2] = i;
                objArr[iBinarySearch2] = e;
                return;
            }
        }
        if (this.mGarbage && i4 >= this.mKeys.length) {
            gc();
            iBinarySearch2 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i) ^ (-1);
        }
        int i6 = this.mSize;
        if (i6 >= this.mKeys.length) {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i6 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr2 = new Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i10 = this.mSize;
        if (i10 - iBinarySearch2 != 0) {
            int[] iArr3 = this.mKeys;
            int i11 = iBinarySearch2 + 1;
            System.arraycopy(iArr3, iBinarySearch2, iArr3, i11, i10 - iBinarySearch2);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, iBinarySearch2, objArr4, i11, this.mSize - iBinarySearch2);
        }
        this.mKeys[iBinarySearch2] = i;
        this.mValues[iBinarySearch2] = e;
        this.mSize++;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i];
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i];
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i] = e;
    }

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i4 = 0; i4 < i; i4++) {
            objArr[i4] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void append(int i, E e) {
        int i4 = this.mSize;
        if (i4 != 0 && i <= this.mKeys[i4 - 1]) {
            put(i, e);
            return;
        }
        if (this.mGarbage && i4 >= this.mKeys.length) {
            gc();
        }
        int i6 = this.mSize;
        if (i6 >= this.mKeys.length) {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i6 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr = new Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i6] = i;
        this.mValues[i6] = e;
        this.mSize = i6 + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return WeJson.EMPTY_MAP;
        }
        StringBuilder sb2 = new StringBuilder(this.mSize * 28);
        sb2.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb2.append(", ");
            }
            sb2.append(keyAt(i));
            sb2.append('=');
            E eValueAt = valueAt(i);
            if (eValueAt != this) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
