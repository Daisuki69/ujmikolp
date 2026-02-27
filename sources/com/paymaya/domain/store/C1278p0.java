package com.paymaya.domain.store;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.data.api.PayMayaClientApi;
import io.flutter.plugins.firebase.crashlytics.Constants;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: renamed from: com.paymaya.domain.store.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1278p0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11471b;
    public PayMayaCardApi c;

    public final Ah.p a(String str, String str2, String msisdn) {
        kotlin.jvm.internal.j.g(msisdn, "msisdn");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, "msisdn");
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("value", msisdn);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.METHOD, "OTP");
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject2.put("params", jSONObject);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        String string = jSONObject2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return this.f11471b.startMFAChallenge(str, str2, RequestBody.create(y5.f.f21063a, bytes));
    }

    public final Ah.p b(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otp", str3);
        } catch (JSONException unused) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.METHOD, "OTP");
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject2.put("params", jSONObject);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        String string = jSONObject2.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return this.f11471b.verifyMFAChallenge(str, str2, RequestBody.create(y5.f.f21063a, bytes));
    }
}
