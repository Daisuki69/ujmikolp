package ph;

import ch.InterfaceC1104c;
import fh.C1485a;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends AtomicReference implements InterfaceC1104c, InterfaceC1486b, ch.i, ch.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f19183b;

    public /* synthetic */ F0(AtomicInteger atomicInteger, int i) {
        this.f19182a = i;
        this.f19183b = atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f19183b
            ph.K0 r0 = (ph.K0) r0
            fh.a r1 = r0.f19243d
            r1.c(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L55
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L55
            ch.r r3 = r0.f19242b
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L25
            r1 = r2
        L25:
            java.util.concurrent.atomic.AtomicReference r5 = r0.h
            java.lang.Object r5 = r5.get()
            rh.c r5 = (rh.c) r5
            if (r1 == 0) goto L4e
            if (r5 == 0) goto L37
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4e
        L37:
            Qh.c r5 = r0.f
            r5.getClass()
            java.lang.Throwable r5 = vh.AbstractC2353d.b(r5)
            if (r5 == 0) goto L48
            ch.r r0 = r0.f19242b
            r0.onError(r5)
            return
        L48:
            ch.r r5 = r0.f19242b
            r5.onComplete()
            return
        L4e:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L83
            goto L82
        L55:
            java.util.concurrent.atomic.AtomicReference r1 = r0.h
            java.lang.Object r2 = r1.get()
            rh.c r2 = (rh.c) r2
            if (r2 == 0) goto L61
        L5f:
            r3 = r2
            goto L72
        L61:
            rh.c r2 = new rh.c
            int r3 = ch.l.bufferSize()
            r2.<init>(r3)
        L6a:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L8a
            goto L5f
        L72:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L83
        L82:
            return
        L83:
            r0.a()
            return
        L87:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L87
            throw r5
        L8a:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L6a
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.F0.a(java.lang.Object):void");
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        switch (this.f19182a) {
            case 0:
                EnumC1604b.a(this);
                break;
            case 1:
                EnumC1604b.a(this);
                break;
            case 2:
                EnumC1604b.a(this);
                break;
            default:
                EnumC1604b.a(this);
                break;
        }
    }

    @Override // ch.InterfaceC1104c, ch.i
    public void onComplete() {
        switch (this.f19182a) {
            case 0:
                G0 g02 = (G0) this.f19183b;
                g02.e.c(this);
                g02.onComplete();
                break;
            case 1:
                I0 i02 = (I0) this.f19183b;
                i02.e.c(this);
                i02.onComplete();
                break;
            default:
                K0 k02 = (K0) this.f19183b;
                k02.f19243d.c(this);
                int i = k02.get();
                AtomicInteger atomicInteger = k02.e;
                if (i == 0) {
                    if (k02.compareAndSet(0, 1)) {
                        boolean z4 = atomicInteger.decrementAndGet() == 0;
                        rh.c cVar = (rh.c) k02.h.get();
                        if (z4 && (cVar == null || cVar.isEmpty())) {
                            Qh.c cVar2 = k02.f;
                            cVar2.getClass();
                            Throwable thB = AbstractC2353d.b(cVar2);
                            ch.r rVar = k02.f19242b;
                            if (thB == null) {
                                rVar.onComplete();
                            } else {
                                rVar.onError(thB);
                            }
                            break;
                        } else if (k02.decrementAndGet() != 0) {
                            k02.a();
                            break;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (k02.getAndIncrement() == 0) {
                    k02.a();
                }
                break;
        }
    }

    @Override // ch.InterfaceC1104c, ch.i, ch.x
    public final void onError(Throwable th2) {
        switch (this.f19182a) {
            case 0:
                G0 g02 = (G0) this.f19183b;
                g02.e.c(this);
                g02.onError(th2);
                break;
            case 1:
                I0 i02 = (I0) this.f19183b;
                i02.e.c(this);
                i02.onError(th2);
                break;
            case 2:
                K0 k02 = (K0) this.f19183b;
                C1485a c1485a = k02.f19243d;
                c1485a.c(this);
                Qh.c cVar = k02.f;
                cVar.getClass();
                if (!AbstractC2353d.a(cVar, th2)) {
                    S1.s.r(th2);
                } else {
                    if (!k02.c) {
                        k02.i.dispose();
                        c1485a.dispose();
                    }
                    k02.e.decrementAndGet();
                    if (k02.getAndIncrement() == 0) {
                        k02.a();
                    }
                }
                break;
            default:
                K0 k03 = (K0) this.f19183b;
                C1485a c1485a2 = k03.f19243d;
                c1485a2.c(this);
                Qh.c cVar2 = k03.f;
                cVar2.getClass();
                if (!AbstractC2353d.a(cVar2, th2)) {
                    S1.s.r(th2);
                } else {
                    if (!k03.c) {
                        k03.i.dispose();
                        c1485a2.dispose();
                    }
                    k03.e.decrementAndGet();
                    if (k03.getAndIncrement() == 0) {
                        k03.a();
                    }
                }
                break;
        }
    }

    @Override // ch.InterfaceC1104c, ch.i
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        switch (this.f19182a) {
            case 0:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            case 1:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            case 2:
                EnumC1604b.e(this, interfaceC1486b);
                break;
            default:
                EnumC1604b.e(this, interfaceC1486b);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    @Override // ch.i, ch.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f19182a
            switch(r0) {
                case 2: goto L96;
                default: goto L5;
            }
        L5:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f19183b
            ph.K0 r0 = (ph.K0) r0
            fh.a r1 = r0.f19243d
            r1.c(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L5a
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L5a
            ch.r r3 = r0.f19242b
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L2a
            r1 = r2
        L2a:
            java.util.concurrent.atomic.AtomicReference r5 = r0.h
            java.lang.Object r5 = r5.get()
            rh.c r5 = (rh.c) r5
            if (r1 == 0) goto L53
            if (r5 == 0) goto L3c
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L53
        L3c:
            Qh.c r5 = r0.f
            r5.getClass()
            java.lang.Throwable r5 = vh.AbstractC2353d.b(r5)
            if (r5 == 0) goto L4d
            ch.r r0 = r0.f19242b
            r0.onError(r5)
            goto L8b
        L4d:
            ch.r r5 = r0.f19242b
            r5.onComplete()
            goto L8b
        L53:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L88
            goto L8b
        L5a:
            java.util.concurrent.atomic.AtomicReference r1 = r0.h
            java.lang.Object r2 = r1.get()
            rh.c r2 = (rh.c) r2
            if (r2 == 0) goto L66
        L64:
            r3 = r2
            goto L77
        L66:
            rh.c r2 = new rh.c
            int r3 = ch.l.bufferSize()
            r2.<init>(r3)
        L6f:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L8f
            goto L64
        L77:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            java.util.concurrent.atomic.AtomicInteger r5 = r0.e
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L88
            goto L8b
        L88:
            r0.a()
        L8b:
            return
        L8c:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8c
            throw r5
        L8f:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L6f
            goto L5a
        L96:
            r4.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.F0.onSuccess(java.lang.Object):void");
    }
}
