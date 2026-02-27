package Df;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import yf.i;
import yf.j;
import yf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yf.d f1126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1127b;

    public b(HashMap map, yf.d dVar) {
        this.f1127b = map;
        this.f1126a = dVar;
    }

    public static b a(yf.d dVar) throws IOException {
        Object objValueOf;
        if (dVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (j jVar : dVar.f21154a.keySet()) {
            yf.b bVarQ = dVar.q(jVar);
            if (bVarQ instanceof q) {
                objValueOf = ((q) bVarQ).f();
            } else if (bVarQ instanceof i) {
                objValueOf = Integer.valueOf((int) ((i) bVarQ).f21165a);
            } else if (bVarQ instanceof j) {
                objValueOf = ((j) bVarQ).f21267a;
            } else if (bVarQ instanceof yf.f) {
                objValueOf = Float.valueOf(((yf.f) bVarQ).f21159a.floatValue());
            } else {
                if (!(bVarQ instanceof yf.c)) {
                    throw new IOException("Error:unknown type of object to convert:" + bVarQ);
                }
                objValueOf = ((yf.c) bVarQ).f21153a ? Boolean.TRUE : Boolean.FALSE;
            }
            map.put(jVar.f21267a, objValueOf);
        }
        return new b(map, dVar);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f1126a.f21154a.clear();
        this.f1127b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f1127b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f1127b.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return Collections.unmodifiableSet(this.f1127b.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f1126a.equals(this.f1126a);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f1127b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f1126a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f1127b.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f1126a.F(j.f((String) obj), ((c) obj2).c());
        return this.f1127b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        this.f1126a.C(j.f((String) obj));
        return this.f1127b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f1126a.f21154a.size();
    }

    public final String toString() {
        return this.f1127b.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f1127b.values();
    }
}
