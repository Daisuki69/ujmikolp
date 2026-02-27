package com.paymaya.mayaui.settings.view.activity.impl;

import B5.i;
import D.C0187u;
import Mb.a;
import N5.C0444d;
import N5.C0491z;
import S5.c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1132s;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAdsInternalOnlyFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.engine.FlutterEngineGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAdsInternalOnlyActivity extends q implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f13830s = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0491z f13831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlutterEngineGroup f13832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f13833p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MayaAdsInternalOnlyFragment f13834q = new MayaAdsInternalOnlyFragment();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M f13835r;

    public final void V1(Fragment fragment, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        C0444d c0444d = this.m;
        j.d(c0444d);
        fragmentTransactionBeginTransaction.add(c0444d.c.getId(), fragment).addToBackStack(str).commit();
        this.f13833p.add(fragment);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W1(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 2131953452(0x7f13072c, float:1.9543375E38)
            r2 = 2131953265(0x7f130671, float:1.9542996E38)
            switch(r0) {
                case -1968751561: goto L5f;
                case -163184852: goto L4a;
                case 780765698: goto L35;
                case 904318972: goto L23;
                case 1165339978: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L6b
        Le:
            java.lang.String r0 = "bj1h"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1b
            goto L6b
        L1b:
            r4 = 2131952662(0x7f130416, float:1.9541773E38)
            java.lang.String r4 = r3.getString(r4)
            goto L95
        L23:
            java.lang.String r0 = "bj1M"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L30
            goto L6b
        L30:
            java.lang.String r4 = r3.getString(r2)
            goto L95
        L35:
            java.lang.String r0 = "bj1N"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto L6b
        L42:
            r4 = 2131952661(0x7f130415, float:1.9541771E38)
            java.lang.String r4 = r3.getString(r4)
            goto L95
        L4a:
            java.lang.String r0 = "bj16"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L57
            goto L6b
        L57:
            r4 = 2131952667(0x7f13041b, float:1.9541783E38)
            java.lang.String r4 = r3.getString(r4)
            goto L95
        L5f:
            java.lang.String r0 = "bj1a"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L91
        L6b:
            java.util.ArrayList r4 = r3.f13833p
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L89
            java.util.ArrayList r4 = r3.f13833p
            java.lang.Object r4 = cj.C1110A.G(r4)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            boolean r4 = r4 instanceof com.paymaya.mayaui.settings.view.fragment.impl.MayaNativeAdsInternalOnlyFragment
            if (r4 == 0) goto L84
            java.lang.String r4 = r3.getString(r1)
            goto L95
        L84:
            java.lang.String r4 = r3.getString(r2)
            goto L95
        L89:
            r4 = 2131954249(0x7f130a49, float:1.9544992E38)
            java.lang.String r4 = r3.getString(r4)
            goto L95
        L91:
            java.lang.String r4 = r3.getString(r1)
        L95:
            kotlin.jvm.internal.j.d(r4)
            N5.z r0 = r3.f13831n
            if (r0 == 0) goto La4
            java.lang.Object r0 = r0.h
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r4)
            return
        La4:
            java.lang.String r4 = "bj1X"
            java.lang.String r4 = dOYHB6.tiZVw8.numX49.tnTj78(r4)
            kotlin.jvm.internal.j.n(r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity.W1(java.lang.String):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!this.f13833p.isEmpty()) {
            getSupportFragmentManager().beginTransaction().remove((Fragment) C1110A.G(this.f13833p)).commitNowAllowingStateLoss();
            ArrayList arrayList = this.f13833p;
            arrayList.remove(C1132s.f(arrayList));
        }
        W1(numX49.tnTj78("bj1G"));
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_ads_internal_only, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 2);
                setContentView(constraintLayout);
                this.f13832o = new FlutterEngineGroup(this);
                if (bundle == null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container, new MayaAdsInternalOnlyFragment()).commit();
                }
                C0444d c0444d = this.m;
                j.d(c0444d);
                C0491z c0491z = c0444d.f4073d;
                this.f13831n = c0491z;
                ((ProgressBar) c0491z.f).setVisibility(4);
                C0491z c0491z2 = this.f13831n;
                String strTnTj78 = numX49.tnTj78("bj13");
                if (c0491z2 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                ((TextView) c0491z2.h).setText(getString(R.string.maya_title_ads));
                C0491z c0491z3 = this.f13831n;
                if (c0491z3 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                ((Toolbar) c0491z3.e).setNavigationIcon(R.drawable.maya_ic_close);
                C0491z c0491z4 = this.f13831n;
                if (c0491z4 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                ((Toolbar) c0491z4.e).setBackgroundColor(getColor(R.color.ghost_white));
                C0491z c0491z5 = this.f13831n;
                if (c0491z5 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                Q1(c0491z5);
                FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                C0444d c0444d2 = this.m;
                j.d(c0444d2);
                fragmentTransactionBeginTransaction.replace(c0444d2.c.getId(), this.f13834q).commit();
                return;
            }
            i = R.id.toolbar;
        }
        throw new NullPointerException(numX49.tnTj78("bj1y").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        this.m = null;
        this.f13833p = new ArrayList();
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
    }
}
