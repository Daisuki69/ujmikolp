package L9;

import Q9.O;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1132s;
import cj.L;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.K;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLocationPermissionBottomSheetDialogFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import com.paymaya.ui.common.view.activity.impl.TLSProviderPromptActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o1.AbstractC1955a;
import ph.C2070f1;
import u5.AbstractC2302a;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2875d;
    public final S5.c e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y5.f f2876g;
    public final Object h;
    public Object i;

    public I(S0 s02, com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService, A5.m mFlagConfigurationLifecycleHandler, K mDeviceStore) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        kotlin.jvm.internal.j.g(mFlagConfigurationLifecycleHandler, "mFlagConfigurationLifecycleHandler");
        kotlin.jvm.internal.j.g(mDeviceStore, "mDeviceStore");
        this.f2876g = s02;
        this.f2875d = mPreference;
        this.e = mFlagConfigurationService;
        this.h = mFlagConfigurationLifecycleHandler;
        this.i = mDeviceStore;
    }

    public boolean k() {
        String str;
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) this.i;
        if (creditReviewUiModel == null || (str = creditReviewUiModel.j) == null) {
            str = "";
        }
        boolean z4 = str.length() != 0 && AbstractC1213b.U("^(09)[0-9]{9}$", str);
        String strR = this.f2875d.r();
        kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
        boolean zQ = q(str, strR);
        CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) this.i;
        String str2 = creditReviewUiModel2 != null ? creditReviewUiModel2.h : null;
        if (str2 != null && str2.length() != 0) {
            CreditReviewUiModel creditReviewUiModel3 = (CreditReviewUiModel) this.i;
            String str3 = creditReviewUiModel3 != null ? creditReviewUiModel3.i : null;
            if (str3 != null && str3.length() != 0 && z4 && !zQ) {
                return true;
            }
        }
        return false;
    }

    public void l() {
        if (k()) {
            P9.o oVar = (P9.o) this.c.get();
            boolean zK = k();
            Button button = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) oVar).f13321c0;
            if (button != null) {
                button.setEnabled(zK);
            } else {
                kotlin.jvm.internal.j.n("mContinueButton");
                throw null;
            }
        }
    }

    public void m() {
        O o8 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13323e0;
        if (o8 != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) o8;
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showGenderBottomSheet");
            String strD = AbstractC1236z.d(newMayaCreditActivity, MayaChoicesBottomSheetDialogFragment.class);
            String string = newMayaCreditActivity.getString(R.string.maya_label_contact_reference_one_third_gender_hint);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            G6.m mVarX1 = newMayaCreditActivity.X1();
            String string2 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_male);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            String string3 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_sex_female);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            List values = C1132s.g(string2, string3);
            String string4 = newMayaCreditActivity.getString(R.string.maya_label_gender_info_text);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            kotlin.jvm.internal.j.g(values, "values");
            MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = new MayaChoicesBottomSheetDialogFragment();
            Bundle bundleD = androidx.media3.datasource.cache.c.d("title", string);
            bundleD.putStringArrayList("string_values", new ArrayList<>(values));
            bundleD.putBoolean("show_cancel", true);
            bundleD.putInt("truncate_text", -1);
            bundleD.putString("info_desc_text", string4);
            mayaChoicesBottomSheetDialogFragment.setArguments(bundleD);
            mayaChoicesBottomSheetDialogFragment.f11835a0 = R.drawable.maya_bg_color_background_secondary_rounded;
            mayaChoicesBottomSheetDialogFragment.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        }
    }

    public void n() {
        O o8 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13323e0;
        if (o8 != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) o8;
            com.paymaya.common.utility.E.a("NewMayaCreditActivity", "showMaritalStatusBottomSheet");
            String strD = AbstractC1236z.d(newMayaCreditActivity, MayaChoicesBottomSheetDialogFragment.class);
            String string = newMayaCreditActivity.getString(R.string.maya_label_contact_reference_one_third_marital_hint);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            G6.m mVarX1 = newMayaCreditActivity.X1();
            String string2 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_single);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            String string3 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_married);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            String string4 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_divorced);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            String string5 = ((NewMayaCreditActivity) ((M9.d) mVarX1.c.get())).getString(R.string.maya_label_credit_contact_reference_selection_marital_windowed);
            kotlin.jvm.internal.j.f(string5, "getString(...)");
            MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragmentI = Kh.I.i(string, C1132s.g(string2, string3, string4, string5), true);
            mayaChoicesBottomSheetDialogFragmentI.f11835a0 = R.drawable.maya_bg_color_background_secondary_rounded;
            mayaChoicesBottomSheetDialogFragmentI.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        }
    }

    public void o(String str) {
        String strT = zj.z.t(str, Global.BLANK, "");
        if (strT.length() == 0) {
            MayaInputLayout mayaInputLayout = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13315W;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
                throw null;
            }
            mayaInputLayout.f();
            CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) this.i;
            if (creditReviewUiModel != null) {
                creditReviewUiModel.j = "";
                return;
            }
            return;
        }
        boolean z4 = strT.length() != 0 && AbstractC1213b.U("^(09)[0-9]{9}$", strT);
        CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) this.i;
        if (creditReviewUiModel2 != null) {
            creditReviewUiModel2.j = strT;
        }
        if (z4) {
            String strR = this.f2875d.r();
            kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
            if (q(strT, strR)) {
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
                MayaInputLayout mayaInputLayout2 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13315W;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
                    throw null;
                }
                mayaInputLayout2.setHelperErrorText(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getString(R.string.maya_label_alternate_primary_mobile_same_error));
                MayaInputLayout mayaInputLayout3 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13315W;
                if (mayaInputLayout3 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
                    throw null;
                }
                mayaInputLayout3.p();
                Button button = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13321c0;
                if (button != null) {
                    button.setEnabled(false);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mContinueButton");
                    throw null;
                }
            }
        }
        if (z4) {
            MayaInputLayout mayaInputLayout4 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13315W;
            if (mayaInputLayout4 != null) {
                mayaInputLayout4.f();
                return;
            } else {
                kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
                throw null;
            }
        }
        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
        MayaInputLayout mayaInputLayout5 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.f13315W;
        if (mayaInputLayout5 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
            throw null;
        }
        mayaInputLayout5.setHelperErrorText(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getString(R.string.maya_label_credit_activation_mobile_number_error_message));
        MayaInputLayout mayaInputLayout6 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.f13315W;
        if (mayaInputLayout6 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAltMobileNumber");
            throw null;
        }
        mayaInputLayout6.p();
        Button button2 = ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get())).f13321c0;
        if (button2 != null) {
            button2.setEnabled(false);
        } else {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
    }

    public void p() {
        if (qk.i.c) {
            return;
        }
        boolean zB = S5.c.b(this.e, A5.b.f66K);
        yk.a.g("Maya-Dynatrace").getClass();
        C2070f1.b();
        if (!zB) {
            yk.a.g("Maya-Dynatrace").getClass();
            C2070f1.b();
        } else {
            Md.b bVar = (Md.b) this.c.get();
            if (bVar != null) {
                qk.i.B(((LauncherActivity) bVar).getApplication());
            }
        }
    }

    public boolean q(String str, String str2) {
        if (str.length() == 11) {
            return C2576A.M(str, "0").equals(C2576A.M(str2, "+63"));
        }
        return false;
    }

    public void r(String str, String str2) {
        Object objA;
        androidx.camera.core.impl.a.A(this.f2875d.f11330b, "key_is_location_permission_shown", true);
        if (!this.f2875d.f11330b.getBoolean("key_tls_support", true)) {
            LauncherActivity launcherActivity = (LauncherActivity) ((Md.b) this.c.get());
            launcherActivity.f14623n = false;
            launcherActivity.e.getClass();
            Intent intent = new Intent(launcherActivity.getApplicationContext(), (Class<?>) TLSProviderPromptActivity.class);
            intent.setFlags(268468224);
            launcherActivity.startActivity(intent);
            launcherActivity.finish();
            return;
        }
        if (this.f2875d.f11330b.getBoolean("key_data_privacy_shown", false)) {
            ((S0) this.f2876g).a();
        }
        com.paymaya.data.preference.a aVar = this.f2875d;
        aVar.X(false);
        if (aVar.G() && (str == null || C2576A.H(str))) {
            aVar.r0(true);
        }
        String strD = this.e.d(A5.f.f);
        Object updaterConfigDetails = new UpdaterConfigDetails(0, false, null, 7, null);
        try {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = com.paymaya.common.utility.A.f10366a.e(strD, UpdaterConfigDetails.class);
        } catch (Throwable th2) {
            C1037h.a aVar3 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (objA instanceof C1038i) {
            objA = null;
        }
        if (objA != null) {
            updaterConfigDetails = objA;
        }
        UpdaterConfigDetails updaterConfigDetails2 = (UpdaterConfigDetails) updaterConfigDetails;
        boolean z4 = qk.i.A(((LauncherActivity) ((Md.b) this.c.get())).getApplicationContext()) < updaterConfigDetails2.getBuildNumber();
        if (updaterConfigDetails2.isMandatory() && z4) {
            LauncherActivity launcherActivity2 = (LauncherActivity) ((Md.b) this.c.get());
            launcherActivity2.m = "Update App";
            launcherActivity2.e.f.a();
        } else if (com.paymaya.common.utility.C.Y(str)) {
            LauncherActivity launcherActivity3 = (LauncherActivity) ((Md.b) this.c.get());
            launcherActivity3.f14623n = false;
            launcherActivity3.m = "Deep Link";
            launcherActivity3.e.getClass();
            B5.i.k(launcherActivity3, str);
            launcherActivity3.finish();
        } else if (!this.f2875d.f11330b.getBoolean("key_is_session_expired", false)) {
            LauncherActivity launcherActivity4 = (LauncherActivity) ((Md.b) this.c.get());
            launcherActivity4.f14623n = false;
            launcherActivity4.m = "Landing";
            B5.i iVar = launcherActivity4.e;
            String str3 = launcherActivity4.f14622l;
            iVar.getClass();
            Intent intentQ0 = B5.i.q0(launcherActivity4);
            intentQ0.putExtra("source_screen", str3);
            intentQ0.setFlags(268468224);
            launcherActivity4.startActivity(intentQ0);
            launcherActivity4.finish();
        } else if (this.f2875d.E()) {
            LauncherActivity launcherActivity5 = (LauncherActivity) ((Md.b) this.c.get());
            launcherActivity5.f14623n = false;
            launcherActivity5.m = "Session Expired";
            launcherActivity5.e.a();
        } else {
            LauncherActivity launcherActivity6 = (LauncherActivity) ((Md.b) this.c.get());
            B5.i iVar2 = launcherActivity6.e;
            String name = MayaSessionExpiredActivity.class.getName();
            iVar2.getClass();
            Intent intent2 = new Intent(launcherActivity6, (Class<?>) MayaAnimatedFullScreenActivity.class);
            intent2.putExtra("extra_next_activity", name);
            launcherActivity6.startActivity(intent2);
            launcherActivity6.finish();
        }
        if (str2 == null || C2576A.H(str2)) {
            return;
        }
        LauncherActivity launcherActivity7 = (LauncherActivity) ((Md.b) this.c.get());
        launcherActivity7.e.getClass();
        B5.i.f(launcherActivity7, str2);
    }

    public void s(String str, String str2) {
        Md.b bVar = (Md.b) this.c.get();
        if (bVar != null) {
            boolean z4 = AbstractC2302a.f20265a;
            AbstractC2302a.b(((LauncherActivity) bVar).getApplicationContext());
        }
        p();
        if (this.f2875d.F() && !this.f) {
            this.f = true;
            ((K) this.i).c(null, "base-app", "app-launch", null);
        }
        LauncherActivity launcherActivity = (LauncherActivity) ((Md.b) this.c.get());
        launcherActivity.getClass();
        if (AbstractC1955a.u(launcherActivity, "android.permission.ACCESS_FINE_LOCATION") || AbstractC1955a.u(launcherActivity, "android.permission.ACCESS_COARSE_LOCATION") || this.f2875d.f11330b.getBoolean("key_is_location_permission_shown", false) || S5.c.b(this.e, A5.b.f53B1)) {
            r(str, str2);
            return;
        }
        LauncherActivity launcherActivity2 = (LauncherActivity) ((Md.b) this.c.get());
        launcherActivity2.getClass();
        new MayaLocationPermissionBottomSheetDialogFragment().show(launcherActivity2.getSupportFragmentManager(), "location");
    }

    public void t(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.o oVar = (P9.o) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) oVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public void u(String gender) {
        kotlin.jvm.internal.j.g(gender, "gender");
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) this.i;
        if (creditReviewUiModel != null) {
            creditReviewUiModel.h = gender;
        }
        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
        newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getClass();
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13317Y;
        if (mayaAutoCompleteInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutGender");
            throw null;
        }
        mayaAutoCompleteInputLayout.getInputAutoCompleteEditText().setText(gender);
        newMayaCreditUpdatePersonalDetailsContactReferenceFragment.G1().l();
        com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getActivity());
    }

    public void v(String maritalStatus) {
        kotlin.jvm.internal.j.g(maritalStatus, "maritalStatus");
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) this.i;
        if (creditReviewUiModel != null) {
            creditReviewUiModel.i = maritalStatus;
        }
        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
        newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getClass();
        MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13319a0;
        if (mayaAutoCompleteInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutMaritalStatus");
            throw null;
        }
        mayaAutoCompleteInputLayout.getInputAutoCompleteEditText().setText(maritalStatus);
        newMayaCreditUpdatePersonalDetailsContactReferenceFragment.G1().l();
        com.paymaya.common.utility.C.R(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getActivity());
    }

    public void w(PayMayaError payMayaError) {
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        if (payMayaError.isNetworkError()) {
            NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
            O o8 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment.f13323e0;
            if (o8 != null) {
                ((NewMayaCreditActivity) o8).o(newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getString(R.string.maya_label_credit_activation_error_title), newMayaCreditUpdatePersonalDetailsContactReferenceFragment.getString(R.string.maya_label_credit_activation_error_message));
                return;
            }
            return;
        }
        NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment2 = (NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.c.get());
        newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getClass();
        O o10 = newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.f13323e0;
        if (o10 != null) {
            ((NewMayaCreditActivity) o10).o(newMayaCreditUpdatePersonalDetailsContactReferenceFragment2.getString(R.string.maya_label_credit_activation_error_title), payMayaError.mSpiel());
        }
    }

    public I(C1264i0 c1264i0, C1265j c1265j, com.paymaya.data.preference.a aVar, S5.c cVar) {
        this.f2876g = c1264i0;
        this.h = c1265j;
        this.f2875d = aVar;
        this.e = cVar;
        this.i = new CreditReviewUiModel(null, null, null, null, null, J9.d.c, null, null, null, null, 0, null, null, null, 1040351);
    }
}
