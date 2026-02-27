package O1;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends S {
    public final /* synthetic */ v0 c;

    public u0(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // O1.M
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        v0 v0Var = this.c;
        qk.i.k(i, v0Var.f);
        int i4 = i * 2;
        Object[] objArr = v0Var.e;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
