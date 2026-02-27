package Rg;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends LinkedHashMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ag.f f5548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ag.a f5549b;
    public final int c;

    public o(Ag.f fVar, Ag.a aVar) {
        super(10, 0.75f, true);
        this.f5548a = fVar;
        this.f5549b = aVar;
        this.c = 10;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (this.c == 0) {
            return this.f5548a.invoke(obj);
        }
        synchronized (this) {
            Object obj2 = super.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            Object objInvoke = this.f5548a.invoke(obj);
            put(obj, objInvoke);
            return objInvoke;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry eldest) {
        kotlin.jvm.internal.j.g(eldest, "eldest");
        boolean z4 = super.size() > this.c;
        if (z4) {
            this.f5549b.invoke(eldest.getValue());
        }
        return z4;
    }
}
