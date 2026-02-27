package ph;

import fh.C1487c;

/* JADX INFO: renamed from: ph.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075g2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.o f19478b;
    public final long c;

    public C2075g2(ch.l lVar, long j, hh.o oVar) {
        super(lVar);
        this.f19478b = oVar;
        this.c = j;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        C1487c c1487c = new C1487c();
        rVar.onSubscribe(c1487c);
        new C2071f2(rVar, this.c, this.f19478b, c1487c, this.f19404a).a();
    }
}
