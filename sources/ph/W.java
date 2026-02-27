package ph;

import ch.AbstractC1109h;
import oh.C1979a;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19365b;
    public final ch.j c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(ch.l lVar, ch.j jVar, int i) {
        super(lVar);
        this.f19365b = i;
        this.c = jVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19365b) {
            case 0:
                this.f19404a.subscribe(new U(rVar, this.c, 1));
                break;
            default:
                C2117r1 c2117r1 = new C2117r1(rVar, 0);
                rVar.onSubscribe(c2117r1);
                this.f19404a.subscribe(c2117r1);
                ((AbstractC1109h) this.c).b((C1979a) c2117r1.j);
                break;
        }
    }
}
