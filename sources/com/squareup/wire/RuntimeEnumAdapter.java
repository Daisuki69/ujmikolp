package com.squareup.wire;

import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    public static final Companion Companion = new Companion(null);
    private Method fromValueMethod;
    private final Class<E> javaType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> enumType) {
            j.g(enumType, "enumType");
            return new RuntimeEnumAdapter<>(enumType, ProtoAdapter.Companion.get(enumType).getSyntax());
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType) {
        this(javaType, Syntax.PROTO_2);
        j.g(javaType, "javaType");
    }

    public static final <E extends WireEnum> RuntimeEnumAdapter<E> create(Class<E> cls) {
        return Companion.create(cls);
    }

    private final Method getFromValueMethod() throws NoSuchMethodException {
        Method method = this.fromValueMethod;
        if (method != null) {
            return method;
        }
        Method method2 = this.javaType.getMethod("fromValue", Integer.TYPE);
        this.fromValueMethod = method2;
        j.f(method2, "also(...)");
        return method2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeEnumAdapter) && j.b(((RuntimeEnumAdapter) obj).getType(), getType());
    }

    @Override // com.squareup.wire.EnumAdapter
    public E fromValue(int i) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = getFromValueMethod().invoke(null, Integer.valueOf(i));
        j.e(objInvoke, "null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter");
        return (E) objInvoke;
    }

    public int hashCode() {
        InterfaceC2488d type = getType();
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeEnumAdapter(Class<E> javaType, Syntax syntax) {
        super(z.a(javaType), syntax, Internal.getIdentityOrNull(javaType));
        j.g(javaType, "javaType");
        j.g(syntax, "syntax");
        this.javaType = javaType;
    }
}
