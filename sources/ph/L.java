package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AtomicReference implements ch.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f19254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19255b;

    public L(M m, int i) {
        this.f19254a = m;
        this.f19255b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
    @Override // ch.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            r5 = this;
            ph.M r0 = r5.f19254a
            int r1 = r5.f19255b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.f19266d     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            goto L2b
        Ld:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L1f
            int r4 = r0.f19268k     // Catch: java.lang.Throwable -> Lb
            int r4 = r4 + r3
            r0.f19268k = r4     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lb
            if (r4 != r2) goto L21
        L1f:
            r0.h = r3     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L27
            r0.a()
        L27:
            r0.c()
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.L.onComplete():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0015, B:9:0x0019, B:13:0x001d, B:18:0x0026, B:21:0x0030, B:20:0x002e), top: B:31:0x0015 }] */
    @Override // ch.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            ph.M r0 = r4.f19254a
            int r1 = r4.f19255b
            Qh.c r2 = r0.i
            r2.getClass()
            boolean r2 = vh.AbstractC2353d.a(r2, r5)
            if (r2 == 0) goto L3e
            boolean r5 = r0.f
            r2 = 1
            if (r5 == 0) goto L35
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.f19266d     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r5 = move-exception
            goto L33
        L1d:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L2e
            int r3 = r0.f19268k     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + r2
            r0.f19268k = r3     // Catch: java.lang.Throwable -> L1b
            int r5 = r5.length     // Catch: java.lang.Throwable -> L1b
            if (r3 != r5) goto L30
        L2e:
            r0.h = r2     // Catch: java.lang.Throwable -> L1b
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r2 = r1
            goto L35
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5
        L35:
            if (r2 == 0) goto L3a
            r0.a()
        L3a:
            r0.c()
            return
        L3e:
            S1.s.r(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.L.onError(java.lang.Throwable):void");
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        boolean z4;
        M m = this.f19254a;
        int i = this.f19255b;
        synchronized (m) {
            try {
                Object[] objArr = m.f19266d;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i];
                int i4 = m.j;
                if (obj2 == null) {
                    i4++;
                    m.j = i4;
                }
                objArr[i] = obj;
                if (i4 == objArr.length) {
                    m.e.offer(objArr.clone());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    m.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        EnumC1604b.e(this, interfaceC1486b);
    }
}
