package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f9988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f9989b;
    public j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f9990d;
    public j e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9991g;
    public Object h;
    public int i;

    public j(boolean z4) {
        this.f = null;
        this.f9991g = z4;
        this.e = this;
        this.f9990d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f9991g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.h;
    }

    public j(boolean z4, j jVar, Object obj, j jVar2, j jVar3) {
        this.f9988a = jVar;
        this.f = obj;
        this.f9991g = z4;
        this.i = 1;
        this.f9990d = jVar2;
        this.e = jVar3;
        jVar3.f9990d = this;
        jVar2.e = this;
    }
}
