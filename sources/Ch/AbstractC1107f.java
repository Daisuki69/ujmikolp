package ch;

import dOYHB6.tiZVw8.numX49;
import th.C2285a;

/* JADX INFO: renamed from: ch.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1107f implements nk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9367a = Math.max(1, Integer.getInteger(numX49.tnTj78("bt8r"), 128).intValue());

    @Override // nk.a
    public final void a(nk.b bVar) {
        if (bVar instanceof InterfaceC1108g) {
            b((InterfaceC1108g) bVar);
        } else {
            b(new C2285a(bVar));
        }
    }

    public final void b(InterfaceC1108g interfaceC1108g) {
        try {
            c(interfaceC1108g);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th2) {
            of.p.F(th2);
            S1.s.r(th2);
            NullPointerException nullPointerException = new NullPointerException(numX49.tnTj78("bt8Z"));
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void c(nk.b bVar);
}
