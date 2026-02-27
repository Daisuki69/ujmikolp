package O1;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N1.g f4596b;

    public l0(List list, N1.g gVar) {
        list.getClass();
        this.f4595a = list;
        this.f4596b = gVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new j0(this, this.f4595a.listIterator(i), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f4595a.subList(i, i4).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4595a.size();
    }
}
