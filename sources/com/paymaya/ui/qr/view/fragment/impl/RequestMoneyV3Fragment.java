package com.paymaya.ui.qr.view.fragment.impl;

import Bb.c;
import N5.H;
import Na.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import ce.h;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3Fragment;
import de.x;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyV3Fragment extends BaseFragment implements h {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public H f14722S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ImageView f14723T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ConstraintLayout f14724U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f14725V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f14726W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f14727X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f14728Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public CardView f14729Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f14730a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f14731b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Group f14732c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public FrameLayout f14733d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public FrameLayout f14734e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Group f14735f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public FrameLayout f14736g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public FrameLayout f14737h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Zd.h f14738i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public x f14739j0;

    @Override // ce.h
    public final void D0(String str) {
        ImageView imageView = this.f14723T;
        if (imageView == null) {
            j.n("mImageBackground");
            throw null;
        }
        imageView.setVisibility(0);
        CardView cardView = this.f14729Z;
        if (cardView == null) {
            j.n("mCardViewCustomValues");
            throw null;
        }
        cardView.setVisibility(0);
        TextView textView = this.f14731b0;
        if (textView == null) {
            j.n("mTextViewPurpose");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14730a0;
        if (textView2 == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        if (textView2.getVisibility() == 8) {
            TextView textView3 = this.f14731b0;
            if (textView3 == null) {
                j.n("mTextViewPurpose");
                throw null;
            }
            textView3.setTextSize(0, getResources().getDimension(R.dimen.pma_text_size_body));
        }
        TextView textView4 = this.f14731b0;
        if (textView4 == null) {
            j.n("mTextViewPurpose");
            throw null;
        }
        textView4.setText(str);
        Group group = this.f14732c0;
        if (group == null) {
            j.n("mDefaultOptionsGroup");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f14735f0;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            j.n("mCustomizedQROptionsGroup");
            throw null;
        }
    }

    @Override // ce.h
    public final void K0(String str, String str2) {
        ImageView imageView;
        String str3 = String.format("myqr_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Bundle arguments = getArguments();
        if ((arguments != null ? (TransferAppLink) arguments.getParcelable("transfer_app_link") : null) != null) {
            imageView = this.f14723T;
            if (imageView == null) {
                j.n("mImageBackground");
                throw null;
            }
        } else {
            imageView = null;
        }
        ConstraintLayout constraintLayout = this.f14724U;
        if (constraintLayout == null) {
            j.n("mViewScreenshot");
            throw null;
        }
        h0 h0VarD = h0.d(constraintLayout, new c(27, this, str, str2));
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.off_light));
        h0VarD.f11209b = imageView;
        h0VarD.b(str3);
    }

    @Override // ce.h
    public final void N(String str) {
        TextView textView = this.f14726W;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTextViewName");
            throw null;
        }
    }

    @Override // ce.h
    public final void S0(String str, String str2) {
        TextView textView = this.f14728Y;
        if (textView == null) {
            j.n("mTextViewMobileNumber");
            throw null;
        }
        textView.setText(str);
        ImageView imageView = this.f14725V;
        if (imageView != null) {
            imageView.setImageBitmap(Z.b(getActivity(), str2, 2131231989));
        } else {
            j.n("mImageViewQR");
            throw null;
        }
    }

    @Override // ce.h
    public final void W(double d10) {
        ImageView imageView = this.f14723T;
        if (imageView == null) {
            j.n("mImageBackground");
            throw null;
        }
        imageView.setVisibility(0);
        CardView cardView = this.f14729Z;
        if (cardView == null) {
            j.n("mCardViewCustomValues");
            throw null;
        }
        cardView.setVisibility(0);
        TextView textView = this.f14730a0;
        if (textView == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14730a0;
        if (textView2 == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        textView2.setText(getString(R.string.pma_label_php_format, C.u(Double.valueOf(d10))));
        Group group = this.f14732c0;
        if (group == null) {
            j.n("mDefaultOptionsGroup");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f14735f0;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            j.n("mCustomizedQROptionsGroup");
            throw null;
        }
    }

    @Override // ce.h
    public final void d0() {
        ImageView imageView = this.f14727X;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.pma_ic_badge_account_upgraded_new));
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }

    @Override // ce.h
    public final void e1() {
    }

    @Override // ce.h
    public final void g1() {
        ImageView imageView = this.f14727X;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }

    @Override // ce.h
    public final void l0() {
    }

    @Override // ce.h
    public final void n0() {
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3Fragment.RequestMoneyV3FragmentListener");
        this.f14739j0 = (x) activity;
        Lh.c cVarE = W4.a.e().E();
        O5.a aVar = (O5.a) cVarE.c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14738i0 = cVarE.l();
        ((AbstractC2509a) r1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_request_money_v3, viewGroup, false);
        int i = R.id.amount_text_pma_fragment_request_money_v3;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_pma_fragment_request_money_v3);
        if (textView != null) {
            i = R.id.card_container_pma_fragment_request_money_v3;
            if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_container_pma_fragment_request_money_v3)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.custom_qr_edit_text_pma_fragment_request_money_v3;
                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_edit_text_pma_fragment_request_money_v3)) != null) {
                    i = R.id.custom_qr_edit_view_pma_fragment_request_money_v3;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_edit_view_pma_fragment_request_money_v3);
                    if (frameLayout != null) {
                        i = R.id.custom_qr_options_group_pma_fragment_request_money_v3;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_options_group_pma_fragment_request_money_v3);
                        if (group != null) {
                            i = R.id.custom_qr_share_text_pma_fragment_request_money_v3;
                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_share_text_pma_fragment_request_money_v3)) != null) {
                                i = R.id.custom_qr_share_view_pma_fragment_request_money_v3;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.custom_qr_share_view_pma_fragment_request_money_v3);
                                if (frameLayout2 != null) {
                                    i = R.id.custom_values_container_pma_fragment_request_money_v3;
                                    CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.custom_values_container_pma_fragment_request_money_v3);
                                    if (cardView != null) {
                                        i = R.id.default_options_group_pma_fragment_request_money_v3;
                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.default_options_group_pma_fragment_request_money_v3);
                                        if (group2 != null) {
                                            i = R.id.generate_custom_code_text_pma_fragment_request_money_v3;
                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.generate_custom_code_text_pma_fragment_request_money_v3)) != null) {
                                                i = R.id.generate_custom_code_view_pma_fragment_request_money_v3;
                                                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.generate_custom_code_view_pma_fragment_request_money_v3);
                                                if (frameLayout3 != null) {
                                                    i = R.id.layout_background_pma_fragment_request_money_v3;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.layout_background_pma_fragment_request_money_v3);
                                                    if (imageView != null) {
                                                        i = R.id.logo_image_pma_fragment_request_money_v3;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.logo_image_pma_fragment_request_money_v3)) != null) {
                                                            i = R.id.mobile_number_text_pma_fragment_request_money_v3;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_text_pma_fragment_request_money_v3);
                                                            if (textView2 != null) {
                                                                i = R.id.name_text_pma_fragment_request_money_v3;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.name_text_pma_fragment_request_money_v3);
                                                                if (textView3 != null) {
                                                                    i = R.id.options_barrier_pma_fragment_request_money_v3;
                                                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.options_barrier_pma_fragment_request_money_v3)) != null) {
                                                                        i = R.id.purpose_text_pma_fragment_request_money_v3;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.purpose_text_pma_fragment_request_money_v3);
                                                                        if (textView4 != null) {
                                                                            i = R.id.qr_code_image_pma_fragment_request_money_v3;
                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.qr_code_image_pma_fragment_request_money_v3);
                                                                            if (imageView2 != null) {
                                                                                i = R.id.screenshot_view_pma_fragment_request_money_v3;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.screenshot_view_pma_fragment_request_money_v3);
                                                                                if (constraintLayout2 != null) {
                                                                                    i = R.id.share_text_pma_fragment_request_money_v3;
                                                                                    if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.share_text_pma_fragment_request_money_v3)) != null) {
                                                                                        i = R.id.share_view_pma_fragment_request_money_v3;
                                                                                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.share_view_pma_fragment_request_money_v3);
                                                                                        if (frameLayout4 != null) {
                                                                                            i = R.id.upgraded_badge_image_pma_fragment_request_money_v3;
                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.upgraded_badge_image_pma_fragment_request_money_v3);
                                                                                            if (imageView3 != null) {
                                                                                                this.f14722S = new H(constraintLayout, textView, frameLayout, group, frameLayout2, cardView, group2, frameLayout3, imageView, textView2, textView3, textView4, imageView2, constraintLayout2, frameLayout4, imageView3);
                                                                                                return constraintLayout;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) r1()).i();
        super.onDestroy();
        this.f14722S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x xVar = this.f14739j0;
        if (xVar != null) {
            ((RequestMoneyV3Activity) xVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TransferAppLink transferAppLinkK;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f14722S;
        j.d(h);
        this.f14723T = (ImageView) h.f3638n;
        H h6 = this.f14722S;
        j.d(h6);
        this.f14724U = (ConstraintLayout) h6.f3639o;
        H h7 = this.f14722S;
        j.d(h7);
        this.f14725V = (ImageView) h7.f3636k;
        H h8 = this.f14722S;
        j.d(h8);
        this.f14726W = h8.f3635g;
        H h10 = this.f14722S;
        j.d(h10);
        this.f14727X = (ImageView) h10.f3641q;
        H h11 = this.f14722S;
        j.d(h11);
        this.f14728Y = h11.f;
        H h12 = this.f14722S;
        j.d(h12);
        this.f14729Z = (CardView) h12.i;
        H h13 = this.f14722S;
        j.d(h13);
        this.f14730a0 = h13.c;
        H h14 = this.f14722S;
        j.d(h14);
        this.f14731b0 = (TextView) h14.j;
        H h15 = this.f14722S;
        j.d(h15);
        this.f14732c0 = (Group) h15.f3637l;
        H h16 = this.f14722S;
        j.d(h16);
        this.f14733d0 = (FrameLayout) h16.m;
        H h17 = this.f14722S;
        j.d(h17);
        this.f14734e0 = (FrameLayout) h17.f3640p;
        H h18 = this.f14722S;
        j.d(h18);
        this.f14735f0 = (Group) h18.e;
        H h19 = this.f14722S;
        j.d(h19);
        this.f14736g0 = (FrameLayout) h19.h;
        H h20 = this.f14722S;
        j.d(h20);
        this.f14737h0 = (FrameLayout) h20.f3634d;
        Yd.b bVarR1 = r1();
        Bundle arguments = getArguments();
        if (arguments == null || (transferAppLinkK = (TransferAppLink) arguments.getParcelable("transfer_app_link")) == null) {
            transferAppLinkK = ((Zd.h) r1()).k();
        }
        ((Zd.h) bVarR1).m(transferAppLinkK);
        ImageView imageView = this.f14725V;
        if (imageView == null) {
            j.n("mImageViewQR");
            throw null;
        }
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new r(this, 1));
        FrameLayout frameLayout = this.f14733d0;
        if (frameLayout == null) {
            j.n("mViewGenerateCustomCode");
            throw null;
        }
        final int i = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: de.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3Fragment f16384b;

            {
                this.f16384b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        RequestMoneyV3Fragment requestMoneyV3Fragment = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment.o1(c1219h);
                            x xVar = requestMoneyV3Fragment.f14739j0;
                            if (xVar != null) {
                                ((RequestMoneyV3Activity) xVar).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3Fragment requestMoneyV3Fragment2 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment2.o1(c1219h2);
                            ((Zd.h) requestMoneyV3Fragment2.r1()).l();
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3Fragment requestMoneyV3Fragment3 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3Fragment3.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3Fragment requestMoneyV3Fragment4 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment4.o1(c1219h4);
                            x xVar2 = requestMoneyV3Fragment4.f14739j0;
                            if (xVar2 != null) {
                                ((RequestMoneyV3Activity) xVar2).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout2 = this.f14734e0;
        if (frameLayout2 == null) {
            j.n("mViewShare");
            throw null;
        }
        final int i4 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: de.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3Fragment f16384b;

            {
                this.f16384b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        RequestMoneyV3Fragment requestMoneyV3Fragment = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment.o1(c1219h);
                            x xVar = requestMoneyV3Fragment.f14739j0;
                            if (xVar != null) {
                                ((RequestMoneyV3Activity) xVar).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3Fragment requestMoneyV3Fragment2 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment2.o1(c1219h2);
                            ((Zd.h) requestMoneyV3Fragment2.r1()).l();
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3Fragment requestMoneyV3Fragment3 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3Fragment3.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3Fragment requestMoneyV3Fragment4 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment4.o1(c1219h4);
                            x xVar2 = requestMoneyV3Fragment4.f14739j0;
                            if (xVar2 != null) {
                                ((RequestMoneyV3Activity) xVar2).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout3 = this.f14736g0;
        if (frameLayout3 == null) {
            j.n("mViewCustomizedQRShare");
            throw null;
        }
        final int i6 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: de.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3Fragment f16384b;

            {
                this.f16384b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        RequestMoneyV3Fragment requestMoneyV3Fragment = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment.o1(c1219h);
                            x xVar = requestMoneyV3Fragment.f14739j0;
                            if (xVar != null) {
                                ((RequestMoneyV3Activity) xVar).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3Fragment requestMoneyV3Fragment2 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment2.o1(c1219h2);
                            ((Zd.h) requestMoneyV3Fragment2.r1()).l();
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3Fragment requestMoneyV3Fragment3 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3Fragment3.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3Fragment requestMoneyV3Fragment4 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment4.o1(c1219h4);
                            x xVar2 = requestMoneyV3Fragment4.f14739j0;
                            if (xVar2 != null) {
                                ((RequestMoneyV3Activity) xVar2).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout4 = this.f14737h0;
        if (frameLayout4 == null) {
            j.n("mViewCustomizedQREdit");
            throw null;
        }
        final int i10 = 3;
        frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: de.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3Fragment f16384b;

            {
                this.f16384b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        RequestMoneyV3Fragment requestMoneyV3Fragment = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment.o1(c1219h);
                            x xVar = requestMoneyV3Fragment.f14739j0;
                            if (xVar != null) {
                                ((RequestMoneyV3Activity) xVar).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3Fragment requestMoneyV3Fragment2 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment2.o1(c1219h2);
                            ((Zd.h) requestMoneyV3Fragment2.r1()).l();
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3Fragment requestMoneyV3Fragment3 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3Fragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3Fragment3.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3Fragment requestMoneyV3Fragment4 = this.f16384b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3Fragment4.o1(c1219h4);
                            x xVar2 = requestMoneyV3Fragment4.f14739j0;
                            if (xVar2 != null) {
                                ((RequestMoneyV3Activity) xVar2).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final Yd.b r1() {
        Zd.h hVar = this.f14738i0;
        if (hVar != null) {
            return hVar;
        }
        j.n("mRequestMoneyV3FragmentPresenter");
        throw null;
    }

    @Override // ce.h
    public final void y() {
        ImageView imageView = this.f14727X;
        if (imageView != null) {
            imageView.setVisibility(0);
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }
}
