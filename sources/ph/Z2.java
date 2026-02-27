package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class Z2 extends AtomicBoolean implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19401b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19402d;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19403g;
    public long h;
    public InterfaceC1486b i;
    public final AtomicInteger j = new AtomicInteger();
    public final ArrayDeque e = new ArrayDeque();

    public Z2(ch.r rVar, long j, long j6, int i) {
        this.f19400a = rVar;
        this.f19401b = j;
        this.c = j6;
        this.f19402d = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19403g = true;
    }

    @Override // ch.r
    public final void onComplete() {
        ArrayDeque arrayDeque = this.e;
        while (!arrayDeque.isEmpty()) {
            ((Wh.f) arrayDeque.poll()).onComplete();
        }
        this.f19400a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        ArrayDeque arrayDeque = this.e;
        while (!arrayDeque.isEmpty()) {
            ((Wh.f) arrayDeque.poll()).onError(th2);
        }
        this.f19400a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        ArrayDeque arrayDeque = this.e;
        long j = this.f;
        long j6 = this.c;
        if (j % j6 == 0 && !this.f19403g) {
            this.j.getAndIncrement();
            Wh.f fVar = new Wh.f(this.f19402d, this);
            arrayDeque.offer(fVar);
            this.f19400a.onNext(fVar);
        }
        long j7 = this.h + 1;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Wh.f) it.next()).onNext(obj);
        }
        if (j7 >= this.f19401b) {
            ((Wh.f) arrayDeque.poll()).onComplete();
            if (arrayDeque.isEmpty() && this.f19403g) {
                this.i.dispose();
                return;
            }
            this.h = j7 - j6;
        } else {
            this.h = j7;
        }
        this.f = j + 1;
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.i, interfaceC1486b)) {
            this.i = interfaceC1486b;
            this.f19400a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.j.decrementAndGet() == 0 && this.f19403g) {
            this.i.dispose();
        }
    }
}
