package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9884a;

    public b(Type type) {
        Objects.requireNonNull(type);
        this.f9884a = e.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && e.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9884a;
    }

    public final int hashCode() {
        return this.f9884a.hashCode();
    }

    public final String toString() {
        return e.l(this.f9884a) + "[]";
    }
}
