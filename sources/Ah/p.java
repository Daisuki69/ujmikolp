package Ah;

import Ih.D;
import Kh.J;
import Kh.S;
import Kh.T;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import w.C2360b;
import w.C2361c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p<T> {
    public static J b(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new J(new Eh.c(th2), 2);
    }

    public static J c(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new J(obj, 4);
    }

    public static p j(p pVar, p pVar2, p pVar3, p pVar4, Ch.e eVar) {
        return m(new J5.a(eVar, 24), pVar, pVar2, pVar3, pVar4);
    }

    public static p k(p pVar, p pVar2, p pVar3, Ch.d dVar) {
        return m(new C2361c(dVar, 20), pVar, pVar2, pVar3);
    }

    public static p l(p pVar, p pVar2, Ch.b bVar) {
        Objects.requireNonNull(pVar, "source1 is null");
        Objects.requireNonNull(pVar2, "source2 is null");
        return m(new C2360b(bVar, 20), pVar, pVar2);
    }

    public static p m(Ch.f fVar, p... pVarArr) {
        return pVarArr.length == 0 ? b(new NoSuchElementException()) : new T(7, pVarArr, fVar);
    }

    public final T a(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Nh.e eVar = Th.e.f5841b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(eVar, "scheduler is null");
        return new T(3, this, new S(Math.max(j, 0L), eVar));
    }

    public final Lh.f d(Ch.f fVar) {
        Objects.requireNonNull(fVar, "mapper is null");
        return new Lh.f(this, fVar, 1);
    }

    public final Gh.d e() {
        Gh.d dVar = new Gh.d(1, Eh.d.c, Eh.d.f1366d);
        f(dVar);
        return dVar;
    }

    public final void f(q qVar) {
        Objects.requireNonNull(qVar, "observer is null");
        try {
            g(qVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
        }
    }

    public abstract void g(q qVar);

    public final Lh.h h(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new Lh.h(this, oVar, 1);
    }

    public final d i() {
        return this instanceof D ? new Ih.l(((D) this).f2299a) : new Ih.q(this, 1);
    }
}
