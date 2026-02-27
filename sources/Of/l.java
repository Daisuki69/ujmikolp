package of;

import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1976a[] f18830a;

    public l(C1976a[] c1976aArr) {
        this.f18830a = c1976aArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f18830a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18830a.length;
    }
}
