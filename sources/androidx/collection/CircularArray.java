package androidx.collection;

import cj.C1127m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, null);
    }

    private final void doubleCapacity() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i = this.head;
        int i4 = length - i;
        int i6 = length << 1;
        if (i6 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i6];
        C1127m.h(eArr, 0, eArr2, i, length);
        C1127m.h(this.elements, i4, eArr2, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i6 - 1;
    }

    public final void addFirst(E e) {
        int i = (this.head - 1) & this.capacityBitmask;
        this.head = i;
        this.elements[i] = e;
        if (i == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E e) {
        E[] eArr = this.elements;
        int i = this.tail;
        eArr[i] = e;
        int i4 = this.capacityBitmask & (i + 1);
        this.tail = i4;
        if (i4 == this.head) {
            doubleCapacity();
        }
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final E get(int i) {
        if (i < 0 || i >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[this.capacityBitmask & (this.head + i)];
        j.d(e);
        return e;
    }

    public final E getFirst() {
        int i = this.head;
        if (i == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[i];
        j.d(e);
        return e;
    }

    public final E getLast() {
        int i = this.head;
        int i4 = this.tail;
        if (i == i4) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[(i4 - 1) & this.capacityBitmask];
        j.d(e);
        return e;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }

    public final E popFirst() {
        int i = this.head;
        if (i == this.tail) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e = eArr[i];
        eArr[i] = null;
        this.head = (i + 1) & this.capacityBitmask;
        return e;
    }

    public final E popLast() {
        int i = this.head;
        int i4 = this.tail;
        if (i == i4) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = this.capacityBitmask & (i4 - 1);
        E[] eArr = this.elements;
        E e = eArr[i6];
        eArr[i6] = null;
        this.tail = i6;
        return e;
    }

    public final void removeFromEnd(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.tail;
        int i6 = i < i4 ? i4 - i : 0;
        for (int i10 = i6; i10 < i4; i10++) {
            this.elements[i10] = null;
        }
        int i11 = this.tail;
        int i12 = i11 - i6;
        int i13 = i - i12;
        this.tail = i11 - i12;
        if (i13 > 0) {
            int length = this.elements.length;
            this.tail = length;
            int i14 = length - i13;
            for (int i15 = i14; i15 < length; i15++) {
                this.elements[i15] = null;
            }
            this.tail = i14;
        }
    }

    public final void removeFromStart(int i) {
        if (i <= 0) {
            return;
        }
        if (i > size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.elements.length;
        int i4 = this.head;
        if (i < length - i4) {
            length = i4 + i;
        }
        while (i4 < length) {
            this.elements[i4] = null;
            i4++;
        }
        int i6 = this.head;
        int i10 = length - i6;
        int i11 = i - i10;
        this.head = this.capacityBitmask & (i6 + i10);
        if (i11 > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                this.elements[i12] = null;
            }
            this.head = i11;
        }
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public CircularArray(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = (E[]) new Object[i];
    }

    public /* synthetic */ CircularArray(int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 8 : i);
    }
}
