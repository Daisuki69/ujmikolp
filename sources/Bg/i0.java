package Bg;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends AbstractC1616j implements qj.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Jg.c f533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(String str, InterfaceC1526a interfaceC1526a) {
        super(4, interfaceC1526a);
        this.f534b = str;
    }

    @Override // qj.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        i0 i0Var = new i0(this.f534b, (InterfaceC1526a) obj4);
        i0Var.f533a = (Jg.c) obj2;
        return i0Var.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        Jg.c cVar = this.f533a;
        j0.f536a.g("Adding User-Agent header: agent for " + cVar.f2520a);
        List list = Ng.q.f4436a;
        cVar.c.j(RtspHeaders.USER_AGENT, this.f534b.toString());
        return Unit.f18162a;
    }
}
