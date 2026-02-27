package cj;

import com.paymaya.domain.store.H0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rj.InterfaceC2210a;
import rj.InterfaceC2214e;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements Map, InterfaceC2214e, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0 f9383b;

    public O(LinkedHashMap linkedHashMap, H0 h02) {
        this.f9382a = linkedHashMap;
        this.f9383b = h02;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f9382a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9382a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9382a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9382a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f9382a.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f9382a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9382a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9382a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9382a.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f9382a.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        kotlin.jvm.internal.j.g(from, "from");
        this.f9382a.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f9382a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9382a.size();
    }

    public final String toString() {
        return this.f9382a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9382a.values();
    }
}
