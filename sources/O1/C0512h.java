package O1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: O1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0512h extends F0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4588b;
    public final /* synthetic */ AbstractC0522p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512h(AbstractC0522p abstractC0522p, Map map) {
        super(0);
        this.c = abstractC0522p;
        map.getClass();
        this.f4588b = map;
    }

    @Override // O1.F0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0508f c0508f = (C0508f) it;
            if (!c0508f.hasNext()) {
                return;
            }
            c0508f.next();
            c0508f.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4588b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4588b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f4588b.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4588b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4588b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0508f(this, this.f4588b.entrySet().iterator());
    }

    @Override // O1.F0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f4588b.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.c.f -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4588b.size();
    }
}
