package ch;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ch.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1103b implements InterfaceC1105d {
    public final void b(InterfaceC1104c interfaceC1104c) {
        jh.e.b(interfaceC1104c, numX49.tnTj78("bt8um"));
        try {
            c(interfaceC1104c);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            of.p.F(th2);
            S1.s.r(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt8uD"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void c(InterfaceC1104c interfaceC1104c);
}
