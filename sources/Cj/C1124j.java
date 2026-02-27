package cj;

import cj.AbstractC1117c;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cj.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1124j<E> extends AbstractC1121g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9391d = new a(null);
    public static final Object[] e = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f9393b;
    public int c;

    /* JADX INFO: renamed from: cj.j$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C1124j() {
        this.f9393b = e;
    }

    public final void a(int i, Collection collection) {
        Iterator<E> it = collection.iterator();
        int length = this.f9393b.length;
        while (i < length && it.hasNext()) {
            this.f9393b[i] = it.next();
            i++;
        }
        int i4 = this.f9392a;
        for (int i6 = 0; i6 < i4 && it.hasNext(); i6++) {
            this.f9393b[i6] = it.next();
        }
        this.c = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        i();
        c(elements.size() + size());
        a(h(size() + this.f9392a), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        c(size() + 1);
        int length = this.f9392a;
        if (length == 0) {
            Object[] objArr = this.f9393b;
            kotlin.jvm.internal.j.g(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f9392a = i;
        this.f9393b[i] = obj;
        this.c = size() + 1;
    }

    public final void addLast(Object obj) {
        i();
        c(size() + 1);
        this.f9393b[h(size() + this.f9392a)] = obj;
        this.c = size() + 1;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9393b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            if (i < 10) {
                i = 10;
            }
            this.f9393b = new Object[i];
            return;
        }
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int length = objArr.length;
        aVar.getClass();
        Object[] objArr2 = new Object[AbstractC1117c.a.e(length, i)];
        Object[] objArr3 = this.f9393b;
        C1127m.h(objArr3, 0, objArr2, this.f9392a, objArr3.length);
        Object[] objArr4 = this.f9393b;
        int length2 = objArr4.length;
        int i4 = this.f9392a;
        C1127m.h(objArr4, length2 - i4, objArr2, 0, i4);
        this.f9392a = 0;
        this.f9393b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f9392a, h(size() + this.f9392a));
        }
        this.f9392a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        kotlin.jvm.internal.j.g(this.f9393b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f9393b[h(C1132s.f(this) + this.f9392a)];
    }

    public final int f(int i) {
        return i < 0 ? i + this.f9393b.length : i;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9393b[this.f9392a];
    }

    public final void g(int i, int i4) {
        if (i < i4) {
            C1127m.m(this.f9393b, null, i, i4);
            return;
        }
        Object[] objArr = this.f9393b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        C1127m.m(this.f9393b, null, 0, i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.b(i, size);
        return this.f9393b[h(this.f9392a + i)];
    }

    @Override // cj.AbstractC1121g
    public final int getSize() {
        return this.c;
    }

    public final int h(int i) {
        Object[] objArr = this.f9393b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iH = h(size() + this.f9392a);
        int length = this.f9392a;
        if (length < iH) {
            while (length < iH) {
                if (kotlin.jvm.internal.j.b(obj, this.f9393b[length])) {
                    i = this.f9392a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.f9393b.length;
        while (true) {
            if (length >= length2) {
                for (int i4 = 0; i4 < iH; i4++) {
                    if (kotlin.jvm.internal.j.b(obj, this.f9393b[i4])) {
                        length = i4 + this.f9393b.length;
                        i = this.f9392a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.b(obj, this.f9393b[length])) {
                i = this.f9392a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f9393b[h(C1132s.f(this) + this.f9392a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iH = h(size() + this.f9392a);
        int i4 = this.f9392a;
        if (i4 < iH) {
            length = iH - 1;
            if (i4 <= length) {
                while (!kotlin.jvm.internal.j.b(obj, this.f9393b[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f9392a;
                return length - i;
            }
            return -1;
        }
        if (i4 > iH) {
            int i6 = iH - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f9393b;
                    kotlin.jvm.internal.j.g(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f9392a;
                    if (i10 <= length) {
                        while (!kotlin.jvm.internal.j.b(obj, this.f9393b[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i = this.f9392a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.b(obj, this.f9393b[i6])) {
                        length = i6 + this.f9393b.length;
                        i = this.f9392a;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iH;
        kotlin.jvm.internal.j.g(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f9393b.length != 0) {
            int iH2 = h(size() + this.f9392a);
            int i = this.f9392a;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.f9393b[i];
                    if (elements.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f9393b[iH] = obj;
                        iH++;
                    }
                    i++;
                }
                C1127m.m(this.f9393b, null, iH, iH2);
            } else {
                int length = this.f9393b.length;
                boolean z5 = false;
                int i4 = i;
                while (i < length) {
                    Object[] objArr = this.f9393b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f9393b[i4] = obj2;
                        i4++;
                    }
                    i++;
                }
                iH = h(i4);
                for (int i6 = 0; i6 < iH2; i6++) {
                    Object[] objArr2 = this.f9393b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f9393b[iH] = obj3;
                        iH = d(iH);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                i();
                this.c = f(iH - this.f9392a);
            }
        }
        return z4;
    }

    @Override // cj.AbstractC1121g
    public final Object removeAt(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.b(i, size);
        if (i == C1132s.f(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        i();
        int iH = h(this.f9392a + i);
        Object obj = this.f9393b[iH];
        if (i < (size() >> 1)) {
            int i4 = this.f9392a;
            if (iH >= i4) {
                Object[] objArr = this.f9393b;
                C1127m.h(objArr, i4 + 1, objArr, i4, iH);
            } else {
                Object[] objArr2 = this.f9393b;
                C1127m.h(objArr2, 1, objArr2, 0, iH);
                Object[] objArr3 = this.f9393b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f9392a;
                C1127m.h(objArr3, i6 + 1, objArr3, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9393b;
            int i10 = this.f9392a;
            objArr4[i10] = null;
            this.f9392a = d(i10);
        } else {
            int iH2 = h(C1132s.f(this) + this.f9392a);
            if (iH <= iH2) {
                Object[] objArr5 = this.f9393b;
                C1127m.h(objArr5, iH, objArr5, iH + 1, iH2 + 1);
            } else {
                Object[] objArr6 = this.f9393b;
                C1127m.h(objArr6, iH, objArr6, iH + 1, objArr6.length);
                Object[] objArr7 = this.f9393b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C1127m.h(objArr7, 0, objArr7, 1, iH2 + 1);
            }
            this.f9393b[iH2] = null;
        }
        this.c = size() - 1;
        return obj;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.f9393b;
        int i = this.f9392a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f9392a = d(i);
        this.c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h(C1132s.f(this) + this.f9392a);
        Object[] objArr = this.f9393b;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.d(i, i4, size);
        int i6 = i4 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == size()) {
            clear();
            return;
        }
        if (i6 == 1) {
            remove(i);
            return;
        }
        i();
        if (i < size() - i4) {
            int iH = h((i - 1) + this.f9392a);
            int iH2 = h((i4 - 1) + this.f9392a);
            while (i > 0) {
                int i10 = iH + 1;
                int iMin = Math.min(i, Math.min(i10, iH2 + 1));
                Object[] objArr = this.f9393b;
                int i11 = iH2 - iMin;
                int i12 = iH - iMin;
                C1127m.h(objArr, i11 + 1, objArr, i12 + 1, i10);
                iH = f(i12);
                iH2 = f(i11);
                i -= iMin;
            }
            int iH3 = h(this.f9392a + i6);
            g(this.f9392a, iH3);
            this.f9392a = iH3;
        } else {
            int iH4 = h(this.f9392a + i4);
            int iH5 = h(this.f9392a + i);
            int size2 = size();
            while (true) {
                size2 -= i4;
                if (size2 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f9393b;
                i4 = Math.min(size2, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.f9393b;
                int i13 = iH4 + i4;
                C1127m.h(objArr3, iH5, objArr3, iH4, i13);
                iH4 = h(i13);
                iH5 = h(iH5 + i4);
            }
            int iH6 = h(size() + this.f9392a);
            g(f(iH6 - i6), iH6);
        }
        this.c = size() - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iH;
        kotlin.jvm.internal.j.g(elements, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f9393b.length != 0) {
            int iH2 = h(size() + this.f9392a);
            int i = this.f9392a;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.f9393b[i];
                    if (elements.contains(obj)) {
                        this.f9393b[iH] = obj;
                        iH++;
                    } else {
                        z4 = true;
                    }
                    i++;
                }
                C1127m.m(this.f9393b, null, iH, iH2);
            } else {
                int length = this.f9393b.length;
                boolean z5 = false;
                int i4 = i;
                while (i < length) {
                    Object[] objArr = this.f9393b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f9393b[i4] = obj2;
                        i4++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                iH = h(i4);
                for (int i6 = 0; i6 < iH2; i6++) {
                    Object[] objArr2 = this.f9393b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f9393b[iH] = obj3;
                        iH = d(iH);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                i();
                this.c = f(iH - this.f9392a);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.b(i, size);
        int iH = h(this.f9392a + i);
        Object[] objArr = this.f9393b;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.g(array, "array");
        if (array.length < size()) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), size());
            kotlin.jvm.internal.j.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        Object[] objArr = array;
        int iH = h(size() + this.f9392a);
        int i = this.f9392a;
        if (i < iH) {
            C1127m.j(this.f9393b, objArr, 0, i, iH, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f9393b;
            C1127m.h(objArr2, 0, objArr, this.f9392a, objArr2.length);
            Object[] objArr3 = this.f9393b;
            C1127m.h(objArr3, objArr3.length - this.f9392a, objArr, 0, iH);
        }
        int size = size();
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.c(i, size);
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        i();
        c(size() + 1);
        int iH = h(this.f9392a + i);
        if (i < ((size() + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.f9393b;
                kotlin.jvm.internal.j.g(objArr, "<this>");
                iH = objArr.length;
            }
            int i4 = iH - 1;
            int i6 = this.f9392a;
            if (i6 == 0) {
                Object[] objArr2 = this.f9393b;
                kotlin.jvm.internal.j.g(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i10 = this.f9392a;
            if (i4 >= i10) {
                Object[] objArr3 = this.f9393b;
                objArr3[length] = objArr3[i10];
                C1127m.h(objArr3, i10, objArr3, i10 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.f9393b;
                C1127m.h(objArr4, i10 - 1, objArr4, i10, objArr4.length);
                Object[] objArr5 = this.f9393b;
                objArr5[objArr5.length - 1] = objArr5[0];
                C1127m.h(objArr5, 0, objArr5, 1, i4 + 1);
            }
            this.f9393b[i4] = obj;
            this.f9392a = length;
        } else {
            int iH2 = h(size() + this.f9392a);
            if (iH < iH2) {
                Object[] objArr6 = this.f9393b;
                C1127m.h(objArr6, iH + 1, objArr6, iH, iH2);
            } else {
                Object[] objArr7 = this.f9393b;
                C1127m.h(objArr7, 1, objArr7, 0, iH2);
                Object[] objArr8 = this.f9393b;
                objArr8[0] = objArr8[objArr8.length - 1];
                C1127m.h(objArr8, iH + 1, objArr8, iH, objArr8.length - 1);
            }
            this.f9393b[iH] = obj;
        }
        this.c = size() + 1;
    }

    public C1124j(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(We.s.f(i, "Illegal Capacity: "));
        }
        this.f9393b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int size = size();
        aVar.getClass();
        AbstractC1117c.a.c(i, size);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        i();
        c(elements.size() + size());
        int iH = h(size() + this.f9392a);
        int iH2 = h(this.f9392a + i);
        int size2 = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i4 = this.f9392a;
            int length = i4 - size2;
            if (iH2 < i4) {
                Object[] objArr = this.f9393b;
                C1127m.h(objArr, length, objArr, i4, objArr.length);
                if (size2 >= iH2) {
                    Object[] objArr2 = this.f9393b;
                    C1127m.h(objArr2, objArr2.length - size2, objArr2, 0, iH2);
                } else {
                    Object[] objArr3 = this.f9393b;
                    C1127m.h(objArr3, objArr3.length - size2, objArr3, 0, size2);
                    Object[] objArr4 = this.f9393b;
                    C1127m.h(objArr4, 0, objArr4, size2, iH2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f9393b;
                C1127m.h(objArr5, length, objArr5, i4, iH2);
            } else {
                Object[] objArr6 = this.f9393b;
                length += objArr6.length;
                int i6 = iH2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i6) {
                    C1127m.h(objArr6, length, objArr6, i4, iH2);
                } else {
                    C1127m.h(objArr6, length, objArr6, i4, i4 + length2);
                    Object[] objArr7 = this.f9393b;
                    C1127m.h(objArr7, 0, objArr7, this.f9392a + length2, iH2);
                }
            }
            this.f9392a = length;
            a(f(iH2 - size2), elements);
            return true;
        }
        int i10 = iH2 + size2;
        if (iH2 < iH) {
            int i11 = size2 + iH;
            Object[] objArr8 = this.f9393b;
            if (i11 <= objArr8.length) {
                C1127m.h(objArr8, i10, objArr8, iH2, iH);
            } else if (i10 >= objArr8.length) {
                C1127m.h(objArr8, i10 - objArr8.length, objArr8, iH2, iH);
            } else {
                int length3 = iH - (i11 - objArr8.length);
                C1127m.h(objArr8, 0, objArr8, length3, iH);
                Object[] objArr9 = this.f9393b;
                C1127m.h(objArr9, i10, objArr9, iH2, length3);
            }
        } else {
            Object[] objArr10 = this.f9393b;
            C1127m.h(objArr10, size2, objArr10, 0, iH);
            Object[] objArr11 = this.f9393b;
            if (i10 >= objArr11.length) {
                C1127m.h(objArr11, i10 - objArr11.length, objArr11, iH2, objArr11.length);
            } else {
                C1127m.h(objArr11, 0, objArr11, objArr11.length - size2, objArr11.length);
                Object[] objArr12 = this.f9393b;
                C1127m.h(objArr12, i10, objArr12, iH2, objArr12.length - size2);
            }
        }
        a(iH2, elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
