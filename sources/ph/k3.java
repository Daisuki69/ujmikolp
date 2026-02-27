package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends lh.l implements InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f19532q = new Object();
    public final long i;
    public final TimeUnit j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ch.v f19533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19534l;
    public InterfaceC1486b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Wh.f f19535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1487c f19536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f19537p;

    public k3(C2479c c2479c, long j, TimeUnit timeUnit, ch.v vVar, int i) {
        super(c2479c, new C2038a(9));
        this.f19536o = new C1487c();
        this.i = j;
        this.j = timeUnit;
        this.f19533k = vVar;
        this.f19534l = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r2.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r0 = r8.f19536o;
        r0.getClass();
        ih.EnumC1604b.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r8.f19535n = null;
        r0.clear();
        r0 = r8.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r2.onError(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() {
        /*
            r8 = this;
            pg.a r0 = r8.e
            xh.c r1 = r8.f18320d
            Wh.f r2 = r8.f19535n
            r3 = 1
        L7:
            boolean r4 = r8.f19537p
            boolean r5 = r8.f18321g
            java.lang.Object r6 = r0.poll()
            java.lang.Object r7 = ph.k3.f19532q
            if (r5 == 0) goto L31
            if (r6 == 0) goto L17
            if (r6 != r7) goto L31
        L17:
            r1 = 0
            r8.f19535n = r1
            r0.clear()
            java.lang.Throwable r0 = r8.h
            if (r0 == 0) goto L25
            r2.onError(r0)
            goto L28
        L25:
            r2.onComplete()
        L28:
            fh.c r0 = r8.f19536o
            r0.getClass()
            ih.EnumC1604b.a(r0)
            return
        L31:
            if (r6 != 0) goto L3d
            int r3 = -r3
            java.util.concurrent.atomic.AtomicInteger r4 = r8.c
            int r3 = r4.addAndGet(r3)
            if (r3 != 0) goto L7
            return
        L3d:
            if (r6 != r7) goto L58
            r2.onComplete()
            if (r4 != 0) goto L52
            int r2 = r8.f19534l
            Wh.f r4 = new Wh.f
            r4.<init>(r2)
            r8.f19535n = r4
            r1.onNext(r4)
            r2 = r4
            goto L7
        L52:
            fh.b r4 = r8.m
            r4.dispose()
            goto L7
        L58:
            r2.onNext(r6)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.k3.F():void");
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f = true;
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18321g = true;
        if (B()) {
            F();
        }
        this.f18320d.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.h = th2;
        this.f18321g = true;
        if (B()) {
            F();
        }
        this.f18320d.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f19537p) {
            return;
        }
        if (C()) {
            this.f19535n.onNext(obj);
            if (this.c.addAndGet(-1) == 0) {
                return;
            }
        } else {
            this.e.offer(obj);
            if (!B()) {
                return;
            }
        }
        F();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.m, interfaceC1486b)) {
            this.m = interfaceC1486b;
            this.f19535n = new Wh.f(this.f19534l);
            C2479c c2479c = this.f18320d;
            c2479c.onSubscribe(this);
            c2479c.onNext(this.f19535n);
            if (!this.f) {
                ch.v vVar = this.f19533k;
                long j = this.i;
                InterfaceC1486b interfaceC1486bF = vVar.f(this, j, j, this.j);
                C1487c c1487c = this.f19536o;
                c1487c.getClass();
                EnumC1604b.c(c1487c, interfaceC1486bF);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            this.f19537p = true;
        }
        this.e.offer(f19532q);
        if (B()) {
            F();
        }
    }
}
