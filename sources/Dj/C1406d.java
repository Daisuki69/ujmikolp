package dj;

import a.AbstractC0617a;
import cj.AbstractC1117c;
import cj.AbstractC1121g;
import cj.C1127m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: dj.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1406d extends AbstractC1121g implements List, RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1406d f16517d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16519b;
    public boolean c;

    static {
        C1406d c1406d = new C1406d(0);
        c1406d.c = true;
        f16517d = c1406d;
    }

    public C1406d() {
        this((Object) null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i = this.f16519b;
        ((AbstractList) this).modCount++;
        f(i, 1);
        this.f16518a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        e();
        int size = elements.size();
        c(this.f16519b, elements, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        f(i, i4);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i4; i6++) {
            this.f16518a[i + i6] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        h(0, this.f16519b);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        f(i, 1);
        this.f16518a[i] = obj;
    }

    public final void e() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (AbstractC0617a.i(this.f16518a, 0, this.f16519b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, int i4) {
        int i6 = this.f16519b + i4;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f16518a;
        if (i6 > objArr.length) {
            AbstractC1117c.a aVar = AbstractC1117c.Companion;
            int length = objArr.length;
            aVar.getClass();
            int iE = AbstractC1117c.a.e(length, i6);
            Object[] objArr2 = this.f16518a;
            kotlin.jvm.internal.j.g(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            kotlin.jvm.internal.j.f(objArrCopyOf, "copyOf(...)");
            this.f16518a = objArrCopyOf;
        }
        Object[] objArr3 = this.f16518a;
        C1127m.h(objArr3, i + i4, objArr3, i, this.f16519b);
        this.f16519b += i4;
    }

    public final Object g(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f16518a;
        Object obj = objArr[i];
        C1127m.h(objArr, i, objArr, i + 1, this.f16519b);
        Object[] objArr2 = this.f16518a;
        int i4 = this.f16519b - 1;
        kotlin.jvm.internal.j.g(objArr2, "<this>");
        objArr2[i4] = null;
        this.f16519b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        return this.f16518a[i];
    }

    @Override // cj.AbstractC1121g
    public final int getSize() {
        return this.f16519b;
    }

    public final void h(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f16518a;
        C1127m.h(objArr, i, objArr, i + i4, this.f16519b);
        Object[] objArr2 = this.f16518a;
        int i6 = this.f16519b;
        AbstractC0617a.L(i6 - i4, i6, objArr2);
        this.f16519b -= i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f16518a;
        int i = this.f16519b;
        int iHashCode = 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i4, Collection collection, boolean z4) {
        int i6 = 0;
        int i10 = 0;
        while (i6 < i4) {
            int i11 = i + i6;
            if (collection.contains(this.f16518a[i11]) == z4) {
                Object[] objArr = this.f16518a;
                i6++;
                objArr[i10 + i] = objArr[i11];
                i10++;
            } else {
                i6++;
            }
        }
        int i12 = i4 - i10;
        Object[] objArr2 = this.f16518a;
        C1127m.h(objArr2, i + i10, objArr2, i4 + i, this.f16519b);
        Object[] objArr3 = this.f16518a;
        int i13 = this.f16519b;
        AbstractC0617a.L(i13 - i12, i13, objArr3);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f16519b -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f16519b; i++) {
            if (kotlin.jvm.internal.j.b(this.f16518a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f16519b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f16519b - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.j.b(this.f16518a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        e();
        return i(0, this.f16519b, elements, false) > 0;
    }

    @Override // cj.AbstractC1121g
    public final Object removeAt(int i) {
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        return g(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        e();
        return i(0, this.f16519b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        Object[] objArr = this.f16518a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i6 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.d(i, i4, i6);
        return new C1405c(this.f16518a, i, i4 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.g(array, "array");
        int length = array.length;
        int i = this.f16519b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f16518a, 0, i, array.getClass());
            kotlin.jvm.internal.j.f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C1127m.h(this.f16518a, 0, array, 0, i);
        int i4 = this.f16519b;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0617a.j(this.f16518a, 0, this.f16519b, this);
    }

    public /* synthetic */ C1406d(Object obj) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        return new C1404b(this, i);
    }

    public C1406d(int i) {
        if (i >= 0) {
            this.f16518a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        int size = elements.size();
        c(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.f16519b;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        ((AbstractList) this).modCount++;
        f(i, 1);
        this.f16518a[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return C1127m.l(0, this.f16519b, this.f16518a);
    }
}
