package com.paymaya.mayaui.shop.view.activity.impl;

import B5.i;
import D.C0187u;
import Q6.l;
import Yb.a;
import android.os.Bundle;
import android.view.Menu;
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
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import we.InterfaceC2418g;
import we.InterfaceC2422k;
import we.InterfaceC2424m;
import y5.AbstractActivityC2512d;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaShopActivity extends AbstractActivityC2512d implements a, InterfaceC2418g, InterfaceC2422k, InterfaceC2424m, Wc.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f13984k = 0;
    public l j;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        o1(true);
        p1(true);
        q1(R.color.light_light);
        getWindow().getDecorView().setSystemUiVisibility(8192);
        l1(R.string.pma_label_shop);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.AbstractActivityC2512d
    public final EnumC1215d k1() {
        return EnumC1215d.SHOP;
    }

    @Override // Wc.a
    public final void n() {
    }

    @Override // y5.AbstractActivityC2512d, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().H().f4756a;
        this.c = (C1220i) aVar.f4716g.get();
        this.f21061d = (com.paymaya.data.preference.a) aVar.e.get();
        this.e = (i) aVar.f4659D.get();
        this.f = (C0187u) aVar.f.get();
        this.j = new l(5);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_shop, (ViewGroup) null, false);
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_fragment_container)) == null) {
            throw new NullPointerException(numX49.tnTj78("bVcI").concat(viewInflate.getResources().getResourceName(R.id.frame_layout_fragment_container)));
        }
        setContentView((ConstraintLayout) viewInflate);
        l lVar = this.j;
        String strTnTj78 = numX49.tnTj78("bVcJ");
        if (lVar == null) {
            j.n(strTnTj78);
            throw null;
        }
        lVar.h(this);
        if (bundle == null) {
            l lVar2 = this.j;
            if (lVar2 != null) {
                lVar2.j();
            } else {
                j.n(strTnTj78);
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pma_menu_shop_v3, menu);
        return true;
    }

    @Override // y5.AbstractActivityC2512d, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6276l = null;
        l lVar = this.j;
        if (lVar == null) {
            j.n(numX49.tnTj78("bVcq"));
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId != 16908332) {
                EnumC1215d enumC1215d = EnumC1215d.SHOP;
                if (itemId == R.id.pma_menu_shop_purchase_history_icon) {
                    C1220i c1220i = this.c;
                    C1219h c1219hD = C1219h.d(enumC1215d);
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.PURCHASE_HISTORY);
                    c1220i.c(this, c1219hD);
                    this.e.Y(this, null);
                } else if (itemId != R.id.pma_menu_shop_search_icon) {
                    zOnOptionsItemSelected = super.onOptionsItemSelected(item);
                } else {
                    C1220i c1220i2 = this.c;
                    C1219h c1219hD2 = C1219h.d(enumC1215d);
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.SEARCH);
                    c1220i2.c(this, c1219hD2);
                    this.e.getClass();
                    i.c0(this, "");
                }
            } else {
                g1();
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
