package Kh;

/* JADX INFO: renamed from: Kh.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0307l extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0307l(Ah.h hVar, int i) {
        super(hVar);
        this.f2736b = i;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        switch (this.f2736b) {
            case 0:
                this.f2715a.g(new C0306k(jVar));
                break;
            case 1:
                this.f2715a.g(new K(jVar));
                break;
            default:
                this.f2715a.g(new L(jVar));
                break;
        }
    }
}
