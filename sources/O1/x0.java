package O1;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends S {
    public final transient Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f4614d;
    public final transient int e;

    public x0(Object[] objArr, int i, int i4) {
        this.c = objArr;
        this.f4614d = i;
        this.e = i4;
    }

    @Override // O1.M
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qk.i.k(i, this.e);
        Object obj = this.c[(i * 2) + this.f4614d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
