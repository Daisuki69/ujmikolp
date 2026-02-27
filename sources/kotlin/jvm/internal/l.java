package kotlin.jvm.internal;

import xj.InterfaceC2487c;
import xj.InterfaceC2492h;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends n implements xj.j {
    @Override // kotlin.jvm.internal.AbstractC1788c
    public InterfaceC2487c computeReflected() {
        z.f18196a.getClass();
        return this;
    }

    @Override // xj.m
    public Object getDelegate(Object obj) {
        return ((xj.j) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ xj.k getGetter() {
        mo256getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC2492h getSetter() {
        mo257getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // xj.m
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public xj.l mo256getGetter() {
        ((xj.j) getReflected()).mo256getGetter();
        return null;
    }

    @Override // xj.j
    /* JADX INFO: renamed from: getSetter, reason: collision with other method in class */
    public xj.i mo257getSetter() {
        ((xj.j) getReflected()).mo257getSetter();
        return null;
    }
}
