package Bg;

import ij.AbstractC1609c;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj.n f499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f500b;

    public U(qj.n interceptor, e0 e0Var) {
        kotlin.jvm.internal.j.g(interceptor, "interceptor");
        this.f499a = interceptor;
        this.f500b = e0Var;
    }

    @Override // Bg.e0
    public final Object a(Jg.c cVar, AbstractC1609c abstractC1609c) {
        return this.f499a.invoke(this.f500b, cVar, abstractC1609c);
    }
}
