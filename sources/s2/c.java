package S2;

import K2.t;
import K2.u;
import T2.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final long i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f5639b;
    public final g e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5641g;
    public final long h;
    public long c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f5640d = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Timer f5638a = new Timer();

    static {
        M2.a.d();
        i = TimeUnit.SECONDS.toMicros(1L);
    }

    public c(g gVar, M2.b bVar, K2.a aVar, String str) {
        long jM;
        u uVar;
        this.f5639b = gVar;
        long jN = str == "Trace" ? aVar.n() : aVar.n();
        if (str == "Trace") {
            synchronized (u.class) {
                try {
                    if (u.f2581b == null) {
                        u.f2581b = new u();
                    }
                    uVar = u.f2581b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager = aVar.f2561a;
            uVar.getClass();
            T2.d dVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (dVar.b() && K2.a.q(((Long) dVar.a()).longValue())) {
                aVar.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                jM = ((Long) dVar.a()).longValue();
            } else {
                T2.d dVarC = aVar.c(uVar);
                jM = (dVarC.b() && K2.a.q(((Long) dVarC.a()).longValue())) ? ((Long) dVarC.a()).longValue() : 300L;
            }
        } else {
            jM = aVar.m();
        }
        long j = jM;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.e = new g(j, jN, timeUnit);
        this.f5641g = j;
        long jN2 = str == "Trace" ? aVar.n() : aVar.n();
        long jC = c(aVar, str);
        this.f = new g(jC, jN2, timeUnit);
        this.h = jC;
    }

    public static long c(K2.a aVar, String str) {
        t tVar;
        if (str != "Trace") {
            return aVar.l();
        }
        aVar.getClass();
        synchronized (t.class) {
            try {
                if (t.f2580b == null) {
                    t.f2580b = new t();
                }
                tVar = t.f2580b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = aVar.f2561a;
        tVar.getClass();
        T2.d dVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_bg");
        if (dVar.b() && K2.a.q(((Long) dVar.a()).longValue())) {
            aVar.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = aVar.c(tVar);
        if (dVarC.b() && K2.a.q(((Long) dVarC.a()).longValue())) {
            return ((Long) dVarC.a()).longValue();
        }
        return 30L;
    }

    public final synchronized void a(boolean z4) {
        try {
            this.f5639b = z4 ? this.e : this.f;
            this.c = z4 ? this.f5641g : this.h;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:14:0x005a, B:16:0x0065, B:19:0x0076, B:21:0x007e, B:10:0x0039, B:11:0x0042, B:12:0x0046, B:13:0x0050), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.google.firebase.perf.util.Timer r0 = new com.google.firebase.perf.util.Timer     // Catch: java.lang.Throwable -> L74
            r0.<init>()     // Catch: java.lang.Throwable -> L74
            com.google.firebase.perf.util.Timer r1 = r13.f5638a     // Catch: java.lang.Throwable -> L74
            r1.getClass()     // Catch: java.lang.Throwable -> L74
            long r2 = r0.f9859b     // Catch: java.lang.Throwable -> L74
            long r4 = r1.f9859b     // Catch: java.lang.Throwable -> L74
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L74
            T2.g r3 = r13.f5639b     // Catch: java.lang.Throwable -> L74
            r3.getClass()     // Catch: java.lang.Throwable -> L74
            int[] r4 = T2.f.f5756a     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r3.c     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.TimeUnit r5 = (java.util.concurrent.TimeUnit) r5     // Catch: java.lang.Throwable -> L74
            int r6 = r5.ordinal()     // Catch: java.lang.Throwable -> L74
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L74
            long r6 = r3.f5758b     // Catch: java.lang.Throwable -> L74
            long r8 = r3.f5757a     // Catch: java.lang.Throwable -> L74
            r3 = 1
            r10 = 1
            if (r4 == r3) goto L50
            r12 = 2
            if (r4 == r12) goto L46
            r12 = 3
            if (r4 == r12) goto L39
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L74
            long r4 = r5.toSeconds(r6)     // Catch: java.lang.Throwable -> L74
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L74
            double r8 = r8 / r4
            goto L5a
        L39:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toMillis(r10)     // Catch: java.lang.Throwable -> L74
        L42:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r8 = r4 * r6
            goto L5a
        L46:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toMicros(r10)     // Catch: java.lang.Throwable -> L74
            goto L42
        L50:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L74
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L74
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L74
            long r6 = r6.toNanos(r10)     // Catch: java.lang.Throwable -> L74
            goto L42
        L5a:
            double r1 = r1 * r8
            long r4 = S2.c.i     // Catch: java.lang.Throwable -> L74
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L74
            double r1 = r1 / r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L76
            double r4 = r13.f5640d     // Catch: java.lang.Throwable -> L74
            double r4 = r4 + r1
            long r1 = r13.c     // Catch: java.lang.Throwable -> L74
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L74
            double r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L74
            r13.f5640d = r1     // Catch: java.lang.Throwable -> L74
            r13.f5638a = r0     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L86
        L76:
            double r0 = r13.f5640d     // Catch: java.lang.Throwable -> L74
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L83
            double r0 = r0 - r4
            r13.f5640d = r0     // Catch: java.lang.Throwable -> L74
            monitor-exit(r13)
            return r3
        L83:
            monitor-exit(r13)
            r0 = 0
            return r0
        L86:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L74
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.c.b():boolean");
    }
}
