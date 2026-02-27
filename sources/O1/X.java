package O1;

import defpackage.AbstractC1414e;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient v0 f4561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient w0 f4562b;
    public transient x0 c;

    public static X a(Map map) {
        if ((map instanceof X) && !(map instanceof SortedMap)) {
            X x6 = (X) map;
            x6.getClass();
            return x6;
        }
        Set setEntrySet = map.entrySet();
        W w6 = new W(AbstractC1414e.u(setEntrySet) ? setEntrySet.size() : 4);
        w6.c(setEntrySet);
        return w6.a();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC0505d0 entrySet() {
        v0 v0Var = this.f4561a;
        if (v0Var != null) {
            return v0Var;
        }
        y0 y0Var = (y0) this;
        v0 v0Var2 = new v0(y0Var, y0Var.e, y0Var.f);
        this.f4561a = v0Var2;
        return v0Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC0505d0 keySet() {
        w0 w0Var = this.f4562b;
        if (w0Var != null) {
            return w0Var;
        }
        y0 y0Var = (y0) this;
        w0 w0Var2 = new w0(y0Var, new x0(y0Var.e, 0, y0Var.f));
        this.f4562b = w0Var2;
        return w0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final M values() {
        x0 x0Var = this.c;
        if (x0Var != null) {
            return x0Var;
        }
        y0 y0Var = (y0) this;
        x0 x0Var2 = new x0(y0Var.e, 1, y0Var.f);
        this.c = x0Var2;
        return x0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC0529x.g(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0529x.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((y0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return AbstractC0529x.y(this);
    }
}
