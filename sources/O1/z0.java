package O1;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends AbstractC0505d0 {
    public static final Object[] i;
    public static final z0 j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f4622d;
    public final transient int e;
    public final transient Object[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f4623g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new z0(objArr, 0, objArr, 0, 0);
    }

    public z0(Object[] objArr, int i4, Object[] objArr2, int i6, int i10) {
        this.f4622d = objArr;
        this.e = i4;
        this.f = objArr2;
        this.f4623g = i6;
        this.h = i10;
    }

    @Override // O1.M
    public final int c(int i4, Object[] objArr) {
        Object[] objArr2 = this.f4622d;
        int i6 = this.h;
        System.arraycopy(objArr2, 0, objArr, i4, i6);
        return i4 + i6;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iV = AbstractC0529x.v(obj);
                while (true) {
                    int i4 = iV & this.f4623g;
                    Object obj2 = objArr[i4];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iV = i4 + 1;
                }
            }
        }
        return false;
    }

    @Override // O1.M
    public final Object[] d() {
        return this.f4622d;
    }

    @Override // O1.M
    public final int e() {
        return this.h;
    }

    @Override // O1.M
    public final int f() {
        return 0;
    }

    @Override // O1.M
    public final boolean g() {
        return false;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        return a().listIterator(0);
    }

    @Override // O1.AbstractC0505d0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // O1.AbstractC0505d0
    public final S l() {
        return S.i(this.h, this.f4622d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
