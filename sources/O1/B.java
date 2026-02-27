package O1;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4529a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractMap f4530b;

    public B(C c) {
        this.f4530b = c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4529a) {
            case 0:
                ((C) this.f4530b).clear();
                break;
            default:
                ((C0510g) this.f4530b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f4529a) {
            case 1:
                return ((C0510g) this.f4530b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4529a) {
            case 1:
                return ((C0510g) this.f4530b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4529a) {
            case 0:
                C c = (C) this.f4530b;
                Map mapC = c.c();
                return mapC != null ? mapC.values().iterator() : new C0530y(c, 2);
            default:
                return new m0(((C0510g) this.f4530b).entrySet().iterator(), 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4529a) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0510g c0510g = (C0510g) this.f4530b;
                    for (Map.Entry entry : c0510g.entrySet()) {
                        if (of.p.p(obj, entry.getValue())) {
                            c0510g.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4529a) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0510g c0510g = (C0510g) this.f4530b;
                    for (Map.Entry entry : c0510g.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0510g.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4529a) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0510g c0510g = (C0510g) this.f4530b;
                    for (Map.Entry entry : c0510g.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0510g.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4529a) {
            case 0:
                return ((C) this.f4530b).size();
            default:
                return ((C0510g) this.f4530b).c.size();
        }
    }

    public B(C0510g c0510g) {
        this.f4530b = c0510g;
    }
}
