package O1;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends H0 implements ListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4592b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f4592b = i;
        this.c = abstractList;
    }

    @Override // O1.H0
    public final Object a(Object obj) {
        switch (this.f4592b) {
            case 0:
                return ((k0) this.c).f4594b.apply(obj);
            default:
                return ((l0) this.c).f4596b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f4547a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f4547a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f4547a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f4547a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
