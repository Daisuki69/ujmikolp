package dj;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: dj.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1410h extends AbstractC1403a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16533a;

    public C1410h(C1407e c1407e) {
        this.f16533a = c1407e;
    }

    @Override // cj.AbstractC1122h
    public final int a() {
        return this.f16533a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        kotlin.jvm.internal.j.g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // dj.AbstractC1403a
    public final boolean c(Map.Entry element) {
        kotlin.jvm.internal.j.g(element, "element");
        return this.f16533a.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f16533a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        return this.f16533a.e(elements);
    }

    @Override // dj.AbstractC1403a
    public final boolean d(Map.Entry element) {
        kotlin.jvm.internal.j.g(element, "element");
        C1407e c1407e = this.f16533a;
        c1407e.getClass();
        c1407e.c();
        int iH = c1407e.h(element.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = c1407e.f16523b;
        kotlin.jvm.internal.j.d(objArr);
        if (!kotlin.jvm.internal.j.b(objArr[iH], element.getValue())) {
            return false;
        }
        c1407e.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16533a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1407e c1407e = this.f16533a;
        c1407e.getClass();
        return new C1408f(c1407e, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16533a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.j.g(elements, "elements");
        this.f16533a.c();
        return super.retainAll(elements);
    }
}
