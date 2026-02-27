package ch;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ch.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1109h implements j {
    public final void b(i iVar) {
        jh.e.b(iVar, numX49.tnTj78("bt82"));
        try {
            c(iVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            of.p.F(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt8L"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void c(i iVar);
}
