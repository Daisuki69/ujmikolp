package com.paymaya.domain.store;

import android.text.TextUtils;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferRecipient;
import java.nio.charset.Charset;
import kotlin.UninitializedPropertyAccessException;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class V0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaCardApi f11400b;
    public final com.paymaya.data.preference.a c;

    public V0(PayMayaCardApi payMayaCardApi, com.paymaya.data.preference.a aVar) {
        this.f11400b = payMayaCardApi;
        this.c = aVar;
    }

    public final Lh.f a(TransferRecipient transferRecipient, Amount amount, String str, String str2, Boolean bool) {
        Ah.p<Transfer> pVarCreateP2PTransferV3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", transferRecipient.mValue());
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, transferRecipient.mType());
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("currency", amount.mCurrency());
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject2.put("value", amount.mValue());
        } catch (JSONException unused4) {
            yk.a.e();
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("recipient", jSONObject);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        try {
            jSONObject3.put("amount", jSONObject2);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject3.put("message", str);
            } catch (JSONException unused7) {
                yk.a.e();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("provider", "paymaya");
            } catch (JSONException unused8) {
                yk.a.e();
            }
            JSONObject jSONObject5 = new JSONObject();
            JSONObject jSONObject6 = new JSONObject();
            try {
                jSONObject6.put(TtmlNode.ATTR_ID, str2);
            } catch (JSONException unused9) {
                yk.a.e();
            }
            try {
                jSONObject5.put("paymaya", jSONObject6);
            } catch (JSONException unused10) {
                yk.a.e();
            }
            try {
                jSONObject4.put("meta", jSONObject5);
            } catch (JSONException unused11) {
                yk.a.e();
            }
            try {
                jSONObject3.put("decoration", jSONObject4);
            } catch (JSONException unused12) {
                yk.a.e();
            }
        }
        byte[] bytes = jSONObject3.toString().getBytes(Charset.forName("UTF-8"));
        boolean zEquals = Boolean.TRUE.equals(bool);
        com.paymaya.data.preference.a aVar = this.c;
        if (zEquals) {
            RequestBody requestBodyA = Je.d.a(bytes);
            String strB = com.paymaya.common.utility.i0.b();
            String strH = aVar.h();
            String str3 = E4.d.c;
            if (str3 == null) {
                throw new UninitializedPropertyAccessException("Uninitialized instance. Please call initialize(context) first.");
            }
            yk.a.a();
            pVarCreateP2PTransferV3 = this.f11400b.createP2PTransferV3WithNewHeader(requestBodyA, strB, strH, "2.153.0", "android", str3);
        } else {
            pVarCreateP2PTransferV3 = this.f11400b.createP2PTransferV3(Je.d.a(bytes), com.paymaya.common.utility.i0.b(), aVar.h(), "2.153.0", "android");
        }
        return pVarCreateP2PTransferV3.d(new Bb.c(25, transferRecipient, amount, str));
    }
}
