package Ah;

import Kh.B;
import Kh.C0304i;
import Kh.C0305j;
import Kh.Q;
import Kh.y;
import bg.AbstractC0983W;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static y d(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new y(obj);
    }

    public final C0304i b(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Nh.e eVar = Th.e.f5841b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar, "scheduler is null");
        return new C0304i(this, j, eVar);
    }

    public final C0305j c(Ch.g gVar) {
        Objects.requireNonNull(gVar, "predicate is null");
        return new C0305j(this, gVar, 2);
    }

    public final B e(o oVar) {
        int i = d.f312a;
        Eh.d.a(i, "bufferSize");
        return new B(this, oVar, i);
    }

    public final io.reactivex.rxjava3.disposables.b f() {
        Gh.f fVar = new Gh.f(Eh.d.c, Eh.d.f1366d);
        g(fVar);
        return fVar;
    }

    public final void g(j jVar) {
        Objects.requireNonNull(jVar, "observer is null");
        try {
            h(jVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void h(j jVar);

    public final Q i(long j, TimeUnit timeUnit) {
        Nh.e eVar = Th.e.f5841b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar, "scheduler is null");
        return new Q(this, j, timeUnit, eVar);
    }
}
