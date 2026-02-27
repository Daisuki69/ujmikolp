package C5;

import I2.c;
import S2.f;
import U1.g;
import com.dynatrace.android.agent.Global;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f740b;
    public final String c;

    public /* synthetic */ a() {
        this("");
    }

    public final void a() {
        this.f740b.clear();
    }

    public final String b(String str) {
        String str2 = this.c;
        return C2576A.H(str2) ? str : androidx.camera.core.impl.a.j(str2, Global.UNDERSCORE, str);
    }

    public final void c(String str, Map map) {
        if (this.f739a) {
            Trace trace = (Trace) this.f740b.get(b(str));
            if (trace != null) {
                for (Map.Entry entry : map.entrySet()) {
                    trace.putAttribute((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    public final void d(String str, HashMap map) {
        if (this.f739a) {
            Trace trace = (Trace) this.f740b.get(b(str));
            if (trace != null) {
                for (Map.Entry entry : map.entrySet()) {
                    trace.putMetric((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
            }
        }
    }

    public final void e(String str) {
        if (this.f739a) {
            String strB = b(str);
            M2.a aVar = c.f2204b;
            j.f((c) g.e().c(c.class), "getInstance(...)");
            Trace trace = new Trace(strB, f.f5648s, new M2.b(15), J2.c.a(), GaugeManager.getInstance());
            this.f740b.put(strB, trace);
            trace.start();
            "FPT started: ".concat(strB);
            yk.a.f();
        }
    }

    public final void f(String str) {
        if (this.f739a) {
            String strB = b(str);
            HashMap map = this.f740b;
            if (map.containsKey(strB)) {
                Trace trace = (Trace) map.get(strB);
                if (trace != null) {
                    trace.stop();
                }
                map.remove(strB);
            }
            yk.a.f();
        }
    }

    public final void g() {
        f("ttfd");
    }

    public a(String str) {
        this.f740b = new HashMap();
        this.c = str;
    }
}
