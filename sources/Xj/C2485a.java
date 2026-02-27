package xj;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: xj.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2485a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f21011a;

    public C2485a(Type elementType) {
        kotlin.jvm.internal.j.g(elementType, "elementType");
        this.f21011a = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return kotlin.jvm.internal.j.b(this.f21011a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f21011a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return y.a(this.f21011a) + "[]";
    }

    public final int hashCode() {
        return this.f21011a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
