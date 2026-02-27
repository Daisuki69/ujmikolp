package L9;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import cj.C1132s;
import cj.L;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.CreditTermScheduleSettings;
import com.paymaya.domain.model.MothersMaidenName;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1264i0 f2911d;
    public final C1265j e;
    public final com.paymaya.data.preference.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S5.c f2912g;
    public CreditReviewUiModel h;
    public J9.a i;
    public CreditTerm j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f2913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2914l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f2916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f2917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f2919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final double f2920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2924w;

    public s(C1264i0 c1264i0, C1265j c1265j, com.paymaya.data.preference.a aVar, S5.c cVar, Uh.d dVar) {
        super(dVar);
        this.f2911d = c1264i0;
        this.e = c1265j;
        this.f = aVar;
        this.f2912g = cVar;
        this.h = new CreditReviewUiModel(null, null, null, null, null, J9.d.c, null, null, null, null, 0, null, null, new MothersMaidenName("", "", "", false), 917471);
        this.f2913k = new ArrayList();
        this.f2914l = new ArrayList();
        this.f2920s = 5.0d;
        this.f2924w = true;
    }

    public static final void o(s sVar) {
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) ((P9.j) sVar.c.get());
        Q9.B b8 = newMayaCreditEnhancedActivationFragment.f13196B0;
        if (b8 != null) {
            String string = newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_activation_marital_header);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            jk.b.x(b8, string, C1132s.g(newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_contact_reference_selection_marital_single), newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_contact_reference_selection_marital_married), newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_contact_reference_selection_marital_divorced), newMayaCreditEnhancedActivationFragment.getString(R.string.maya_label_credit_contact_reference_selection_marital_windowed)), newMayaCreditEnhancedActivationFragment.f13200V);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.s.j():void");
    }

    public final boolean k() {
        String str;
        String str2;
        String str3 = this.f2916o;
        boolean zU = str3 != null ? AbstractC1213b.U("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", str3) : false;
        String str4 = this.f2917p;
        boolean z4 = (!(str4 != null && str4.length() != 0 && AbstractC1213b.U("^(09)[0-9]{9}$", str4)) || (str2 = this.f2917p) == null || str2.length() == 0) ? false : true;
        String str5 = this.f2917p;
        if (str5 == null) {
            str5 = "";
        }
        String strR = this.f.r();
        kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
        boolean zP = p(str5, strR);
        String str6 = this.f2918q;
        return this.f2915n != 0 && (str6 != null && str6.length() != 0 && (str = this.f2919r) != null && str.length() != 0 && z4 && !zP) && zU && (this.f2921t && ((!this.f2924w || this.f2922u) && this.f2923v));
    }

    public final void l(Integer num, Integer num2) {
        CreditTermScheduleSettings creditTermScheduleSettings;
        CreditTerm creditTerm = this.j;
        if (creditTerm == null || (creditTermScheduleSettings = creditTerm.getCreditTermScheduleSettings()) == null) {
            return;
        }
        P9.j jVar = (P9.j) this.c.get();
        int iIntValue = num != null ? num.intValue() : this.m;
        int iIntValue2 = num2 != null ? num2.intValue() : this.f2915n;
        NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = (NewMayaCreditEnhancedActivationFragment) jVar;
        newMayaCreditEnhancedActivationFragment.getClass();
        C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment.o1();
        FragmentActivity activity = newMayaCreditEnhancedActivationFragment.getActivity();
        C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment.u1());
        AbstractC1414e.m(c1219hD, EnumC1216e.SELECT_BILL_END_DATE, 20);
        c1220iO1.c(activity, c1219hD);
        com.paymaya.common.utility.C.R(newMayaCreditEnhancedActivationFragment.requireActivity());
        Q9.B b8 = newMayaCreditEnhancedActivationFragment.f13196B0;
        if (b8 != null) {
            Ag.j jVar2 = new Ag.j(newMayaCreditEnhancedActivationFragment, 12);
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) b8;
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showBillingEndDate");
            String strD = AbstractC1236z.d(newMayaCreditActivity, NewMayaCreditBillingEndDateBottomSheetFragment.class);
            NewMayaCreditBillingEndDateBottomSheetFragment newMayaCreditBillingEndDateBottomSheetFragment = new NewMayaCreditBillingEndDateBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("schedule_settings", creditTermScheduleSettings);
            bundle.putInt("selected_id", iIntValue);
            bundle.putInt("selected_day", iIntValue2);
            newMayaCreditBillingEndDateBottomSheetFragment.setArguments(bundle);
            newMayaCreditBillingEndDateBottomSheetFragment.f13178V = jVar2;
            newMayaCreditBillingEndDateBottomSheetFragment.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        }
    }

    public final String m(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        if (upperCase.equals("FEMALE")) {
            String string = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_female);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            return string;
        }
        if (upperCase.equals("MALE")) {
            String string2 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_male);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            return string2;
        }
        String string3 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_agreement_settings_enhanced_gender_placeholder);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        return string3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String n(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2063534794:
                if (upperCase.equals("DIVORCED_OR_SEPARATED")) {
                    String string = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_divorced);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    return string;
                }
                break;
            case -1848936376:
                if (upperCase.equals("SINGLE")) {
                    String string2 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_single);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    return string2;
                }
                break;
            case 79281728:
                if (upperCase.equals("DIVORCED/SEPARATED")) {
                    String string3 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_divorced);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    return string3;
                }
                break;
            case 1557445460:
                if (upperCase.equals("MARRIED")) {
                    String string4 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_married);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    return string4;
                }
                break;
            case 2058575673:
                if (upperCase.equals("WIDOWED")) {
                    String string5 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_windowed);
                    kotlin.jvm.internal.j.f(string5, "getString(...)");
                    return string5;
                }
                break;
        }
        String string6 = ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).getString(R.string.maya_label_agreement_settings_enhanced_marital_placeholder);
        kotlin.jvm.internal.j.f(string6, "getString(...)");
        return string6;
    }

    public final boolean p(String str, String str2) {
        if (str.length() == 11) {
            return C2576A.M(str, "0").equals(C2576A.M(str2, "+63"));
        }
        return false;
    }

    public final void q(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.j jVar = (P9.j) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((NewMayaCreditEnhancedActivationFragment) jVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public final void r(boolean z4) {
        this.f2924w = z4;
        MothersMaidenName mothersMaidenName = this.h.f13065r;
        if (mothersMaidenName != null) {
            mothersMaidenName.setHasNoMiddleName(!z4);
        }
        ((NewMayaCreditEnhancedActivationFragment) ((P9.j) this.c.get())).J1(k());
    }
}
