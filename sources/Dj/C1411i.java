package dj;

import cj.AbstractC1122h;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: dj.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1411i extends AbstractC1122h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16534a;

    public C1411i(C1407e c1407e) {
        this.f16534a = c1407e;
    }

    @Override // cj.AbstractC1122h
    public final int a() {
        return this.f16534a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16534a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16534a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16534a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1407e c1407e = this.f16534a;
        c1407e.getClass();
        return new C1408f(c1407e, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1407e c1407e = this.f16534a;
        c1407e.c();
        int iH = c1407e.h(obj);
        if (iH < 0) {
            return false;
        }
        c1407e.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16534a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16534a.c();
        return super.retainAll(elements);
    }
}
