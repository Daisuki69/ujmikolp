package com.paymaya.mayaui.common.view.activity.impl;

import A5.m;
import A7.j;
import B5.i;
import D.C0187u;
import O5.a;
import S5.c;
import S6.e;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaPostLoginActivity extends q implements e {
    public j m;

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
        a aVar = (a) W4.a.e().a().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new j((com.paymaya.data.preference.a) aVar.e.get(), (m) aVar.f4653A.get());
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_post_login, (ViewGroup) null, false);
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container)) == null) {
            throw new NullPointerException(numX49.tnTj78("btAS").concat(viewInflate.getResources().getResourceName(R.id.frame_layout_container)));
        }
        setContentView((ConstraintLayout) viewInflate);
        j jVar = this.m;
        String strTnTj78 = numX49.tnTj78("btAV");
        if (jVar == null) {
            kotlin.jvm.internal.j.n(strTnTj78);
            throw null;
        }
        jVar.h(this);
        if (bundle == null) {
            j jVar2 = this.m;
            if (jVar2 != null) {
                jVar2.j();
            } else {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f = null;
        j jVar = this.m;
        if (jVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btAj"));
            throw null;
        }
        jVar.i();
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
}
