package O1;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends AbstractC0505d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient X f4610d;
    public final transient Object[] e;
    public final transient int f;

    public v0(X x6, Object[] objArr, int i) {
        this.f4610d = x6;
        this.e = objArr;
        this.f = i;
    }

    @Override // O1.M
    public final int c(int i, Object[] objArr) {
        return a().c(i, objArr);
    }

    @Override // O1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f4610d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // O1.M
    public final boolean g() {
        return true;
    }

    @Override // O1.M
    /* JADX INFO: renamed from: h */
    public final I0 iterator() {
        return a().listIterator(0);
    }

    @Override // O1.AbstractC0505d0
    public final S l() {
        return new u0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
