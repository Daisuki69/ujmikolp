package L9;

import M8.T2;
import Q9.InterfaceC0574d;
import cj.L;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.RiskChallenge;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: L9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0325c extends AbstractC2509a implements K9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S5.c f2881d;
    public final C1264i0 e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f2882g;
    public String h;
    public String i;
    public Double j;

    public C0325c(S5.c cVar, C1264i0 c1264i0, Uh.d dVar) {
        super(dVar);
        this.f2881d = cVar;
        this.e = c1264i0;
    }

    public final void k() {
        int i = 9;
        int i4 = 0;
        String str = this.f2882g;
        if (str == null) {
            return;
        }
        ((MayaBaseFragment) ((P9.b) this.c.get())).E1();
        if (!S5.c.b(this.f2881d, A5.b.f84W)) {
            m();
            return;
        }
        C1264i0 c1264i0 = this.e;
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        String strB = i0.b();
        kotlin.jvm.internal.j.f(strB, "getSessionId(...)");
        c1264i0.getClass();
        HashMap mapV = T2.v(lowerCase, str);
        RequestBody.Companion companion = RequestBody.Companion;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessionId", strB);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("activityId", str);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("productKey", "MAYA_CREDIT_CONSUMER_LOAN");
        } catch (JSONException unused3) {
            yk.a.e();
        }
        byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        kotlin.jvm.internal.j.f(bytes, "buildRiskChallenge(...)");
        Ah.p<RiskChallenge> riskChallenge = c1264i0.c.getRiskChallenge(mapV, RequestBody.Companion.create$default(companion, y5.f.f21063a, bytes, 0, 0, 12, (Object) null));
        kotlin.jvm.internal.j.f(riskChallenge, "getRiskChallenge(...)");
        e(new Lh.d(new Lh.d(new Lh.h(riskChallenge, zh.b.a(), 0), new G6.r(this, i), 2), new G6.u(this, i), i4).e());
    }

    public final void l(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.b bVar = (P9.b) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((MayaCreditConfirmTransferFragment) bVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public final void m() {
        String str;
        String str2;
        Double d10;
        Ah.a aVarSubmitCreditTransfer;
        String str3 = this.f2882g;
        if (str3 == null || (str = this.h) == null || (str2 = this.i) == null || (d10 = this.j) == null) {
            return;
        }
        final double dDoubleValue = d10.doubleValue();
        C1264i0 c1264i0 = this.e;
        c1264i0.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("currency", str2);
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put("value", dDoubleValue);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("loan_account_id", str);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject.put("amount", jSONObject2);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        if (c1264i0.i()) {
            String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            HashMap mapV = T2.v(lowerCase, str3);
            kotlin.jvm.internal.j.d(bytes);
            aVarSubmitCreditTransfer = c1264i0.c.submitCreditTransfer(mapV, C1264i0.g(bytes));
            kotlin.jvm.internal.j.d(aVarSubmitCreditTransfer);
        } else {
            kotlin.jvm.internal.j.d(bytes);
            aVarSubmitCreditTransfer = c1264i0.f11449b.submitCreditTransfer(str3, C1264i0.g(bytes));
            kotlin.jvm.internal.j.d(aVarSubmitCreditTransfer);
        }
        e(new Hh.a(new Hh.f(aVarSubmitCreditTransfer, zh.b.a(), 0).a(new Ch.a() { // from class: L9.b
            @Override // Ch.a
            public final void run() {
                C0325c c0325c = this.f2879a;
                double d11 = dDoubleValue;
                InterfaceC0574d interfaceC0574d = ((MayaCreditConfirmTransferFragment) ((P9.b) c0325c.c.get())).f13110f0;
                if (interfaceC0574d != null) {
                    NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) interfaceC0574d;
                    com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showTransferSuccessBottomDialog");
                    C1220i c1220iK1 = newMayaCreditActivity.k1();
                    C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                    c1219hD.r(EnumC1216e.TRANSFER_PROCESSING);
                    c1219hD.n(20);
                    c1219hD.j();
                    c1220iK1.c(newMayaCreditActivity, c1219hD);
                    String string = newMayaCreditActivity.getString(R.string.maya_label_transfer_to_wallet_credit_success, com.paymaya.common.utility.C.u(Double.valueOf(d11)));
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    z2.d.n(R.drawable.maya_ic_success, string, newMayaCreditActivity.getString(R.string.maya_label_transfer_to_wallet_credit_success_description), new Pair(newMayaCreditActivity.getString(R.string.maya_label_continue), new N9.e(newMayaCreditActivity, 0)), null, null, 112).show(newMayaCreditActivity.getSupportFragmentManager(), "alert_dialog");
                }
            }
        }).b(new Gb.d(this, 6)), new G7.t(this, 14), 1).c());
    }
}
