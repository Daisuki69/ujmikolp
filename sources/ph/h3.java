package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import pg.C2038a;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 extends AtomicInteger implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C2143y f19488l = new C2143y(null, 2);
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19490b;
    public final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f19491d = new AtomicInteger(1);
    public final C2038a e = new C2038a(9);
    public final Qh.c f = new Qh.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19492g = new AtomicBoolean();
    public final Callable h;
    public InterfaceC1486b i;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Wh.f f19493k;

    public h3(ch.r rVar, int i, Callable callable) {
        this.f19489a = rVar;
        this.f19490b = i;
        this.h = callable;
    }

    public final void a() {
        AtomicReference atomicReference = this.c;
        C2143y c2143y = f19488l;
        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) atomicReference.getAndSet(c2143y);
        if (interfaceC1486b == null || interfaceC1486b == c2143y) {
            return;
        }
        interfaceC1486b.dispose();
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = this.f19489a;
        C2038a c2038a = this.e;
        Qh.c cVar = this.f;
        int iAddAndGet = 1;
        while (this.f19491d.get() != 0) {
            Wh.f fVar = this.f19493k;
            boolean z4 = this.j;
            if (z4 && cVar.get() != null) {
                c2038a.clear();
                Throwable thB = AbstractC2353d.b(cVar);
                if (fVar != null) {
                    this.f19493k = null;
                    fVar.onError(thB);
                }
                rVar.onError(thB);
                return;
            }
            Object objPoll = c2038a.poll();
            boolean z5 = objPoll == null;
            if (z4 && z5) {
                cVar.getClass();
                Throwable thB2 = AbstractC2353d.b(cVar);
                if (thB2 == null) {
                    if (fVar != null) {
                        this.f19493k = null;
                        fVar.onComplete();
                    }
                    rVar.onComplete();
                    return;
                }
                if (fVar != null) {
                    this.f19493k = null;
                    fVar.onError(thB2);
                }
                rVar.onError(thB2);
                return;
            }
            if (z5) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll != m) {
                fVar.onNext(objPoll);
            } else {
                if (fVar != null) {
                    this.f19493k = null;
                    fVar.onComplete();
                }
                if (!this.f19492g.get()) {
                    Wh.f fVar2 = new Wh.f(this.f19490b, this);
                    this.f19493k = fVar2;
                    this.f19491d.getAndIncrement();
                    try {
                        Object objCall = this.h.call();
                        jh.e.b(objCall, "The other Callable returned a null ObservableSource");
                        ch.p pVar = (ch.p) objCall;
                        C2143y c2143y = new C2143y(this, 2);
                        AtomicReference atomicReference = this.c;
                        while (true) {
                            if (atomicReference.compareAndSet(null, c2143y)) {
                                pVar.subscribe(c2143y);
                                rVar.onNext(fVar2);
                                break;
                            } else if (atomicReference.get() != null) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        of.p.F(th2);
                        cVar.getClass();
                        AbstractC2353d.a(cVar, th2);
                        this.j = true;
                    }
                }
            }
        }
        c2038a.clear();
        this.f19493k = null;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19492g.compareAndSet(false, true)) {
            a();
            if (this.f19491d.decrementAndGet() == 0) {
                this.i.dispose();
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        a();
        this.j = true;
        b();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        a();
        Qh.c cVar = this.f;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
        } else {
            this.j = true;
            b();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.e.offer(obj);
        b();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.i, interfaceC1486b)) {
            this.i = interfaceC1486b;
            this.f19489a.onSubscribe(this);
            this.e.offer(m);
            b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19491d.decrementAndGet() == 0) {
            this.i.dispose();
        }
    }
}
