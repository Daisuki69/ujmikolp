package Kh;

import bg.AbstractC0983W;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends Ah.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2714b;
    public final Object c;

    public /* synthetic */ T(int i, Object obj, Object obj2) {
        this.f2713a = i;
        this.f2714b = obj;
        this.c = obj2;
    }

    @Override // Ah.p
    public final void g(Ah.q qVar) {
        int i = 3;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.f2714b;
        switch (this.f2713a) {
            case 0:
                try {
                    Object obj3 = ((Eh.a) obj).get();
                    Qh.d dVar = Qh.e.f5385a;
                    ((C0305j) obj2).g(new Gh.e(3, qVar, (Collection) obj3));
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    qVar.a(Dh.b.f1156a);
                    qVar.onError(th2);
                    return;
                }
                break;
            case 1:
                Dh.d dVar2 = new Dh.d(0);
                qVar.a(dVar2);
                ((J) obj2).f(new Cg.c(this, dVar2, qVar));
                break;
            case 2:
                ((Ah.a) obj).d(new Gh.d(4, qVar, (Ah.p) obj2));
                break;
            case 3:
                ((S) obj).g(new Lh.b(qVar, (Ah.p) obj2));
                break;
            case 4:
                ((Lh.d) obj2).f(new Gh.e(4, qVar, (y9.d) obj));
                break;
            case 5:
                ((Ah.p) obj2).f(new Hh.d(qVar, (Ch.a) obj, 1));
                break;
            case 6:
                TimeUnit timeUnit = TimeUnit.SECONDS;
                RunnableC0302g runnableC0302g = new RunnableC0302g(qVar);
                qVar.a(runnableC0302g);
                Dh.a.c((AtomicReference) runnableC0302g.f2729d, ((Nh.e) obj).c(runnableC0302g, 120L, timeUnit));
                ((Ah.p) obj2).f(runnableC0302g);
                break;
            default:
                Ah.p[] pVarArr = (Ah.p[]) obj2;
                int length = pVarArr.length;
                if (length == 1) {
                    pVarArr[0].f(new Lh.c(i, qVar, new Gc.h(this, 17), z4));
                } else {
                    Lh.k kVar = new Lh.k(length, qVar, (Ch.f) obj);
                    qVar.a(kVar);
                    for (int i4 = 0; i4 < length; i4++) {
                        if (!(kVar.get() <= 0)) {
                            Ah.p pVar = pVarArr[i4];
                            if (pVar == null) {
                                kVar.a(new NullPointerException("One of the sources is null"), i4);
                            } else {
                                pVar.f(kVar.c[i4]);
                            }
                        }
                    }
                }
                break;
        }
    }

    public T(Ah.p pVar, Nh.e eVar) {
        this.f2713a = 6;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f2714b = pVar;
        this.c = eVar;
    }

    public T(C0305j c0305j) {
        this.f2713a = 0;
        this.f2714b = c0305j;
        this.c = new Eh.a();
    }

    public T(J j, Nh.e eVar) {
        this.f2713a = 1;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2714b = j;
        this.c = eVar;
    }
}
