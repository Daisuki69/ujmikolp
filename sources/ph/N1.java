package ph;

import fh.C1487c;

/* JADX INFO: loaded from: classes4.dex */
public final class N1 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19282b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N1(ch.p pVar, long j, int i) {
        super(pVar);
        this.f19282b = i;
        this.c = j;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19282b) {
            case 0:
                C1487c c1487c = new C1487c();
                rVar.onSubscribe(c1487c);
                long j = this.c;
                new M1(rVar, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, c1487c, this.f19404a).a();
                break;
            case 1:
                this.f19404a.subscribe(new Y(rVar, this.c));
                break;
            default:
                this.f19404a.subscribe(new E2(rVar, this.c));
                break;
        }
    }
}
