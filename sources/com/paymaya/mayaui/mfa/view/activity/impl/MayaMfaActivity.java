package com.paymaya.mayaui.mfa.view.activity.impl;

import A7.j;
import B5.i;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import a.AbstractC0617a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.H;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaFaceVerificationBottomSheetDialogFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import dj.C1407e;
import f9.InterfaceC1476c;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import pg.C2038a;
import v9.a;
import w9.g;
import w9.h;
import w9.m;
import y5.l;
import y9.b;
import y9.c;
import y9.f;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaMfaActivity extends l implements a, b, c, f, InterfaceC1476c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f12926w = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f12927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f12928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MFAChallengeInformationV2 f12929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MfaMeta f12930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f12931r = numX49.tnTj78("bjeP");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f12932s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1229s f12933t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActivityResultLauncher f12934u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ActivityResultLauncher f12935v;

    public MayaMfaActivity() {
        final int i = 0;
        this.f12934u = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: w9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMfaActivity f20705b;

            {
                this.f20705b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i) {
                    case 0:
                        MayaMfaActivity mayaMfaActivity = this.f20705b;
                        ActivityResult result = (ActivityResult) obj;
                        int i4 = MayaMfaActivity.f12926w;
                        kotlin.jvm.internal.j.g(result, "result");
                        A7.j jVarZ1 = mayaMfaActivity.Z1();
                        if (result.getResultCode() != 11) {
                            ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).a2();
                        } else {
                            MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                            mayaMfaActivity2.getClass();
                            AbstractC1236z.g(mayaMfaActivity2, R.id.fragment_container, new MayaMfaFaceAuthFragment());
                        }
                        break;
                    default:
                        ActivityResult result2 = (ActivityResult) obj;
                        int i6 = MayaMfaActivity.f12926w;
                        kotlin.jvm.internal.j.g(result2, "result");
                        if (result2.getResultCode() == 1001) {
                            MayaMfaActivity mayaMfaActivity3 = this.f20705b;
                            String str = mayaMfaActivity3.p1().e().isFaceAuthFormToggleEnabled() ? "Submit ticket (Webview)" : "Customer support (Webview)";
                            String strM = AbstractC1213b.m(7);
                            kotlin.jvm.internal.j.f(strM, "tapped(...)");
                            MfaMeta mfaMeta = mayaMfaActivity3.f12930q;
                            String sourceScreen = mfaMeta != null ? mfaMeta.getSourceScreen() : null;
                            if (sourceScreen == null) {
                                sourceScreen = "";
                            }
                            mayaMfaActivity3.e2(strM, str, sourceScreen, "Close", null);
                            mayaMfaActivity3.setResult(1014);
                            mayaMfaActivity3.finish();
                        }
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f12935v = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: w9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaMfaActivity f20705b;

            {
                this.f20705b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i4) {
                    case 0:
                        MayaMfaActivity mayaMfaActivity = this.f20705b;
                        ActivityResult result = (ActivityResult) obj;
                        int i42 = MayaMfaActivity.f12926w;
                        kotlin.jvm.internal.j.g(result, "result");
                        A7.j jVarZ1 = mayaMfaActivity.Z1();
                        if (result.getResultCode() != 11) {
                            ((MayaMfaActivity) ((v9.a) jVarZ1.c.get())).a2();
                        } else {
                            MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) jVarZ1.c.get());
                            mayaMfaActivity2.getClass();
                            AbstractC1236z.g(mayaMfaActivity2, R.id.fragment_container, new MayaMfaFaceAuthFragment());
                        }
                        break;
                    default:
                        ActivityResult result2 = (ActivityResult) obj;
                        int i6 = MayaMfaActivity.f12926w;
                        kotlin.jvm.internal.j.g(result2, "result");
                        if (result2.getResultCode() == 1001) {
                            MayaMfaActivity mayaMfaActivity3 = this.f20705b;
                            String str = mayaMfaActivity3.p1().e().isFaceAuthFormToggleEnabled() ? "Submit ticket (Webview)" : "Customer support (Webview)";
                            String strM = AbstractC1213b.m(7);
                            kotlin.jvm.internal.j.f(strM, "tapped(...)");
                            MfaMeta mfaMeta = mayaMfaActivity3.f12930q;
                            String sourceScreen = mfaMeta != null ? mfaMeta.getSourceScreen() : null;
                            if (sourceScreen == null) {
                                sourceScreen = "";
                            }
                            mayaMfaActivity3.e2(strM, str, sourceScreen, "Close", null);
                            mayaMfaActivity3.setResult(1014);
                            mayaMfaActivity3.finish();
                        }
                        break;
                }
            }
        });
    }

    public static final void X1(MayaMfaActivity mayaMfaActivity) {
        String strM = AbstractC1213b.m(8);
        kotlin.jvm.internal.j.f(strM, numX49.tnTj78("bjeb"));
        MfaMeta mfaMeta = mayaMfaActivity.f12930q;
        String sourceScreen = mfaMeta != null ? mfaMeta.getSourceScreen() : null;
        if (sourceScreen == null) {
            sourceScreen = numX49.tnTj78("bje2");
        }
        String string = mayaMfaActivity.getString(R.string.maya_label_face_auth_button_take_me_back);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bjeL"));
        mayaMfaActivity.e2(strM, numX49.tnTj78("bjer"), sourceScreen, string, null);
    }

    public static final void j2(MayaMfaActivity mayaMfaActivity, String str, String str2, MayaErrorDialogFragment mayaErrorDialogFragment, PayMayaErrorAction payMayaErrorAction) {
        String strTnTj78;
        mayaMfaActivity.f12931r = numX49.tnTj78("bjeZ");
        j jVarZ1 = mayaMfaActivity.Z1();
        boolean zB = S5.c.b((S5.c) jVarZ1.e, A5.b.f94b0);
        String.valueOf(zB);
        yk.a.a();
        String strTnTj782 = numX49.tnTj78("bjek");
        if (zB) {
            jVarZ1.m();
            yk.a.a();
            a aVar = (a) jVarZ1.c.get();
            String strM = jVarZ1.m();
            MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) aVar;
            mayaMfaActivity2.getClass();
            kotlin.jvm.internal.j.g(strM, numX49.tnTj78("bjeB"));
            i iVarN1 = mayaMfaActivity2.n1();
            Boolean bool = Boolean.FALSE;
            Intent intentT0 = iVarN1.t0(mayaMfaActivity2, strM);
            intentT0.putExtra(numX49.tnTj78("bjeu"), strM);
            intentT0.putExtra(numX49.tnTj78("bjeV"), strTnTj782);
            intentT0.putExtra(numX49.tnTj78("bjeS"), true);
            intentT0.putExtra(numX49.tnTj78("bjej"), bool);
            intentT0.putExtra(numX49.tnTj78("bjed"), true);
            mayaMfaActivity2.f12935v.launch(intentT0);
            strTnTj78 = numX49.tnTj78("bjei");
        } else {
            mayaErrorDialogFragment.s1(payMayaErrorAction);
            Unit unit = Unit.f18162a;
            strTnTj78 = numX49.tnTj78("bjeE");
        }
        a aVar2 = (a) jVarZ1.c.get();
        String strS = AbstractC1213b.s(7);
        kotlin.jvm.internal.j.f(strS, numX49.tnTj78("bjeF"));
        ((MayaMfaActivity) aVar2).f2(strS, strTnTj78, M.h(new Pair(EnumC1212a.SCREEN_NAME, numX49.tnTj78("bjeH")), new Pair(EnumC1212a.CHALLENGE_ID, ((MayaMfaActivity) ((a) jVarZ1.c.get())).Y1())));
        String strM2 = AbstractC1213b.m(6);
        kotlin.jvm.internal.j.f(strM2, numX49.tnTj78("bjeO"));
        mayaMfaActivity.e2(strM2, numX49.tnTj78("bjeQ"), str, str2 == null ? strTnTj782 : str2, null);
    }

    public static final void m2(MayaMfaActivity mayaMfaActivity, MayaErrorDialogFragment mayaErrorDialogFragment) {
        mayaMfaActivity.f12931r = numX49.tnTj78("bjet");
        MfaMeta mfaMeta = mayaMfaActivity.f12930q;
        Intent intent = new Intent();
        intent.putExtra(numX49.tnTj78("bjeU"), mfaMeta);
        mayaMfaActivity.setResult(1015, intent);
        mayaMfaActivity.finish();
        String strM = AbstractC1213b.m(8);
        kotlin.jvm.internal.j.f(strM, numX49.tnTj78("bjee"));
        String string = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_send_otp);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bje8"));
        mayaMfaActivity.e2(strM, numX49.tnTj78("bjeC"), numX49.tnTj78("bje4"), string, null);
    }

    @Override // f9.InterfaceC1476c
    public final void J0() {
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f12928o = fragment;
        if (fragment instanceof MayaMultiTypeOtpFragment) {
            w1(true);
            y1(true);
            x1(true);
        } else {
            w1(false);
            y1(false);
            x1(false);
        }
    }

    public final String Y1() {
        MfaMeta mfaMeta = this.f12930q;
        String challengeId = mfaMeta != null ? mfaMeta.getChallengeId() : null;
        return challengeId == null ? numX49.tnTj78("bjeo") : challengeId;
    }

    public final j Z1() {
        j jVar = this.f12932s;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bjeK"));
        throw null;
    }

    public final void a2() {
        String strF;
        MfaMeta mfaMeta = this.f12930q;
        if (kotlin.jvm.internal.j.b(mfaMeta != null ? mfaMeta.getMethod() : null, numX49.tnTj78("bjew"))) {
            strF = AbstractC1213b.f(14);
            kotlin.jvm.internal.j.d(strF);
        } else {
            strF = AbstractC1213b.f(15);
            kotlin.jvm.internal.j.d(strF);
        }
        b2(strF, numX49.tnTj78("bjec"));
        setResult(1012);
        finish();
    }

    public final void b2(String str, String str2) {
        C1229s c1229s = this.f12933t;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjem"));
            throw null;
        }
        EnumC1212a enumC1212a = EnumC1212a.DESTINATION_PAGE;
        MfaMeta mfaMeta = this.f12930q;
        Pair pair = new Pair(enumC1212a, mfaMeta != null ? mfaMeta.getSourceScreen() : null);
        EnumC1212a enumC1212a2 = EnumC1212a.TYPE;
        MfaMeta mfaMeta2 = this.f12930q;
        Pair pair2 = new Pair(enumC1212a2, mfaMeta2 != null ? mfaMeta2.getMethod() : null);
        EnumC1212a enumC1212a3 = EnumC1212a.PURPOSE;
        MfaMeta mfaMeta3 = this.f12930q;
        Pair pair3 = new Pair(enumC1212a3, mfaMeta3 != null ? mfaMeta3.getTransactionType() : null);
        EnumC1212a enumC1212a4 = EnumC1212a.CHALLENGE_ID;
        MfaMeta mfaMeta4 = this.f12930q;
        c1229s.b(this, str, M.h(pair, pair2, pair3, new Pair(enumC1212a4, mfaMeta4 != null ? mfaMeta4.getChallengeId() : null), new Pair(EnumC1212a.REASON, str2)));
    }

    public final void c2(String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bjeD"));
        e2(str, str2, str3, str4, null);
    }

    public final void d2(String str) {
        C1229s c1229s = this.f12933t;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjeh"));
            throw null;
        }
        EnumC1212a enumC1212a = EnumC1212a.DESTINATION_PAGE;
        MfaMeta mfaMeta = this.f12930q;
        Pair pair = new Pair(enumC1212a, mfaMeta != null ? mfaMeta.getSuccessScreen() : null);
        EnumC1212a enumC1212a2 = EnumC1212a.TYPE;
        MfaMeta mfaMeta2 = this.f12930q;
        Pair pair2 = new Pair(enumC1212a2, mfaMeta2 != null ? mfaMeta2.getMethod() : null);
        EnumC1212a enumC1212a3 = EnumC1212a.PURPOSE;
        MfaMeta mfaMeta3 = this.f12930q;
        Pair pair3 = new Pair(enumC1212a3, mfaMeta3 != null ? mfaMeta3.getTransactionType() : null);
        EnumC1212a enumC1212a4 = EnumC1212a.CHALLENGE_ID;
        MfaMeta mfaMeta4 = this.f12930q;
        c1229s.b(this, str, M.h(pair, pair2, pair3, new Pair(enumC1212a4, mfaMeta4 != null ? mfaMeta4.getChallengeId() : null)));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(String str, String str2, String str3, String str4, String str5) {
        kotlin.jvm.internal.j.g(str4, numX49.tnTj78("bjeM"));
        C1407e c1407e = new C1407e();
        EnumC1212a enumC1212a = EnumC1212a.TYPE;
        MfaMeta mfaMeta = this.f12930q;
        String method = mfaMeta != null ? mfaMeta.getMethod() : null;
        String strTnTj78 = numX49.tnTj78("bjeN");
        if (method == null) {
            method = strTnTj78;
        }
        c1407e.put(enumC1212a, method);
        EnumC1212a enumC1212a2 = EnumC1212a.PURPOSE;
        MfaMeta mfaMeta2 = this.f12930q;
        String transactionType = mfaMeta2 != null ? mfaMeta2.getTransactionType() : null;
        if (transactionType == null) {
            transactionType = strTnTj78;
        }
        c1407e.put(enumC1212a2, transactionType);
        EnumC1212a enumC1212a3 = EnumC1212a.CHALLENGE_ID;
        MfaMeta mfaMeta3 = this.f12930q;
        String challengeId = mfaMeta3 != null ? mfaMeta3.getChallengeId() : null;
        if (challengeId != null) {
            strTnTj78 = challengeId;
        }
        c1407e.put(enumC1212a3, strTnTj78);
        if (str5 != null) {
            c1407e.put(EnumC1212a.CODE, str5);
        }
        C1407e c1407eB = c1407e.b();
        C1229s c1229s = this.f12933t;
        if (c1229s != null) {
            C1229s.c(c1229s, this, str, str2, str3, str4, null, null, c1407eB, 96);
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bje6"));
            throw null;
        }
    }

    public final void f2(String str, String str2, Map map) {
        C1229s c1229s = this.f12933t;
        if (c1229s != null) {
            C1229s.d(c1229s, this, str, str2, null, null, null, map, 56);
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjea"));
            throw null;
        }
    }

    @Override // f9.InterfaceC1476c
    public final OpenMfaMeta g0() {
        Intent intent = getIntent();
        kotlin.jvm.internal.j.f(intent, numX49.tnTj78("bjeX"));
        return (OpenMfaMeta) AbstractC0983W.l(intent, numX49.tnTj78("bjeG"), OpenMfaMeta.class);
    }

    public final void g2(PayMayaError payMayaError) {
        String string = payMayaError != null ? getString(R.string.maya_label_face_auth_error_title) : null;
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError != null ? payMayaError.mAction() : null;
        String strTnTj78 = numX49.tnTj78("bje3");
        String strTnTj782 = numX49.tnTj78("bjey");
        if (payMayaErrorActionMAction == null) {
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231347, string, payMayaError != null ? payMayaError.mSpiel() : null, getString(R.string.maya_label_face_auth_button_got_it), null, false, null, null, false, 464);
            mayaErrorDialogFragmentZ.f11852e0 = new w9.b(this, 0);
            mayaErrorDialogFragmentZ.f11850c0 = new g(this, 0);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.j.f(supportFragmentManager, strTnTj782);
            AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, strTnTj78);
            return;
        }
        MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231347, string, payMayaError.mSpiel(), payMayaErrorActionMAction.mTitle(), getString(R.string.maya_label_face_auth_button_got_it), false, null, null, false, 480);
        mayaErrorDialogFragmentZ2.f11852e0 = new N9.g(this, mayaErrorDialogFragmentZ2, payMayaErrorActionMAction, 3);
        mayaErrorDialogFragmentZ2.f11851d0 = new h(this);
        mayaErrorDialogFragmentZ2.f11850c0 = new w9.i(this, 0);
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        kotlin.jvm.internal.j.f(supportFragmentManager2, strTnTj782);
        AbstractC0983W.D(mayaErrorDialogFragmentZ2, supportFragmentManager2, strTnTj78);
    }

    public final void h2(int i, String str, String str2, String str3, Function0 function0) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(i, str, str2, str3, null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ.f11852e0 = new w9.c(function0, this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.j.f(supportFragmentManager, numX49.tnTj78("bjev"));
        AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, numX49.tnTj78("bje7"));
    }

    public final void i2(int i, String str, String str2, Function0 function0) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(i, str, str2, getString(R.string.maya_label_close), null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ.f11852e0 = new H(5, function0, mayaErrorDialogFragmentZ);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.j.f(supportFragmentManager, numX49.tnTj78("bjeA"));
        AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, numX49.tnTj78("bjeY"));
    }

    public final void k2(Function0 function0, Function0 function02) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231241, null, getString(R.string.maya_label_mfa_expires), getString(R.string.maya_label_back_to_login), getString(R.string.maya_label_retry), true, null, null, false, 450);
        mayaErrorDialogFragmentZ.f11852e0 = new w9.c(this, function0);
        mayaErrorDialogFragmentZ.f11851d0 = new C2038a(24, this, function02, false);
        mayaErrorDialogFragmentZ.f11850c0 = new w9.l(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.j.f(supportFragmentManager, numX49.tnTj78("bjeT"));
        AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, numX49.tnTj78("bjeR"));
    }

    public final void l2() {
        MfaMeta mfaMeta = this.f12930q;
        if (mfaMeta != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(numX49.tnTj78("bjep"), mfaMeta);
            MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment = new MayaFaceVerificationBottomSheetDialogFragment();
            mayaFaceVerificationBottomSheetDialogFragment.setArguments(bundle);
            mayaFaceVerificationBottomSheetDialogFragment.f12750Z = new m(this);
            mayaFaceVerificationBottomSheetDialogFragment.f12751a0 = new g(this, 1);
            mayaFaceVerificationBottomSheetDialogFragment.f12752b0 = new h(this);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.j.f(supportFragmentManager, numX49.tnTj78("bje0"));
            mayaFaceVerificationBottomSheetDialogFragment.show(supportFragmentManager, numX49.tnTj78("bjeg"));
        }
    }

    public final void n2(String str, String str2) {
        MfaMeta mfaMeta = this.f12930q;
        if (mfaMeta != null) {
            mfaMeta.setMethod(numX49.tnTj78("bjef"));
            mfaMeta.setFallbackSourceScreen(str2);
        }
        Bundle bundleD = androidx.media3.datasource.cache.c.d(numX49.tnTj78("bje1"), str);
        MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = new MayaMultiTypeOtpFragment();
        mayaMultiTypeOtpFragment.setArguments(bundleD);
        AbstractC1236z.g(this, R.id.fragment_container, mayaMultiTypeOtpFragment);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f12928o instanceof MayaMultiTypeOtpFragment) {
            String strM = AbstractC1213b.m(9);
            kotlin.jvm.internal.j.f(strM, numX49.tnTj78("bjen"));
            c2(strM, numX49.tnTj78("bjes"), numX49.tnTj78("bje5"), numX49.tnTj78("bjex"));
            String strF = AbstractC1213b.f(15);
            kotlin.jvm.internal.j.f(strF, numX49.tnTj78("bjeJ"));
            b2(strF, numX49.tnTj78("bjeI"));
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().r().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c cVar = (S5.c) aVar.f4724k.get();
        kotlin.jvm.internal.j.g(aVar2, numX49.tnTj78("bjeq"));
        kotlin.jvm.internal.j.g(cVar, numX49.tnTj78("bjez"));
        this.f12932s = new j(aVar2, cVar);
        this.f12933t = (C1229s) aVar.f4684R.get();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            setRequestedOrientation(1);
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_mfa, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12927n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 13);
                setContentView(constraintLayout);
                C0444d c0444d = this.f12927n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                w1(false);
                y1(false);
                Z1().h(this);
                Intent intent = getIntent();
                kotlin.jvm.internal.j.f(intent, numX49.tnTj78("bjel"));
                String strTnTj78 = numX49.tnTj78("bjeW");
                this.f12930q = (MfaMeta) AbstractC0983W.l(intent, strTnTj78, MfaMeta.class);
                if (bundle == null) {
                    Z1().j();
                    return;
                } else {
                    this.f12929p = (MFAChallengeInformationV2) AbstractC0617a.D(bundle, numX49.tnTj78("bjeP9"), MFAChallengeInformationV2.class);
                    this.f12930q = (MfaMeta) AbstractC0617a.D(bundle, strTnTj78, MfaMeta.class);
                    return;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjePP").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6263W = null;
        Z1().i();
        super.onDestroy();
        this.f12929p = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bjePb"));
        bundle.putParcelable(numX49.tnTj78("bjeP2"), this.f12929p);
        bundle.putParcelable(numX49.tnTj78("bjePL"), this.f12930q);
        super.onSaveInstanceState(bundle);
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }
}
