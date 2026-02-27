package e3;

import Bj.E;
import Ej.InterfaceC0230h;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f16584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f16584b = sVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new o(this.f16584b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f16583a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            s sVar = this.f16584b;
            InterfaceC0230h data = sVar.c.getData();
            n nVar = new n(sVar.f16592d);
            this.f16583a = 1;
            if (data.collect(nVar, this) == enumC1578a) {
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
