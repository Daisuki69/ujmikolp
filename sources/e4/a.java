package E4;

import Bj.E;
import bj.AbstractC1039j;
import com.paymaya.domain.store.G;
import defpackage.Location;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f1252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Location f1253b;
    public final /* synthetic */ R4.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(G g8, Location location, R4.a aVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f1252a = g8;
        this.f1253b = location;
        this.c = aVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new a(this.f1252a, this.f1253b, this.c, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        this.f1252a.invoke(this.f1253b, this.c);
        return Unit.f18162a;
    }
}
