package O1;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: O1.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0499a0 extends M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f4569b;

    public C0499a0(U u3) {
        this.f4569b = u3;
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.f4569b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        U u3 = this.f4569b;
        u3.getClass();
        return new Y(u3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f4569b.f;
    }
}
