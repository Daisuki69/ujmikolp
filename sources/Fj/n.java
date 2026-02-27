package Fj;

import Bj.H;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends h {
    public final AbstractC1616j e;

    /* JADX WARN: Multi-variable type inference failed */
    public n(qj.n nVar, InterfaceC0230h interfaceC0230h, CoroutineContext coroutineContext, int i, Dj.a aVar) {
        super(i, aVar, interfaceC0230h, coroutineContext);
        this.e = (AbstractC1616j) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ij.j, qj.n] */
    @Override // Fj.f
    public final f d(CoroutineContext coroutineContext, int i, Dj.a aVar) {
        return new n(this.e, this.f1653d, coroutineContext, i, aVar);
    }

    @Override // Fj.h
    public final Object f(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        Object objL = H.l(new m(this, interfaceC0231i, null), interfaceC1526a);
        return objL == EnumC1578a.f17050a ? objL : Unit.f18162a;
    }
}
