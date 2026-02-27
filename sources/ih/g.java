package Ih;

import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends Oh.a {
    public final Ch.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ch.c f2306g;
    public final Ch.a h;
    public final mg.c i;

    public g(Fh.a aVar, Ch.c cVar, Ch.c cVar2, Ch.a aVar2, mg.c cVar3) {
        super(aVar);
        this.f = cVar;
        this.f2306g = cVar2;
        this.h = aVar2;
        this.i = cVar3;
    }

    @Override // Fh.a
    public final boolean d(Object obj) {
        if (this.f4803d) {
            return false;
        }
        try {
            this.f.accept(obj);
            return this.f4801a.d(obj);
        } catch (Throwable th2) {
            a(th2);
            return false;
        }
    }

    @Override // Oh.a, nk.b
    public final void onComplete() {
        if (this.f4803d) {
            return;
        }
        try {
            this.h.run();
            this.f4803d = true;
            this.f4801a.onComplete();
            try {
                this.i.getClass();
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                E1.c.k(th2);
            }
        } catch (Throwable th3) {
            a(th3);
        }
    }

    @Override // Oh.a, nk.b
    public final void onError(Throwable th2) {
        Fh.a aVar = this.f4801a;
        if (this.f4803d) {
            E1.c.k(th2);
            return;
        }
        this.f4803d = true;
        try {
            this.f2306g.accept(th2);
            aVar.onError(th2);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            aVar.onError(new CompositeException(th2, th3));
        }
        try {
            this.i.getClass();
        } catch (Throwable th4) {
            AbstractC0983W.G(th4);
            E1.c.k(th4);
        }
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        if (this.f4803d) {
            return;
        }
        int i = this.e;
        Fh.a aVar = this.f4801a;
        if (i != 0) {
            aVar.onNext(null);
            return;
        }
        try {
            this.f.accept(obj);
            aVar.onNext(obj);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // Fh.g
    public final Object poll() throws Exception {
        Ch.c cVar = this.f2306g;
        try {
            Object objPoll = this.c.poll();
            mg.c cVar2 = this.i;
            if (objPoll == null) {
                if (this.e == 1) {
                    this.h.run();
                    cVar2.getClass();
                }
                return objPoll;
            }
            try {
                this.f.accept(objPoll);
                cVar2.getClass();
                return objPoll;
            } catch (Throwable th2) {
                try {
                    AbstractC0983W.G(th2);
                    try {
                        cVar.accept(th2);
                        Qh.d dVar = Qh.e.f5385a;
                        if (th2 instanceof Exception) {
                            throw th2;
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        throw new CompositeException(th2, th3);
                    }
                } catch (Throwable th4) {
                    cVar2.getClass();
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            AbstractC0983W.G(th5);
            try {
                cVar.accept(th5);
                Qh.d dVar2 = Qh.e.f5385a;
                if (th5 instanceof Exception) {
                    throw th5;
                }
                throw th5;
            } catch (Throwable th6) {
                AbstractC0983W.G(th6);
                throw new CompositeException(th5, th6);
            }
        }
    }
}
