package e3;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.W;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f16586b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f16586b = sVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new p(this.f16586b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f16585a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        InterfaceC0230h data = this.f16586b.c.getData();
        this.f16585a = 1;
        Object objJ = W.j(data, this);
        return objJ == enumC1578a ? enumC1578a : objJ;
    }
}
