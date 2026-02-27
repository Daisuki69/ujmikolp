package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class K2 extends AtomicInteger implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19249b;
    public final TimeUnit c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ch.u f19250d;
    public final boolean e;
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1486b f19251g;
    public volatile boolean h;
    public Throwable i;
    public volatile boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f19252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19253l;

    public K2(ch.r rVar, long j, TimeUnit timeUnit, ch.u uVar, boolean z4) {
        this.f19248a = rVar;
        this.f19249b = j;
        this.c = timeUnit;
        this.f19250d = uVar;
        this.e = z4;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicReference atomicReference = this.f;
        ch.r rVar = this.f19248a;
        int iAddAndGet = 1;
        while (!this.j) {
            boolean z4 = this.h;
            if (z4 && this.i != null) {
                atomicReference.lazySet(null);
                rVar.onError(this.i);
                this.f19250d.dispose();
                return;
            }
            boolean z5 = atomicReference.get() == null;
            if (z4) {
                Object andSet = atomicReference.getAndSet(null);
                if (!z5 && this.e) {
                    rVar.onNext(andSet);
                }
                rVar.onComplete();
                this.f19250d.dispose();
                return;
            }
            if (z5) {
                if (this.f19252k) {
                    this.f19253l = false;
                    this.f19252k = false;
                }
            } else if (!this.f19253l || this.f19252k) {
                rVar.onNext(atomicReference.getAndSet(null));
                this.f19252k = false;
                this.f19253l = true;
                this.f19250d.b(this, this.f19249b, this.c);
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        atomicReference.lazySet(null);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.j = true;
        this.f19251g.dispose();
        this.f19250d.dispose();
        if (getAndIncrement() == 0) {
            this.f.lazySet(null);
        }
    }

    @Override // ch.r
    public final void onComplete() {
        this.h = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.i = th2;
        this.h = true;
        a();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        this.f.set(obj);
        a();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19251g, interfaceC1486b)) {
            this.f19251g = interfaceC1486b;
            this.f19248a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19252k = true;
        a();
    }
}
