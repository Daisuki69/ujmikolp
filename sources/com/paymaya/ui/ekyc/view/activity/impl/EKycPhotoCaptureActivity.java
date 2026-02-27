package com.paymaya.ui.ekyc.view.activity.impl;

import B5.i;
import D.C0187u;
import O5.a;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import i8.C1593a;
import kotlin.jvm.internal.j;
import td.c;
import y5.AbstractActivityC2512d;
import zd.v;

/* JADX INFO: loaded from: classes4.dex */
public final class EKycPhotoCaptureActivity extends AbstractActivityC2512d implements c, v {
    public C1593a j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        n1(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.EKYC;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        EKycPhotoCaptureFragment eKycPhotoCaptureFragment = (EKycPhotoCaptureFragment) getSupportFragmentManager().findFragmentById(R.id.container_pma_activity_ekyc_photo_capture_fragment);
        if (eKycPhotoCaptureFragment != null) {
            eKycPhotoCaptureFragment.r1().m();
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_ekyc_photo_capture);
        a aVar = W4.a.e().d().f4753a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        C1593a c1593a = new C1593a(10);
        this.j = c1593a;
        c1593a.h(this);
        if (bundle == null) {
            C1593a c1593a2 = this.j;
            if (c1593a2 == null) {
                j.n(numX49.tnTj78("bVso"));
                throw null;
            }
            c1593a2.j();
        }
        q1(R.color.light_light);
        getWindow().getDecorView().setSystemUiVisibility(8192);
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().i = null;
        C1593a c1593a = this.j;
        if (c1593a == null) {
            j.n(numX49.tnTj78("bVsK"));
            throw null;
        }
        c1593a.i();
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

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        this.e.u0(this);
    }
}
