package Kh;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Kh.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0303h implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rh.a f2730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2731b;
    public final Ah.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f2732d;
    public RunnableC0302g e;
    public volatile long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2733g;

    public C0303h(Rh.a aVar, long j, Ah.n nVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2730a = aVar;
        this.f2731b = j;
        this.c = nVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.f2732d, bVar)) {
            this.f2732d = bVar;
            this.f2730a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f2732d.dispose();
        this.c.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f2733g) {
            return;
        }
        this.f2733g = true;
        RunnableC0302g runnableC0302g = this.e;
        if (runnableC0302g != null) {
            Dh.a.a(runnableC0302g);
        }
        if (runnableC0302g != null) {
            runnableC0302g.run();
        }
        this.f2730a.onComplete();
        this.c.dispose();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f2733g) {
            E1.c.k(th2);
            return;
        }
        RunnableC0302g runnableC0302g = this.e;
        if (runnableC0302g != null) {
            Dh.a.a(runnableC0302g);
        }
        this.f2733g = true;
        this.f2730a.onError(th2);
        this.c.dispose();
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f2733g) {
            return;
        }
        long j = this.f + 1;
        this.f = j;
        RunnableC0302g runnableC0302g = this.e;
        if (runnableC0302g != null) {
            Dh.a.a(runnableC0302g);
        }
        RunnableC0302g runnableC0302g2 = new RunnableC0302g(obj, j, this);
        this.e = runnableC0302g2;
        Dh.a.c(runnableC0302g2, this.c.c(runnableC0302g2, this.f2731b, TimeUnit.MILLISECONDS));
    }
}
