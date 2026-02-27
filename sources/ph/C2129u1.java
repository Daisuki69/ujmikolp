package ph;

/* JADX INFO: renamed from: ph.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2129u1 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19652b = 0;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19653d;
    public final Object e;

    public C2129u1(ch.l lVar, ch.v vVar, boolean z4, int i) {
        super(lVar);
        this.e = vVar;
        this.f19653d = z4;
        this.c = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19652b) {
            case 0:
                ch.v vVar = (ch.v) this.e;
                boolean z4 = vVar instanceof sh.u;
                ch.p pVar = this.f19404a;
                if (!z4) {
                    pVar.subscribe(new RunnableC2125t1(rVar, vVar.b(), this.f19653d, this.c));
                } else {
                    pVar.subscribe(rVar);
                }
                break;
            default:
                hh.n nVar = (hh.n) this.e;
                ch.p pVar2 = this.f19404a;
                if (!S1.s.t(pVar2, rVar, nVar)) {
                    pVar2.subscribe(new D2(this.c, rVar, nVar, this.f19653d));
                    break;
                }
                break;
        }
    }

    public C2129u1(ch.p pVar, hh.n nVar, int i, boolean z4) {
        super(pVar);
        this.e = nVar;
        this.c = i;
        this.f19653d = z4;
    }
}
