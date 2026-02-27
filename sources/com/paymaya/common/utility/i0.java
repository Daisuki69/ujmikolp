package com.paymaya.common.utility;

import com.shield.android.Shield;
import d2.C1328c;
import java.util.HashMap;
import kotlin.UninitializedPropertyAccessException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f11214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f11215b;
    public static boolean c;

    public static synchronized void a() {
        try {
            JSONObject latestDeviceResult = Shield.getInstance().getLatestDeviceResult();
            if (latestDeviceResult != null) {
                JSONObject jSONObjectOptJSONObject = latestDeviceResult.optJSONObject("device_intelligence");
                String str = null;
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("shield_id");
                    if (!strOptString.isEmpty()) {
                        str = strOptString;
                    }
                    f11215b = str;
                } else {
                    f11215b = null;
                }
            }
            yk.a.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String b() {
        String sessionId;
        if (c) {
            yk.a.a();
            sessionId = E4.d.f1258b;
            if (sessionId == null) {
                throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
            }
        } else {
            yk.a.a();
            try {
                sessionId = Shield.getInstance().getSessionId();
            } catch (Exception unused) {
                yk.a.e();
                yk.a.a();
                sessionId = E4.d.f1258b;
                if (sessionId == null) {
                    throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
                }
            }
        }
        yk.a.a();
        return sessionId;
    }

    public static String c() {
        HashMap mapQ = androidx.media3.datasource.cache.c.q("dev", Shield.ENVIRONMENT_DEV, "staging", Shield.ENVIRONMENT_STAGING);
        mapQ.put("prod", Shield.ENVIRONMENT_PROD);
        return (String) mapQ.get("prod");
    }

    public static void d() {
        if (c) {
            yk.a.a();
            return;
        }
        yk.a.a();
        try {
            Shield.getInstance().sendDeviceSignature("login", new com.google.firebase.messaging.n(11));
        } catch (Exception e) {
            yk.a.e();
            C1328c.a().b(e);
        }
    }
}
