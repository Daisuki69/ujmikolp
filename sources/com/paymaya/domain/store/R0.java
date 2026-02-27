package com.paymaya.domain.store;

import android.webkit.CookieManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.appsflyer.AppsFlyerLib;
import com.dynatrace.android.agent.Dynatrace;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paymaya.common.utility.EnumC1212a;
import java.nio.charset.Charset;
import java.util.HashMap;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import ph.C2070f1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class R0 implements Ch.a, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S0 f11385a;

    public /* synthetic */ R0(S0 s02) {
        this.f11385a = s02;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        S0 s02 = this.f11385a;
        s02.getClass();
        if (!task.isSuccessful() || com.paymaya.common.utility.C.e((String) task.getResult())) {
            task.getException();
            yk.a.d();
            return;
        }
        String str = (String) task.getResult();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, "gcm");
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("push_token", str);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        s02.f.deleteFcmToken(RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8")))).c();
    }

    @Override // Ch.a
    public void run() {
        S0 s02 = this.f11385a;
        s02.getClass();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        s02.a();
        FirebaseAnalytics.getInstance(s02.c.c).f9742a.zzo(null);
        if (s02.h.a(A5.b.f66K)) {
            if (qk.i.c) {
                Dynatrace.endVisit();
                yk.a.g("Maya-Dynatrace").getClass();
                C2070f1.b();
            } else {
                yk.a.g("Maya-Dynatrace").getClass();
                C2070f1.b();
            }
        }
        AppsFlyerLib.getInstance().setCustomerUserId(null);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        ((HashMap) Cg.c.k().f769d).remove("lifestyle_id");
        A5.m mVar = s02.f11389g;
        mVar.getClass();
        mVar.a(true);
        mVar.f178d = false;
        yk.a.a();
    }
}
