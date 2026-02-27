package com.ryanharter.auto.value.gson;

import com.dynatrace.android.agent.Global;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class GenerateTypeAdapter$1 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f14960a = Array.newInstance((Class<?>) Type.class, 0).getClass();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f14961b = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!rawType.isAnnotationPresent(a.class)) {
            return null;
        }
        Class superclass = rawType.getSuperclass();
        if (superclass.isAnnotationPresent(a.class)) {
            return jVar.h(superclass);
        }
        Constructor constructorB = b(rawType);
        if (constructorB == null) {
            return null;
        }
        try {
            return constructorB.getParameterTypes().length == 1 ? (y) constructorB.newInstance(jVar) : (y) constructorB.newInstance(jVar, ((ParameterizedType) typeToken.getType()).getActualTypeArguments());
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + constructorB, e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Unable to invoke " + constructorB, e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(androidx.camera.core.impl.a.g(rawType, "Could not create generated TypeAdapter instance for type "), cause);
        }
    }

    public final Constructor b(Class cls) {
        Constructor<?> constructorB;
        Map map = this.f14961b;
        Constructor constructor = (Constructor) map.get(cls);
        if (constructor != null) {
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("kotlin.")) {
            return null;
        }
        try {
            try {
                String strReplace = cls.getName().replace("$", Global.UNDERSCORE);
                Class<?> clsLoadClass = cls.getClassLoader().loadClass(strReplace + "_GsonTypeAdapter");
                try {
                    constructorB = clsLoadClass.getDeclaredConstructor(j.class);
                    constructorB.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    constructorB = clsLoadClass.getDeclaredConstructor(j.class, this.f14960a);
                    constructorB.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Unable to find binding constructor for ".concat(name), e);
            }
        } catch (ClassNotFoundException unused2) {
            constructorB = b(cls.getSuperclass());
            if (constructorB != null) {
                constructorB.setAccessible(true);
            }
        }
        map.put(cls, constructorB);
        return constructorB;
    }
}
