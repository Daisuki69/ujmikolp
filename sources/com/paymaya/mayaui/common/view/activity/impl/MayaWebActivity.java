package com.paymaya.mayaui.common.view.activity.impl;

import Bb.a;
import D.C0187u;
import Lh.c;
import N5.C0453g;
import N5.C0491z;
import S6.j;
import Wc.b;
import X6.h;
import Xh.i;
import Y6.n;
import Y6.p;
import Y6.r;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebInterstitialFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebLoadingFragment;
import d7.C1335b;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWebActivity extends q implements j, n, r, p, b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f11806q = 0;
    public C0453g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f11807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Fragment f11808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11809p;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        String strTnTj78;
        this.f11808o = fragment;
        if (fragment instanceof MayaWebLoadingFragment) {
            Intent intent = getIntent();
            if (intent == null || (strTnTj78 = intent.getStringExtra(numX49.tnTj78("btA3"))) == null) {
                strTnTj78 = numX49.tnTj78("btAy");
            }
            d(strTnTj78);
            return;
        }
        if (fragment instanceof MayaWebInterstitialFragment) {
            t1();
            C1(R.drawable.maya_ic_navigation_back);
            C0453g c0453g = this.m;
            kotlin.jvm.internal.j.d(c0453g);
            ((Toolbar) ((C0491z) c0453g.e).e).setNavigationOnClickListener(new S.b(fragment, 10));
        }
    }

    public C1335b V1() {
        int i = C1335b.f16288b;
        C0453g c0453g = this.m;
        kotlin.jvm.internal.j.d(c0453g);
        return i.x((CoordinatorLayout) c0453g.f4095d);
    }

    public void W1() {
        a aVar = this.f11807n;
        if (aVar != null) {
            aVar.i();
        } else {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btAv"));
            throw null;
        }
    }

    public Drawable X1() {
        return ContextCompat.getDrawable(this, 2131231657);
    }

    public void Y1() {
    }

    public void Z1() {
        a aVar = this.f11807n;
        if (aVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("btAA"));
            throw null;
        }
        Intent intent = getIntent();
        if (intent != null ? intent.getBooleanExtra(numX49.tnTj78("btA7"), false) : false) {
            return;
        }
        ((MayaWebActivity) ((j) aVar.c.get())).M1(R.color.light_light);
    }

    public void a2() {
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_web, (ViewGroup) null, false);
        int i = R.id.container_maya_activity_web;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_maya_activity_web);
        if (frameLayout != null) {
            i = R.id.coordinator_layout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(viewInflate, R.id.coordinator_layout);
            if (coordinatorLayout != null) {
                i = R.id.toolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
                if (viewFindChildViewById != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.m = new C0453g(2, constraintLayout, frameLayout, coordinatorLayout, C0491z.a(viewFindChildViewById));
                    setContentView(constraintLayout);
                    return;
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("btAY").concat(viewInflate.getResources().getResourceName(i)));
    }

    public void b2() {
        c cVarA = W4.a.e().a();
        O5.a aVar = (O5.a) cVarA.c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f11807n = new a((com.paymaya.data.preference.a) ((O5.a) cVarA.c).e.get(), 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c2() {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity.c2():void");
    }

    public void d(String str) {
        C0453g c0453g = this.m;
        kotlin.jvm.internal.j.d(c0453g);
        Q1((C0491z) c0453g.e);
        I1(8388627);
        C1(R.drawable.maya_ic_close);
        K1(str);
        T1();
        w1(true);
        x1(true);
        y1(true);
    }

    public final void d2(String str) {
        n1();
        String strTnTj78 = numX49.tnTj78("btAn");
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (uri.resolveActivity(getPackageManager()) != null) {
                startActivity(uri);
                return;
            }
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(strTnTj78 + uri.getPackage())));
        } catch (Exception unused) {
            yk.a.c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(String str) {
        Intent intent = getIntent();
        String strTnTj78 = numX49.tnTj78("btAx");
        boolean booleanExtra = intent.getBooleanExtra(strTnTj78, false);
        Intent intent2 = getIntent();
        String strTnTj782 = numX49.tnTj78("btAs");
        boolean booleanExtra2 = intent2.getBooleanExtra(strTnTj782, false);
        Intent intent3 = getIntent();
        String strTnTj783 = numX49.tnTj78("btA5");
        boolean booleanExtra3 = intent3.getBooleanExtra(strTnTj783, false);
        Intent intent4 = getIntent();
        String strTnTj784 = numX49.tnTj78("btAJ");
        boolean booleanExtra4 = intent4.getBooleanExtra(strTnTj784, false);
        Intent intent5 = getIntent();
        String strTnTj785 = numX49.tnTj78("btAI");
        boolean booleanExtra5 = intent5.getBooleanExtra(strTnTj785, false);
        Intent intent6 = getIntent();
        String strTnTj786 = numX49.tnTj78("btAq");
        String stringExtra = intent6.getStringExtra(strTnTj786);
        MayaWebFragment mayaWebFragment = new MayaWebFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("btAz"), str);
        bundle.putBoolean(strTnTj78, booleanExtra);
        bundle.putBoolean(strTnTj782, booleanExtra2);
        bundle.putBoolean(strTnTj783, booleanExtra3);
        bundle.putBoolean(strTnTj784, booleanExtra4);
        bundle.putBoolean(strTnTj785, booleanExtra5);
        if (stringExtra == null) {
            stringExtra = numX49.tnTj78("btAl");
        }
        bundle.putString(strTnTj786, stringExtra);
        mayaWebFragment.setArguments(bundle);
        AbstractC1236z.g(this, R.id.container_maya_activity_web, mayaWebFragment);
    }

    public final void f2(String str) {
        String strTnTj78 = numX49.tnTj78("btAW");
        kotlin.jvm.internal.j.g(str, strTnTj78);
        Bundle bundle = new Bundle();
        bundle.putString(strTnTj78, str);
        MayaWebLoadingFragment mayaWebLoadingFragment = new MayaWebLoadingFragment();
        mayaWebLoadingFragment.setArguments(bundle);
        AbstractC1236z.g(this, R.id.container_maya_activity_web, mayaWebLoadingFragment);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f11808o;
        if (activityResultCaller instanceof h) {
            kotlin.jvm.internal.j.e(activityResultCaller, numX49.tnTj78("btAP9"));
            if (((MayaWebFragment) ((h) activityResultCaller)).Q1()) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        Intent intent = getIntent();
        if (intent != null ? intent.getBooleanExtra(numX49.tnTj78("btAPP"), false) : false) {
            setTheme(R.style.MayaThemeDark_WebView);
        }
        b2();
        super.onCreate(bundle);
        a2();
        c2();
        Z1();
        Y1();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f = null;
        W1();
        setRequestedOrientation(1);
        dLgao9.oVike1(getWindow(), 1024);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
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
        return EnumC1215d.WEBVIEW;
    }
}
