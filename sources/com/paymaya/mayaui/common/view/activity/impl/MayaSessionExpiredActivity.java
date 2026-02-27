package com.paymaya.mayaui.common.view.activity.impl;

import B5.i;
import D.C0187u;
import M2.b;
import N5.C0444d;
import N5.C0491z;
import Q6.r;
import Q6.s;
import S6.g;
import T6.c;
import T6.f;
import Uh.d;
import Y6.j;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginOTPFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import f9.InterfaceC1476c;
import h9.k;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import nd.a;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaSessionExpiredActivity extends l implements g, j, k, a, InterfaceC1476c, Q7.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f11789v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f11790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rg.g f11791o = new Rg.g(9);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Function1 f11792p = new Rg.g(10);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f11793q = new Rg.g(11);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ActivityResultLauncher f11794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ActivityResultLauncher f11795s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Q6.l f11796t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f11797u;

    public MayaSessionExpiredActivity() {
        final int i = 0;
        registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: T6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredActivity f5805b;

            {
                this.f5805b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity = this.f5805b;
                ActivityResult result = (ActivityResult) obj;
                switch (i) {
                    case 0:
                        int i4 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11791o.invoke(result);
                        break;
                    case 1:
                        int i6 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11792p.invoke(result);
                        break;
                    default:
                        int i10 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11793q.invoke(result);
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f11794r = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: T6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredActivity f5805b;

            {
                this.f5805b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity = this.f5805b;
                ActivityResult result = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i42 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11791o.invoke(result);
                        break;
                    case 1:
                        int i6 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11792p.invoke(result);
                        break;
                    default:
                        int i10 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11793q.invoke(result);
                        break;
                }
            }
        });
        final int i6 = 2;
        this.f11795s = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: T6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSessionExpiredActivity f5805b;

            {
                this.f5805b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MayaSessionExpiredActivity mayaSessionExpiredActivity = this.f5805b;
                ActivityResult result = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        int i42 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11791o.invoke(result);
                        break;
                    case 1:
                        int i62 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11792p.invoke(result);
                        break;
                    default:
                        int i10 = MayaSessionExpiredActivity.f11789v;
                        kotlin.jvm.internal.j.g(result, "result");
                        mayaSessionExpiredActivity.f11793q.invoke(result);
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
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231237, getString(R.string.maya_label_device_fingerprint_block_error_title), null, null, null, false, payMayaError, null, false, 444);
        mayaErrorDialogFragmentZ.f11850c0 = new r(this, 3);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("btAE"));
    }

    @Override // h9.k
    public final void J() {
        MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = new MayaDataPrivacyDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("btAF"), numX49.tnTj78("btAH"));
        mayaDataPrivacyDialogFragment.setArguments(bundle);
        mayaDataPrivacyDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("btAO"));
    }

    @Override // f9.InterfaceC1476c
    public final void J0() {
        X1(2131231273, getString(R.string.maya_label_face_generic_error_title), getString(R.string.maya_label_face_generic_error_spiel));
    }

    @Override // h9.k
    public final void M0() {
        d dVar = this.f11797u;
        if (dVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btAt"));
            throw null;
        }
        dVar.onNext(Boolean.TRUE);
        n1();
        i.M(this, numX49.tnTj78("btAQ"));
    }

    @Override // h9.k
    public final void O(PayMayaError payMayaError, String str) {
        C.Q(this, getCurrentFocus());
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
        mayaErrorDialogFragmentZ.f11850c0 = new Qd.a(this, 2);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("btAU"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        C0491z c0491z;
        y1(true);
        x1(true);
        t1();
        r1();
        s1();
        if (!(fragment instanceof MayaSessionExpiredFragment)) {
            if (fragment instanceof MayaLoginOTPFragment) {
                w1(true);
            }
        } else {
            w1(true);
            if (getSupportActionBar() == null || (c0491z = this.j) == null) {
                return;
            }
            ((Toolbar) c0491z.e).setNavigationIcon((Drawable) null);
        }
    }

    @Override // h9.k
    public final void T(PayMayaError payMayaError) {
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(0, null, payMayaError.mSpiel(), payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mTitle() : null, null, false, null, null, false, 499);
        mayaErrorDialogFragmentZ.f11852e0 = new c(mayaErrorDialogFragmentZ, payMayaErrorActionMAction, 0);
        mayaErrorDialogFragmentZ.f11851d0 = new s(this, 3);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("btAe"));
    }

    public final void X1(int i, String str, String str2) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(i, str, str2, getString(R.string.maya_label_close), null, false, null, null, false, 464);
        mayaErrorDialogFragmentZ.f11852e0 = new f(mayaErrorDialogFragmentZ, 0);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("btA8"));
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("btAC"));
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

    @Override // y5.j
    public final void o(String str, String str2) {
        b.Z(0, null, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(getSupportFragmentManager(), numX49.tnTj78("btA4"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        MayaLoginOTPFragment mayaLoginOTPFragment = (MayaLoginOTPFragment) getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(this, MayaLoginOTPFragment.class));
        if (mayaLoginOTPFragment == null || !mayaLoginOTPFragment.isVisible()) {
            moveTaskToBack(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        kotlin.jvm.internal.j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("btAo"));
        this.f11796t = new Q6.l(1);
        this.f11797u = (d) aVar.m0.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_session_expired, (ViewGroup) null, false);
        int i = R.id.fragment_container_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container_layout);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f11790n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 24);
                setContentView(constraintLayout);
                C0444d c0444d = this.f11790n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                Q6.l lVar = this.f11796t;
                String strTnTj78 = numX49.tnTj78("btAK");
                if (lVar == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                lVar.h(this);
                if (bundle == null) {
                    Q6.l lVar2 = this.f11796t;
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
        throw new NullPointerException(numX49.tnTj78("btAw").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f = null;
        Q6.l lVar = this.f11796t;
        if (lVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btAc"));
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
        bundle.putString(numX49.tnTj78("btAm"), numX49.tnTj78("btAD"));
        dataPrivacyDialogFragment.setArguments(bundle);
        dataPrivacyDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("btAh"));
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.SESSION_TIMEOUT;
    }
}
