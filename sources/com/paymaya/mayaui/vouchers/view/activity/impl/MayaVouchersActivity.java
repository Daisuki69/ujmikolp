package com.paymaya.mayaui.vouchers.view.activity.impl;

import B5.i;
import D.C0187u;
import Ec.a;
import Gc.d;
import Gc.g;
import Gc.j;
import M2.b;
import N5.C0460j;
import N5.C0491z;
import S5.c;
import Y6.e;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersCollectionFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersReceiptFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import y5.InterfaceC2511c;
import y5.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVouchersActivity extends q implements a, e, g, d, j {
    public C0460j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Fragment f14274n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Bb.a f14276p;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f14274n = fragment;
        w1(false);
        x1(true);
        y1(true);
        if (!(fragment instanceof MayaVoucherDetailsFragment)) {
            if (fragment instanceof MayaVouchersReceiptFragment) {
                w1(false);
                W1();
                return;
            } else {
                w1(true);
                W1();
                K1(getString(R.string.maya_label_vouchers));
                return;
            }
        }
        if (((MayaBaseLoadingFragment) fragment).m0 != 0) {
            w1(true);
            W1();
            return;
        }
        w1(false);
        Window window = getWindow();
        dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(9472);
    }

    @Override // y5.n
    public final void Q0(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bVGP"));
        n1();
        i.l(this, str, AttributionSource.f10368d);
    }

    public final void V1() {
        if (AbstractC0983W.r(this)) {
            Intent intent = new Intent(numX49.tnTj78("bVGb"));
            intent.setData(Uri.fromParts(numX49.tnTj78("bVG2"), getPackageName(), null));
            startActivity(intent);
        }
    }

    public final void W1() {
        Window window = getWindow();
        dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.primary));
        window.getDecorView().setSystemUiVisibility(0);
        M1(R.color.light_light);
        A1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        String str = this.f14275o;
        if (str == null || C2576A.H(str)) {
            AbstractC1236z.c(this);
        } else {
            finish();
        }
    }

    @Override // y5.n
    public final void l(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bVGL"));
        n1().k0(this, str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f14274n;
        if (activityResultCaller instanceof InterfaceC2511c) {
            kotlin.jvm.internal.j.e(activityResultCaller, numX49.tnTj78("bVGr"));
            if (((InterfaceC2511c) activityResultCaller).e0()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().C().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f14276p = new Bb.a((com.paymaya.data.preference.a) aVar.e.get(), aVar.Y());
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_vouchers, (ViewGroup) null, false);
        int i = R.id.fragment_container_frame_layout_pma_activity_vouchers;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container_frame_layout_pma_activity_vouchers);
        if (frameLayout != null) {
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0460j(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 1);
                setContentView(constraintLayout);
                C0460j c0460j = this.m;
                kotlin.jvm.internal.j.d(c0460j);
                Q1(c0460j.f4124d);
                Bb.a aVar2 = this.f14276p;
                String strTnTj78 = numX49.tnTj78("bVGZ");
                if (aVar2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                aVar2.h(this);
                Bundle extras = getIntent().getExtras();
                String string = extras != null ? extras.getString(numX49.tnTj78("bVGk"), numX49.tnTj78("bVGB")) : null;
                this.f14275o = string;
                if (bundle == null) {
                    Bb.a aVar3 = this.f14276p;
                    if (aVar3 == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    aVar3.j();
                    if (!aVar3.e.e().isVouchersServiceAvailable()) {
                        String strMMessage = aVar3.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mVouchersAvailability().mMessage();
                        MayaVouchersActivity mayaVouchersActivity = (MayaVouchersActivity) ((a) aVar3.c.get());
                        mayaVouchersActivity.getClass();
                        kotlin.jvm.internal.j.g(strMMessage, numX49.tnTj78("bVGu"));
                        AbstractC1236z.g(mayaVouchersActivity, R.id.fragment_container_frame_layout_pma_activity_vouchers, b.a0(strMMessage, 3));
                        return;
                    }
                    if (string == null || C2576A.H(string)) {
                        MayaVouchersActivity mayaVouchersActivity2 = (MayaVouchersActivity) ((a) aVar3.c.get());
                        mayaVouchersActivity2.getClass();
                        AbstractC1236z.g(mayaVouchersActivity2, R.id.fragment_container_frame_layout_pma_activity_vouchers, new MayaVouchersCollectionFragment());
                        return;
                    }
                    MayaVouchersActivity mayaVouchersActivity3 = (MayaVouchersActivity) ((a) aVar3.c.get());
                    mayaVouchersActivity3.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(numX49.tnTj78("bVGV"), string);
                    MayaVoucherDetailsFragment mayaVoucherDetailsFragment = new MayaVoucherDetailsFragment();
                    mayaVoucherDetailsFragment.setArguments(bundle2);
                    AbstractC1236z.g(mayaVouchersActivity3, R.id.fragment_container_frame_layout_pma_activity_vouchers, mayaVoucherDetailsFragment);
                    return;
                }
                return;
            }
            i = R.id.toolbar;
        }
        throw new NullPointerException(numX49.tnTj78("bVGS").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6288y = null;
        Bb.a aVar = this.f14276p;
        if (aVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bVGj"));
            throw null;
        }
        aVar.i();
        super.onDestroy();
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
}
