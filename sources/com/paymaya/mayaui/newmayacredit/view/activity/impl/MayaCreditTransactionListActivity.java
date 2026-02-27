package com.paymaya.mayaui.newmayacredit.view.activity.impl;

import B5.i;
import D.C0187u;
import L9.C0327e;
import M9.c;
import N5.C0444d;
import O5.a;
import Q9.InterfaceC0575e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import jk.b;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCreditTransactionListActivity extends q implements c, InterfaceC0575e {
    public C0444d m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0327e f13079o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13078n = numX49.tnTj78("bjKPC");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13080p = true;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        N1(b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
        getWindow().setNavigationBarColor(b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
        B1();
        A1();
        z1();
        w1(true);
        y1(true);
        x1(true);
        J1(R.string.maya_label_transactions);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final boolean l1() {
        return this.f13080p;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strTnTj78;
        iKNpI8.xCZPS1(this, bundle);
        a aVar = (a) W4.a.e().b().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13079o = new C0327e(0);
        super.onCreate(bundle);
        C0444d c0444dB = C0444d.b(getLayoutInflater());
        this.m = c0444dB;
        setContentView(c0444dB.f4072b);
        C0444d c0444d = this.m;
        j.d(c0444d);
        Q1(c0444d.f4073d);
        C0327e c0327e = this.f13079o;
        String strTnTj782 = numX49.tnTj78("bjKP4");
        if (c0327e == null) {
            j.n(strTnTj782);
            throw null;
        }
        c0327e.h(this);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null || (strTnTj78 = extras.getString(numX49.tnTj78("bjKPo"))) == null) {
                strTnTj78 = numX49.tnTj78("bjKPK");
            }
            this.f13078n = strTnTj78;
            C0327e c0327e2 = this.f13079o;
            if (c0327e2 != null) {
                c0327e2.j();
            } else {
                j.n(strTnTj782);
                throw null;
            }
        }
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6272d = null;
        C0327e c0327e = this.f13079o;
        if (c0327e == null) {
            j.n(numX49.tnTj78("bjKPw"));
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
                g1();
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
        E.a(numX49.tnTj78("bjKPc"), numX49.tnTj78("bjKPm"));
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.MAYA_CREDIT;
    }
}
