package ph;

import ih.EnumC1605c;
import xh.C2479c;

/* JADX INFO: renamed from: ph.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2065e0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19445b;
    public final hh.n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2065e0(ch.p pVar, hh.n nVar, int i) {
        super(pVar);
        this.f19445b = i;
        this.c = nVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19445b) {
            case 0:
                this.f19404a.subscribe(new C2061d0(new C2479c(rVar), this.c));
                break;
            case 1:
                this.f19404a.subscribe(new C2101n0(rVar, this.c));
                break;
            case 2:
                this.f19404a.subscribe(new L0(rVar, this.c, 0));
                break;
            case 3:
                this.f19404a.subscribe(new C2116r0(rVar, this.c, 2));
                break;
            case 4:
                this.f19404a.subscribe(new L0(rVar, this.c, 1));
                break;
            case 5:
                Wh.b bVar = new Wh.b();
                try {
                    Object objApply = this.c.apply(bVar);
                    jh.e.b(objApply, "The selector returned a null ObservableSource");
                    ch.p pVar = (ch.p) objApply;
                    A2 a22 = new A2(rVar, 2);
                    pVar.subscribe(a22);
                    this.f19404a.subscribe(new D1(bVar, a22, 0));
                } catch (Throwable th2) {
                    of.p.F(th2);
                    EnumC1605c.c(th2, rVar);
                    return;
                }
                break;
            case 6:
                Wh.c cVar = new Wh.c(new Wh.b());
                try {
                    Object objApply2 = this.c.apply(cVar);
                    jh.e.b(objApply2, "The handler returned a null ObservableSource");
                    ch.p pVar2 = (ch.p) objApply2;
                    Q1 q1 = new Q1(rVar, cVar, this.f19404a, 0);
                    rVar.onSubscribe(q1);
                    pVar2.subscribe((P1) q1.i);
                    q1.b();
                } catch (Throwable th3) {
                    of.p.F(th3);
                    EnumC1605c.c(th3, rVar);
                    return;
                }
                break;
            default:
                Wh.c cVar2 = new Wh.c(new Wh.b());
                try {
                    Object objApply3 = this.c.apply(cVar2);
                    jh.e.b(objApply3, "The handler returned a null ObservableSource");
                    ch.p pVar3 = (ch.p) objApply3;
                    Q1 q12 = new Q1(rVar, cVar2, this.f19404a, 1);
                    rVar.onSubscribe(q12);
                    pVar3.subscribe((P1) q12.i);
                    q12.b();
                } catch (Throwable th4) {
                    of.p.F(th4);
                    EnumC1605c.c(th4, rVar);
                }
                break;
        }
    }
}
