package Ah;

import bg.AbstractC0983W;
import java.util.Objects;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public final Hh.g a(Ch.a aVar) {
        C1916a c1916a = Eh.d.c;
        return new Hh.g(this, c1916a, c1916a, aVar);
    }

    public final Hh.g b(Ch.c cVar) {
        return new Hh.g(this, Eh.d.c, cVar, Eh.d.f1365b);
    }

    public final Dh.d c() {
        Dh.d dVar = new Dh.d(1);
        d(dVar);
        return dVar;
    }

    public final void d(b bVar) {
        try {
            e(bVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void e(b bVar);

    public final Hh.f f(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new Hh.f(this, oVar, 1);
    }
}
