package ph;

import oh.C1979a;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19371b;
    public final ch.y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(ch.l lVar, ch.y yVar, int i) {
        super(lVar);
        this.f19371b = i;
        this.c = yVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19371b) {
            case 0:
                this.f19404a.subscribe(new U(rVar, this.c, 2));
                break;
            default:
                C2117r1 c2117r1 = new C2117r1(rVar, 1);
                rVar.onSubscribe(c2117r1);
                this.f19404a.subscribe(c2117r1);
                ((ch.w) this.c).c((C1979a) c2117r1.j);
                break;
        }
    }
}
