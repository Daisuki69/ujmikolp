package Oh;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Fh.a, Fh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fh.a f4801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f4802b;
    public Fh.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4803d;
    public int e;

    public a(Fh.a aVar) {
        this.f4801a = aVar;
    }

    public final void a(Throwable th2) {
        AbstractC0983W.G(th2);
        this.f4802b.cancel();
        onError(th2);
    }

    @Override // Fh.c
    public int b(int i) {
        Fh.d dVar = this.c;
        if (dVar == null || (i & 4) != 0) {
            return 0;
        }
        int iB = dVar.b(i);
        if (iB == 0) {
            return iB;
        }
        this.e = iB;
        return iB;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.d(this.f4802b, cVar)) {
            this.f4802b = cVar;
            if (cVar instanceof Fh.d) {
                this.c = (Fh.d) cVar;
            }
            this.f4801a.c(this);
        }
    }

    @Override // nk.c
    public final void cancel() {
        this.f4802b.cancel();
    }

    @Override // Fh.g
    public final void clear() {
        this.c.clear();
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nk.b
    public void onComplete() {
        if (this.f4803d) {
            return;
        }
        this.f4803d = true;
        this.f4801a.onComplete();
    }

    @Override // nk.b
    public void onError(Throwable th2) {
        if (this.f4803d) {
            E1.c.k(th2);
        } else {
            this.f4803d = true;
            this.f4801a.onError(th2);
        }
    }

    @Override // nk.c
    public final void request(long j) {
        this.f4802b.request(j);
    }
}
