package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends y {
    public static final z c = new z() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            Type type = typeToken.getType();
            boolean z4 = type instanceof GenericArrayType;
            if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(jVar, jVar.g(TypeToken.get(genericComponentType)), com.google.gson.internal.e.h(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f9885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f9886b;

    public ArrayTypeAdapter(j jVar, y yVar, Class cls) {
        this.f9886b = new TypeAdapterRuntimeTypeWrapper(jVar, yVar, cls);
        this.f9885a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.y
    public final Object read(j3.a aVar) throws IOException {
        if (aVar.peek() == 9) {
            aVar.G();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.t()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f9886b).f9924b.read(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        Class cls = this.f9885a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.r();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f9886b.write(bVar, Array.get(obj, i));
        }
        bVar.i();
    }
}
