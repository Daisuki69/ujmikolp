package oh;

import ch.r;
import hh.n;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f18867b;
    public final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18868d;
    public final int e;

    public /* synthetic */ e(ch.l lVar, n nVar, int i, int i4, int i6) {
        this.f18866a = i6;
        this.f18867b = lVar;
        this.c = nVar;
        this.f18868d = i;
        this.e = i4;
    }

    @Override // ch.l
    public final void subscribeActual(r rVar) {
        switch (this.f18866a) {
            case 0:
                ch.l lVar = this.f18867b;
                n nVar = this.c;
                if (!AbstractC1955a.C(lVar, nVar, rVar)) {
                    lVar.subscribe(new C1982d(rVar, nVar, this.e, this.f18868d, 0));
                }
                break;
            default:
                ch.l lVar2 = this.f18867b;
                n nVar2 = this.c;
                if (!AbstractC1955a.D(lVar2, nVar2, rVar)) {
                    lVar2.subscribe(new C1982d(rVar, nVar2, this.e, this.f18868d, 1));
                }
                break;
        }
    }
}
