package ph;

import ch.AbstractC1109h;
import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 extends AtomicInteger implements ch.r, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ch.r f19242b;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1485a f19243d;
    public final AtomicInteger e;
    public final Qh.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hh.n f19244g;
    public final AtomicReference h;
    public InterfaceC1486b i;
    public volatile boolean j;

    public K0(int i, ch.r rVar, hh.n nVar, boolean z4) {
        this.f19241a = i;
        switch (i) {
            case 1:
                this.f19242b = rVar;
                this.f19244g = nVar;
                this.c = z4;
                this.f19243d = new C1485a(0);
                this.f = new Qh.c();
                this.e = new AtomicInteger(1);
                this.h = new AtomicReference();
                break;
            default:
                this.f19242b = rVar;
                this.f19244g = nVar;
                this.c = z4;
                this.f19243d = new C1485a(0);
                this.f = new Qh.c();
                this.e = new AtomicInteger(1);
                this.h = new AtomicReference();
                break;
        }
    }

    public final void a() {
        switch (this.f19241a) {
            case 0:
                ch.r rVar = this.f19242b;
                AtomicInteger atomicInteger = this.e;
                AtomicReference atomicReference = this.h;
                int iAddAndGet = 1;
                while (!this.j) {
                    if (!this.c && ((Throwable) this.f.get()) != null) {
                        Qh.c cVar = this.f;
                        cVar.getClass();
                        Throwable thB = AbstractC2353d.b(cVar);
                        rh.c cVar2 = (rh.c) this.h.get();
                        if (cVar2 != null) {
                            cVar2.clear();
                        }
                        rVar.onError(thB);
                        break;
                    } else {
                        boolean z4 = atomicInteger.get() == 0;
                        rh.c cVar3 = (rh.c) atomicReference.get();
                        Object objPoll = cVar3 != null ? cVar3.poll() : null;
                        boolean z5 = objPoll == null;
                        if (z4 && z5) {
                            Qh.c cVar4 = this.f;
                            cVar4.getClass();
                            Throwable thB2 = AbstractC2353d.b(cVar4);
                            if (thB2 == null) {
                                rVar.onComplete();
                            } else {
                                rVar.onError(thB2);
                            }
                            break;
                        } else if (z5) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            rVar.onNext(objPoll);
                        }
                    }
                }
                rh.c cVar5 = (rh.c) this.h.get();
                if (cVar5 != null) {
                    cVar5.clear();
                }
                break;
            default:
                ch.r rVar2 = this.f19242b;
                AtomicInteger atomicInteger2 = this.e;
                AtomicReference atomicReference2 = this.h;
                int iAddAndGet2 = 1;
                while (!this.j) {
                    if (!this.c && ((Throwable) this.f.get()) != null) {
                        Qh.c cVar6 = this.f;
                        cVar6.getClass();
                        Throwable thB3 = AbstractC2353d.b(cVar6);
                        rh.c cVar7 = (rh.c) this.h.get();
                        if (cVar7 != null) {
                            cVar7.clear();
                        }
                        rVar2.onError(thB3);
                        break;
                    } else {
                        boolean z8 = atomicInteger2.get() == 0;
                        rh.c cVar8 = (rh.c) atomicReference2.get();
                        Object objPoll2 = cVar8 != null ? cVar8.poll() : null;
                        boolean z9 = objPoll2 == null;
                        if (z8 && z9) {
                            Qh.c cVar9 = this.f;
                            cVar9.getClass();
                            Throwable thB4 = AbstractC2353d.b(cVar9);
                            if (thB4 == null) {
                                rVar2.onComplete();
                            } else {
                                rVar2.onError(thB4);
                            }
                            break;
                        } else if (z9) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            rVar2.onNext(objPoll2);
                        }
                    }
                }
                rh.c cVar10 = (rh.c) this.h.get();
                if (cVar10 != null) {
                    cVar10.clear();
                }
                break;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19241a) {
            case 0:
                this.j = true;
                this.i.dispose();
                this.f19243d.dispose();
                break;
            default:
                this.j = true;
                this.i.dispose();
                this.f19243d.dispose();
                break;
        }
    }

    @Override // ch.r
    public final void onComplete() {
        switch (this.f19241a) {
            case 0:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        switch (this.f19241a) {
            case 0:
                this.e.decrementAndGet();
                Qh.c cVar = this.f;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    S1.s.r(th2);
                } else {
                    if (!this.c) {
                        this.f19243d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                this.e.decrementAndGet();
                Qh.c cVar2 = this.f;
                cVar2.getClass();
                if (!AbstractC2353d.a(cVar2, th2)) {
                    S1.s.r(th2);
                } else {
                    if (!this.c) {
                        this.f19243d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        switch (this.f19241a) {
            case 0:
                try {
                    Object objApply = this.f19244g.apply(obj);
                    jh.e.b(objApply, "The mapper returned a null MaybeSource");
                    ch.j jVar = (ch.j) objApply;
                    this.e.getAndIncrement();
                    F0 f02 = new F0(this, 2);
                    if (!this.j && this.f19243d.a(f02)) {
                        ((AbstractC1109h) jVar).b(f02);
                        break;
                    }
                } catch (Throwable th2) {
                    of.p.F(th2);
                    this.i.dispose();
                    onError(th2);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f19244g.apply(obj);
                    jh.e.b(objApply2, "The mapper returned a null SingleSource");
                    ch.y yVar = (ch.y) objApply2;
                    this.e.getAndIncrement();
                    F0 f03 = new F0(this, 3);
                    if (!this.j && this.f19243d.a(f03)) {
                        ((ch.w) yVar).c(f03);
                        break;
                    }
                } catch (Throwable th3) {
                    of.p.F(th3);
                    this.i.dispose();
                    onError(th3);
                    return;
                }
                break;
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19241a) {
            case 0:
                if (EnumC1604b.f(this.i, interfaceC1486b)) {
                    this.i = interfaceC1486b;
                    this.f19242b.onSubscribe(this);
                }
                break;
            default:
                if (EnumC1604b.f(this.i, interfaceC1486b)) {
                    this.i = interfaceC1486b;
                    this.f19242b.onSubscribe(this);
                }
                break;
        }
    }
}
