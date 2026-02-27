package ph;

import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class V0 extends AtomicInteger implements InterfaceC1486b, ch.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh.c f19358b;
    public final T0 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19359d;
    public volatile boolean e;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f19360g = new AtomicBoolean();
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicReference i = new AtomicReference();

    public V0(int i, T0 t0, Object obj, boolean z4) {
        this.f19358b = new rh.c(i);
        this.c = t0;
        this.f19357a = obj;
        this.f19359d = z4;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        rh.c cVar = this.f19358b;
        boolean z4 = this.f19359d;
        ch.r rVar = (ch.r) this.i.get();
        int iAddAndGet = 1;
        while (true) {
            if (rVar != null) {
                while (true) {
                    boolean z5 = this.e;
                    Object objPoll = cVar.poll();
                    boolean z8 = objPoll == null;
                    boolean z9 = this.f19360g.get();
                    rh.c cVar2 = this.f19358b;
                    AtomicReference atomicReference = this.i;
                    if (z9) {
                        cVar2.clear();
                        T0 t0 = this.c;
                        Object obj = this.f19357a;
                        t0.getClass();
                        if (obj == null) {
                            obj = T0.i;
                        }
                        t0.f.remove(obj);
                        if (t0.decrementAndGet() == 0) {
                            t0.f19343g.dispose();
                        }
                        atomicReference.lazySet(null);
                        return;
                    }
                    if (z5) {
                        if (!z4) {
                            Throwable th2 = this.f;
                            if (th2 != null) {
                                cVar2.clear();
                                atomicReference.lazySet(null);
                                rVar.onError(th2);
                                return;
                            } else if (z8) {
                                atomicReference.lazySet(null);
                                rVar.onComplete();
                                return;
                            }
                        } else if (z8) {
                            Throwable th3 = this.f;
                            atomicReference.lazySet(null);
                            if (th3 != null) {
                                rVar.onError(th3);
                                return;
                            } else {
                                rVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z8) {
                        break;
                    } else {
                        rVar.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (rVar == null) {
                rVar = (ch.r) this.i.get();
            }
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f19360g.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.i.lazySet(null);
            T0 t0 = this.c;
            t0.getClass();
            Object obj = this.f19357a;
            if (obj == null) {
                obj = T0.i;
            }
            t0.f.remove(obj);
            if (t0.decrementAndGet() == 0) {
                t0.f19343g.dispose();
            }
        }
    }

    @Override // ch.p
    public final void subscribe(ch.r rVar) {
        if (!this.h.compareAndSet(false, true)) {
            EnumC1605c.c(new IllegalStateException("Only one Observer allowed!"), rVar);
            return;
        }
        rVar.onSubscribe(this);
        AtomicReference atomicReference = this.i;
        atomicReference.lazySet(rVar);
        if (this.f19360g.get()) {
            atomicReference.lazySet(null);
        } else {
            a();
        }
    }
}
