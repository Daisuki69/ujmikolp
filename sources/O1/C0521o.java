package O1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: O1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0521o extends AbstractCollection implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f4600b;
    public final C0521o c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f4601d;
    public final /* synthetic */ AbstractC0522p e;
    public final /* synthetic */ AbstractC0522p f;

    public C0521o(AbstractC0522p abstractC0522p, Object obj, List list, C0521o c0521o) {
        this.f = abstractC0522p;
        this.e = abstractC0522p;
        this.f4599a = obj;
        this.f4600b = list;
        this.c = c0521o;
        this.f4601d = c0521o == null ? null : c0521o.f4600b;
    }

    public final void a() {
        C0521o c0521o = this.c;
        if (c0521o != null) {
            c0521o.a();
        } else {
            this.e.e.put(this.f4599a, this.f4600b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f4600b.isEmpty();
        boolean zAdd = this.f4600b.add(obj);
        if (zAdd) {
            this.e.f++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f4600b.addAll(collection);
        if (zAddAll) {
            this.e.f += this.f4600b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void c() {
        Collection collection;
        C0521o c0521o = this.c;
        if (c0521o != null) {
            c0521o.c();
            if (c0521o.f4600b != this.f4601d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f4600b.isEmpty() || (collection = (Collection) this.e.e.get(this.f4599a)) == null) {
                return;
            }
            this.f4600b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f4600b.clear();
        this.e.f -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.f4600b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.f4600b.containsAll(collection);
    }

    public final void d() {
        C0521o c0521o = this.c;
        if (c0521o != null) {
            c0521o.d();
        } else if (this.f4600b.isEmpty()) {
            this.e.e.remove(this.f4599a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f4600b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.f4600b).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.f4600b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f4600b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new C0508f(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f4600b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new C0520n(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f4600b.remove(obj);
        if (zRemove) {
            AbstractC0522p abstractC0522p = this.e;
            abstractC0522p.f--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f4600b.removeAll(collection);
        if (zRemoveAll) {
            this.e.f += this.f4600b.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f4600b.retainAll(collection);
        if (zRetainAll) {
            this.e.f += this.f4600b.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.f4600b).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.f4600b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        c();
        List listSubList = ((List) this.f4600b).subList(i, i4);
        C0521o c0521o = this.c;
        if (c0521o == null) {
            c0521o = this;
        }
        AbstractC0522p abstractC0522p = this.f;
        abstractC0522p.getClass();
        boolean z4 = listSubList instanceof RandomAccess;
        Object obj = this.f4599a;
        return z4 ? new C0517k(abstractC0522p, obj, listSubList, c0521o) : new C0521o(abstractC0522p, obj, listSubList, c0521o);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f4600b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new C0520n(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.f4600b).remove(i);
        AbstractC0522p abstractC0522p = this.f;
        abstractC0522p.f--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.f4600b.isEmpty();
        ((List) this.f4600b).add(i, obj);
        this.f.f++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f4600b).addAll(i, collection);
        if (zAddAll) {
            this.f.f += this.f4600b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
