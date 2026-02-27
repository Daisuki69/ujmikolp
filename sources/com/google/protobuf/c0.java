package com.google.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f10083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10084b;
    public final /* synthetic */ Y c;

    public c0(Y y7, Comparable comparable, Object obj) {
        this.c = y7;
        this.f10083a = comparable;
        this.f10084b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10083a.compareTo(((c0) obj).f10083a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f10083a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f10084b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10083a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10084b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f10083a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f10084b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.b();
        Object obj2 = this.f10084b;
        this.f10084b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f10083a + "=" + this.f10084b;
    }
}
