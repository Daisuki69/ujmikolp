package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;

/* JADX INFO: loaded from: classes2.dex */
class TypeAdapters$30 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f9929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f9930b;
    public final /* synthetic */ y c;

    public TypeAdapters$30(Class cls, Class cls2, y yVar) {
        this.f9929a = cls;
        this.f9930b = cls2;
        this.c = yVar;
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.f9929a || rawType == this.f9930b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f9930b.getName() + "+" + this.f9929a.getName() + ",adapter=" + this.c + "]";
    }
}
