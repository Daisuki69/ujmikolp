package T2;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M2.a f5759a = M2.a.d();

    public static void a(Trace trace, N2.c cVar) {
        int i = cVar.f3514a;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        int i4 = cVar.f3515b;
        if (i4 > 0) {
            trace.putMetric("_fr_slo", i4);
        }
        int i6 = cVar.c;
        if (i6 > 0) {
            trace.putMetric("_fr_fzn", i6);
        }
        f5759a.a("Screen trace: " + trace.f9852d + " _fr_tot:" + cVar.f3514a + " _fr_slo:" + i4 + " _fr_fzn:" + i6);
    }
}
