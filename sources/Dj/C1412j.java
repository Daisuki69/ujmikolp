package dj;

import cj.AbstractC1120f;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: dj.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1412j extends AbstractC1120f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16535a;

    public C1412j(C1407e c1407e) {
        this.f16535a = c1407e;
    }

    @Override // cj.AbstractC1120f
    public final int a() {
        return this.f16535a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16535a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16535a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f16535a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1407e c1407e = this.f16535a;
        c1407e.getClass();
        return new C1408f(c1407e, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C1407e c1407e = this.f16535a;
        c1407e.c();
        int i = c1407e.i(obj);
        if (i < 0) {
            return false;
        }
        c1407e.l(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16535a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16535a.c();
        return super.retainAll(elements);
    }
}
