package com.paymaya.mayaui.kyczoloz.view.activity.impl;

import B5.i;
import D.C0187u;
import D8.C0197e;
import E8.C;
import G7.t;
import H8.b;
import I8.d;
import I8.e;
import M8.G;
import M8.InterfaceC0338b1;
import M8.InterfaceC0345d0;
import M8.InterfaceC0364i;
import M8.InterfaceC0414u2;
import M8.J0;
import M8.N0;
import M8.O;
import M8.O0;
import M8.P0;
import M8.c3;
import N5.C0453g;
import N5.C0491z;
import N5.G0;
import S5.c;
import a.AbstractC0617a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.ConnectionResult;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1228q;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1223l;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.Dosri;
import com.paymaya.domain.model.Fatca;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycRegulatoryProfileStatusResponse;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.MultiWindowErrorDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.iY9fr2.dLgao9;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import nj.l;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaKycActivity extends q implements b, O0, N0, InterfaceC0345d0, InterfaceC0414u2, c3, InterfaceC0338b1, J0, O, InterfaceC0364i, P0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static MayaDashboardActivity f12445B;
    public C0197e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public O0 f12446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N0 f12447o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MultiWindowErrorDialogFragment f12449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0453g f12451s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public G f12452t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f12453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12454v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f12457y;

    public MayaKycActivity() {
        String strTnTj78 = numX49.tnTj78("bjVZ");
        this.f12455w = strTnTj78;
        this.f12456x = strTnTj78;
        this.f12457y = strTnTj78;
    }

    @Override // M8.N0
    public final void D0() {
        N0 n02 = this.f12447o;
        if (n02 != null) {
            n02.D0();
        }
    }

    @Override // M8.P0
    public final C1219h H() {
        C1219h c1219hD = C1219h.d(EnumC1215d.EKYC_V6);
        D.e(c1219hD, p1(), a2());
        return c1219hD;
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    public final void V1(int i, MayaEKYCSelectedDocument mayaEKYCSelectedDocument) {
        j.g(mayaEKYCSelectedDocument, numX49.tnTj78("bjVk"));
        C0197e c0197eZ1 = Z1();
        if (i < 0 || i >= c0197eZ1.f1044l.size()) {
            c0197eZ1.f1044l.add(i, mayaEKYCSelectedDocument);
        } else {
            c0197eZ1.f1044l.set(i, mayaEKYCSelectedDocument);
        }
    }

    public final C1219h W1() {
        C1219h c1219hD = C1219h.d(EnumC1215d.EKYC_V6);
        a aVarP1 = p1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put(numX49.tnTj78("bjVB"), aVarP1.l());
        c1219hD.i();
        return c1219hD;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L75
            boolean r1 = C0.a.x(r4)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1d
            r1 = 26
            if (r0 < r1) goto L17
            boolean r0 = C0.a.C(r4)
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = r3
            goto L1e
        L1d:
            r0 = r2
        L1e:
            java.lang.String r1 = "bjVu"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()     // Catch: java.lang.Exception -> L75
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r1)     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L31
            goto L32
        L31:
            r2 = r3
        L32:
            if (r2 != 0) goto L75
            com.paymaya.mayaui.kyczoloz.view.fragment.MultiWindowErrorDialogFragment r0 = new com.paymaya.mayaui.kyczoloz.view.fragment.MultiWindowErrorDialogFragment     // Catch: java.lang.Exception -> L75
            r0.<init>()     // Catch: java.lang.Exception -> L75
            r4.f12449q = r0     // Catch: java.lang.Exception -> L75
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()     // Catch: java.lang.Exception -> L75
            r0.show(r2, r1)     // Catch: java.lang.Exception -> L75
            goto L75
        L43:
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r1)
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r2 = r3
        L4f:
            if (r2 == 0) goto L75
            boolean r0 = C0.a.x(r4)
            if (r0 != 0) goto L75
            com.paymaya.mayaui.kyczoloz.view.fragment.MultiWindowErrorDialogFragment r0 = r4.f12449q
            if (r0 == 0) goto L5e
            r0.dismiss()
        L5e:
            r0 = 0
            r4.f12449q = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            I8.e r1 = new I8.e
            r2 = 1
            r1.<init>(r4, r2)
            r2 = 100
            r0.postDelayed(r1, r2)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity.X1():void");
    }

    public final C1219h Y1() {
        CharSequence charSequenceTnTj78;
        NavDestination destination;
        C1219h c1219hH = H();
        c1219hH.n(36);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = s().toString();
        HashMap map = c1219hH.j;
        map.put(numX49.tnTj78("bjVV"), string);
        NavBackStackEntry previousBackStackEntry = ActivityKt.findNavController(this, R.id.maya_kyc_nav_host_fragment).getPreviousBackStackEntry();
        if (previousBackStackEntry == null || (destination = previousBackStackEntry.getDestination()) == null || (charSequenceTnTj78 = destination.getLabel()) == null) {
            charSequenceTnTj78 = numX49.tnTj78("bjVS");
        }
        map.put(numX49.tnTj78("bjVj"), charSequenceTnTj78.toString());
        return c1219hH;
    }

    public final C0197e Z1() {
        C0197e c0197e = this.m;
        if (c0197e != null) {
            return c0197e;
        }
        j.n(numX49.tnTj78("bjVd"));
        throw null;
    }

    public final List a2() {
        return C1110A.V(Z1().f1044l);
    }

    public final void b2() {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        Toolbar toolbar = (Toolbar) ((C0491z) c0453g.f4095d).e;
        j.f(toolbar, numX49.tnTj78("bjVi"));
        toolbar.setVisibility(8);
    }

    public final boolean c2() {
        Dosri dosri;
        Boolean boolIsRequired;
        C0197e c0197eZ1 = Z1();
        if (c0197eZ1.f1041d.e().isDosriEnabled()) {
            KycRegulatoryProfileStatusResponse kycRegulatoryProfileStatusResponse = c0197eZ1.i;
            if ((kycRegulatoryProfileStatusResponse == null || (dosri = kycRegulatoryProfileStatusResponse.getDosri()) == null || (boolIsRequired = dosri.isRequired()) == null) ? false : boolIsRequired.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d2() {
        Fatca fatca;
        Boolean boolIsRequired;
        C0197e c0197eZ1 = Z1();
        if (c0197eZ1.f1041d.e().isFatcaEnabled()) {
            KycRegulatoryProfileStatusResponse kycRegulatoryProfileStatusResponse = c0197eZ1.i;
            if ((kycRegulatoryProfileStatusResponse == null || (fatca = kycRegulatoryProfileStatusResponse.getFatca()) == null || (boolIsRequired = fatca.isRequired()) == null) ? false : boolIsRequired.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final boolean e2() {
        C0197e c0197eZ1 = Z1();
        return c.b(c0197eZ1.e, A5.b.t0);
    }

    public final boolean f2() {
        C0197e c0197eZ1 = Z1();
        return c.b(c0197eZ1.e, A5.b.f140v0);
    }

    public final void g2() {
        k1().c(this, Y1());
    }

    public final void h2(String str, String str2) {
        C1219h c1219hY1 = Y1();
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hY1.j.put(numX49.tnTj78("bjVE"), str);
        }
        if (str2.length() <= 0) {
            str2 = null;
        }
        if (str2 != null) {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hY1.j.put(numX49.tnTj78("bjVF"), str2);
        }
        k1().c(this, c1219hY1);
    }

    public final void i2(boolean z4) {
        if (z4) {
            g2();
        }
        Navigation.findNavController(this, R.id.maya_kyc_nav_host_fragment).popBackStack();
    }

    public final void j2(Integer num) {
        Navigation.findNavController(this, R.id.maya_kyc_nav_host_fragment).popBackStack(num.intValue(), false);
    }

    public final void k2() {
        o2(R.drawable.maya_ic_navigation_back);
    }

    public final void l2() {
        Window window = getWindow();
        Window window2 = getWindow();
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        new WindowInsetsControllerCompat(window2, (ConstraintLayout) c0453g.f4094b).setAppearanceLightStatusBars(true);
        dLgao9.oVike1(window, 201326592);
        window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.maya_primary_white));
        C0453g c0453g2 = this.f12451s;
        j.d(c0453g2);
        C0491z c0491z = (C0491z) c0453g2.f4095d;
        ViewGroup.LayoutParams layoutParams = ((Toolbar) c0491z.e).getLayoutParams();
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        layoutParams.height = sj.b.b(getResources().getDimension(typedValue.resourceId));
        String strTnTj78 = numX49.tnTj78("bjVH");
        Toolbar toolbar = (Toolbar) c0491z.e;
        j.f(toolbar, strTnTj78);
        toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
    }

    public final void m2() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.mayaColorBackgroundPrimary, typedValue, true);
        int i = typedValue.resourceId;
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(R.attr.mayaColorPrimary, typedValue2, true);
        s2(i, typedValue2.resourceId);
    }

    public final void n2(H8.a aVar) {
        S1();
        G1(getString(R.string.maya_kyc_toolbar_progress_step, Integer.valueOf(aVar.f2143a)));
    }

    public final void o2(int i) {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        ((Toolbar) ((C0491z) c0453g.f4095d).e).setNavigationIcon(i);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        j.g(configuration, numX49.tnTj78("bjVO"));
        super.onConfigurationChanged(configuration);
        X1();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        Lh.c cVarF = W4.a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = cVarF.k();
        super.onCreate(bundle);
        setRequestedOrientation(1);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_kyc, (ViewGroup) null, false);
        int i = R.id.layout_loading_translucent;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_loading_translucent);
        String strTnTj78 = numX49.tnTj78("bjVQ");
        if (viewFindChildViewById != null) {
            if (((LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_view_ziggy_loader)) == null) {
                throw new NullPointerException(strTnTj78.concat(viewFindChildViewById.getResources().getResourceName(R.id.lottie_animation_view_ziggy_loader)));
            }
            G0 g02 = new G0((ConstraintLayout) viewFindChildViewById, 6);
            i = R.id.maya_kyc_nav_host_fragment;
            if (((FragmentContainerView) ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_nav_host_fragment)) != null) {
                i = R.id.maya_kyc_toolbar;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.maya_kyc_toolbar);
                if (viewFindChildViewById2 != null) {
                    C0491z c0491zA = C0491z.a(viewFindChildViewById2);
                    i = R.id.text_view_error_message;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_message);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f12451s = new C0453g(1, constraintLayout, g02, c0491zA, textView);
                        setContentView(constraintLayout);
                        C0453g c0453g = this.f12451s;
                        j.d(c0453g);
                        Q1((C0491z) c0453g.f4095d);
                        C0453g c0453g2 = this.f12451s;
                        j.d(c0453g2);
                        ((Toolbar) ((C0491z) c0453g2.f4095d).e).setNavigationOnClickListener(new d(this, 1));
                        if (bundle != null) {
                            KycCmsContent kycCmsContent = (KycCmsContent) AbstractC0617a.D(bundle, numX49.tnTj78("bjVt"), KycCmsContent.class);
                            if (kycCmsContent != null) {
                                Z1().f = kycCmsContent;
                            }
                            ArrayList arrayListC = AbstractC0617a.C(bundle, numX49.tnTj78("bjVU"), MayaEKYCSelectedDocument.class);
                            if (arrayListC != null) {
                                Z1().f1044l = arrayListC;
                            }
                        }
                        Z1().h(this);
                        Z1().j();
                        X1();
                        this.f12453u = new Handler(Looper.getMainLooper());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6256P = null;
        Z1().f1044l.clear();
        Z1().i();
        if (!this.f12448p) {
            File cacheDir = getApplicationContext().getCacheDir();
            j.f(cacheDir, numX49.tnTj78("bjVe"));
            com.paymaya.mayaui.kyczoloz.utils.d.c(cacheDir);
            this.f12448p = false;
        }
        File filesDir = getApplicationContext().getFilesDir();
        j.f(filesDir, numX49.tnTj78("bjV8"));
        try {
            File file = new File(filesDir, "kycids");
            if (file.exists()) {
                l.f(file);
                yk.a.f();
            }
        } catch (Exception unused) {
            yk.a.d();
        }
        C.f1266a.clear();
        if (p1().e().isPartnerOnboardingEnabled()) {
            a aVarP1 = p1();
            String strTnTj78 = numX49.tnTj78("bjVC");
            aVarP1.e0(strTnTj78);
            aVarP1.t0(false);
            aVarP1.f0(strTnTj78);
            aVarP1.g0(strTnTj78);
        }
        f12445B = null;
        Handler handler = this.f12453u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // M8.O0
    public final void onDismiss() {
        O0 o02 = this.f12446n;
        if (o02 != null) {
            o02.onDismiss();
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        j.g(bundle, numX49.tnTj78("bjV4"));
        super.onRestoreInstanceState(bundle);
        this.f12448p = bundle.getBoolean(numX49.tnTj78("bjVo"));
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
        if (this.f12448p) {
            return;
        }
        File cacheDir = getApplicationContext().getCacheDir();
        j.f(cacheDir, numX49.tnTj78("bjVK"));
        com.paymaya.mayaui.kyczoloz.utils.d.c(cacheDir);
        this.f12448p = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        j.g(bundle, numX49.tnTj78("bjVw"));
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(numX49.tnTj78("bjVc"), Z1().f);
        bundle.putParcelableArrayList(numX49.tnTj78("bjVm"), new ArrayList<>(a2()));
        bundle.putBoolean(numX49.tnTj78("bjVD"), true);
        this.f12448p = true;
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

    public final void p2(View.OnClickListener onClickListener) {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        ((Toolbar) ((C0491z) c0453g.f4095d).e).setNavigationOnClickListener(onClickListener);
    }

    public final void q() {
        n1().a();
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.EKYC_V6;
    }

    public final void q2() {
        Window window = getWindow();
        Window window2 = getWindow();
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        new WindowInsetsControllerCompat(window2, (ConstraintLayout) c0453g.f4094b).setAppearanceLightStatusBars(false);
        window.addFlags(201326592);
        C0453g c0453g2 = this.f12451s;
        j.d(c0453g2);
        ViewCompat.setOnApplyWindowInsetsListener((Toolbar) ((C0491z) c0453g2.f4095d).e, new t(this, 8));
    }

    public final void r2(int i) {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        ((Toolbar) ((C0491z) c0453g.f4095d).e).setBackgroundColor(i);
    }

    public final CharSequence s() {
        NavDestination destination;
        CharSequence label;
        NavBackStackEntry currentBackStackEntry = ActivityKt.findNavController(this, R.id.maya_kyc_nav_host_fragment).getCurrentBackStackEntry();
        return (currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null || (label = destination.getLabel()) == null) ? numX49.tnTj78("bjVh") : label;
    }

    public final void s2(int i, int i4) {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        int color = ContextCompat.getColor(getApplicationContext(), i);
        int color2 = ContextCompat.getColor(getApplicationContext(), i4);
        C0491z c0491z = (C0491z) c0453g.f4095d;
        ((Toolbar) c0491z.e).setBackgroundColor(color);
        ((TextView) c0491z.h).setTextColor(color2);
        ((TextView) c0491z.f4304d).setTextColor(color2);
    }

    public final void t2() {
        C0453g c0453g = this.f12451s;
        j.d(c0453g);
        Toolbar toolbar = (Toolbar) ((C0491z) c0453g.f4095d).e;
        j.f(toolbar, numX49.tnTj78("bjVM"));
        toolbar.setVisibility(0);
    }

    public final void u2(String str) {
        int i = 0;
        if (this.f12454v) {
            C0453g c0453g = this.f12451s;
            j.d(c0453g);
            ((TextView) c0453g.e).setText(str);
            this.f12454v = false;
            C0453g c0453g2 = this.f12451s;
            j.d(c0453g2);
            DecelerateInterpolator decelerateInterpolator = AbstractC1228q.f11227a;
            TextView textView = (TextView) c0453g2.e;
            float height = textView.getHeight() * 0.3f;
            String strTnTj78 = numX49.tnTj78("bjVN");
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, strTnTj78, height);
            objectAnimatorOfFloat.setInterpolator(AbstractC1228q.f11228b);
            objectAnimatorOfFloat.setRepeatCount(0);
            objectAnimatorOfFloat.setDuration(500L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, strTnTj78, height);
            objectAnimatorOfFloat2.setRepeatCount(0);
            objectAnimatorOfFloat2.setDuration(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, strTnTj78, 0.0f);
            objectAnimatorOfFloat3.setInterpolator(AbstractC1228q.f11227a);
            objectAnimatorOfFloat3.setRepeatCount(0);
            objectAnimatorOfFloat3.setDuration(500L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.addListener(new C1223l(textView, 0));
            animatorSet.start();
            Handler handler = this.f12453u;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                Handler handler2 = this.f12453u;
                if (handler2 != null) {
                    handler2.postDelayed(new e(this, i), 1500L);
                }
            }
        }
    }

    public final void v2(int i) {
        T1();
        J1(i);
    }
}
