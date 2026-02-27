package ph;

import ih.EnumC1604b;
import n4.RunnableC1918b;

/* JADX INFO: loaded from: classes4.dex */
public final class B2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19129b;
    public final ch.v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B2(ch.l lVar, ch.v vVar, int i) {
        super(lVar);
        this.f19129b = i;
        this.c = vVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19129b) {
            case 0:
                A2 a22 = new A2(rVar, 0);
                rVar.onSubscribe(a22);
                EnumC1604b.e(a22, this.c.d(new RunnableC1918b(7, this, a22)));
                break;
            default:
                this.f19404a.subscribe(new V2(rVar, this.c));
                break;
        }
    }
}
