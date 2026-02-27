package Wh;

import S1.s;
import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh.c f6444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f6445b;
    public final AtomicReference c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6446d;
    public volatile boolean e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f6447g;
    public final AtomicBoolean h;
    public final e i;
    public boolean j;

    public f(int i) {
        jh.e.c(i, "capacityHint");
        this.f6444a = new rh.c(i);
        this.c = new AtomicReference();
        this.f6446d = true;
        this.f6445b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new e(this);
    }

    public final void d() {
        AtomicReference atomicReference = this.c;
        Runnable runnable = (Runnable) atomicReference.get();
        if (runnable != null) {
            while (!atomicReference.compareAndSet(runnable, null)) {
                if (atomicReference.get() != runnable) {
                    return;
                }
            }
            runnable.run();
        }
    }

    public final void e() {
        Throwable th2;
        if (this.i.getAndIncrement() != 0) {
            return;
        }
        r rVar = (r) this.f6445b.get();
        int iAddAndGet = 1;
        int iAddAndGet2 = 1;
        while (rVar == null) {
            iAddAndGet2 = this.i.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                rVar = (r) this.f6445b.get();
            }
        }
        if (this.j) {
            rh.c cVar = this.f6444a;
            boolean z4 = this.f6446d;
            while (!this.e) {
                boolean z5 = this.f;
                if (!z4 && z5 && (th2 = this.f6447g) != null) {
                    this.f6445b.lazySet(null);
                    cVar.clear();
                    rVar.onError(th2);
                    return;
                }
                rVar.onNext(null);
                if (z5) {
                    this.f6445b.lazySet(null);
                    Throwable th3 = this.f6447g;
                    if (th3 != null) {
                        rVar.onError(th3);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
                iAddAndGet = this.i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.f6445b.lazySet(null);
            return;
        }
        rh.c cVar2 = this.f6444a;
        boolean z8 = this.f6446d;
        boolean z9 = true;
        int iAddAndGet3 = 1;
        while (!this.e) {
            boolean z10 = this.f;
            Object objPoll = this.f6444a.poll();
            boolean z11 = objPoll == null;
            if (z10) {
                if (!z8 && z9) {
                    Throwable th4 = this.f6447g;
                    if (th4 != null) {
                        this.f6445b.lazySet(null);
                        cVar2.clear();
                        rVar.onError(th4);
                        return;
                    }
                    z9 = false;
                }
                if (z11) {
                    this.f6445b.lazySet(null);
                    Throwable th5 = this.f6447g;
                    if (th5 != null) {
                        rVar.onError(th5);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
            }
            if (z11) {
                iAddAndGet3 = this.i.addAndGet(-iAddAndGet3);
                if (iAddAndGet3 == 0) {
                    return;
                }
            } else {
                rVar.onNext(objPoll);
            }
        }
        this.f6445b.lazySet(null);
        cVar2.clear();
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f || this.e) {
            return;
        }
        this.f = true;
        d();
        e();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        jh.e.b(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f || this.e) {
            s.r(th2);
            return;
        }
        this.f6447g = th2;
        this.f = true;
        d();
        e();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        jh.e.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f || this.e) {
            return;
        }
        this.f6444a.offer(obj);
        e();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (this.f || this.e) {
            interfaceC1486b.dispose();
        }
    }

    @Override // ch.l
    public final void subscribeActual(r rVar) {
        if (this.h.get() || !this.h.compareAndSet(false, true)) {
            EnumC1605c.c(new IllegalStateException("Only a single observer allowed."), rVar);
            return;
        }
        rVar.onSubscribe(this.i);
        this.f6445b.lazySet(rVar);
        if (this.e) {
            this.f6445b.lazySet(null);
        } else {
            e();
        }
    }

    public f(int i, Runnable runnable) {
        jh.e.c(i, "capacityHint");
        this.f6444a = new rh.c(i);
        this.c = new AtomicReference(runnable);
        this.f6446d = true;
        this.f6445b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new e(this);
    }
}
