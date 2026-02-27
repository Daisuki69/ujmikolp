package Hh;

import Ah.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ah.a f2186b;
    public final o c;

    public /* synthetic */ f(Ah.a aVar, o oVar, int i) {
        this.f2185a = i;
        this.f2186b = aVar;
        this.c = oVar;
    }

    @Override // Ah.a
    public final void e(Ah.b bVar) {
        switch (this.f2185a) {
            case 0:
                this.f2186b.d(new e(bVar, this.c));
                break;
            default:
                e eVar = new e(bVar, this.f2186b);
                bVar.a(eVar);
                io.reactivex.rxjava3.disposables.b bVarB = this.c.b(eVar);
                Dh.d dVar = (Dh.d) eVar.c;
                dVar.getClass();
                Dh.a.c(dVar, bVarB);
                break;
        }
    }
}
