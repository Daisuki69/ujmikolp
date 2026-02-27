package Gh;

import Ah.j;
import Ah.n;
import Ah.q;
import C.h;
import Hh.g;
import S1.v;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements j, io.reactivex.rxjava3.disposables.b, Ah.b, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f1991b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1992d;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f1990a = i;
        this.c = obj;
        this.f1992d = obj2;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f1990a) {
            case 0:
                j jVar = (j) this.c;
                try {
                    ((Ch.c) this.f1992d).accept(bVar);
                    if (Dh.a.e(this.f1991b, bVar)) {
                        this.f1991b = bVar;
                        jVar.a(this);
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    bVar.dispose();
                    this.f1991b = Dh.a.f1154a;
                    jVar.a(Dh.b.f1156a);
                    jVar.onError(th2);
                    return;
                }
                break;
            case 1:
                Ah.b bVar2 = (Ah.b) this.c;
                try {
                    ((g) this.f1992d).f2188b.accept(bVar);
                    if (Dh.a.e(this.f1991b, bVar)) {
                        this.f1991b = bVar;
                        bVar2.a(this);
                    }
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    bVar.dispose();
                    this.f1991b = Dh.a.f1154a;
                    bVar2.a(Dh.b.f1156a);
                    bVar2.onError(th3);
                    return;
                }
                break;
            case 2:
                if (Dh.a.e(this.f1991b, bVar)) {
                    this.f1991b = bVar;
                    ((j) this.c).a(this);
                }
                break;
            case 3:
                if (Dh.a.e(this.f1991b, bVar)) {
                    this.f1991b = bVar;
                    ((q) this.c).a(this);
                }
                break;
            default:
                if (Dh.a.e(this.f1991b, bVar)) {
                    this.f1991b = bVar;
                    ((q) this.c).a(this);
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f1990a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = this.f1991b;
                Dh.a aVar = Dh.a.f1154a;
                if (bVar != aVar) {
                    this.f1991b = aVar;
                    bVar.dispose();
                }
                break;
            case 1:
                try {
                    ((g) this.f1992d).getClass();
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    E1.c.k(th2);
                }
                this.f1991b.dispose();
                break;
            case 2:
                this.f1991b.dispose();
                ((n) this.f1992d).dispose();
                break;
            case 3:
                this.f1991b.dispose();
                break;
            default:
                this.f1991b.dispose();
                break;
        }
    }

    @Override // Ah.j
    public void onComplete() {
        switch (this.f1990a) {
            case 0:
                io.reactivex.rxjava3.disposables.b bVar = this.f1991b;
                Dh.a aVar = Dh.a.f1154a;
                if (bVar != aVar) {
                    this.f1991b = aVar;
                    ((j) this.c).onComplete();
                }
                break;
            case 1:
                Ah.b bVar2 = (Ah.b) this.c;
                g gVar = (g) this.f1992d;
                if (this.f1991b != Dh.a.f1154a) {
                    try {
                        gVar.f2189d.run();
                        bVar2.onComplete();
                        try {
                            gVar.getClass();
                        } catch (Throwable th2) {
                            AbstractC0983W.G(th2);
                            E1.c.k(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        bVar2.onError(th3);
                        return;
                    }
                    break;
                }
                break;
            case 2:
                ((n) this.f1992d).c(new h(this, 3), 120L, TimeUnit.SECONDS);
                break;
            default:
                Collection collection = (Collection) this.f1992d;
                this.f1992d = null;
                ((q) this.c).onSuccess(collection);
                break;
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        Dh.a aVar = Dh.a.f1154a;
        boolean z4 = false;
        Object obj = this.c;
        switch (this.f1990a) {
            case 0:
                if (this.f1991b == aVar) {
                    E1.c.k(th2);
                } else {
                    this.f1991b = aVar;
                    ((j) obj).onError(th2);
                }
                break;
            case 1:
                g gVar = (g) this.f1992d;
                if (this.f1991b == aVar) {
                    E1.c.k(th2);
                } else {
                    try {
                        gVar.c.accept(th2);
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        th2 = new CompositeException(th2, th3);
                    }
                    ((Ah.b) obj).onError(th2);
                    try {
                        gVar.getClass();
                    } catch (Throwable th4) {
                        AbstractC0983W.G(th4);
                        E1.c.k(th4);
                        return;
                    }
                }
                break;
            case 2:
                ((n) this.f1992d).c(new v(6, this, th2, z4), 0L, TimeUnit.SECONDS);
                break;
            case 3:
                this.f1992d = null;
                ((q) obj).onError(th2);
                break;
            default:
                ((q) obj).onError(th2);
                try {
                    ((y9.d) this.f1992d).run();
                } catch (Throwable th5) {
                    AbstractC0983W.G(th5);
                    E1.c.k(th5);
                }
                break;
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        switch (this.f1990a) {
            case 0:
                ((j) this.c).onNext(obj);
                break;
            case 1:
            default:
                ((Collection) this.f1992d).add(obj);
                break;
            case 2:
                ((n) this.f1992d).c(new v(7, this, obj, false), 120L, TimeUnit.SECONDS);
                break;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        ((q) this.c).onSuccess(obj);
        try {
            ((y9.d) this.f1992d).run();
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
        }
    }

    public e(g gVar, Ah.b bVar) {
        this.f1990a = 1;
        this.f1992d = gVar;
        this.c = bVar;
    }

    public e(j jVar, n nVar) {
        this.f1990a = 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = jVar;
        this.f1992d = nVar;
    }
}
