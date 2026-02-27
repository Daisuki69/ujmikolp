package com.paymaya.mayaui.profile.view.activity.impl;

import B5.i;
import Bb.a;
import D.C0187u;
import Kh.I;
import N5.C0447e;
import O5.g;
import S5.c;
import W6.b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.ProfileBadgesConfig;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaVerifiedSellerBottomSheetDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import java.util.List;
import kotlin.jvm.internal.j;
import na.InterfaceC1942a;
import oa.ViewOnClickListenerC1973a;
import qa.d;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaProfileActivity extends q implements InterfaceC1942a, d, b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13490r = 0;
    public C0447e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f13491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AppCompatImageView f13492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AppCompatImageView f13493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AppCompatTextView f13494q;

    public static final void W1(MayaProfileActivity mayaProfileActivity) {
        List<String> listVerifiedSellerLevelList;
        a aVarV1 = mayaProfileActivity.V1();
        if (j.b(aVarV1.e.l(), numX49.tnTj78("bjMP"))) {
            com.paymaya.data.preference.a aVar = aVarV1.e;
            ProfileBadgesConfig profileBadgesConfigMProfileBadgesConfig = aVar.e().mProfileBadgesConfig();
            if (profileBadgesConfigMProfileBadgesConfig == null || (listVerifiedSellerLevelList = profileBadgesConfigMProfileBadgesConfig.verifiedSellerLevelList()) == null || !listVerifiedSellerLevelList.contains(svM7M6.getString(aVar.f11330b, numX49.tnTj78("bjMb"), numX49.tnTj78("bjM2")))) {
                return;
            }
            MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) aVarV1.c.get());
            mayaProfileActivity2.getClass();
            C1219h c1219h = new C1219h();
            c1219h.n(17);
            c1219h.t(EnumC1217f.VERIFIED_SELLER);
            c1219h.i();
            mayaProfileActivity2.v1(c1219h);
            MayaVerifiedSellerBottomSheetDialogFragment mayaVerifiedSellerBottomSheetDialogFragment = new MayaVerifiedSellerBottomSheetDialogFragment();
            mayaVerifiedSellerBottomSheetDialogFragment.show(mayaProfileActivity2.getSupportFragmentManager(), mayaVerifiedSellerBottomSheetDialogFragment.getTag());
        }
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        y1(true);
        x1(true);
        r1();
        t1();
    }

    public final a V1() {
        a aVar = this.f13491n;
        if (aVar != null) {
            return aVar;
        }
        j.n(numX49.tnTj78("bjML"));
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return new ActivityTransition(R.anim.maya_slide_in_from_left_short, R.anim.maya_slide_out_to_left, R.anim.maya_hold, R.anim.maya_hold);
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.e == null) {
            O5.a aVar = aVarE.f6267a;
            I i = new I(27);
            aVar.getClass();
            aVarE.e = new g(aVar.f4704b, i);
        }
        O5.a aVar2 = aVarE.e.f4756a;
        this.f21073d = (C1220i) aVar2.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f = (i) aVar2.f4659D.get();
        this.f21074g = (c) aVar2.f4724k.get();
        this.h = (C0187u) aVar2.f.get();
        this.i = (C1232v) aVar2.f4663F.get();
        this.f13491n = new a((com.paymaya.data.preference.a) aVar2.e.get(), 27);
        setContentView(R.layout.maya_activity_profile);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_profile, (ViewGroup) null, false);
        int i4 = R.id.account_status_text_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.account_status_text_view);
        if (appCompatTextView != null) {
            i4 = R.id.arrow_back_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.arrow_back_image_view);
            if (appCompatImageView != null) {
                i4 = R.id.frame_layout_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
                if (frameLayout != null) {
                    i4 = R.id.qr_image_view;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.qr_image_view);
                    if (appCompatImageView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.m = new C0447e(constraintLayout, appCompatTextView, appCompatImageView, frameLayout, appCompatImageView2, 1);
                        setContentView(constraintLayout);
                        C0447e c0447e = this.m;
                        j.d(c0447e);
                        this.f13492o = (AppCompatImageView) c0447e.f4080d;
                        C0447e c0447e2 = this.m;
                        j.d(c0447e2);
                        this.f13493p = (AppCompatImageView) c0447e2.f;
                        C0447e c0447e3 = this.m;
                        j.d(c0447e3);
                        this.f13494q = (AppCompatTextView) c0447e3.c;
                        AppCompatImageView appCompatImageView3 = this.f13492o;
                        if (appCompatImageView3 == null) {
                            j.n(numX49.tnTj78("bjMk"));
                            throw null;
                        }
                        appCompatImageView3.setOnClickListener(new ViewOnClickListenerC1973a(this, 0));
                        AppCompatImageView appCompatImageView4 = this.f13493p;
                        if (appCompatImageView4 == null) {
                            j.n(numX49.tnTj78("bjMZ"));
                            throw null;
                        }
                        appCompatImageView4.setOnClickListener(new ViewOnClickListenerC1973a(this, 1));
                        AppCompatTextView appCompatTextView2 = this.f13494q;
                        if (appCompatTextView2 == null) {
                            j.n(numX49.tnTj78("bjMr"));
                            throw null;
                        }
                        appCompatTextView2.setOnClickListener(new ViewOnClickListenerC1973a(this, 2));
                        V1().h(this);
                        if (bundle == null) {
                            V1().j();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjMB").concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        W4.a.e().e = null;
        V1().i();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
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
        return EnumC1215d.MENU;
    }
}
