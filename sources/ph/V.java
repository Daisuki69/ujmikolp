package ph;

import ch.AbstractC1103b;
import ch.InterfaceC1105d;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19356b;
    public final InterfaceC1105d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(ch.l lVar, InterfaceC1105d interfaceC1105d, int i) {
        super(lVar);
        this.f19356b = i;
        this.c = interfaceC1105d;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19356b) {
            case 0:
                this.f19404a.subscribe(new U(rVar, this.c, 0));
                break;
            default:
                C2114q1 c2114q1 = new C2114q1(rVar);
                rVar.onSubscribe(c2114q1);
                this.f19404a.subscribe(c2114q1);
                ((AbstractC1103b) this.c).b(c2114q1.c);
                break;
        }
    }
}
