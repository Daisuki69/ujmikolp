package Kh;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends AtomicLong implements Ah.j, io.reactivex.rxjava3.disposables.b, O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2705b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ah.n f2706d;
    public final Dh.d e = new Dh.d(0);
    public final AtomicReference f = new AtomicReference();

    public N(Ah.j jVar, long j, TimeUnit timeUnit, Ah.n nVar) {
        this.f2704a = jVar;
        this.f2705b = j;
        this.c = timeUnit;
        this.f2706d = nVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.a.d(this.f, bVar);
    }

    @Override // Kh.O
    public final void b(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            Dh.a.a(this.f);
            this.f2704a.onError(new TimeoutException(Qh.e.d(this.f2705b, this.c)));
            this.f2706d.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        Dh.a.a(this.f);
        this.f2706d.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            Dh.d dVar = this.e;
            dVar.getClass();
            Dh.a.a(dVar);
            this.f2704a.onComplete();
            this.f2706d.dispose();
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            E1.c.k(th2);
            return;
        }
        Dh.d dVar = this.e;
        dVar.getClass();
        Dh.a.a(dVar);
        this.f2704a.onError(th2);
        this.f2706d.dispose();
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j6 = 1 + j;
            if (compareAndSet(j, j6)) {
                Dh.d dVar = this.e;
                ((io.reactivex.rxjava3.disposables.b) dVar.get()).dispose();
                this.f2704a.onNext(obj);
                io.reactivex.rxjava3.disposables.b bVarC = this.f2706d.c(new P(0, j6, this), this.f2705b, this.c);
                dVar.getClass();
                Dh.a.c(dVar, bVarC);
            }
        }
    }
}
