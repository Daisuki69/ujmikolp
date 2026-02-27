package Gh;

import Ah.j;
import Ah.p;
import Ah.q;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements Ah.b, io.reactivex.rxjava3.disposables.b, Ch.c, q, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1989b;
    public final Object c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f1988a = i;
        this.f1989b = obj;
        this.c = obj2;
    }

    @Override // Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f1988a) {
            case 0:
                Dh.a.d(this, bVar);
                break;
            case 1:
                Dh.a.d(this, bVar);
                break;
            case 2:
                if (Dh.a.d(this, bVar)) {
                    ((Ah.b) this.f1989b).a(this);
                }
                break;
            case 3:
                Dh.a.d((AtomicReference) this.c, bVar);
                break;
            default:
                if (Dh.a.d(this, bVar)) {
                    ((q) this.f1989b).a(this);
                }
                break;
        }
    }

    @Override // Ch.c
    public void accept(Object obj) {
        E1.c.k(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f1988a) {
            case 0:
                Dh.a.a(this);
                break;
            case 1:
                Dh.a.a(this);
                break;
            case 2:
                Dh.a.a(this);
                break;
            case 3:
                Dh.a.a((AtomicReference) this.c);
                Dh.a.a(this);
                break;
            default:
                Dh.a.a(this);
                break;
        }
    }

    @Override // Ah.b
    public void onComplete() {
        switch (this.f1988a) {
            case 0:
                try {
                    ((Ch.a) this.c).run();
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    E1.c.k(th2);
                }
                lazySet(Dh.a.f1154a);
                break;
            case 1:
            default:
                ((p) this.c).f(new A7.f(16, this, (q) this.f1989b));
                break;
            case 2:
                ((Ah.a) this.c).d(new A7.f(17, this, (Ah.b) this.f1989b));
                break;
            case 3:
                ((j) this.f1989b).onComplete();
                break;
        }
    }

    @Override // Ah.b
    public final void onError(Throwable th2) {
        Dh.a aVar = Dh.a.f1154a;
        Object obj = this.f1989b;
        switch (this.f1988a) {
            case 0:
                try {
                    ((Ch.c) obj).accept(th2);
                } catch (Throwable th3) {
                    AbstractC0983W.G(th3);
                    E1.c.k(th3);
                }
                lazySet(aVar);
                break;
            case 1:
                lazySet(aVar);
                try {
                    ((Ch.c) this.c).accept(th2);
                } catch (Throwable th4) {
                    AbstractC0983W.G(th4);
                    E1.c.k(new CompositeException(th2, th4));
                    return;
                }
                break;
            case 2:
                ((Ah.b) obj).onError(th2);
                break;
            case 3:
                ((j) obj).onError(th2);
                break;
            default:
                ((q) obj).onError(th2);
                break;
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        ((j) this.f1989b).onNext(obj);
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        lazySet(Dh.a.f1154a);
        try {
            ((Ch.c) this.f1989b).accept(obj);
        } catch (Throwable th2) {
            AbstractC0983W.G(th2);
            E1.c.k(th2);
        }
    }

    public d(j jVar) {
        this.f1988a = 3;
        this.f1989b = jVar;
        this.c = new AtomicReference();
    }
}
