package Q4;

import bj.AbstractC1039j;
import cj.C1112C;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f5229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k8, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5229a = k8;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new J(this.f5229a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        K k8 = this.f5229a;
        A5.j jVar = k8.c;
        List list = jVar != null ? (List) jVar.invoke() : C1112C.f9377a;
        G4.b bVar = k8.f1548b;
        if (bVar != null) {
            bVar.b(new K4.w(list));
        }
        return Unit.f18162a;
    }
}
