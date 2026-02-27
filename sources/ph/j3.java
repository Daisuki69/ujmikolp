package ph;

import fh.C1487c;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 extends lh.l implements InterfaceC1486b {
    public final long i;
    public final TimeUnit j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ch.v f19514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f19515l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f19516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ch.u f19517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1486b f19520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Wh.f f19521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f19522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1487c f19523u;

    public j3(C2479c c2479c, long j, TimeUnit timeUnit, ch.v vVar, int i, long j6, boolean z4) {
        super(c2479c, new C2038a(9));
        this.f19523u = new C1487c();
        this.i = j;
        this.j = timeUnit;
        this.f19514k = vVar;
        this.f19515l = i;
        this.f19516n = j6;
        this.m = z4;
        if (z4) {
            this.f19517o = vVar.b();
        } else {
            this.f19517o = null;
        }
    }

    public final void F() {
        Wh.f fVar;
        C2038a c2038a = this.e;
        C2479c c2479c = this.f18320d;
        Wh.f fVar2 = this.f19521s;
        int iAddAndGet = 1;
        while (!this.f19522t) {
            boolean z4 = this.f18321g;
            Object objPoll = c2038a.poll();
            boolean z5 = objPoll == null;
            boolean z8 = objPoll instanceof i3;
            if (z4 && (z5 || z8)) {
                this.f19521s = null;
                c2038a.clear();
                Throwable th2 = this.h;
                if (th2 != null) {
                    fVar2.onError(th2);
                } else {
                    fVar2.onComplete();
                }
                EnumC1604b.a(this.f19523u);
                ch.u uVar = this.f19517o;
                if (uVar != null) {
                    uVar.dispose();
                    return;
                }
                return;
            }
            if (z5) {
                iAddAndGet = this.c.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (z8) {
                i3 i3Var = (i3) objPoll;
                if (!this.m || this.f19519q == i3Var.f19503a) {
                    fVar2.onComplete();
                    this.f19518p = 0L;
                    fVar = new Wh.f(this.f19515l);
                    this.f19521s = fVar;
                    c2479c.onNext(fVar);
                    fVar2 = fVar;
                }
            } else {
                fVar2.onNext(objPoll);
                long j = this.f19518p + 1;
                if (j >= this.f19516n) {
                    this.f19519q++;
                    this.f19518p = 0L;
                    fVar2.onComplete();
                    fVar = new Wh.f(this.f19515l);
                    this.f19521s = fVar;
                    this.f18320d.onNext(fVar);
                    if (this.m) {
                        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) this.f19523u.get();
                        interfaceC1486b.dispose();
                        ch.u uVar2 = this.f19517o;
                        i3 i3Var2 = new i3(this.f19519q, this);
                        long j6 = this.i;
                        InterfaceC1486b interfaceC1486bD = uVar2.d(i3Var2, j6, j6, this.j);
                        if (!this.f19523u.compareAndSet(interfaceC1486b, interfaceC1486bD)) {
                            interfaceC1486bD.dispose();
                        }
                    }
                    fVar2 = fVar;
                } else {
                    this.f19518p = j;
                }
            }
        }
        this.f19520r.dispose();
        c2038a.clear();
        EnumC1604b.a(this.f19523u);
        ch.u uVar3 = this.f19517o;
        if (uVar3 != null) {
            uVar3.dispose();
        }
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
        if (this.f19522t) {
            return;
        }
        if (C()) {
            Wh.f fVar = this.f19521s;
            fVar.onNext(obj);
            long j = this.f19518p + 1;
            if (j >= this.f19516n) {
                this.f19519q++;
                this.f19518p = 0L;
                fVar.onComplete();
                Wh.f fVar2 = new Wh.f(this.f19515l);
                this.f19521s = fVar2;
                this.f18320d.onNext(fVar2);
                if (this.m) {
                    ((InterfaceC1486b) this.f19523u.get()).dispose();
                    ch.u uVar = this.f19517o;
                    i3 i3Var = new i3(this.f19519q, this);
                    long j6 = this.i;
                    EnumC1604b.c(this.f19523u, uVar.d(i3Var, j6, j6, this.j));
                }
            } else {
                this.f19518p = j;
            }
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
        InterfaceC1486b interfaceC1486bF;
        if (EnumC1604b.f(this.f19520r, interfaceC1486b)) {
            this.f19520r = interfaceC1486b;
            C2479c c2479c = this.f18320d;
            c2479c.onSubscribe(this);
            if (this.f) {
                return;
            }
            Wh.f fVar = new Wh.f(this.f19515l);
            this.f19521s = fVar;
            c2479c.onNext(fVar);
            i3 i3Var = new i3(this.f19519q, this);
            if (this.m) {
                ch.u uVar = this.f19517o;
                long j = this.i;
                interfaceC1486bF = uVar.d(i3Var, j, j, this.j);
            } else {
                ch.v vVar = this.f19514k;
                long j6 = this.i;
                interfaceC1486bF = vVar.f(i3Var, j6, j6, this.j);
            }
            C1487c c1487c = this.f19523u;
            c1487c.getClass();
            EnumC1604b.c(c1487c, interfaceC1486bF);
        }
    }
}
