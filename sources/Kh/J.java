package Kh;

import bg.AbstractC0983W;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends Ah.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2695b;

    public /* synthetic */ J(Object obj, int i) {
        this.f2694a = i;
        this.f2695b = obj;
    }

    @Override // Ah.p
    public final void g(Ah.q qVar) {
        io.reactivex.rxjava3.disposables.b bVar = Dh.b.f1156a;
        Object obj = this.f2695b;
        switch (this.f2694a) {
            case 0:
                ((Ah.h) obj).g(new H(qVar, 1));
                return;
            case 1:
                Lh.a aVar = new Lh.a(qVar);
                qVar.a(aVar);
                try {
                    ((Ah.r) obj).a(aVar);
                    return;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    aVar.a(th2);
                    return;
                }
            case 2:
                try {
                    th = ((Eh.c) obj).f1363a;
                } catch (Throwable th3) {
                    th = th3;
                    AbstractC0983W.G(th);
                }
                if (th == null) {
                    throw Qh.e.b("Supplier returned a null Throwable.");
                }
                Qh.d dVar = Qh.e.f5385a;
                qVar.a(bVar);
                qVar.onError(th);
                return;
            case 3:
                io.reactivex.rxjava3.disposables.b bVarA = io.reactivex.rxjava3.disposables.a.a(Eh.d.f1364a);
                qVar.a(bVarA);
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) bVarA;
                if (cVar.a()) {
                    return;
                }
                try {
                    Object objCall = ((Callable) obj).call();
                    Objects.requireNonNull(objCall, "The callable returned a null value");
                    if (cVar.a()) {
                        return;
                    }
                    qVar.onSuccess(objCall);
                    return;
                } catch (Throwable th4) {
                    AbstractC0983W.G(th4);
                    if (cVar.a()) {
                        E1.c.k(th4);
                        return;
                    } else {
                        qVar.onError(th4);
                        return;
                    }
                }
            default:
                qVar.a(bVar);
                qVar.onSuccess(obj);
                return;
        }
    }
}
