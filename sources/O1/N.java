package O1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends AbstractC0523q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4553b;

    public N(Object obj, Object obj2) {
        this.f4552a = obj;
        this.f4553b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4552a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4553b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
