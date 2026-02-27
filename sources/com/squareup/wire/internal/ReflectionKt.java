package com.squareup.wire.internal;

import Ag.l;
import Rj.f;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectionKt {
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, String str, Syntax syntax, ClassLoader classLoader, boolean z4) {
        j.g(messageType, "messageType");
        j.g(syntax, "syntax");
        Class builderType = getBuilderType(messageType);
        l lVar = new l(19, builderType, messageType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f fVarF = D.f(messageType.getDeclaredFields());
        while (fVarF.hasNext()) {
            Field field = (Field) fVarF.next();
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                Class cls = builderType;
                Class<M> cls2 = messageType;
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, cls2, field, cls, z4, classLoader));
                builderType = cls;
            } else {
                ClassLoader classLoader2 = classLoader;
                boolean z5 = z4;
                Class cls3 = builderType;
                Class<M> cls4 = messageType;
                if (j.b(field.getType(), OneOf.class)) {
                    for (OneOf.Key<?> key : getKeys(field)) {
                        linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, cls3, key, z5));
                    }
                }
                messageType = cls4;
                builderType = cls3;
                z4 = z5;
                classLoader = classLoader2;
            }
        }
        Class cls5 = builderType;
        C1790e c1790eA = z.a(messageType);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(c1790eA, cls5, lVar, mapUnmodifiableMap, str, syntax));
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message.Builder createRuntimeMessageAdapter$lambda$0(Class cls, Class cls2) throws IllegalAccessException, InstantiationException {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(cls2);
        }
        Object objNewInstance = cls.newInstance();
        j.d(objNewInstance);
        return (Message.Builder) objNewInstance;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = Class.forName(cls.getName().concat("$Builder"));
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        Class<B> cls2 = (Class) objA;
        return cls2 == null ? KotlinConstructorBuilder.class : cls2;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) throws IllegalAccessException, NoSuchFieldException {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        j.f(name, "getName(...)");
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        j.e(obj, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>");
        return (Set) obj;
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z4, ClassLoader classLoader, int i, Object obj) {
        if ((i & 4) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z4, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> messageType, boolean z4, ClassLoader classLoader) {
        j.g(messageType, "messageType");
        ProtoAdapter protoAdapter = ProtoAdapter.Companion.get(messageType);
        return createRuntimeMessageAdapter(messageType, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z4);
    }
}
