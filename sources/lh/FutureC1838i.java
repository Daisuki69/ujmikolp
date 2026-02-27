package lh;

import ch.r;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: renamed from: lh.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class FutureC1838i extends CountDownLatch implements r, Future, InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f18313b;
    public final AtomicReference c;

    public FutureC1838i() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        EnumC1604b enumC1604b;
        while (true) {
            AtomicReference atomicReference = this.c;
            InterfaceC1486b interfaceC1486b = (InterfaceC1486b) atomicReference.get();
            if (interfaceC1486b == this || interfaceC1486b == (enumC1604b = EnumC1604b.f17147a)) {
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC1486b, enumC1604b)) {
                if (atomicReference.get() != interfaceC1486b) {
                    break;
                }
            }
            if (interfaceC1486b != null) {
                interfaceC1486b.dispose();
            }
            countDown();
            return true;
        }
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th2 = this.f18313b;
        if (th2 == null) {
            return this.f18312a;
        }
        throw new ExecutionException(th2);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return EnumC1604b.b((InterfaceC1486b) this.c.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.f18312a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while (true) {
            AtomicReference atomicReference = this.c;
            InterfaceC1486b interfaceC1486b = (InterfaceC1486b) atomicReference.get();
            if (interfaceC1486b == this || interfaceC1486b == EnumC1604b.f17147a) {
                return;
            }
            while (!atomicReference.compareAndSet(interfaceC1486b, this)) {
                if (atomicReference.get() != interfaceC1486b) {
                    break;
                }
            }
            countDown();
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        S1.s.r(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        return;
     */
    @Override // ch.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            java.lang.Throwable r0 = r3.f18313b
            if (r0 != 0) goto L2a
            r3.f18313b = r4
        L6:
            java.util.concurrent.atomic.AtomicReference r0 = r3.c
            java.lang.Object r1 = r0.get()
            fh.b r1 = (fh.InterfaceC1486b) r1
            if (r1 == r3) goto L26
            ih.b r2 = ih.EnumC1604b.f17147a
            if (r1 != r2) goto L15
            goto L26
        L15:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L1f
            r3.countDown()
            return
        L1f:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L15
            goto L6
        L26:
            S1.s.r(r4)
            return
        L2a:
            S1.s.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh.FutureC1838i.onError(java.lang.Throwable):void");
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.f18312a == null) {
            this.f18312a = obj;
        } else {
            ((InterfaceC1486b) this.c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this.c, interfaceC1486b);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (getCount() != 0 && !await(j, timeUnit)) {
            throw new TimeoutException(AbstractC2353d.c(j, timeUnit));
        }
        if (!isCancelled()) {
            Throwable th2 = this.f18313b;
            if (th2 == null) {
                return this.f18312a;
            }
            throw new ExecutionException(th2);
        }
        throw new CancellationException();
    }
}
