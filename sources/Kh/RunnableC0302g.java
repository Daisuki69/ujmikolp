package Kh;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Kh.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0302g extends AtomicReference implements Runnable, io.reactivex.rxjava3.disposables.b, Ah.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2728b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2729d;
    public final Serializable e;

    public RunnableC0302g(Ah.q qVar) {
        this.f2727a = 1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = qVar;
        this.f2728b = 120L;
        this.e = timeUnit;
        this.f2729d = new AtomicReference();
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.a.d(this, bVar);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2727a) {
            case 0:
                Dh.a.a(this);
                break;
            default:
                Dh.a.a(this);
                Dh.a.a((AtomicReference) this.f2729d);
                break;
        }
    }

    @Override // Ah.q, Ah.b
    public void onError(Throwable th2) {
        io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) get();
        Dh.a aVar = Dh.a.f1154a;
        if (bVar == aVar || !compareAndSet(bVar, aVar)) {
            E1.c.k(th2);
        } else {
            Dh.a.a((AtomicReference) this.f2729d);
            ((Ah.q) this.c).onError(th2);
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) get();
        Dh.a aVar = Dh.a.f1154a;
        if (bVar == aVar || !compareAndSet(bVar, aVar)) {
            return;
        }
        Dh.a.a((AtomicReference) this.f2729d);
        ((Ah.q) this.c).onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2727a) {
            case 0:
                if (((AtomicBoolean) this.e).compareAndSet(false, true)) {
                    C0303h c0303h = (C0303h) this.f2729d;
                    long j = this.f2728b;
                    Object obj = this.c;
                    if (j == c0303h.f) {
                        c0303h.f2730a.onNext(obj);
                        Dh.a.a(this);
                    }
                }
                break;
            default:
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) get();
                Dh.a aVar = Dh.a.f1154a;
                if (bVar != aVar && compareAndSet(bVar, aVar)) {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    ((Ah.q) this.c).onError(new TimeoutException(Qh.e.d(this.f2728b, (TimeUnit) this.e)));
                    break;
                }
                break;
        }
    }

    public RunnableC0302g(Object obj, long j, C0303h c0303h) {
        this.f2727a = 0;
        this.e = new AtomicBoolean();
        this.c = obj;
        this.f2728b = j;
        this.f2729d = c0303h;
    }
}
