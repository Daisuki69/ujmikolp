package ph;

/* JADX INFO: renamed from: ph.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2092l extends AbstractC2048a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19538b;
    public final hh.o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2092l(ch.l lVar, hh.o oVar, int i) {
        super(lVar);
        this.f19538b = i;
        this.c = oVar;
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        switch (this.f19538b) {
            case 0:
                this.f19404a.subscribe(new C2088k(rVar, this.c, 0));
                break;
            case 1:
                this.f19404a.subscribe(new C2088k(rVar, this.c, 1));
                break;
            case 2:
                this.f19404a.subscribe(new C2116r0(rVar, this.c, 1));
                break;
            case 3:
                this.f19404a.subscribe(new C2088k(rVar, this.c, 2));
                break;
            case 4:
                this.f19404a.subscribe(new C2088k(rVar, this.c, 3));
                break;
            default:
                this.f19404a.subscribe(new C2088k(rVar, this.c, 4));
                break;
        }
    }
}
