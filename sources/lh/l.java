package lh;

import M8.A0;
import bg.AbstractC0983W;
import ch.r;
import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicInteger;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends A0 implements r {
    public final AtomicInteger c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2479c f18320d;
    public final C2038a e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f18321g;
    public Throwable h;

    public l(C2479c c2479c, C2038a c2038a) {
        super(15);
        this.c = new AtomicInteger();
        this.f18320d = c2479c;
        this.e = c2038a;
    }

    public void A(C2479c c2479c, Object obj) {
    }

    public final boolean B() {
        return this.c.getAndIncrement() == 0;
    }

    public final boolean C() {
        AtomicInteger atomicInteger = this.c;
        return atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1);
    }

    public final void D(Object obj, InterfaceC1486b interfaceC1486b) {
        AtomicInteger atomicInteger = this.c;
        int i = atomicInteger.get();
        C2479c c2479c = this.f18320d;
        C2038a c2038a = this.e;
        if (i == 0 && atomicInteger.compareAndSet(0, 1)) {
            A(c2479c, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            c2038a.offer(obj);
            if (!B()) {
                return;
            }
        }
        AbstractC0983W.i(c2038a, c2479c, interfaceC1486b, this);
    }

    public final void E(Object obj, InterfaceC1486b interfaceC1486b) {
        AtomicInteger atomicInteger = this.c;
        int i = atomicInteger.get();
        C2479c c2479c = this.f18320d;
        C2038a c2038a = this.e;
        if (i != 0 || !atomicInteger.compareAndSet(0, 1)) {
            c2038a.offer(obj);
            if (!B()) {
                return;
            }
        } else if (c2038a.isEmpty()) {
            A(c2479c, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            c2038a.offer(obj);
        }
        AbstractC0983W.i(c2038a, c2479c, interfaceC1486b, this);
    }
}
