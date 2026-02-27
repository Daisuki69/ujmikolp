package Fj;

import Bj.E;
import Ej.InterfaceC0231i;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1655b;
    public final /* synthetic */ InterfaceC0231i c;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC0231i interfaceC0231i, Object obj, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1655b = nVar;
        this.c = interfaceC0231i;
        this.e = obj;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new j(this.f1655b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ij.j, qj.n] */
    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1654a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            ?? r42 = this.f1655b.e;
            this.f1654a = 1;
            if (r42.invoke(this.c, this.e, this) == enumC1578a) {
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
