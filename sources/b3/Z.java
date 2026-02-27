package b3;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f8425b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(e0 e0Var, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f8425b = e0Var;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        Z z4 = new Z(this.f8425b, interfaceC1526a);
        z4.f8424a = obj;
        return z4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((C0868H) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        return C0868H.a((C0868H) this.f8424a, null, ((j0) this.f8425b.f8452d).a(), null, 5);
    }
}
