package b3;

import Bg.C0104a;
import Ej.C0241t;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8421b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8421b = e0Var;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new X(this.f8421b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f8420a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            e0 e0Var = this.f8421b;
            C0241t c0241t = new C0241t(e0Var.e.getData(), new C0104a(e0Var, null, 7));
            Ej.C c = new Ej.C(e0Var, 2);
            this.f8420a = 1;
            if (c0241t.collect(c, this) == enumC1578a) {
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
