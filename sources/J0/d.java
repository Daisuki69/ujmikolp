package j0;

import Bj.H;
import D.A;
import D.S;
import D.r;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import n2.C1915b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17641b = 1;
    public final CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S f17642d;
    public final Object e;

    public d(CleverTapInstanceConfig cleverTapInstanceConfig, C1915b c1915b) {
        this.c = cleverTapInstanceConfig;
        this.e = c1915b;
        S sC = cleverTapInstanceConfig.c();
        kotlin.jvm.internal.j.f(sC, "getLogger(...)");
        this.f17642d = sC;
    }

    @Override // j0.b
    public final void a(JSONObject jSONObject, String str, Context context) {
        switch (this.f17641b) {
            case 0:
                kotlin.jvm.internal.j.g(context, "context");
                CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
                String str2 = cleverTapInstanceConfig.f9439a;
                this.f17642d.getClass();
                S.s(str2, "Processing Content Fetch response...");
                if (cleverTapInstanceConfig.h) {
                    S.s(cleverTapInstanceConfig.f9439a, "CleverTap instance is configured to analytics only, not processing Content Fetch response");
                } else if (jSONObject == null) {
                    S.s(cleverTapInstanceConfig.f9439a, "Can't parse Content Fetch Response, JSON response object is null");
                } else if (!jSONObject.has("content_fetch")) {
                    S.s(cleverTapInstanceConfig.f9439a, "JSON object doesn't contain the content_fetch key");
                } else {
                    try {
                        S.s(cleverTapInstanceConfig.f9439a, "Processing Content Fetch response");
                        JSONArray jSONArray = jSONObject.getJSONArray("content_fetch");
                        kotlin.jvm.internal.j.d(jSONArray);
                        c(jSONArray, context);
                    } catch (Throwable th2) {
                        S.t(cleverTapInstanceConfig.f9439a, "Failed to parse content fetch response", th2);
                        return;
                    }
                }
                break;
            case 1:
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.c;
                String str3 = cleverTapInstanceConfig2.f9439a;
                this.f17642d.getClass();
                S.s(str3, "Processing Feature Flags response...");
                if (cleverTapInstanceConfig2.h) {
                    S.s(cleverTapInstanceConfig2.f9439a, "CleverTap instance is configured to analytics only, not processing Feature Flags response");
                } else if (jSONObject == null) {
                    S.s(cleverTapInstanceConfig2.f9439a, "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
                } else if (!jSONObject.has("ff_notifs")) {
                    S.s(cleverTapInstanceConfig2.f9439a, "Feature Flag : JSON object doesn't contain the Feature Flags key");
                } else {
                    try {
                        S.s(cleverTapInstanceConfig2.f9439a, "Feature Flag : Processing Feature Flags response");
                        b(jSONObject.getJSONObject("ff_notifs"));
                    } catch (Throwable th3) {
                        S.t(cleverTapInstanceConfig2.f9439a, "Feature Flag : Failed to parse response", th3);
                        return;
                    }
                }
                break;
            default:
                CleverTapInstanceConfig cleverTapInstanceConfig3 = this.c;
                String str4 = cleverTapInstanceConfig3.f9439a;
                this.f17642d.getClass();
                S.s(str4, "Processing GeoFences response...");
                if (cleverTapInstanceConfig3.h) {
                    S.s(cleverTapInstanceConfig3.f9439a, "CleverTap instance is configured to analytics only, not processing geofence response");
                } else if (jSONObject == null) {
                    S.s(cleverTapInstanceConfig3.f9439a, "Geofences : Can't parse Geofences Response, JSON response object is null");
                } else if (!jSONObject.has("geofences")) {
                    S.s(cleverTapInstanceConfig3.f9439a, "Geofences : JSON object doesn't contain the Geofences key");
                } else {
                    try {
                        ((r) this.e).getClass();
                        S.g(cleverTapInstanceConfig3.f9439a, "Geofences : Geofence SDK has not been initialized to handle the response");
                    } catch (Throwable th4) {
                        S.t(cleverTapInstanceConfig3.f9439a, "Geofences : Failed to handle Geofences response", th4);
                    }
                }
                break;
        }
    }

    public void b(JSONObject jSONObject) {
        L.b bVar;
        if (jSONObject.getJSONArray("kv") == null || (bVar = (L.b) ((A) this.e).f793d) == null) {
            S sC = this.c.c();
            String str = this.c.f9439a;
            sC.getClass();
            S.s(str, "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
            return;
        }
        synchronized (bVar) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("kv");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        bVar.f2795g.put(jSONObject2.getString("n"), Boolean.valueOf(jSONObject2.getBoolean("v")));
                    } catch (JSONException e) {
                        S sC2 = bVar.f2792a.c();
                        String strB = bVar.b();
                        String str2 = "Error parsing Feature Flag array " + e.getLocalizedMessage();
                        sC2.getClass();
                        S.s(strB, str2);
                    }
                }
                S sC3 = bVar.f2792a.c();
                String strB2 = bVar.b();
                String str3 = "Updating feature flags..." + bVar.f2795g;
                sC3.getClass();
                S.s(strB2, str3);
                bVar.a(jSONObject);
                bVar.e.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(JSONArray jSONArray, Context context) {
        int length = jSONArray.length();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        S s9 = this.f17642d;
        if (length == 0) {
            String str = cleverTapInstanceConfig.f9439a;
            s9.getClass();
            S.s(str, "No content fetch items to process");
            return;
        }
        String str2 = cleverTapInstanceConfig.f9439a;
        String str3 = "Found " + jSONArray.length() + " content fetch items";
        s9.getClass();
        S.s(str2, str3);
        String packageName = context.getPackageName();
        kotlin.jvm.internal.j.f(packageName, "getPackageName(...)");
        C1915b c1915b = (C1915b) this.e;
        H.w((Gj.c) c1915b.f18589g, null, null, new c0.d(c1915b, jSONArray, packageName, null), 3);
    }

    public d(CleverTapInstanceConfig cleverTapInstanceConfig, A a8) {
        this.c = cleverTapInstanceConfig;
        this.f17642d = cleverTapInstanceConfig.c();
        this.e = a8;
    }

    public d(CleverTapInstanceConfig cleverTapInstanceConfig, r rVar) {
        this.c = cleverTapInstanceConfig;
        this.f17642d = cleverTapInstanceConfig.c();
        this.e = rVar;
    }
}
