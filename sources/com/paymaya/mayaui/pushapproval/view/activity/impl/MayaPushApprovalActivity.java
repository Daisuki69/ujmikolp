package com.paymaya.mayaui.pushapproval.view.activity.impl;

import Aa.a;
import B5.i;
import B5.m;
import D.C0187u;
import Gh.f;
import N5.C0458i;
import N5.C0491z;
import S5.c;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import i8.C1593a;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaPushApprovalActivity extends q implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f13543p = 0;
    public C1593a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f13544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0458i f13545o;

    public final ConstraintLayout V1() {
        C0458i c0458i = this.f13545o;
        j.d(c0458i);
        ConstraintLayout constraintLayout = (ConstraintLayout) c0458i.f4116d.f4303b;
        j.f(constraintLayout, numX49.tnTj78("bjaP"));
        return constraintLayout;
    }

    public final Toolbar W1() {
        C0458i c0458i = this.f13545o;
        j.d(c0458i);
        Toolbar toolbar = (Toolbar) c0458i.f4116d.e;
        j.f(toolbar, numX49.tnTj78("bjab"));
        return toolbar;
    }

    public final void X1() {
        W1().setNavigationIcon((Drawable) null);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(V1());
        constraintSet.connect(R.id.toolbar_title_text_view, 7, 0, 7);
        constraintSet.connect(R.id.toolbar_title_text_view, 6, 0, 6);
        constraintSet.setMargin(R.id.toolbar_title_text_view, 7, (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        constraintSet.applyTo(V1());
    }

    public final void Y1(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            W1().setNavigationOnClickListener(onClickListener);
        } else {
            W1().setNavigationOnClickListener(new Ba.a(this, 0));
        }
    }

    public final void Z1() {
        W1().setNavigationIcon(R.drawable.maya_ic_navigation_back);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(V1());
        constraintSet.connect(R.id.toolbar_title_text_view, 7, R.id.right_inset_space, 6);
        constraintSet.connect(R.id.toolbar_title_text_view, 6, 0, 6);
        constraintSet.setMargin(R.id.toolbar_title_text_view, 7, (int) TypedValue.applyDimension(1, 0.0f, getResources().getDisplayMetrics()));
        constraintSet.applyTo(V1());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().u().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new C1593a(13);
        this.f13544n = (m) aVar.f4718h0.get();
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_pushapproval, (ViewGroup) null, false);
        int i = R.id.nav_host_fragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(viewInflate, R.id.nav_host_fragment);
        if (fragmentContainerView != null) {
            i = R.id.toolbar_authorize_requests;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar_authorize_requests);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f13545o = new C0458i(constraintLayout, fragmentContainerView, C0491z.a(viewFindChildViewById), 0);
                setContentView(constraintLayout);
                C0458i c0458i = this.f13545o;
                j.d(c0458i);
                Q1(c0458i.f4116d);
                Y1(null);
                J1(R.string.maya_push_approval_authorize_request_toolbar_title);
                C1593a c1593a = this.m;
                String strTnTj78 = numX49.tnTj78("bja2");
                if (c1593a == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                c1593a.h(this);
                C1593a c1593a2 = this.m;
                if (c1593a2 != null) {
                    c1593a2.j();
                    return;
                } else {
                    j.n(strTnTj78);
                    throw null;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjaL").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6259S = null;
        m mVar = this.f13544n;
        if (mVar == null) {
            j.n(numX49.tnTj78("bjaZ"));
            throw null;
        }
        mVar.a();
        C1593a c1593a = this.m;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bjar"));
            throw null;
        }
        c1593a.i();
        super.onDestroy();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
        m mVar = this.f13544n;
        if (mVar == null) {
            j.n(numX49.tnTj78("bjak"));
            throw null;
        }
        f fVar = mVar.f;
        if (fVar != null) {
            Dh.a.a(fVar);
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
        m mVar = this.f13544n;
        if (mVar != null) {
            mVar.b();
        } else {
            j.n(numX49.tnTj78("bjaB"));
            throw null;
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        m mVar = this.f13544n;
        if (mVar == null) {
            j.n(numX49.tnTj78("bjau"));
            throw null;
        }
        mVar.a();
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
        return EnumC1215d.PUSH_APPROVAL;
    }
}
