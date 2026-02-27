package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import A5.b;
import B5.i;
import Bj.C0165x;
import C7.f;
import G5.t;
import G7.C0265h;
import G7.F;
import J7.e;
import L9.B;
import N5.C;
import N5.C0449e1;
import N5.C0450f;
import N5.C0466m;
import N5.C0489y;
import N5.C0491z;
import N5.E;
import N5.G0;
import N5.Z;
import N5.v1;
import P9.k;
import Q6.r;
import Q9.D;
import Q9.G;
import S9.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.datasource.cache.c;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.MayaXpApi;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.store.C1266j0;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.common.view.dialog.impl.MayaInfoTextConfirmationBottomSheetDialogFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import defpackage.AbstractC1414e;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import m5.C1847a;
import s5.d;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditFragment extends MayaBaseLoadingFragment implements k, a, t {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f13226A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public DashboardLayoutManager f13227A1;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f13228B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public Button f13229B1;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ImageView f13230C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public B f13231C1;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ProgressBar f13232D0;
    public G D1;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Button f13233E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Button f13235F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f13237G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public BannerAdCarousel f13238G1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f13239H0;
    public BannerAdCarousel H1;
    public Button I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public M f13240I1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public C0449e1 f13241J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public HtmlTextView f13243K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public C0450f f13244L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public HtmlTextView f13245M0;
    public C0491z N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public ImageView f13246O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public TextView f13247P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public TextView f13248Q0;
    public Group R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public G0 f13249S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public C0489y f13250T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ConstraintLayout f13251U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public HtmlTextView f13252V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public HtmlTextView f13253W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public HtmlTextView f13254X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public LottieAnimationView f13255Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public C0466m f13256Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public RecyclerView f13257a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f13258b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public TextView f13259c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f13260d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public RecyclerView f13261e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Group f13262f1;
    public G0 g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public G0 f13263h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public Group f13264i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Group f13265j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public C f13266k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public ConstraintLayout f13267l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f13268m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TextView f13269n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public E f13270o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public TextView f13271o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SpringView f13272p0;
    public Button p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public v1 f13273q0;
    public Button q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f13274r0;
    public Button r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f13275s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public AppCompatImageView f13276s1;
    public TextView t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public TextView f13277t1;
    public ImageView u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public TextView f13278u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ImageView f13279v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public C f13280v1;
    public Button w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public Z f13281w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public AppCompatTextView f13282x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public C0449e1 f13283x1;
    public TextView y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public HtmlTextView f13284y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f13285z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public O9.a f13286z1;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public final InterfaceC1033d f13234E1 = C1034e.b(new D(this, 0));

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public final InterfaceC1033d f13236F1 = C1034e.b(new D(this, 1));

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public final boolean f13242J1 = true;

    public static final void a2(NewMayaCreditFragment newMayaCreditFragment) {
        C1220i c1220iO1 = newMayaCreditFragment.o1();
        FragmentActivity activity = newMayaCreditFragment.getActivity();
        EnumC1215d enumC1215d = EnumC1215d.CREDIT;
        C1219h c1219hD = C1219h.d(enumC1215d);
        EnumC1216e enumC1216e = EnumC1216e.OPT_IN;
        c1219hD.r(enumC1216e);
        c1219hD.n(17);
        AbstractC1414e.n(c1219hD, EnumC1217f.DATA_PRIVACY, c1220iO1, activity, c1219hD);
        C1220i c1220iO12 = newMayaCreditFragment.o1();
        FragmentActivity activity2 = newMayaCreditFragment.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.r(enumC1216e);
        c1219hD2.n(22);
        c1219hD2.i();
        c1220iO12.c(activity2, c1219hD2);
        String string = newMayaCreditFragment.getString(R.string.maya_label_credit_management_data_privacy_policy);
        j.f(string, "getString(...)");
        String string2 = newMayaCreditFragment.getString(R.string.maya_label_credit_management_data_privacy_policy_content);
        j.f(string2, "getString(...)");
        String string3 = newMayaCreditFragment.getString(R.string.maya_label_got_it);
        j.f(string3, "getString(...)");
        Pair pair = (Pair) newMayaCreditFragment.f13234E1.getValue();
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = new MayaDataPrivacyWebContentBottomSheetDialogFragment();
        Bundle bundleE = c.e("title", string, "web_content", string2);
        bundleE.putString("button_text", string3);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.setArguments(bundleE);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12310Z = pair != null ? (Function1) pair.f18161b : null;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.show(newMayaCreditFragment.requireActivity().getSupportFragmentManager(), "confirmation_dialog");
    }

    public static final void b2(NewMayaCreditFragment newMayaCreditFragment) {
        G g8 = newMayaCreditFragment.D1;
        if (g8 != null) {
            String string = newMayaCreditFragment.getString(R.string.maya_label_credit_latest_bill);
            j.f(string, "getString(...)");
            String string2 = newMayaCreditFragment.getString(R.string.maya_label_credit_latest_billing_stmt);
            j.f(string2, "getString(...)");
            String string3 = newMayaCreditFragment.getString(R.string.maya_label_credit_avoid_penalty);
            j.f(string3, "getString(...)");
            Pair pair = (Pair) newMayaCreditFragment.f13236F1.getValue();
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
            MayaInfoTextConfirmationBottomSheetDialogFragment mayaInfoTextConfirmationBottomSheetDialogFragment = new MayaInfoTextConfirmationBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", string);
            bundle.putCharSequence("description", string2);
            bundle.putCharSequence("info_description", string3);
            bundle.putString("button_primary_value", pair != null ? (String) pair.f18160a : null);
            mayaInfoTextConfirmationBottomSheetDialogFragment.setArguments(bundle);
            mayaInfoTextConfirmationBottomSheetDialogFragment.f11855S = pair != null ? (Function1) pair.f18161b : null;
            mayaInfoTextConfirmationBottomSheetDialogFragment.show(mayaDashboardActivity.getSupportFragmentManager(), "latest_bill_tooltip");
        }
    }

    public static final void c2(NewMayaCreditFragment newMayaCreditFragment) {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.SUMMARY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.TRANSFER_TO_WALLET);
        c1219h.i();
        newMayaCreditFragment.z1(c1219h);
        B bP1 = newMayaCreditFragment.P1();
        CreditResponse creditResponse = bP1.f2859k;
        if (creditResponse != null) {
            bP1.l(new f(6, bP1, creditResponse));
            return;
        }
        NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((k) bP1.c.get());
        MayaBaseLoadingFragment.N1(newMayaCreditFragment2, 200, newMayaCreditFragment2.getString(R.string.maya_label_credit_error_dialog_description), newMayaCreditFragment2.getString(R.string.maya_label_credit_error_dialog_title), new Q9.E(newMayaCreditFragment2, 4), 24);
    }

    public static final void d2(NewMayaCreditFragment newMayaCreditFragment) {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.SUMMARY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.ACCOUNT_SUMMARY);
        c1219h.i();
        newMayaCreditFragment.z1(c1219h);
        B bP1 = newMayaCreditFragment.P1();
        CreditResponse creditResponse = bP1.f2859k;
        if (creditResponse != null) {
            NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((k) bP1.c.get());
            newMayaCreditFragment2.getClass();
            G g8 = newMayaCreditFragment2.D1;
            if (g8 != null) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                mayaDashboardActivity.n1();
                Intent intent = new Intent(mayaDashboardActivity, (Class<?>) NewMayaCreditActivity.class);
                intent.putExtra("feature", "summary");
                intent.putExtra("credit_response", creditResponse);
                mayaDashboardActivity.startActivity(intent);
            }
        }
    }

    public static final void e2(NewMayaCreditFragment newMayaCreditFragment) {
        B bP1 = newMayaCreditFragment.P1();
        if (bP1.f2857d.f11330b.getBoolean("key_is_show_credit_balance", true)) {
            bP1.f2857d.f11330b.edit().putBoolean("key_is_show_credit_balance", false).apply();
            bP1.m();
            NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((k) bP1.c.get());
            ImageView imageView = newMayaCreditFragment2.f13279v0;
            if (imageView == null) {
                j.n("mImageViewShowHideCreditAmount");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(newMayaCreditFragment2.requireActivity(), R.drawable.maya_ic_eye_hide_toggle));
            ((NewMayaCreditFragment) ((k) bP1.c.get())).R1();
            return;
        }
        bP1.f2857d.f11330b.edit().putBoolean("key_is_show_credit_balance", true).apply();
        bP1.y();
        NewMayaCreditFragment newMayaCreditFragment3 = (NewMayaCreditFragment) ((k) bP1.c.get());
        ImageView imageView2 = newMayaCreditFragment3.f13279v0;
        if (imageView2 == null) {
            j.n("mImageViewShowHideCreditAmount");
            throw null;
        }
        imageView2.setImageDrawable(ContextCompat.getDrawable(newMayaCreditFragment3.requireActivity(), R.drawable.maya_ic_eye_show_toggle));
        ((NewMayaCreditFragment) ((k) bP1.c.get())).f2();
    }

    /* JADX WARN: Removed duplicated region for block: B:286:0x06f2 A[PHI: r3
  0x06f2: PHI (r3v36 int) = (r3v35 int), (r3v37 int), (r3v38 int), (r3v39 int), (r3v40 int) binds: [B:223:0x054d, B:225:0x0558, B:227:0x0563, B:229:0x056e, B:231:0x0579] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0707 A[PHI: r14
  0x0707: PHI (r14v63 int) = (r14v62 int), (r14v64 int) binds: [B:211:0x0505, B:215:0x051b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0733 A[PHI: r14
  0x0733: PHI (r14v56 int) = (r14v55 int), (r14v57 int), (r14v58 int) binds: [B:173:0x0416, B:175:0x0423, B:298:0x0732] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0735 A[PHI: r15
  0x0735: PHI (r15v13 int) = (r15v12 int), (r15v14 int) binds: [B:177:0x0430, B:179:0x0441] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0797 A[PHI: r3
  0x0797: PHI (r3v4 int) = 
  (r3v3 int)
  (r3v5 int)
  (r3v6 int)
  (r3v7 int)
  (r3v8 int)
  (r3v9 int)
  (r3v10 int)
  (r3v11 int)
  (r3v12 int)
  (r3v13 int)
  (r3v14 int)
 binds: [B:5:0x0024, B:7:0x002f, B:9:0x003e, B:11:0x004a, B:13:0x0055, B:15:0x005e, B:17:0x006d, B:19:0x0079, B:21:0x0085, B:23:0x0090, B:25:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View G1(android.view.LayoutInflater r57, android.view.ViewGroup r58) {
        /*
            Method dump skipped, instruction units count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment.G1(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_credit, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View K1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.maya_view_maintenance_dashboard, viewGroup, false);
    }

    public final B P1() {
        B b8 = this.f13231C1;
        if (b8 != null) {
            return b8;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final float Q1(float f, float f3, View view) {
        ProgressBar progressBar = this.f13232D0;
        if (progressBar == null) {
            j.n("mProgressBar");
            throw null;
        }
        progressBar.measure(0, 0);
        view.measure(0, 0);
        ProgressBar progressBar2 = this.f13232D0;
        if (progressBar2 == null) {
            j.n("mProgressBar");
            throw null;
        }
        int left = progressBar2.getLeft();
        ProgressBar progressBar3 = this.f13232D0;
        if (progressBar3 == null) {
            j.n("mProgressBar");
            throw null;
        }
        float f7 = left;
        float f10 = (((f / f3) * (r1 - left)) + f7) - (r7 / 2);
        float right = progressBar3.getRight() - view.getWidth();
        return f10 < f7 ? f7 : f10 > right ? right : f10;
    }

    public final void R1() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.HIDE_BALANCE);
        c1219hH.i();
        A1(c1219hH);
        O9.a aVar = this.f13286z1;
        if (aVar != null) {
            aVar.f4765b = false;
            aVar.notifyDataSetChanged();
        }
        TextView textView = this.f13275s0;
        if (textView == null) {
            j.n("mTextViewCreditAmount");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.t0;
        if (textView2 == null) {
            j.n("mTextViewCreditAmountMasked");
            throw null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.y0;
        if (textView3 == null) {
            j.n("mTextViewCreditUsed");
            throw null;
        }
        textView3.setVisibility(4);
        TextView textView4 = this.f13285z0;
        if (textView4 == null) {
            j.n("mTextViewCreditUsedMasked");
            throw null;
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f13226A0;
        if (textView5 == null) {
            j.n("mTextViewCreditAvailable");
            throw null;
        }
        textView5.setVisibility(8);
        TextView textView6 = this.f13228B0;
        if (textView6 == null) {
            j.n("mTextViewCreditAvailableMasked");
            throw null;
        }
        textView6.setVisibility(0);
        ImageView imageView = this.f13230C0;
        if (imageView == null) {
            j.n("mImageViewProgressIndicator");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        TextView textView7 = this.f13285z0;
        if (textView7 == null) {
            j.n("mTextViewCreditUsedMasked");
            throw null;
        }
        layoutParams2.topToBottom = textView7.getId();
        ImageView imageView2 = this.f13230C0;
        if (imageView2 == null) {
            j.n("mImageViewProgressIndicator");
            throw null;
        }
        imageView2.requestLayout();
        ImageView imageView3 = this.u0;
        if (imageView3 == null) {
            j.n("mImageViewLockedCredit");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        TextView textView8 = this.t0;
        if (textView8 == null) {
            j.n("mTextViewCreditAmountMasked");
            throw null;
        }
        layoutParams4.bottomToBottom = textView8.getId();
        TextView textView9 = this.t0;
        if (textView9 == null) {
            j.n("mTextViewCreditAmountMasked");
            throw null;
        }
        layoutParams4.startToEnd = textView9.getId();
        TextView textView10 = this.t0;
        if (textView10 == null) {
            j.n("mTextViewCreditAmountMasked");
            throw null;
        }
        layoutParams4.topToTop = textView10.getId();
        ImageView imageView4 = this.u0;
        if (imageView4 == null) {
            j.n("mImageViewLockedCredit");
            throw null;
        }
        imageView4.setLayoutParams(layoutParams4);
        ImageView imageView5 = this.u0;
        if (imageView5 != null) {
            imageView5.requestLayout();
        } else {
            j.n("mImageViewLockedCredit");
            throw null;
        }
    }

    public final void S1() {
        C0450f c0450f = this.f13244L0;
        if (c0450f != null) {
            ((ConstraintLayout) c0450f.c).setVisibility(8);
        } else {
            j.n("mViewCreditApplicationHeader");
            throw null;
        }
    }

    public final void T1() {
        C0489y c0489y = this.f13250T0;
        if (c0489y != null) {
            c0489y.f4296b.setVisibility(8);
        } else {
            j.n("mViewCreditDiscoveryHeader");
            throw null;
        }
    }

    public final void U1() {
        v1 v1Var = this.f13273q0;
        if (v1Var != null) {
            ((ConstraintLayout) v1Var.h).setVisibility(8);
        } else {
            j.n("mViewCreditAvailable");
            throw null;
        }
    }

    public final void V1() {
        C0491z c0491z = this.N0;
        if (c0491z != null) {
            ((ConstraintLayout) c0491z.f4303b).setVisibility(8);
        } else {
            j.n("mViewCreditPendingHeader");
            throw null;
        }
    }

    public final void W1() {
        SpringView springView = this.f13272p0;
        if (springView == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        springView.i();
        LottieAnimationView lottieAnimationView = this.f13255Y0;
        if (lottieAnimationView == null) {
            j.n("mLottieView");
            throw null;
        }
        lottieAnimationView.a();
        LottieAnimationView lottieAnimationView2 = this.f13255Y0;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setProgress(0.0f);
        } else {
            j.n("mLottieView");
            throw null;
        }
    }

    public final void X1() {
        G0 g02 = this.f13249S0;
        if (g02 != null) {
            g02.f3627b.setVisibility(8);
        } else {
            j.n("mViewCreditEnhancedIneligibleHeader");
            throw null;
        }
    }

    public final void Y1(View view) {
        j.e(view, "null cannot be cast to non-null type com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel");
        f5.f fVar = new f5.f((BannerAdCarousel) view);
        fVar.f16717b = d.f20010g;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fVar.c = viewLifecycleOwner;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.f16718d = fragmentActivityRequireActivity;
        fVar.h = Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.maya_margin_24));
        fVar.f16720k = new F(24);
        fVar.f16721l = new C0165x(19);
        fVar.j = new F(25);
        fVar.a();
    }

    public final void Z1() {
        BannerAdCarousel bannerAdCarousel = this.f13238G1;
        if (bannerAdCarousel == null) {
            j.n("mViewGoogleAdCarousel");
            throw null;
        }
        Y1(bannerAdCarousel);
        BannerAdCarousel bannerAdCarousel2 = this.f13238G1;
        if (bannerAdCarousel2 != null) {
            bannerAdCarousel2.setVisibility(0);
        } else {
            j.n("mViewGoogleAdCarousel");
            throw null;
        }
    }

    public final void f2() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.UNHIDE_BALANCE);
        c1219hH.i();
        A1(c1219hH);
        O9.a aVar = this.f13286z1;
        if (aVar != null) {
            aVar.f4765b = true;
            aVar.notifyDataSetChanged();
        }
        TextView textView = this.f13275s0;
        if (textView == null) {
            j.n("mTextViewCreditAmount");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.t0;
        if (textView2 == null) {
            j.n("mTextViewCreditAmountMasked");
            throw null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.y0;
        if (textView3 == null) {
            j.n("mTextViewCreditUsed");
            throw null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f13285z0;
        if (textView4 == null) {
            j.n("mTextViewCreditUsedMasked");
            throw null;
        }
        textView4.setVisibility(4);
        TextView textView5 = this.f13226A0;
        if (textView5 == null) {
            j.n("mTextViewCreditAvailable");
            throw null;
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f13228B0;
        if (textView6 == null) {
            j.n("mTextViewCreditAvailableMasked");
            throw null;
        }
        textView6.setVisibility(8);
        ImageView imageView = this.f13230C0;
        if (imageView == null) {
            j.n("mImageViewProgressIndicator");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        TextView textView7 = this.y0;
        if (textView7 == null) {
            j.n("mTextViewCreditUsed");
            throw null;
        }
        layoutParams2.topToBottom = textView7.getId();
        ImageView imageView2 = this.f13230C0;
        if (imageView2 == null) {
            j.n("mImageViewProgressIndicator");
            throw null;
        }
        imageView2.requestLayout();
        ImageView imageView3 = this.u0;
        if (imageView3 == null) {
            j.n("mImageViewLockedCredit");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
        j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        TextView textView8 = this.f13275s0;
        if (textView8 == null) {
            j.n("mTextViewCreditAmount");
            throw null;
        }
        layoutParams4.bottomToBottom = textView8.getId();
        TextView textView9 = this.f13275s0;
        if (textView9 == null) {
            j.n("mTextViewCreditAmount");
            throw null;
        }
        layoutParams4.startToEnd = textView9.getId();
        TextView textView10 = this.f13275s0;
        if (textView10 == null) {
            j.n("mTextViewCreditAmount");
            throw null;
        }
        layoutParams4.topToTop = textView10.getId();
        ImageView imageView4 = this.u0;
        if (imageView4 == null) {
            j.n("mImageViewLockedCredit");
            throw null;
        }
        imageView4.setLayoutParams(layoutParams4);
        ImageView imageView5 = this.u0;
        if (imageView5 != null) {
            imageView5.requestLayout();
        } else {
            j.n("mImageViewLockedCredit");
            throw null;
        }
    }

    public final void g2() {
        m1().r(EnumC1216e.SUMMARY);
        v1 v1Var = this.f13273q0;
        if (v1Var != null) {
            ((ConstraintLayout) v1Var.h).setVisibility(0);
        } else {
            j.n("mViewCreditAvailable");
            throw null;
        }
    }

    public final void h2(CreditResponse creditResponse) {
        j.g(creditResponse, "creditResponse");
        G g8 = this.D1;
        if (g8 != null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
            mayaDashboardActivity.n1();
            CreditAccount creditAccount = creditResponse.getCreditAccount();
            Intent intent = new Intent(mayaDashboardActivity, (Class<?>) MayaPayBillsActivity.class);
            intent.putExtra("billable", creditAccount);
            intent.putExtra("is_editable", true);
            intent.putExtra("on_success_finish", true);
            mayaDashboardActivity.startActivityForResult(intent, 200);
        }
    }

    public final void i2(Function0 function0) {
        G g8 = this.D1;
        if (g8 != null) {
            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) ((MayaDashboardActivity) g8).f12148u.G1().c.get());
            mayaDashboardFragment.getClass();
            C0265h c0265h = mayaDashboardFragment.f12164d0;
            if (c0265h != null) {
                c0265h.j("motherMaidenName", function0);
            } else {
                j.n("loansFlutterScreen");
                throw null;
            }
        }
    }

    public final void j2() {
        C0466m c0466m = this.f13256Z0;
        if (c0466m == null) {
            j.n("mTransactionListCard");
            throw null;
        }
        ((ConstraintLayout) c0466m.f4150b).setVisibility(0);
        RecyclerView recyclerView = this.f13257a1;
        if (recyclerView == null) {
            j.n("mTransactionList");
            throw null;
        }
        recyclerView.setVisibility(0);
        TextView textView = this.f13260d1;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mTextViewNoTransactions");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G5.t
    public final void m(String str, View view) {
        if (str != null) {
            int iHashCode = str.hashCode();
            EnumC1216e enumC1216e = EnumC1216e.OPT_IN;
            EnumC1216e enumC1216e2 = EnumC1216e.ACTIVATE;
            switch (iHashCode) {
                case -1873730773:
                    if (str.equals("ContactReference")) {
                        C1219h c1219h = new C1219h();
                        c1219h.r(enumC1216e);
                        c1219h.n(17);
                        c1219h.t(EnumC1217f.CONTACT_RELATIONSHIP);
                        c1219h.i();
                        z1(c1219h);
                        G g8 = this.D1;
                        if (g8 != null) {
                            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                            mayaDashboardActivity.n1();
                            Intent intent = new Intent(mayaDashboardActivity, (Class<?>) NewMayaCreditActivity.class);
                            intent.putExtra("feature", "contact_reference");
                            mayaDashboardActivity.startActivity(intent);
                        }
                        break;
                    }
                    break;
                case -1530925663:
                    if (str.equals("Hotline")) {
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.HOTLINE);
                        c1219hH.i();
                        z1(c1219hH);
                        G g10 = this.D1;
                        if (g10 != null) {
                            MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) g10;
                            mayaDashboardActivity2.n1();
                            Intent intent2 = new Intent("android.intent.action.DIAL");
                            intent2.setData(Uri.parse("tel:(632)88457788"));
                            mayaDashboardActivity2.startActivity(intent2);
                        }
                        break;
                    }
                    break;
                case -477628818:
                    if (str.equals("ServiceAdvisory")) {
                        C1219h c1219h2 = new C1219h();
                        c1219h2.r(enumC1216e2);
                        c1219h2.n(17);
                        c1219h2.t(EnumC1217f.SERVICE_ADVISORIES);
                        z1(c1219h2);
                        G g11 = this.D1;
                        if (g11 != null) {
                            ((MayaDashboardActivity) g11).v2("https://support.maya.ph/s/status");
                        }
                        break;
                    }
                    break;
                case -190113873:
                    if (str.equals("Support")) {
                        C1219h c1219hH2 = AbstractC2329d.h(17);
                        c1219hH2.t(EnumC1217f.SUPPORT);
                        c1219hH2.i();
                        z1(c1219hH2);
                        G g12 = this.D1;
                        if (g12 != null) {
                            MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) g12;
                            mayaDashboardActivity3.n1();
                            mayaDashboardActivity3.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "support@mayabank.ph", null)), "Send email..."));
                        }
                        break;
                    }
                    break;
                case 66079:
                    if (str.equals("BSP")) {
                        C1219h c1219hH3 = AbstractC2329d.h(17);
                        c1219hH3.t(EnumC1217f.BSP);
                        c1219hH3.i();
                        z1(c1219hH3);
                        G g13 = this.D1;
                        if (g13 != null) {
                            ((MayaDashboardActivity) g13).v2("https://www.bsp.gov.ph");
                        }
                        break;
                    }
                    break;
                case 2150461:
                    if (str.equals("FAQs")) {
                        C1219h c1219h3 = new C1219h();
                        c1219h3.r(enumC1216e);
                        c1219h3.n(17);
                        c1219h3.t(EnumC1217f.FAQS);
                        c1219h3.i();
                        z1(c1219h3);
                        G g14 = this.D1;
                        if (g14 != null) {
                            ((MayaDashboardActivity) g14).v2("https://www.mayabank.ph/loans/credit/");
                        }
                        break;
                    }
                    break;
                case 2245473:
                    if (str.equals("Help")) {
                        C1219h c1219h4 = new C1219h();
                        c1219h4.r(enumC1216e2);
                        c1219h4.n(17);
                        c1219h4.t(EnumC1217f.HELP);
                        c1219h4.i();
                        z1(c1219h4);
                        G g15 = this.D1;
                        if (g15 != null) {
                            ((MayaDashboardActivity) g15).v2("https://support.mayabank.ph/s/topic/0TO2y000000TT54GAG/maya-credit-for-customers");
                        }
                        break;
                    }
                    break;
                case 438180764:
                    if (str.equals("ChatWithUs")) {
                        C1219h c1219hH4 = AbstractC2329d.h(17);
                        c1219hH4.t(EnumC1217f.CHAT_WITH_US);
                        c1219hH4.i();
                        z1(c1219hH4);
                        G g16 = this.D1;
                        if (g16 != null) {
                            MayaDashboardActivity mayaDashboardActivity4 = (MayaDashboardActivity) g16;
                            mayaDashboardActivity4.n1();
                            i.k(mayaDashboardActivity4, "paymaya://chatwithus");
                        }
                        break;
                    }
                    break;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.D1 = (G) getActivity();
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13231C1 = new B((com.paymaya.data.preference.a) aVar.e.get(), (S5.c) aVar.f4724k.get(), aVar.A(), aVar.m(), aVar.e(), new C1266j0((MayaXpApi) aVar.f4740s0.get()), (Uh.d) aVar.f4748y.get());
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13270o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G g8 = this.D1;
        if (g8 != null) {
            ((MayaDashboardActivity) g8).Q(this);
        }
        B bP1 = P1();
        bP1.n();
        bP1.o();
        B bP12 = P1();
        if (S5.c.b(bP12.e, b.f82V)) {
            NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((k) bP12.c.get());
            if (newMayaCreditFragment.f13240I1 == null) {
                M m = new M(newMayaCreditFragment, s5.f.f20015d);
                F f = new F(22);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = f;
                c1847a.e = new F(23);
                c1847a.f = new C0165x(18);
                newMayaCreditFragment.f13240I1 = m;
            }
            M m2 = newMayaCreditFragment.f13240I1;
            if (m2 != null) {
                m2.j();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        E e = this.f13270o0;
        j.d(e);
        this.f13272p0 = (SpringView) e.e;
        E e7 = this.f13270o0;
        j.d(e7);
        v1 v1Var = (v1) e7.f3589k;
        this.f13273q0 = v1Var;
        C c = (C) v1Var.f4246r;
        this.f13280v1 = c;
        Z z4 = (Z) v1Var.f4247s;
        this.f13281w1 = z4;
        C0449e1 c0449e1 = (C0449e1) v1Var.f4248t;
        this.f13283x1 = c0449e1;
        this.f13284y1 = c0449e1.c;
        this.f13274r0 = (TextView) c.m;
        this.f13275s0 = (TextView) c.f3559b;
        this.t0 = c.f3564n;
        this.u0 = (ImageView) c.f3561g;
        this.f13279v0 = (ImageView) c.e;
        this.w0 = c.f3560d;
        this.y0 = (TextView) c.f3562k;
        this.f13285z0 = (TextView) c.f3563l;
        this.f13226A0 = (TextView) c.i;
        this.f13228B0 = (TextView) c.j;
        this.f13230C0 = (ImageView) c.c;
        this.f13232D0 = (ProgressBar) c.h;
        this.f13237G0 = z4.f4042d;
        this.f13239H0 = z4.c;
        this.f13282x0 = v1Var.f4242n;
        this.f13233E0 = v1Var.f;
        this.f13235F0 = (Button) v1Var.i;
        this.I0 = (Button) v1Var.j;
        C0449e1 c0449e12 = (C0449e1) c.f3565o;
        this.f13241J0 = c0449e12;
        this.f13243K0 = c0449e12.c;
        E e10 = this.f13270o0;
        j.d(e10);
        C0450f c0450f = (C0450f) e10.j;
        this.f13244L0 = c0450f;
        this.f13245M0 = (HtmlTextView) c0450f.f4087b;
        E e11 = this.f13270o0;
        j.d(e11);
        C0491z c0491z = (C0491z) e11.m;
        this.N0 = c0491z;
        this.f13246O0 = (ImageView) c0491z.e;
        this.f13247P0 = (TextView) c0491z.h;
        this.f13248Q0 = (TextView) c0491z.f4304d;
        this.R0 = (Group) c0491z.c;
        E e12 = this.f13270o0;
        j.d(e12);
        this.f13249S0 = (G0) e12.f3590l;
        E e13 = this.f13270o0;
        j.d(e13);
        this.f13251U0 = (ConstraintLayout) ((C0450f) e13.f3588g).c;
        E e14 = this.f13270o0;
        j.d(e14);
        this.f13252V0 = (HtmlTextView) ((C0450f) e14.f3588g).f4087b;
        E e15 = this.f13270o0;
        j.d(e15);
        this.f13253W0 = (HtmlTextView) e15.h;
        E e16 = this.f13270o0;
        j.d(e16);
        this.f13254X0 = (HtmlTextView) e16.i;
        v1 v1Var2 = this.f13273q0;
        if (v1Var2 == null) {
            j.n("mViewCreditAvailable");
            throw null;
        }
        C0466m c0466m = (C0466m) v1Var2.f4243o;
        this.f13256Z0 = c0466m;
        RecyclerView recyclerView = (RecyclerView) c0466m.f4151d;
        this.f13257a1 = recyclerView;
        this.f13258b1 = (TextView) c0466m.f4152g;
        this.f13259c1 = (TextView) c0466m.f;
        this.f13260d1 = (TextView) c0466m.e;
        this.f13261e1 = recyclerView;
        this.f13262f1 = (Group) c0466m.c;
        this.g1 = (G0) c0466m.h;
        this.f13263h1 = (G0) c0466m.i;
        this.f13264i1 = (Group) v1Var2.f4241l;
        this.f13265j1 = (Group) v1Var2.m;
        C c10 = (C) v1Var2.f4245q;
        this.f13267l1 = (ConstraintLayout) c10.f3561g;
        this.f13266k1 = c10;
        this.f13268m1 = c10.f3564n;
        this.f13269n1 = (TextView) c10.f3562k;
        this.f13271o1 = (TextView) c10.f3559b;
        this.p1 = c10.f3560d;
        this.q1 = (Button) c10.h;
        this.r1 = (Button) c10.e;
        this.f13276s1 = (AppCompatImageView) c10.j;
        this.f13277t1 = (TextView) c10.f3563l;
        this.f13278u1 = (TextView) c10.f3565o;
        E e17 = this.f13270o0;
        j.d(e17);
        C0489y c0489y = (C0489y) e17.f3586b;
        this.f13250T0 = c0489y;
        this.f13229B1 = c0489y.c;
        E e18 = this.f13270o0;
        j.d(e18);
        this.f13238G1 = (BannerAdCarousel) e18.f;
        v1 v1Var3 = this.f13273q0;
        if (v1Var3 == null) {
            j.n("mViewCreditAvailable");
            throw null;
        }
        this.H1 = (BannerAdCarousel) v1Var3.f4240k;
        SpringView springView = this.f13272p0;
        if (springView == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f13272p0;
        if (springView2 == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f13255Y0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f13272p0;
        if (springView3 == null) {
            j.n("mDashboardSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new r(this, 1));
        P1().j();
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.SUMMARY);
        c1219h.n(21);
        c1219h.i();
        z1(c1219h);
        Button button = this.w0;
        if (button == null) {
            j.n("mButtonTransferToWallet");
            throw null;
        }
        button.setOnClickListener(new Q9.E(this, 8));
        Button button2 = this.f13233E0;
        if (button2 == null) {
            j.n("mButtonBillingStatement");
            throw null;
        }
        button2.setOnClickListener(new Q9.E(this, 10));
        Button button3 = this.f13235F0;
        if (button3 == null) {
            j.n("mButtonBillingStatementPayNow");
            throw null;
        }
        button3.setOnClickListener(new Q9.E(this, 11));
        Button button4 = this.I0;
        if (button4 == null) {
            j.n("mButtonPayEarly");
            throw null;
        }
        button4.setOnClickListener(new Q9.E(this, 12));
        AppCompatTextView appCompatTextView = this.f13282x0;
        if (appCompatTextView == null) {
            j.n("mTextViewAccountSummary");
            throw null;
        }
        appCompatTextView.setOnClickListener(new Q9.E(this, 13));
        ImageView imageView = this.f13279v0;
        if (imageView == null) {
            j.n("mImageViewShowHideCreditAmount");
            throw null;
        }
        imageView.setOnClickListener(new Q9.E(this, 14));
        HtmlTextView htmlTextView = this.f13245M0;
        if (htmlTextView == null) {
            j.n("mTextViewEnhancedDataPrivacyPolicyConsent");
            throw null;
        }
        htmlTextView.setOnClickListener(new Q9.E(this, 0));
        HtmlTextView htmlTextView2 = this.f13252V0;
        if (htmlTextView2 == null) {
            j.n("mHtmlTextViewHelpCenter");
            throw null;
        }
        htmlTextView2.setOnLinkClickListener(this);
        HtmlTextView htmlTextView3 = this.f13253W0;
        if (htmlTextView3 == null) {
            j.n("mTextViewBankInformation1");
            throw null;
        }
        htmlTextView3.setOnLinkClickListener(this);
        HtmlTextView htmlTextView4 = this.f13254X0;
        if (htmlTextView4 == null) {
            j.n("mTextViewBankInformation2");
            throw null;
        }
        htmlTextView4.setOnLinkClickListener(this);
        HtmlTextView htmlTextView5 = this.f13243K0;
        if (htmlTextView5 == null) {
            j.n("mTextViewAssignContactReferenceFirst");
            throw null;
        }
        htmlTextView5.setOnLinkClickListener(this);
        HtmlTextView htmlTextView6 = this.f13284y1;
        if (htmlTextView6 == null) {
            j.n("mTextViewWrittenOffHelpCenter");
            throw null;
        }
        htmlTextView6.setOnLinkClickListener(this);
        Button button5 = this.p1;
        if (button5 == null) {
            j.n("mButtonRevampPayNow");
            throw null;
        }
        button5.setOnClickListener(new Q9.E(this, 1));
        Button button6 = this.q1;
        if (button6 == null) {
            j.n("mButtonRevampViewStatement");
            throw null;
        }
        button6.setOnClickListener(new Q9.E(this, 2));
        Button button7 = this.r1;
        if (button7 == null) {
            j.n("mButtonRevampPayThisBill");
            throw null;
        }
        button7.setOnClickListener(new Q9.E(this, 3));
        AppCompatImageView appCompatImageView = this.f13276s1;
        if (appCompatImageView == null) {
            j.n("mImageViewLatestBillInfo");
            throw null;
        }
        appCompatImageView.setOnClickListener(new Q9.E(this, 9));
        Button button8 = this.f13229B1;
        if (button8 != null) {
            Ke.b.b(button8, new D(this, 2));
        } else {
            j.n("mButtonApplyNow");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13242J1;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CREDIT;
    }
}
