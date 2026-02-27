package Ih;

import bg.AbstractC0983W;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Ah.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2299a;

    public D(l lVar) {
        this.f2299a = lVar;
    }

    @Override // Ah.p
    public final void g(Ah.q qVar) {
        try {
            ArrayList arrayList = new ArrayList();
            Qh.d dVar = Qh.e.f5385a;
            this.f2299a.d(new C(qVar, arrayList));
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            qVar.a(Dh.b.f1156a);
            qVar.onError(th2);
        }
    }
}
