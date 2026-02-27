package Rg;

import G7.F;
import bg.AbstractC0983W;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rj.InterfaceC2214e;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Map, InterfaceC2214e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5537a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f5537a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        kotlin.jvm.internal.j.g(key, "key");
        return this.f5537a.containsKey(new i(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f5537a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new m(this.f5537a.entrySet(), new F(28), new F(29));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        return kotlin.jvm.internal.j.b(((h) obj).f5537a, this.f5537a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.j.g(key, "key");
        return this.f5537a.get(AbstractC0983W.f(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5537a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5537a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new m(this.f5537a.keySet(), new g(0), new g(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object value) {
        String key = (String) obj;
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        return this.f5537a.put(AbstractC0983W.f(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.j.g(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            kotlin.jvm.internal.j.g(key, "key");
            kotlin.jvm.internal.j.g(value, "value");
            this.f5537a.put(AbstractC0983W.f(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        kotlin.jvm.internal.j.g(key, "key");
        return this.f5537a.remove(AbstractC0983W.f(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5537a.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5537a.values();
    }
}
