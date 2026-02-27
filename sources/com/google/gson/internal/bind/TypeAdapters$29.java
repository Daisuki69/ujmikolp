package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;

/* JADX INFO: loaded from: classes2.dex */
class TypeAdapters$29 implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f9927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f9928b;

    public TypeAdapters$29(Class cls, y yVar) {
        this.f9927a = cls;
        this.f9928b = yVar;
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        if (typeToken.getRawType() == this.f9927a) {
            return this.f9928b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f9927a.getName() + ",adapter=" + this.f9928b + "]";
    }
}
