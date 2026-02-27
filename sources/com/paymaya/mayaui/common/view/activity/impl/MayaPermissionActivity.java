package com.paymaya.mayaui.common.view.activity.impl;

import B5.i;
import D.C0187u;
import L9.C0327e;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import S5.c;
import S6.d;
import Y6.f;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaPermissionActivity extends q implements d, f {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0327e f11787n;

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = (a) W4.a.e().a().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f11787n = new C0327e(27);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_permission, (ViewGroup) null, false);
        int i = R.id.frame_layout_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_fragment_container);
        if (frameLayout != null) {
            i = R.id.maya_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 16);
                setContentView(constraintLayout);
                Window window = getWindow();
                dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.maya_shades_of_grey_11));
                window.getDecorView().setSystemUiVisibility(0);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                C0444d c0444d2 = this.m;
                j.d(c0444d2);
                int color = ContextCompat.getColor(getApplicationContext(), R.color.maya_shades_of_grey_11);
                int color2 = ContextCompat.getColor(getApplicationContext(), R.color.maya_primary_white);
                C0491z c0491z = c0444d2.f4073d;
                Toolbar toolbar = (Toolbar) c0491z.e;
                toolbar.setBackgroundColor(color);
                ((TextView) c0491z.h).setTextColor(color2);
                ((TextView) c0491z.f4304d).setTextColor(color2);
                toolbar.setNavigationIcon(R.drawable.maya_ic_navigation_white);
                C0327e c0327e = this.f11787n;
                String strTnTj78 = numX49.tnTj78("btAa");
                if (c0327e == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                c0327e.h(this);
                if (bundle == null) {
                    C0327e c0327e2 = this.f11787n;
                    if (c0327e2 == null) {
                        j.n(strTnTj78);
                        throw null;
                    }
                    c0327e2.j();
                }
                setResult(12);
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("btAX").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f = null;
        C0327e c0327e = this.f11787n;
        if (c0327e == null) {
            j.n(numX49.tnTj78("btAG"));
            throw null;
        }
        c0327e.i();
        super.onDestroy();
        this.m = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
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
}
