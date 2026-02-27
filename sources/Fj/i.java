package Fj;

import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends h {
    public i(InterfaceC0230h interfaceC0230h, Bj.A a8, int i, Dj.a aVar, int i4) {
        super((i4 & 4) != 0 ? -3 : i, (i4 & 8) != 0 ? Dj.a.f1163a : aVar, interfaceC0230h, (i4 & 2) != 0 ? kotlin.coroutines.g.f18170a : a8);
    }

    @Override // Fj.f
    public final f d(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return new i(i, aVar, this.f1653d, coroutineContext);
    }

    @Override // Fj.f
    public final InterfaceC0230h e() {
        return this.f1653d;
    }

    @Override // Fj.h
    public final Object f(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        Object objCollect = this.f1653d.collect(interfaceC0231i, interfaceC1526a);
        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
    }
}
