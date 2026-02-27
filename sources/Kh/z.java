package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2773b;
    public final Ch.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Ah.h hVar, Ch.f fVar, int i) {
        super(hVar);
        this.f2773b = i;
        this.c = fVar;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        switch (this.f2773b) {
            case 0:
                this.f2715a.g(new C0312q(jVar, this.c, 1));
                break;
            default:
                Ch.f fVar = this.c;
                C c = new C();
                c.c = jVar;
                c.f2680d = fVar;
                c.e = new Dh.d(0);
                jVar.a((Dh.d) c.e);
                this.f2715a.g(c);
                break;
        }
    }
}
