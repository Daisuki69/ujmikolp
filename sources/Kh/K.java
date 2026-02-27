package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2697b = 1;
    public io.reactivex.rxjava3.disposables.b c;

    public K(Ah.j jVar) {
        this.f2696a = jVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.c, bVar)) {
            this.c = bVar;
            this.f2696a.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.c.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        this.f2696a.onComplete();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        this.f2696a.onError(th2);
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        long j = this.f2697b;
        if (j != 0) {
            this.f2697b = j - 1;
        } else {
            this.f2696a.onNext(obj);
        }
    }
}
