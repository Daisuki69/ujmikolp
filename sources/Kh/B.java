package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC0296a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ah.o f2677b;
    public final int c;

    public B(Ah.h hVar, Ah.o oVar, int i) {
        super(hVar);
        this.f2677b = oVar;
        this.c = i;
    }

    @Override // Ah.h
    public final void h(Ah.j jVar) {
        Ah.o oVar = this.f2677b;
        boolean z4 = oVar instanceof Nh.x;
        Ah.h hVar = this.f2715a;
        if (z4) {
            hVar.g(jVar);
        } else {
            hVar.g(new A(jVar, oVar.a(), this.c));
        }
    }
}
