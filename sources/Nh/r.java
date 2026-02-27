package Nh;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4482b;
    public static final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f4483d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            Nh.r.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            Nh.r.f4483d = r0
            java.lang.String r0 = "rx3.purge-enabled"
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L19
        L17:
            r0 = r1
            goto L25
        L19:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r0 = move-exception
            bg.AbstractC0983W.G(r0)
            goto L17
        L25:
            Nh.r.f4481a = r0
            java.lang.String r2 = "rx3.purge-period-seconds"
            if (r0 == 0) goto L31
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L33
        L31:
            r0 = r1
            goto L3d
        L33:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L38
            goto L3d
        L38:
            r0 = move-exception
            bg.AbstractC0983W.G(r0)
            goto L31
        L3d:
            Nh.r.f4482b = r0
            boolean r0 = Nh.r.f4481a
            if (r0 == 0) goto L7a
        L43:
            java.util.concurrent.atomic.AtomicReference r0 = Nh.r.c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L4e
            goto L7a
        L4e:
            Nh.n r3 = new Nh.n
            java.lang.String r4 = "RxSchedulerPurge"
            r5 = 0
            r3.<init>(r4, r5)
            java.util.concurrent.ScheduledExecutorService r6 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L5a:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L70
            Eh.b r7 = new Eh.b
            r0 = 1
            r7.<init>(r0)
            int r0 = Nh.r.f4482b
            long r8 = (long) r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            r10 = r8
            r6.scheduleAtFixedRate(r7, r8, r10, r12)
            goto L7a
        L70:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L5a
            r6.shutdownNow()
            goto L43
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Nh.r.<clinit>():void");
    }
}
