package Ih;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC0266a {
    public final Nh.j c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2296d;

    public A(Ah.d dVar, Nh.j jVar, boolean z4) {
        super(dVar);
        this.c = jVar;
        this.f2296d = z4;
    }

    @Override // Ah.d
    public final void e(nk.b bVar) {
        Ah.n nVarA = this.c.a();
        z zVar = new z((Ah.e) bVar, nVarA, this.f2300b, this.f2296d);
        bVar.c(zVar);
        nVarA.b(zVar);
    }
}
