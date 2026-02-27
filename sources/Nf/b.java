package Nf;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f4400b;

    public b(c cVar, int i) {
        this.f4400b = cVar;
        this.f4399a = i;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return getKey().equals(bVar.getKey()) && getValue().equals(bVar.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4400b.f4401a[this.f4399a];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4400b.f4401a[this.f4399a + 1];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return getKey().hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Key or value must not be null.");
        }
        Object value = getValue();
        this.f4400b.f4401a[this.f4399a + 1] = obj;
        return value;
    }
}
