package N4;

import Bj.E;
import G6.u;
import K4.D;
import K4.y;
import O4.h;
import bj.AbstractC1039j;
import bj.C1037h;
import com.maya.raven.data.Challenge;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3523b;
    public final /* synthetic */ G4.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(G4.a aVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = aVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        a aVar = new a(this.c, interfaceC1526a);
        aVar.f3523b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        G4.a aVar;
        h hVar;
        y yVar;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f3522a;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                G4.a aVar2 = this.c;
                C1037h.a aVar3 = C1037h.f9166b;
                u uVar = c.f3527b;
                this.f3523b = aVar2;
                this.f3522a = 1;
                Object objA2 = uVar.a(this);
                if (objA2 == enumC1578a) {
                    return enumC1578a;
                }
                aVar = aVar2;
                obj = objA2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (G4.a) this.f3523b;
                AbstractC1039j.b(obj);
            }
            hVar = (h) obj;
            aVar.a(new D(false));
        } catch (Throwable th2) {
            C1037h.a aVar4 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (hVar instanceof O4.g) {
            objA = ((Challenge) ((O4.g) hVar).f4646a).getChallengeToken();
            C1037h.a aVar5 = C1037h.f9166b;
            return new C1037h(objA);
        }
        if (!(hVar instanceof O4.f)) {
            throw new NoWhenBranchMatchedException();
        }
        O4.f fVar = (O4.f) hVar;
        j.g(fVar, "<this>");
        throw c.a((!(fVar instanceof O4.b) || (yVar = ((O4.b) fVar).f4642b) == null) ? null : yVar.a(), "Failed to get challenge! Aborting extraction.");
    }
}
