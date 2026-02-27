package com.paymaya.domain.store;

import M8.T2;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.data.api.CreditApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PersonalDetailsData;
import com.paymaya.domain.model.PersonalDetailsPatchRequest;
import com.paymaya.domain.model.PersonalDetailsPatchResponse;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.paymaya.domain.store.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1264i0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11449b;
    public final CreditApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f11450d;

    public C1264i0(PayMayaClientApi mPayMayaClientApi, CreditApi mCreditApi, S5.c mFlagConfigurationService) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mCreditApi, "mCreditApi");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f11449b = mPayMayaClientApi;
        this.c = mCreditApi;
        this.f11450d = mFlagConfigurationService;
    }

    public static HashMap a(C1264i0 c1264i0) {
        String string = UUID.randomUUID().toString();
        c1264i0.getClass();
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        return T2.v(lowerCase, string);
    }

    public static RequestBody g(byte[] bArr) {
        return RequestBody.Companion.create$default(RequestBody.Companion, y5.f.f21063a, bArr, 0, 0, 12, (Object) null);
    }

    public final Ah.p b(String str) {
        if (!i()) {
            Ah.p<CreditAccount> creditAccount = this.f11449b.getCreditAccount(str);
            kotlin.jvm.internal.j.d(creditAccount);
            return creditAccount;
        }
        Ah.p<CreditAccount> creditAccount2 = this.c.getCreditAccount(a(this), str);
        kotlin.jvm.internal.j.d(creditAccount2);
        return creditAccount2;
    }

    public final Ah.p c(String str, String str2) {
        Ah.p<PersonalDetailsData> personalDetails = this.c.getPersonalDetails(T2.v(str, str2));
        kotlin.jvm.internal.j.f(personalDetails, "getPersonalDetails(...)");
        return personalDetails;
    }

    public final Ah.p d(ContactReferencePatchRequest contactReferencePatchRequest) {
        if (!i()) {
            Ah.p<ContactReferencePatchResponse> pVarPatchContactReference = this.f11449b.patchContactReference(contactReferencePatchRequest);
            kotlin.jvm.internal.j.d(pVarPatchContactReference);
            return pVarPatchContactReference;
        }
        Ah.p<ContactReferencePatchResponse> pVarPatchContactReference2 = this.c.patchContactReference(a(this), contactReferencePatchRequest);
        kotlin.jvm.internal.j.d(pVarPatchContactReference2);
        return pVarPatchContactReference2;
    }

    public final Ah.p e(String str, String str2, PersonalDetailsPatchRequest personalDetailsPatchRequest) {
        Ah.p<PersonalDetailsPatchResponse> pVarPatchPersonalDetails = this.c.patchPersonalDetails(T2.v(str, str2), personalDetailsPatchRequest);
        kotlin.jvm.internal.j.f(pVarPatchPersonalDetails, "patchPersonalDetails(...)");
        return pVarPatchPersonalDetails;
    }

    public final Ah.a f(CreditConsent creditConsent) {
        kotlin.jvm.internal.j.g(creditConsent, "creditConsent");
        String type = creditConsent.getType();
        String version = creditConsent.getVersion();
        String majorVersion = creditConsent.getMajorVersion();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, type);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("version", version);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("major_version", majorVersion);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        jSONArray.put(jSONObject);
        byte[] bytes = jSONArray.toString().getBytes(Charset.forName("UTF-8"));
        if (!i()) {
            kotlin.jvm.internal.j.d(bytes);
            Ah.a aVarPostMayaCreditOptIn = this.f11449b.postMayaCreditOptIn(g(bytes));
            kotlin.jvm.internal.j.d(aVarPostMayaCreditOptIn);
            return aVarPostMayaCreditOptIn;
        }
        HashMap mapA = a(this);
        kotlin.jvm.internal.j.d(bytes);
        Ah.a aVarPostMayaCreditOptIn2 = this.c.postMayaCreditOptIn(mapA, g(bytes));
        kotlin.jvm.internal.j.d(aVarPostMayaCreditOptIn2);
        return aVarPostMayaCreditOptIn2;
    }

    public final Ah.p h(String str, int i, double d10, ArrayList agreementSettings) {
        kotlin.jvm.internal.j.g(agreementSettings, "agreementSettings");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("period_end_day_of_month", i);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put("loan_amount", d10);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(TtmlNode.ATTR_ID, str);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject3.put("user_preference", jSONObject2);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject.put("term", jSONObject3);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        try {
            jSONObject.put("agreements", new JSONArray((Collection) agreementSettings));
        } catch (JSONException unused6) {
            yk.a.e();
        }
        byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        if (!i()) {
            kotlin.jvm.internal.j.d(bytes);
            Ah.p<OTP> pVarSubmitCreditApplication = this.f11449b.submitCreditApplication(g(bytes));
            kotlin.jvm.internal.j.d(pVarSubmitCreditApplication);
            return pVarSubmitCreditApplication;
        }
        HashMap mapA = a(this);
        kotlin.jvm.internal.j.d(bytes);
        Ah.p<OTP> pVarSubmitCreditApplication2 = this.c.submitCreditApplication(mapA, g(bytes));
        kotlin.jvm.internal.j.d(pVarSubmitCreditApplication2);
        return pVarSubmitCreditApplication2;
    }

    public final boolean i() {
        return S5.c.b(this.f11450d, A5.b.f71P);
    }
}
