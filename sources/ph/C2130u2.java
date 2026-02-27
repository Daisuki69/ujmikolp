package ph;

/* JADX INFO: renamed from: ph.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2130u2 extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19654b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2130u2(ch.l lVar, int i, int i4) {
        super(lVar);
        this.f19654b = i4;
        this.c = i;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19654b) {
            case 0:
                this.f19404a.subscribe(new C2126t2(rVar, this.c));
                break;
            default:
                this.f19404a.subscribe(new F2(rVar, this.c));
                break;
        }
    }
}
