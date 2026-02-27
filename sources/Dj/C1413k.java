package dj;

import cj.AbstractC1122h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: dj.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1413k extends AbstractC1122h implements Set, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1413k f16536b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16537a;

    static {
        C1407e.f16520n.getClass();
        f16536b = new C1413k(C1407e.f16521o);
    }

    public C1413k(C1407e backing) {
        kotlin.jvm.internal.j.g(backing, "backing");
        this.f16537a = backing;
    }

    @Override // cj.AbstractC1122h
    public final int a() {
        return this.f16537a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f16537a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16537a.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16537a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f16537a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16537a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1407e c1407e = this.f16537a;
        c1407e.getClass();
        return new C1408f(c1407e, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1407e c1407e = this.f16537a;
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
        this.f16537a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16537a.c();
        return super.retainAll(elements);
    }

    public C1413k() {
        this(new C1407e());
    }
}
