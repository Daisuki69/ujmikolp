package Q6;

import G6.u;
import Kh.T;
import a.AbstractC0617a;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.ActivityResultLauncher;
import com.appsflyer.AppsFlyerLib;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.plugins.firebase.crashlytics.Constants;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Z8.a {
    public final C1293x0 e;
    public final S0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f5285g;
    public final C1278p0 h;
    public final A5.m i;
    public final S5.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5286k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C1293x0 c1293x0, S0 s02, com.paymaya.data.preference.a mPreference, C1278p0 c1278p0, A5.m mSplitLifecycleHandler, S5.c mFlagConfigurationService) {
        super(c1278p0, mPreference);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mSplitLifecycleHandler, "mSplitLifecycleHandler");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.e = c1293x0;
        this.f = s02;
        this.f5285g = mPreference;
        this.h = c1278p0;
        this.i = mSplitLifecycleHandler;
        this.j = mFlagConfigurationService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r5 = this;
            super.j()
            com.paymaya.data.preference.a r0 = r5.f5285g
            r1 = 0
            r0.X(r1)
            java.lang.ref.WeakReference r0 = r5.c
            java.lang.Object r0 = r0.get()
            X6.f r0 = (X6.f) r0
            com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment r0 = (com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment) r0
            android.app.KeyguardManager r0 = r0.f11937h0
            if (r0 == 0) goto L1f
            boolean r0 = r0.isKeyguardSecure()
            r2 = 1
            if (r0 != r2) goto L1f
            goto L20
        L1f:
            r2 = r1
        L20:
            r0 = 0
            java.lang.String r3 = "mScreenLockButton"
            if (r2 == 0) goto L43
            com.paymaya.data.preference.a r2 = r5.f5285g
            boolean r2 = r2.D()
            if (r2 == 0) goto L43
            java.lang.ref.WeakReference r2 = r5.c
            java.lang.Object r2 = r2.get()
            X6.f r2 = (X6.f) r2
            com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment r2 = (com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment) r2
            android.widget.Button r2 = r2.f11930a0
            if (r2 == 0) goto L3f
            r2.setVisibility(r1)
            goto L56
        L3f:
            kotlin.jvm.internal.j.n(r3)
            throw r0
        L43:
            java.lang.ref.WeakReference r1 = r5.c
            java.lang.Object r1 = r1.get()
            X6.f r1 = (X6.f) r1
            com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment r1 = (com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment) r1
            android.widget.Button r1 = r1.f11930a0
            if (r1 == 0) goto Lbc
            r2 = 8
            r1.setVisibility(r2)
        L56:
            com.paymaya.domain.store.x0 r1 = r5.e
            com.paymaya.domain.model.User r1 = r1.j()
            com.paymaya.domain.store.x0 r2 = r5.e
            com.paymaya.domain.model.Identity r2 = r2.f()
            if (r1 == 0) goto Lb8
            if (r2 != 0) goto L67
            goto Lb8
        L67:
            java.lang.ref.WeakReference r3 = r5.c
            java.lang.Object r3 = r3.get()
            X6.f r3 = (X6.f) r3
            java.lang.String r1 = r1.mFirstName()
            if (r1 != 0) goto L77
            java.lang.String r1 = ""
        L77:
            com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment r3 = (com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment) r3
            r3.getClass()
            android.widget.TextView r3 = r3.f11926W
            if (r3 == 0) goto Lb2
            r3.setText(r1)
            java.lang.String r1 = r2.mValue()
            com.paymaya.data.preference.a r3 = r5.f5285g
            android.content.SharedPreferences r3 = r3.f11330b
            java.lang.String r4 = "key_login_mobile_number"
            androidx.media3.datasource.cache.c.u(r3, r4, r1)
            java.lang.ref.WeakReference r1 = r5.c
            java.lang.Object r1 = r1.get()
            X6.f r1 = (X6.f) r1
            java.lang.String r2 = r2.mValue()
            com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment r1 = (com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment) r1
            r1.f11936g0 = r2
            android.widget.TextView r1 = r1.f11927X
            if (r1 == 0) goto Lac
            java.lang.String r0 = com.paymaya.common.utility.C.p(r2)
            r1.setText(r0)
            return
        Lac:
            java.lang.String r1 = "mLoginIdentityDisplayTextView"
            kotlin.jvm.internal.j.n(r1)
            throw r0
        Lb2:
            java.lang.String r1 = "mDisplayNameTextView"
            kotlin.jvm.internal.j.n(r1)
            throw r0
        Lb8:
            r5.n()
            return
        Lbc:
            kotlin.jvm.internal.j.n(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.o.j():void");
    }

    public final void l() {
        if (((MayaSessionExpiredFragment) ((X6.f) this.c.get())).J1().length() == 0) {
            MayaInputLayout mayaInputLayout = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11928Y;
            if (mayaInputLayout != null) {
                mayaInputLayout.p();
                return;
            } else {
                kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
                throw null;
            }
        }
        String str = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11936g0;
        if (str != null && !C2576A.H(str)) {
            o(false);
            return;
        }
        MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
        Y6.j jVar = mayaSessionExpiredFragment.f11935f0;
        if (jVar != null) {
            ((MayaSessionExpiredActivity) jVar).o(mayaSessionExpiredFragment.getString(R.string.maya_error_title_login), mayaSessionExpiredFragment.getString(R.string.pma_toast_error_missing_mobile_number));
        }
    }

    public final void m() {
        KeyguardManager keyguardManager = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11937h0;
        if (keyguardManager != null && keyguardManager.isKeyguardSecure() && this.f5285g.D()) {
            MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
            if (mayaSessionExpiredFragment.f11941l0) {
                mayaSessionExpiredFragment.f11941l0 = false;
                return;
            }
            if (mayaSessionExpiredFragment.f11940k0) {
                return;
            }
            KeyguardManager keyguardManager2 = mayaSessionExpiredFragment.f11937h0;
            Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager2 != null ? keyguardManager2.createConfirmDeviceCredentialIntent(mayaSessionExpiredFragment.getString(R.string.maya_label_session_expired_screen_lock_dialog_title), mayaSessionExpiredFragment.getString(R.string.maya_label_session_expired_screen_lock_dialog_spiel)) : null;
            if (intentCreateConfirmDeviceCredentialIntent != null) {
                mayaSessionExpiredFragment.startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
            }
            mayaSessionExpiredFragment.f11940k0 = true;
        }
    }

    public final void n() {
        ((MayaBaseFragment) ((X6.f) this.c.get())).E1();
        new Hh.g(new Hh.a(new Hh.f(this.f.b(), zh.b.a(), 0), new m(this, 1), 1), new u(this, 27), Eh.d.c, Eh.d.f1365b).c();
    }

    public final void o(boolean z4) {
        String strR;
        String strJ1;
        this.f5286k = z4;
        ((MayaBaseFragment) ((X6.f) this.c.get())).E1();
        if (z4) {
            com.paymaya.data.preference.a aVar = this.f5285g;
            SharedPreferences sharedPreferences = aVar.f11330b;
            String string = svM7M6.getString(sharedPreferences, "key_username", "");
            String string2 = svM7M6.getString(sharedPreferences, "key_iv_username", "");
            strR = aVar.H() ? Xh.i.j(string, string2) : AbstractC0617a.r(string, string2);
        } else {
            strR = C.r(((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11936g0);
        }
        String str = strR;
        if (z4) {
            com.paymaya.data.preference.a aVar2 = this.f5285g;
            SharedPreferences sharedPreferences2 = aVar2.f11330b;
            String string3 = svM7M6.getString(sharedPreferences2, "key_password", "");
            String string4 = svM7M6.getString(sharedPreferences2, "key_iv_password", "");
            strJ1 = aVar2.H() ? Xh.i.j(string3, string4) : AbstractC0617a.r(string3, string4);
        } else {
            strJ1 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).J1();
        }
        String str2 = strJ1;
        String string5 = svM7M6.getString(this.f5285g.f11330b, "key_device_token", "");
        C1293x0 c1293x0 = this.e;
        MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
        mayaSessionExpiredFragment.getClass();
        new Lh.d(new Lh.d(new Lh.d(new Lh.h(c1293x0.l(str, str2, string5, false, AppsFlyerLib.getInstance().getAppsFlyerUID(mayaSessionExpiredFragment.requireContext()), "SESSION_TIMEOUT"), zh.b.a(), 0), new A3.i(this, z4, 5), 2), new Gb.d(this, 28), 0), new n(this, 0), 1).e();
    }

    public final void p(PayMayaError payMayaError) {
        String str;
        int i = 13;
        final int i4 = 1;
        final int i6 = 0;
        int iMErrorCode = payMayaError.mErrorCode();
        if (iMErrorCode == -20) {
            ((MayaBaseFragment) ((X6.f) this.c.get())).w1();
            if (!this.f5285g.e().isForgotPasswordV2Enabled()) {
                ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).N1(payMayaError);
                return;
            }
            MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
            mayaSessionExpiredFragment.getClass();
            Y6.j jVar = mayaSessionExpiredFragment.f11935f0;
            if (jVar != null) {
                final MayaSessionExpiredActivity mayaSessionExpiredActivity = (MayaSessionExpiredActivity) jVar;
                String strMSpiel = payMayaError.mSpiel();
                if (strMSpiel == null) {
                    strMSpiel = mayaSessionExpiredActivity.getString(R.string.maya_label_error_max_number_password_retries);
                    kotlin.jvm.internal.j.f(strMSpiel, "getString(...)");
                }
                MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231238, mayaSessionExpiredActivity.getString(R.string.maya_label_unable_to_log_you_in), strMSpiel, mayaSessionExpiredActivity.getString(R.string.maya_label_button_reset_my_password), mayaSessionExpiredActivity.getString(R.string.maya_label_got_it), false, null, null, false, 480);
                mayaErrorDialogFragmentZ.f11852e0 = new View.OnClickListener() { // from class: T6.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MayaSessionExpiredActivity mayaSessionExpiredActivity2 = mayaSessionExpiredActivity;
                        switch (i6) {
                            case 0:
                                int i10 = MayaSessionExpiredActivity.f11789v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaSessionExpiredActivity2.n1();
                                    mayaSessionExpiredActivity2.startActivity(new Intent(mayaSessionExpiredActivity2, (Class<?>) MayaForgotPasswordActivity.class));
                                    return;
                                } finally {
                                }
                            default:
                                int i11 = MayaSessionExpiredActivity.f11789v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaSessionExpiredActivity2.n1().x(mayaSessionExpiredActivity2, "https://support.maya.ph/s/article/Account-Verification", Boolean.FALSE, false);
                                    return;
                                } finally {
                                }
                        }
                    }
                };
                mayaErrorDialogFragmentZ.show(mayaSessionExpiredActivity.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -384) {
            MfaMeta metaAsMfaMeta = payMayaError.getMetaAsMfaMeta();
            if (metaAsMfaMeta == null || (str = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11936g0) == null || C2576A.H(str)) {
                return;
            }
            Ah.p pVarA = this.h.a(metaAsMfaMeta.getTransactionType(), metaAsMfaMeta.getChallengeId(), str);
            e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new Cg.c(24, this, metaAsMfaMeta, str), 2), new G6.r(this, 28), i6), new m(this, i6)).e());
            return;
        }
        if (iMErrorCode == -385) {
            ((MayaBaseFragment) ((X6.f) this.c.get())).w1();
            X6.f fVar = (X6.f) this.c.get();
            MfaMeta metaAsMfaMeta2 = payMayaError.getMetaAsMfaMeta();
            kotlin.jvm.internal.j.f(metaAsMfaMeta2, "getMetaAsMfaMeta(...)");
            MayaSessionExpiredFragment mayaSessionExpiredFragment2 = (MayaSessionExpiredFragment) fVar;
            mayaSessionExpiredFragment2.getClass();
            metaAsMfaMeta2.setMobileNumber(mayaSessionExpiredFragment2.f11936g0);
            metaAsMfaMeta2.setSourceScreen("Login Page");
            metaAsMfaMeta2.setSuccessScreen("Dashboard");
            Y6.j jVar2 = mayaSessionExpiredFragment2.f11935f0;
            if (jVar2 != null) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity2 = (MayaSessionExpiredActivity) jVar2;
                mayaSessionExpiredActivity2.f11792p = new N9.f(new C7.f(i, metaAsMfaMeta2, mayaSessionExpiredFragment2), 13);
                mayaSessionExpiredActivity2.n1();
                ActivityResultLauncher activityResultLauncher = mayaSessionExpiredActivity2.f11794r;
                Intent intent = new Intent(mayaSessionExpiredActivity2, (Class<?>) MayaMfaActivity.class);
                intent.putExtra("mfa_meta", metaAsMfaMeta2);
                activityResultLauncher.launch(intent);
                return;
            }
            return;
        }
        if (iMErrorCode == -386) {
            ((MayaBaseFragment) ((X6.f) this.c.get())).w1();
            y5.s sVar = (X6.f) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
            c1219hH.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError.mThrowableMessage());
            c1219hH.i();
            ((MayaBaseFragment) sVar).A1(c1219hH);
            Y6.j jVar3 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11935f0;
            if (jVar3 != null) {
                final MayaSessionExpiredActivity mayaSessionExpiredActivity3 = (MayaSessionExpiredActivity) jVar3;
                M2.b.Z(2131231338, mayaSessionExpiredActivity3.getString(R.string.maya_error_additional_verification), mayaSessionExpiredActivity3.getString(R.string.maya_error_additional_verification_spiel), mayaSessionExpiredActivity3.getString(R.string.maya_label_contact_customer_support), null, false, null, new View.OnClickListener() { // from class: T6.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MayaSessionExpiredActivity mayaSessionExpiredActivity22 = mayaSessionExpiredActivity3;
                        switch (i4) {
                            case 0:
                                int i10 = MayaSessionExpiredActivity.f11789v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaSessionExpiredActivity22.n1();
                                    mayaSessionExpiredActivity22.startActivity(new Intent(mayaSessionExpiredActivity22, (Class<?>) MayaForgotPasswordActivity.class));
                                    return;
                                } finally {
                                }
                            default:
                                int i11 = MayaSessionExpiredActivity.f11789v;
                                Callback.onClick_enter(view);
                                try {
                                    mayaSessionExpiredActivity22.n1().x(mayaSessionExpiredActivity22, "https://support.maya.ph/s/article/Account-Verification", Boolean.FALSE, false);
                                    return;
                                } finally {
                                }
                        }
                    }
                }, false, 96).show(mayaSessionExpiredActivity3.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        if (iMErrorCode == -394 || iMErrorCode == -395) {
            ((MayaBaseFragment) ((X6.f) this.c.get())).w1();
            Y6.j jVar4 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11935f0;
            if (jVar4 != null) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity4 = (MayaSessionExpiredActivity) jVar4;
                M2.b.Z(2131231237, mayaSessionExpiredActivity4.getString(R.string.maya_label_device_fingerprint_block_error_title), null, null, null, false, payMayaError, null, false, 444).show(mayaSessionExpiredActivity4.getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((X6.f) this.c.get())).w1();
        y5.s sVar2 = (X6.f) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        c1219hH2.t(EnumC1217f.LOGIN);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH2.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hH2.f11206k.put(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, payMayaError.mThrowableMessage());
        c1219hH2.i();
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
        if (payMayaError.isNetworkError()) {
            MayaSessionExpiredFragment mayaSessionExpiredFragment3 = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
            mayaSessionExpiredFragment3.getClass();
            Y6.j jVar5 = mayaSessionExpiredFragment3.f11935f0;
            if (jVar5 != null) {
                ((MayaSessionExpiredActivity) jVar5).X1(2131231472, mayaSessionExpiredFragment3.getString(R.string.maya_label_that_didnt_load_right), mayaSessionExpiredFragment3.getString(R.string.maya_label_please_check_your_internet));
                return;
            }
            return;
        }
        if (payMayaError.isDefault()) {
            MayaSessionExpiredFragment mayaSessionExpiredFragment4 = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
            mayaSessionExpiredFragment4.getClass();
            Y6.j jVar6 = mayaSessionExpiredFragment4.f11935f0;
            if (jVar6 != null) {
                ((MayaSessionExpiredActivity) jVar6).X1(2131231238, mayaSessionExpiredFragment4.getString(R.string.maya_label_unable_to_log_you_in), mayaSessionExpiredFragment4.getString(R.string.maya_label_app_error_check_status));
                return;
            }
            return;
        }
        if (payMayaError.mAction() != null) {
            ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).N1(payMayaError);
            return;
        }
        X6.f fVar2 = (X6.f) this.c.get();
        String strMSpiel2 = payMayaError.mSpiel();
        kotlin.jvm.internal.j.f(strMSpiel2, "mSpiel(...)");
        MayaSessionExpiredFragment mayaSessionExpiredFragment5 = (MayaSessionExpiredFragment) fVar2;
        Y6.j jVar7 = mayaSessionExpiredFragment5.f11935f0;
        if (jVar7 != null) {
            ((MayaSessionExpiredActivity) jVar7).X1(2131231238, mayaSessionExpiredFragment5.getString(R.string.maya_label_unable_to_log_you_in), strMSpiel2);
        }
    }

    public final void q(Profile profile, boolean z4) {
        String strMValue;
        kotlin.jvm.internal.j.g(profile, "profile");
        String strMProfileId = profile.mProfileId();
        String strMValue2 = profile.mIdentities().get(0).mValue();
        BackUpIdentity backUpIdentityMBackupIdentity = profile.mBackupIdentity();
        if (backUpIdentityMBackupIdentity == null || !"email".equalsIgnoreCase(backUpIdentityMBackupIdentity.mType())) {
            strMValue = "";
        } else {
            strMValue = backUpIdentityMBackupIdentity.mValue();
            kotlin.jvm.internal.j.f(strMValue, "mValue(...)");
        }
        X6.f fVar = (X6.f) this.c.get();
        kotlin.jvm.internal.j.d(strMProfileId);
        kotlin.jvm.internal.j.d(strMValue2);
        ((MayaSessionExpiredFragment) fVar).o1().a(strMProfileId, strMValue2, strMValue);
        y5.s sVar = (X6.f) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.LOGIN);
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
        X6.f fVar2 = (X6.f) this.c.get();
        String strMId = profile.mAccountType().mId();
        kotlin.jvm.internal.j.f(strMId, "mId(...)");
        MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) fVar2;
        mayaSessionExpiredFragment.getClass();
        mayaSessionExpiredFragment.o1();
        Context context = mayaSessionExpiredFragment.getContext();
        if (!C.e(strMId)) {
            FirebaseAnalytics.getInstance(context).f9742a.zzk(null, "account_type", strMId, false);
        }
        String strJ1 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).J1();
        if (strJ1.length() > 0 && !z4) {
            String str = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11936g0;
            com.paymaya.data.preference.a aVar = this.f5285g;
            if (aVar.D()) {
                aVar.v0(str);
                aVar.i0(strJ1);
            }
        }
        if (!"not_accepted".equalsIgnoreCase(svM7M6.getString(this.f5285g.f11330b, "key_privacy_policy_status", ""))) {
            Y6.j jVar = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11935f0;
            if (jVar != null) {
                ((MayaSessionExpiredActivity) jVar).M0();
                return;
            }
            return;
        }
        if (S5.c.b(this.j, A5.b.f83V0)) {
            Y6.j jVar2 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11935f0;
            if (jVar2 != null) {
                ((MayaSessionExpiredActivity) jVar2).J();
                return;
            }
            return;
        }
        Y6.j jVar3 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11935f0;
        if (jVar3 != null) {
            ((MayaSessionExpiredActivity) jVar3).p();
        }
    }

    public final void r(String challengeId, String transactionType, String identity) {
        kotlin.jvm.internal.j.g(challengeId, "challengeId");
        kotlin.jvm.internal.j.g(transactionType, "transactionType");
        kotlin.jvm.internal.j.g(identity, "identity");
        MayaSessionExpiredFragment mayaSessionExpiredFragment = (MayaSessionExpiredFragment) ((X6.f) this.c.get());
        mayaSessionExpiredFragment.getClass();
        Y6.j jVar = mayaSessionExpiredFragment.f11935f0;
        if (jVar != null) {
            MayaLoginOTPFragment mayaLoginOTPFragment = new MayaLoginOTPFragment();
            Bundle bundleE = androidx.media3.datasource.cache.c.e("mobile_number", identity, "challenge_id", challengeId);
            bundleE.putString("transaction_type", transactionType);
            bundleE.putBoolean("is_from_login", false);
            mayaLoginOTPFragment.setArguments(bundleE);
            AbstractC1236z.i((MayaSessionExpiredActivity) jVar, R.id.fragment_container_layout, mayaLoginOTPFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
        MayaInputLayout mayaInputLayout = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).f11928Y;
        if (mayaInputLayout != null) {
            mayaInputLayout.getInputEditText().setText("");
        } else {
            kotlin.jvm.internal.j.n("mPasswordMayaInputLayout");
            throw null;
        }
    }

    public final void s() {
        X6.f fVar = (X6.f) this.c.get();
        boolean z4 = ((MayaSessionExpiredFragment) ((X6.f) this.c.get())).J1().length() > 0;
        Button button = ((MayaSessionExpiredFragment) fVar).f11932c0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mLoginButton");
            throw null;
        }
    }
}
