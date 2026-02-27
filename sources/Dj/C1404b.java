package dj;

import cj.AbstractC1121g;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import rj.InterfaceC2210a;

/* JADX INFO: renamed from: dj.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1404b implements ListIterator, InterfaceC2210a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16512b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16513d;
    public final AbstractC1121g e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16511a = 0;
    public int c = -1;

    public C1404b(C1406d c1406d, int i) {
        this.e = c1406d;
        this.f16512b = i;
        this.f16513d = ((AbstractList) c1406d).modCount;
    }

    public void a() {
        if (((AbstractList) ((C1405c) this.e).e).modCount != this.f16513d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f16511a) {
            case 0:
                a();
                int i = this.f16512b;
                this.f16512b = i + 1;
                C1405c c1405c = (C1405c) this.e;
                c1405c.add(i, obj);
                this.c = -1;
                this.f16513d = ((AbstractList) c1405c).modCount;
                break;
            default:
                b();
                int i4 = this.f16512b;
                this.f16512b = i4 + 1;
                C1406d c1406d = (C1406d) this.e;
                c1406d.add(i4, obj);
                this.c = -1;
                this.f16513d = ((AbstractList) c1406d).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((C1406d) this.e)).modCount != this.f16513d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16511a) {
            case 0:
                if (this.f16512b < ((C1405c) this.e).c) {
                }
                break;
            default:
                if (this.f16512b < ((C1406d) this.e).f16519b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f16511a) {
            case 0:
                if (this.f16512b > 0) {
                }
                break;
            default:
                if (this.f16512b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f16511a) {
            case 0:
                a();
                int i = this.f16512b;
                C1405c c1405c = (C1405c) this.e;
                if (i >= c1405c.c) {
                    throw new NoSuchElementException();
                }
                this.f16512b = i + 1;
                this.c = i;
                return c1405c.f16514a[c1405c.f16515b + i];
            default:
                b();
                int i4 = this.f16512b;
                C1406d c1406d = (C1406d) this.e;
                if (i4 >= c1406d.f16519b) {
                    throw new NoSuchElementException();
                }
                this.f16512b = i4 + 1;
                this.c = i4;
                return c1406d.f16518a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f16511a) {
        }
        return this.f16512b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f16511a) {
            case 0:
                a();
                int i = this.f16512b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i - 1;
                this.f16512b = i4;
                this.c = i4;
                C1405c c1405c = (C1405c) this.e;
                return c1405c.f16514a[c1405c.f16515b + i4];
            default:
                b();
                int i6 = this.f16512b;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i6 - 1;
                this.f16512b = i10;
                this.c = i10;
                return ((C1406d) this.e).f16518a[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f16511a) {
        }
        return this.f16512b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f16511a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C1405c c1405c = (C1405c) this.e;
                c1405c.remove(i);
                this.f16512b = this.c;
                this.c = -1;
                this.f16513d = ((AbstractList) c1405c).modCount;
                return;
            default:
                b();
                int i4 = this.c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                C1406d c1406d = (C1406d) this.e;
                c1406d.remove(i4);
                this.f16512b = this.c;
                this.c = -1;
                this.f16513d = ((AbstractList) c1406d).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f16511a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1405c) this.e).set(i, obj);
                return;
            default:
                b();
                int i4 = this.c;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1406d) this.e).set(i4, obj);
                return;
        }
    }

    public C1404b(C1405c c1405c, int i) {
        this.e = c1405c;
        this.f16512b = i;
        this.f16513d = ((AbstractList) c1405c).modCount;
    }
}
