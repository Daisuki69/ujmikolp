package O1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: O1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0498a extends I0 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4568b;

    public AbstractC0498a(int i, int i4) {
        qk.i.n(i4, i);
        this.f4567a = i;
        this.f4568b = i4;
    }

    public abstract Object a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4568b < this.f4567a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4568b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4568b;
        this.f4568b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4568b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f4568b - 1;
        this.f4568b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4568b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
