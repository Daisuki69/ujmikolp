package com.paymaya.mayaui.compliance.view.activity.impl;

import B5.i;
import D.C0187u;
import M8.N0;
import M8.O0;
import N5.C0441c;
import N5.C0491z;
import O5.c;
import Q6.l;
import W4.a;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import fa.ViewOnClickListenerC1479a;
import g7.InterfaceC1505a;
import kotlin.jvm.internal.j;
import n3.C1916a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaComplianceActivity extends q implements InterfaceC1505a, O0, N0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f12100p = 0;
    public l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0441c f12101n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12102o;

    @Override // M8.N0
    public final void D0() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVarE = a.e();
        if (aVarE.f6257Q == null) {
            O5.a aVar = aVarE.f6267a;
            C1916a c1916a = new C1916a(21);
            aVar.getClass();
            aVarE.f6257Q = new c(aVar.f4704b, c1916a);
        }
        O5.a aVar2 = aVarE.f6257Q.f4752a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (S5.c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        this.m = new l(25);
        super.onCreate(bundle);
        setRequestedOrientation(1);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_compliance, (ViewGroup) null, false);
        int i = R.id.maya_compliance_nav_host_fragment;
        if (((FragmentContainerView) ViewBindings.findChildViewById(viewInflate, R.id.maya_compliance_nav_host_fragment)) != null) {
            i = R.id.maya_compliance_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.maya_compliance_toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12101n = new C0441c(constraintLayout, C0491z.a(viewFindChildViewById), 1);
                setContentView(constraintLayout);
                C0441c c0441c = this.f12101n;
                j.d(c0441c);
                Q1((C0491z) c0441c.c);
                C0441c c0441c2 = this.f12101n;
                j.d(c0441c2);
                ((Toolbar) ((C0491z) c0441c2.c).e).setNavigationOnClickListener(new ViewOnClickListenerC1479a(this, 3));
                Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    this.f12102o = extras.getString(numX49.tnTj78("btfP"));
                }
                l lVar = this.m;
                String strTnTj78 = numX49.tnTj78("btfb");
                if (lVar == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                lVar.h(this);
                l lVar2 = this.m;
                if (lVar2 != null) {
                    lVar2.j();
                    return;
                } else {
                    j.n(strTnTj78);
                    throw null;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("btf2").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        a.e().f6257Q = null;
        l lVar = this.m;
        if (lVar == null) {
            j.n(numX49.tnTj78("btfL"));
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // M8.O0
    public final void onDismiss() {
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
