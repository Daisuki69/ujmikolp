package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* JADX INFO: loaded from: classes2.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f9869a = null;

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final y a() {
        y yVar = this.f9869a;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        y yVar = this.f9869a;
        if (yVar != null) {
            return yVar.read(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) {
        y yVar = this.f9869a;
        if (yVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        yVar.write(bVar, obj);
    }
}
