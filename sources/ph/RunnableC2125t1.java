package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import lh.AbstractC1831b;

/* JADX INFO: renamed from: ph.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2125t1 extends AbstractC1831b implements ch.r, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.u f19641b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19642d;
    public InterfaceC1779f e;
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f19643g;
    public volatile boolean h;
    public volatile boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19644k;

    public RunnableC2125t1(ch.r rVar, ch.u uVar, boolean z4, int i) {
        this.f19640a = rVar;
        this.f19641b = uVar;
        this.c = z4;
        this.f19642d = i;
    }

    public final boolean a(boolean z4, boolean z5, ch.r rVar) {
        if (this.i) {
            this.e.clear();
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = this.f19643g;
        if (this.c) {
            if (!z5) {
                return false;
            }
            this.i = true;
            if (th2 != null) {
                rVar.onError(th2);
            } else {
                rVar.onComplete();
            }
            this.f19641b.dispose();
            return true;
        }
        if (th2 != null) {
            this.i = true;
            this.e.clear();
            rVar.onError(th2);
            this.f19641b.dispose();
            return true;
        }
        if (!z5) {
            return false;
        }
        this.i = true;
        rVar.onComplete();
        this.f19641b.dispose();
        return true;
    }

    @Override // kh.InterfaceC1776c
    public final int b(int i) {
        this.f19644k = true;
        return 2;
    }

    @Override // kh.InterfaceC1779f
    public final void clear() {
        this.e.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.dispose();
        this.f19641b.dispose();
        if (this.f19644k || getAndIncrement() != 0) {
            return;
        }
        this.e.clear();
    }

    @Override // kh.InterfaceC1779f
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.h) {
            return;
        }
        this.h = true;
        if (getAndIncrement() == 0) {
            this.f19641b.c(this);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.h) {
            S1.s.r(th2);
            return;
        }
        this.f19643g = th2;
        this.h = true;
        if (getAndIncrement() == 0) {
            this.f19641b.c(this);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j != 2) {
            this.e.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f19641b.c(this);
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(7);
                if (iB == 1) {
                    this.j = iB;
                    this.e = interfaceC1775b;
                    this.h = true;
                    this.f19640a.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.f19641b.c(this);
                        return;
                    }
                    return;
                }
                if (iB == 2) {
                    this.j = iB;
                    this.e = interfaceC1775b;
                    this.f19640a.onSubscribe(this);
                    return;
                }
            }
            this.e = new rh.c(this.f19642d);
            this.f19640a.onSubscribe(this);
        }
    }

    @Override // kh.InterfaceC1779f
    public final Object poll() {
        return this.e.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r3 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
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
            boolean r0 = r7.f19644k
            r1 = 1
            if (r0 == 0) goto L4e
            r0 = r1
        L6:
            boolean r2 = r7.i
            if (r2 == 0) goto Lc
            goto L96
        Lc:
            boolean r2 = r7.h
            java.lang.Throwable r3 = r7.f19643g
            boolean r4 = r7.c
            if (r4 != 0) goto L27
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            r7.i = r1
            ch.r r0 = r7.f19640a
            java.lang.Throwable r1 = r7.f19643g
            r0.onError(r1)
            ch.u r0 = r7.f19641b
            r0.dispose()
            return
        L27:
            ch.r r3 = r7.f19640a
            r4 = 0
            r3.onNext(r4)
            if (r2 == 0) goto L46
            r7.i = r1
            java.lang.Throwable r0 = r7.f19643g
            if (r0 == 0) goto L3b
            ch.r r1 = r7.f19640a
            r1.onError(r0)
            goto L40
        L3b:
            ch.r r0 = r7.f19640a
            r0.onComplete()
        L40:
            ch.u r0 = r7.f19641b
            r0.dispose()
            return
        L46:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L96
        L4e:
            kh.f r0 = r7.e
            ch.r r2 = r7.f19640a
            r3 = r1
        L53:
            boolean r4 = r7.h
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.a(r4, r5, r2)
            if (r4 == 0) goto L60
            goto L96
        L60:
            boolean r4 = r7.h
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L6a
            r6 = r1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            boolean r4 = r7.a(r4, r6, r2)
            if (r4 == 0) goto L72
            goto L96
        L72:
            if (r6 == 0) goto L7c
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L53
            goto L96
        L7c:
            r2.onNext(r5)
            goto L60
        L80:
            r3 = move-exception
            of.p.F(r3)
            r7.i = r1
            fh.b r1 = r7.f
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            ch.u r0 = r7.f19641b
            r0.dispose()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.RunnableC2125t1.run():void");
    }
}
