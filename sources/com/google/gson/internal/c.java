package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f9977b;
    public final Type[] c;

    public c(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.g(cls, "Must specify owner type for "));
        }
        this.f9976a = type == null ? null : e.a(type);
        this.f9977b = e.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.c[i]);
            e.c(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = e.a(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && e.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9976a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9977b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.c) ^ this.f9977b.hashCode();
        Type type = this.f9976a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.f9977b;
        if (length == 0) {
            return e.l(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(e.l(type));
        sb2.append("<");
        sb2.append(e.l(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb2.append(", ");
            sb2.append(e.l(typeArr[i]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
