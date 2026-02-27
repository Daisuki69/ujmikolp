package O1;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: O1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0510g extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient C0506e f4583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient B f4584b;
    public final transient Map c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0522p f4585d;

    public C0510g(AbstractC0522p abstractC0522p, Map map) {
        this.f4585d = abstractC0522p;
        this.c = map;
    }

    public final N a(Map.Entry entry) {
        Object key = entry.getKey();
        return new N(key, this.f4585d.i(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractC0522p abstractC0522p = this.f4585d;
        if (this.c == abstractC0522p.e) {
            abstractC0522p.e();
            return;
        }
        C0508f c0508f = new C0508f(this);
        while (c0508f.hasNext()) {
            c0508f.next();
            c0508f.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0506e c0506e = this.f4583a;
        if (c0506e != null) {
            return c0506e;
        }
        C0506e c0506e2 = new C0506e(this);
        this.f4583a = c0506e2;
        return c0506e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f4585d.i(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        AbstractC0522p abstractC0522p = this.f4585d;
        Set set = abstractC0522p.f9740b;
        if (set != null) {
            return set;
        }
        Set setH = abstractC0522p.h();
        abstractC0522p.f9740b = setH;
        return setH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.c.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC0522p abstractC0522p = this.f4585d;
        Collection collectionG = abstractC0522p.g();
        collectionG.addAll(collection);
        abstractC0522p.f -= collection.size();
        collection.clear();
        return collectionG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        B b8 = this.f4584b;
        if (b8 != null) {
            return b8;
        }
        B b10 = new B(this);
        this.f4584b = b10;
        return b10;
    }
}
