package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.paymaya.domain.store.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1284t extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11481b;

    public final Ah.p a(HashMap map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), (Boolean) entry.getValue());
            } catch (JSONException unused) {
                yk.a.e();
            }
        }
        return this.f11481b.updateConsent(RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
    }
}
