package Fj;

import Bj.E;
import Ej.InterfaceC0230h;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0230h[] f1668b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AtomicInteger e;
    public final /* synthetic */ Dj.e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC0230h[] interfaceC0230hArr, int i, AtomicInteger atomicInteger, Dj.e eVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1668b = interfaceC0230hArr;
        this.c = i;
        this.e = atomicInteger;
        this.f = eVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new q(this.f1668b, this.c, this.e, this.f, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1667a;
        AtomicInteger atomicInteger = this.e;
        Dj.e eVar = this.f;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                InterfaceC0230h[] interfaceC0230hArr = this.f1668b;
                int i4 = this.c;
                InterfaceC0230h interfaceC0230h = interfaceC0230hArr[i4];
                p pVar = new p(eVar, i4);
                this.f1667a = 1;
                if (interfaceC0230h.collect(pVar, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.o(null);
            }
            return Unit.f18162a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.o(null);
            }
        }
    }
}
