package ph;

import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.p f19479b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19480d;

    public g3(ch.l lVar, ch.p pVar, hh.n nVar, int i) {
        super(lVar);
        this.f19479b = pVar;
        this.c = nVar;
        this.f19480d = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new e3(new C2479c(rVar), this.f19479b, this.c, this.f19480d));
    }
}
