package G6;

import Kh.T;
import Q9.J;
import Q9.K;
import Q9.L;
import a.AbstractC0617a;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bj.C1034e;
import c7.C1077a;
import cj.C1132s;
import com.appsflyer.AppsFlyerProperties;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditAgreements;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditContactReferenceResponse;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.CreditUserPreference;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1274n0;
import com.paymaya.domain.store.C1292x;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.C1294y;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1793d = 0;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1794g;
    public final y5.f h;
    public final y5.f i;
    public final y5.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Parcelable f1795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f1796l;
    public Object m;

    public k(com.paymaya.data.preference.a aVar, C1274n0 c1274n0, C1295y0 c1295y0, C1249b c1249b, Uh.d dVar) {
        super(dVar);
        this.f1794g = aVar;
        this.h = c1274n0;
        this.i = c1295y0;
        this.j = c1249b;
        this.e = true;
        this.f = true;
    }

    public static final void k(k kVar, Double d10) {
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
        newMayaCreditSummaryFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.ACCOUNT_SUMMARY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.HOWITWORKS);
        c1219h.i();
        newMayaCreditSummaryFragment.z1(c1219h);
        L l6 = newMayaCreditSummaryFragment.f13311x0;
        if (l6 != null) {
            ((NewMayaCreditActivity) l6).d2(null, null, d10 != null ? d10.doubleValue() : 5.0d);
        }
    }

    public static final void l(k kVar) {
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
        newMayaCreditSummaryFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.ACCOUNT_SUMMARY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.UPDATE_EMAIL);
        c1219h.i();
        newMayaCreditSummaryFragment.z1(c1219h);
        L l6 = newMayaCreditSummaryFragment.f13311x0;
        if (l6 != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) l6;
            LinkedHashSet linkedHashSet = E.f10412a;
            E.a("NewMayaCreditActivity", "showDeepLink: ".concat("paymaya://accountrecovery"));
            newMayaCreditActivity.n1();
            B5.i.k(newMayaCreditActivity, "paymaya://accountrecovery");
        }
    }

    public static String m(String str, CreditApplication creditApplication) {
        return str != null ? new DecimalFormat("#.##").format(Double.parseDouble(str) * ((double) 100)).toString() : creditApplication != null ? new DecimalFormat("#.##").format(creditApplication.getTerm().getFeeRate() * ((double) 100)).toString() : "";
    }

    @Override // y5.AbstractC2509a
    public void j() {
        int i = 0;
        switch (this.f1793d) {
            case 1:
                super.j();
                String strB = i0.b();
                kotlin.jvm.internal.j.f(strB, "getSessionId(...)");
                String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.j.f(string, "toString(...)");
                C1264i0 c1264i0 = (C1264i0) this.f1794g;
                c1264i0.getClass();
                HashMap map = new HashMap();
                map.put("device-id", strB);
                map.put(AppsFlyerProperties.CHANNEL, lowerCase);
                map.put("request-reference-no", string);
                HashMap map2 = new HashMap();
                map2.put("productKey", "MAYA_CREDIT_CONSUMER_LOAN");
                Ah.p<CreditAgreements> eligibilityTermsAndAgreements = c1264i0.c.getEligibilityTermsAndAgreements(map, map2);
                kotlin.jvm.internal.j.f(eligibilityTermsAndAgreements, "getEligibilityTermsAndAgreements(...)");
                e(new T(5, new Lh.d(new Lh.d(new Lh.h(eligibilityTermsAndAgreements, zh.b.a(), 0), new Gb.d(this, 11), 2), new v(this, 13), i), new G7.t(this, 19)).e());
                break;
            default:
                super.j();
                break;
        }
    }

    public String n(String gender) {
        kotlin.jvm.internal.j.g(gender, "gender");
        if (gender.equals("FEMALE")) {
            String string = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_female);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            return string;
        }
        if (!gender.equals("MALE")) {
            return Global.BLANK;
        }
        String string2 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_male);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        return string2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String o(String status) {
        kotlin.jvm.internal.j.g(status, "status");
        switch (status.hashCode()) {
            case -2063534794:
                if (!status.equals("DIVORCED_OR_SEPARATED")) {
                    return Global.BLANK;
                }
                String string = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_divorced);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                return string;
            case -1848936376:
                if (!status.equals("SINGLE")) {
                    return Global.BLANK;
                }
                String string2 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_single);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                return string2;
            case 82588954:
                if (!status.equals("WIDOW")) {
                    return Global.BLANK;
                }
                break;
            case 1557445460:
                if (!status.equals("MARRIED")) {
                    return Global.BLANK;
                }
                String string3 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_married);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                return string3;
            case 2058575673:
                if (!status.equals("WIDOWED")) {
                    return Global.BLANK;
                }
                break;
            default:
                return Global.BLANK;
        }
        String string4 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_windowed);
        kotlin.jvm.internal.j.f(string4, "getString(...)");
        return string4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String p(String relation) {
        kotlin.jvm.internal.j.g(relation, "relation");
        switch (relation.hashCode()) {
            case -2130099352:
                if (!relation.equals("IN_LAW")) {
                    return Global.BLANK;
                }
                String string = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_in_law);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                return string;
            case -1942094678:
                if (!relation.equals("PARENT")) {
                    return Global.BLANK;
                }
                String string2 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_parent);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                return string2;
            case -1842428267:
                if (!relation.equals("SPOUSE")) {
                    return Global.BLANK;
                }
                String string3 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_spouse);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                return string3;
            case -1493388638:
                if (!relation.equals("SIBLING")) {
                    return Global.BLANK;
                }
                String string4 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_sibling);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                return string4;
            case 64093436:
                if (!relation.equals("CHILD")) {
                    return Global.BLANK;
                }
                String string5 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_child);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                return string5;
            case 375047055:
                if (!relation.equals("COLLEAGUE")) {
                    return Global.BLANK;
                }
                String string6 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_colleague);
                kotlin.jvm.internal.j.f(string6, "getString(...)");
                return string6;
            case 880273296:
                if (!relation.equals("GRANDCHILD")) {
                    return Global.BLANK;
                }
                String string7 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_grandchild);
                kotlin.jvm.internal.j.f(string7, "getString(...)");
                return string7;
            case 1884644502:
                if (!relation.equals("GRANDPARENT")) {
                    return Global.BLANK;
                }
                String string8 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_grandparent);
                kotlin.jvm.internal.j.f(string8, "getString(...)");
                return string8;
            case 2082012830:
                if (!relation.equals("FRIEND")) {
                    return Global.BLANK;
                }
                String string9 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).getString(R.string.maya_label_contact_relationship_value_friend);
                kotlin.jvm.internal.j.f(string9, "getString(...)");
                return string9;
            default:
                return Global.BLANK;
        }
    }

    public void q() {
        String loanAccountId;
        int i = 14;
        int i4 = 0;
        CreditResponse creditResponseP1 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).P1();
        CreditApplication creditApplication = creditResponseP1 != null ? creditResponseP1.getCreditApplication() : null;
        if (this.e) {
            ((MayaBaseLoadingFragment) ((P9.n) this.c.get())).O1();
        } else {
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) this.c.get());
            SwipeRefreshLayout swipeRefreshLayout = newMayaCreditSummaryFragment.f13306p0;
            if (swipeRefreshLayout == null) {
                kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                throw null;
            }
            if (!swipeRefreshLayout.isRefreshing()) {
                SwipeRefreshLayout swipeRefreshLayout2 = newMayaCreditSummaryFragment.f13306p0;
                if (swipeRefreshLayout2 == null) {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
                swipeRefreshLayout2.post(new K(newMayaCreditSummaryFragment, 1));
            }
        }
        if (creditApplication == null || (loanAccountId = creditApplication.getLoanAccountId()) == null) {
            loanAccountId = "";
        }
        e(new Lh.d(new Lh.d(new Lh.h(((C1264i0) this.f1794g).b(loanAccountId), zh.b.a(), 0), new r(this, i), 2), new u(this, i), i4).e());
    }

    public void r() {
        K6.f fVar = (K6.f) this.c.get();
        boolean z4 = this.e && this.f;
        Button button = ((MayaCashInCodeFormFragment) fVar).f11657v0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mButtonContinue");
            throw null;
        }
    }

    public void s(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.n nVar = (P9.n) this.c.get();
            Map mapC = cj.L.c(new Pair("product", "mec"));
            ((NewMayaCreditSummaryFragment) nVar).getClass();
            E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public void t(String str) {
        if (((com.paymaya.data.preference.a) this.f1794g).e().isAppEventsV2CashInEnabled()) {
            K6.f fVar = (K6.f) this.c.get();
            LoadUpPartner loadUpPartner = (LoadUpPartner) this.f1795k;
            String strMName = loadUpPartner != null ? loadUpPartner.mName() : null;
            MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) fVar;
            mayaCashInCodeFormFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.j(8));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", str);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            if (strMName != null) {
                c1219hE.j.put("partner", strMName);
            }
            mayaCashInCodeFormFragment.o1().b(c1219hE);
        }
    }

    public void u(CreditAccount creditAccount, CreditApplication creditApplication, String str, CreditContactReferenceResponse creditContactReferenceResponse) {
        J9.b bVar;
        kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
        String formattedLoanAmountValue = creditAccount.getFormattedLoanAmountValue();
        CreditUserPreference userPreference = creditAccount.getScheduleSettings().getUserPreference();
        String strA = AbstractC0617a.A(userPreference != null ? userPreference.getEndDayOfMonth() : 0);
        String strM = m(str, creditApplication);
        BackUpIdentity backUpIdentityA = ((C1265j) this.h).a();
        String strMValue = backUpIdentityA != null ? backUpIdentityA.mValue() : null;
        BackUpIdentity backUpIdentityA2 = ((C1265j) this.h).a();
        CreditReviewUiModel creditReviewUiModel = new CreditReviewUiModel(formattedLoanAmountValue, null, strA, strM, strMValue, backUpIdentityA2 != null ? backUpIdentityA2.isVerifiedEmail() ? J9.d.f2493a : J9.d.f2494b : J9.d.c, creditAccount.getFormatNoteNumberValue(), null, null, null, 0, null, null, null, 1043456);
        if (creditContactReferenceResponse != null) {
            creditReviewUiModel.j = creditContactReferenceResponse.getAlternativeMobileNumber();
            creditReviewUiModel.h = n(creditContactReferenceResponse.getGender());
            creditReviewUiModel.i = o(creditContactReferenceResponse.getMaritalStatus());
            creditReviewUiModel.f13060l = new J9.a(creditContactReferenceResponse.getContactReference().getFirstName(), creditContactReferenceResponse.getContactReference().getLastName(), p(creditContactReferenceResponse.getContactReference().getRelationship()), creditContactReferenceResponse.getContactReference().getMobileNumber());
            bVar = new J9.b(creditContactReferenceResponse.getGender(), creditContactReferenceResponse.getMaritalStatus(), creditContactReferenceResponse.getContactReference().getFirstName(), creditContactReferenceResponse.getContactReference().getLastName(), creditContactReferenceResponse.getContactReference().getRelationship(), creditContactReferenceResponse.getContactReference().getMobileNumber());
        } else {
            bVar = null;
        }
        v(creditReviewUiModel);
        J9.b bVar2 = bVar == null ? new J9.b(null, null, 63) : bVar;
        if (this.f) {
            Group group = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).f13310v0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mGroupContactReference");
                throw null;
            }
            group.setVisibility(8);
        } else {
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) this.c.get());
            newMayaCreditSummaryFragment.getClass();
            b7.f fVar = newMayaCreditSummaryFragment.f13301A0;
            k kVarQ1 = newMayaCreditSummaryFragment.Q1();
            String string = ((NewMayaCreditSummaryFragment) ((P9.n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_first_name);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            String str2 = bVar2.c;
            if (str2 == null) {
                str2 = "";
            }
            C1077a c1077a = new C1077a(string, str2, null, null, null, false, null, 124);
            String string2 = ((NewMayaCreditSummaryFragment) ((P9.n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_last_name);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            String str3 = bVar2.f2490d;
            C1077a c1077a2 = new C1077a(string2, str3 == null ? "" : str3, null, null, null, false, null, 124);
            String string3 = ((NewMayaCreditSummaryFragment) ((P9.n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_relationship);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            String str4 = bVar2.e;
            if (str4 == null) {
                str4 = "";
            }
            C1077a c1077a3 = new C1077a(string3, kVarQ1.p(str4), null, null, null, false, null, 124);
            String string4 = ((NewMayaCreditSummaryFragment) ((P9.n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_number);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            String str5 = bVar2.f;
            if (str5 == null) {
                str5 = "";
            }
            fVar.e(C1132s.g(c1077a, c1077a2, c1077a3, new C1077a(string4, C.p(AbstractC1213b.U("^(63|0)[0-9]{10}$", z.t(C.p0(C2576A.b0(str5).toString()), "+", "")) ? AbstractC1213b.M("^(0)", C.p0(C2576A.b0(str5).toString()), "+63") : null), null, null, null, false, null, 124)));
            Group group2 = newMayaCreditSummaryFragment.f13310v0;
            if (group2 == null) {
                kotlin.jvm.internal.j.n("mGroupContactReference");
                throw null;
            }
            group2.setVisibility(0);
        }
        P9.n nVar = (P9.n) this.c.get();
        if (bVar == null) {
            bVar = new J9.b(null, null, 63);
        }
        ((NewMayaCreditSummaryFragment) nVar).W1(bVar, creditReviewUiModel.j);
        ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).V1(creditReviewUiModel);
        String str6 = creditReviewUiModel.f13058g;
        if (str6 != null) {
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((P9.n) this.c.get());
            newMayaCreditSummaryFragment2.getClass();
            TextView textView = newMayaCreditSummaryFragment2.u0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewAccountNumber");
                throw null;
            }
            textView.setText(str6);
            P9.n nVar2 = (P9.n) this.c.get();
            String name = (String) this.m;
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment3 = (NewMayaCreditSummaryFragment) nVar2;
            newMayaCreditSummaryFragment3.getClass();
            kotlin.jvm.internal.j.g(name, "name");
            TextView textView2 = newMayaCreditSummaryFragment3.t0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mTextViewName");
                throw null;
            }
            textView2.setText(name);
        }
        this.f1795k = creditReviewUiModel;
    }

    public void v(CreditReviewUiModel creditReviewUiModel) {
        String str;
        String str2 = creditReviewUiModel.h;
        if (str2 != null && str2.length() != 0 && (str = creditReviewUiModel.i) != null && str.length() != 0) {
            TextView textView = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).f13309s0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewPersonalDetailsEdit");
                throw null;
            }
            textView.setVisibility(0);
        }
        if (creditReviewUiModel.f13060l != null) {
            TextView textView2 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).f13308r0;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                kotlin.jvm.internal.j.n("mTextViewContactDetailsEdit");
                throw null;
            }
        }
    }

    public void w(CreatePullFunds createPullFunds) {
        K6.f fVar = (K6.f) this.c.get();
        BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) this.f1796l;
        MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) fVar;
        mayaCashInCodeFormFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(14);
        c1219h.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("bank", mayaCashInCodeFormFragment.y0);
        c1219h.i();
        mayaCashInCodeFormFragment.z1(c1219h);
        L6.k kVar = mayaCashInCodeFormFragment.f11658x0;
        if (kVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) kVar;
            MayaBankPullConfirmationFragment mayaBankPullConfirmationFragment = new MayaBankPullConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("createPullFunds", createPullFunds);
            bundle.putParcelable("paymentOption", bankPullPaymentOption);
            mayaBankPullConfirmationFragment.setArguments(bundle);
            AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaBankPullConfirmationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public void x(PayMayaError payMayaError) {
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) ((K6.f) this.c.get());
        mayaCashInCodeFormFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(12);
        c1219h.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219h.j.put("bank", mayaCashInCodeFormFragment.y0);
        c1219h.i();
        mayaCashInCodeFormFragment.z1(c1219h);
        L6.k kVar = mayaCashInCodeFormFragment.f11658x0;
        if (kVar != null) {
            ((MayaCashInActivity) kVar).a(payMayaError, mayaCashInCodeFormFragment.getString(R.string.pma_toast_error_title_money_in_code_error));
        }
    }

    public void y(PayMayaError payMayaError) {
        this.e = true;
        ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).R1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) this.c.get());
        MayaBaseLoadingFragment.N1(newMayaCreditSummaryFragment, 200, newMayaCreditSummaryFragment.getString(R.string.pma_label_cannot_load_maya_credit), null, new J(newMayaCreditSummaryFragment, 3), 28);
    }

    public void z(CreditServiceFee creditServiceFee, CreditAccount creditAccount) {
        kotlin.jvm.internal.j.g(creditServiceFee, "creditServiceFee");
        kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
        this.e = false;
        CreditResponse creditResponseP1 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).P1();
        CreditApplication creditApplication = creditResponseP1 != null ? creditResponseP1.getCreditApplication() : null;
        String feeRate = creditServiceFee.getFeeRate();
        if (C2576A.H(feeRate)) {
            feeRate = null;
        }
        u(creditAccount, creditApplication, feeRate, null);
        CreditResponse creditResponseP12 = ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).P1();
        if (creditResponseP12 != null) {
            creditResponseP12.setCreditAccount(creditAccount);
        }
        ((MayaBaseLoadingFragment) ((P9.n) this.c.get())).L1();
        ((NewMayaCreditSummaryFragment) ((P9.n) this.c.get())).R1();
    }

    public k(C1264i0 c1264i0, C1265j c1265j, C1294y c1294y, C1292x c1292x, C1293x0 c1293x0, S5.c cVar, Uh.d dVar) {
        super(dVar);
        this.f1794g = c1264i0;
        this.h = c1265j;
        this.i = c1294y;
        this.j = c1292x;
        this.e = true;
        this.f1796l = C1034e.b(new Ag.k(this, 27));
        this.f = S5.c.b(cVar, A5.b.f76S);
        String strMFirstName = c1293x0.j().mFirstName();
        strMFirstName = strMFirstName == null ? "" : strMFirstName;
        String strMLastName = c1293x0.j().mLastName();
        this.m = androidx.camera.core.impl.a.j(strMFirstName, Global.BLANK, strMLastName != null ? strMLastName : "");
    }
}
