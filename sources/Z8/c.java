package Z8;

import Ah.p;
import Kh.T;
import Q6.s;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.AppsFlyerLib;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import g9.InterfaceC1507b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import v.AbstractC2329d;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {
    public final com.paymaya.data.preference.a e;
    public final C1293x0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1278p0 f6908g;
    public final S5.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.paymaya.data.preference.a mPreference, C1293x0 c1293x0, C1278p0 c1278p0, S5.c mFlagConfigurationService) {
        super(c1278p0, mPreference);
        j.g(mPreference, "mPreference");
        j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.e = mPreference;
        this.f = c1293x0;
        this.f6908g = c1278p0;
        this.h = mFlagConfigurationService;
    }

    @Override // y5.AbstractC2509a
    public final void h(Object obj) {
        Intent intent;
        Intent intent2;
        InterfaceC1507b view = (InterfaceC1507b) obj;
        j.g(view, "view");
        super.h(view);
        FragmentActivity activity = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).getActivity();
        if (26 == C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
            MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            C1219h c1219hM1 = mayaLoginFragment.m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("from_deep_link", "true");
            FragmentActivity activity2 = mayaLoginFragment.getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.setData(null);
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Bundle arguments;
        Bundle arguments2;
        super.j();
        String strR = this.e.r();
        PayMayaError payMayaError = null;
        if (strR != null && !C2576A.H(strR)) {
            if (z.w(strR, 2, "+63", false)) {
                strR = z.t(strR, "+63", "");
            }
            MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment.getClass();
            MayaInputLayout mayaInputLayout = mayaLoginFragment.f12777W;
            if (mayaInputLayout == null) {
                j.n("mMobileNumberMayaInputLayout");
                throw null;
            }
            mayaInputLayout.getInputEditText().setText(strR);
            MayaInputLayout mayaInputLayout2 = mayaLoginFragment.f12777W;
            if (mayaInputLayout2 == null) {
                j.n("mMobileNumberMayaInputLayout");
                throw null;
            }
            mayaInputLayout2.getInputEditText().setSelection(strR.length());
            mayaLoginFragment.f12785e0 = true;
            mayaLoginFragment.f12786f0 = true;
        }
        MayaLoginFragment mayaLoginFragment2 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
        if (((mayaLoginFragment2.getArguments() == null || (arguments2 = mayaLoginFragment2.getArguments()) == null) ? null : (PayMayaError) arguments2.getParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR)) != null) {
            InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.c.get();
            MayaLoginFragment mayaLoginFragment3 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            if (mayaLoginFragment3.getArguments() != null && (arguments = mayaLoginFragment3.getArguments()) != null) {
                payMayaError = (PayMayaError) arguments.getParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            }
            ((MayaLoginFragment) interfaceC1507b).Q1(payMayaError);
            Bundle arguments3 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).getArguments();
            if (arguments3 != null) {
                arguments3.remove(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
                arguments3.remove("title");
            }
        }
    }

    public final void l() {
        if (S5.c.b(this.h, A5.b.f83V0)) {
            h9.j jVar = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
            if (jVar != null) {
                ((MayaLoginActivity) jVar).J();
                return;
            }
            return;
        }
        h9.j jVar2 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
        if (jVar2 != null) {
            ((MayaLoginActivity) jVar2).p();
        }
    }

    public final void m(boolean z4, boolean z5) {
        this.e.T(z4);
        if (z4) {
            p();
        }
        ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).I1();
        if (!z5) {
            l();
            return;
        }
        h9.j jVar = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
        if (jVar != null) {
            ((MayaLoginActivity) jVar).M0();
        }
    }

    public final void n(String challengeId, String transactionType, boolean z4) {
        j.g(challengeId, "challengeId");
        j.g(transactionType, "transactionType");
        this.e.T(z4);
        String strR = C.r(((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).L1());
        if (z4) {
            p();
        }
        ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).I1();
        InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.c.get();
        j.d(strR);
        ((MayaLoginFragment) interfaceC1507b).N1(strR, challengeId, transactionType);
    }

    public final void o() {
        boolean z4;
        boolean z5 = false;
        if (C2576A.H(((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).K1())) {
            MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            TextView textView = mayaLoginFragment.f12778X;
            if (textView == null) {
                j.n("mMobileNumberHelperErrorTextView");
                throw null;
            }
            textView.setVisibility(0);
            MayaInputLayout mayaInputLayout = mayaLoginFragment.f12777W;
            if (mayaInputLayout == null) {
                j.n("mMobileNumberMayaInputLayout");
                throw null;
            }
            mayaInputLayout.p();
            z4 = false;
        } else {
            z4 = true;
        }
        if (((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).M1().length() == 0) {
            MayaInputLayout mayaInputLayout2 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12779Y;
            if (mayaInputLayout2 == null) {
                j.n("mPasswordMayaInputLayout");
                throw null;
            }
            mayaInputLayout2.p();
        } else {
            z5 = z4;
        }
        if (z5) {
            ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).E1();
            String strR = C.r(((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).L1());
            String strM1 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).M1();
            String string = svM7M6.getString(this.e.f11330b, "key_device_token", "");
            androidx.media3.datasource.cache.c.u(this.e.f11330b, "key_login_mobile_number", strR);
            C1293x0 c1293x0 = this.f;
            MayaLoginFragment mayaLoginFragment2 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment2.getClass();
            new Lh.d(new Lh.d(new Lh.h(c1293x0.l(strR, strM1, string, true, AppsFlyerLib.getInstance().getAppsFlyerUID(mayaLoginFragment2.requireContext()), "LOGIN"), zh.b.a(), 0), new s(this, 17), 2), new b(this, strR, 0), 0).e();
        }
    }

    public final void p() {
        String strR = C.r(((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).L1());
        String strM1 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).M1();
        this.e.v0(strR);
        this.e.h0(strR);
        this.e.i0(strM1);
    }

    public final void q(PayMayaError payMayaError, String mobileNumber) {
        final int i = 0;
        final int i4 = 1;
        j.g(mobileNumber, "mobileNumber");
        int iMErrorCode = payMayaError.mErrorCode();
        if (iMErrorCode == -20) {
            ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).w1();
            if (!this.e.e().isForgotPasswordV2Enabled()) {
                ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).Q1(payMayaError);
                return;
            }
            MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment.getClass();
            h9.j jVar = mayaLoginFragment.f12788h0;
            if (jVar != null) {
                final MayaLoginActivity mayaLoginActivity = (MayaLoginActivity) jVar;
                String strMSpiel = payMayaError.mSpiel();
                if (strMSpiel == null) {
                    strMSpiel = mayaLoginActivity.getString(R.string.maya_label_error_max_number_password_retries);
                    j.f(strMSpiel, "getString(...)");
                }
                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231238, mayaLoginActivity.getString(R.string.maya_label_unable_to_log_you_in), strMSpiel, mayaLoginActivity.getString(R.string.maya_label_button_reset_my_password), mayaLoginActivity.getString(R.string.maya_label_got_it), false, null, null, false, 480);
                mayaErrorDialogFragmentZ.f11852e0 = new View.OnClickListener() { // from class: c9.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MayaLoginActivity mayaLoginActivity2 = mayaLoginActivity;
                        switch (i4) {
                            case 0:
                                int i6 = MayaLoginActivity.f12721v;
                                Callback.onClick_enter(view);
                                try {
                                    C1220i c1220iK1 = mayaLoginActivity2.k1();
                                    C1219h c1219hD = C1219h.d(EnumC1215d.FACE_AUTH_FAIL);
                                    c1219hD.n(17);
                                    c1219hD.t(EnumC1217f.CONTACT);
                                    c1220iK1.c(mayaLoginActivity2, c1219hD);
                                    mayaLoginActivity2.n1().x(mayaLoginActivity2, "https://support.maya.ph/s/article/Account-Verification", Boolean.FALSE, false);
                                    return;
                                } finally {
                                }
                            default:
                                int i10 = MayaLoginActivity.f12721v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaLoginActivity2.n1();
                                    mayaLoginActivity2.startActivity(new Intent(mayaLoginActivity2, (Class<?>) MayaForgotPasswordActivity.class));
                                    return;
                                } finally {
                                }
                        }
                    }
                };
                mayaErrorDialogFragmentZ.show(mayaLoginActivity.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -384) {
            MfaMeta metaAsMfaMeta = payMayaError.getMetaAsMfaMeta();
            if (metaAsMfaMeta != null) {
                p pVarA = this.f6908g.a(metaAsMfaMeta.getTransactionType(), metaAsMfaMeta.getChallengeId(), mobileNumber);
                e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new U8.c(8, this, metaAsMfaMeta, mobileNumber), 2), new Qd.a(this, 17), i), new Xa.c(this, 10)).e());
                return;
            }
            return;
        }
        if (iMErrorCode == -385) {
            ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).w1();
            InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.c.get();
            MfaMeta metaAsMfaMeta2 = payMayaError.getMetaAsMfaMeta();
            j.f(metaAsMfaMeta2, "getMetaAsMfaMeta(...)");
            MayaLoginFragment mayaLoginFragment2 = (MayaLoginFragment) interfaceC1507b;
            mayaLoginFragment2.getClass();
            metaAsMfaMeta2.setMobileNumber(mayaLoginFragment2.L1());
            metaAsMfaMeta2.setSourceScreen("Login Page");
            metaAsMfaMeta2.setSuccessScreen("Dashboard");
            h9.j jVar2 = mayaLoginFragment2.f12788h0;
            if (jVar2 != null) {
                MayaLoginActivity mayaLoginActivity2 = (MayaLoginActivity) jVar2;
                mayaLoginActivity2.f12724p = new N9.f(new C7.f(18, metaAsMfaMeta2, mayaLoginFragment2), 25);
                mayaLoginActivity2.n1();
                ActivityResultLauncher activityResultLauncher = mayaLoginActivity2.f12726r;
                Intent intent = new Intent(mayaLoginActivity2, (Class<?>) MayaMfaActivity.class);
                intent.putExtra("mfa_meta", metaAsMfaMeta2);
                activityResultLauncher.launch(intent);
                return;
            }
            return;
        }
        if (iMErrorCode == -386) {
            ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).w1();
            y5.s sVar = (InterfaceC1507b) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
            c1219hH.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError.mThrowableMessage());
            c1219hH.i();
            ((MayaBaseFragment) sVar).A1(c1219hH);
            h9.j jVar3 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
            if (jVar3 != null) {
                final MayaLoginActivity mayaLoginActivity3 = (MayaLoginActivity) jVar3;
                MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231338, mayaLoginActivity3.getString(R.string.maya_error_additional_verification), mayaLoginActivity3.getString(R.string.maya_error_additional_verification_spiel), mayaLoginActivity3.getString(R.string.maya_label_contact_customer_support), null, false, null, new View.OnClickListener() { // from class: c9.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MayaLoginActivity mayaLoginActivity22 = mayaLoginActivity3;
                        switch (i) {
                            case 0:
                                int i6 = MayaLoginActivity.f12721v;
                                Callback.onClick_enter(view);
                                try {
                                    C1220i c1220iK1 = mayaLoginActivity22.k1();
                                    C1219h c1219hD = C1219h.d(EnumC1215d.FACE_AUTH_FAIL);
                                    c1219hD.n(17);
                                    c1219hD.t(EnumC1217f.CONTACT);
                                    c1220iK1.c(mayaLoginActivity22, c1219hD);
                                    mayaLoginActivity22.n1().x(mayaLoginActivity22, "https://support.maya.ph/s/article/Account-Verification", Boolean.FALSE, false);
                                    return;
                                } finally {
                                }
                            default:
                                int i10 = MayaLoginActivity.f12721v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaLoginActivity22.n1();
                                    mayaLoginActivity22.startActivity(new Intent(mayaLoginActivity22, (Class<?>) MayaForgotPasswordActivity.class));
                                    return;
                                } finally {
                                }
                        }
                    }
                }, false, 96);
                EnumC1215d enumC1215d = EnumC1215d.FACE_AUTH_FAIL;
                mayaErrorDialogFragmentZ2.f11845X = true;
                mayaErrorDialogFragmentZ2.f11846Y = enumC1215d;
                mayaErrorDialogFragmentZ2.f11850c0 = new Y.e(16, mayaErrorDialogFragmentZ2, mayaLoginActivity3);
                mayaErrorDialogFragmentZ2.show(mayaLoginActivity3.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -394 || iMErrorCode == -395) {
            ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).w1();
            h9.j jVar4 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
            if (jVar4 != null) {
                MayaLoginActivity mayaLoginActivity4 = (MayaLoginActivity) jVar4;
                M2.b.Z(2131231237, mayaLoginActivity4.getString(R.string.maya_label_device_fingerprint_block_error_title), null, null, null, false, payMayaError, null, false, 444).show(mayaLoginActivity4.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((InterfaceC1507b) this.c.get())).w1();
        y5.s sVar2 = (InterfaceC1507b) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH2.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hH2.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError.mThrowableMessage());
        c1219hH2.i();
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
        if (payMayaError.isNetworkError()) {
            MayaLoginFragment mayaLoginFragment3 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment3.getClass();
            h9.j jVar5 = mayaLoginFragment3.f12788h0;
            if (jVar5 != null) {
                ((MayaLoginActivity) jVar5).X1(2131231472, mayaLoginFragment3.getString(R.string.maya_label_that_didnt_load_right), mayaLoginFragment3.getString(R.string.maya_label_please_check_your_internet));
                return;
            }
            return;
        }
        if (payMayaError.isDefault()) {
            MayaLoginFragment mayaLoginFragment4 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment4.getClass();
            h9.j jVar6 = mayaLoginFragment4.f12788h0;
            if (jVar6 != null) {
                ((MayaLoginActivity) jVar6).X1(2131231238, mayaLoginFragment4.getString(R.string.maya_label_unable_to_log_you_in), mayaLoginFragment4.getString(R.string.maya_label_app_error_check_status));
                return;
            }
            return;
        }
        if (payMayaError.mAction() != null) {
            ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).Q1(payMayaError);
            return;
        }
        InterfaceC1507b interfaceC1507b2 = (InterfaceC1507b) this.c.get();
        String strMSpiel2 = payMayaError.mSpiel();
        j.f(strMSpiel2, "mSpiel(...)");
        MayaLoginFragment mayaLoginFragment5 = (MayaLoginFragment) interfaceC1507b2;
        h9.j jVar7 = mayaLoginFragment5.f12788h0;
        if (jVar7 != null) {
            ((MayaLoginActivity) jVar7).X1(2131231238, mayaLoginFragment5.getString(R.string.maya_label_unable_to_log_you_in), strMSpiel2);
        }
    }

    public final void r(Profile profile) {
        String strMValue;
        j.g(profile, "profile");
        String strMProfileId = profile.mProfileId();
        String strMValue2 = profile.mIdentities().get(0).mValue();
        BackUpIdentity backUpIdentityMBackupIdentity = profile.mBackupIdentity();
        final boolean z4 = true;
        if (backUpIdentityMBackupIdentity == null || !z.o(backUpIdentityMBackupIdentity.mType(), "email", true)) {
            strMValue = "";
        } else {
            strMValue = backUpIdentityMBackupIdentity.mValue();
            j.f(strMValue, "mValue(...)");
        }
        InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.c.get();
        j.d(strMProfileId);
        j.d(strMValue2);
        ((MayaLoginFragment) interfaceC1507b).o1().a(strMProfileId, strMValue2, strMValue);
        y5.s sVar = (InterfaceC1507b) this.c.get();
        C1219h c1219h = new C1219h();
        c1219h.n(14);
        c1219h.i();
        ((MayaBaseFragment) sVar).A1(c1219h);
        InterfaceC1507b interfaceC1507b2 = (InterfaceC1507b) this.c.get();
        String strMId = profile.mAccountType().mId();
        MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) interfaceC1507b2;
        mayaLoginFragment.o1();
        Context context = mayaLoginFragment.getContext();
        if (!C.e(strMId)) {
            FirebaseAnalytics.getInstance(context).f9742a.zzk(null, "account_type", strMId, false);
        }
        if ("not_accepted".equalsIgnoreCase(svM7M6.getString(this.e.f11330b, "key_privacy_policy_status", ""))) {
            KeyguardManager keyguardManager = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12787g0;
            if (!(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false)) {
                l();
                ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).I1();
                return;
            }
            final MayaLoginFragment mayaLoginFragment2 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
            mayaLoginFragment2.getClass();
            final int i = 0;
            final int i4 = 1;
            mayaLoginFragment2.R1(new Function0() { // from class: h9.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            mayaLoginFragment2.J1().m(true, z);
                            break;
                        default:
                            mayaLoginFragment2.J1().m(false, z);
                            break;
                    }
                    return Unit.f18162a;
                }
            }, new Function0() { // from class: h9.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            mayaLoginFragment2.J1().m(true, z);
                            break;
                        default:
                            mayaLoginFragment2.J1().m(false, z);
                            break;
                    }
                    return Unit.f18162a;
                }
            });
            return;
        }
        KeyguardManager keyguardManager2 = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12787g0;
        if (!(keyguardManager2 != null ? keyguardManager2.isKeyguardSecure() : false)) {
            h9.j jVar = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12788h0;
            if (jVar != null) {
                ((MayaLoginActivity) jVar).M0();
            }
            ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).I1();
            return;
        }
        final MayaLoginFragment mayaLoginFragment3 = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
        mayaLoginFragment3.getClass();
        final int i6 = 0;
        final int i10 = 1;
        mayaLoginFragment3.R1(new Function0() { // from class: h9.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        mayaLoginFragment3.J1().m(true, z4);
                        break;
                    default:
                        mayaLoginFragment3.J1().m(false, z4);
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function0() { // from class: h9.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        mayaLoginFragment3.J1().m(true, z4);
                        break;
                    default:
                        mayaLoginFragment3.J1().m(false, z4);
                        break;
                }
                return Unit.f18162a;
            }
        });
    }

    public final void s(final String challengeId, final String transactionType, String mobileNumber) {
        j.g(challengeId, "challengeId");
        j.g(transactionType, "transactionType");
        j.g(mobileNumber, "mobileNumber");
        KeyguardManager keyguardManager = ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).f12787g0;
        if (!(keyguardManager != null ? keyguardManager.isKeyguardSecure() : false)) {
            ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).N1(mobileNumber, challengeId, transactionType);
            ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).I1();
            return;
        }
        final MayaLoginFragment mayaLoginFragment = (MayaLoginFragment) ((InterfaceC1507b) this.c.get());
        mayaLoginFragment.getClass();
        final int i = 0;
        final int i4 = 1;
        mayaLoginFragment.R1(new Function0() { // from class: h9.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        mayaLoginFragment.J1().n(challengeId, transactionType, true);
                        break;
                    default:
                        mayaLoginFragment.J1().n(challengeId, transactionType, false);
                        break;
                }
                return Unit.f18162a;
            }
        }, new Function0() { // from class: h9.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        mayaLoginFragment.J1().n(challengeId, transactionType, true);
                        break;
                    default:
                        mayaLoginFragment.J1().n(challengeId, transactionType, false);
                        break;
                }
                return Unit.f18162a;
            }
        });
    }

    public final void t() {
        InterfaceC1507b interfaceC1507b = (InterfaceC1507b) this.c.get();
        boolean z4 = !C2576A.H(((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).K1()) && ((MayaLoginFragment) ((InterfaceC1507b) this.c.get())).M1().length() > 0;
        Button button = ((MayaLoginFragment) interfaceC1507b).f12781a0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
