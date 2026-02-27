package O1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: O1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0522p extends com.google.common.collect.a implements Serializable {
    public final transient Map e;
    public transient int f;

    public AbstractC0522p(Map map) {
        qk.i.h(map.isEmpty());
        this.e = map;
    }

    @Override // O1.n0
    public Collection a() {
        Collection rVar = this.f9739a;
        if (rVar == null) {
            rVar = this instanceof AbstractC0525t ? new r(this, 1) : new C0524s(this, 1);
            this.f9739a = rVar;
        }
        return rVar;
    }

    public final void e() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    public Map f() {
        return new C0510g(this, this.e);
    }

    public abstract Collection g();

    @Override // O1.n0
    public Collection get(Object obj) {
        Collection collectionG = (Collection) this.e.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return i(obj, collectionG);
    }

    public Set h() {
        return new C0512h(this, this.e);
    }

    public abstract Collection i(Object obj, Collection collection);

    @Override // O1.n0
    public boolean put(Object obj, Object obj2) {
        Map map = this.e;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f++;
        map.put(obj, collectionG);
        return true;
    }

    @Override // O1.n0
    public final int size() {
        return this.f;
    }

    @Override // O1.n0
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        C0524s c0524s = new C0524s(this, 0);
        this.c = c0524s;
        return c0524s;
    }
}
