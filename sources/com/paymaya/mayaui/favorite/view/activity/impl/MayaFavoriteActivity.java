package com.paymaya.mayaui.favorite.view.activity.impl;

import B5.i;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import Y6.e;
import Y7.c;
import Z7.b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import d8.InterfaceC1338c;
import d8.InterfaceC1341f;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaFavoriteActivity extends q implements b, InterfaceC1341f, W6.b, InterfaceC1338c, e {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f12318n;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        y1(true);
        x1(true);
        I1(17);
        if (fragment instanceof MayaMaintenanceFragment) {
            K1(getString(R.string.maya_label_favorites));
            T1();
        } else {
            K1(numX49.tnTj78("bU9r"));
            t1();
        }
    }

    public final List V1() {
        ArrayList arrayList = ((c) W1()).e;
        if (arrayList != null) {
            return C1110A.V(arrayList);
        }
        return null;
    }

    public final X7.b W1() {
        c cVar = this.f12318n;
        if (cVar != null) {
            return cVar;
        }
        j.n(numX49.tnTj78("bU9Z"));
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        a aVar = W4.a.e().m().f4756a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(aVar2, numX49.tnTj78("bU9k"));
        this.f12318n = new c(aVar2);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_favorite, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 7);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                ((AbstractC2509a) W1()).h(this);
                if (bundle == null) {
                    ((c) W1()).j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bU9B").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6243B = null;
        ((AbstractC2509a) W1()).i();
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
        super.onUserInteraction();
        n1().u0(this);
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.MY_FAVORITES;
    }
}
