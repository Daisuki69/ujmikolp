package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19170b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19171d;
    public final int e;

    public E0(ch.p pVar, hh.n nVar, boolean z4, int i, int i4) {
        super(pVar);
        this.f19170b = nVar;
        this.c = z4;
        this.f19171d = i;
        this.e = i4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        hh.n nVar = this.f19170b;
        ch.p pVar = this.f19404a;
        if (S1.s.t(pVar, rVar, nVar)) {
            return;
        }
        pVar.subscribe(new D0(this.f19171d, this.e, rVar, nVar, this.c));
    }
}
