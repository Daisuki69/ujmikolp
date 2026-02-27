package com.paymaya.domain.store;

import com.appsflyer.AppsFlyerProperties;
import com.paymaya.data.api.PayMayaClientApi;
import java.nio.charset.Charset;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.paymaya.domain.store.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1274n0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11465b;

    public final Ah.p a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("currency", str2);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put("value", str3);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("amount", jSONObject2);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject.put(AppsFlyerProperties.CHANNEL, str);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        return this.f11465b.getMoneyInTopUp(RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
    }
}
