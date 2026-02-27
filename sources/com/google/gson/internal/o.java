package com.google.gson.internal;

import D8.C0193a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10000b;
    public final /* synthetic */ Object c;

    public o(Object obj, Method method) {
        this.f10000b = method;
        this.c = obj;
    }

    @Override // com.google.gson.internal.s
    public final Object a(Class cls) {
        String strB = C0193a.b(cls);
        if (strB == null) {
            return this.f10000b.invoke(this.c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
