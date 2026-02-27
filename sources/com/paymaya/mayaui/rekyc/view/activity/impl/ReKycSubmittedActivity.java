package com.paymaya.mayaui.rekyc.view.activity.impl;

import B5.i;
import Bb.f;
import D.C0187u;
import E8.u;
import E8.v;
import M8.N0;
import M8.O0;
import M8.P0;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import hb.InterfaceC1559b;
import kotlin.jvm.internal.j;
import lb.InterfaceC1823d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class ReKycSubmittedActivity extends q implements InterfaceC1559b, O0, N0, P0, InterfaceC1823d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f13699q = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f13700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u f13701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f13702p;

    @Override // M8.N0
    public final void D0() {
        v vVar = this.f13702p;
        if (vVar != null) {
            vVar.D0();
        }
    }

    @Override // M8.P0
    public final C1219h H() {
        C1219h c1219hD = C1219h.d(EnumC1215d.DEFAULT);
        D.e(c1219hD, p1(), C1112C.f9377a);
        return c1219hD;
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    public final f V1() {
        f fVar = this.f13700n;
        if (fVar != null) {
            return fVar;
        }
        j.n(numX49.tnTj78("bjTr"));
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        a aVar = W4.a.e().F().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13700n = new f(16);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_re_kyc_submitted, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 19);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                V1().h(this);
                w1(false);
                x1(false);
                if (bundle == null) {
                    V1().j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjTZ").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        V1().i();
        W4.a.e().f6260T = null;
        super.onDestroy();
    }

    @Override // M8.O0
    public final void onDismiss() {
        u uVar = this.f13701o;
        if (uVar != null) {
            uVar.onDismiss();
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
