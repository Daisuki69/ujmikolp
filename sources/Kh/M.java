package Kh;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends AtomicReference implements Ah.j, io.reactivex.rxjava3.disposables.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rh.a f2701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2702b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ah.n f2703d;
    public io.reactivex.rxjava3.disposables.b e;
    public volatile boolean f;

    public M(Rh.a aVar, Ah.n nVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2701a = aVar;
        this.f2702b = 5000L;
        this.c = timeUnit;
        this.f2703d = nVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.e, bVar)) {
            this.e = bVar;
            this.f2701a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.e.dispose();
        this.f2703d.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        this.f2701a.onComplete();
        this.f2703d.dispose();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        this.f2701a.onError(th2);
        this.f2703d.dispose();
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f2701a.onNext(obj);
        io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) get();
        if (bVar != null) {
            bVar.dispose();
        }
        Dh.a.c(this, this.f2703d.c(this, this.f2702b, this.c));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
    }
}
