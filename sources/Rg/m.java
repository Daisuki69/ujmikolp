package Rg;

import cj.C1110A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import rj.InterfaceC2211b;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Set, InterfaceC2211b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f5544b;
    public final Function1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5545d;

    public m(Set delegate, Function1 function1, Function1 function12) {
        kotlin.jvm.internal.j.g(delegate, "delegate");
        this.f5543a = delegate;
        this.f5544b = function1;
        this.c = function12;
        this.f5545d = delegate.size();
    }

    public final ArrayList a(Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(cj.t.l(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f5543a.add(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return this.f5543a.addAll(a(elements));
    }

    public final ArrayList c(Collection collection) {
        kotlin.jvm.internal.j.g(collection, "<this>");
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(cj.t.l(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f5544b.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5543a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5543a.contains(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return this.f5543a.containsAll(a(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListC = c(this.f5543a);
        return ((Set) obj).containsAll(arrayListC) && arrayListC.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f5543a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5543a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5543a.remove(this.c.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return this.f5543a.removeAll(C1110A.Z(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return this.f5543a.retainAll(C1110A.Z(a(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5545d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return D.h(this);
    }

    public final String toString() {
        return c(this.f5543a).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.g(array, "array");
        return D.i(this, array);
    }
}
