package Df;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import yf.C2531a;
import yf.j;
import yf.p;
import yf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements List {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2531a f1123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1124b;
    public p c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f1125d;

    public a(j jVar, j jVar2, p pVar, j jVar3) {
        C2531a c2531a = new C2531a();
        this.f1123a = c2531a;
        c2531a.f(jVar2);
        ArrayList arrayList = new ArrayList();
        this.f1124b = arrayList;
        arrayList.add(jVar);
        this.c = pVar;
        this.f1125d = jVar3;
    }

    public static ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj instanceof String) {
                arrayList.add(new q((String) obj));
            } else {
                arrayList.add(((c) obj).c());
            }
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        p pVar = this.c;
        C2531a c2531a = this.f1123a;
        if (pVar != null) {
            pVar.F(this.f1125d, c2531a);
            this.c = null;
        }
        if (obj instanceof String) {
            c2531a.f(new q((String) obj));
        } else if (c2531a != null) {
            c2531a.f(((c) obj).c());
        }
        return this.f1124b.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        p pVar = this.c;
        C2531a c2531a = this.f1123a;
        if (pVar != null && collection.size() > 0) {
            this.c.F(this.f1125d, c2531a);
            this.c = null;
        }
        c2531a.f21151a.addAll(a(collection));
        return this.f1124b.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        p pVar = this.c;
        if (pVar != null) {
            pVar.C(this.f1125d);
        }
        this.f1124b.clear();
        this.f1123a.f21151a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1124b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f1124b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f1124b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f1124b.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f1124b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f1124b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f1124b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f1124b.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f1124b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f1124b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        ArrayList arrayList = this.f1124b;
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        arrayList.remove(iIndexOf);
        this.f1123a.m(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yf.b bVarC = ((c) it.next()).c();
            C2531a c2531a = this.f1123a;
            for (int size = c2531a.f21151a.size() - 1; size >= 0; size--) {
                if (bVarC.equals(c2531a.k(size))) {
                    c2531a.m(size);
                }
            }
        }
        return this.f1124b.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            yf.b bVarC = ((c) it.next()).c();
            C2531a c2531a = this.f1123a;
            for (int size = c2531a.f21151a.size() - 1; size >= 0; size--) {
                if (!bVarC.equals(c2531a.k(size))) {
                    c2531a.m(size);
                }
            }
        }
        return this.f1124b.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        boolean z4 = obj instanceof String;
        j jVar = this.f1125d;
        C2531a c2531a = this.f1123a;
        if (z4) {
            q qVar = new q((String) obj);
            p pVar = this.c;
            if (pVar != null && i == 0) {
                pVar.F(jVar, qVar);
            }
            c2531a.f21151a.set(i, qVar);
        } else {
            p pVar2 = this.c;
            if (pVar2 != null && i == 0) {
                pVar2.F(jVar, ((c) obj).c());
            }
            c2531a.f21151a.set(i, ((c) obj).c());
        }
        return this.f1124b.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f1124b.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i4) {
        return this.f1124b.subList(i, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f1124b.toArray();
    }

    public final String toString() {
        return "COSArrayList{" + this.f1123a.toString() + "}";
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f1124b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f1124b.toArray(objArr);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        this.f1123a.m(i);
        return this.f1124b.remove(i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        p pVar = this.c;
        C2531a c2531a = this.f1123a;
        if (pVar != null) {
            pVar.F(this.f1125d, c2531a);
            this.c = null;
        }
        this.f1124b.add(i, obj);
        if (obj instanceof String) {
            c2531a.f21151a.add(i, new q((String) obj));
        } else {
            c2531a.f21151a.add(i, ((c) obj).c());
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        p pVar = this.c;
        C2531a c2531a = this.f1123a;
        if (pVar != null && collection.size() > 0) {
            this.c.F(this.f1125d, c2531a);
            this.c = null;
        }
        c2531a.f21151a.addAll(i, a(collection));
        return this.f1124b.addAll(i, collection);
    }
}
