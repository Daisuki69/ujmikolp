package Ej;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ej.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0235m extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0241t f1462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235m(C0241t c0241t, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1462b = c0241t;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0235m(this.f1462b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0235m) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1461a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            this.f1461a = 1;
            Object objCollect = this.f1462b.collect(Fj.v.f1677a, this);
            if (objCollect != enumC1578a) {
                objCollect = Unit.f18162a;
            }
            if (objCollect == enumC1578a) {
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
