package O1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: O1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0520n extends C0508f implements ListIterator {
    public final /* synthetic */ C0521o e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520n(C0521o c0521o) {
        super(c0521o);
        this.e = c0521o;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0521o c0521o = this.e;
        boolean zIsEmpty = c0521o.isEmpty();
        b().add(obj);
        c0521o.f.f++;
        if (zIsEmpty) {
            c0521o.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f4580b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520n(C0521o c0521o, int i) {
        super(c0521o, ((List) c0521o.f4600b).listIterator(i));
        this.e = c0521o;
    }
}
