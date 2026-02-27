package b1;

import D.S;
import android.text.TextUtils;
import android.util.Log;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.paymaya.domain.store.A0;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n2.C1915b;
import o6.C1967a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C2007c;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f8333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8334b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8335d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f8336g;
    public Object h;
    public Object i;

    public static HashMap a(t tVar, String str) throws Throwable {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) tVar.e;
        HashMap map = new HashMap();
        try {
            String strB = ((n0.d) tVar.f8335d).b(str);
            S sC = cleverTapInstanceConfig.c();
            sC.getClass();
            S.s(jk.b.l(cleverTapInstanceConfig), "GetStoredValues reading file success:[ " + str + "]--[Content]" + strB);
            if (!TextUtils.isEmpty(strB)) {
                try {
                    JSONObject jSONObject = new JSONObject(strB);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            try {
                                String strValueOf = String.valueOf(jSONObject.get(next));
                                if (!TextUtils.isEmpty(strValueOf)) {
                                    map.put(next, strValueOf);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                S sC2 = cleverTapInstanceConfig.c();
                                String strL = jk.b.l(cleverTapInstanceConfig);
                                StringBuilder sbW = We.s.w("GetStoredValues for key ", next, " while parsing json: ");
                                sbW.append(e.getLocalizedMessage());
                                String string = sbW.toString();
                                sC2.getClass();
                                S.s(strL, string);
                            }
                        }
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                    S sC3 = cleverTapInstanceConfig.c();
                    String strL2 = jk.b.l(cleverTapInstanceConfig);
                    String str2 = "GetStoredValues failed due to malformed json: " + e7.getLocalizedMessage();
                    sC3.getClass();
                    S.s(strL2, str2);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            S sC4 = cleverTapInstanceConfig.c();
            String strL3 = jk.b.l(cleverTapInstanceConfig);
            String str3 = "GetStoredValues reading file failed: " + e10.getLocalizedMessage();
            sC4.getClass();
            S.s(strL3, str3);
        }
        return map;
    }

    public static void j(String str, Exception exc) {
        AbstractC1414e.o(exc, We.s.v(str, " : "));
    }

    public static void k(String str, JSONObject jSONObject) {
        StringBuilder sbW = androidx.camera.core.impl.a.w(str);
        sbW.append(jSONObject.toString());
        String string = sbW.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public void b() {
        if (TextUtils.isEmpty((String) ((com.google.firebase.messaging.r) this.h).f9803b)) {
            return;
        }
        C1915b c1915bA = l0.b.a((CleverTapInstanceConfig) this.e).a();
        c1915bA.e(new com.google.firebase.messaging.p(this, 7));
        c1915bA.k("activateProductConfigs", new f0.b(this, 0));
    }

    public void c() {
        Ri.a.d("Disconnecting SSE client");
        if (((AtomicInteger) this.f8334b).getAndSet(2) != 2) {
            io.split.android.client.network.i iVar = (io.split.android.client.network.i) this.i;
            if (iVar != null) {
                try {
                    iVar.close();
                    Ri.a.p("HttpStreamResponse closed successfully");
                } catch (IOException e) {
                    Ri.a.q("Failed to close HttpStreamResponse: " + e.getMessage());
                }
                this.i = null;
            }
            io.split.android.client.network.h hVar = (io.split.android.client.network.h) this.h;
            if (hVar != null) {
                hVar.getClass();
                try {
                    try {
                        Ri.a.d("Closing streaming connection");
                        hVar.c();
                    } catch (Exception e7) {
                        Ri.a.d("Unknown error closing connection: " + e7.getLocalizedMessage());
                        if (hVar.f != null) {
                        }
                        this.h = null;
                    }
                    this.h = null;
                } finally {
                    if (hVar.f != null) {
                        hVar.b();
                    }
                    Ri.a.d("Streaming connection closed");
                }
            }
            Ri.a.d("SSE client disconnected");
        }
    }

    public HashMap d(JSONObject jSONObject) {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.e;
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("kv");
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("n");
                            String string2 = jSONObject2.getString("v");
                            if (!TextUtils.isEmpty(string)) {
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        S sC = cleverTapInstanceConfig.c();
                        String strL = jk.b.l(cleverTapInstanceConfig);
                        String str = "ConvertServerJsonToMap failed: " + e.getLocalizedMessage();
                        sC.getClass();
                        S.s(strL, str);
                    }
                }
            }
            return map;
        } catch (JSONException e7) {
            e7.printStackTrace();
            S sC2 = cleverTapInstanceConfig.c();
            String strL2 = jk.b.l(cleverTapInstanceConfig);
            String str2 = "ConvertServerJsonToMap failed - " + e7.getLocalizedMessage();
            sC2.getClass();
            S.s(strL2, str2);
            return map;
        }
    }

    public String e() {
        return g() + "/activated.json";
    }

    public C2007c f(int i) throws Throwable {
        C2007c c2007c = null;
        try {
            if (!AbstractC2217b.b(2, i)) {
                JSONObject jSONObjectC = ((C1967a) this.e).c();
                if (jSONObjectC != null) {
                    C2007c c2007cV = ((com.google.firebase.messaging.p) this.c).v(jSONObjectC);
                    k("Loaded cached settings: ", jSONObjectC);
                    ((Kh.I) this.f8335d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (AbstractC2217b.b(3, i) || c2007cV.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return c2007cV;
                        } catch (Exception e) {
                            e = e;
                            c2007c = c2007cV;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return c2007c;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e7) {
            e = e7;
        }
    }

    public String g() {
        return "Product_Config_" + ((CleverTapInstanceConfig) this.e).f9439a + Global.UNDERSCORE + ((String) ((com.google.firebase.messaging.r) this.h).f9803b);
    }

    public C2007c h() {
        return (C2007c) ((AtomicReference) this.h).get();
    }

    public void i() {
        if (TextUtils.isEmpty((String) ((com.google.firebase.messaging.r) this.h).f9803b)) {
            return;
        }
        C1915b c1915bA = l0.b.a((CleverTapInstanceConfig) this.e).a();
        c1915bA.e(new A0(this, 5));
        c1915bA.k("ProductConfig#initAsync", new f0.b(this, 2));
    }

    public synchronized void l(JSONObject jSONObject) {
        Integer num;
        HashMap mapD = d(jSONObject);
        ((Map) this.i).clear();
        ((Map) this.i).putAll(mapD);
        S sC = ((CleverTapInstanceConfig) this.e).c();
        sC.getClass();
        S.s(jk.b.l((CleverTapInstanceConfig) this.e), "Product Config: Fetched response:" + jSONObject);
        try {
            num = (Integer) jSONObject.get("ts");
        } catch (Exception e) {
            e.printStackTrace();
            S sC2 = ((CleverTapInstanceConfig) this.e).c();
            String strL = jk.b.l((CleverTapInstanceConfig) this.e);
            String str = "ParseFetchedResponse failed: " + e.getLocalizedMessage();
            sC2.getClass();
            S.s(strL, str);
            num = null;
        }
        if (num != null) {
            ((com.google.firebase.messaging.r) this.h).K(((long) num.intValue()) * 1000);
        }
    }

    public void m(int i) {
        if (i != 0) {
            int iC = AbstractC2217b.c(i);
            D.r rVar = (D.r) this.f8336g;
            if (iC == 0) {
                rVar.getClass();
            } else if (iC == 1) {
                rVar.getClass();
            } else {
                if (iC != 2) {
                    return;
                }
                rVar.getClass();
            }
        }
    }

    public void n(JSONObject jSONObject) {
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.h;
        rVar.getClass();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (TextUtils.isEmpty(next)) {
                    continue;
                } else {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof Number) {
                        int iDoubleValue = (int) ((Number) obj).doubleValue();
                        if ("rc_n".equalsIgnoreCase(next) || "rc_w".equalsIgnoreCase(next)) {
                            next.getClass();
                            if (next.equals("rc_n")) {
                                rVar.L(iDoubleValue);
                            } else if (next.equals("rc_w")) {
                                synchronized (rVar) {
                                    int iA = rVar.A();
                                    if (iDoubleValue > 0 && iA != iDoubleValue) {
                                        ((Map) rVar.e).put("rc_w", String.valueOf(iDoubleValue));
                                        rVar.O();
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                S sC = ((CleverTapInstanceConfig) rVar.c).c();
                String strL = jk.b.l((CleverTapInstanceConfig) rVar.c);
                String str = "Product Config setARPValue failed " + e.getLocalizedMessage();
                sC.getClass();
                S.s(strL, str);
            }
        }
    }
}
