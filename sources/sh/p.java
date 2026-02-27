package sh;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f20105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f20106b;
    public static final AtomicReference c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f20107d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[LOOP:0: B:19:0x0041->B:28:0x0078, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            sh.p.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            sh.p.f20107d = r0
            java.lang.String r0 = "bF7u"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            r1 = 1
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1c
            goto L23
        L1c:
            java.lang.String r2 = "true"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r1
        L24:
            sh.p.f20105a = r0
            java.lang.String r2 = "bF7V"
            java.lang.String r2 = dOYHB6.tiZVw8.numX49.tnTj78(r2)
            if (r0 == 0) goto L3a
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L35
            goto L3a
        L35:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            sh.p.f20106b = r0
            boolean r0 = sh.p.f20105a
            if (r0 == 0) goto L7c
        L41:
            java.util.concurrent.atomic.AtomicReference r0 = sh.p.c
            java.lang.Object r2 = r0.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            if (r2 == 0) goto L4c
            goto L7c
        L4c:
            Nh.n r3 = new Nh.n
            java.lang.String r4 = "bF7S"
            java.lang.String r4 = dOYHB6.tiZVw8.numX49.tnTj78(r4)
            r5 = 1
            r3.<init>(r4, r5)
            java.util.concurrent.ScheduledExecutorService r6 = java.util.concurrent.Executors.newScheduledThreadPool(r1, r3)
        L5c:
            boolean r3 = r0.compareAndSet(r2, r6)
            if (r3 == 0) goto L72
            Eh.b r7 = new Eh.b
            r0 = 5
            r7.<init>(r0)
            int r0 = sh.p.f20106b
            long r8 = (long) r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            r10 = r8
            r6.scheduleAtFixedRate(r7, r8, r10, r12)
            goto L7c
        L72:
            java.lang.Object r3 = r0.get()
            if (r3 == r2) goto L5c
            r6.shutdownNow()
            goto L41
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.p.<clinit>():void");
    }
}
