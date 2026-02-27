package Hh;

import Ah.q;
import Kh.u;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReference implements io.reactivex.rxjava3.disposables.b, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2175a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2176b;

    public b(Ah.b bVar) {
        this.f2176b = bVar;
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.a.d(this, bVar);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        switch (this.f2175a) {
            case 0:
                Dh.a.a(this);
                break;
            default:
                Dh.a.a(this);
                break;
        }
    }

    @Override // Ah.q, Ah.b
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.disposables.b bVar;
        switch (this.f2175a) {
            case 0:
                Throwable thB = th2 == null ? Qh.e.b("onError called with a null Throwable.") : th2;
                Object obj = get();
                Dh.a aVar = Dh.a.f1154a;
                if (obj == aVar || (bVar = (io.reactivex.rxjava3.disposables.b) getAndSet(aVar)) == aVar) {
                    E1.c.k(th2);
                    return;
                }
                try {
                    ((Ah.b) this.f2176b).onError(thB);
                    if (bVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            default:
                u uVar = (u) this.f2176b;
                Dh.c cVar = uVar.f2761b;
                cVar.e(this);
                if (uVar.f2762d.a(th2)) {
                    uVar.f2763g.dispose();
                    cVar.dispose();
                    uVar.c.decrementAndGet();
                    uVar.b();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // Ah.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2176b
            Kh.u r0 = (Kh.u) r0
            Dh.c r1 = r0.f2761b
            r1.e(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L46
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L46
            Ah.j r3 = r0.f2760a
            r3.onNext(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.c
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L25
            r1 = r2
        L25:
            java.util.concurrent.atomic.AtomicReference r5 = r0.f
            java.lang.Object r5 = r5.get()
            Mh.b r5 = (Mh.b) r5
            if (r1 == 0) goto L3f
            if (r5 == 0) goto L37
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3f
        L37:
            Qh.c r5 = r0.f2762d
            Ah.j r0 = r0.f2760a
            r5.b(r0)
            return
        L3f:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L80
            goto L7f
        L46:
            java.util.concurrent.atomic.AtomicReference r1 = r0.f
            java.lang.Object r2 = r1.get()
            Mh.b r2 = (Mh.b) r2
            if (r2 == 0) goto L52
        L50:
            r3 = r2
            goto L6f
        L52:
            Mh.b r2 = new Mh.b
            int r3 = Ah.d.f312a
            r2.<init>(r3)
        L59:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L61
            goto L50
        L61:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L59
            java.lang.Object r1 = r1.get()
            r2 = r1
            Mh.b r2 = (Mh.b) r2
            goto L50
        L6f:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            java.util.concurrent.atomic.AtomicInteger r5 = r0.c
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L80
        L7f:
            return
        L80:
            r0.c()
            return
        L84:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L84
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Hh.b.onSuccess(java.lang.Object):void");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f2175a) {
            case 0:
                return androidx.media3.datasource.cache.c.l(b.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public b(u uVar) {
        this.f2176b = uVar;
    }
}
