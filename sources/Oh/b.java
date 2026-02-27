package Oh;

import Ah.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements e, Fh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f4805b;
    public Fh.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4806d;
    public int e;

    public b(e eVar) {
        this.f4804a = eVar;
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
        if (Ph.d.d(this.f4805b, cVar)) {
            this.f4805b = cVar;
            if (cVar instanceof Fh.d) {
                this.c = (Fh.d) cVar;
            }
            this.f4804a.c(this);
        }
    }

    @Override // nk.c
    public final void cancel() {
        this.f4805b.cancel();
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
        if (this.f4806d) {
            return;
        }
        this.f4806d = true;
        this.f4804a.onComplete();
    }

    @Override // nk.b
    public void onError(Throwable th2) {
        if (this.f4806d) {
            E1.c.k(th2);
        } else {
            this.f4806d = true;
            this.f4804a.onError(th2);
        }
    }

    @Override // nk.c
    public final void request(long j) {
        this.f4805b.request(j);
    }
}
