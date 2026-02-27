package com.paymaya.mayaui.newmayacredit.view.activity.impl;

import A7.j;
import B5.i;
import D.C0187u;
import M9.b;
import N5.C0450f;
import N9.a;
import Q9.InterfaceC0579i;
import S5.c;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.util.LinkedHashSet;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCreditInterstitialActivity extends q implements b, W6.b, InterfaceC0579i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13073r = 0;
    public C0450f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MayaLoadingDialogFragment f13074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f13075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13076p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1033d f13077q = C1034e.b(new a(this, 0));

    @Override // y5.g
    public final void Q(Fragment fragment) {
    }

    public final j V1() {
        j jVar = this.f13075o;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bjKB"));
        throw null;
    }

    public final void W1() {
        E.a(numX49.tnTj78("bjKu"), numX49.tnTj78("bjKV"));
        MayaLoadingDialogFragment mayaLoadingDialogFragment = this.f13074n;
        if (mayaLoadingDialogFragment != null) {
            mayaLoadingDialogFragment.dismissAllowingStateLoss();
        }
    }

    public final void X1(String str, View.OnClickListener onClickListener) {
        LinkedHashSet linkedHashSet = E.f10412a;
        E.a(numX49.tnTj78("bjKj"), numX49.tnTj78("bjKS").concat(str));
        M2.b.Z(0, null, str, getString(R.string.maya_label_try_again), getString(R.string.maya_label_cancel), false, null, onClickListener, false, 355).show(getSupportFragmentManager(), numX49.tnTj78("bjKd"));
    }

    public final void Y1() {
        E.a(numX49.tnTj78("bjKi"), numX49.tnTj78("bjKE"));
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bjKF"), numX49.tnTj78("bjKH"));
        bundle.putBoolean(numX49.tnTj78("bjKO"), false);
        MayaLoadingDialogFragment mayaLoadingDialogFragment = new MayaLoadingDialogFragment();
        mayaLoadingDialogFragment.setArguments(bundle);
        this.f13074n = mayaLoadingDialogFragment;
        mayaLoadingDialogFragment.show(getSupportFragmentManager(), numX49.tnTj78("bjKQ"));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final boolean l1() {
        return this.f13076p;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().k().f4754a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13075o = new j((com.paymaya.data.preference.a) aVar.e.get(), aVar.A());
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_credit_interstitial, (ViewGroup) null, false);
        int i = R.id.button_credit_apply_now;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_credit_apply_now);
        if (button != null) {
            i = R.id.constraint_layout_interstitial_container_1;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_interstitial_container_1)) != null) {
                i = R.id.constraint_layout_interstitial_container_2;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_interstitial_container_2)) != null) {
                    i = R.id.constraint_layout_interstitial_container_3;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_interstitial_container_3)) != null) {
                        i = R.id.constraint_layout_interstitial_container_4;
                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_interstitial_container_4)) != null) {
                            i = R.id.container;
                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.container)) != null) {
                                i = R.id.image_view_close;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_close);
                                if (imageView != null) {
                                    i = R.id.image_view_credit_cash_in;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_cash_in)) != null) {
                                        i = R.id.image_view_credit_short_in_cash;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_short_in_cash)) != null) {
                                            i = R.id.image_view_credit_verified_seller;
                                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_verified_seller)) != null) {
                                                i = R.id.image_view_elevate_qr;
                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_elevate_qr)) != null) {
                                                    i = R.id.image_view_qr_ph;
                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_qr_ph)) != null) {
                                                        i = R.id.text_view_credit_application_header_description_1;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_application_header_description_1)) != null) {
                                                            i = R.id.text_view_credit_interstitial_coming_soon;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_coming_soon)) != null) {
                                                                i = R.id.text_view_credit_interstitial_header_description;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_description)) != null) {
                                                                    i = R.id.text_view_credit_interstitial_header_description_4;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_description_4)) != null) {
                                                                        i = R.id.text_view_credit_interstitial_header_title;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_title)) != null) {
                                                                            i = R.id.text_view_credit_interstitial_header_title_1;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_title_1)) != null) {
                                                                                i = R.id.text_view_credit_interstitial_header_title_2;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_title_2)) != null) {
                                                                                    i = R.id.text_view_credit_interstitial_header_title_3;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_title_3)) != null) {
                                                                                        i = R.id.text_view_credit_interstitial_header_title_4;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_interstitial_header_title_4)) != null) {
                                                                                            i = R.id.text_view_note_description;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_note_description)) != null) {
                                                                                                ScrollView scrollView = (ScrollView) viewInflate;
                                                                                                this.m = new C0450f((ViewGroup) scrollView, (Object) button, (Object) imageView, 0);
                                                                                                setContentView(scrollView);
                                                                                                V1().h(this);
                                                                                                if (bundle == null) {
                                                                                                    V1().j();
                                                                                                }
                                                                                                C0450f c0450f = this.m;
                                                                                                kotlin.jvm.internal.j.d(c0450f);
                                                                                                Ke.b.b((ImageView) c0450f.f4088d, new a(this, 1));
                                                                                                C0450f c0450f2 = this.m;
                                                                                                kotlin.jvm.internal.j.d(c0450f2);
                                                                                                Ke.b.b((Button) c0450f2.f4087b, new a(this, 2));
                                                                                                return;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjKt").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
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
        w1(true);
        y1(true);
        x1(true);
        M1(R.color.pattens_blue);
        C1220i c1220iK1 = k1();
        C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
        AbstractC1414e.m(c1219hD, EnumC1216e.INTRO, 2);
        c1220iK1.c(this, c1219hD);
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

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.CREDIT;
    }
}
