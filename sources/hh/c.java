package Hh;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2178b;

    public /* synthetic */ c(Object obj, int i) {
        this.f2177a = i;
        this.f2178b = obj;
    }

    @Override // Ah.a
    public final void e(Ah.b bVar) {
        switch (this.f2177a) {
            case 0:
                b bVar2 = new b(bVar);
                bVar.a(bVar2);
                try {
                    Ne.d dVar = (Ne.d) ((Na.d) this.f2178b).f4358b;
                    dVar.c.checkLocationSettings(dVar.e).addOnSuccessListener(new Na.d(new N9.f(bVar2, 3), 6)).addOnFailureListener(new Na.d(bVar2, 3));
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    bVar2.onError(th2);
                    return;
                }
                break;
            case 1:
                io.reactivex.rxjava3.disposables.b bVarA = io.reactivex.rxjava3.disposables.a.a(Eh.d.f1364a);
                bVar.a(bVarA);
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) bVarA;
                if (!cVar.a()) {
                    try {
                        ((Ch.a) this.f2178b).run();
                        if (!cVar.a()) {
                            bVar.onComplete();
                        }
                        break;
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        if (cVar.a()) {
                            E1.c.k(th3);
                            return;
                        } else {
                            bVar.onError(th3);
                            return;
                        }
                    }
                }
                break;
            case 2:
                ((Ah.a) this.f2178b).d(new A7.f(18, this, bVar, false));
                break;
            default:
                ((Ah.h) this.f2178b).g(new Jh.b(bVar, 1));
                break;
        }
    }
}
