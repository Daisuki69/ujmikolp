package xj;

import cj.C1129o;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f21017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f21018b;
    public final Type[] c;

    public u(Class cls, Type type, ArrayList arrayList) {
        this.f21017a = cls;
        this.f21018b = type;
        this.c = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (kotlin.jvm.internal.j.b(this.f21017a, parameterizedType.getRawType()) && kotlin.jvm.internal.j.b(this.f21018b, parameterizedType.getOwnerType())) {
            return Arrays.equals(this.c, parameterizedType.getActualTypeArguments());
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f21018b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f21017a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f21017a;
        Type type = this.f21018b;
        if (type != null) {
            sb2.append(y.a(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(y.a(cls));
        }
        Type[] typeArr = this.c;
        if (typeArr.length != 0) {
            C1129o.u(typeArr, sb2, ", ", "<", ">", "...", t.f21016a);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f21017a.hashCode();
        Type type = this.f21018b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        return getTypeName();
    }
}
