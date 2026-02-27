package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Ah.j, io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2699b;
    public io.reactivex.rxjava3.disposables.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2700d = 1;

    public L(Ah.j jVar) {
        this.f2698a = jVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.c, bVar)) {
            this.c = bVar;
            long j = this.f2700d;
            Ah.j jVar = this.f2698a;
            if (j != 0) {
                jVar.a(this);
                return;
            }
            this.f2699b = true;
            bVar.dispose();
            jVar.a(Dh.b.f1156a);
            jVar.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.c.dispose();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f2699b) {
            return;
        }
        this.f2699b = true;
        this.c.dispose();
        this.f2698a.onComplete();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f2699b) {
            E1.c.k(th2);
            return;
        }
        this.f2699b = true;
        this.c.dispose();
        this.f2698a.onError(th2);
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f2699b) {
            return;
        }
        long j = this.f2700d;
        long j6 = j - 1;
        this.f2700d = j6;
        if (j > 0) {
            boolean z4 = j6 == 0;
            this.f2698a.onNext(obj);
            if (z4) {
                onComplete();
            }
        }
    }
}
