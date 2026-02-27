package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f4565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I0 f4566b = C0509f0.f4582d;

    public Z(U u3) {
        this.f4565a = ((S) u3.e.values()).listIterator(0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4566b.hasNext() || this.f4565a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4566b.hasNext()) {
            this.f4566b = ((M) this.f4565a.next()).iterator();
        }
        return this.f4566b.next();
    }
}
