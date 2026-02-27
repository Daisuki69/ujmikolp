package O1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: O1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0508f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4579a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f4580b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4581d;

    public C0508f(C0521o c0521o) {
        this.f4581d = c0521o;
        Collection collection = c0521o.f4600b;
        this.c = collection;
        this.f4580b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C0521o c0521o = (C0521o) this.f4581d;
        c0521o.c();
        if (c0521o.f4600b != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4579a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f4580b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4579a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f4580b.next();
                this.c = (Collection) entry.getValue();
                return ((C0510g) this.f4581d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f4580b.next();
                this.c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f4580b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4579a) {
            case 0:
                qk.i.p(((Collection) this.c) != null, "no calls to next() since the last call to remove()");
                this.f4580b.remove();
                C0510g c0510g = (C0510g) this.f4581d;
                c0510g.f4585d.f -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                break;
            case 1:
                qk.i.p(((Map.Entry) this.c) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.c).getValue();
                this.f4580b.remove();
                C0512h c0512h = (C0512h) this.f4581d;
                c0512h.c.f -= collection.size();
                collection.clear();
                this.c = null;
                break;
            default:
                this.f4580b.remove();
                C0521o c0521o = (C0521o) this.f4581d;
                AbstractC0522p abstractC0522p = c0521o.e;
                abstractC0522p.f--;
                c0521o.d();
                break;
        }
    }

    public C0508f(C0521o c0521o, ListIterator listIterator) {
        this.f4581d = c0521o;
        this.c = c0521o.f4600b;
        this.f4580b = listIterator;
    }

    public C0508f(C0512h c0512h, Iterator it) {
        this.f4581d = c0512h;
        this.f4580b = it;
    }

    public C0508f(C0510g c0510g) {
        this.f4581d = c0510g;
        this.f4580b = c0510g.c.entrySet().iterator();
    }
}
