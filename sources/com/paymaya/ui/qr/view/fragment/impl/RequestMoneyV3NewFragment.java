package com.paymaya.ui.qr.view.fragment.impl;

import Bb.c;
import N5.O;
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
import com.paymaya.ui.common.view.dialog.impl.VerifiedSellerInfoDialogFragment;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment;
import de.z;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyV3NewFragment extends BaseFragment implements h {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public O f14740S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ConstraintLayout f14741T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ImageView f14742U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14743V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f14744W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f14745X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ConstraintLayout f14746Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ImageView f14747Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public CardView f14748a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f14749b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f14750c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Group f14751d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public FrameLayout f14752e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public FrameLayout f14753f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Group f14754g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public FrameLayout f14755h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public FrameLayout f14756i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Zd.h f14757j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public z f14758k0;

    @Override // ce.h
    public final void D0(String str) {
        CardView cardView = this.f14748a0;
        if (cardView == null) {
            j.n("mCardViewCustomValues");
            throw null;
        }
        cardView.setVisibility(0);
        TextView textView = this.f14750c0;
        if (textView == null) {
            j.n("mTextViewPurpose");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14749b0;
        if (textView2 == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        if (textView2.getVisibility() == 8) {
            TextView textView3 = this.f14750c0;
            if (textView3 == null) {
                j.n("mTextViewPurpose");
                throw null;
            }
            textView3.setTextSize(0, getResources().getDimension(R.dimen.pma_text_size_body));
        }
        TextView textView4 = this.f14750c0;
        if (textView4 == null) {
            j.n("mTextViewPurpose");
            throw null;
        }
        textView4.setText(str);
        Group group = this.f14751d0;
        if (group == null) {
            j.n("mDefaultOptionsGroup");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f14754g0;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            j.n("mCustomizedQROptionsGroup");
            throw null;
        }
    }

    @Override // ce.h
    public final void K0(String str, String str2) {
        String str3 = String.format("myqr_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        ConstraintLayout constraintLayout = this.f14741T;
        if (constraintLayout == null) {
            j.n("mViewScreenshot");
            throw null;
        }
        h0 h0VarD = h0.d(constraintLayout, new c(28, this, str, str2));
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.off_light));
        ImageView imageView = this.f14747Z;
        if (imageView == null) {
            j.n("mImageViewVerifiedSellerInfoIcon");
            throw null;
        }
        if (imageView.isShown()) {
            ImageView imageView2 = this.f14747Z;
            if (imageView2 == null) {
                j.n("mImageViewVerifiedSellerInfoIcon");
                throw null;
            }
            h0VarD.f(imageView2);
        }
        h0VarD.b(str3);
    }

    @Override // ce.h
    public final void N(String str) {
        TextView textView = this.f14743V;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTextViewName");
            throw null;
        }
    }

    @Override // ce.h
    public final void S0(String str, String str2) {
        TextView textView = this.f14745X;
        if (textView == null) {
            j.n("mTextViewMobileNumber");
            throw null;
        }
        textView.setText(str);
        ImageView imageView = this.f14742U;
        if (imageView != null) {
            imageView.setImageBitmap(Z.b(getActivity(), str2, 2131231989));
        } else {
            j.n("mImageViewQR");
            throw null;
        }
    }

    @Override // ce.h
    public final void W(double d10) {
        CardView cardView = this.f14748a0;
        if (cardView == null) {
            j.n("mCardViewCustomValues");
            throw null;
        }
        cardView.setVisibility(0);
        TextView textView = this.f14749b0;
        if (textView == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f14749b0;
        if (textView2 == null) {
            j.n("mTextViewAmount");
            throw null;
        }
        textView2.setText(getString(R.string.pma_label_php_format, C.u(Double.valueOf(d10))));
        Group group = this.f14751d0;
        if (group == null) {
            j.n("mDefaultOptionsGroup");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = this.f14754g0;
        if (group2 != null) {
            group2.setVisibility(0);
        } else {
            j.n("mCustomizedQROptionsGroup");
            throw null;
        }
    }

    @Override // ce.h
    public final void d0() {
        ImageView imageView = this.f14744W;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.pma_ic_badge_account_upgraded_big));
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }

    @Override // ce.h
    public final void e1() {
        ConstraintLayout constraintLayout = this.f14746Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        } else {
            j.n("mConstraintLayoutVerifiedSellerTag");
            throw null;
        }
    }

    @Override // ce.h
    public final void g1() {
        ImageView imageView = this.f14744W;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }

    @Override // ce.h
    public final void l0() {
        ConstraintLayout constraintLayout = this.f14746Y;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        } else {
            j.n("mConstraintLayoutVerifiedSellerTag");
            throw null;
        }
    }

    @Override // ce.h
    public final void n0() {
        ImageView imageView = this.f14744W;
        if (imageView != null) {
            imageView.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.pma_ic_badge_account_verified_seller_big));
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment.RequestMoneyV3NewFragmentListener");
        this.f14758k0 = (z) activity;
        Lh.c cVarE = W4.a.e().E();
        O5.a aVar = (O5.a) cVarE.c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14757j0 = cVarE.l();
        ((AbstractC2509a) r1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_request_money_v3_new, viewGroup, false);
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
                                                    i = R.id.header_banner_background_view_pma_fragment_request_money_v3;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.header_banner_background_view_pma_fragment_request_money_v3);
                                                    if (viewFindChildViewById != null) {
                                                        i = R.id.inner_qr_card_bottom_space_pma_fragment_request_money_v3;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.inner_qr_card_bottom_space_pma_fragment_request_money_v3);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.inner_qr_card_top_space_pma_fragment_request_money_v3;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.inner_qr_card_top_space_pma_fragment_request_money_v3);
                                                            if (viewFindChildViewById3 != null) {
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
                                                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.qr_code_image_pma_fragment_request_money_v3);
                                                                                    if (imageView != null) {
                                                                                        i = R.id.screenshot_view_pma_fragment_request_money_v3;
                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.screenshot_view_pma_fragment_request_money_v3);
                                                                                        if (constraintLayout2 != null) {
                                                                                            i = R.id.share_text_pma_fragment_request_money_v3;
                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.share_text_pma_fragment_request_money_v3)) != null) {
                                                                                                i = R.id.share_view_pma_fragment_request_money_v3;
                                                                                                FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.share_view_pma_fragment_request_money_v3);
                                                                                                if (frameLayout4 != null) {
                                                                                                    i = R.id.upgraded_badge_image_pma_fragment_request_money_v3;
                                                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.upgraded_badge_image_pma_fragment_request_money_v3);
                                                                                                    if (imageView2 != null) {
                                                                                                        i = R.id.verified_seller_info_icon_image_view_pma_fragment_request_money_v3;
                                                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.verified_seller_info_icon_image_view_pma_fragment_request_money_v3);
                                                                                                        if (imageView3 != null) {
                                                                                                            i = R.id.verified_seller_tag_constraint_layout_pma_fragment_request_money_v3;
                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.verified_seller_tag_constraint_layout_pma_fragment_request_money_v3);
                                                                                                            if (constraintLayout3 != null) {
                                                                                                                i = R.id.verified_seller_tag_text_view_pma_fragment_request_money_v3;
                                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.verified_seller_tag_text_view_pma_fragment_request_money_v3)) != null) {
                                                                                                                    this.f14740S = new O(constraintLayout, textView, frameLayout, group, frameLayout2, cardView, group2, frameLayout3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, textView2, textView3, textView4, imageView, constraintLayout2, frameLayout4, imageView2, imageView3, constraintLayout3);
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
        this.f14740S = null;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        z zVar = this.f14758k0;
        if (zVar != null) {
            ((RequestMoneyV3Activity) zVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TransferAppLink transferAppLinkK;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        O o8 = this.f14740S;
        j.d(o8);
        this.f14741T = (ConstraintLayout) o8.m;
        O o10 = this.f14740S;
        j.d(o10);
        this.f14742U = o10.h;
        O o11 = this.f14740S;
        j.d(o11);
        this.f14743V = o11.f3810k;
        O o12 = this.f14740S;
        j.d(o12);
        this.f14744W = o12.f3811l;
        O o13 = this.f14740S;
        j.d(o13);
        this.f14745X = o13.i;
        O o14 = this.f14740S;
        j.d(o14);
        this.f14746Y = (ConstraintLayout) o14.f3819u;
        O o15 = this.f14740S;
        j.d(o15);
        this.f14747Z = (ImageView) o15.f3818t;
        O o16 = this.f14740S;
        j.d(o16);
        this.f14748a0 = (CardView) o16.f3814p;
        O o17 = this.f14740S;
        j.d(o17);
        this.f14749b0 = o17.c;
        O o18 = this.f14740S;
        j.d(o18);
        this.f14750c0 = o18.f3807b;
        O o19 = this.f14740S;
        j.d(o19);
        this.f14751d0 = o19.f3809g;
        O o20 = this.f14740S;
        j.d(o20);
        this.f14752e0 = (FrameLayout) o20.f3815q;
        O o21 = this.f14740S;
        j.d(o21);
        this.f14753f0 = (FrameLayout) o21.e;
        O o22 = this.f14740S;
        j.d(o22);
        this.f14754g0 = o22.f;
        O o23 = this.f14740S;
        j.d(o23);
        this.f14755h0 = (FrameLayout) o23.f3813o;
        O o24 = this.f14740S;
        j.d(o24);
        this.f14756i0 = (FrameLayout) o24.j;
        Yd.b bVarR1 = r1();
        Bundle arguments = getArguments();
        if (arguments == null || (transferAppLinkK = (TransferAppLink) arguments.getParcelable("transfer_app_link")) == null) {
            transferAppLinkK = ((Zd.h) r1()).k();
        }
        ((Zd.h) bVarR1).m(transferAppLinkK);
        ConstraintLayout constraintLayout = this.f14746Y;
        if (constraintLayout == null) {
            j.n("mConstraintLayoutVerifiedSellerTag");
            throw null;
        }
        final int i = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: de.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3NewFragment f16386b;

            {
                this.f16386b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.VERIFIED_SELLER_BADGE);
                            requestMoneyV3NewFragment.o1(c1219h);
                            z zVar = requestMoneyV3NewFragment.f14758k0;
                            if (zVar != null) {
                                new VerifiedSellerInfoDialogFragment().show(((RequestMoneyV3Activity) zVar).getSupportFragmentManager(), "verified_seller_info");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment2 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment2.o1(c1219h2);
                            z zVar2 = requestMoneyV3NewFragment2.f14758k0;
                            if (zVar2 != null) {
                                ((RequestMoneyV3Activity) zVar2).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment3 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3NewFragment3.r1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment4 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment4.o1(c1219h4);
                            ((Zd.h) requestMoneyV3NewFragment4.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment5 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment5.o1(c1219h5);
                            z zVar3 = requestMoneyV3NewFragment5.f14758k0;
                            if (zVar3 != null) {
                                ((RequestMoneyV3Activity) zVar3).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        ImageView imageView = this.f14742U;
        if (imageView == null) {
            j.n("mImageViewQR");
            throw null;
        }
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new r(this, 2));
        FrameLayout frameLayout = this.f14752e0;
        if (frameLayout == null) {
            j.n("mViewGenerateCustomCode");
            throw null;
        }
        final int i4 = 1;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: de.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3NewFragment f16386b;

            {
                this.f16386b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.VERIFIED_SELLER_BADGE);
                            requestMoneyV3NewFragment.o1(c1219h);
                            z zVar = requestMoneyV3NewFragment.f14758k0;
                            if (zVar != null) {
                                new VerifiedSellerInfoDialogFragment().show(((RequestMoneyV3Activity) zVar).getSupportFragmentManager(), "verified_seller_info");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment2 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment2.o1(c1219h2);
                            z zVar2 = requestMoneyV3NewFragment2.f14758k0;
                            if (zVar2 != null) {
                                ((RequestMoneyV3Activity) zVar2).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment3 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3NewFragment3.r1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment4 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment4.o1(c1219h4);
                            ((Zd.h) requestMoneyV3NewFragment4.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment5 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment5.o1(c1219h5);
                            z zVar3 = requestMoneyV3NewFragment5.f14758k0;
                            if (zVar3 != null) {
                                ((RequestMoneyV3Activity) zVar3).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout2 = this.f14753f0;
        if (frameLayout2 == null) {
            j.n("mViewShare");
            throw null;
        }
        final int i6 = 2;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: de.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3NewFragment f16386b;

            {
                this.f16386b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.VERIFIED_SELLER_BADGE);
                            requestMoneyV3NewFragment.o1(c1219h);
                            z zVar = requestMoneyV3NewFragment.f14758k0;
                            if (zVar != null) {
                                new VerifiedSellerInfoDialogFragment().show(((RequestMoneyV3Activity) zVar).getSupportFragmentManager(), "verified_seller_info");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment2 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment2.o1(c1219h2);
                            z zVar2 = requestMoneyV3NewFragment2.f14758k0;
                            if (zVar2 != null) {
                                ((RequestMoneyV3Activity) zVar2).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment3 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3NewFragment3.r1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment4 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment4.o1(c1219h4);
                            ((Zd.h) requestMoneyV3NewFragment4.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment5 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment5.o1(c1219h5);
                            z zVar3 = requestMoneyV3NewFragment5.f14758k0;
                            if (zVar3 != null) {
                                ((RequestMoneyV3Activity) zVar3).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout3 = this.f14755h0;
        if (frameLayout3 == null) {
            j.n("mViewCustomizedQRShare");
            throw null;
        }
        final int i10 = 3;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: de.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3NewFragment f16386b;

            {
                this.f16386b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.VERIFIED_SELLER_BADGE);
                            requestMoneyV3NewFragment.o1(c1219h);
                            z zVar = requestMoneyV3NewFragment.f14758k0;
                            if (zVar != null) {
                                new VerifiedSellerInfoDialogFragment().show(((RequestMoneyV3Activity) zVar).getSupportFragmentManager(), "verified_seller_info");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment2 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment2.o1(c1219h2);
                            z zVar2 = requestMoneyV3NewFragment2.f14758k0;
                            if (zVar2 != null) {
                                ((RequestMoneyV3Activity) zVar2).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment3 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3NewFragment3.r1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment4 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment4.o1(c1219h4);
                            ((Zd.h) requestMoneyV3NewFragment4.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment5 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment5.o1(c1219h5);
                            z zVar3 = requestMoneyV3NewFragment5.f14758k0;
                            if (zVar3 != null) {
                                ((RequestMoneyV3Activity) zVar3).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        FrameLayout frameLayout4 = this.f14756i0;
        if (frameLayout4 == null) {
            j.n("mViewCustomizedQREdit");
            throw null;
        }
        final int i11 = 4;
        frameLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: de.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RequestMoneyV3NewFragment f16386b;

            {
                this.f16386b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.VERIFIED_SELLER_BADGE);
                            requestMoneyV3NewFragment.o1(c1219h);
                            z zVar = requestMoneyV3NewFragment.f14758k0;
                            if (zVar != null) {
                                new VerifiedSellerInfoDialogFragment().show(((RequestMoneyV3Activity) zVar).getSupportFragmentManager(), "verified_seller_info");
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment2 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment2.o1(c1219h2);
                            z zVar2 = requestMoneyV3NewFragment2.f14758k0;
                            if (zVar2 != null) {
                                ((RequestMoneyV3Activity) zVar2).u1(false);
                            }
                            return;
                        } finally {
                        }
                    case 2:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment3 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment3.o1(c1219h3);
                            ((Zd.h) requestMoneyV3NewFragment3.r1()).l();
                            return;
                        } finally {
                        }
                    case 3:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment4 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h4 = new C1219h();
                            c1219h4.n(17);
                            c1219h4.t(EnumC1217f.SHARE);
                            requestMoneyV3NewFragment4.o1(c1219h4);
                            ((Zd.h) requestMoneyV3NewFragment4.r1()).l();
                            return;
                        } finally {
                        }
                    default:
                        RequestMoneyV3NewFragment requestMoneyV3NewFragment5 = this.f16386b;
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h5 = new C1219h();
                            c1219h5.n(17);
                            c1219h5.t(EnumC1217f.CUSTOMIZE);
                            requestMoneyV3NewFragment5.o1(c1219h5);
                            z zVar3 = requestMoneyV3NewFragment5.f14758k0;
                            if (zVar3 != null) {
                                ((RequestMoneyV3Activity) zVar3).u1(true);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final Yd.b r1() {
        Zd.h hVar = this.f14757j0;
        if (hVar != null) {
            return hVar;
        }
        j.n("mRequestMoneyV3FragmentPresenter");
        throw null;
    }

    @Override // ce.h
    public final void y() {
        ImageView imageView = this.f14744W;
        if (imageView != null) {
            imageView.setVisibility(0);
        } else {
            j.n("mImageViewUpgradeBadge");
            throw null;
        }
    }
}
