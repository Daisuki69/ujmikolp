package mx_android.support.v4.util;

/* JADX INFO: loaded from: classes7.dex */
public class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        E[] eArr = this.mElements;
        int length = eArr.length;
        int i = this.mHead;
        int i4 = length - i;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Too big");
        }
        Object[] objArr = new Object[i6];
        System.arraycopy(eArr, i, objArr, 0, i4);
        System.arraycopy(this.mElements, 0, objArr, i4, this.mHead);
        this.mElements = (E[]) objArr;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i6 - 1;
    }

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        i = Integer.bitCount(i) != 1 ? 1 << (Integer.highestOneBit(i) + 1) : i;
        this.mCapacityBitmask = i - 1;
        this.mElements = (E[]) new Object[i];
    }

    public final void addFirst(E e) {
        int i = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i;
        this.mElements[i] = e;
        if (i == this.mTail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e) {
        E[] eArr = this.mElements;
        int i = this.mTail;
        eArr[i] = e;
        int i4 = this.mCapacityBitmask & (i + 1);
        this.mTail = i4;
        if (i4 == this.mHead) {
            doubleCapacity();
        }
    }

    public final E popFirst() {
        int i = this.mHead;
        if (i == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.mElements;
        E e = eArr[i];
        eArr[i] = null;
        this.mHead = (i + 1) & this.mCapacityBitmask;
        return e;
    }

    public final E popLast() {
        int i = this.mHead;
        int i4 = this.mTail;
        if (i == i4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.mCapacityBitmask & (i4 - 1);
        E[] eArr = this.mElements;
        E e = eArr[i6];
        eArr[i6] = null;
        this.mTail = i6;
        return e;
    }

    public final E getFirst() {
        int i = this.mHead;
        if (i == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[i];
    }

    public final E getLast() {
        int i = this.mHead;
        int i4 = this.mTail;
        if (i == i4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(i4 - 1) & this.mCapacityBitmask];
    }

    public final E get(int i) {
        if (i < 0 || i >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i)];
    }

    public final int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }

    public final boolean isEmpty() {
        return this.mHead == this.mTail;
    }
}
