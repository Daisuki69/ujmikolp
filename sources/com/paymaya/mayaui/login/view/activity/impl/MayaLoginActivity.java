package com.paymaya.mayaui.login.view.activity.impl;

import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import Q6.r;
import R4.i;
import Rg.g;
import T6.c;
import T6.f;
import W6.b;
import android.app.Dialog;
import android.content.Intent;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.viewbinding.ViewBindings;
import b9.InterfaceC0925a;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import f9.InterfaceC1476c;
import h9.j;
import h9.k;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import nd.a;
import y5.l;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLoginActivity extends l implements InterfaceC0925a, j, k, a, InterfaceC1476c, b, Q7.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f12721v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f12722n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f12723o = new g(21);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f12724p = new g(22);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f12725q = new g(23);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ActivityResultLauncher f12726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ActivityResultLauncher f12727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Q6.l f12728t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1229s f12729u;

    public MayaLoginActivity() {
        final int i = 0;
        registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginActivity f9309b;

            {
                this.f9309b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaLoginActivity mayaLoginActivity = this.f9309b;
                ActivityResult result = (ActivityResult) obj;
                switch (i) {
                    case 0:
                        int i4 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12723o.invoke(result);
                        break;
                    case 1:
                        int i6 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12724p.invoke(result);
                        break;
                    default:
                        int i10 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12725q.invoke(result);
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f12726r = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginActivity f9309b;

            {
                this.f9309b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaLoginActivity mayaLoginActivity = this.f9309b;
                ActivityResult result = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i42 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12723o.invoke(result);
                        break;
                    case 1:
                        int i6 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12724p.invoke(result);
                        break;
                    default:
                        int i10 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12725q.invoke(result);
                        break;
                }
            }
        });
        final int i6 = 2;
        this.f12727s = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: c9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaLoginActivity f9309b;

            {
                this.f9309b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaLoginActivity mayaLoginActivity = this.f9309b;
                ActivityResult result = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        int i42 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12723o.invoke(result);
                        break;
                    case 1:
                        int i62 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12724p.invoke(result);
                        break;
                    default:
                        int i10 = MayaLoginActivity.f12721v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaLoginActivity.f12725q.invoke(result);
                        break;
                }
            }
        });
    }

    @Override // y5.q, W6.f
    public final void E(String str, Dialog dialog) {
        super.E(str, dialog);
        n1().l0(this, str);
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // h9.k
    public final void I0(PayMayaError payMayaError) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231237, getString(R.string.maya_label_device_fingerprint_block_error_title), null, null, null, false, payMayaError, null, false, 444);
        mayaErrorDialogFragmentZ.f11850c0 = new i(this, 24);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHP"));
    }

    @Override // h9.k
    public final void J() {
        MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = new MayaDataPrivacyDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjHb"), numX49.tnTj78("bjH2"));
        mayaDataPrivacyDialogFragment.setArguments(bundle);
        mayaDataPrivacyDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bjHL"));
    }

    @Override // f9.InterfaceC1476c
    public final void J0() {
        X1(2131231273, getString(R.string.maya_label_face_generic_error_title), getString(R.string.maya_label_face_generic_error_spiel));
    }

    @Override // h9.k
    public final void M0() {
        n1();
        B5.i.M(this, numX49.tnTj78("bjHr"));
    }

    @Override // h9.k
    public final void O(PayMayaError payMayaError, String str) {
        C.Q(this, getCurrentFocus());
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
        mayaErrorDialogFragmentZ.f11850c0 = new T3.l(this, 24);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHZ"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        y1(true);
        x1(true);
        r1();
        s1();
        if (fragment instanceof MayaLoginFragment) {
            String string = getString(R.string.maya_label_login_title_header);
            kotlin.jvm.internal.j.f(string, numX49.tnTj78("bjHk"));
            K1(z.t(string, numX49.tnTj78("bjHB"), numX49.tnTj78("bjHu")));
            t1();
        }
    }

    @Override // h9.k
    public final void T(PayMayaError payMayaError) {
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, payMayaError.mSpiel(), payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 499);
        mayaErrorDialogFragmentZ.f11852e0 = new c(mayaErrorDialogFragmentZ, payMayaErrorActionMAction, 1);
        mayaErrorDialogFragmentZ.f11851d0 = new r(this, 25);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHV"));
    }

    public final void X1(int i, String str, String str2) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(i, str, str2, getString(R.string.maya_label_close), null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ.f11852e0 = new f(mayaErrorDialogFragmentZ, 4);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bjHS"));
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("bjHj"));
    }

    @Override // nd.a, Q7.a
    public final void b(String str, ArrayList arrayList) {
        n1().B(this, arrayList, str);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // f9.InterfaceC1476c
    public final OpenMfaMeta g0() {
        return null;
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return new ActivityTransition(0, 0, 0, 0, 15, null);
    }

    @Override // y5.q
    public final boolean l1() {
        return true;
    }

    @Override // y5.j
    public final void o(String str, String str2) {
        M2.b.Z(0, null, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(getSupportFragmentManager(), numX49.tnTj78("bjHd"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        String strTnTj78;
        boolean z4 = getSupportFragmentManager().findFragmentById(R.id.fragment_container) instanceof MayaLoginFragment;
        String strTnTj782 = numX49.tnTj78("bjHi");
        if (z4) {
            strTnTj78 = numX49.tnTj78("bjHE");
            str = strTnTj782;
        } else {
            str = null;
            strTnTj78 = null;
        }
        C1229s c1229s = this.f12729u;
        if (c1229s == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjHU"));
            throw null;
        }
        String strL = AbstractC1213b.l(1);
        kotlin.jvm.internal.j.f(strL, numX49.tnTj78("bjHF"));
        C1229s.c(c1229s, this, strL, str, strTnTj78, numX49.tnTj78("bjHH"), numX49.tnTj78("bjHO"), null, null, PsExtractor.AUDIO_STREAM);
        Intent intent = new Intent();
        if (S5.c.b(m1(), A5.b.f53B1)) {
            strTnTj782 = numX49.tnTj78("bjHQ");
        }
        intent.putExtra(numX49.tnTj78("bjHt"), strTnTj782);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().p().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12728t = new Q6.l(13);
        this.f12729u = (C1229s) aVar.f4684R.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_login, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12722n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 10);
                setContentView(constraintLayout);
                C0444d c0444d = this.f12722n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                Q6.l lVar = this.f12728t;
                String strTnTj78 = numX49.tnTj78("bjHe");
                if (lVar == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                lVar.h(this);
                if (bundle == null) {
                    Q6.l lVar2 = this.f12728t;
                    if (lVar2 != null) {
                        lVar2.j();
                        return;
                    } else {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjH8").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6269b = null;
        Q6.l lVar = this.f12728t;
        if (lVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bjHC"));
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
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
    }

    @Override // h9.k
    public final void p() {
        DataPrivacyDialogFragment dataPrivacyDialogFragment = new DataPrivacyDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjH4"), numX49.tnTj78("bjHo"));
        dataPrivacyDialogFragment.setArguments(bundle);
        dataPrivacyDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bjHK"));
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.LOGIN;
    }
}
