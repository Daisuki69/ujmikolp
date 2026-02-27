package com.squareup.moshi;

import X5.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Set;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;
import xj.o;
import xj.y;

/* JADX INFO: loaded from: classes4.dex */
public final class _MoshiKotlinTypesExtensionsKt {
    public static final GenericArrayType asArrayType(o oVar) {
        j.g(oVar, "<this>");
        return asArrayType(y.b(oVar, false));
    }

    public static final Class<?> getRawType(Type type) {
        j.g(type, "<this>");
        Class<?> rawType = Types.getRawType(type);
        j.f(rawType, "getRawType(this)");
        return rawType;
    }

    public static final <T extends Annotation> Set<Annotation> nextAnnotations(Set<? extends Annotation> set) {
        j.g(set, "<this>");
        j.m();
        throw null;
    }

    public static final <T> WildcardType subtypeOf() {
        j.m();
        throw null;
    }

    public static final <T> WildcardType supertypeOf() {
        j.m();
        throw null;
    }

    public static final GenericArrayType asArrayType(InterfaceC2488d interfaceC2488d) {
        j.g(interfaceC2488d, "<this>");
        return asArrayType(f.n(interfaceC2488d));
    }

    public static final GenericArrayType asArrayType(Type type) {
        j.g(type, "<this>");
        GenericArrayType genericArrayTypeArrayOf = Types.arrayOf(type);
        j.f(genericArrayTypeArrayOf, "arrayOf(this)");
        return genericArrayTypeArrayOf;
    }
}
