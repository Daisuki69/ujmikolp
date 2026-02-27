package oh;

import ch.r;
import hh.n;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends ch.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.l f18883b;
    public final n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18884d;

    public /* synthetic */ k(ch.l lVar, n nVar, boolean z4, int i) {
        this.f18882a = i;
        this.f18883b = lVar;
        this.c = nVar;
        this.f18884d = z4;
    }

    @Override // ch.l
    public final void subscribeActual(r rVar) {
        switch (this.f18882a) {
            case 0:
                ch.l lVar = this.f18883b;
                n nVar = this.c;
                if (!AbstractC1955a.C(lVar, nVar, rVar)) {
                    lVar.subscribe(new j(rVar, nVar, this.f18884d));
                }
                break;
            default:
                ch.l lVar2 = this.f18883b;
                n nVar2 = this.c;
                if (!AbstractC1955a.D(lVar2, nVar2, rVar)) {
                    lVar2.subscribe(new m(rVar, nVar2, this.f18884d));
                }
                break;
        }
    }
}
