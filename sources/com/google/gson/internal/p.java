package com.google.gson.internal;

import D8.C0193a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10001b;
    public final /* synthetic */ int c;

    public p(Method method, int i) {
        this.f10001b = method;
        this.c = i;
    }

    @Override // com.google.gson.internal.s
    public final Object a(Class cls) {
        String strB = C0193a.b(cls);
        if (strB == null) {
            return this.f10001b.invoke(null, cls, Integer.valueOf(this.c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
