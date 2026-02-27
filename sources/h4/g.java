package H4;

import Bj.E;
import M8.A0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mx_android.support.v7.media.MediaRouteProviderProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f2120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G4.a f2121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(A0 a02, G4.a aVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f2120a = a02;
        this.f2121b = aVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new g(this.f2120a, this.f2121b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        A0 a02 = this.f2120a;
        A0.w(2, a02.toString(), MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        this.f2121b.b(a02);
        return Unit.f18162a;
    }
}
