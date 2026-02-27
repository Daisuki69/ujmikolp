package Q4;

import M8.A0;
import bj.AbstractC1039j;
import defpackage.CollectorDetails;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Q4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0567k extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0568l f5244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567k(C0568l c0568l, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5244a = c0568l;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0567k(this.f5244a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0567k) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        C0568l c0568l = this.f5244a;
        CollectorDetails collectorDetails = new CollectorDetails(c0568l.f5245d, null, c0568l.e, c0568l.f, E1.c.q(new Long(new Date().getTime())), null, null, "android", c0568l.f5246g, c0568l.c.getPackageName(), c0568l.h, null, 2144, null);
        c0568l.i = collectorDetails;
        A0.w(3, String.valueOf(collectorDetails), null);
        G4.b bVar = c0568l.f1548b;
        if (bVar != null) {
            bVar.b(new K4.m(c0568l.i));
        }
        return Unit.f18162a;
    }
}
