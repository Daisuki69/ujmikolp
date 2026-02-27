package Ej;

import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class P implements S, InterfaceC0230h, Fj.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f1411a;

    public P(V v7) {
        this.f1411a = v7;
    }

    @Override // Fj.t
    public final InterfaceC0230h a(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return W.o(this, coroutineContext, i, aVar);
    }

    @Override // Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        this.f1411a.collect(interfaceC0231i, interfaceC1526a);
        return EnumC1578a.f17050a;
    }
}
