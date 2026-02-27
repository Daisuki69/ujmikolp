package com.paymaya.mayaui.newmayacredit.view.activity.impl;

import B5.i;
import D.C0187u;
import Ke.b;
import M8.C0332a;
import M9.a;
import N5.C0441c;
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
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCreditIneligibleActivity extends q implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f13068r = 0;
    public C0441c m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ae.a f13071p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13069n = numX49.tnTj78("bjKP");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f13072q = true;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final boolean l1() {
        return this.f13072q;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().D().f4752a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f13071p = new Ae.a(29);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_credit_ineligible, (ViewGroup) null, false);
        int i = R.id.button_got_it;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_got_it);
        if (button != null) {
            i = R.id.confirmation_fragment_container_constraint_layout;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.confirmation_fragment_container_constraint_layout)) != null) {
                i = R.id.image_view_credit_header_image_ineligible;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_credit_header_image_ineligible)) != null) {
                    i = R.id.text_view_ineligible_subtitle;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ineligible_subtitle)) != null) {
                        i = R.id.text_view_ineligible_title;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_ineligible_title)) != null) {
                            ScrollView scrollView = (ScrollView) viewInflate;
                            this.m = new C0441c(scrollView, button, 2);
                            setContentView(scrollView);
                            Ae.a aVar2 = this.f13071p;
                            String strTnTj78 = numX49.tnTj78("bjKb");
                            if (aVar2 == null) {
                                j.n(strTnTj78);
                                throw null;
                            }
                            aVar2.h(this);
                            if (bundle == null) {
                                String stringExtra = getIntent().getStringExtra(numX49.tnTj78("bjK2"));
                                if (stringExtra == null) {
                                    stringExtra = numX49.tnTj78("bjKL");
                                }
                                this.f13069n = stringExtra;
                                this.f13070o = getIntent().getBooleanExtra(numX49.tnTj78("bjKr"), false);
                                Ae.a aVar3 = this.f13071p;
                                if (aVar3 == null) {
                                    j.n(strTnTj78);
                                    throw null;
                                }
                                aVar3.j();
                            }
                            C0441c c0441c = this.m;
                            j.d(c0441c);
                            b.b((Button) c0441c.c, new C0332a(this, 17));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjKZ").concat(viewInflate.getResources().getResourceName(i)));
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
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("bjKk") + this.f13069n);
        c1219hE.i();
        c1220iK1.c(this, c1219hE);
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
