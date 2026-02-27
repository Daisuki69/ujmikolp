package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends Gh.b implements Ah.j, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ah.n f2674b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Fh.g f2675d;
    public io.reactivex.rxjava3.disposables.b e;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f2676g;
    public volatile boolean h;
    public int i;
    public boolean j;

    public A(Ah.j jVar, Ah.n nVar, int i) {
        this.f2673a = jVar;
        this.f2674b = nVar;
        this.c = i;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        if (Dh.a.e(this.e, bVar)) {
            this.e = bVar;
            if (bVar instanceof Fh.b) {
                Fh.b bVar2 = (Fh.b) bVar;
                int iB = bVar2.b(7);
                if (iB == 1) {
                    this.i = iB;
                    this.f2675d = bVar2;
                    this.f2676g = true;
                    this.f2673a.a(this);
                    if (getAndIncrement() == 0) {
                        this.f2674b.b(this);
                        return;
                    }
                    return;
                }
                if (iB == 2) {
                    this.i = iB;
                    this.f2675d = bVar2;
                    this.f2673a.a(this);
                    return;
                }
            }
            this.f2675d = new Mh.b(this.c);
            this.f2673a.a(this);
        }
    }

    @Override // Fh.c
    public final int b(int i) {
        this.j = true;
        return 2;
    }

    public final boolean c(boolean z4, boolean z5, Ah.j jVar) {
        if (this.h) {
            this.f2675d.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = this.f;
        if (th2 != null) {
            this.h = true;
            this.f2675d.clear();
            jVar.onError(th2);
            this.f2674b.dispose();
            return true;
        }
        if (!z5) {
            return false;
        }
        this.h = true;
        jVar.onComplete();
        this.f2674b.dispose();
        return true;
    }

    @Override // Fh.g
    public final void clear() {
        this.f2675d.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.dispose();
        this.f2674b.dispose();
        if (this.j || getAndIncrement() != 0) {
            return;
        }
        this.f2675d.clear();
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.f2675d.isEmpty();
    }

    @Override // Ah.j
    public final void onComplete() {
        if (this.f2676g) {
            return;
        }
        this.f2676g = true;
        if (getAndIncrement() == 0) {
            this.f2674b.b(this);
        }
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        if (this.f2676g) {
            E1.c.k(th2);
            return;
        }
        this.f = th2;
        this.f2676g = true;
        if (getAndIncrement() == 0) {
            this.f2674b.b(this);
        }
    }

    @Override // Ah.j
    public final void onNext(Object obj) {
        if (this.f2676g) {
            return;
        }
        if (this.i != 2) {
            this.f2675d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f2674b.b(this);
        }
    }

    @Override // Fh.g
    public final Object poll() {
        return this.f2675d.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r3 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.j
            r1 = 1
            if (r0 == 0) goto L4a
            r0 = r1
        L6:
            boolean r2 = r7.h
            if (r2 == 0) goto Lc
            goto L92
        Lc:
            boolean r2 = r7.f2676g
            java.lang.Throwable r3 = r7.f
            if (r2 == 0) goto L23
            if (r3 == 0) goto L23
            r7.h = r1
            Ah.j r0 = r7.f2673a
            java.lang.Throwable r1 = r7.f
            r0.onError(r1)
            Ah.n r0 = r7.f2674b
            r0.dispose()
            return
        L23:
            Ah.j r3 = r7.f2673a
            r4 = 0
            r3.onNext(r4)
            if (r2 == 0) goto L42
            r7.h = r1
            java.lang.Throwable r0 = r7.f
            if (r0 == 0) goto L37
            Ah.j r1 = r7.f2673a
            r1.onError(r0)
            goto L3c
        L37:
            Ah.j r0 = r7.f2673a
            r0.onComplete()
        L3c:
            Ah.n r0 = r7.f2674b
            r0.dispose()
            return
        L42:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L92
        L4a:
            Fh.g r0 = r7.f2675d
            Ah.j r2 = r7.f2673a
            r3 = r1
        L4f:
            boolean r4 = r7.f2676g
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.c(r4, r5, r2)
            if (r4 == 0) goto L5c
            goto L92
        L5c:
            boolean r4 = r7.f2676g
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto L66
            r6 = r1
            goto L67
        L66:
            r6 = 0
        L67:
            boolean r4 = r7.c(r4, r6, r2)
            if (r4 == 0) goto L6e
            goto L92
        L6e:
            if (r6 == 0) goto L78
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L4f
            goto L92
        L78:
            r2.onNext(r5)
            goto L5c
        L7c:
            r3 = move-exception
            bg.AbstractC0983W.G(r3)
            r7.h = r1
            io.reactivex.rxjava3.disposables.b r1 = r7.e
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            Ah.n r0 = r7.f2674b
            r0.dispose()
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.A.run():void");
    }
}
