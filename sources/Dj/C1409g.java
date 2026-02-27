package dj;

import java.util.ConcurrentModificationException;
import java.util.Map;
import rj.InterfaceC2213d;

/* JADX INFO: renamed from: dj.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1409g implements Map.Entry, InterfaceC2213d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1407e f16531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16532b;
    public final int c;

    public C1409g(C1407e map, int i) {
        kotlin.jvm.internal.j.g(map, "map");
        this.f16531a = map;
        this.f16532b = i;
        this.c = map.h;
    }

    public final void a() {
        if (this.f16531a.h != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlin.jvm.internal.j.b(entry.getKey(), getKey()) && kotlin.jvm.internal.j.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f16531a.f16522a[this.f16532b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f16531a.f16523b;
        kotlin.jvm.internal.j.d(objArr);
        return objArr[this.f16532b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C1407e c1407e = this.f16531a;
        c1407e.c();
        Object[] objArr = c1407e.f16523b;
        if (objArr == null) {
            int length = c1407e.f16522a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c1407e.f16523b = objArr;
        }
        int i = this.f16532b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
