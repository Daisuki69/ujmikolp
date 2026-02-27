package com.paymaya.mayaui.regv2.view.fragment.impl;

import E5.a;
import M8.D2;
import Y8.c;
import Z8.i;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import androidx.core.view.KeyEventDispatcher;
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
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.E0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaRegistrationSuccessBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import dOYHB6.tiZVw8.numX49;
import de.m;
import eb.n;
import eb.o;
import g9.InterfaceC1511f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import of.p;
import y5.AbstractC2509a;
import y5.e;
import y5.l;
import z2.d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVerifyRegistrationV2Fragment extends MayaAbstractBaseOTPFragmentImpl implements InterfaceC1511f, a {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public i f13691j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public o f13692k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final D2 f13693l0 = new D2(this, 11);

    public static void Z1(MayaVerifyRegistrationV2Fragment mayaVerifyRegistrationV2Fragment, PayMayaError payMayaError, String str, int i) {
        String strMSpiel;
        if ((i & 1) != 0) {
            payMayaError = null;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        C1220i c1220iO1 = mayaVerifyRegistrationV2Fragment.o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.e(13));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strS = mayaVerifyRegistrationV2Fragment.s();
        HashMap map = c1219hE.j;
        map.put("source_page", strS);
        if (payMayaError != null && (strMSpiel = payMayaError.mSpiel()) != null) {
            str = strMSpiel;
        }
        map.put(Constants.REASON, str);
        map.put("screen_name", "Registration Error (Dialog)");
        map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError != null ? payMayaError.mErrorCode() : -999));
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // g9.InterfaceC1511f
    public final void E() {
        String string = getString(R.string.maya_error_otp_invalid);
        j.f(string, "getString(...)");
        Z1(this, null, string, 1);
        o oVar = this.f13692k0;
        if (oVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationV2Activity) oVar).X1(string, new n(this, string, 3));
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
        o oVar = this.f13692k0;
        if (oVar != null) {
            MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) oVar;
            mayaRegistrationV2Activity.n1();
            B5.i.M(mayaRegistrationV2Activity, "registration_kyc");
        }
    }

    @Override // g9.InterfaceC1511f
    public final void K(String str) {
        J1().setText(Html.fromHtml(getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(str))));
    }

    @Override // g9.InterfaceC1511f
    public final void L0(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        Z1(this, payMayaError, null, 2);
        o oVar = this.f13692k0;
        if (oVar != null) {
            ((MayaRegistrationV2Activity) oVar).Y1(payMayaError, new n(this, strMSpiel, 4));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final e M1() {
        return X1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void N1() {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.p(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strS = s();
        HashMap map = c1219hE.j;
        map.put("source_page", strS);
        map.put("destination_page", "Help center");
        map.put("button", "Help center");
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void P1() {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.p(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strS = s();
        HashMap map = c1219hE.j;
        map.put("source_page", strS);
        map.put("button", K1().getText().toString());
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl
    public final void Q1() {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.p(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strS = s();
        HashMap map = c1219hE.j;
        map.put("source_page", strS);
        Button button = this.f10260W;
        if (button == null) {
            j.n("mVerifyButton");
            throw null;
        }
        map.put("button", button.getText().toString());
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // g9.InterfaceC1511f
    public final void S(String str) {
    }

    public final Ya.a W1() {
        KeyEventDispatcher.Component activity = getActivity();
        Ya.a aVar = activity instanceof Ya.a ? (Ya.a) activity : null;
        return aVar == null ? new Za.a() : aVar;
    }

    public final c X1() {
        i iVar = this.f13691j0;
        if (iVar != null) {
            return iVar;
        }
        j.n("mVerifyRegistrationV2FragmentPresenter");
        throw null;
    }

    public final void Y1(String str, String str2) {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.c(13));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Registration Error (Dialog)");
        map.put("destination_page", s());
        map.put("button", str);
        map.put(Constants.REASON, str2);
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    @Override // E5.a
    public final void b(String str) {
        ((i) X1()).l(str);
    }

    @Override // g9.InterfaceC1511f
    public final void c1() {
        String string = getString(R.string.maya_error_otp_missing);
        j.f(string, "getString(...)");
        Z1(this, null, string, 1);
        o oVar = this.f13692k0;
        if (oVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationV2Activity) oVar).X1(string, new n(this, string, 0));
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
        Z1(this, payMayaError, null, 2);
        o oVar = this.f13692k0;
        if (oVar != null) {
            getString(R.string.maya_error_title_verification_code);
            j.d(strMSpiel);
            ((MayaRegistrationV2Activity) oVar).X1(strMSpiel, new n(this, strMSpiel, 1));
        }
    }

    @Override // g9.InterfaceC1511f
    public final void j0(PayMayaError payMayaError) {
        String strMSpiel = payMayaError.mSpiel();
        Z1(this, payMayaError, null, 2);
        o oVar = this.f13692k0;
        if (oVar != null) {
            getString(R.string.maya_error_title_verification_code);
            ((MayaRegistrationV2Activity) oVar).Y1(payMayaError, new n(this, strMSpiel, 2));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().w().f4755a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f10266c0 = (B5.i) aVar.f4659D.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1293x0 c1293x0J = aVar.J();
        E0 e0M = aVar.M();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        P partnerOnboardingUtils = (P) aVar.f4687T.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(partnerOnboardingUtils, "partnerOnboardingUtils");
        this.f13691j0 = new i(preference, c1293x0J, e0M, flagConfigurationService, partnerOnboardingUtils);
        C1219h c1219hE = C1219h.e(AbstractC1213b.h(11));
        c1219hE.i();
        this.f10337Q = c1219hE;
        this.f10338R = true;
        this.f13692k0 = (o) getActivity();
        ((AbstractC2509a) X1()).h(this);
        this.f10270g0 = false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Object obj = this.f13692k0;
        if (obj != null) {
            ((l) obj).W1();
        }
        ((AbstractC2509a) X1()).i();
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
        o oVar = this.f13692k0;
        if (oVar != null) {
            ((MayaRegistrationV2Activity) oVar).Q(this);
        }
        ((i) X1()).k();
        U1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1(this.f13693l0);
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e(AbstractC1213b.v(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = W1().r().toString();
        HashMap map = c1219hE.j;
        map.put("source_page", string);
        map.put("screen_name", s());
        c1219hE.i();
        c1220iO1.b(c1219hE);
        T1();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        if (p.v(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new m(new com.squareup.wire.internal.a(this, 5), 3));
        }
        ((i) X1()).j();
    }

    @Override // g9.InterfaceC1511f
    public final void r0(String str, String str2) {
        if (isAdded()) {
            C1220i c1220iO1 = o1();
            C1219h c1219hE = C1219h.e("REGV2_SUCCESS");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", "Registration OTP");
            map.put("cpm_id", str);
            map.put("destination_page", str2);
            c1219hE.i();
            c1220iO1.b(c1219hE);
        }
    }

    public final String s() {
        return W1().s().toString();
    }

    @Override // g9.InterfaceC1511f
    public final void x() {
        o oVar = this.f13692k0;
        if (oVar != null) {
            final MayaRegistrationV2Activity mayaRegistrationV2Activity = (MayaRegistrationV2Activity) oVar;
            if (mayaRegistrationV2Activity.p1().e().isMayaRegistrationSubmitInviteCode()) {
                new MayaRegistrationSuccessBottomSheetDialogFragment().show(mayaRegistrationV2Activity.getSupportFragmentManager(), "registration_success_dialog");
                return;
            }
            final int i = 0;
            Pair pair = new Pair(mayaRegistrationV2Activity.getString(R.string.maya_label_upgrade_now), new Function1() { // from class: ab.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String strTnTj78 = numX49.tnTj78("buHb");
                    String strTnTj782 = numX49.tnTj78("buH2");
                    String strTnTj783 = numX49.tnTj78("buHL");
                    String strTnTj784 = numX49.tnTj78("buHr");
                    switch (i) {
                        case 0:
                            int i4 = MayaRegistrationV2Activity.f13663v;
                            j.g((View) obj, strTnTj784);
                            MayaRegistrationV2Activity mayaRegistrationV2Activity2 = mayaRegistrationV2Activity;
                            C1229s c1229s = mayaRegistrationV2Activity2.f13666p;
                            if (c1229s == null) {
                                j.n(strTnTj78);
                                throw null;
                            }
                            String strO = AbstractC1213b.o(3);
                            j.f(strO, strTnTj783);
                            String string = mayaRegistrationV2Activity2.getString(R.string.maya_label_upgrade_now);
                            j.f(string, strTnTj782);
                            C1229s.c(c1229s, mayaRegistrationV2Activity2, strO, numX49.tnTj78("buHu"), mayaRegistrationV2Activity2.getString(R.string.maya_fragment_kyc_initial_loading_screen_label), string, null, null, null, 224);
                            mayaRegistrationV2Activity2.n1();
                            B5.i.M(mayaRegistrationV2Activity2, numX49.tnTj78("buHV"));
                            return Unit.f18162a;
                        default:
                            int i6 = MayaRegistrationV2Activity.f13663v;
                            j.g((View) obj, strTnTj784);
                            MayaRegistrationV2Activity mayaRegistrationV2Activity3 = mayaRegistrationV2Activity;
                            C1229s c1229s2 = mayaRegistrationV2Activity3.f13666p;
                            if (c1229s2 == null) {
                                j.n(strTnTj78);
                                throw null;
                            }
                            String strO2 = AbstractC1213b.o(3);
                            j.f(strO2, strTnTj783);
                            String string2 = mayaRegistrationV2Activity3.getString(R.string.maya_label_go_to_home);
                            j.f(string2, strTnTj782);
                            C1229s.c(c1229s2, mayaRegistrationV2Activity3, strO2, numX49.tnTj78("buHZ"), numX49.tnTj78("buHk"), string2, null, null, null, 224);
                            mayaRegistrationV2Activity3.n1();
                            B5.i.M(mayaRegistrationV2Activity3, numX49.tnTj78("buHB"));
                            return Unit.f18162a;
                    }
                }
            });
            final int i4 = 1;
            Pair pair2 = new Pair(mayaRegistrationV2Activity.getString(R.string.maya_label_go_to_home), new Function1() { // from class: ab.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String strTnTj78 = numX49.tnTj78("buHb");
                    String strTnTj782 = numX49.tnTj78("buH2");
                    String strTnTj783 = numX49.tnTj78("buHL");
                    String strTnTj784 = numX49.tnTj78("buHr");
                    switch (i4) {
                        case 0:
                            int i42 = MayaRegistrationV2Activity.f13663v;
                            j.g((View) obj, strTnTj784);
                            MayaRegistrationV2Activity mayaRegistrationV2Activity2 = mayaRegistrationV2Activity;
                            C1229s c1229s = mayaRegistrationV2Activity2.f13666p;
                            if (c1229s == null) {
                                j.n(strTnTj78);
                                throw null;
                            }
                            String strO = AbstractC1213b.o(3);
                            j.f(strO, strTnTj783);
                            String string = mayaRegistrationV2Activity2.getString(R.string.maya_label_upgrade_now);
                            j.f(string, strTnTj782);
                            C1229s.c(c1229s, mayaRegistrationV2Activity2, strO, numX49.tnTj78("buHu"), mayaRegistrationV2Activity2.getString(R.string.maya_fragment_kyc_initial_loading_screen_label), string, null, null, null, 224);
                            mayaRegistrationV2Activity2.n1();
                            B5.i.M(mayaRegistrationV2Activity2, numX49.tnTj78("buHV"));
                            return Unit.f18162a;
                        default:
                            int i6 = MayaRegistrationV2Activity.f13663v;
                            j.g((View) obj, strTnTj784);
                            MayaRegistrationV2Activity mayaRegistrationV2Activity3 = mayaRegistrationV2Activity;
                            C1229s c1229s2 = mayaRegistrationV2Activity3.f13666p;
                            if (c1229s2 == null) {
                                j.n(strTnTj78);
                                throw null;
                            }
                            String strO2 = AbstractC1213b.o(3);
                            j.f(strO2, strTnTj783);
                            String string2 = mayaRegistrationV2Activity3.getString(R.string.maya_label_go_to_home);
                            j.f(string2, strTnTj782);
                            C1229s.c(c1229s2, mayaRegistrationV2Activity3, strO2, numX49.tnTj78("buHZ"), numX49.tnTj78("buHk"), string2, null, null, null, 224);
                            mayaRegistrationV2Activity3.n1();
                            B5.i.M(mayaRegistrationV2Activity3, numX49.tnTj78("buHB"));
                            return Unit.f18162a;
                    }
                }
            });
            String string = mayaRegistrationV2Activity.getString(R.string.maya_label_verify_registration_welcome_to_maya_title);
            j.f(string, "getString(...)");
            MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = d.n(2131231399, string, mayaRegistrationV2Activity.getString(R.string.maya_html_verify_registration_welcome_to_maya_spiel), pair, pair2, null, 96);
            mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.p1());
            mayaAlertBottomSheetDialogFragmentN.f11820c0 = EnumC1216e.SUCCESS;
            mayaAlertBottomSheetDialogFragmentN.setCancelable(false);
            mayaAlertBottomSheetDialogFragmentN.show(mayaRegistrationV2Activity.getSupportFragmentManager(), "alert_dialog");
        }
    }
}
