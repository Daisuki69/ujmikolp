package kotlin.jvm.internal;

import xj.InterfaceC2487c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends t implements xj.m {
    @Override // kotlin.jvm.internal.AbstractC1788c
    public InterfaceC2487c computeReflected() {
        z.f18196a.getClass();
        return this;
    }

    @Override // xj.m
    public Object getDelegate(Object obj) {
        return ((xj.m) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ xj.k getGetter() {
        mo256getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // xj.m
    /* JADX INFO: renamed from: getGetter */
    public xj.l mo256getGetter() {
        ((xj.m) getReflected()).mo256getGetter();
        return null;
    }
}
