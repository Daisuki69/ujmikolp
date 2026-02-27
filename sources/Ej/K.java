package Ej;

import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1406b;
    public final /* synthetic */ InterfaceC0230h c;
    public final /* synthetic */ V e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC0230h interfaceC0230h, V v7, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = interfaceC0230h;
        this.e = v7;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        K k8 = new K(this.c, this.e, interfaceC1526a);
        k8.f1406b = obj;
        return k8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((Y) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1405a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            int iOrdinal = ((Y) this.f1406b).ordinal();
            V v7 = this.e;
            if (iOrdinal == 0) {
                this.f1405a = 1;
                if (this.c.collect(v7, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                synchronized (v7) {
                    v7.s(((long) v7.f1420k) + v7.n(), v7.j, ((long) v7.f1420k) + v7.n(), ((long) v7.f1421l) + v7.n() + ((long) v7.f1420k));
                    Unit unit = Unit.f18162a;
                }
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
