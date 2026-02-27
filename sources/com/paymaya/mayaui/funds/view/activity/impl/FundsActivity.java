package com.paymaya.mayaui.funds.view.activity.impl;

import T6.a;
import android.os.Bundle;
import android.view.MotionEvent;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class FundsActivity extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f12393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f12394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f12395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f12396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f12398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f12399u;

    public FundsActivity() {
        String strTnTj78 = numX49.tnTj78("bjrP");
        this.f12393o = strTnTj78;
        this.f12394p = numX49.tnTj78("bjrb");
        this.f12395q = numX49.tnTj78("bjr2");
        this.f12396r = numX49.tnTj78("bjrL");
        this.f12397s = numX49.tnTj78("bjrr");
        this.f12398t = strTnTj78;
        this.f12399u = numX49.tnTj78("bjrZ");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.FUNDS;
    }

    @Override // T6.a, y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        iKNpI8.xCZPS1(this, bundle);
    }

    @Override // T6.a, y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // T6.a, android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }
}
