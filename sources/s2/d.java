package S2;

import K2.j;
import T2.g;
import T2.i;
import U2.w;
import android.content.Context;
import androidx.camera.video.AudioStats;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.protobuf.InterfaceC1206u;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K2.a f5642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5643b;
    public final double c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f5644d;
    public final c e;

    public d(Context context, g gVar) {
        M2.b bVar = new M2.b(15);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        K2.a aVarE = K2.a.e();
        this.f5644d = null;
        this.e = null;
        boolean z4 = false;
        if (!(AudioStats.AUDIO_AMPLITUDE_NONE <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (AudioStats.AUDIO_AMPLITUDE_NONE <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z4 = true;
        }
        if (!z4) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.f5643b = dNextDouble;
        this.c = dNextDouble2;
        this.f5642a = aVarE;
        this.f5644d = new c(gVar, bVar, aVarE, "Trace");
        this.e = new c(gVar, bVar, aVarE, "Network");
        i.a(context);
    }

    public static boolean a(InterfaceC1206u interfaceC1206u) {
        return interfaceC1206u.size() > 0 && ((w) interfaceC1206u.get(0)).v() > 0 && ((w) interfaceC1206u.get(0)).u() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r7 = this;
            K2.a r0 = r7.f5642a
            r0.getClass()
            java.lang.Class<K2.e> r1 = K2.e.class
            monitor-enter(r1)
            K2.e r2 = K2.e.f2566b     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L17
            K2.e r2 = new K2.e     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            K2.e.f2566b = r2     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto La3
        L17:
            K2.e r2 = K2.e.f2566b     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            T2.d r1 = r0.j(r2)
            boolean r3 = r1.b()
            if (r3 == 0) goto L38
            java.lang.Object r1 = r1.a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r3 = r1.doubleValue()
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r5
            boolean r1 = K2.a.u(r3)
            if (r1 == 0) goto L38
            goto L99
        L38:
            com.google.firebase.perf.config.RemoteConfigManager r1 = r0.f2561a
            java.lang.String r3 = "fpr_vc_fragment_sampling_rate"
            T2.d r1 = r1.getDouble(r3)
            boolean r3 = r1.b()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            boolean r3 = K2.a.u(r3)
            if (r3 == 0) goto L72
            K2.w r0 = r0.c
            java.lang.String r2 = "com.google.firebase.perf.FragmentSamplingRate"
            java.lang.Object r3 = r1.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r0.e(r2, r3)
            java.lang.Object r0 = r1.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L72:
            T2.d r0 = r0.b(r2)
            boolean r1 = r0.b()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.a()
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            boolean r1 = K2.a.u(r1)
            if (r1 == 0) goto L97
            java.lang.Object r0 = r0.a()
            java.lang.Double r0 = (java.lang.Double) r0
            double r3 = r0.doubleValue()
            goto L99
        L97:
            r3 = 0
        L99:
            double r0 = r7.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto La1
            r0 = 1
            return r0
        La1:
            r0 = 0
            return r0
        La3:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.d.b():boolean");
    }

    public final boolean c() {
        j jVar;
        double dDoubleValue;
        K2.a aVar = this.f5642a;
        aVar.getClass();
        synchronized (j.class) {
            try {
                if (j.f2570b == null) {
                    j.f2570b = new j();
                }
                jVar = j.f2570b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        RemoteConfigManager remoteConfigManager = aVar.f2561a;
        jVar.getClass();
        T2.d dVar = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (dVar.b() && K2.a.u(((Double) dVar.a()).doubleValue())) {
            aVar.c.e("com.google.firebase.perf.NetworkRequestSamplingRate", ((Double) dVar.a()).doubleValue());
            dDoubleValue = ((Double) dVar.a()).doubleValue();
        } else {
            T2.d dVarB = aVar.b(jVar);
            dDoubleValue = (dVarB.b() && K2.a.u(((Double) dVarB.a()).doubleValue())) ? ((Double) dVarB.a()).doubleValue() : aVar.f2561a.isLastFetchFailed() ? 0.001d : 1.0d;
        }
        return this.f5643b < dDoubleValue;
    }
}
