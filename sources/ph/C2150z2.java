package ph;

import ih.C1603a;
import xh.C2479c;

/* JADX INFO: renamed from: ph.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150z2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19706b;
    public final ch.p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2150z2(ch.l lVar, ch.p pVar, int i) {
        super(lVar);
        this.f19706b = i;
        this.c = pVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19706b) {
            case 0:
                C2479c c2479c = new C2479c(rVar);
                C1603a c1603a = new C1603a(2);
                c2479c.onSubscribe(c1603a);
                C2146y2 c2146y2 = new C2146y2(c2479c, c1603a);
                this.c.subscribe(new C2142x2(c1603a, c2146y2, c2479c));
                this.f19404a.subscribe(c2146y2);
                break;
            case 1:
                C2097m0 c2097m0 = new C2097m0(rVar, this.c);
                rVar.onSubscribe(c2097m0.c);
                this.f19404a.subscribe(c2097m0);
                break;
            default:
                I2 i22 = new I2(rVar);
                rVar.onSubscribe(i22);
                this.c.subscribe(i22.c);
                this.f19404a.subscribe(i22);
                break;
        }
    }
}
