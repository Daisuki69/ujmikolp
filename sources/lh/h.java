package Lh;

import Ah.o;
import Ah.p;
import Ah.q;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f3001b;
    public final o c;

    public /* synthetic */ h(p pVar, o oVar, int i) {
        this.f3000a = i;
        this.f3001b = pVar;
        this.c = oVar;
    }

    @Override // Ah.p
    public final void g(q qVar) {
        switch (this.f3000a) {
            case 0:
                this.f3001b.f(new g(qVar, this.c));
                break;
            default:
                Hh.e eVar = new Hh.e(qVar, this.f3001b);
                qVar.a(eVar);
                io.reactivex.rxjava3.disposables.b bVarB = this.c.b(eVar);
                Dh.d dVar = (Dh.d) eVar.c;
                dVar.getClass();
                Dh.a.c(dVar, bVarB);
                break;
        }
    }
}
