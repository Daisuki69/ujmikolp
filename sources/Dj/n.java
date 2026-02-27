package Dj;

import Bj.E;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1196b;
    public final /* synthetic */ u c;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u uVar, Object obj, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = uVar;
        this.e = obj;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        n nVar = new n(this.c, this.e, interfaceC1526a);
        nVar.f1196b = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1195a;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                u uVar = this.c;
                Object obj2 = this.e;
                C1037h.a aVar = C1037h.f9166b;
                this.f1195a = 1;
                if (uVar.m(this, obj2) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            objA = Unit.f18162a;
            C1037h.a aVar2 = C1037h.f9166b;
        } catch (Throwable th2) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        return new l(!(objA instanceof C1038i) ? Unit.f18162a : new j(C1037h.a(objA)));
    }
}
