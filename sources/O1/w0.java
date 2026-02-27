package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends AbstractC0505d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient X f4613d;
    public final transient x0 e;

    public w0(X x6, x0 x0Var) {
        this.f4613d = x6;
        this.e = x0Var;
    }

    @Override // O1.AbstractC0505d0, O1.M
    public final S a() {
        return this.e;
    }

    @Override // O1.M
    public final int c(int i, Object[] objArr) {
        return this.e.c(i, objArr);
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4613d.get(obj) != null;
    }

    @Override // O1.M
    public final boolean g() {
        return true;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((y0) this.f4613d).f;
    }
}
