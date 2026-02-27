package K2;

import androidx.camera.video.AudioStats;
import com.dynatrace.android.agent.Global;
import com.google.firebase.perf.config.RemoteConfigManager;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M2.a f2560d = M2.a.d();
    public static volatile a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f2561a = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T2.c f2562b = new T2.c();
    public final w c = w.b();

    public static synchronized a e() {
        try {
            if (e == null) {
                e = new a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e;
    }

    public static boolean q(long j) {
        return j >= 0;
    }

    public static boolean r(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(Global.SEMICOLON)) {
                if (str2.trim().equals("22.0.2")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s(long j) {
        return j >= 0;
    }

    public static boolean u(double d10) {
        return AudioStats.AUDIO_AMPLITUDE_NONE <= d10 && d10 <= 1.0d;
    }

    public final T2.d a(x3.d dVar) {
        w wVar = this.c;
        String strO = dVar.o();
        if (strO == null) {
            wVar.getClass();
            w.c.a("Key is null when getting boolean value on device cache.");
            return new T2.d();
        }
        if (wVar.f2584a == null) {
            wVar.c(w.a());
            if (wVar.f2584a == null) {
                return new T2.d();
            }
        }
        if (!wVar.f2584a.contains(strO)) {
            return new T2.d();
        }
        try {
            return new T2.d(Boolean.valueOf(wVar.f2584a.getBoolean(strO, false)));
        } catch (ClassCastException e7) {
            w.c.b("Key %s from sharedPreferences has type other than long: %s", strO, e7.getMessage());
            return new T2.d();
        }
    }

    public final T2.d b(x3.d dVar) {
        w wVar = this.c;
        String strO = dVar.o();
        if (strO == null) {
            wVar.getClass();
            w.c.a("Key is null when getting double value on device cache.");
            return new T2.d();
        }
        if (wVar.f2584a == null) {
            wVar.c(w.a());
            if (wVar.f2584a == null) {
                return new T2.d();
            }
        }
        if (!wVar.f2584a.contains(strO)) {
            return new T2.d();
        }
        try {
            try {
                return new T2.d(Double.valueOf(Double.longBitsToDouble(wVar.f2584a.getLong(strO, 0L))));
            } catch (ClassCastException e7) {
                w.c.b("Key %s from sharedPreferences has type other than double: %s", strO, e7.getMessage());
                return new T2.d();
            }
        } catch (ClassCastException unused) {
            return new T2.d(Double.valueOf(Float.valueOf(wVar.f2584a.getFloat(strO, 0.0f)).doubleValue()));
        }
    }

    public final T2.d c(x3.d dVar) {
        w wVar = this.c;
        String strO = dVar.o();
        if (strO == null) {
            wVar.getClass();
            w.c.a("Key is null when getting long value on device cache.");
            return new T2.d();
        }
        if (wVar.f2584a == null) {
            wVar.c(w.a());
            if (wVar.f2584a == null) {
                return new T2.d();
            }
        }
        if (!wVar.f2584a.contains(strO)) {
            return new T2.d();
        }
        try {
            return new T2.d(Long.valueOf(wVar.f2584a.getLong(strO, 0L)));
        } catch (ClassCastException e7) {
            w.c.b("Key %s from sharedPreferences has type other than long: %s", strO, e7.getMessage());
            return new T2.d();
        }
    }

    public final T2.d d(x3.d dVar) {
        w wVar = this.c;
        String strO = dVar.o();
        if (strO == null) {
            wVar.getClass();
            w.c.a("Key is null when getting String value on device cache.");
            return new T2.d();
        }
        if (wVar.f2584a == null) {
            wVar.c(w.a());
            if (wVar.f2584a == null) {
                return new T2.d();
            }
        }
        if (!wVar.f2584a.contains(strO)) {
            return new T2.d();
        }
        try {
            return new T2.d(svM7M6.getString(wVar.f2584a, strO, ""));
        } catch (ClassCastException e7) {
            w.c.b("Key %s from sharedPreferences has type other than String: %s", strO, e7.getMessage());
            return new T2.d();
        }
    }

    public final boolean f() {
        d dVarE = d.E();
        T2.d dVarI = i(dVarE);
        if (dVarI.b()) {
            return ((Boolean) dVarI.a()).booleanValue();
        }
        T2.d dVar = this.f2561a.getBoolean("fpr_experiment_app_start_ttid");
        if (dVar.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) dVar.a()).booleanValue());
            return ((Boolean) dVar.a()).booleanValue();
        }
        T2.d dVarA = a(dVarE);
        if (dVarA.b()) {
            return ((Boolean) dVarA.a()).booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        b bVar;
        synchronized (b.class) {
            try {
                if (b.f2563b == null) {
                    b.f2563b = new b();
                }
                bVar = b.f2563b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        T2.d dVarI = i(bVar);
        if ((dVarI.b() ? (Boolean) dVarI.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarE = c.E();
        T2.d dVarA = a(cVarE);
        if (dVarA.b()) {
            return (Boolean) dVarA.a();
        }
        T2.d dVarI2 = i(cVarE);
        if (dVarI2.b()) {
            return (Boolean) dVarI2.a();
        }
        return null;
    }

    public final boolean h() {
        l lVar;
        synchronized (l.class) {
            try {
                if (l.f2572b == null) {
                    l.f2572b = new l();
                }
                lVar = l.f2572b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        T2.d dVarD = d(lVar);
        T2.d string = this.f2561a.getString("fpr_disabled_android_versions");
        if (!string.b()) {
            return dVarD.b() ? r((String) dVarD.a()) : r("");
        }
        String str = (String) string.a();
        if (!dVarD.b() || !((String) dVarD.a()).equals(str)) {
            this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
        }
        return r(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T2.d i(x3.d r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            T2.c r2 = r4.f2562b
            java.lang.String r5 = r5.q()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f5751a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            T2.d r5 = new T2.d
            r5.<init>()
            return r5
        L20:
            android.os.Bundle r2 = r2.f5751a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.ClassCastException -> L36
            if (r2 != 0) goto L30
            T2.d r2 = new T2.d     // Catch: java.lang.ClassCastException -> L36
            r2.<init>()     // Catch: java.lang.ClassCastException -> L36
            return r2
        L30:
            T2.d r3 = new T2.d     // Catch: java.lang.ClassCastException -> L36
            r3.<init>(r2)     // Catch: java.lang.ClassCastException -> L36
            return r3
        L36:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r3[r1] = r2
            M2.a r5 = T2.c.f5750b
            java.lang.String r0 = "Metadata key %s contains type other than boolean: %s"
            r5.b(r0, r3)
            T2.d r5 = new T2.d
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.i(x3.d):T2.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T2.d j(x3.d r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            T2.c r2 = r4.f2562b
            java.lang.String r5 = r5.q()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f5751a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            T2.d r5 = new T2.d
            r5.<init>()
            return r5
        L20:
            android.os.Bundle r2 = r2.f5751a
            java.lang.Object r2 = r2.get(r5)
            if (r2 != 0) goto L2e
            T2.d r5 = new T2.d
            r5.<init>()
            return r5
        L2e:
            boolean r3 = r2 instanceof java.lang.Float
            if (r3 == 0) goto L42
            java.lang.Float r2 = (java.lang.Float) r2
            double r0 = r2.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            T2.d r0 = new T2.d
            r0.<init>(r5)
            return r0
        L42:
            boolean r3 = r2 instanceof java.lang.Double
            if (r3 == 0) goto L4e
            java.lang.Double r2 = (java.lang.Double) r2
            T2.d r5 = new T2.d
            r5.<init>(r2)
            return r5
        L4e:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r5
            M2.a r5 = T2.c.f5750b
            java.lang.String r0 = "Metadata key %s contains type other than double: %s"
            r5.b(r0, r1)
            T2.d r5 = new T2.d
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.j(x3.d):T2.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13, types: [T2.d] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [M2.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T2.d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [T2.d] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T2.d k(x3.d r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            T2.c r2 = r4.f2562b
            java.lang.String r5 = r5.q()
            if (r5 == 0) goto L14
            android.os.Bundle r3 = r2.f5751a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L17
            r3 = r1
            goto L18
        L14:
            r2.getClass()
        L17:
            r3 = r0
        L18:
            if (r3 != 0) goto L20
            T2.d r5 = new T2.d
            r5.<init>()
            goto L50
        L20:
            android.os.Bundle r2 = r2.f5751a     // Catch: java.lang.ClassCastException -> L38
            java.lang.Object r2 = r2.get(r5)     // Catch: java.lang.ClassCastException -> L38
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.ClassCastException -> L38
            if (r2 != 0) goto L31
            T2.d r2 = new T2.d     // Catch: java.lang.ClassCastException -> L38
            r2.<init>()     // Catch: java.lang.ClassCastException -> L38
            r5 = r2
            goto L50
        L31:
            T2.d r3 = new T2.d     // Catch: java.lang.ClassCastException -> L38
            r3.<init>(r2)     // Catch: java.lang.ClassCastException -> L38
            r5 = r3
            goto L50
        L38:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r3[r1] = r2
            M2.a r5 = T2.c.f5750b
            java.lang.String r0 = "Metadata key %s contains type other than int: %s"
            r5.b(r0, r3)
            T2.d r5 = new T2.d
            r5.<init>()
        L50:
            boolean r0 = r5.b()
            if (r0 == 0) goto L6b
            java.lang.Object r5 = r5.a()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r0 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            T2.d r0 = new T2.d
            r0.<init>(r5)
            goto L70
        L6b:
            T2.d r0 = new T2.d
            r0.<init>()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.k(x3.d):T2.d");
    }

    public final long l() {
        h hVar;
        synchronized (h.class) {
            try {
                if (h.f2568b == null) {
                    h.f2568b = new h();
                }
                hVar = h.f2568b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f2561a;
        hVar.getClass();
        T2.d dVar = remoteConfigManager.getLong("fpr_rl_network_event_count_bg");
        if (dVar.b() && q(((Long) dVar.a()).longValue())) {
            this.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = c(hVar);
        if (dVarC.b() && q(((Long) dVarC.a()).longValue())) {
            return ((Long) dVarC.a()).longValue();
        }
        return 70L;
    }

    public final long m() {
        i iVar;
        synchronized (i.class) {
            try {
                if (i.f2569b == null) {
                    i.f2569b = new i();
                }
                iVar = i.f2569b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f2561a;
        iVar.getClass();
        T2.d dVar = remoteConfigManager.getLong("fpr_rl_network_event_count_fg");
        if (dVar.b() && q(((Long) dVar.a()).longValue())) {
            this.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = c(iVar);
        if (dVarC.b() && q(((Long) dVarC.a()).longValue())) {
            return ((Long) dVarC.a()).longValue();
        }
        return 700L;
    }

    public final long n() {
        k kVar;
        synchronized (k.class) {
            try {
                if (k.f2571b == null) {
                    k.f2571b = new k();
                }
                kVar = k.f2571b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f2561a;
        kVar.getClass();
        T2.d dVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (dVar.b() && ((Long) dVar.a()).longValue() > 0) {
            this.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = c(kVar);
        if (!dVarC.b() || ((Long) dVarC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) dVarC.a()).longValue();
    }

    public final long o() {
        n nVar;
        synchronized (n.class) {
            try {
                if (n.f2574b == null) {
                    n.f2574b = new n();
                }
                nVar = n.f2574b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        T2.d dVarK = k(nVar);
        if (dVarK.b() && s(((Long) dVarK.a()).longValue())) {
            return ((Long) dVarK.a()).longValue();
        }
        T2.d dVar = this.f2561a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
        if (dVar.b() && s(((Long) dVar.a()).longValue())) {
            this.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = c(nVar);
        if (dVarC.b() && s(((Long) dVarC.a()).longValue())) {
            return ((Long) dVarC.a()).longValue();
        }
        return 0L;
    }

    public final long p() {
        q qVar;
        synchronized (q.class) {
            try {
                if (q.f2577b == null) {
                    q.f2577b = new q();
                }
                qVar = q.f2577b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        T2.d dVarK = k(qVar);
        if (dVarK.b() && s(((Long) dVarK.a()).longValue())) {
            return ((Long) dVarK.a()).longValue();
        }
        T2.d dVar = this.f2561a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
        if (dVar.b() && s(((Long) dVar.a()).longValue())) {
            this.c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
            return ((Long) dVar.a()).longValue();
        }
        T2.d dVarC = c(qVar);
        if (dVarC.b() && s(((Long) dVarC.a()).longValue())) {
            return ((Long) dVarC.a()).longValue();
        }
        return 0L;
    }

    public final boolean t() {
        m mVar;
        boolean zBooleanValue;
        Boolean boolG = g();
        if (boolG == null || boolG.booleanValue()) {
            synchronized (m.class) {
                try {
                    if (m.f2573b == null) {
                        m.f2573b = new m();
                    }
                    mVar = m.f2573b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            T2.d dVarA = a(mVar);
            T2.d dVar = this.f2561a.getBoolean("fpr_enabled");
            if (!dVar.b()) {
                zBooleanValue = dVarA.b() ? ((Boolean) dVarA.a()).booleanValue() : true;
            } else if (this.f2561a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean bool = (Boolean) dVar.a();
                if (!dVarA.b() || dVarA.a() != bool) {
                    this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue && !h()) {
                return true;
            }
        }
        return false;
    }
}
