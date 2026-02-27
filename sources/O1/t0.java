package O1;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends S {
    public static final t0 e = new t0(new Object[0], 0);
    public final transient Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f4608d;

    public t0(Object[] objArr, int i) {
        this.c = objArr;
        this.f4608d = i;
    }

    @Override // O1.S, O1.M
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.c;
        int i4 = this.f4608d;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // O1.M
    public final Object[] d() {
        return this.c;
    }

    @Override // O1.M
    public final int e() {
        return this.f4608d;
    }

    @Override // O1.M
    public final int f() {
        return 0;
    }

    @Override // O1.M
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qk.i.k(i, this.f4608d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4608d;
    }
}
