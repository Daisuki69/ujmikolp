package vh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AtomicInteger implements List, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20508a = new ArrayList();

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        ArrayList arrayList = this.f20508a;
        boolean zAdd = arrayList.add(obj);
        lazySet(arrayList.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        ArrayList arrayList = this.f20508a;
        boolean zAddAll = arrayList.addAll(collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f20508a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20508a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f20508a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        boolean z4 = obj instanceof i;
        ArrayList arrayList = this.f20508a;
        return z4 ? arrayList.equals(((i) obj).f20508a) : arrayList.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f20508a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f20508a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f20508a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f20508a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f20508a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f20508a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        ArrayList arrayList = this.f20508a;
        boolean zRemove = arrayList.remove(obj);
        lazySet(arrayList.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ArrayList arrayList = this.f20508a;
        boolean zRemoveAll = arrayList.removeAll(collection);
        lazySet(arrayList.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ArrayList arrayList = this.f20508a;
        boolean zRetainAll = arrayList.retainAll(collection);
        lazySet(arrayList.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        return this.f20508a.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return get();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        return this.f20508a.subList(i, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f20508a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.f20508a.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f20508a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f20508a.toArray(objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        ArrayList arrayList = this.f20508a;
        arrayList.add(i, obj);
        lazySet(arrayList.size());
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        ArrayList arrayList = this.f20508a;
        boolean zAddAll = arrayList.addAll(i, collection);
        lazySet(arrayList.size());
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ArrayList arrayList = this.f20508a;
        Object objRemove = arrayList.remove(i);
        lazySet(arrayList.size());
        return objRemove;
    }
}
