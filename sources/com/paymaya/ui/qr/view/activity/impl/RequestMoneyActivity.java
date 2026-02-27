package com.paymaya.ui.qr.view.activity.impl;

import B5.i;
import D.C0187u;
import Q6.l;
import W4.a;
import ae.c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import ce.f;
import ce.g;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import de.t;
import de.u;
import p3.C2011b;
import y5.AbstractActivityC2512d;
import y5.InterfaceC2511c;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyActivity extends AbstractActivityC2512d implements c, t, u {
    public l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Fragment f14656k;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        this.f14656k = fragment;
        if (!(fragment instanceof f)) {
            if (fragment instanceof g) {
                n1(false);
                r1();
                return;
            }
            return;
        }
        n1(true);
        m1(getString(R.string.pma_label_request_money));
        o1(true);
        p1(true);
        q1(R.color.light_light);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.REQUEST_MONEY;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f14656k;
        if ((activityResultCaller instanceof InterfaceC2511c) && ((InterfaceC2511c) activityResultCaller).e0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        Lh.c cVarE = a.e().E();
        O5.a aVar = (O5.a) cVarE.c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        ((C2011b) cVarE.f2990b).getClass();
        this.j = new l(20);
        setContentView(R.layout.pma_activity_request_money_v2);
        this.j.h(this);
        if (bundle == null) {
            this.j.j();
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        a.e().f6284u = null;
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

    public final void t1() {
        super.onBackPressed();
    }
}
