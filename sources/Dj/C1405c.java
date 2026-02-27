package dj;

import a.AbstractC0617a;
import cj.AbstractC1117c;
import cj.AbstractC1121g;
import cj.C1127m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: dj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1405c extends AbstractC1121g implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16515b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1405c f16516d;
    public final C1406d e;

    public C1405c(Object[] backing, int i, int i4, C1405c c1405c, C1406d root) {
        kotlin.jvm.internal.j.g(backing, "backing");
        kotlin.jvm.internal.j.g(root, "root");
        this.f16514a = backing;
        this.f16515b = i;
        this.c = i4;
        this.f16516d = c1405c;
        this.e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        e();
        d(this.f16515b + this.c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        f();
        e();
        int size = elements.size();
        c(this.f16515b + this.c, elements, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        C1406d c1406d = this.e;
        C1405c c1405c = this.f16516d;
        if (c1405c != null) {
            c1405c.c(i, collection, i4);
        } else {
            C1406d c1406d2 = C1406d.f16517d;
            c1406d.c(i, collection, i4);
        }
        this.f16514a = c1406d.f16518a;
        this.c += i4;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        e();
        h(this.f16515b, this.c);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C1406d c1406d = this.e;
        C1405c c1405c = this.f16516d;
        if (c1405c != null) {
            c1405c.d(i, obj);
        } else {
            C1406d c1406d2 = C1406d.f16517d;
            c1406d.d(i, obj);
        }
        this.f16514a = c1406d.f16518a;
        this.c++;
    }

    public final void e() {
        if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        e();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return AbstractC0617a.i(this.f16514a, this.f16515b, this.c, (List) obj);
        }
        return false;
    }

    public final void f() {
        if (this.e.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object g(int i) {
        Object objG;
        ((AbstractList) this).modCount++;
        C1405c c1405c = this.f16516d;
        if (c1405c != null) {
            objG = c1405c.g(i);
        } else {
            C1406d c1406d = C1406d.f16517d;
            objG = this.e.g(i);
        }
        this.c--;
        return objG;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        return this.f16514a[this.f16515b + i];
    }

    @Override // cj.AbstractC1121g
    public final int getSize() {
        e();
        return this.c;
    }

    public final void h(int i, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        C1405c c1405c = this.f16516d;
        if (c1405c != null) {
            c1405c.h(i, i4);
        } else {
            C1406d c1406d = C1406d.f16517d;
            this.e.h(i, i4);
        }
        this.c -= i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        e();
        Object[] objArr = this.f16514a;
        int i = this.c;
        int iHashCode = 1;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = objArr[this.f16515b + i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i4, Collection collection, boolean z4) {
        int i6;
        C1405c c1405c = this.f16516d;
        if (c1405c != null) {
            i6 = c1405c.i(i, i4, collection, z4);
        } else {
            C1406d c1406d = C1406d.f16517d;
            i6 = this.e.i(i, i4, collection, z4);
        }
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.c -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        e();
        for (int i = 0; i < this.c; i++) {
            if (kotlin.jvm.internal.j.b(this.f16514a[this.f16515b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        e();
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        for (int i = this.c - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.j.b(this.f16514a[this.f16515b + i], obj)) {
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
        f();
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
        f();
        e();
        return i(this.f16515b, this.c, elements, false) > 0;
    }

    @Override // cj.AbstractC1121g
    public final Object removeAt(int i) {
        f();
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        return g(this.f16515b + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        f();
        e();
        return i(this.f16515b, this.c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.b(i, i4);
        Object[] objArr = this.f16514a;
        int i6 = this.f16515b + i;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i4) {
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i6 = this.c;
        aVar.getClass();
        AbstractC1117c.a.d(i, i4, i6);
        return new C1405c(this.f16514a, this.f16515b + i, i4 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.g(array, "array");
        e();
        int length = array.length;
        int i = this.c;
        int i4 = this.f16515b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f16514a, i4, i + i4, array.getClass());
            kotlin.jvm.internal.j.f(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C1127m.h(this.f16514a, 0, array, i4, i + i4);
        int i6 = this.c;
        if (i6 < array.length) {
            array[i6] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        e();
        return AbstractC0617a.j(this.f16514a, this.f16515b, this.c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        return new C1404b(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        f();
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        d(this.f16515b + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        f();
        e();
        AbstractC1117c.a aVar = AbstractC1117c.Companion;
        int i4 = this.c;
        aVar.getClass();
        AbstractC1117c.a.c(i, i4);
        int size = elements.size();
        c(this.f16515b + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        e();
        Object[] objArr = this.f16514a;
        int i = this.c;
        int i4 = this.f16515b;
        return C1127m.l(i4, i + i4, objArr);
    }
}
