package com.paymaya.ui.support.view.activity.impl;

import B5.i;
import Be.a;
import D.C0187u;
import O5.b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.ui.support.view.fragment.impl.SupportFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import oi.C1989g;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public class SupportActivity extends AbstractActivityC2512d implements a, Ce.a {
    public Ae.a j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        o1(true);
        p1(true);
        if (fragment instanceof SupportFragment) {
            m1(getString(R.string.pma_label_send_us_a_message));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.SUPPORT;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6283t == null) {
            O5.a aVar = aVarE.f6267a;
            C1989g c1989g = new C1989g();
            aVar.getClass();
            aVarE.f6283t = new b(aVar.f4704b, c1989g);
        }
        O5.a aVar2 = aVarE.f6283t.f4751a;
        this.c = (C1220i) aVar2.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar2.e.get();
        this.e = (i) aVar2.f4659D.get();
        this.f = (C0187u) aVar2.f.get();
        this.j = new Ae.a(0);
        super.onCreate(bundle);
        setContentView(R.layout.pma_activity_support);
        this.j.h(this);
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6283t = null;
        this.j.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.onOptionsItemSelected_enter(menuItem);
        try {
            if (menuItem.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                Callback.onOptionsItemSelected_exit();
                return zOnOptionsItemSelected;
            }
            g1();
            Callback.onOptionsItemSelected_exit();
            return true;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
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
