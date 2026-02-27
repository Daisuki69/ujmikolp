package com.paymaya.mayaui.inbox.view.activity.impl;

import B5.i;
import Bb.f;
import D.C0187u;
import N5.C0444d;
import N5.C0491z;
import O5.a;
import S5.c;
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
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import q8.b;
import t8.d;
import t8.e;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaInboxV2Activity extends q implements b, d, e, Y6.e {
    public f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f12400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f12401o = new Bundle();

    @Override // y5.g
    public final void Q(Fragment fragment) {
        x1(true);
        y1(false);
        if (fragment instanceof MayaMaintenanceFragment) {
            w1(true);
            K1(getString(R.string.maya_label_inbox));
            u1();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        a aVar = W4.a.e().o().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = new f(aVar.u(), 22);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_inbox_v2, (ViewGroup) null, false);
        int i = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f12400n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 9);
                setContentView(constraintLayout);
                C0444d c0444d = this.f12400n;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                f fVar = this.m;
                String strTnTj78 = numX49.tnTj78("bjZr");
                if (fVar == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                fVar.h(this);
                if (bundle == null) {
                    f fVar2 = this.m;
                    if (fVar2 != null) {
                        fVar2.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjZZ").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pma_menu_inbox, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6289z = null;
        f fVar = this.m;
        if (fVar == null) {
            j.n(numX49.tnTj78("bjZk"));
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                onBackPressed();
            } else if (itemId != R.id.pma_menu_inbox_mark_all_as_read) {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            } else {
                C1219h c1219h = new C1219h();
                c1219h.n(17);
                c1219h.t(EnumC1217f.OPTION);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("option", "mark all as read");
                v1(c1219h);
                f fVar = this.m;
                if (fVar == null) {
                    j.n("mActivityPresenter");
                    throw null;
                }
                C1250b0 c1250b0 = (C1250b0) fVar.e;
                if (c1250b0.b()) {
                    c1250b0.c();
                }
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
}
