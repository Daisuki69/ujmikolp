package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19338b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19339d;
    public final int e;

    public T(ch.l lVar, hh.n nVar, int i, int i4, int i6) {
        super(lVar);
        this.f19338b = nVar;
        this.c = i;
        this.f19339d = i4;
        this.e = i6;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19404a.subscribe(new S(rVar, this.f19338b, this.f19339d, this.e, this.c));
    }
}
