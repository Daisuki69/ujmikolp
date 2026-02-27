package L9;

import M8.T2;
import Q9.InterfaceC0578h;
import android.os.Bundle;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.CreditDisbursementCalculatedFees;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditConfirmTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2894b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2895d;

    public /* synthetic */ k(l lVar, String str, String str2, String str3) {
        this.f2893a = lVar;
        this.f2894b = str;
        this.c = str2;
        this.f2895d = str3;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Pair pair = (Pair) obj;
        kotlin.jvm.internal.j.g(pair, "<destruct>");
        Object obj2 = pair.f18160a;
        kotlin.jvm.internal.j.f(obj2, "component1(...)");
        Object obj3 = pair.f18161b;
        kotlin.jvm.internal.j.f(obj3, "component2(...)");
        CreditDisbursementCalculatedFees creditDisbursementCalculatedFees = (CreditDisbursementCalculatedFees) obj3;
        P9.d dVar = (P9.d) this.f2893a.c.get();
        String walletId = ((CustomerAccount) obj2).getOwner().getCustomerId();
        String activityId = this.f2893a.f2900n;
        String str = this.f2894b;
        String str2 = this.c;
        String str3 = this.f2895d;
        MayaCreditTransferFragment mayaCreditTransferFragment = (MayaCreditTransferFragment) dVar;
        mayaCreditTransferFragment.getClass();
        kotlin.jvm.internal.j.g(walletId, "walletId");
        kotlin.jvm.internal.j.g(activityId, "activityId");
        InterfaceC0578h interfaceC0578h = mayaCreditTransferFragment.f13125v0;
        if (interfaceC0578h != null) {
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showConfirmTransferEnhance");
            MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment = new MayaCreditConfirmTransferFragment();
            Bundle bundleE = androidx.media3.datasource.cache.c.e("wallet_id", walletId, "activity_id", activityId);
            bundleE.putString("loan_id", str);
            bundleE.putString("promissory_note_number", str2);
            bundleE.putParcelable("calculated_fees", creditDisbursementCalculatedFees);
            bundleE.putString("recipient", str3);
            mayaCreditConfirmTransferFragment.setArguments(bundleE);
            AbstractC1236z.h((NewMayaCreditActivity) interfaceC0578h, R.id.fragment_container, mayaCreditConfirmTransferFragment);
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        CustomerAccount customerAccount = (CustomerAccount) obj;
        kotlin.jvm.internal.j.g(customerAccount, "customerAccount");
        l lVar = this.f2893a;
        C1264i0 c1264i0 = lVar.e;
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        String customerId = customerAccount.getOwner().getCustomerId();
        double dDoubleValue = com.paymaya.common.utility.C.F(this.f2895d).doubleValue();
        c1264i0.getClass();
        String requestReferenceNo = lVar.f2900n;
        kotlin.jvm.internal.j.g(requestReferenceNo, "requestReferenceNo");
        kotlin.jvm.internal.j.g(customerId, "customerId");
        String str = this.f2894b;
        String str2 = this.c;
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
            jSONObject.put("customerId", customerId);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        try {
            jSONObject.put("loanAccountId", str);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject.put("amount", jSONObject2);
        } catch (JSONException unused5) {
            yk.a.e();
        }
        byte[] bytes = jSONObject.toString().getBytes(Charset.forName("UTF-8"));
        HashMap mapV = T2.v(lowerCase, requestReferenceNo);
        RequestBody.Companion companion = RequestBody.Companion;
        kotlin.jvm.internal.j.d(bytes);
        Ah.p<CreditDisbursementCalculatedFees> pVarCalculateDisbursementFees = c1264i0.c.calculateDisbursementFees(mapV, RequestBody.Companion.create$default(companion, y5.f.f21063a, bytes, 0, 0, 12, (Object) null));
        kotlin.jvm.internal.j.f(pVarCalculateDisbursementFees, "calculateDisbursementFees(...)");
        return new Lh.h(pVarCalculateDisbursementFees, zh.b.a(), 0).d(new G6.u(customerAccount, 11));
    }
}
