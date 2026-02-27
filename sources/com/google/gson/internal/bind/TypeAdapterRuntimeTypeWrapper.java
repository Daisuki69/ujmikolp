package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.y;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f9924b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(j jVar, y yVar, Type type) {
        this.f9923a = jVar;
        this.f9924b = yVar;
        this.c = type;
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        return this.f9924b.read(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    @Override // com.google.gson.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(j3.b r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.y r2 = r4.f9924b
            if (r1 == r0) goto L3c
            com.google.gson.j r0 = r4.f9923a
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.y r0 = r0.g(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L25
            goto L3b
        L25:
            r1 = r2
        L26:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r3 == 0) goto L36
            r3 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r3 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r3
            com.google.gson.y r3 = r3.a()
            if (r3 != r1) goto L34
            goto L36
        L34:
            r1 = r3
            goto L26
        L36:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r2.write(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.write(j3.b, java.lang.Object):void");
    }
}
