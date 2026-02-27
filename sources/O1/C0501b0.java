package O1;

/* JADX INFO: renamed from: O1.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0501b0 extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient U f4572b;

    public C0501b0(U u3) {
        this.f4572b = u3;
    }

    @Override // O1.M
    public final int c(int i, Object[] objArr) {
        P pListIterator = ((S) this.f4572b.e.values()).listIterator(0);
        while (pListIterator.hasNext()) {
            i = ((M) pListIterator.next()).c(i, objArr);
        }
        return i;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4572b.c(obj);
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        U u3 = this.f4572b;
        u3.getClass();
        return new Z(u3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4572b.f;
    }
}
