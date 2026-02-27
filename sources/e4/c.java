package E4;

import Bj.E;
import bj.AbstractC1039j;
import com.paymaya.domain.store.G;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f1256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(G g8, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1256a = g8;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new c(this.f1256a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        this.f1256a.invoke(null, R4.a.UNKNOWN_ERROR);
        return Unit.f18162a;
    }
}
