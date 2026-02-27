package D;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.video.AudioStats;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.gms.common.Scopes;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import n2.C1915b;
import o0.C1954a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pi.InterfaceC2153c;

/* JADX INFO: renamed from: D.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0176i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f915b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f916d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f917g;
    public final Object h;
    public final Object i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f919l;
    public final Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f920n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f921o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f923q;

    public C0176i(Ci.b bVar, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Ci.b bVar2, a0 a0Var, r rVar, We.y yVar, H h, o0.c cVar, c0.j jVar, B b8, C0178k c0178k, Q q9, A a8, b0.g gVar) {
        this.f915b = null;
        this.f922p = null;
        this.c = bVar;
        this.h = context;
        this.f917g = cleverTapInstanceConfig;
        this.f916d = bVar2;
        this.f921o = a0Var;
        this.m = yVar;
        this.f918k = h;
        this.f919l = cVar;
        this.f920n = jVar;
        this.e = q9;
        this.f = cleverTapInstanceConfig.c();
        this.j = b8;
        this.f914a = c0178k;
        this.i = a8;
        this.f923q = gVar;
        rVar.i = this;
    }

    public static void e(Context context, JSONObject jSONObject) {
        try {
            Pattern pattern = d0.f906a;
            jSONObject.put("mc", Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        } catch (Throwable unused) {
        }
        try {
            Pattern pattern2 = d0.f906a;
            String strE = "Unavailable";
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                    strE = (networkInfo == null || !networkInfo.isConnected()) ? d0.e(context) : "WiFi";
                }
            } catch (Throwable unused2) {
            }
            jSONObject.put("nt", strE);
        } catch (Throwable unused3) {
        }
    }

    public static String g(Bundle bundle) {
        Object obj = bundle.get("wzrk_dd");
        if (obj != null) {
            zEqualsIgnoreCase = obj instanceof String ? "true".equalsIgnoreCase((String) obj) : false;
            if (obj instanceof Boolean) {
                zEqualsIgnoreCase = ((Boolean) obj).booleanValue();
            }
        }
        return zEqualsIgnoreCase ? bundle.getString("wzrk_pid") : bundle.getString("wzrk_id");
    }

    public void a(Double d10, String str, String str2) {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        if (str != null) {
            try {
                ((o0.d) this.m).getClass();
                C1954a c1954aC = o0.d.c(str);
                String string = c1954aC.c.toString();
                boolean zIsEmpty = string.isEmpty();
                o0.c cVar = (o0.c) this.f919l;
                if (zIsEmpty) {
                    C1954a c1954aA = o0.b.a(new String[]{string}, 512, 2);
                    cVar.b(c1954aA);
                    S sC = cleverTapInstanceConfig.c();
                    String str3 = cleverTapInstanceConfig.f9439a;
                    String str4 = c1954aA.f18752b;
                    sC.getClass();
                    S.g(str3, str4);
                    return;
                }
                if (d10.intValue() >= 0 && d10.doubleValue() >= AudioStats.AUDIO_AMPLITUDE_NONE && d10.floatValue() >= 0.0f) {
                    if (c1954aC.f18751a != 0) {
                        cVar.b(c1954aC);
                    }
                    ((C0176i) this.e).p(new JSONObject().put(string, new JSONObject().put(str2, d10)), false);
                    return;
                }
                C1954a c1954aA2 = o0.b.a(new String[]{string}, 512, 25);
                cVar.b(c1954aA2);
                S sC2 = cleverTapInstanceConfig.c();
                String str5 = cleverTapInstanceConfig.f9439a;
                String str6 = c1954aA2.f18752b;
                sC2.getClass();
                S.g(str5, str6);
            } catch (Throwable th2) {
                S sC3 = cleverTapInstanceConfig.c();
                String str7 = cleverTapInstanceConfig.f9439a;
                String str8 = numX49.tnTj78("Pe2J") + str;
                sC3.getClass();
                S.t(str7, str8, th2);
            }
        }
    }

    public void b(String str) {
        C1954a c1954aA = o0.b.a(new String[]{str}, 512, 1);
        ((o0.c) this.f919l).b(c1954aA);
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        S sC = cleverTapInstanceConfig.c();
        String str2 = cleverTapInstanceConfig.f9439a;
        String str3 = c1954aA.f18752b;
        sC.getClass();
        S.g(str2, str3);
    }

    public void c(ArrayList arrayList, String str, String str2) {
        if (str == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            b(str);
            return;
        }
        ((o0.d) this.m).getClass();
        C1954a c1954aC = o0.d.c(str);
        String str3 = (String) c1954aC.c;
        try {
            if (AbstractC1331a.B(str3) != 0) {
                C1954a c1954aA = o0.b.a(new String[]{str3}, 523, 24);
                c1954aC.f18752b = c1954aA.f18752b;
                c1954aC.f18751a = c1954aA.f18751a;
                c1954aC.c = null;
            }
        } catch (Throwable unused) {
        }
        int i = c1954aC.f18751a;
        o0.c cVar = (o0.c) this.f919l;
        if (i != 0) {
            cVar.b(c1954aC);
        }
        Object obj = c1954aC.c;
        String string = obj != null ? obj.toString() : null;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        if (string == null || string.isEmpty()) {
            cVar.b(o0.b.a(new String[]{str}, 523, 23));
            S sC = cleverTapInstanceConfig.c();
            String strJ = We.s.j(numX49.tnTj78("Pe2z"), str, numX49.tnTj78("Pe2l"));
            String str4 = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str4, strJ);
            return;
        }
        String strTnTj78 = numX49.tnTj78("Pe2I");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, new JSONArray((Collection) arrayList));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(string, jSONObject);
            ((C0176i) this.e).p(jSONObject2, false);
            S sC2 = cleverTapInstanceConfig.c();
            sC2.getClass();
            S.s(cleverTapInstanceConfig.f9439a, strTnTj78 + jSONObject2);
        } catch (Throwable th2) {
            S sC3 = cleverTapInstanceConfig.c();
            String strConcat = numX49.tnTj78("Pe2q").concat(string);
            String str5 = cleverTapInstanceConfig.f9439a;
            sC3.getClass();
            S.t(str5, strConcat, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        if (r10.isConnected() != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r8, org.json.JSONObject r9, int r10) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0176i.d(android.content.Context, org.json.JSONObject, int):void");
    }

    public boolean f(String str, HashMap map, int i) {
        boolean z4;
        synchronized (this.f923q) {
            z4 = false;
            try {
                ((n0.c) this.f921o).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (map.containsKey(str) && jCurrentTimeMillis - ((Long) map.get(str)).longValue() < i) {
                    z4 = true;
                }
                map.put(str, Long.valueOf(jCurrentTimeMillis));
            } catch (Throwable unused) {
            }
        }
        return z4;
    }

    public void h() {
        if (((CleverTapInstanceConfig) this.f917g).h) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", 1);
            jSONObject.put("evtName", "wzrk_fetch");
            jSONObject.put("evtData", jSONObject2);
        } catch (JSONException unused) {
        }
        ((C0176i) this.e).y((Context) this.h, jSONObject, 7);
    }

    public void i(Context context, int i) {
        l0.b.a((CleverTapInstanceConfig) this.f917g).b().k(numX49.tnTj78("PeL2"), new K.b(i, this, context));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(final android.content.Context r11, final int r12, final java.lang.String r13, final boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "PeLL"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            kotlin.jvm.internal.j.g(r11, r0)
            r0 = 0
            r1 = 1
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r11.getSystemService(r2)     // Catch: java.lang.Exception -> L2a
            boolean r3 = r2 instanceof android.net.ConnectivityManager     // Catch: java.lang.Exception -> L2a
            if (r3 == 0) goto L18
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch: java.lang.Exception -> L2a
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 != 0) goto L1c
            goto L2a
        L1c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L29
            boolean r2 = r2.isConnected()     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r1 = r0
        L2a:
            java.lang.Object r2 = r10.f917g
            com.clevertap.android.sdk.CleverTapInstanceConfig r2 = (com.clevertap.android.sdk.CleverTapInstanceConfig) r2
            java.lang.Object r3 = r10.f
            D.S r3 = (D.S) r3
            if (r1 != 0) goto L60
            java.lang.String r11 = r2.f9439a
            r3.getClass()
            java.lang.String r12 = "PeLr"
            java.lang.String r12 = dOYHB6.tiZVw8.numX49.tnTj78(r12)
            D.S.s(r11, r12)
            java.lang.Object r11 = r10.i
            D.A r11 = (D.A) r11
            java.lang.Object r12 = r11.f797n
            D.Z r12 = (D.Z) r12
            if (r12 == 0) goto L4f
            r12.b()
        L4f:
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.lang.Object r11 = r11.h
            D.r r11 = (D.r) r11
            c0.a r11 = r11.f939l
            if (r11 == 0) goto L5f
            r11.a(r12, r0)
        L5f:
            return
        L60:
            java.lang.Object r0 = r10.j
            D.B r0 = (D.B) r0
            r0.getClass()
            java.lang.Object r0 = r10.f920n
            c0.j r0 = (c0.j) r0
            boolean r1 = r0.g(r12)
            if (r1 == 0) goto L7f
            K.a r4 = new K.a
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>()
            r0.f(r7, r4)
            return
        L7f:
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            java.lang.String r11 = r2.f9439a
            r3.getClass()
            java.lang.String r12 = "PeLZ"
            java.lang.String r12 = dOYHB6.tiZVw8.numX49.tnTj78(r12)
            D.S.s(r11, r12)
            r0.b(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0176i.j(android.content.Context, int, java.lang.String, boolean):void");
    }

    public io.split.android.client.storage.attributes.c k(String str) {
        io.split.android.client.storage.attributes.c cVar;
        io.split.android.client.storage.attributes.b bVar = (io.split.android.client.storage.attributes.b) ((io.split.android.client.storage.attributes.a) this.j);
        synchronized (bVar.f17616b) {
            try {
                if (bVar.f17615a.get(str) == null) {
                    bVar.f17615a.put(str, new io.split.android.client.storage.attributes.c());
                }
                cVar = (io.split.android.client.storage.attributes.c) bVar.f17615a.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject l(org.json.JSONObject r7) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0176i.l(org.json.JSONObject):org.json.JSONObject");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.content.Context r18, org.json.JSONObject r19, int r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0176i.m(android.content.Context, org.json.JSONObject, int):void");
    }

    public void n(Context context, JSONObject jSONObject, int i) {
        String str;
        String strTnTj78 = numX49.tnTj78("PeL3");
        synchronized (((C0178k) this.f914a).f925a) {
            try {
                if (B.f800x == 0) {
                    B.f800x = 1;
                }
                if (i == 1) {
                    str = "page";
                } else if (i == 2) {
                    e(context, jSONObject);
                    if (jSONObject.has("bk")) {
                        ((B) this.j).f805l = true;
                        jSONObject.remove("bk");
                    }
                    ((B) this.j).getClass();
                    str = "ping";
                } else {
                    str = i == 3 ? Scopes.PROFILE : i == 5 ? "data" : "event";
                }
                ((B) this.j).getClass();
                jSONObject.put(CmcdData.Factory.STREAMING_FORMAT_SS, ((B) this.j).f);
                jSONObject.put("pg", B.f800x);
                jSONObject.put(SessionDescription.ATTR_TYPE, str);
                jSONObject.put("ep", (int) (System.currentTimeMillis() / 1000));
                jSONObject.put("f", ((B) this.j).j);
                jSONObject.put("lsl", ((B) this.j).m);
                try {
                    if ("event".equals(jSONObject.getString(SessionDescription.ATTR_TYPE)) && "App Launched".equals(jSONObject.getString("evtName"))) {
                        jSONObject.put("pai", context.getPackageName());
                    }
                } catch (Throwable unused) {
                }
                C1954a c1954aA = ((o0.c) this.f919l).a();
                if (c1954aA != null) {
                    jSONObject.put("wzrk_error", n0.b.c(c1954aA));
                }
                ((Q) this.e).h(jSONObject);
                Ci.b bVar = (Ci.b) this.c;
                kotlin.jvm.internal.j.g(context, "context");
                bVar.I(context, jSONObject, i == 3 ? H.e.c : H.e.f2065b);
                m(context, jSONObject, i);
                z(context);
            } finally {
            }
        }
    }

    public void o() {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        boolean z4 = cleverTapInstanceConfig.m;
        B b8 = (B) this.j;
        if (z4) {
            b8.j(true);
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, numX49.tnTj78("PeLy"));
            return;
        }
        if (b8.i()) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC2.getClass();
            S.s(str2, numX49.tnTj78("PeLv"));
            return;
        }
        S sC3 = cleverTapInstanceConfig.c();
        String str3 = cleverTapInstanceConfig.f9439a;
        sC3.getClass();
        S.s(str3, numX49.tnTj78("PeL7"));
        b8.j(true);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evtName", "App Launched");
            jSONObject.put("evtData", ((H) this.f918k).d());
        } catch (Throwable unused) {
        }
        ((C0176i) this.e).y((Context) this.h, jSONObject, 4);
    }

    public void p(JSONObject jSONObject, boolean z4) {
        Object jSONObject2;
        H h = (H) this.f918k;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        try {
            String strF = h.f();
            JSONObject jSONObject3 = new JSONObject();
            Context context = (Context) this.h;
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                b0.c cVarA = b0.d.a(context, cleverTapInstanceConfig, (o0.c) this.f919l);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        try {
                            jSONObject2 = jSONObject.getJSONObject(next);
                        } catch (JSONException unused) {
                            jSONObject2 = null;
                        }
                    } catch (Throwable unused2) {
                        jSONObject2 = jSONObject.get(next);
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(next, jSONObject2);
                        if (cVarA.a(next)) {
                            String strF2 = h.f();
                            if (!(strF2 != null && strF2.startsWith("__i"))) {
                                b0.g gVar = (b0.g) this.f923q;
                                if (z4) {
                                    try {
                                        gVar.f(strF, next);
                                    } catch (Throwable unused3) {
                                    }
                                } else {
                                    gVar.a(strF, next, jSONObject2.toString());
                                }
                            }
                        }
                    }
                }
            }
            try {
                String str = h.e().c;
                String strTnTj78 = numX49.tnTj78("PeLA");
                if (str != null && !str.equals(strTnTj78)) {
                    jSONObject3.put("Carrier", str);
                }
                String str2 = h.e().f830d;
                if (str2 != null && !str2.equals(strTnTj78)) {
                    jSONObject3.put("cc", str2);
                }
                jSONObject3.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(Scopes.PROFILE, jSONObject3);
                y(context, jSONObject4, 3);
            } catch (JSONException unused4) {
                S sC = cleverTapInstanceConfig.c();
                String str3 = cleverTapInstanceConfig.f9439a;
                sC.getClass();
                S.s(str3, "FATAL: Creating basic profile update event failed!");
            }
        } catch (Throwable th2) {
            S sC2 = cleverTapInstanceConfig.c();
            String str4 = cleverTapInstanceConfig.f9439a;
            sC2.getClass();
            S.t(str4, numX49.tnTj78("PeLY"), th2);
        }
    }

    public synchronized void q(Uri uri, boolean z4) {
        if (uri == null) {
            return;
        }
        try {
            JSONObject jSONObjectB = n0.f.b(uri);
            if (jSONObjectB.has("us")) {
                ((B) this.j).n(jSONObjectB.get("us").toString());
            }
            if (jSONObjectB.has("um")) {
                ((B) this.j).m(jSONObjectB.get("um").toString());
            }
            if (jSONObjectB.has("uc")) {
                ((B) this.j).k(jSONObjectB.get("uc").toString());
            }
            jSONObjectB.put("referrer", uri.toString());
            if (z4) {
                jSONObjectB.put("install", true);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (jSONObjectB.length() > 0) {
                    Iterator<String> itKeys = jSONObjectB.keys();
                    while (itKeys.hasNext()) {
                        try {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObjectB.getString(next));
                        } catch (ClassCastException unused) {
                        }
                    }
                }
                ((C0176i) this.e).y((Context) this.h, jSONObject, 1);
            } catch (Throwable unused2) {
            }
        } finally {
        }
    }

    public void r(boolean z4, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectB = AbstractC0184q.b(cTInAppNotification.f);
            Iterator<String> itKeys = jSONObjectB.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    jSONObject2.put(next, jSONObjectB.get(next));
                }
            }
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj);
                    }
                }
            }
            String strTnTj78 = numX49.tnTj78("PeLT");
            if (z4) {
                try {
                    ((B) this.j).o(jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject.put(strTnTj78, "Notification Clicked");
            } else {
                jSONObject.put(strTnTj78, "Notification Viewed");
            }
            jSONObject.put("evtData", jSONObject2);
            ((C0176i) this.e).y((Context) this.h, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    public void s(boolean z4, CTInboxMessage cTInboxMessage, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = cTInboxMessage.f9565q;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj);
                    }
                }
            }
            String strTnTj78 = numX49.tnTj78("PeLR");
            if (z4) {
                try {
                    ((B) this.j).o(jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject.put(strTnTj78, "Notification Clicked");
            } else {
                jSONObject.put(strTnTj78, "Notification Viewed");
            }
            jSONObject.put("evtData", jSONObject2);
            ((C0176i) this.e).y((Context) this.h, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    public void t() {
        if (((B) this.j).f > 0) {
            return;
        }
        l0.b.a((CleverTapInstanceConfig) this.f917g).b().k(numX49.tnTj78("PeLp"), new CallableC0192z(this, 1));
    }

    public void u(String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        String strTnTj78 = numX49.tnTj78("PeL0");
        try {
            S sC = cleverTapInstanceConfig.c();
            sC.getClass();
            S.s(cleverTapInstanceConfig.f9439a, strTnTj78 + str);
            if (str == null) {
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            HashMap map = (HashMap) this.f915b;
            if (!map.containsKey(str) || iCurrentTimeMillis - ((Integer) map.get(str)).intValue() >= 10) {
                map.put(str, Integer.valueOf(iCurrentTimeMillis));
                q(Uri.parse("wzrk://track?install=true&".concat(str)), true);
            } else {
                S sC2 = cleverTapInstanceConfig.c();
                String str2 = cleverTapInstanceConfig.f9439a;
                sC2.getClass();
                S.s(str2, "Skipping install referrer due to duplicate within 10 seconds");
            }
        } catch (Throwable unused) {
        }
    }

    public void v(final Bundle bundle) {
        String string;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        if (cleverTapInstanceConfig.h) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, numX49.tnTj78("PeLg"));
            return;
        }
        if (bundle == null || bundle.isEmpty() || bundle.get("wzrk_pn") == null) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = cleverTapInstanceConfig.f9439a;
            sC2.getClass();
            S.g(str2, numX49.tnTj78("PeLJ"));
            return;
        }
        try {
            string = bundle.getString("wzrk_acct_id");
        } catch (Throwable unused) {
            string = null;
        }
        if ((string != null || !cleverTapInstanceConfig.f9447p) && !cleverTapInstanceConfig.f9439a.equals(string)) {
            S sC3 = cleverTapInstanceConfig.c();
            String str3 = cleverTapInstanceConfig.f9439a;
            sC3.getClass();
            S.g(str3, numX49.tnTj78("PeL5"));
            return;
        }
        boolean zContainsKey = bundle.containsKey("wzrk_inapp");
        l0.c cVar = (l0.c) this.f922p;
        if (zContainsKey) {
            final int i = 0;
            cVar.b().k("testInappNotification", new Callable(this) { // from class: D.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0176i f910b;

                {
                    this.f910b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i) {
                        case 0:
                            Bundle bundle2 = bundle;
                            C0176i c0176i = this.f910b;
                            c0176i.getClass();
                            try {
                                String string2 = bundle2.getString("wzrk_inapp_type");
                                JSONObject jSONObject = new JSONObject(bundle2.getString("wzrk_inapp"));
                                JSONArray jSONArray = new JSONArray();
                                if ("image-interstitial".equals(string2) || "advanced-builder".equals(string2)) {
                                    jSONArray.put(c0176i.l(jSONObject));
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("inapp_notifs", jSONArray);
                                ((j0.g) c0176i.f920n).d(jSONObject2, (Context) c0176i.h, false);
                            } catch (Throwable th2) {
                                S.o(numX49.tnTj78("PekT"), th2);
                            }
                            break;
                        default:
                            Bundle bundle3 = bundle;
                            C0176i c0176i2 = this.f910b;
                            c0176i2.getClass();
                            try {
                                S.l(numX49.tnTj78("PekA") + bundle3.getString("wzrk_inbox"));
                                JSONObject jSONObject3 = new JSONObject();
                                JSONArray jSONArray2 = new JSONArray();
                                jSONObject3.put("inbox_notifs", jSONArray2);
                                JSONObject jSONObject4 = new JSONObject(bundle3.getString("wzrk_inbox"));
                                jSONObject4.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
                                jSONArray2.put(jSONObject4);
                                new j0.h((CleverTapInstanceConfig) c0176i2.f917g, (C0178k) c0176i2.f914a, (r) c0176i2.f, (A) c0176i2.i).a(jSONObject3, null, (Context) c0176i2.h);
                            } catch (Throwable th3) {
                                S.o(numX49.tnTj78("PekY"), th3);
                            }
                            break;
                    }
                    return null;
                    return null;
                }
            });
            return;
        }
        if (bundle.containsKey("wzrk_inbox")) {
            final int i4 = 1;
            cVar.b().k("testInboxNotification", new Callable(this) { // from class: D.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0176i f910b;

                {
                    this.f910b = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    switch (i4) {
                        case 0:
                            Bundle bundle2 = bundle;
                            C0176i c0176i = this.f910b;
                            c0176i.getClass();
                            try {
                                String string2 = bundle2.getString("wzrk_inapp_type");
                                JSONObject jSONObject = new JSONObject(bundle2.getString("wzrk_inapp"));
                                JSONArray jSONArray = new JSONArray();
                                if ("image-interstitial".equals(string2) || "advanced-builder".equals(string2)) {
                                    jSONArray.put(c0176i.l(jSONObject));
                                } else {
                                    jSONArray.put(jSONObject);
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("inapp_notifs", jSONArray);
                                ((j0.g) c0176i.f920n).d(jSONObject2, (Context) c0176i.h, false);
                            } catch (Throwable th2) {
                                S.o(numX49.tnTj78("PekT"), th2);
                            }
                            break;
                        default:
                            Bundle bundle3 = bundle;
                            C0176i c0176i2 = this.f910b;
                            c0176i2.getClass();
                            try {
                                S.l(numX49.tnTj78("PekA") + bundle3.getString("wzrk_inbox"));
                                JSONObject jSONObject3 = new JSONObject();
                                JSONArray jSONArray2 = new JSONArray();
                                jSONObject3.put("inbox_notifs", jSONArray2);
                                JSONObject jSONObject4 = new JSONObject(bundle3.getString("wzrk_inbox"));
                                jSONObject4.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
                                jSONArray2.put(jSONObject4);
                                new j0.h((CleverTapInstanceConfig) c0176i2.f917g, (C0178k) c0176i2.f914a, (r) c0176i2.f, (A) c0176i2.i).a(jSONObject3, null, (Context) c0176i2.h);
                            } catch (Throwable th3) {
                                S.o(numX49.tnTj78("PekY"), th3);
                            }
                            break;
                    }
                    return null;
                    return null;
                }
            });
            return;
        }
        boolean zContainsKey2 = bundle.containsKey("wzrk_adunit");
        Context context = (Context) this.h;
        r rVar = (r) this.f;
        if (zContainsKey2) {
            try {
                new j0.e(rVar, (A) this.i, cleverTapInstanceConfig).a(n0.b.a(bundle), null, context);
                return;
            } catch (Throwable th2) {
                S.o(numX49.tnTj78("PeLf"), th2);
                return;
            }
        }
        if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
            S sC4 = cleverTapInstanceConfig.c();
            String str4 = cleverTapInstanceConfig.f9439a;
            String str5 = numX49.tnTj78("PeLs") + bundle;
            sC4.getClass();
            S.g(str4, str5);
            return;
        }
        if (f(g(bundle), (HashMap) this.c, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS)) {
            S sC5 = cleverTapInstanceConfig.c();
            String str6 = cleverTapInstanceConfig.f9439a;
            String str7 = numX49.tnTj78("PeL1") + bundle + numX49.tnTj78("PeLn");
            sC5.getClass();
            S.g(str6, str7);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObjectA = AbstractC0173f.a(bundle);
                jSONObject.put("evtName", "Notification Clicked");
                jSONObject.put("evtData", jSONObjectA);
            } catch (Throwable unused2) {
            }
            ((C0176i) this.e).y(context, jSONObject, 4);
            ((B) this.j).o(AbstractC0173f.a(bundle));
        } catch (Throwable unused3) {
        }
        rVar.getClass();
        S.b(numX49.tnTj78("PeLx"));
    }

    public void w(Bundle bundle) {
        boolean zIsEmpty = bundle.isEmpty();
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f917g;
        if (zIsEmpty || bundle.get("wzrk_pn") == null) {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            String str2 = numX49.tnTj78("PeLW") + bundle.toString() + numX49.tnTj78("Per9");
            sC.getClass();
            S.g(str, str2);
            return;
        }
        if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
            S sC2 = cleverTapInstanceConfig.c();
            String str3 = cleverTapInstanceConfig.f9439a;
            String str4 = numX49.tnTj78("PeLl") + bundle;
            sC2.getClass();
            S.g(str3, str4);
            return;
        }
        if (f(g(bundle), (HashMap) this.f916d, 2000)) {
            S sC3 = cleverTapInstanceConfig.c();
            String str5 = cleverTapInstanceConfig.f9439a;
            String str6 = numX49.tnTj78("PeLI") + bundle + numX49.tnTj78("PeLq");
            sC3.getClass();
            S.g(str5, str6);
            return;
        }
        S sC4 = cleverTapInstanceConfig.c();
        String str7 = numX49.tnTj78("PeLz") + bundle;
        sC4.getClass();
        S.f(str7);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectA = AbstractC0173f.a(bundle);
            jSONObject.put("evtName", "Notification Viewed");
            jSONObject.put("evtData", jSONObjectA);
        } catch (Throwable unused) {
        }
        ((C0176i) this.e).y((Context) this.h, jSONObject, 6);
    }

    public void x(HashMap map) {
        if (map == null || map.isEmpty() || ((H) this.f918k).f() == null) {
            return;
        }
        ((l0.c) this.f922p).b().k(numX49.tnTj78("PerP"), new CallableC0170c(2, this, map));
    }

    public void y(Context context, JSONObject jSONObject, int i) {
        C1915b c1915bB = l0.b.a((CleverTapInstanceConfig) this.f917g).b();
        K.d dVar = new K.d(this, jSONObject, i, context);
        Executor executor = (Executor) c1915bB.e;
        if (!(executor instanceof ExecutorService)) {
            throw new UnsupportedOperationException(numX49.tnTj78("Per2"));
        }
        ((ExecutorService) executor).submit(new P(5, numX49.tnTj78("Perb"), (Object) c1915bB, (Object) dVar));
    }

    public void z(Context context) {
        if (((K.e) this.f915b) == null) {
            this.f915b = new K.e(0, this, context);
        }
        K.e eVar = (K.e) this.f915b;
        We.y yVar = (We.y) this.m;
        yVar.removeCallbacks(eVar);
        K.e eVar2 = (K.e) this.f915b;
        c0.j jVar = (c0.j) this.f920n;
        int i = jVar.f9208q;
        int i4 = jVar.f9207p;
        c0.k kVar = jVar.f9203k;
        CleverTapInstanceConfig cleverTapInstanceConfig = kVar.f9211b;
        S sC = cleverTapInstanceConfig.c();
        String strF = We.s.f(i4, numX49.tnTj78("PerL"));
        String str = cleverTapInstanceConfig.f9439a;
        sC.getClass();
        S.g(str, strF);
        String strTnTj78 = numX49.tnTj78("Perr");
        int i6 = 1000;
        if (i4 < 10) {
            S sC2 = cleverTapInstanceConfig.c();
            String str2 = numX49.tnTj78("PerZ") + i4 + numX49.tnTj78("Perk");
            sC2.getClass();
            S.g(str, str2);
        } else if (cleverTapInstanceConfig.f9440b == null) {
            cleverTapInstanceConfig.c().getClass();
            S.g(str, numX49.tnTj78("PerB"));
        } else {
            int iIntValue = ((Number) kVar.c.invoke()).intValue() + i;
            if (iIntValue < 600000) {
                cleverTapInstanceConfig.c().getClass();
                S.g(str, strTnTj78 + i);
                i6 = iIntValue;
            }
        }
        jVar.f9208q = i6;
        String str3 = jVar.f9200b.f9439a;
        String str4 = strTnTj78 + jVar.f9208q;
        jVar.f9205n.getClass();
        S.g(str3, str4);
        yVar.postDelayed(eVar2, jVar.f9208q);
        String str5 = ((CleverTapInstanceConfig) this.f917g).f9439a;
        ((S) this.f).getClass();
        S.s(str5, numX49.tnTj78("Peru"));
    }

    public C0176i(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C0176i c0176i, o0.d dVar, o0.c cVar, B b8, H h, r rVar, A a8, C0178k c0178k, j0.g gVar, l0.c cVar2) {
        n0.c cVar3 = n0.c.f18542a;
        this.f915b = new HashMap(8);
        this.f923q = new Object();
        this.c = new HashMap();
        this.f916d = new HashMap();
        this.h = context;
        this.f917g = cleverTapInstanceConfig;
        this.e = c0176i;
        this.m = dVar;
        this.f919l = cVar;
        this.j = b8;
        this.f918k = h;
        this.f = rVar;
        this.f914a = c0178k;
        this.i = a8;
        this.f920n = gVar;
        this.f921o = cVar3;
        this.f922p = cVar2;
    }

    public C0176i(io.split.android.client.storage.splits.c cVar, Li.c cVar2, Li.c cVar3, io.split.android.client.storage.splits.a aVar, Ii.a aVar2, Ii.b bVar, Ki.a aVar3, Ki.c cVar4, Ki.b bVar2, Ki.d dVar, io.split.android.client.storage.attributes.a aVar4, io.split.android.client.storage.attributes.d dVar2, Qi.c cVar5, InterfaceC2153c interfaceC2153c, Ji.a aVar5, Mi.a aVar6) {
        Objects.requireNonNull(cVar);
        this.f914a = cVar;
        Objects.requireNonNull(cVar2);
        this.f915b = cVar2;
        Objects.requireNonNull(cVar3);
        this.c = cVar3;
        Objects.requireNonNull(aVar);
        this.f916d = aVar;
        Objects.requireNonNull(aVar2);
        this.f = aVar2;
        Objects.requireNonNull(bVar);
        this.e = bVar;
        Objects.requireNonNull(aVar3);
        this.h = aVar3;
        Objects.requireNonNull(cVar4);
        this.f917g = cVar4;
        Objects.requireNonNull(bVar2);
        this.i = bVar2;
        Objects.requireNonNull(aVar4);
        this.j = aVar4;
        Objects.requireNonNull(dVar2);
        this.f918k = dVar2;
        Objects.requireNonNull(cVar5);
        this.f919l = cVar5;
        Objects.requireNonNull(dVar);
        this.m = dVar;
        Objects.requireNonNull(interfaceC2153c);
        this.f920n = interfaceC2153c;
        Objects.requireNonNull(aVar5);
        this.f921o = aVar5;
        Ci.b bVar3 = new Ci.b(cVar2, cVar3);
        Mi.c cVar6 = new Mi.c(aVar6, new Q6.n(bVar3, 5));
        bVar3.f786d = cVar6;
        this.f922p = bVar3;
        this.f923q = cVar6;
    }
}
