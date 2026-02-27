package Q4;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f5220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b8, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5220a = b8;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new A(this.f5220a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        B b8 = this.f5220a;
        b8.getClass();
        Bj.H.w(F4.a.c(), null, null, new z(b8, null), 3);
        return Unit.f18162a;
    }
}
