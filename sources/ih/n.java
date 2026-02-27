package Ih;

import bg.AbstractC0983W;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC0266a {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2317d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Ah.d dVar, Object obj, int i, int i4) {
        super(dVar);
        this.c = i4;
        this.e = obj;
        this.f2317d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ah.d
    public final void e(nk.b bVar) {
        switch (this.c) {
            case 0:
                Ph.c cVar = Ph.c.f5176a;
                Ah.d dVar = this.f2300b;
                boolean z4 = dVar instanceof Ch.h;
                Ch.f fVar = (Ch.f) this.e;
                if (!z4) {
                    dVar.d(new m((Ah.e) bVar, fVar, this.f2317d));
                } else {
                    try {
                        Object obj = ((Ch.h) dVar).get();
                        if (obj == null) {
                            Ah.e eVar = (Ah.e) bVar;
                            eVar.c(cVar);
                            eVar.onComplete();
                        } else {
                            try {
                                Iterator it = ((Iterable) fVar.apply(obj)).iterator();
                                try {
                                    if (!it.hasNext()) {
                                        Ah.e eVar2 = (Ah.e) bVar;
                                        eVar2.c(cVar);
                                        eVar2.onComplete();
                                    } else if (!(bVar instanceof Fh.a)) {
                                        bVar.c(new o((Ah.e) bVar, it, 1));
                                    } else {
                                        bVar.c(new o((Fh.a) bVar, it, 0));
                                    }
                                } catch (Throwable th2) {
                                    AbstractC0983W.G(th2);
                                    Ah.e eVar3 = (Ah.e) bVar;
                                    eVar3.c(cVar);
                                    eVar3.onError(th2);
                                    return;
                                }
                            } catch (Throwable th3) {
                                AbstractC0983W.G(th3);
                                Ah.e eVar4 = (Ah.e) bVar;
                                eVar4.c(cVar);
                                eVar4.onError(th3);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        AbstractC0983W.G(th4);
                        Ah.e eVar5 = (Ah.e) bVar;
                        eVar5.c(cVar);
                        eVar5.onError(th4);
                        return;
                    }
                }
                break;
            default:
                Ah.n nVarA = ((Ah.o) this.e).a();
                boolean z5 = bVar instanceof Fh.a;
                int i = this.f2317d;
                Ah.d dVar2 = this.f2300b;
                if (!z5) {
                    dVar2.d(new v((Ah.e) bVar, nVarA, i));
                } else {
                    dVar2.d(new u((Fh.a) bVar, nVarA, i));
                }
                break;
        }
    }
}
