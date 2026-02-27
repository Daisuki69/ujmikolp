package D;

import android.content.Context;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.common.Scopes;
import dOYHB6.tiZVw8.numX49;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Q {
    public static long j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CleverTapInstanceConfig f862b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cg.c f863d;
    public final Ci.b e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H f864g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f861a = new HashMap();
    public final Set h = Collections.synchronizedSet(new HashSet());
    public final HashMap i = new HashMap();
    public final ExecutorService f = Executors.newFixedThreadPool(1);

    public Q(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Cg.c cVar, H h, Ci.b bVar) {
        this.c = context;
        this.f862b = cleverTapInstanceConfig;
        this.f863d = cVar;
        this.f864g = h;
        this.e = bVar;
    }

    public final void a(Object obj, String str) {
        if (obj == null) {
            return;
        }
        try {
            synchronized (this.f861a) {
                this.f861a.put(str, obj);
            }
        } catch (Throwable th2) {
            S sC = this.f862b.c();
            String str2 = this.f862b.f9439a;
            String str3 = numX49.tnTj78("PeB2") + str;
            sC.getClass();
            S.t(str2, str3, th2);
        }
    }

    public final int b(int i, String str) {
        boolean z4 = this.f862b.f9447p;
        Context context = this.c;
        if (!z4) {
            return b0.b(context, i, i(str));
        }
        int iB = b0.b(context, -1000, i(str));
        return iB != -1000 ? iB : b0.e(context).getInt(str, i);
    }

    public final String c(String str) {
        HashMap map = this.i;
        kotlin.jvm.internal.j.g(map, numX49.tnTj78("PeBL"));
        Object objG = map.get(str);
        if (objG == null) {
            objG = d0.g(str);
            map.put(str, objG);
        }
        return (String) objG;
    }

    public final Object d(String str) {
        if (str != null) {
            synchronized (this.f861a) {
                try {
                    Object obj = this.f861a.get(str);
                    if (!(obj instanceof String) || !X5.f.t((String) obj)) {
                        return this.f861a.get(str);
                    }
                    S sC = this.f862b.c();
                    String str2 = this.f862b.f9439a;
                    sC.getClass();
                    S.s(str2, "Failed to retrieve local profile property because it wasn't decrypted");
                    return null;
                } catch (Throwable th2) {
                    S sC2 = this.f862b.c();
                    String str3 = this.f862b.f9439a;
                    sC2.getClass();
                    S.t(str3, "Failed to retrieve local profile property", th2);
                }
            }
        }
        return null;
    }

    public final boolean e(String str) {
        long j6 = this.e.D(this.c).r().j(this.f864g.f(), str, c(str));
        S sC = this.f862b.c();
        String str2 = numX49.tnTj78("PeBr") + j6;
        sC.getClass();
        S.q(str2);
        return j6 >= 0;
    }

    public final boolean f(String str) {
        boolean zE = this.e.D(this.c).r().e(this.f864g.f(), c(str));
        S sC = this.f862b.c();
        String str2 = numX49.tnTj78("PeBZ") + zE;
        sC.getClass();
        S.q(str2);
        return zE;
    }

    public final void g(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == j) {
                runnable.run();
            } else {
                this.f.submit(new P(1, str, (Object) this, (Object) runnable));
            }
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f862b;
            S sC = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.t(str2, numX49.tnTj78("PeBk"), th2);
        }
    }

    public final void h(JSONObject jSONObject) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f862b;
        try {
            boolean z4 = cleverTapInstanceConfig.f9450s;
            String strTnTj78 = numX49.tnTj78("PeBB");
            if (!z4) {
                jSONObject.put(strTnTj78, false);
                return;
            }
            String string = jSONObject.getString(SessionDescription.ATTR_TYPE);
            if ("event".equals(string) && "App Launched".equals(jSONObject.getString("evtName"))) {
                S sC = cleverTapInstanceConfig.c();
                String str = cleverTapInstanceConfig.f9439a;
                sC.getClass();
                S.s(str, "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put(strTnTj78, true);
                return;
            }
            if (Scopes.PROFILE.equals(string)) {
                jSONObject.put(strTnTj78, true);
                S sC2 = cleverTapInstanceConfig.c();
                String str2 = cleverTapInstanceConfig.f9439a;
                sC2.getClass();
                S.s(str2, "Local cache needs to be updated (profile event)");
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (b(iCurrentTimeMillis, "local_cache_last_update") + b(1200, "local_cache_expires_in") < iCurrentTimeMillis) {
                jSONObject.put(strTnTj78, true);
                S sC3 = cleverTapInstanceConfig.c();
                String str3 = cleverTapInstanceConfig.f9439a;
                sC3.getClass();
                S.s(str3, "Local cache needs to be updated");
                return;
            }
            jSONObject.put(strTnTj78, false);
            S sC4 = cleverTapInstanceConfig.c();
            String str4 = cleverTapInstanceConfig.f9439a;
            sC4.getClass();
            S.s(str4, "Local cache doesn't need to be updated");
        } catch (Throwable th2) {
            S sC5 = cleverTapInstanceConfig.c();
            String str5 = cleverTapInstanceConfig.f9439a;
            sC5.getClass();
            S.t(str5, numX49.tnTj78("PeBu"), th2);
        }
    }

    public final String i(String str) {
        StringBuilder sbV = We.s.v(str, numX49.tnTj78("PeBV"));
        sbV.append(this.f862b.f9439a);
        return sbV.toString();
    }

    public final boolean j(String str) {
        boolean zN = this.e.D(this.c).r().n(this.f864g.f(), c(str));
        this.f862b.c().getClass();
        S.q("updatedEventByDeviceID = " + zN);
        return zN;
    }
}
