package Ih;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends t {
    public final Fh.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f2332n;

    public u(Fh.a aVar, Ah.n nVar, int i) {
        super(nVar, i);
        this.m = aVar;
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (Ph.d.d(this.e, cVar)) {
            this.e = cVar;
            if (cVar instanceof Fh.d) {
                Fh.d dVar = (Fh.d) cVar;
                int iB = dVar.b(7);
                if (iB == 1) {
                    this.j = 1;
                    this.f = dVar;
                    this.h = true;
                    this.m.c(this);
                    return;
                }
                if (iB == 2) {
                    this.j = 2;
                    this.f = dVar;
                    this.m.c(this);
                    cVar.request(this.f2327b);
                    return;
                }
            }
            this.f = new Mh.a(this.f2327b);
            this.m.c(this);
            cVar.request(this.f2327b);
        }
    }

    @Override // Ih.t
    public final void f() {
        Fh.a aVar = this.m;
        Fh.g gVar = this.f;
        long j = this.f2330k;
        long j6 = this.f2332n;
        int iAddAndGet = 1;
        do {
            long j7 = this.f2328d.get();
            while (j != j7) {
                boolean z4 = this.h;
                try {
                    Object objPoll = gVar.poll();
                    boolean z5 = objPoll == null;
                    if (e(z4, z5, aVar)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    if (aVar.d(objPoll)) {
                        j++;
                    }
                    j6++;
                    if (j6 == this.c) {
                        this.e.request(j6);
                        j6 = 0;
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.f2329g = true;
                    this.e.cancel();
                    gVar.clear();
                    aVar.onError(th2);
                    this.f2326a.dispose();
                    return;
                }
            }
            if (j == j7 && e(this.h, gVar.isEmpty(), aVar)) {
                return;
            }
            this.f2330k = j;
            this.f2332n = j6;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // Ih.t
    public final void g() {
        int iAddAndGet = 1;
        while (!this.f2329g) {
            boolean z4 = this.h;
            this.m.onNext(null);
            if (z4) {
                this.f2329g = true;
                Throwable th2 = this.i;
                if (th2 != null) {
                    this.m.onError(th2);
                } else {
                    this.m.onComplete();
                }
                this.f2326a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // Ih.t
    public final void h() {
        Fh.a aVar = this.m;
        Fh.g gVar = this.f;
        long j = this.f2330k;
        int iAddAndGet = 1;
        do {
            long j6 = this.f2328d.get();
            while (j != j6) {
                try {
                    Object objPoll = gVar.poll();
                    if (this.f2329g) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f2329g = true;
                        aVar.onComplete();
                        this.f2326a.dispose();
                        return;
                    } else if (aVar.d(objPoll)) {
                        j++;
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.f2329g = true;
                    this.e.cancel();
                    aVar.onError(th2);
                    this.f2326a.dispose();
                    return;
                }
            }
            if (this.f2329g) {
                return;
            }
            if (gVar.isEmpty()) {
                this.f2329g = true;
                aVar.onComplete();
                this.f2326a.dispose();
                return;
            }
            this.f2330k = j;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // Fh.g
    public final Object poll() {
        Object objPoll = this.f.poll();
        if (objPoll != null && this.j != 1) {
            long j = this.f2332n + 1;
            if (j == this.c) {
                this.f2332n = 0L;
                this.e.request(j);
                return objPoll;
            }
            this.f2332n = j;
        }
        return objPoll;
    }
}
