package Ih;

import bg.AbstractC0983W;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Ah.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X2.h f2305b;

    public f(X2.h hVar) {
        this.f2305b = hVar;
    }

    @Override // Ah.d
    public final void e(nk.b bVar) {
        AbstractC0267b eVar;
        int iC = AbstractC2217b.c(3);
        if (iC == 0) {
            eVar = new e((Ah.e) bVar);
        } else if (iC == 1) {
            eVar = new C0269d((Ah.e) bVar, 1);
        } else if (iC == 3) {
            eVar = new C0269d((Ah.e) bVar, 0);
        } else if (iC != 4) {
            eVar = new C0268c((Ah.e) bVar, Ah.d.f312a);
        } else {
            eVar = new C0268c((Ah.e) bVar);
        }
        bVar.c(eVar);
        try {
            this.f2305b.a(eVar);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            eVar.c(th2);
        }
    }
}
