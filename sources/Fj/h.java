package Fj;

import Bj.AbstractC0166y;
import Bj.C0165x;
import Ej.C0228f;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import gj.C1527b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0230h f1653d;

    public h(int i, Dj.a aVar, InterfaceC0230h interfaceC0230h, CoroutineContext coroutineContext) {
        super(coroutineContext, i, aVar);
        this.f1653d = interfaceC0230h;
    }

    @Override // Fj.f
    public final Object c(Dj.r rVar, InterfaceC1526a interfaceC1526a) {
        Object objF = f(new z(rVar), interfaceC1526a);
        return objF == EnumC1578a.f17050a ? objF : Unit.f18162a;
    }

    @Override // Fj.f, Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        if (this.f1650b == -3) {
            CoroutineContext context = interfaceC1526a.getContext();
            Boolean bool = Boolean.FALSE;
            C0165x c0165x = new C0165x(0);
            CoroutineContext coroutineContext = this.f1649a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, c0165x)).booleanValue() ? context.plus(coroutineContext) : AbstractC0166y.a(context, coroutineContext, false);
            if (kotlin.jvm.internal.j.b(coroutineContextPlus, context)) {
                Object objF = f(interfaceC0231i, interfaceC1526a);
                return objF == EnumC1578a.f17050a ? objF : Unit.f18162a;
            }
            C1527b c1527b = kotlin.coroutines.d.f18169N;
            if (kotlin.jvm.internal.j.b(coroutineContextPlus.get(c1527b), context.get(c1527b))) {
                CoroutineContext context2 = interfaceC1526a.getContext();
                if (!(interfaceC0231i instanceof z) && !(interfaceC0231i instanceof v)) {
                    interfaceC0231i = new C0228f(interfaceC0231i, context2);
                }
                Object objB = AbstractC0249b.b(coroutineContextPlus, interfaceC0231i, Gj.v.b(coroutineContextPlus), new g(this, null), interfaceC1526a);
                return objB == EnumC1578a.f17050a ? objB : Unit.f18162a;
            }
        }
        Object objCollect = super.collect(interfaceC0231i, interfaceC1526a);
        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
    }

    public abstract Object f(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a);

    @Override // Fj.f
    public final String toString() {
        return this.f1653d + " -> " + super.toString();
    }
}
