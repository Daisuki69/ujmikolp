package com.paymaya.mayaui.settings.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import Kh.I;
import Mb.c;
import N5.C0444d;
import N5.C0491z;
import Qb.e;
import Qb.h;
import Sb.d;
import Sb.g;
import Sb.j;
import Sb.m;
import Sb.o;
import Sb.t;
import W6.b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaSettingsPasswordCredentialBottomSheetFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.BaseMayaSettingsFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDisplayNameFragment;
import com.paymaya.ui.settings.view.fragment.toggles.MaintenanceTogglesFragment;
import com.paymaya.ui.settings.view.fragment.toggles.TogglesFragment;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import pg.u;
import y5.InterfaceC2511c;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSettingsActivity extends l implements c, d, t, e, Qb.c, b, o, h, Sb.l, Qb.b, m, j, g, Sb.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13839r = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f13840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f13841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MayaLoadingDialogFragment f13842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u f13843q;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        x1(true);
        y1(true);
        I1(17);
        J1(R.string.maya_label_settings);
        if (fragment instanceof MayaDisplayNameFragment) {
            t1();
            return;
        }
        if (fragment instanceof MayaChangePasswordFragment) {
            J1(R.string.maya_label_change_password);
            return;
        }
        boolean z4 = fragment instanceof MayaChangeMinFragment;
        String strTnTj78 = numX49.tnTj78("bj1u");
        if (z4 || (fragment instanceof MayaChangeMinOTPFragment)) {
            K1(strTnTj78);
            return;
        }
        if (fragment instanceof MayaChangeMinFormFragment) {
            J1(R.string.maya_label_change_mobile_number);
            return;
        }
        if (fragment instanceof MayaAccountRecoveryFragment) {
            K1(strTnTj78);
            return;
        }
        if (fragment instanceof MayaAccountRecoveryEmailFragment) {
            a aVarX1 = X1();
            Bundle arguments = ((MayaAccountRecoveryEmailFragment) fragment).getArguments();
            if (arguments != null ? arguments.getBoolean(numX49.tnTj78("bj1V")) : false) {
                ((MayaSettingsActivity) ((c) aVarX1.c.get())).J1(R.string.maya_label_account_recovery_email_change_recovery_email);
                return;
            } else {
                ((MayaSettingsActivity) ((c) aVarX1.c.get())).K1(strTnTj78);
                return;
            }
        }
        if (fragment instanceof TogglesFragment) {
            J1(R.string.maya_label_toggles);
        } else if (fragment instanceof MaintenanceTogglesFragment) {
            J1(R.string.maya_label_maintenance_toggles);
        }
    }

    public final a X1() {
        a aVar = this.f13841o;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bj1S"));
        throw null;
    }

    public final void Y1(boolean z4) {
        if (!z4) {
            AbstractC1236z.f(this);
        }
        MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = new MayaAccountRecoveryEmailFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(numX49.tnTj78("bj1j"), z4);
        mayaAccountRecoveryEmailFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_container, mayaAccountRecoveryEmailFragment);
    }

    public final void Z1(String str, String str2) {
        I.j(str, str2, new Nb.a(this, 3)).show(getSupportFragmentManager(), numX49.tnTj78("bj1d"));
    }

    @Override // Sb.o
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(2131231347, str, null, null, null, false, payMayaError, null, false, 444).show(getSupportFragmentManager(), numX49.tnTj78("bj1i"));
    }

    public final void a2() {
        String string = getString(R.string.maya_label_change_min_change_your_mind_title);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bj1E"));
        z2.d.n(2131231242, string, getString(R.string.maya_label_change_min_change_your_mind_description), new Pair(getString(R.string.maya_label_leave), new Nb.a(this, 0)), new Pair(getString(R.string.maya_label_cancel), null), null, 96).show(getSupportFragmentManager(), numX49.tnTj78("bj1F"));
    }

    public final void b2(PayMayaError payMayaError, String str) {
        M2.b.Z(2131231347, str, null, null, null, false, payMayaError, null, false, 444).show(getSupportFragmentManager(), numX49.tnTj78("bj1H"));
    }

    public final void c2(String str, String str2) {
        M2.b.Z(2131231347, str, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT).show(getSupportFragmentManager(), numX49.tnTj78("bj1O"));
    }

    public final void d2(int i, PayMayaError payMayaError, String str) {
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError != null ? payMayaError.mAction() : null;
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(i, str, payMayaError != null ? payMayaError.mSpiel() : null, payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 496);
        mayaErrorDialogFragmentZ.f11852e0 = new Nb.b(mayaErrorDialogFragmentZ, this, payMayaErrorActionMAction, 0);
        mayaErrorDialogFragmentZ.f11851d0 = new Nb.d(mayaErrorDialogFragmentZ, this, 1);
        mayaErrorDialogFragmentZ.setCancelable(false);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bj1Q"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(BaseMayaSettingsFragment baseMayaSettingsFragment, String str, String str2) {
        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = new MayaSettingsPasswordCredentialBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putCharSequence(numX49.tnTj78("bj1t"), str);
        bundle.putCharSequence(numX49.tnTj78("bj1U"), str2);
        mayaSettingsPasswordCredentialBottomSheetFragment.setArguments(bundle);
        mayaSettingsPasswordCredentialBottomSheetFragment.setTargetFragment(baseMayaSettingsFragment, YTAGReflectLiveCheckInterface.LightLiveCheckResult.INIT_ERROR);
        mayaSettingsPasswordCredentialBottomSheetFragment.f13875c0 = true;
        mayaSettingsPasswordCredentialBottomSheetFragment.f13876d0 = numX49.tnTj78("bj1e");
        mayaSettingsPasswordCredentialBottomSheetFragment.show(getSupportFragmentManager(), numX49.tnTj78("bj18"));
    }

    public final void f2(String str, boolean z4) {
        String string = getString(R.string.maya_dialog_send_verification_success_title);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bj1C"));
        z2.d.n(2131231645, string, getString(R.string.maya_dialog_send_verification_success_description, str), new Pair(getString(R.string.maya_label_got_it), new Nb.c(z4, this, 0)), null, null, 112).show(getSupportFragmentManager(), numX49.tnTj78("bj14"));
    }

    @Override // Sb.o
    public final void i0(String str, String str2) {
        z2.d.n(2131231645, str, str2, null, null, null, 120).show(getSupportFragmentManager(), numX49.tnTj78("bj1o"));
    }

    @Override // Sb.o
    public final void o0() {
        MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = new MayaPasswordTipsBottomSheetDialogFragment();
        mayaPasswordTipsBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaPasswordTipsBottomSheetDialogFragment.getTag());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        kotlin.jvm.internal.j.f(fragments, numX49.tnTj78("bj1K"));
        if (!fragments.isEmpty()) {
            for (Fragment fragment : fragments) {
                if (fragment.isVisible()) {
                    if ((fragment instanceof InterfaceC2511c) && ((InterfaceC2511c) fragment).e0()) {
                        return;
                    }
                }
            }
            throw new NoSuchElementException(numX49.tnTj78("bj1w"));
        }
        if (getIntent().getStringExtra(numX49.tnTj78("bj1c")) != null) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        kotlin.jvm.internal.j.g(aVar2, numX49.tnTj78("bj1m"));
        this.f13841o = new a(aVar2, 10, false);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_settings, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f13840n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 25);
                setContentView(constraintLayout);
                C0444d c0444d = this.f13840n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                X1().h(this);
                if (bundle == null) {
                    X1().j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bj1D").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W1();
        W4.a.e().h = null;
        X1().i();
        super.onDestroy();
        this.f13840n = null;
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
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.SETTINGS;
    }
}
