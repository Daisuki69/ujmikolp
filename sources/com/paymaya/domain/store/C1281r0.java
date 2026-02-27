package com.paymaya.domain.store;

import com.paymaya.data.api.MayaShopClientApi;
import com.paymaya.data.api.PayMayaClientApi;
import java.nio.charset.Charset;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.paymaya.domain.store.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1281r0 extends y5.f {
    public static final MediaType f = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11477b;
    public MayaShopClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.database.repository.E f11478d;
    public com.paymaya.data.preference.a e;

    public final Ah.p a(String str, String str2, String str3, String str4, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("product_id", str);
        } catch (JSONException unused) {
            yk.a.e();
        }
        if (!com.paymaya.common.utility.C.e(str2)) {
            try {
                jSONObject.put("recipient", str2);
            } catch (JSONException unused2) {
                yk.a.e();
            }
        }
        if (!com.paymaya.common.utility.C.e(str3)) {
            try {
                jSONObject.put("fund_source_id", str3);
            } catch (JSONException unused3) {
                yk.a.e();
            }
        }
        if (!com.paymaya.common.utility.C.e(str4)) {
            try {
                jSONObject.put("message", str4);
            } catch (JSONException unused4) {
                yk.a.e();
            }
        }
        if (map != null && !map.isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                } catch (JSONException unused5) {
                    yk.a.e();
                }
            }
            try {
                jSONObject.put("other_fields", jSONObject2);
            } catch (JSONException unused6) {
                yk.a.e();
            }
        }
        return this.f11477b.createPurchaseOrder(RequestBody.create(f, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
    }
}
