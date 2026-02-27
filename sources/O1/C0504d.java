package O1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: O1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0504d implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4574b = null;
    public Collection c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f4575d = EnumC0511g0.f4586a;
    public final /* synthetic */ AbstractC0522p e;
    public final /* synthetic */ int f;

    public C0504d(AbstractC0522p abstractC0522p, int i) {
        this.f = i;
        this.e = abstractC0522p;
        this.f4573a = abstractC0522p.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4573a.hasNext() || this.f4575d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f4575d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f4573a.next();
            this.f4574b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.f4575d = collection.iterator();
        }
        Object obj = this.f4574b;
        Object next = this.f4575d.next();
        switch (this.f) {
            case 0:
                return next;
            default:
                return new N(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4575d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f4573a.remove();
        }
        AbstractC0522p abstractC0522p = this.e;
        abstractC0522p.f--;
    }
}
