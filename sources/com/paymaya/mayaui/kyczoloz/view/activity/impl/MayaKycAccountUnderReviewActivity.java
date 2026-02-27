package com.paymaya.mayaui.kyczoloz.view.activity.impl;

import Ag.l;
import B5.i;
import D.C0187u;
import D8.C0196d;
import D8.C0197e;
import I8.b;
import I8.c;
import K8.InterfaceC0277b;
import M8.N0;
import M8.O0;
import M8.P0;
import N5.S;
import W4.a;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycErrorDialogFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaKycAccountUnderReviewActivity extends q implements InterfaceC0277b, O0, N0, P0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f12440r = 0;
    public C0196d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public S f12441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0197e f12442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public O0 f12443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N0 f12444q;

    @Override // K8.InterfaceC0277b
    public final void C(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3903q.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void C0(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3892F.setText(str);
    }

    @Override // M8.N0
    public final void D0() {
        N0 n02 = this.f12444q;
        if (n02 != null) {
            n02.D0();
        }
    }

    @Override // K8.InterfaceC0277b
    public final void F() {
        String string = getString(R.string.maya_kyc_label_validation_code_resent);
        j.f(string, numX49.tnTj78("bjV6"));
        V1(string);
    }

    @Override // K8.InterfaceC0277b
    public final void G(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3910x.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void G0(int i) {
        String strD = AbstractC1236z.d(this, MayaKycAccountUnderReviewActivity.class);
        this.f12443p = new b(this, 0);
        this.f12444q = new c(this, 0);
        MayaKycErrorDialogFragment mayaKycErrorDialogFragment = new MayaKycErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(numX49.tnTj78("bjVa"), 2131231472);
        bundle.putInt(numX49.tnTj78("bjVX"), R.string.maya_label_that_didnt_load_right);
        bundle.putInt(numX49.tnTj78("bjVG"), R.string.maya_label_got_it);
        bundle.putInt(numX49.tnTj78("bjV3"), R.string.maya_label_connection_issue_split);
        bundle.putString(numX49.tnTj78("bjVy"), numX49.tnTj78("bjVv"));
        bundle.putInt(numX49.tnTj78("bjV7"), i);
        mayaKycErrorDialogFragment.setArguments(bundle);
        mayaKycErrorDialogFragment.show(getSupportFragmentManager(), strD);
    }

    @Override // M8.P0
    public final C1219h H() {
        C1219h c1219hD = C1219h.d(EnumC1215d.DEFAULT);
        D.e(c1219hD, p1(), C1112C.f9377a);
        return c1219hD;
    }

    @Override // K8.InterfaceC0277b
    public final void H0(String str) {
        j.g(str, numX49.tnTj78("bjVA"));
        S s9 = this.f12441n;
        j.d(s9);
        TextView textView = s9.f3904r;
        j.f(textView, numX49.tnTj78("bjVY"));
        textView.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void I(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3905s.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void L(KycCmsContent kycCmsContent) {
        j.g(kycCmsContent, numX49.tnTj78("bjVT"));
        C0197e c0197e = this.f12442o;
        if (c0197e != null) {
            c0197e.f = kycCmsContent;
        } else {
            j.n(numX49.tnTj78("bjVR"));
            throw null;
        }
    }

    @Override // K8.InterfaceC0277b
    public final void N0(String str) {
        j.g(str, numX49.tnTj78("bjVp"));
        S s9 = this.f12441n;
        j.d(s9);
        TextView textView = s9.f3891E;
        j.f(textView, numX49.tnTj78("bjV0"));
        textView.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void P(Bitmap bitmap) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3898k.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void P0(Bitmap bitmap) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.e.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void R() {
        S s9 = this.f12441n;
        j.d(s9);
        ConstraintLayout constraintLayout = s9.m.f3627b;
        j.f(constraintLayout, numX49.tnTj78("bjVg"));
        constraintLayout.setVisibility(0);
        S s10 = this.f12441n;
        j.d(s10);
        s10.f3901o.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void T0(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3911y.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void U0(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3893G.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void V(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3887A.setText(str);
    }

    public final void V1(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        FrameLayout frameLayout = s9.f3894a;
        j.f(frameLayout, numX49.tnTj78("bjVf"));
        b0.e(this, frameLayout, str, 0, R.drawable.maya_bg_snackbar_with_border_success, R.style.JekoBoldSmallText_Accent, 1, 0, 600);
    }

    @Override // K8.InterfaceC0277b
    public final void X() {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3907u.setVisibility(8);
        S s10 = this.f12441n;
        j.d(s10);
        s10.f3908v.setVisibility(8);
        S s11 = this.f12441n;
        j.d(s11);
        s11.i.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void X0() {
        S s9 = this.f12441n;
        j.d(s9);
        ConstraintLayout constraintLayout = s9.m.f3627b;
        j.f(constraintLayout, numX49.tnTj78("bjV1"));
        constraintLayout.setVisibility(8);
        S s10 = this.f12441n;
        j.d(s10);
        s10.f3901o.setVisibility(0);
    }

    @Override // K8.InterfaceC0277b
    public final void Y(Bitmap bitmap) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final void Z(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        C.r0(s9.f3896d, new l(4, this, str));
    }

    @Override // K8.InterfaceC0277b
    public final void a0(String str) {
        j.g(str, numX49.tnTj78("bjVn"));
        S s9 = this.f12441n;
        j.d(s9);
        TextView textView = s9.f3909w;
        j.f(textView, numX49.tnTj78("bjVx"));
        textView.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void b0(int i) {
        String strD = AbstractC1236z.d(this, MayaKycAccountUnderReviewActivity.class);
        this.f12443p = new b(this, 1);
        this.f12444q = new c(this, 1);
        String string = getString(R.string.maya_fragment_kyc_account_under_review_screen_label);
        j.f(string, numX49.tnTj78("bjVs"));
        MayaKycErrorDialogFragment mayaKycErrorDialogFragment = new MayaKycErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(numX49.tnTj78("bjV5"), 2131231472);
        bundle.putInt(numX49.tnTj78("bjVJ"), R.string.maya_label_that_didnt_load_right);
        bundle.putInt(numX49.tnTj78("bjVI"), R.string.maya_label_got_it);
        bundle.putInt(numX49.tnTj78("bjVq"), R.string.maya_label_connection_issue_split);
        bundle.putString(numX49.tnTj78("bjVz"), string);
        bundle.putInt(numX49.tnTj78("bjVl"), i);
        mayaKycErrorDialogFragment.setArguments(bundle);
        mayaKycErrorDialogFragment.show(getSupportFragmentManager(), strD);
    }

    @Override // K8.InterfaceC0277b
    public final void b1(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3889C.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void c0(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3907u.setText(str);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // K8.InterfaceC0277b
    public final KycCmsContent getCmsContent() {
        C0197e c0197e = this.f12442o;
        if (c0197e != null) {
            return c0197e.f;
        }
        j.n(numX49.tnTj78("bjVW"));
        throw null;
    }

    @Override // K8.InterfaceC0277b
    public final void h0(String str) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3912z.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void i1() {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3888B.setVisibility(8);
        S s10 = this.f12441n;
        j.d(s10);
        s10.f3887A.setVisibility(8);
        S s11 = this.f12441n;
        j.d(s11);
        s11.f3897g.setVisibility(8);
    }

    @Override // L8.d
    public final void j1() {
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        Lh.c cVarF = a.e().f();
        O5.a aVar = (O5.a) cVarF.c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.m = cVarF.j();
        this.f12442o = cVarF.k();
        super.onCreate(bundle);
        S sA = S.a(getLayoutInflater(), null);
        this.f12441n = sA;
        setContentView(sA.f3894a);
        S s9 = this.f12441n;
        j.d(s9);
        Q1(s9.f3900n);
        C0196d c0196d = this.m;
        String strTnTj78 = numX49.tnTj78("bjVP9");
        if (c0196d == null) {
            j.n(strTnTj78);
            throw null;
        }
        c0196d.h(this);
        C0196d c0196d2 = this.m;
        if (c0196d2 == null) {
            j.n(strTnTj78);
            throw null;
        }
        c0196d2.j();
        S s10 = this.f12441n;
        j.d(s10);
        ((Toolbar) s10.f3900n.e).setNavigationOnClickListener(new Ba.a(this, 14));
        C0196d c0196d3 = this.m;
        if (c0196d3 == null) {
            j.n(strTnTj78);
            throw null;
        }
        c0196d3.j();
        c0196d3.p();
        S s11 = this.f12441n;
        j.d(s11);
        final int i = 0;
        C.r0(s11.f3895b.c, new Function0(this) { // from class: I8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAccountUnderReviewActivity f2259b;

            {
                this.f2259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity = this.f2259b;
                switch (i) {
                    case 0:
                        int i4 = MayaKycAccountUnderReviewActivity.f12440r;
                        Object systemService = mayaKycAccountUnderReviewActivity.getSystemService("clipboard");
                        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String string = mayaKycAccountUnderReviewActivity.getString(R.string.maya_kyc_label_validation_code);
                        S s12 = mayaKycAccountUnderReviewActivity.f12441n;
                        j.d(s12);
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(string, s12.f3892F.getText()));
                        String string2 = mayaKycAccountUnderReviewActivity.getString(R.string.maya_kyc_label_validation_code_copied);
                        j.f(string2, "getString(...)");
                        mayaKycAccountUnderReviewActivity.V1(string2);
                        return Unit.f18162a;
                    default:
                        int i6 = MayaKycAccountUnderReviewActivity.f12440r;
                        C0196d c0196d4 = mayaKycAccountUnderReviewActivity.m;
                        if (c0196d4 != null) {
                            c0196d4.r();
                            return Unit.f18162a;
                        }
                        j.n("mMayaKycAccountUnderReviewFragmentPresenter");
                        throw null;
                }
            }
        });
        S s12 = this.f12441n;
        j.d(s12);
        final int i4 = 1;
        C.r0(s12.c, new Function0(this) { // from class: I8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycAccountUnderReviewActivity f2259b;

            {
                this.f2259b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity = this.f2259b;
                switch (i4) {
                    case 0:
                        int i42 = MayaKycAccountUnderReviewActivity.f12440r;
                        Object systemService = mayaKycAccountUnderReviewActivity.getSystemService("clipboard");
                        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        String string = mayaKycAccountUnderReviewActivity.getString(R.string.maya_kyc_label_validation_code);
                        S s122 = mayaKycAccountUnderReviewActivity.f12441n;
                        j.d(s122);
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(string, s122.f3892F.getText()));
                        String string2 = mayaKycAccountUnderReviewActivity.getString(R.string.maya_kyc_label_validation_code_copied);
                        j.f(string2, "getString(...)");
                        mayaKycAccountUnderReviewActivity.V1(string2);
                        return Unit.f18162a;
                    default:
                        int i6 = MayaKycAccountUnderReviewActivity.f12440r;
                        C0196d c0196d4 = mayaKycAccountUnderReviewActivity.m;
                        if (c0196d4 != null) {
                            c0196d4.r();
                            return Unit.f18162a;
                        }
                        j.n("mMayaKycAccountUnderReviewFragmentPresenter");
                        throw null;
                }
            }
        });
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        if (p1().e().isPartnerOnboardingEnabled()) {
            com.paymaya.data.preference.a aVarP1 = p1();
            String strTnTj78 = numX49.tnTj78("bjVPP");
            aVarP1.e0(strTnTj78);
            aVarP1.t0(false);
            aVarP1.f0(strTnTj78);
            aVarP1.g0(strTnTj78);
        }
        super.onDestroy();
    }

    @Override // M8.O0
    public final void onDismiss() {
        O0 o02 = this.f12443p;
        if (o02 != null) {
            o02.onDismiss();
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

    @Override // L8.d
    public final void q() {
        n1().a();
    }

    @Override // K8.InterfaceC0277b
    public final void q0(Bitmap bitmap) {
        S s9 = this.f12441n;
        j.d(s9);
        s9.j.setImageBitmap(bitmap);
    }

    @Override // K8.InterfaceC0277b
    public final boolean s0() {
        C0197e c0197e = this.f12442o;
        if (c0197e != null) {
            return c0197e.f != null;
        }
        j.n(numX49.tnTj78("bjVPb"));
        throw null;
    }

    @Override // K8.InterfaceC0277b
    public final void v0(String str) {
        j.g(str, numX49.tnTj78("bjVP2"));
        S s9 = this.f12441n;
        j.d(s9);
        TextView textView = s9.f3890D;
        j.f(textView, numX49.tnTj78("bjVPL"));
        textView.setText(str);
    }

    @Override // K8.InterfaceC0277b
    public final void w0() {
        S s9 = this.f12441n;
        j.d(s9);
        s9.f3906t.setVisibility(8);
        S s10 = this.f12441n;
        j.d(s10);
        s10.f3905s.setVisibility(8);
        S s11 = this.f12441n;
        j.d(s11);
        s11.h.setVisibility(8);
    }

    @Override // K8.InterfaceC0277b
    public final void x0() {
        S s9 = this.f12441n;
        j.d(s9);
        ConstraintLayout constraintLayout = s9.f3899l;
        j.f(constraintLayout, numX49.tnTj78("bjVPr"));
        constraintLayout.setVisibility(8);
        S s10 = this.f12441n;
        j.d(s10);
        TextView textView = s10.f3902p;
        j.f(textView, numX49.tnTj78("bjVPZ"));
        textView.setVisibility(8);
    }
}
