package com.paymaya.mayaui.login.view.fragment.impl;

import E5.a;
import Y8.c;
import Z8.i;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import cj.M;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.P;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.dialog.impl.MayaRegistrationSuccessBottomSheetDialogFragment;
import de.m;
import g9.InterfaceC1511f;
import h9.u;
import h9.v;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import y5.e;
import y5.l;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVerifyRegistrationFragment extends MayaAbstractBaseOTPFragmentImpl implements InterfaceC1511f, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public i f12826j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C1229s f12827k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public v f12828l0;

    public static void Y1(MayaVerifyRegistrationFragment mayaVerifyRegistrationFragment, PayMayaError payMayaError, String str, int i) {
        String strMSpiel;
        if ((i & 1) != 0) {
            payMayaError = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        mayaVerifyRegistrationFragment.getClass();
        String strD = AbstractC1213b.d(8);
        j.f(strD, "errorViewed(...)");
        Map mapE = M.e();
        String str2 = (payMayaError == null || (strMSpiel = payMayaError.mSpiel()) == null) ? str : strMSpiel;
        if (mayaVerifyRegistrationFragment.isAdded()) {
            C1229s c1229s = mayaVerifyRegistrationFragment.f12827k0;
            if (c1229s == null) {
                j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = mayaVerifyRegistrationFragment.requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.d(c1229s, fragmentActivityRequireActivity, strD, "Reg Verification Page (OTP)", null, null, str2, mapE, 24);
        }
    }

    public static void Z1(MayaVerifyRegistrationFragment mayaVerifyRegistrationFragment, String str, String str2, String str3) {
        if (mayaVerifyRegistrationFragment.isAdded()) {
            C1229s c1229s = mayaVerifyRegistrationFragment.f12827k0;
            if (c1229s == null) {
                j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = mayaVerifyRegistrationFragment.requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.c(c1229s, fragmentActivityRequireActivity, str, "Reg Verification Page (OTP)", str3, str2, null, null, null, 160);
        }
    }

    @Override // g9.InterfaceC1511f
    public final void E() {
        String string = getString(R.string.maya_error_otp_invalid);
        j.f(string, "getString(...)");
        Y1(this, null, string, 1);
        v vVar = this.f12828l0;
        if (vVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationActivity) vVar).d2(string, new u(this, string, 0));
        }
    }

    @Override // g9.InterfaceC1511f
    public final void F0(String str, String str2) {
        C1220i c1220iO1 = o1();
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(EnumC1215d.VERIFICATION);
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("partner", str);
        map.put("branch", str2);
        map.put("kyc_level", "0");
        c1219h.i();
        c1220iO1.b(c1219h);
    }

    @Override // g9.InterfaceC1511f
    public final void J0() {
        v vVar = this.f12828l0;
        if (vVar != null) {
            MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) vVar;
            mayaRegistrationActivity.n1();
            B5.i.M(mayaRegistrationActivity, "registration_kyc");
        }
    }

    @Override // g9.InterfaceC1511f
    public final void K(String str) {
        J1().setText(Html.fromHtml(getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(str))));
    }

    @Override // g9.InterfaceC1511f
    public final void L0(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        Y1(this, payMayaError, null, 2);
        v vVar = this.f12828l0;
        if (vVar != null) {
            ((MayaRegistrationActivity) vVar).e2(payMayaError, new u(this, strMSpiel, 1));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return W1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void N1() {
        String strO = AbstractC1213b.o(8);
        j.f(strO, "tapped(...)");
        Z1(this, strO, "Help center", "Help center");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void P1() {
        String strO = AbstractC1213b.o(8);
        j.f(strO, "tapped(...)");
        Z1(this, strO, K1().getText().toString(), "Reg Verification Page (OTP)");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void Q1() {
        if (isAdded()) {
            String str = this.f10272i0 ? "autofill by OS" : "manual";
            C1220i c1220iO1 = o1();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            C1219h c1219hE = C1219h.e(AbstractC1213b.g(8));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", "Reg Verification Page (OTP)");
            map.put("input_type", str);
            c1219hE.i();
            c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
        }
        String strO = AbstractC1213b.o(8);
        j.f(strO, "tapped(...)");
        Button button = this.f10260W;
        if (button != null) {
            Z1(this, strO, button.getText().toString(), "Reg Verification Page (OTP)");
        } else {
            j.n("mVerifyButton");
            throw null;
        }
    }

    @Override // g9.InterfaceC1511f
    public final void S(String str) {
        if (isAdded()) {
            C1220i c1220iO1 = o1();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            C1219h c1219hE = C1219h.e("REG_SCREEN_SUCCESS");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", "You're in! Welcome to Maya (Bottom sheet)");
            map.put("cpm_id", str);
            c1219hE.i();
            c1220iO1.c(fragmentActivityRequireActivity, c1219hE);
        }
    }

    public final c W1() {
        i iVar = this.f12826j0;
        if (iVar != null) {
            return iVar;
        }
        j.n("mVerifyRegistrationFragmentPresenter");
        throw null;
    }

    public final void X1(String str, String str2) {
        String strB = AbstractC1213b.b(8);
        j.f(strB, "errorTapped(...)");
        if (isAdded()) {
            C1229s c1229s = this.f12827k0;
            if (c1229s == null) {
                j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            C1229s.c(c1229s, fragmentActivityRequireActivity, strB, "Reg OTP Error (Dialog)", "Reg Verification Page (OTP)", str, null, str2, null, 160);
        }
    }

    @Override // E5.a
    public final void b(String str) {
        ((i) W1()).l(str);
    }

    @Override // g9.InterfaceC1511f
    public final void c1() {
        String string = getString(R.string.maya_error_otp_missing);
        j.f(string, "getString(...)");
        Y1(this, null, string, 1);
        v vVar = this.f12828l0;
        if (vVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationActivity) vVar).d2(string, new u(this, string, 4));
        }
    }

    @Override // g9.InterfaceC1511f
    public final String f1() {
        return AppsFlyerLib.getInstance().getAppsFlyerUID(requireContext());
    }

    @Override // g9.InterfaceC1506a
    public final void g(String str, String str2, String str3) {
        o1().a(str, str2, str3);
    }

    @Override // g9.InterfaceC1511f
    public final void i0(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        Y1(this, payMayaError, null, 2);
        v vVar = this.f12828l0;
        if (vVar != null) {
            getString(R.string.maya_error_title_verification_code);
            j.d(strMSpiel);
            ((MayaRegistrationActivity) vVar).d2(strMSpiel, new u(this, strMSpiel, 3));
        }
    }

    @Override // g9.InterfaceC1511f
    public final void j0(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        Y1(this, payMayaError, null, 2);
        v vVar = this.f12828l0;
        if (vVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationActivity) vVar).e2(payMayaError, new u(this, strMSpiel, 2));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f10266c0 = (B5.i) aVar.f4659D.get();
        this.f12826j0 = new i((com.paymaya.data.preference.a) aVar.e.get(), aVar.J(), aVar.M(), (S5.c) aVar.f4724k.get(), (P) aVar.f4687T.get());
        this.f12827k0 = (C1229s) aVar.f4684R.get();
        this.f10338R = true;
        this.f12828l0 = (v) getActivity();
        ((AbstractC2509a) W1()).h(this);
        this.f10270g0 = false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f12828l0;
        if (obj != null) {
            ((l) obj).W1();
        }
        ((AbstractC2509a) W1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        V1();
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v vVar = this.f12828l0;
        if (vVar != null) {
            ((MayaRegistrationActivity) vVar).Q(this);
        }
        ((i) W1()).k();
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (C.Z(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new m(new com.squareup.wire.internal.a(this, 10), 12));
        }
        ((i) W1()).j();
    }

    @Override // g9.InterfaceC1511f
    public final void r0(String str, String str2) {
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.VERIFICATION;
    }

    @Override // g9.InterfaceC1511f
    public final void x() {
        v vVar = this.f12828l0;
        if (vVar != null) {
            final MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) vVar;
            if (mayaRegistrationActivity.p1().e().isMayaRegistrationSubmitInviteCode()) {
                new MayaRegistrationSuccessBottomSheetDialogFragment().show(mayaRegistrationActivity.getSupportFragmentManager(), "registration_success_dialog");
                return;
            }
            String string = mayaRegistrationActivity.getString(R.string.maya_label_verify_registration_welcome_to_maya_title);
            j.f(string, "getString(...)");
            final int i = 0;
            final int i4 = 1;
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231399, string, mayaRegistrationActivity.getString(R.string.maya_html_verify_registration_welcome_to_maya_spiel), new Pair(mayaRegistrationActivity.getString(R.string.maya_label_upgrade_now), new Function1() { // from class: c9.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            View it = (View) obj;
                            int i6 = MayaRegistrationActivity.f12730r;
                            j.g(it, "it");
                            MayaRegistrationActivity mayaRegistrationActivity2 = mayaRegistrationActivity;
                            C1229s c1229sX1 = mayaRegistrationActivity2.X1();
                            String strO = AbstractC1213b.o(3);
                            j.f(strO, "tapped(...)");
                            String string2 = mayaRegistrationActivity2.getString(R.string.maya_label_upgrade_now);
                            j.f(string2, "getString(...)");
                            C1229s.c(c1229sX1, mayaRegistrationActivity2, strO, "You're in! Welcome to Maya (Bottom sheet)", mayaRegistrationActivity2.getString(R.string.maya_fragment_kyc_initial_loading_screen_label), string2, null, null, null, 224);
                            mayaRegistrationActivity2.n1();
                            B5.i.M(mayaRegistrationActivity2, "registration-ekyc");
                            break;
                        default:
                            View it2 = (View) obj;
                            int i10 = MayaRegistrationActivity.f12730r;
                            j.g(it2, "it");
                            MayaRegistrationActivity mayaRegistrationActivity3 = mayaRegistrationActivity;
                            C1229s c1229sX12 = mayaRegistrationActivity3.X1();
                            String strO2 = AbstractC1213b.o(3);
                            j.f(strO2, "tapped(...)");
                            String string3 = mayaRegistrationActivity3.getString(R.string.maya_label_go_to_home);
                            j.f(string3, "getString(...)");
                            C1229s.c(c1229sX12, mayaRegistrationActivity3, strO2, "You're in! Welcome to Maya (Bottom sheet)", "Dashboard", string3, null, null, null, 224);
                            mayaRegistrationActivity3.n1();
                            B5.i.M(mayaRegistrationActivity3, "dashboard");
                            break;
                    }
                    return Unit.f18162a;
                }
            }), new Pair(mayaRegistrationActivity.getString(R.string.maya_label_go_to_home), new Function1() { // from class: c9.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i4) {
                        case 0:
                            View it = (View) obj;
                            int i6 = MayaRegistrationActivity.f12730r;
                            j.g(it, "it");
                            MayaRegistrationActivity mayaRegistrationActivity2 = mayaRegistrationActivity;
                            C1229s c1229sX1 = mayaRegistrationActivity2.X1();
                            String strO = AbstractC1213b.o(3);
                            j.f(strO, "tapped(...)");
                            String string2 = mayaRegistrationActivity2.getString(R.string.maya_label_upgrade_now);
                            j.f(string2, "getString(...)");
                            C1229s.c(c1229sX1, mayaRegistrationActivity2, strO, "You're in! Welcome to Maya (Bottom sheet)", mayaRegistrationActivity2.getString(R.string.maya_fragment_kyc_initial_loading_screen_label), string2, null, null, null, 224);
                            mayaRegistrationActivity2.n1();
                            B5.i.M(mayaRegistrationActivity2, "registration-ekyc");
                            break;
                        default:
                            View it2 = (View) obj;
                            int i10 = MayaRegistrationActivity.f12730r;
                            j.g(it2, "it");
                            MayaRegistrationActivity mayaRegistrationActivity3 = mayaRegistrationActivity;
                            C1229s c1229sX12 = mayaRegistrationActivity3.X1();
                            String strO2 = AbstractC1213b.o(3);
                            j.f(strO2, "tapped(...)");
                            String string3 = mayaRegistrationActivity3.getString(R.string.maya_label_go_to_home);
                            j.f(string3, "getString(...)");
                            C1229s.c(c1229sX12, mayaRegistrationActivity3, strO2, "You're in! Welcome to Maya (Bottom sheet)", "Dashboard", string3, null, null, null, 224);
                            mayaRegistrationActivity3.n1();
                            B5.i.M(mayaRegistrationActivity3, "dashboard");
                            break;
                    }
                    return Unit.f18162a;
                }
            }), null, 96);
            mayaAlertBottomSheetDialogFragmentN.s1(EnumC1215d.REGISTRATION);
            mayaAlertBottomSheetDialogFragmentN.f11820c0 = EnumC1216e.SUCCESS;
            mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
            mayaAlertBottomSheetDialogFragmentN.show(mayaRegistrationActivity.getSupportFragmentManager(), "alert_dialog");
        }
    }
}
