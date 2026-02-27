package ph;

import bg.AbstractC0983W;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: renamed from: ph.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2046C extends lh.l implements Runnable, InterfaceC1486b {
    public final Callable i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TimeUnit f19130k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19131l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ch.u f19132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Collection f19133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1486b f19134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC1486b f19135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f19136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f19137s;

    public RunnableC2046C(C2479c c2479c, Callable callable, long j, TimeUnit timeUnit, int i, boolean z4, ch.u uVar) {
        super(c2479c, new C2038a(9));
        this.i = callable;
        this.j = j;
        this.f19130k = timeUnit;
        this.f19131l = i;
        this.m = z4;
        this.f19132n = uVar;
    }

    @Override // lh.l
    public final void A(C2479c c2479c, Object obj) {
        c2479c.onNext((Collection) obj);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.f19135q.dispose();
        this.f19132n.dispose();
        synchronized (this) {
            this.f19133o = null;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        Collection collection;
        this.f19132n.dispose();
        synchronized (this) {
            collection = this.f19133o;
            this.f19133o = null;
        }
        if (collection != null) {
            this.e.offer(collection);
            this.f18321g = true;
            if (B()) {
                AbstractC0983W.i(this.e, this.f18320d, this, this);
            }
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        synchronized (this) {
            this.f19133o = null;
        }
        this.f18320d.onError(th2);
        this.f19132n.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0076
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // ch.r
    public final void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Collection r0 = r7.f19133o     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto Lc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L74
        Lc:
            r0.add(r8)     // Catch: java.lang.Throwable -> L71
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r7.f19131l     // Catch: java.lang.Throwable -> L71
            if (r8 >= r1) goto L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L19:
            r8 = 0
            r7.f19133o = r8     // Catch: java.lang.Throwable -> L71
            long r1 = r7.f19136r     // Catch: java.lang.Throwable -> L71
            r3 = 1
            long r1 = r1 + r3
            r7.f19136r = r1     // Catch: java.lang.Throwable -> L71
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            boolean r8 = r7.m
            if (r8 == 0) goto L2d
            fh.b r8 = r7.f19134p
            r8.dispose()
        L2d:
            r7.E(r0, r7)
            java.util.concurrent.Callable r8 = r7.i     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "The buffer supplied is null"
            jh.e.b(r8, r0)     // Catch: java.lang.Throwable -> L62
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L62
            monitor-enter(r7)
            r7.f19133o = r8     // Catch: java.lang.Throwable -> L5b
            long r0 = r7.f19137s     // Catch: java.lang.Throwable -> L5b
            long r0 = r0 + r3
            r7.f19137s = r0     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r7.m
            if (r8 == 0) goto L59
            ch.u r0 = r7.f19132n
            long r2 = r7.j
            java.util.concurrent.TimeUnit r6 = r7.f19130k
            r4 = r2
            r1 = r7
            fh.b r8 = r0.d(r1, r2, r4, r6)
            r1.f19134p = r8
            return
        L59:
            r1 = r7
            return
        L5b:
            r0 = move-exception
            r1 = r7
        L5d:
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L60
            throw r8
        L60:
            r0 = move-exception
            goto L5d
        L62:
            r0 = move-exception
            r1 = r7
            r8 = r0
            of.p.F(r8)
            xh.c r0 = r1.f18320d
            r0.onError(r8)
            r7.dispose()
            return
        L71:
            r0 = move-exception
            r1 = r7
        L73:
            r8 = r0
        L74:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r8
        L76:
            r0 = move-exception
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.RunnableC2046C.onNext(java.lang.Object):void");
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        C2479c c2479c = this.f18320d;
        if (EnumC1604b.f(this.f19135q, interfaceC1486b)) {
            this.f19135q = interfaceC1486b;
            try {
                Object objCall = this.i.call();
                jh.e.b(objCall, "The buffer supplied is null");
                this.f19133o = (Collection) objCall;
                c2479c.onSubscribe(this);
                TimeUnit timeUnit = this.f19130k;
                ch.u uVar = this.f19132n;
                long j = this.j;
                this.f19134p = uVar.d(this, j, j, timeUnit);
            } catch (Throwable th2) {
                of.p.F(th2);
                interfaceC1486b.dispose();
                EnumC1605c.c(th2, c2479c);
                this.f19132n.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object objCall = this.i.call();
            jh.e.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) objCall;
            synchronized (this) {
                Collection collection2 = this.f19133o;
                if (collection2 != null && this.f19136r == this.f19137s) {
                    this.f19133o = collection;
                    E(collection2, this);
                }
            }
        } catch (Throwable th2) {
            of.p.F(th2);
            dispose();
            this.f18320d.onError(th2);
        }
    }
}
