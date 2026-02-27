package O1;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: O1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0531z extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4621b;

    public /* synthetic */ C0531z(AbstractMap abstractMap, int i) {
        this.f4620a = i;
        this.f4621b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f4620a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((com.google.protobuf.Y) this.f4621b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4620a) {
            case 0:
                ((C) this.f4621b).clear();
                break;
            case 1:
                ((C) this.f4621b).clear();
                break;
            default:
                ((com.google.protobuf.Y) this.f4621b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4620a) {
            case 0:
                C c = (C) this.f4621b;
                Map mapC = c.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = c.e(entry.getKey());
                    if (iE != -1 && of.p.p(c.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((C) this.f4621b).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((com.google.protobuf.Y) this.f4621b).get(entry2.getKey());
                Object value = entry2.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f4620a) {
            case 0:
                C c = (C) this.f4621b;
                Map mapC = c.c();
                return mapC != null ? mapC.entrySet().iterator() : new C0530y(c, 1);
            case 1:
                C c10 = (C) this.f4621b;
                Map mapC2 = c10.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new C0530y(c10, 0);
            default:
                return new com.google.protobuf.d0((com.google.protobuf.Y) this.f4621b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4620a) {
            case 0:
                C c = (C) this.f4621b;
                Map mapC = c.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c.g()) {
                        int iD = c.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c.f4532a;
                        Objects.requireNonNull(obj2);
                        int iR = AbstractC0529x.r(key, value, iD, obj2, c.i(), c.j(), c.k());
                        if (iR != -1) {
                            c.f(iR, iD);
                            c.f--;
                            c.e += 32;
                            return true;
                        }
                    }
                }
                return false;
            case 1:
                C c10 = (C) this.f4621b;
                Map mapC2 = c10.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : c10.h(obj) != C.j;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((com.google.protobuf.Y) this.f4621b).remove(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4620a) {
            case 0:
                return ((C) this.f4621b).size();
            case 1:
                return ((C) this.f4621b).size();
            default:
                return ((com.google.protobuf.Y) this.f4621b).size();
        }
    }
}
