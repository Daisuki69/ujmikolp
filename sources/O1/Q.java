package O1;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends S {
    public final transient int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f4554d;
    public final /* synthetic */ S e;

    public Q(S s9, int i, int i4) {
        this.e = s9;
        this.c = i;
        this.f4554d = i4;
    }

    @Override // O1.M
    public final Object[] d() {
        return this.e.d();
    }

    @Override // O1.M
    public final int e() {
        return this.e.f() + this.c + this.f4554d;
    }

    @Override // O1.M
    public final int f() {
        return this.e.f() + this.c;
    }

    @Override // O1.M
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qk.i.k(i, this.f4554d);
        return this.e.get(i + this.c);
    }

    @Override // O1.S, O1.M, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // O1.S, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4554d;
    }

    @Override // O1.S, java.util.List
    /* JADX INFO: renamed from: v */
    public final S subList(int i, int i4) {
        qk.i.o(i, i4, this.f4554d);
        int i6 = this.c;
        return this.e.subList(i + i6, i4 + i6);
    }

    @Override // O1.S, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
