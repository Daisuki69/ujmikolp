package Ih;

import bg.AbstractC0983W;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends t {
    public final Ah.e m;

    public v(Ah.e eVar, Ah.n nVar, int i) {
        super(nVar, i);
        this.m = eVar;
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
        Ah.e eVar = this.m;
        Fh.g gVar = this.f;
        long j = this.f2330k;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f2328d.get();
            while (j != jAddAndGet) {
                boolean z4 = this.h;
                try {
                    Object objPoll = gVar.poll();
                    boolean z5 = objPoll == null;
                    if (e(z4, z5, eVar)) {
                        return;
                    }
                    if (z5) {
                        break;
                    }
                    eVar.onNext(objPoll);
                    j++;
                    if (j == this.c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f2328d.addAndGet(-j);
                        }
                        this.e.request(j);
                        j = 0;
                    }
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.f2329g = true;
                    this.e.cancel();
                    gVar.clear();
                    eVar.onError(th2);
                    this.f2326a.dispose();
                    return;
                }
            }
            if (j == jAddAndGet && e(this.h, gVar.isEmpty(), eVar)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.f2330k = j;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
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
        Ah.e eVar = this.m;
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
                        eVar.onComplete();
                        this.f2326a.dispose();
                        return;
                    }
                    eVar.onNext(objPoll);
                    j++;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    this.f2329g = true;
                    this.e.cancel();
                    eVar.onError(th2);
                    this.f2326a.dispose();
                    return;
                }
            }
            if (this.f2329g) {
                return;
            }
            if (gVar.isEmpty()) {
                this.f2329g = true;
                eVar.onComplete();
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
            long j = this.f2330k + 1;
            if (j == this.c) {
                this.f2330k = 0L;
                this.e.request(j);
                return objPoll;
            }
            this.f2330k = j;
        }
        return objPoll;
    }
}
