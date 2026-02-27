package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class S2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19336b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.v f19337d;
    public final ch.p e;

    public S2(ch.l lVar, long j, TimeUnit timeUnit, ch.v vVar, ch.p pVar) {
        super(lVar);
        this.f19336b = j;
        this.c = timeUnit;
        this.f19337d = vVar;
        this.e = pVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        ch.p pVar = this.e;
        ch.p pVar2 = this.f19404a;
        ch.v vVar = this.f19337d;
        if (pVar == null) {
            Q2 q22 = new Q2(rVar, this.f19336b, this.c, vVar.b());
            rVar.onSubscribe(q22);
            InterfaceC1486b interfaceC1486bB = q22.f19320d.b(new Kh.P(1, 0L, q22), q22.f19319b, q22.c);
            C1487c c1487c = q22.e;
            c1487c.getClass();
            EnumC1604b.c(c1487c, interfaceC1486bB);
            pVar2.subscribe(q22);
            return;
        }
        P2 p22 = new P2(rVar, this.f19336b, this.c, vVar.b(), this.e);
        rVar.onSubscribe(p22);
        InterfaceC1486b interfaceC1486bB2 = p22.f19306d.b(new Kh.P(1, 0L, p22), p22.f19305b, p22.c);
        C1487c c1487c2 = p22.e;
        c1487c2.getClass();
        EnumC1604b.c(c1487c2, interfaceC1486bB2);
        pVar2.subscribe(p22);
    }
}
