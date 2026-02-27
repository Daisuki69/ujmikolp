package com.paymaya.domain.store;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.model.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.RequestBody;
import org.joda.time.Instant;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11346b;
    public com.paymaya.data.preference.a c;

    public final Lh.d a(User user, Identity identity, Identity identity2, List consentList) {
        JSONObject jSONObject;
        com.paymaya.data.preference.a aVar;
        Gb.d dVar;
        String strA;
        com.paymaya.data.preference.a aVar2 = this.c;
        boolean zIsRegistrationMiddleNameEnabled = aVar2.e().isRegistrationMiddleNameEnabled();
        kotlin.jvm.internal.j.g(user, "user");
        kotlin.jvm.internal.j.g(identity, "identity");
        kotlin.jvm.internal.j.g(consentList, "consentList");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(SessionDescription.ATTR_TYPE, identity.mType());
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put("value", identity.mValue());
        } catch (JSONException unused2) {
            yk.a.e();
        }
        if (identity2 != null) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(SessionDescription.ATTR_TYPE, identity2.mType());
            } catch (JSONException unused3) {
                yk.a.e();
            }
            try {
                jSONObject.put("value", identity2.mValue());
            } catch (JSONException unused4) {
                yk.a.e();
            }
        } else {
            jSONObject = null;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator it = consentList.iterator();
        while (it.hasNext()) {
            Consent consent = (Consent) it.next();
            try {
                jSONObject3.put(consent.mID(), Boolean.valueOf(consent.isEnabled()));
            } catch (JSONException unused5) {
                yk.a.e();
            }
        }
        if (zIsRegistrationMiddleNameEnabled) {
            dVar = new Gb.d();
            aVar = aVar2;
            dVar.a("first_name", user.mFirstName());
            dVar.a("last_name", user.mLastName());
            dVar.a("middle_name", user.mMiddleName());
            try {
                ((JSONObject) dVar.f1942b).put("no_middle_name_flag", user.mHasNoMiddleName());
            } catch (JSONException unused6) {
                yk.a.e();
            }
            dVar.a("birth_date", user.mBirthDate());
            dVar.a("password", user.mPassword());
            dVar.a("source", "android");
            dVar.b("identity", jSONObject2);
            dVar.b("backup_identity", jSONObject);
            dVar.b("consent", jSONObject3);
        } else {
            aVar = aVar2;
            dVar = new Gb.d();
            dVar.a("first_name", user.mFirstName());
            dVar.a("last_name", user.mLastName());
            dVar.a("birth_date", user.mBirthDate());
            dVar.a("password", user.mPassword());
            dVar.a("source", "android");
            dVar.b("identity", jSONObject2);
            dVar.b("backup_identity", jSONObject);
            dVar.b("consent", jSONObject3);
        }
        String string = ((JSONObject) dVar.f1942b).toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        byte[] bytes = string.getBytes(C2581c.f21468b);
        kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
        String strB = aVar.B();
        String strI = aVar.i();
        String strG = aVar.g();
        HashMap map = new HashMap();
        char[] cArr = F5.b.f1550a;
        String strValueOf = String.valueOf(Instant.now().getMillis());
        try {
            strA = F5.b.a(strI, We.s.j("android", strValueOf, strB), strG);
        } catch (Exception unused7) {
            yk.a.e();
            strA = null;
        }
        map.put("x-request-timestamp", strValueOf);
        map.put("x-request-token", strA);
        map.put("source", "android");
        Ah.p<Registration> pVarRegister = this.f11346b.register(RequestBody.create(y5.f.f21063a, bytes), map);
        D0 d02 = new D0(this, 0);
        pVarRegister.getClass();
        return new Lh.d(pVarRegister, d02, 2);
    }
}
