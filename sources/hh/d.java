package Hh;

import Ah.q;
import bg.AbstractC0983W;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicInteger implements Ah.b, io.reactivex.rxjava3.disposables.b, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.a f2180b;
    public io.reactivex.rxjava3.disposables.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2181d;

    public /* synthetic */ d(Object obj, Ch.a aVar, int i) {
        this.f2179a = i;
        this.f2181d = obj;
        this.f2180b = aVar;
    }

    @Override // Ah.b
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2179a) {
            case 0:
                if (Dh.a.e(this.c, bVar)) {
                    this.c = bVar;
                    ((Ah.b) this.f2181d).a(this);
                }
                break;
            default:
                if (Dh.a.e(this.c, bVar)) {
                    this.c = bVar;
                    ((q) this.f2181d).a(this);
                }
                break;
        }
    }

    public final void b() {
        switch (this.f2179a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    try {
                        this.f2180b.run();
                    } catch (Throwable th2) {
                        AbstractC0983W.G(th2);
                        E1.c.k(th2);
                        return;
                    }
                }
                break;
            default:
                if (compareAndSet(0, 1)) {
                    try {
                        this.f2180b.run();
                    } catch (Throwable th3) {
                        AbstractC0983W.G(th3);
                        E1.c.k(th3);
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2179a) {
            case 0:
                this.c.dispose();
                b();
                break;
            default:
                this.c.dispose();
                b();
                break;
        }
    }

    @Override // Ah.b
    public void onComplete() {
        ((Ah.b) this.f2181d).onComplete();
        b();
    }

    @Override // Ah.b
    public final void onError(Throwable th2) {
        switch (this.f2179a) {
            case 0:
                ((Ah.b) this.f2181d).onError(th2);
                b();
                break;
            default:
                ((q) this.f2181d).onError(th2);
                b();
                break;
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        ((q) this.f2181d).onSuccess(obj);
        b();
    }
}
