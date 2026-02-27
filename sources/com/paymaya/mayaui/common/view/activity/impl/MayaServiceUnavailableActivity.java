package com.paymaya.mayaui.common.view.activity.impl;

import B5.i;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import Q6.l;
import S6.f;
import Y6.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaServiceUnavailableActivity extends AbstractActivityC2512d implements f, e {
    public C0444d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f11788k;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        n1(true);
        p1(true);
        o1(true);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0491z c0491z;
        iKNpI8.xCZPS1(this, bundle);
        a aVar = (a) W4.a.e().a().c;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        this.f11788k = new l(0);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_service_unavailable, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.j = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 23);
                setContentView(constraintLayout);
                C0444d c0444d = this.j;
                j.d(c0444d);
                C0491z c0491z2 = c0444d.f4073d;
                this.h = c0491z2;
                setSupportActionBar((Toolbar) c0491z2.e);
                l lVar = this.f11788k;
                String strTnTj78 = numX49.tnTj78("btAZ");
                if (lVar == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                lVar.h(this);
                if (bundle == null) {
                    Bundle extras = getIntent().getExtras();
                    String string = extras != null ? extras.getString(numX49.tnTj78("btAk")) : null;
                    if (getSupportActionBar() != null && (c0491z = this.h) != null) {
                        ((TextView) c0491z.h).setText(string);
                    }
                    l lVar2 = this.f11788k;
                    if (lVar2 != null) {
                        lVar2.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("btAB").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f = null;
        l lVar = this.f11788k;
        if (lVar == null) {
            j.n(numX49.tnTj78("btAu"));
            throw null;
        }
        lVar.i();
        super.onDestroy();
        this.j = null;
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
