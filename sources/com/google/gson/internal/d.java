package com.google.gson.internal;

import com.dynatrace.android.agent.Global;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f9978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f9979b;

    public d(Type[] typeArr, Type[] typeArr2) {
        e.b(typeArr2.length <= 1);
        e.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            e.c(typeArr[0]);
            this.f9979b = null;
            this.f9978a = e.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        e.c(typeArr2[0]);
        e.b(typeArr[0] == Object.class);
        this.f9979b = e.a(typeArr2[0]);
        this.f9978a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && e.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9979b;
        return type != null ? new Type[]{type} : e.f9980a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9978a};
    }

    public final int hashCode() {
        Type type = this.f9979b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f9978a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9979b;
        if (type != null) {
            return "? super " + e.l(type);
        }
        Type type2 = this.f9978a;
        if (type2 == Object.class) {
            return Global.QUESTION;
        }
        return "? extends " + e.l(type2);
    }
}
