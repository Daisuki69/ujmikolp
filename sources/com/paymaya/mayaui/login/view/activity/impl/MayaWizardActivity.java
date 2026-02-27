package com.paymaya.mayaui.login.view.activity.impl;

import B5.i;
import D.C0187u;
import O5.a;
import Q6.l;
import S5.c;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b9.InterfaceC0928d;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import h9.x;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaWizardActivity extends q implements InterfaceC0928d, x {
    public l m;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(false);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.fragment_container_layout);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        j.e(layoutParams, numX49.tnTj78("bjHw"));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        viewGroup.setLayoutParams(marginLayoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().p().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new l(15);
        super.onCreate(bundle);
        setContentView(R.layout.maya_activity_wizard);
        l lVar = this.m;
        if (lVar != null) {
            lVar.h(this);
        } else {
            j.n(numX49.tnTj78("bjHc"));
            throw null;
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().c = null;
        l lVar = this.m;
        if (lVar == null) {
            j.n(numX49.tnTj78("bjHm"));
            throw null;
        }
        lVar.i();
        super.onDestroy();
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

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.NEW_WIZARD;
    }
}
