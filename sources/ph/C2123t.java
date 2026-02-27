package ph;

import java.util.concurrent.Callable;
import xh.C2479c;

/* JADX INFO: renamed from: ph.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123t extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19635b = 0;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19636d;
    public final Object e;

    public C2123t(ch.l lVar, int i, int i4, Callable callable) {
        super(lVar);
        this.c = i;
        this.f19636d = i4;
        this.e = callable;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19635b) {
            case 0:
                Callable callable = (Callable) this.e;
                ch.p pVar = this.f19404a;
                int i = this.f19636d;
                int i4 = this.c;
                if (i != i4) {
                    pVar.subscribe(new C2119s(rVar, i4, i, callable));
                } else {
                    r rVar2 = new r(rVar, i4, callable);
                    if (rVar2.a()) {
                        pVar.subscribe(rVar2);
                    }
                }
                break;
            default:
                hh.n nVar = (hh.n) this.e;
                ch.p pVar2 = this.f19404a;
                if (!S1.s.t(pVar2, rVar, nVar)) {
                    int i6 = this.c;
                    int i10 = this.f19636d;
                    if (i10 != 1) {
                        pVar2.subscribe(new P(i6, rVar, nVar, i10 == 3));
                    } else {
                        pVar2.subscribe(new Q(new C2479c(rVar), nVar, i6));
                    }
                    break;
                }
                break;
        }
    }

    public C2123t(ch.p pVar, hh.n nVar, int i, int i4) {
        super(pVar);
        this.e = nVar;
        this.f19636d = i4;
        this.c = Math.max(8, i);
    }
}
