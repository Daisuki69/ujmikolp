package ph;

import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19205b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H0(ch.l lVar, Object obj, boolean z4, int i) {
        super(lVar);
        this.f19205b = i;
        this.c = obj;
        this.f19206d = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19205b) {
            case 0:
                this.f19404a.subscribe(new G0(rVar, (hh.n) this.c, this.f19206d));
                break;
            case 1:
                this.f19404a.subscribe(new K0(0, rVar, (hh.n) this.c, this.f19206d));
                break;
            case 2:
                this.f19404a.subscribe(new K0(1, rVar, (hh.n) this.c, this.f19206d));
                break;
            case 3:
                C2133v1 c2133v1 = new C2133v1(rVar, (hh.n) this.c, this.f19206d);
                rVar.onSubscribe(c2133v1.f19667d);
                this.f19404a.subscribe(c2133v1);
                break;
            default:
                C2479c c2479c = new C2479c(rVar);
                ch.p pVar = (ch.p) this.c;
                boolean z4 = this.f19206d;
                ch.p pVar2 = this.f19404a;
                if (!z4) {
                    pVar2.subscribe(new C2095l2(c2479c, pVar));
                } else {
                    pVar2.subscribe(new C2091k2(c2479c, pVar));
                }
                break;
        }
    }
}
