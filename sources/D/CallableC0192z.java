package D;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.firebase.analytics.FirebaseAnalytics;
import dOYHB6.tiZVw8.numX49;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import n.AbstractC1883j;
import n.C1880g;
import org.json.JSONObject;

/* JADX INFO: renamed from: D.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class CallableC0192z implements Callable, hh.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f963b;

    public /* synthetic */ CallableC0192z(Object obj, int i) {
        this.f962a = i;
        this.f963b = obj;
    }

    @Override // hh.n
    public Object apply(Object obj) {
        return this.f963b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f962a) {
            case 0:
                A a8 = (A) this.f963b;
                synchronized (((C0178k) a8.f).f926b) {
                    try {
                        if (((Z.p) a8.e) != null) {
                            return null;
                        }
                        if (((H) a8.f795k).f() != null) {
                            a8.e = new Z.p((CleverTapInstanceConfig) a8.i, ((H) a8.f795k).f(), ((Ci.b) a8.f792b).D((Context) a8.j), (C0178k) a8.f, (r) a8.h, q0.c.f19736b);
                        } else {
                            ((CleverTapInstanceConfig) a8.i).c().j("CRITICAL : No device ID found!");
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                C0176i c0176i = (C0176i) this.f963b;
                try {
                    S sC = ((CleverTapInstanceConfig) c0176i.f917g).c();
                    String str = ((CleverTapInstanceConfig) c0176i.f917g).f9439a;
                    sC.getClass();
                    S.s(str, "Queuing daily events");
                    c0176i.p(null, false);
                    break;
                } catch (Throwable th2) {
                    S sC2 = ((CleverTapInstanceConfig) c0176i.f917g).c();
                    String str2 = ((CleverTapInstanceConfig) c0176i.f917g).f9439a;
                    sC2.getClass();
                    S.t(str2, numX49.tnTj78("PekG"), th2);
                }
                return null;
            case 2:
                return ((FirebaseAnalytics) this.f963b).f9742a.zzH();
            case 3:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f963b;
                try {
                    HashMap map = new HashMap((Map) rVar.e);
                    map.remove("fetch_min_interval_seconds");
                    ((n0.d) rVar.f9804d).c(new JSONObject(map), "Product_Config_" + ((CleverTapInstanceConfig) rVar.c).f9439a + Global.UNDERSCORE + ((String) rVar.f9803b), "config_settings.json");
                    return Boolean.TRUE;
                } catch (Exception e) {
                    e.printStackTrace();
                    S sC3 = ((CleverTapInstanceConfig) rVar.c).c();
                    String strL = jk.b.l((CleverTapInstanceConfig) rVar.c);
                    String str3 = numX49.tnTj78("PekX") + e.getLocalizedMessage();
                    sC3.getClass();
                    S.s(strL, str3);
                    return Boolean.FALSE;
                }
            case 4:
                return this.f963b;
            case 5:
                return ((Z.n) this.f963b).call();
            case 6:
                return AbstractC1883j.c((ByteArrayInputStream) this.f963b, null);
            case 7:
                return new n.w((C1880g) this.f963b);
            default:
                return ((ch.l) this.f963b).replay();
        }
    }
}
