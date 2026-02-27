package com.paymaya.mayaui.accountlimits.view.activity.impl;

import B5.i;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import Q6.l;
import S5.c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import c6.InterfaceC1076a;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import f6.InterfaceC1466b;
import f6.InterfaceC1467c;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountLimitsActivity extends q implements InterfaceC1076a, InterfaceC1466b, InterfaceC1467c {
    public l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f11507n;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if (fragment instanceof MayaAccountLimitsFragment) {
            K1(getString(R.string.maya_account_limits_title));
            T1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().g().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("btDP"));
        this.m = new l(22);
        super.onCreate(bundle);
        M1(R.color.light_light);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_account_limits_v2, (ViewGroup) null, false);
        int i = R.id.frame_layout_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f11507n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 0);
                setContentView(constraintLayout);
                C0444d c0444d = this.f11507n;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                l lVar = this.m;
                String strTnTj78 = numX49.tnTj78("btDb");
                if (lVar == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                lVar.h(this);
                if (bundle == null) {
                    l lVar2 = this.m;
                    if (lVar2 != null) {
                        lVar2.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("btD2").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6258R = null;
        l lVar = this.m;
        if (lVar == null) {
            j.n(numX49.tnTj78("btDL"));
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
            j.g(item, "item");
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
        return EnumC1215d.ACCOUNT_LIMITS;
    }
}
