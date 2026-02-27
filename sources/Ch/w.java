package ch;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w implements y {
    public final Object b() {
        Gh.c cVar = new Gh.c(1, 1);
        c(cVar);
        return cVar.b();
    }

    public final void c(x xVar) {
        jh.e.b(xVar, numX49.tnTj78("bt8uC"));
        try {
            d(xVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            of.p.F(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt8u4"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void d(x xVar);
}
