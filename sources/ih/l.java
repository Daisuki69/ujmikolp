package Ih;

import bg.AbstractC0983W;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC0266a {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Ah.d dVar, Object obj, int i) {
        super(dVar);
        this.c = i;
        this.f2310d = obj;
    }

    @Override // Ah.d
    public final void e(nk.b bVar) {
        Ah.d dVar = this.f2300b;
        Object obj = this.f2310d;
        switch (this.c) {
            case 0:
                Ch.g gVar = (Ch.g) obj;
                if (!(bVar instanceof Fh.a)) {
                    dVar.d(new k((Ah.e) bVar, gVar));
                } else {
                    dVar.d(new j((Fh.a) bVar, gVar, 0));
                }
                break;
            case 1:
                Ch.f fVar = (Ch.f) obj;
                if (!(bVar instanceof Fh.a)) {
                    dVar.d(new s((Ah.e) bVar, fVar));
                } else {
                    dVar.d(new j((Fh.a) bVar, fVar, 1));
                }
                break;
            default:
                try {
                    ((Qh.b) obj).getClass();
                    ArrayList arrayList = new ArrayList();
                    Qh.d dVar2 = Qh.e.f5385a;
                    B b8 = new B((Ah.e) bVar);
                    b8.f5175b = arrayList;
                    dVar.d(b8);
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    Ah.e eVar = (Ah.e) bVar;
                    eVar.c(Ph.c.f5176a);
                    eVar.onError(th2);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l lVar) {
        super(lVar);
        this.c = 2;
        Qh.b bVar = Qh.b.f5382a;
        this.f2310d = bVar;
    }
}
