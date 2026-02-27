package Fj;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1662b;
    public final /* synthetic */ n c;
    public final /* synthetic */ InterfaceC0231i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = nVar;
        this.e = interfaceC0231i;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        m mVar = new m(this.c, this.e, interfaceC1526a);
        mVar.f1662b = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1661a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            E e = (E) this.f1662b;
            kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
            n nVar = this.c;
            InterfaceC0230h interfaceC0230h = nVar.f1653d;
            l lVar = new l(yVar, e, nVar, this.e);
            this.f1661a = 1;
            if (interfaceC0230h.collect(lVar, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
