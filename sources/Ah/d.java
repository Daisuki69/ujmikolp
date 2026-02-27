package Ah;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d<T> implements nk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f312a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    @Override // nk.a
    public final void a(nk.b bVar) {
        if (bVar instanceof e) {
            d((e) bVar);
        } else {
            d(new Oh.d(bVar));
        }
    }

    public final Ih.n b(Ch.f fVar) {
        int i = f312a;
        Eh.d.a(i, "bufferSize");
        return new Ih.n(this, fVar, i, 0);
    }

    public final io.reactivex.rxjava3.disposables.b c() {
        Oh.c cVar = new Oh.c();
        d(cVar);
        return cVar;
    }

    public final void d(e eVar) {
        try {
            e(eVar);
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

    public abstract void e(nk.b bVar);
}
