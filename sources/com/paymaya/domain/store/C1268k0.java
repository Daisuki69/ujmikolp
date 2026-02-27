package com.paymaya.domain.store;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.data.api.MayaMerchantPaymentApi;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.QRPHMerchantAdditionalInfo;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: renamed from: com.paymaya.domain.store.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1268k0 extends y5.f {
    public static final MediaType e = MediaType.parse("application/json; charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaCardApi f11455b;
    public final MayaMerchantPaymentApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11456d;

    public C1268k0(PayMayaCardApi payMayaCardApi, MayaMerchantPaymentApi mayaMerchantPaymentApi, com.paymaya.data.preference.a aVar) {
        this.f11455b = payMayaCardApi;
        this.c = mayaMerchantPaymentApi;
        this.f11456d = aVar;
    }

    public final Ah.p a(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        JSONObject jSONObject = new JSONObject();
        Amount amount = qRPHMerchantPaymentRequest.getAmount();
        try {
            jSONObject.put("currency", amount != null ? amount.mCurrency() : null);
        } catch (JSONException unused) {
            yk.a.e();
        }
        Amount amount2 = qRPHMerchantPaymentRequest.getAmount();
        try {
            jSONObject.put("value", amount2 != null ? amount2.mValue() : null);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        QRPHMerchantAdditionalInfo additionalInfo = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("globally_unique_payment_system_id", additionalInfo != null ? additionalInfo.getGloballyUniquePaymentSystemId() : null);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo2 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("loyalty_number", additionalInfo2 != null ? additionalInfo2.getLoyaltyNumber() : null);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo3 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("proxy_notif_flag", additionalInfo3 != null ? additionalInfo3.getProxyNotifFlag() : null);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo4 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("acquirer_required_information", additionalInfo4 != null ? additionalInfo4.getAcquirerRequiredInformation() : null);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo5 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("merchant_credit_account_number", additionalInfo5 != null ? additionalInfo5.getMerchantCreditAccountNumber() : null);
        } catch (JSONException unused7) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo6 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("merchant_postal_code", additionalInfo6 != null ? additionalInfo6.getMerchantPostalCode() : null);
        } catch (JSONException unused8) {
            yk.a.e();
        }
        Gb.d dVar = new Gb.d();
        dVar.a(TtmlNode.ATTR_ID, qRPHMerchantPaymentRequest.getMerchantDetails().getId());
        dVar.a(AppMeasurementSdk.ConditionalUserProperty.NAME, qRPHMerchantPaymentRequest.getMerchantDetails().getName());
        dVar.a("city", qRPHMerchantPaymentRequest.getMerchantDetails().getCity());
        dVar.a("claim_id", qRPHMerchantPaymentRequest.getMerchantDetails().getClaimId());
        dVar.a("terminal_id", qRPHMerchantPaymentRequest.getMerchantDetails().getTerminalId());
        dVar.a("acquirer_id", qRPHMerchantPaymentRequest.getMerchantDetails().getAcquirerId());
        dVar.a("store_name", qRPHMerchantPaymentRequest.getMerchantDetails().getStoreName());
        dVar.b("additional_info", jSONObject2);
        JSONObject jSONObject3 = (JSONObject) dVar.f1942b;
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("amount", jSONObject);
        } catch (JSONException unused9) {
            yk.a.e();
        }
        try {
            jSONObject4.put("merchant", jSONObject3);
        } catch (JSONException unused10) {
            yk.a.e();
        }
        String string = jSONObject4.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return this.f11455b.createQRPHMerchantPayment(RequestBody.create(e, bytes));
    }

    public final Ah.p b(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        JSONObject jSONObject = new JSONObject();
        Amount amount = qRPHMerchantPaymentRequest.getAmount();
        try {
            jSONObject.put("currency", amount != null ? amount.mCurrency() : null);
        } catch (JSONException unused) {
            yk.a.e();
        }
        Amount amount2 = qRPHMerchantPaymentRequest.getAmount();
        try {
            jSONObject.put("value", amount2 != null ? amount2.mValue() : null);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject2 = new JSONObject();
        QRPHMerchantAdditionalInfo additionalInfo = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("globally_unique_payment_system_id", additionalInfo != null ? additionalInfo.getGloballyUniquePaymentSystemId() : null);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo2 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("acquirer_required_information", additionalInfo2 != null ? additionalInfo2.getAcquirerRequiredInformation() : null);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo3 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("loyalty_number", additionalInfo3 != null ? additionalInfo3.getLoyaltyNumber() : null);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo4 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("proxy_notif_flag", additionalInfo4 != null ? additionalInfo4.getProxyNotifFlag() : null);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo5 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("merchant_credit_account_number", additionalInfo5 != null ? additionalInfo5.getMerchantCreditAccountNumber() : null);
        } catch (JSONException unused7) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo6 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("country_code", additionalInfo6 != null ? additionalInfo6.getCountryCode() : null);
        } catch (JSONException unused8) {
            yk.a.e();
        }
        QRPHMerchantAdditionalInfo additionalInfo7 = qRPHMerchantPaymentRequest.getMerchantDetails().getAdditionalInfo();
        try {
            jSONObject2.put("merchant_postal_code", additionalInfo7 != null ? additionalInfo7.getMerchantPostalCode() : null);
        } catch (JSONException unused9) {
            yk.a.e();
        }
        Gb.d dVar = new Gb.d();
        dVar.a(TtmlNode.ATTR_ID, qRPHMerchantPaymentRequest.getMerchantDetails().getId());
        dVar.a(AppMeasurementSdk.ConditionalUserProperty.NAME, qRPHMerchantPaymentRequest.getMerchantDetails().getName());
        dVar.a("claim_id", qRPHMerchantPaymentRequest.getMerchantDetails().getClaimId());
        dVar.a("acquirer_id", qRPHMerchantPaymentRequest.getMerchantDetails().getAcquirerId());
        dVar.a("category_code", qRPHMerchantPaymentRequest.getMerchantDetails().getCategoryCode());
        dVar.a("terminal_id", qRPHMerchantPaymentRequest.getMerchantDetails().getTerminalId());
        dVar.a("store_name", qRPHMerchantPaymentRequest.getMerchantDetails().getStoreName());
        dVar.a("city", qRPHMerchantPaymentRequest.getMerchantDetails().getCity());
        dVar.b("additional_info", jSONObject2);
        JSONObject jSONObject3 = (JSONObject) dVar.f1942b;
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("amount", jSONObject);
        } catch (JSONException unused10) {
            yk.a.e();
        }
        try {
            jSONObject4.put("merchant", jSONObject3);
        } catch (JSONException unused11) {
            yk.a.e();
        }
        try {
            jSONObject4.put(SessionDescription.ATTR_TYPE, qRPHMerchantPaymentRequest.getType());
        } catch (JSONException unused12) {
            yk.a.e();
        }
        try {
            jSONObject4.put("qr_payload", qRPHMerchantPaymentRequest.getQrPayload());
        } catch (JSONException unused13) {
            yk.a.e();
        }
        String string = jSONObject4.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        return this.c.createMerchantPayment(RequestBody.create(e, bytes));
    }
}
