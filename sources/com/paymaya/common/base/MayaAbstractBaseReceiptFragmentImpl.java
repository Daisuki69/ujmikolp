package com.paymaya.common.base;

import A5.b;
import D.C0187u;
import N5.J;
import S5.c;
import We.s;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import a7.RunnableC0647h;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;
import v.AbstractC2329d;
import w1.RunnableC2367e;
import y5.n;
import y5.t;
import y5.u;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MayaAbstractBaseReceiptFragmentImpl extends MayaBaseFragment implements t, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public J f10273U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ConstraintLayout f10274V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f10275W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f10276X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ImageView f10277Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f10278Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView f10279a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f10280b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f10281c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TextView f10282d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ImageView f10283e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f10284f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f10285g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f10286h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f10287i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public FrameLayout f10288j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public MayaCarousel f10289k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public TextView f10290l0;
    public CardView m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Group f10291n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View f10292o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Group f10293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f10294q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View f10295r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f10296s0;
    public Handler t0;
    public C0187u u0;

    public static void h2(MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl) {
        ImageView imageView = mayaAbstractBaseReceiptFragmentImpl.f10285g0;
        if (imageView == null) {
            j.n("mTransactionStatusBadgeImageView");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(mayaAbstractBaseReceiptFragmentImpl.R1().getContext(), R.drawable.maya_ic_transaction_receipt_status_completed));
        mayaAbstractBaseReceiptFragmentImpl.S1().setText(mayaAbstractBaseReceiptFragmentImpl.getString(R.string.maya_label_receipt_status_completed));
    }

    public static final void j2(MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl, View view) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.SHARE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
        c1219hH.i();
        mayaAbstractBaseReceiptFragmentImpl.A1(c1219hH);
        TextView textView = mayaAbstractBaseReceiptFragmentImpl.f10278Z;
        if (textView == null) {
            j.n("mTransactionTitleTextView");
            throw null;
        }
        textView.setVisibility(0);
        mayaAbstractBaseReceiptFragmentImpl.Y1();
        view.postDelayed(new RunnableC2367e(mayaAbstractBaseReceiptFragmentImpl, 5), 50L);
    }

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    public String G1() {
        return u1().f10786a;
    }

    public abstract n H1();

    public abstract u I1();

    public abstract View J1(LayoutInflater layoutInflater);

    public final TextView K1() {
        TextView textView = this.f10290l0;
        if (textView != null) {
            return textView;
        }
        j.n("mMoreActionsLabelTextView");
        throw null;
    }

    public final CardView L1() {
        CardView cardView = this.m0;
        if (cardView != null) {
            return cardView;
        }
        j.n("mReceiptActionsContainerCardView");
        throw null;
    }

    public final ConstraintLayout M1() {
        ConstraintLayout constraintLayout = this.f10274V;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        j.n("mReceiptContainerConstraintLayout");
        throw null;
    }

    public final ImageView N1() {
        ImageView imageView = this.f10277Y;
        if (imageView != null) {
            return imageView;
        }
        j.n("mReceiptHeaderCloseIconImageView");
        throw null;
    }

    public final ImageView O1() {
        ImageView imageView = this.f10276X;
        if (imageView != null) {
            return imageView;
        }
        j.n("mReceiptHeaderNavigationBackImageView");
        throw null;
    }

    public final TextView P1() {
        TextView textView = this.f10281c0;
        if (textView != null) {
            return textView;
        }
        j.n("mSubtitleTextView");
        throw null;
    }

    public final TextView Q1() {
        TextView textView = this.f10296s0;
        if (textView != null) {
            return textView;
        }
        j.n("mTopNotificationSnackbarTextView");
        throw null;
    }

    public final ImageView R1() {
        ImageView imageView = this.f10279a0;
        if (imageView != null) {
            return imageView;
        }
        j.n("mTransactionIconImageView");
        throw null;
    }

    public final TextView S1() {
        TextView textView = this.f10286h0;
        if (textView != null) {
            return textView;
        }
        j.n("mTransactionStatusSpielImageView");
        throw null;
    }

    public final void T1() {
        Group group = this.f10291n0;
        if (group != null) {
            group.setVisibility(8);
        } else {
            j.n("mSaveFavoritesConstraintGroup");
            throw null;
        }
    }

    public final void U1() {
        TextView textView = this.f10287i0;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            j.n("mTransactionDateTextView");
            throw null;
        }
    }

    public void V1() {
    }

    public abstract void W1();

    public void X1() {
    }

    public abstract void Y1();

    public final void Z1(String str) {
        MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = (MayaAbstractBaseReceiptFragmentImpl) ((t) ((AbstractC2252a) I1()).c.get());
        mayaAbstractBaseReceiptFragmentImpl.getClass();
        C1220i c1220iO1 = mayaAbstractBaseReceiptFragmentImpl.o1();
        FragmentActivity activity = mayaAbstractBaseReceiptFragmentImpl.getActivity();
        C1219h c1219h = new C1219h();
        c1219h.p(EnumC1215d.RECEIPT);
        c1219h.n(2);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("receipt_type", str);
        c1219h.j.put("attribution", mayaAbstractBaseReceiptFragmentImpl.n1().f10371a);
        c1220iO1.c(activity, c1219h);
        MayaCarousel mayaCarousel = ((MayaAbstractBaseReceiptFragmentImpl) ((t) ((AbstractC2252a) I1()).c.get())).f10289k0;
        if (mayaCarousel != null) {
            mayaCarousel.k();
        } else {
            j.n("mCarousel");
            throw null;
        }
    }

    public final void a2() {
        O1().setVisibility(8);
        N1().setVisibility(0);
    }

    public final void b2(int i) {
        TextView textView = this.f10275W;
        if (textView == null) {
            j.n("mReceiptHeaderTitleTextView");
            throw null;
        }
        textView.setText(i);
        TextView textView2 = this.f10278Z;
        if (textView2 != null) {
            textView2.setText(i);
        } else {
            j.n("mTransactionTitleTextView");
            throw null;
        }
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.BANNER);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, s.f(i, "CT"));
        c1219hH.i();
        A1(c1219hH);
        n nVarH1 = H1();
        if (nVarH1 != null) {
            nVarH1.f();
        }
        C0187u c0187u = this.u0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        AbstractC2252a abstractC2252a = (AbstractC2252a) I1();
        if (str == null) {
            return;
        }
        if (C.Y(str)) {
            MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = (MayaAbstractBaseReceiptFragmentImpl) ((t) abstractC2252a.c.get());
            mayaAbstractBaseReceiptFragmentImpl.getClass();
            n nVarH12 = mayaAbstractBaseReceiptFragmentImpl.H1();
            if (nVarH12 != null) {
                nVarH12.Q0(str);
                return;
            }
            return;
        }
        MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl2 = (MayaAbstractBaseReceiptFragmentImpl) ((t) abstractC2252a.c.get());
        mayaAbstractBaseReceiptFragmentImpl2.getClass();
        n nVarH13 = mayaAbstractBaseReceiptFragmentImpl2.H1();
        if (nVarH13 != null) {
            nVarH13.l(str);
        }
    }

    public final void c2(String str) {
        P1().setVisibility(0);
        TextView textViewP1 = P1();
        if (str == null) {
            str = "";
        }
        textViewP1.setText(str);
    }

    public final void d2(String str) {
        TextView textView = this.f10280b0;
        if (textView == null) {
            j.n("mTitleTextView");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f10280b0;
        if (textView2 == null) {
            j.n("mTitleTextView");
            throw null;
        }
        if (str == null) {
            str = "";
        }
        textView2.setText(str);
    }

    public final void e2(String str) {
        TextView textView = this.f10284f0;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTotalAmountTextView");
            throw null;
        }
    }

    public final void f2(String str) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_receipt_transaction_icon_length);
        C.c0(str, R.drawable.maya_ic_transaction_icon_placeholder, R1(), dimensionPixelSize, dimensionPixelSize, 1);
    }

    public final void g2(int i) {
        R1().setImageDrawable(ContextCompat.getDrawable(R1().getContext(), i));
    }

    public final void i2() {
        ImageView imageView = this.f10285g0;
        if (imageView == null) {
            j.n("mTransactionStatusBadgeImageView");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(R1().getContext(), R.drawable.maya_ic_transaction_receipt_status_processing));
        S1().setText(getString(R.string.maya_label_receipt_status_processing));
    }

    public final void k2() {
        Group group = this.f10291n0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            j.n("mSaveFavoritesConstraintGroup");
            throw null;
        }
    }

    public final void l2() {
        Group group = this.f10293p0;
        if (group != null) {
            group.setVisibility(0);
        } else {
            j.n("mShareSaveReceiptConstraintGroup");
            throw null;
        }
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = new Handler(Looper.getMainLooper());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_base_receipt_container, viewGroup, false);
        int i = R.id.bottom_brand_logo_barrier;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.bottom_brand_logo_barrier)) != null) {
            i = R.id.bottom_brand_logo_image_view;
            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.bottom_brand_logo_image_view)) != null) {
                i = R.id.brand_logo_left_divider_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.brand_logo_left_divider_view);
                if (viewFindChildViewById != null) {
                    i = R.id.brand_logo_right_divider_view;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.brand_logo_right_divider_view);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.carousel;
                        MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.carousel);
                        if (mayaCarousel != null) {
                            i = R.id.feature_content_container_frame_layout;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.feature_content_container_frame_layout);
                            if (frameLayout != null) {
                                i = R.id.more_actions_label_text_view;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.more_actions_label_text_view);
                                if (appCompatTextView != null) {
                                    i = R.id.receipt_actions_container_card_view;
                                    CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.receipt_actions_container_card_view);
                                    if (cardView != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = R.id.receipt_content_constraint_layout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.receipt_content_constraint_layout);
                                        if (constraintLayout2 != null) {
                                            i = R.id.receipt_header_background_view;
                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_background_view);
                                            if (viewFindChildViewById3 != null) {
                                                i = R.id.receipt_header_close_icon_image_view;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_close_icon_image_view);
                                                if (appCompatImageView != null) {
                                                    i = R.id.receipt_header_left_inset_space;
                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_left_inset_space)) != null) {
                                                        i = R.id.receipt_header_navigation_back_image_view;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_navigation_back_image_view);
                                                        if (appCompatImageView2 != null) {
                                                            i = R.id.receipt_header_right_inset_space;
                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_right_inset_space)) != null) {
                                                                i = R.id.receipt_header_title_text_view;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.receipt_header_title_text_view);
                                                                if (textView != null) {
                                                                    i = R.id.report_issue_action_constraint_group;
                                                                    Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.report_issue_action_constraint_group);
                                                                    if (group != null) {
                                                                        i = R.id.report_issue_action_text_view;
                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.report_issue_action_text_view)) != null) {
                                                                            i = R.id.report_issue_chevron_image_view;
                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.report_issue_chevron_image_view)) != null) {
                                                                                i = R.id.report_issue_clickable_background_view;
                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.report_issue_clickable_background_view);
                                                                                if (viewFindChildViewById4 != null) {
                                                                                    i = R.id.report_issue_icon_image_view;
                                                                                    if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.report_issue_icon_image_view)) != null) {
                                                                                        i = R.id.save_favorite_action_constraint_group;
                                                                                        Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_action_constraint_group);
                                                                                        if (group2 != null) {
                                                                                            i = R.id.save_favorite_action_text_view;
                                                                                            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_action_text_view)) != null) {
                                                                                                i = R.id.save_favorite_chevron_image_view;
                                                                                                if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_chevron_image_view)) != null) {
                                                                                                    i = R.id.save_favorite_clickable_background_view;
                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_clickable_background_view);
                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                        i = R.id.save_favorite_divider_view;
                                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_divider_view);
                                                                                                        if (viewFindChildViewById6 != null) {
                                                                                                            i = R.id.save_favorite_icon_image_view;
                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.save_favorite_icon_image_view)) != null) {
                                                                                                                i = R.id.scrollable_content_nested_scroll_view;
                                                                                                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_content_nested_scroll_view)) != null) {
                                                                                                                    i = R.id.share_save_action_constraint_group;
                                                                                                                    Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.share_save_action_constraint_group);
                                                                                                                    if (group3 != null) {
                                                                                                                        i = R.id.share_save_action_text_view;
                                                                                                                        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.share_save_action_text_view)) != null) {
                                                                                                                            i = R.id.share_save_chevron_image_view;
                                                                                                                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.share_save_chevron_image_view)) != null) {
                                                                                                                                i = R.id.share_save_clickable_background_view;
                                                                                                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.share_save_clickable_background_view);
                                                                                                                                if (viewFindChildViewById7 != null) {
                                                                                                                                    i = R.id.share_save_divider_view;
                                                                                                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(viewInflate, R.id.share_save_divider_view);
                                                                                                                                    if (viewFindChildViewById8 != null) {
                                                                                                                                        i = R.id.share_save_icon_image_view;
                                                                                                                                        if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.share_save_icon_image_view)) != null) {
                                                                                                                                            i = R.id.subtitle_text_view;
                                                                                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.subtitle_text_view);
                                                                                                                                            if (appCompatTextView2 != null) {
                                                                                                                                                i = R.id.text_view_verified_seller_badge;
                                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_verified_seller_badge);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i = R.id.title_text_view;
                                                                                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view);
                                                                                                                                                    if (appCompatTextView3 != null) {
                                                                                                                                                        i = R.id.top_notification_snackbar_text_view;
                                                                                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.top_notification_snackbar_text_view);
                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                            i = R.id.total_amount_text_view;
                                                                                                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.total_amount_text_view);
                                                                                                                                                            if (appCompatTextView4 != null) {
                                                                                                                                                                i = R.id.transaction_date_text_view;
                                                                                                                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_date_text_view);
                                                                                                                                                                if (appCompatTextView5 != null) {
                                                                                                                                                                    i = R.id.transaction_icon_image_view;
                                                                                                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_icon_image_view);
                                                                                                                                                                    if (appCompatImageView3 != null) {
                                                                                                                                                                        i = R.id.transaction_status_badge_image_view;
                                                                                                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_status_badge_image_view);
                                                                                                                                                                        if (appCompatImageView4 != null) {
                                                                                                                                                                            i = R.id.transaction_status_linear_layout;
                                                                                                                                                                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.transaction_status_linear_layout)) != null) {
                                                                                                                                                                                i = R.id.transaction_status_spiel_text_view;
                                                                                                                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_status_spiel_text_view);
                                                                                                                                                                                if (appCompatTextView6 != null) {
                                                                                                                                                                                    i = R.id.transaction_title_text_view;
                                                                                                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_title_text_view);
                                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                                        i = R.id.via_qrph_logo_image_view;
                                                                                                                                                                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.via_qrph_logo_image_view);
                                                                                                                                                                                        if (appCompatImageView5 != null) {
                                                                                                                                                                                            this.f10273U = new J(constraintLayout, viewFindChildViewById, viewFindChildViewById2, mayaCarousel, frameLayout, appCompatTextView, cardView, constraintLayout2, viewFindChildViewById3, appCompatImageView, appCompatImageView2, textView, group, viewFindChildViewById4, group2, viewFindChildViewById5, viewFindChildViewById6, group3, viewFindChildViewById7, viewFindChildViewById8, appCompatTextView2, textView2, appCompatTextView3, textView3, appCompatTextView4, appCompatTextView5, appCompatImageView3, appCompatImageView4, appCompatTextView6, textView4, appCompatImageView5);
                                                                                                                                                                                            frameLayout.addView(J1(inflater));
                                                                                                                                                                                            J j = this.f10273U;
                                                                                                                                                                                            j.d(j);
                                                                                                                                                                                            return j.f3673a;
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Handler handler = this.t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MayaCarousel mayaCarousel = ((MayaAbstractBaseReceiptFragmentImpl) ((t) ((AbstractC2252a) I1()).c.get())).f10289k0;
        if (mayaCarousel != null) {
            mayaCarousel.m();
        } else {
            j.n("mCarousel");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        J j = this.f10273U;
        j.d(j);
        this.f10274V = j.h;
        J j6 = this.f10273U;
        j.d(j6);
        this.f10276X = j6.f3677k;
        J j7 = this.f10273U;
        j.d(j7);
        this.f10275W = j7.f3678l;
        J j9 = this.f10273U;
        j.d(j9);
        this.f10277Y = j9.j;
        J j10 = this.f10273U;
        j.d(j10);
        this.f10278Z = j10.f3671C;
        J j11 = this.f10273U;
        j.d(j11);
        this.f10279a0 = j11.f3691z;
        J j12 = this.f10273U;
        j.d(j12);
        this.f10280b0 = j12.f3687v;
        J j13 = this.f10273U;
        j.d(j13);
        this.f10281c0 = j13.f3685t;
        J j14 = this.f10273U;
        j.d(j14);
        this.f10282d0 = j14.f3686u;
        J j15 = this.f10273U;
        j.d(j15);
        this.f10283e0 = j15.f3672D;
        J j16 = this.f10273U;
        j.d(j16);
        this.f10284f0 = j16.f3689x;
        J j17 = this.f10273U;
        j.d(j17);
        this.f10285g0 = j17.f3669A;
        J j18 = this.f10273U;
        j.d(j18);
        this.f10286h0 = j18.f3670B;
        J j19 = this.f10273U;
        j.d(j19);
        this.f10287i0 = j19.f3690y;
        J j20 = this.f10273U;
        j.d(j20);
        this.f10288j0 = j20.e;
        J j21 = this.f10273U;
        j.d(j21);
        this.f10289k0 = j21.f3675d;
        J j22 = this.f10273U;
        j.d(j22);
        this.f10290l0 = j22.f;
        J j23 = this.f10273U;
        j.d(j23);
        this.m0 = j23.f3676g;
        J j24 = this.f10273U;
        j.d(j24);
        this.f10292o0 = j24.f3680o;
        J j25 = this.f10273U;
        j.d(j25);
        this.f10291n0 = j25.f3679n;
        J j26 = this.f10273U;
        j.d(j26);
        this.f10294q0 = j26.f3683r;
        J j27 = this.f10273U;
        j.d(j27);
        this.f10293p0 = j27.f3682q;
        J j28 = this.f10273U;
        j.d(j28);
        this.f10295r0 = j28.m;
        j.d(this.f10273U);
        J j29 = this.f10273U;
        j.d(j29);
        this.f10296s0 = j29.f3688w;
        a2();
        final int i = 0;
        O1().setOnClickListener(new View.OnClickListener(this) { // from class: y5.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseReceiptFragmentImpl f21070b;

            {
                this.f21070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = this.f21070b;
                switch (i) {
                    case 0:
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseReceiptFragmentImpl.getClass();
                            return;
                        } finally {
                        }
                    case 1:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CLOSE);
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h);
                            mayaAbstractBaseReceiptFragmentImpl.V1();
                            return;
                        } finally {
                        }
                    case 2:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.ADD_TO_FAVORITES);
                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h2.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h2.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h2);
                            mayaAbstractBaseReceiptFragmentImpl.X1();
                            return;
                        } finally {
                        }
                    case 3:
                        Callback.onClick_enter(view2);
                        try {
                            MayaAbstractBaseReceiptFragmentImpl.j2(mayaAbstractBaseReceiptFragmentImpl, view2);
                            return;
                        } finally {
                        }
                    default:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.REPORT);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h3.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h3.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h3);
                            mayaAbstractBaseReceiptFragmentImpl.W1();
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        N1().setOnClickListener(new View.OnClickListener(this) { // from class: y5.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseReceiptFragmentImpl f21070b;

            {
                this.f21070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = this.f21070b;
                switch (i4) {
                    case 0:
                        Callback.onClick_enter(view2);
                        try {
                            mayaAbstractBaseReceiptFragmentImpl.getClass();
                            return;
                        } finally {
                        }
                    case 1:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CLOSE);
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h);
                            mayaAbstractBaseReceiptFragmentImpl.V1();
                            return;
                        } finally {
                        }
                    case 2:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.ADD_TO_FAVORITES);
                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h2.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h2.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h2);
                            mayaAbstractBaseReceiptFragmentImpl.X1();
                            return;
                        } finally {
                        }
                    case 3:
                        Callback.onClick_enter(view2);
                        try {
                            MayaAbstractBaseReceiptFragmentImpl.j2(mayaAbstractBaseReceiptFragmentImpl, view2);
                            return;
                        } finally {
                        }
                    default:
                        Callback.onClick_enter(view2);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.REPORT);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h3.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h3.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h3);
                            mayaAbstractBaseReceiptFragmentImpl.W1();
                            return;
                        } finally {
                        }
                }
            }
        });
        View view2 = this.f10292o0;
        if (view2 == null) {
            j.n("mSaveFavoritesClickableView");
            throw null;
        }
        final int i6 = 2;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: y5.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseReceiptFragmentImpl f21070b;

            {
                this.f21070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = this.f21070b;
                switch (i6) {
                    case 0:
                        Callback.onClick_enter(view22);
                        try {
                            mayaAbstractBaseReceiptFragmentImpl.getClass();
                            return;
                        } finally {
                        }
                    case 1:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CLOSE);
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h);
                            mayaAbstractBaseReceiptFragmentImpl.V1();
                            return;
                        } finally {
                        }
                    case 2:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.ADD_TO_FAVORITES);
                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h2.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h2.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h2);
                            mayaAbstractBaseReceiptFragmentImpl.X1();
                            return;
                        } finally {
                        }
                    case 3:
                        Callback.onClick_enter(view22);
                        try {
                            MayaAbstractBaseReceiptFragmentImpl.j2(mayaAbstractBaseReceiptFragmentImpl, view22);
                            return;
                        } finally {
                        }
                    default:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.REPORT);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h3.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h3.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h3);
                            mayaAbstractBaseReceiptFragmentImpl.W1();
                            return;
                        } finally {
                        }
                }
            }
        });
        View view3 = this.f10294q0;
        if (view3 == null) {
            j.n("mShareSaveReceiptClickableView");
            throw null;
        }
        final int i10 = 3;
        view3.setOnClickListener(new View.OnClickListener(this) { // from class: y5.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseReceiptFragmentImpl f21070b;

            {
                this.f21070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = this.f21070b;
                switch (i10) {
                    case 0:
                        Callback.onClick_enter(view22);
                        try {
                            mayaAbstractBaseReceiptFragmentImpl.getClass();
                            return;
                        } finally {
                        }
                    case 1:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CLOSE);
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h);
                            mayaAbstractBaseReceiptFragmentImpl.V1();
                            return;
                        } finally {
                        }
                    case 2:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.ADD_TO_FAVORITES);
                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h2.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h2.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h2);
                            mayaAbstractBaseReceiptFragmentImpl.X1();
                            return;
                        } finally {
                        }
                    case 3:
                        Callback.onClick_enter(view22);
                        try {
                            MayaAbstractBaseReceiptFragmentImpl.j2(mayaAbstractBaseReceiptFragmentImpl, view22);
                            return;
                        } finally {
                        }
                    default:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.REPORT);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h3.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h3.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h3);
                            mayaAbstractBaseReceiptFragmentImpl.W1();
                            return;
                        } finally {
                        }
                }
            }
        });
        View view4 = this.f10295r0;
        if (view4 == null) {
            j.n("mReportIssueClickableView");
            throw null;
        }
        final int i11 = 4;
        view4.setOnClickListener(new View.OnClickListener(this) { // from class: y5.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAbstractBaseReceiptFragmentImpl f21070b;

            {
                this.f21070b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = this.f21070b;
                switch (i11) {
                    case 0:
                        Callback.onClick_enter(view22);
                        try {
                            mayaAbstractBaseReceiptFragmentImpl.getClass();
                            return;
                        } finally {
                        }
                    case 1:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.CLOSE);
                            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h);
                            mayaAbstractBaseReceiptFragmentImpl.V1();
                            return;
                        } finally {
                        }
                    case 2:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h2 = new C1219h();
                            c1219h2.n(17);
                            c1219h2.t(EnumC1217f.ADD_TO_FAVORITES);
                            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h2.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h2.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h2);
                            mayaAbstractBaseReceiptFragmentImpl.X1();
                            return;
                        } finally {
                        }
                    case 3:
                        Callback.onClick_enter(view22);
                        try {
                            MayaAbstractBaseReceiptFragmentImpl.j2(mayaAbstractBaseReceiptFragmentImpl, view22);
                            return;
                        } finally {
                        }
                    default:
                        Callback.onClick_enter(view22);
                        try {
                            C1219h c1219h3 = new C1219h();
                            c1219h3.n(17);
                            c1219h3.t(EnumC1217f.REPORT);
                            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                            c1219h3.j.put("screen", mayaAbstractBaseReceiptFragmentImpl.G1());
                            c1219h3.i();
                            mayaAbstractBaseReceiptFragmentImpl.A1(c1219h3);
                            mayaAbstractBaseReceiptFragmentImpl.W1();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaAbstractBaseReceiptFragmentImpl mayaAbstractBaseReceiptFragmentImpl = (MayaAbstractBaseReceiptFragmentImpl) ((t) ((AbstractC2252a) I1()).c.get());
        MayaCarousel mayaCarousel = mayaAbstractBaseReceiptFragmentImpl.f10289k0;
        if (mayaCarousel == null) {
            j.n("mCarousel");
            throw null;
        }
        mayaCarousel.setVisibility(0);
        MayaCarousel mayaCarousel2 = mayaAbstractBaseReceiptFragmentImpl.f10289k0;
        if (mayaCarousel2 == null) {
            j.n("mCarousel");
            throw null;
        }
        mayaCarousel2.setDividerMode(EnumC0650k.c);
        mayaCarousel2.setClevertapAdTextStyle(ClevertapAd.TextStyle.DEFAULT);
        mayaCarousel2.setFilterAdsByScreen(AbstractC1233w.f11240o);
        mayaCarousel2.setHideCarouselTitle(true);
        mayaCarousel2.setAutomaticScrolling(true);
        mayaCarousel2.setEndlessScrolling(true);
        mayaCarousel2.setCarouselListener(mayaAbstractBaseReceiptFragmentImpl);
        mayaCarousel2.setCarouselStateListener(mayaAbstractBaseReceiptFragmentImpl);
        mayaCarousel2.setBannerPriorityFixEnabled(c.b(mayaAbstractBaseReceiptFragmentImpl.q1(), b.f125o1));
        mayaCarousel2.setBannerCenterConstraint(mayaCarousel2.f12011g0);
        OneShotPreDrawListener.add(mayaCarousel2, new RunnableC0647h(mayaCarousel2, mayaCarousel2));
    }
}
