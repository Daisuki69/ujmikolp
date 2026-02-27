package O1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f4547a;

    public H0(Iterator it) {
        it.getClass();
        this.f4547a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4547a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f4547a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4547a.remove();
    }
}
