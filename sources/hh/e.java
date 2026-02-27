package Hh;

import Ah.o;
import Ah.p;
import Ah.q;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicReference implements Ah.b, io.reactivex.rxjava3.disposables.b, Runnable, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2183b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2184d;

    public e(Ah.b bVar, o oVar) {
        this.f2182a = 0;
        this.f2183b = bVar;
        this.c = oVar;
    }

    @Override // Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2182a) {
            case 0:
                if (Dh.a.d(this, bVar)) {
                    ((Ah.b) this.f2183b).a(this);
                }
                break;
            case 1:
                Dh.a.d(this, bVar);
                break;
            default:
                Dh.a.d(this, bVar);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2182a) {
            case 0:
                Dh.a.a(this);
                break;
            case 1:
                Dh.a.a(this);
                Dh.d dVar = (Dh.d) this.c;
                dVar.getClass();
                Dh.a.a(dVar);
                break;
            default:
                Dh.a.a(this);
                Dh.d dVar2 = (Dh.d) this.c;
                dVar2.getClass();
                Dh.a.a(dVar2);
                break;
        }
    }

    @Override // Ah.b
    public void onComplete() {
        switch (this.f2182a) {
            case 0:
                Dh.a.c(this, ((o) this.c).b(this));
                break;
            default:
                ((Ah.b) this.f2183b).onComplete();
                break;
        }
    }

    @Override // Ah.b
    public final void onError(Throwable th2) {
        switch (this.f2182a) {
            case 0:
                this.f2184d = th2;
                Dh.a.c(this, ((o) this.c).b(this));
                break;
            case 1:
                ((Ah.b) this.f2183b).onError(th2);
                break;
            default:
                ((q) this.f2183b).onError(th2);
                break;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        ((q) this.f2183b).onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2182a) {
            case 0:
                Throwable th2 = (Throwable) this.f2184d;
                Ah.b bVar = (Ah.b) this.f2183b;
                if (th2 == null) {
                    bVar.onComplete();
                } else {
                    this.f2184d = null;
                    bVar.onError(th2);
                }
                break;
            case 1:
                ((Ah.a) this.f2184d).d(this);
                break;
            default:
                ((p) this.f2184d).f(this);
                break;
        }
    }

    public e(q qVar, p pVar) {
        this.f2182a = 2;
        this.f2183b = qVar;
        this.f2184d = pVar;
        this.c = new Dh.d(0);
    }

    public e(Ah.b bVar, Ah.a aVar) {
        this.f2182a = 1;
        this.f2183b = bVar;
        this.f2184d = aVar;
        this.c = new Dh.d(0);
    }
}
