package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import pg.C2038a;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends AtomicInteger implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f19417k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19419b;
    public final C2143y c = new C2143y(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f19420d = new AtomicReference();
    public final AtomicInteger e = new AtomicInteger(1);
    public final C2038a f = new C2038a(9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Qh.c f19421g = new Qh.c();
    public final AtomicBoolean h = new AtomicBoolean();
    public volatile boolean i;
    public Wh.f j;

    public b3(ch.r rVar, int i) {
        this.f19418a = rVar;
        this.f19419b = i;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = this.f19418a;
        C2038a c2038a = this.f;
        Qh.c cVar = this.f19421g;
        int iAddAndGet = 1;
        while (this.e.get() != 0) {
            Wh.f fVar = this.j;
            boolean z4 = this.i;
            if (z4 && cVar.get() != null) {
                c2038a.clear();
                Throwable thB = AbstractC2353d.b(cVar);
                if (fVar != null) {
                    this.j = null;
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
                        this.j = null;
                        fVar.onComplete();
                    }
                    rVar.onComplete();
                    return;
                }
                if (fVar != null) {
                    this.j = null;
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
            } else if (objPoll != f19417k) {
                fVar.onNext(objPoll);
            } else {
                if (fVar != null) {
                    this.j = null;
                    fVar.onComplete();
                }
                if (!this.h.get()) {
                    Wh.f fVar2 = new Wh.f(this.f19419b, this);
                    this.j = fVar2;
                    this.e.getAndIncrement();
                    rVar.onNext(fVar2);
                }
            }
        }
        c2038a.clear();
        this.j = null;
    }

    public final void b() {
        this.f.offer(f19417k);
        a();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.h.compareAndSet(false, true)) {
            this.c.dispose();
            if (this.e.decrementAndGet() == 0) {
                EnumC1604b.a(this.f19420d);
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.c.dispose();
        this.i = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.c.dispose();
        Qh.c cVar = this.f19421g;
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            S1.s.r(th2);
        } else {
            this.i = true;
            a();
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f.offer(obj);
        a();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.e(this.f19420d, interfaceC1486b)) {
            b();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.decrementAndGet() == 0) {
            EnumC1604b.a(this.f19420d);
        }
    }
}
