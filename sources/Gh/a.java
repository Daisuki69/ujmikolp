package Gh;

import Ah.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements j, Fh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f1982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f1983b;
    public Fh.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1984d;

    public a(j jVar) {
        this.f1982a = jVar;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.f1983b, bVar)) {
            this.f1983b = bVar;
            if (bVar instanceof Fh.b) {
                this.c = (Fh.b) bVar;
            }
            this.f1982a.a(this);
        }
    }

    public final int c(int i) {
        return 0;
    }

    @Override // Fh.g
    public final void clear() {
        this.c.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        this.f1983b.dispose();
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f1984d) {
            return;
        }
        this.f1984d = true;
        this.f1982a.onComplete();
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f1984d) {
            E1.c.k(th2);
        } else {
            this.f1984d = true;
            this.f1982a.onError(th2);
        }
    }
}
