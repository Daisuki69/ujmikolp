package ph;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19409b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19410d;

    public a3(ch.l lVar, long j, long j6, int i) {
        super(lVar);
        this.f19409b = j;
        this.c = j6;
        this.f19410d = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        long j = this.f19409b;
        long j6 = this.c;
        ch.p pVar = this.f19404a;
        if (j == j6) {
            pVar.subscribe(new Y2(rVar, j, this.f19410d));
        } else {
            pVar.subscribe(new Z2(rVar, this.f19409b, this.c, this.f19410d));
        }
    }
}
