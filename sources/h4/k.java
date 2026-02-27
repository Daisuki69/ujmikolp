package H4;

import Bj.E;
import K4.C;
import M8.A0;
import android.os.SystemClock;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G4.a f2130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j, G4.a aVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f2129a = j;
        this.f2130b = aVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new k(this.f2129a, this.f2130b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f2129a;
        C c = new C(false);
        G4.a aVar = this.f2130b;
        aVar.a(c);
        aVar.onSuccess();
        A0.w(2, "Full trace duration: " + jElapsedRealtime + " ms", "Trace");
        return Unit.f18162a;
    }
}
