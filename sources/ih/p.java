package Ih;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Ah.j, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.e f2321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f2322b;

    public p(Ah.e eVar) {
        this.f2321a = eVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        this.f2322b = bVar;
        this.f2321a.c(this);
    }

    @Override // nk.c
    public final void cancel() {
        this.f2322b.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        this.f2321a.onComplete();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        this.f2321a.onError(th2);
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        this.f2321a.onNext(obj);
    }

    @Override // nk.c
    public final void request(long j) {
    }
}
