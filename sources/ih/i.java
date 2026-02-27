package Ih;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC0266a {
    public final Ch.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ch.c f2308d;
    public final Ch.a e;
    public final mg.c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Ah.d dVar, Ch.c cVar, Ch.c cVar2, Ch.a aVar) {
        super(dVar);
        mg.c cVar3 = Eh.d.f1365b;
        this.c = cVar;
        this.f2308d = cVar2;
        this.e = aVar;
        this.f = cVar3;
    }

    @Override // Ah.d
    public final void e(nk.b bVar) {
        boolean z4 = bVar instanceof Fh.a;
        Ah.d dVar = this.f2300b;
        if (z4) {
            dVar.d(new g((Fh.a) bVar, this.c, this.f2308d, this.e, this.f));
        } else {
            dVar.d(new h((Ah.e) bVar, this.c, this.f2308d, this.e, this.f));
        }
    }
}
