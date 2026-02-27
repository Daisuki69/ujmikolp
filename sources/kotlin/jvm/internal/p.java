package kotlin.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import xj.InterfaceC2487c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends t implements KProperty, Function0 {
    @Override // kotlin.jvm.internal.AbstractC1788c
    public final InterfaceC2487c computeReflected() {
        z.f18196a.getClass();
        return this;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((Gj.h) this).a();
    }
}
