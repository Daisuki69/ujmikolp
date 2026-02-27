package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends AbstractC0505d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f4545d;

    public G0(Object obj) {
        obj.getClass();
        this.f4545d = obj;
    }

    @Override // O1.AbstractC0505d0, O1.M
    public final S a() {
        return S.p(this.f4545d);
    }

    @Override // O1.M
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.f4545d;
        return i + 1;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4545d.equals(obj);
    }

    @Override // O1.M
    public final boolean g() {
        return false;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        C0513h0 c0513h0 = new C0513h0();
        c0513h0.f4590a = this.f4545d;
        return c0513h0;
    }

    @Override // O1.AbstractC0505d0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4545d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f4545d.toString() + ']';
    }
}
