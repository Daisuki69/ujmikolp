package Ej;

import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements f0, InterfaceC0230h, Fj.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f1412a;

    public Q(O o8) {
        this.f1412a = o8;
    }

    @Override // Fj.t
    public final InterfaceC0230h a(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != Dj.a.f1164b) ? W.o(this, coroutineContext, i, aVar) : this;
    }

    @Override // Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        ((h0) this.f1412a).collect(interfaceC0231i, interfaceC1526a);
        return EnumC1578a.f17050a;
    }

    @Override // Ej.f0
    public final Object getValue() {
        return ((h0) this.f1412a).getValue();
    }
}
