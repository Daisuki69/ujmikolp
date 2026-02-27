package O1;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N1.g f4594b;

    public k0(List list, N1.g gVar) {
        list.getClass();
        this.f4593a = list;
        this.f4594b = gVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f4594b.apply(this.f4593a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4593a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new j0(this, this.f4593a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f4594b.apply(this.f4593a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f4593a.subList(i, i4).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4593a.size();
    }
}
