package ba;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import cj.M;
import com.google.gson.JsonParseException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Billable;
import com.paymaya.domain.model.BillableWithOtherFields;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.BillsPayRequestDetails;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8624b;

    public /* synthetic */ v(C c, int i) {
        this.f8623a = i;
        this.f8624b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        Map map;
        HashMap map2;
        String strMName;
        switch (this.f8623a) {
            case 0:
                BillerDetails billerDetails = (BillerDetails) obj;
                kotlin.jvm.internal.j.g(billerDetails, numX49.tnTj78("bucH"));
                C c = this.f8624b;
                c.getClass();
                if (kotlin.jvm.internal.j.b(billerDetails.mActive(), Boolean.FALSE)) {
                    ga.e eVar = (ga.e) c.c.get();
                    String strMName2 = billerDetails.mName();
                    if (strMName2 == null) {
                        strMName2 = numX49.tnTj78("bucO");
                    }
                    MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar;
                    mayaPayBillsFormFragment.getClass();
                    ha.w wVar = mayaPayBillsFormFragment.f13419C0;
                    if (wVar != null) {
                        MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) wVar;
                        mayaPayBillsActivity.t1();
                        mayaPayBillsActivity.r1();
                        mayaPayBillsActivity.s1();
                    }
                    mayaPayBillsFormFragment.M1(200, mayaPayBillsFormFragment.getString(R.string.maya_format_error_pay_bills_biller_unavailable_description, strMName2), mayaPayBillsFormFragment.getString(R.string.maya_error_pay_bills_biller_unavailable_title), mayaPayBillsFormFragment.getString(R.string.maya_label_pay_bills_go_to_bills), 2131231347, new ha.q(mayaPayBillsFormFragment, 2));
                    return;
                }
                ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13428M0 = billerDetails;
                ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).Q1().mSlug(billerDetails.mSlug());
                String strMName3 = billerDetails.mName();
                BillableWithOtherFields billableWithOtherFields = null;
                if (strMName3 != null) {
                    MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) ((ga.e) c.c.get());
                    mayaPayBillsFormFragment2.getClass();
                    TextView textView = mayaPayBillsFormFragment2.f13434q0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucQ"));
                        throw null;
                    }
                    textView.setText(strMName3);
                }
                ImageUrlUnfiltered imageUrlUnfilteredMIconUrl = billerDetails.mIconUrl();
                c.x(imageUrlUnfilteredMIconUrl != null ? imageUrlUnfilteredMIconUrl.mAndroidImageUrl() : null);
                c.i.d();
                c.q(billerDetails.mOtherFields());
                c.k(billerDetails.mOtherFields());
                c.p(billerDetails);
                FavoriteDetails favoriteDetails = ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13426K0;
                String strMTemplateJson = favoriteDetails != null ? favoriteDetails.mTemplateJson() : null;
                if (strMTemplateJson != null && !C2576A.H(strMTemplateJson)) {
                    try {
                        BillsPayRequest billsPayRequest = (BillsPayRequest) com.paymaya.common.utility.A.f10366a.e(strMTemplateJson, BillsPayRequest.class);
                        BillsPayRequestDetails billsPayRequestDetailsMBiller = billsPayRequest.mBiller();
                        String strMAccountNumber = billsPayRequestDetailsMBiller != null ? billsPayRequestDetailsMBiller.mAccountNumber() : null;
                        if (strMAccountNumber != null) {
                            ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).V1(strMAccountNumber);
                        }
                        c.u(billsPayRequest.mAmount());
                        c.v(billsPayRequest);
                        if (c.f8560d.e().isBillsPayHandleDeepLinkWithOtherFieldsConfig()) {
                            ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13427L0 = billsPayRequest.mOtherFields();
                        }
                    } catch (JsonParseException e) {
                        e.printStackTrace();
                        yk.a.c();
                    }
                    break;
                }
                Billable billable = (Billable) ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13423G0.getValue();
                if (billable != null) {
                    String accountNumber = billable.getAccountNumber();
                    if (accountNumber != null && !C2576A.H(accountNumber)) {
                        ga.e eVar2 = (ga.e) c.c.get();
                        String accountNumber2 = billable.getAccountNumber();
                        kotlin.jvm.internal.j.f(accountNumber2, numX49.tnTj78("buct"));
                        ((MayaPayBillsFormFragment) eVar2).V1(accountNumber2);
                    }
                    if (billable.getAmount() != null) {
                        ga.e eVar3 = (ga.e) c.c.get();
                        String formattedValue = billable.getAmount().getFormattedValue();
                        kotlin.jvm.internal.j.f(formattedValue, numX49.tnTj78("bucU"));
                        ((MayaPayBillsFormFragment) eVar3).W1(formattedValue);
                    }
                    if (!((Boolean) ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13429O0.getValue()).booleanValue()) {
                        MayaPayBillsFormFragment mayaPayBillsFormFragment3 = (MayaPayBillsFormFragment) ((ga.e) c.c.get());
                        AppCompatEditText appCompatEditText = mayaPayBillsFormFragment3.u0;
                        if (appCompatEditText == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("buc8"));
                            throw null;
                        }
                        appCompatEditText.setEnabled(false);
                        AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment3.f13436s0;
                        if (appCompatEditText2 == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("buce"));
                            throw null;
                        }
                        appCompatEditText2.setEnabled(false);
                        Ci.b bVar = mayaPayBillsFormFragment3.f13417A0;
                        if (bVar != null && (map2 = (HashMap) bVar.f) != null) {
                            Iterator it = map2.entrySet().iterator();
                            while (it.hasNext()) {
                                ((MayaInputLayout) ((Map.Entry) it.next()).getValue()).getInputEditText().setEnabled(false);
                            }
                        }
                    }
                }
                Billable billable2 = (Billable) ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13423G0.getValue();
                if (!c.f8560d.e().isBillsPayHandleBillableWithOtherFields()) {
                    billable2 = null;
                }
                if (billable2 != null) {
                    BillableWithOtherFields billableWithOtherFields2 = (BillableWithOtherFields) billable2;
                    Map<String, String> otherFields = billableWithOtherFields2.getOtherFields();
                    if (otherFields != null && !otherFields.isEmpty()) {
                        billableWithOtherFields = billableWithOtherFields2;
                    }
                    if (billableWithOtherFields != null) {
                        ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13427L0 = billableWithOtherFields.getOtherFields();
                    }
                }
                if (c.f8560d.e().isBillsPayHandleDeepLinkWithOtherFieldsConfig() && (map = ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13427L0) != null && !map.isEmpty()) {
                    BillsPayRequest billsPayRequestBuild = BillsPayRequest.sBuilder().mOtherFields(((MayaPayBillsFormFragment) ((ga.e) c.c.get())).f13427L0).build();
                    kotlin.jvm.internal.j.d(billsPayRequestBuild);
                    c.v(billsPayRequestBuild);
                }
                ((MayaBaseLoadingFragment) ((ga.e) c.c.get())).f10359n0 = true;
                ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).L1();
                c.m(billerDetails);
                return;
            case 1:
                io.reactivex.rxjava3.disposables.b bVar2 = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(bVar2, numX49.tnTj78("bucF"));
                this.f8624b.e(bVar2);
                return;
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucV"));
                PayMayaError payMayaErrorF = this.f8624b.f(th2, true);
                C c10 = this.f8624b;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucS"));
                BillerDetails billerDetails2 = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13428M0;
                if (!c10.f8560d.e().isBillsPayEventsV2Enabled()) {
                    C1219h c1219hH = AbstractC2329d.h(12);
                    c1219hH.t(EnumC1217f.CREATE);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put(numX49.tnTj78("bucj"), strMSpiel);
                    if (billerDetails2 == null || (strMName = billerDetails2.mName()) == null) {
                        strMName = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13421E0;
                    }
                    c1219hH.j.put(numX49.tnTj78("bucd"), strMName);
                    if (c10.z()) {
                        c1219hH.g(numX49.tnTj78("buci"), (String) ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).I0.getValue());
                        c1219hH.g(numX49.tnTj78("bucE"), (String) ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13425J0.getValue());
                        c10.j = true;
                    }
                    ((MayaBaseFragment) ((ga.e) c10.c.get())).A1(c1219hH);
                } else if (billerDetails2 != null) {
                    ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).U1(strMSpiel, M.h(new Pair(EnumC1212a.CATEGORY_SLUG, billerDetails2.mCategorySlug()), new Pair(EnumC1212a.CATEGORY_NAME, billerDetails2.mCategory()), new Pair(EnumC1212a.BILLER_SLUG, billerDetails2.mSlug()), new Pair(EnumC1212a.BILLER_NAME, billerDetails2.mName())), iMErrorCode);
                }
                if (payMayaErrorF.isSessionTimeout()) {
                    return;
                }
                MayaPayBillsFormFragment mayaPayBillsFormFragment4 = (MayaPayBillsFormFragment) ((ga.e) c10.c.get());
                mayaPayBillsFormFragment4.getClass();
                ha.w wVar2 = mayaPayBillsFormFragment4.f13419C0;
                if (wVar2 != null) {
                    ((MayaPayBillsActivity) wVar2).a(payMayaErrorF, mayaPayBillsFormFragment4.getString(R.string.maya_toast_error_title_pay_bills_error));
                    return;
                }
                return;
        }
    }
}
