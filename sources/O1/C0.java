package O1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends F0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4536b;
    public final /* synthetic */ Set c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set f4537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0(Set set, Set set2, int i) {
        super(1);
        this.f4536b = i;
        this.c = set;
        this.f4537d = set2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4536b) {
            case 0:
                return this.c.contains(obj) || this.f4537d.contains(obj);
            default:
                return ((AbstractC0505d0) this.c).contains(obj) && ((AbstractC0505d0) this.f4537d).contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f4536b) {
            case 1:
                return ((AbstractC0505d0) this.c).containsAll(collection) && ((AbstractC0505d0) this.f4537d).containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f4536b) {
            case 0:
                return this.c.isEmpty() && this.f4537d.isEmpty();
            default:
                return Collections.disjoint((AbstractC0505d0) this.f4537d, (AbstractC0505d0) this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4536b) {
            case 0:
                return new B0(this);
            default:
                return new C0507e0(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4536b) {
            case 0:
                Set set = this.c;
                int size = set.size();
                Iterator it = this.f4537d.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            default:
                Iterator it2 = ((AbstractC0505d0) this.c).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (((AbstractC0505d0) this.f4537d).contains(it2.next())) {
                        i++;
                    }
                }
                return i;
        }
    }
}
