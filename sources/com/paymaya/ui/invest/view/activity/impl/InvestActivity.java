package com.paymaya.ui.invest.view.activity.impl;

import B5.i;
import D.C0187u;
import Ed.a;
import Hd.b;
import O5.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import n3.C1916a;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class InvestActivity extends AbstractActivityC2512d implements a, b {
    public Ae.a j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        n1(true);
        p1(true);
        o1(true);
        m1(getString(R.string.pma_label_invest));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.INVEST;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6245D == null) {
            O5.a aVar = aVarE.f6267a;
            C1916a c1916a = new C1916a(1);
            aVar.getClass();
            aVarE.f6245D = new e(aVar.f4704b, c1916a);
        }
        O5.a aVar2 = aVarE.f6245D.f4754a;
        this.c = (C1220i) aVar2.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar2.e.get();
        this.e = (i) aVar2.f4659D.get();
        this.f = (C0187u) aVar2.f.get();
        this.j = new Ae.a(22);
        View viewInflate = getLayoutInflater().inflate(R.layout.pma_activity_invest, (ViewGroup) null, false);
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.pma_activity_invest_fragment_container)) == null) {
            throw new NullPointerException(numX49.tnTj78("bVzb").concat(viewInflate.getResources().getResourceName(R.id.pma_activity_invest_fragment_container)));
        }
        setContentView((ConstraintLayout) viewInflate);
        Ae.a aVar3 = this.j;
        String strTnTj78 = numX49.tnTj78("bVzP");
        if (aVar3 == null) {
            j.n(strTnTj78);
            throw null;
        }
        aVar3.h(this);
        if (bundle == null) {
            Ae.a aVar4 = this.j;
            if (aVar4 != null) {
                aVar4.j();
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        W4.a.e().f6245D = null;
        Ae.a aVar = this.j;
        if (aVar != null) {
            aVar.i();
        } else {
            j.n(numX49.tnTj78("bVz2"));
            throw null;
        }
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
