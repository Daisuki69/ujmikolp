package O1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends D0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4539a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f4539a.iterator();
        it.getClass();
        N1.j jVar = this.f4540b;
        jVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (jVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new E0(((SortedSet) this.f4539a).headSet(obj), this.f4540b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f4539a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f4540b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new E0(((SortedSet) this.f4539a).subSet(obj, obj2), this.f4540b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new E0(((SortedSet) this.f4539a).tailSet(obj), this.f4540b);
    }
}
