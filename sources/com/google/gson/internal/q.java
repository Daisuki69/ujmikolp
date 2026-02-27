package com.google.gson.internal;

import D8.C0193a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f10002b;

    public q(Method method) {
        this.f10002b = method;
    }

    @Override // com.google.gson.internal.s
    public final Object a(Class cls) {
        String strB = C0193a.b(cls);
        if (strB == null) {
            return this.f10002b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
    }
}
