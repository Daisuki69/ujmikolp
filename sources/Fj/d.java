package Fj;

import Bj.AbstractC0166y;
import Bj.E;
import Bj.F;
import Ej.InterfaceC0231i;
import Ej.W;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1646b;
    public final /* synthetic */ InterfaceC0231i c;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0231i interfaceC0231i, f fVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = interfaceC0231i;
        this.e = fVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        d dVar = new d(this.c, this.e, interfaceC1526a);
        dVar.f1646b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC1578a.f17050a;
        int i = this.f1645a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            E e = (E) this.f1646b;
            f fVar = this.e;
            int i4 = fVar.f1650b;
            if (i4 == -3) {
                i4 = -2;
            }
            F f = F.c;
            Function2 eVar = new e(fVar, null);
            Dj.q qVar = new Dj.q(AbstractC0166y.b(e, fVar.f1649a), of.p.a(i4, 4, fVar.c), true, true);
            qVar.j0(f, qVar, eVar);
            this.f1645a = 1;
            Object objI = W.i(this.c, qVar, true, this);
            if (objI != obj2) {
                objI = Unit.f18162a;
            }
            if (objI == obj2) {
                return obj2;
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
