package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import kh.InterfaceC1775b;
import kh.InterfaceC1779f;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2479c f19308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh.n f19309b;
    public final O c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19310d;
    public InterfaceC1779f e;
    public InterfaceC1486b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19311g;
    public volatile boolean h;
    public volatile boolean i;
    public int j;

    public Q(C2479c c2479c, hh.n nVar, int i) {
        this.f19308a = c2479c;
        this.f19309b = nVar;
        this.f19310d = i;
        this.c = new O(c2479c, this, 1);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.h) {
            if (!this.f19311g) {
                boolean z4 = this.i;
                try {
                    Object objPoll = this.e.poll();
                    boolean z5 = objPoll == null;
                    if (z4 && z5) {
                        this.h = true;
                        this.f19308a.onComplete();
                        return;
                    }
                    if (!z5) {
                        try {
                            Object objApply = this.f19309b.apply(objPoll);
                            jh.e.b(objApply, "The mapper returned a null ObservableSource");
                            ch.p pVar = (ch.p) objApply;
                            this.f19311g = true;
                            pVar.subscribe(this.c);
                        } catch (Throwable th2) {
                            of.p.F(th2);
                            dispose();
                            this.e.clear();
                            this.f19308a.onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    of.p.F(th3);
                    dispose();
                    this.e.clear();
                    this.f19308a.onError(th3);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.e.clear();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.h = true;
        O o8 = this.c;
        o8.getClass();
        EnumC1604b.a(o8);
        this.f.dispose();
        if (getAndIncrement() == 0) {
            this.e.clear();
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.i) {
            S1.s.r(th2);
            return;
        }
        this.i = true;
        dispose();
        this.f19308a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.i) {
            return;
        }
        if (this.j == 0) {
            this.e.offer(obj);
        }
        a();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f, interfaceC1486b)) {
            this.f = interfaceC1486b;
            if (interfaceC1486b instanceof InterfaceC1775b) {
                InterfaceC1775b interfaceC1775b = (InterfaceC1775b) interfaceC1486b;
                int iB = interfaceC1775b.b(3);
                if (iB == 1) {
                    this.j = iB;
                    this.e = interfaceC1775b;
                    this.i = true;
                    this.f19308a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.j = iB;
                    this.e = interfaceC1775b;
                    this.f19308a.onSubscribe(this);
                    return;
                }
            }
            this.e = new rh.c(this.f19310d);
            this.f19308a.onSubscribe(this);
        }
    }
}
