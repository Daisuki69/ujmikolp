package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class W0 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19366b;
    public final hh.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19367d;
    public final boolean e;

    public W0(ch.l lVar, hh.n nVar, hh.n nVar2, int i, boolean z4) {
        super(lVar);
        this.f19366b = nVar;
        this.c = nVar2;
        this.f19367d = i;
        this.e = z4;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new T0(rVar, this.f19366b, this.c, this.f19367d, this.e));
    }
}
