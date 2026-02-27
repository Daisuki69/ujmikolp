package com.paymaya.ui.shopv3.view.fragment.impl;

import A7.j;
import N5.K;
import O5.a;
import Uh.d;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.ui.shopv3.view.widget.SliderActionView;
import f9.DialogInterfaceOnShowListenerC1475b;
import ph.C2070f1;
import ve.InterfaceC2347a;
import we.InterfaceC2414c;
import we.ViewOnClickListenerC2412a;

/* JADX INFO: loaded from: classes4.dex */
public class ShopV3ConfirmationBottomSheetFragment extends BaseBottomSheetDialogFragment implements InterfaceC2347a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public j f14779Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public K f14780R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public PaymentConfirmationSummary f14781S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Order f14782T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public InterfaceC2414c f14783U;

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRMATION;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1215d l1() {
        return EnumC1215d.SHOP;
    }

    public final ConstraintLayout o1() {
        K k8 = this.f14780R;
        kotlin.jvm.internal.j.d(k8);
        ConstraintLayout constraintLayout = (ConstraintLayout) k8.f3705r;
        kotlin.jvm.internal.j.f(constraintLayout, "contentConstraintLayoutP…V3ConfirmationBottomSheet");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10240P = true;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("payment_confirmation_summary");
            kotlin.jvm.internal.j.d(parcelable);
            this.f14781S = (PaymentConfirmationSummary) parcelable;
            Parcelable parcelable2 = arguments.getParcelable("purchase_order");
            kotlin.jvm.internal.j.d(parcelable2);
            this.f14782T = (Order) parcelable2;
        }
        setStyle(0, R.style.AppBottomSheetDialogTheme);
        this.f14783U = (InterfaceC2414c) getActivity();
        a aVar = W4.a.e().H().f4756a;
        this.f10238B = (C1220i) aVar.f4716g.get();
        this.f14779Q = new j(aVar.G(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get());
        q1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_shop_v3_confirmation_bottom_sheet, viewGroup, false);
        int i = R.id.account_number_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.account_number_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet);
        if (group != null) {
            i = R.id.account_number_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.account_number_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                i = R.id.account_number_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                    i = R.id.account_number_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                    if (textView != null) {
                        i = R.id.amount_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet;
                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(viewInflate, R.id.amount_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet);
                        if (barrier != null) {
                            i = R.id.amount_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                i = R.id.amount_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                if (textView2 != null) {
                                    i = R.id.close_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.close_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                    if (imageView != null) {
                                        i = R.id.confirm_purchase_header_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.confirm_purchase_header_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.content_constraint_layout_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.content_constraint_layout_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                            if (constraintLayout2 != null) {
                                                i = R.id.error_action_button_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.error_action_button_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                if (button != null) {
                                                    i = R.id.error_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.error_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                    if (group2 != null) {
                                                        i = R.id.error_icon_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.error_icon_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                            i = R.id.error_message_text_view_pma_fragment_missions_v2_enter_code_bottom_sheet;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.error_message_text_view_pma_fragment_missions_v2_enter_code_bottom_sheet);
                                                            if (textView3 != null) {
                                                                i = R.id.fund_source_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                    i = R.id.fund_source_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                        i = R.id.fund_source_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.fund_source_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                        if (textView4 != null) {
                                                                            i = R.id.left_edge_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_edge_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                                i = R.id.message_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.message_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                if (group3 != null) {
                                                                                    i = R.id.message_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.message_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                                        i = R.id.message_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.message_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                                            i = R.id.message_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.message_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.middle_content_space_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                Space space = (Space) ViewBindings.findChildViewById(viewInflate, R.id.middle_content_space_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                if (space != null) {
                                                                                                    i = R.id.middle_label_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.middle_label_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                    if (guideline != null) {
                                                                                                        i = R.id.product_icon_background_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.product_icon_background_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                        if (viewFindChildViewById != null) {
                                                                                                            i = R.id.product_icon_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.product_icon_image_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                            if (imageView2 != null) {
                                                                                                                i = R.id.product_name_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.product_name_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                if (textView6 != null) {
                                                                                                                    i = R.id.recipient_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                    Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.recipient_constraint_group_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                    if (group4 != null) {
                                                                                                                        i = R.id.recipient_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.recipient_fields_barrier_pma_fragment_shop_v3_confirmation_bottom_sheet)) != null) {
                                                                                                                            i = R.id.recipient_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_label_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i = R.id.recipient_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.recipient_value_text_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.right_edge_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_edge_guideline_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                                    if (guideline2 != null) {
                                                                                                                                        i = R.id.slide_to_buy_slider_action_view_pma_fragment_shop_v3_confirmation_bottom_sheet;
                                                                                                                                        SliderActionView sliderActionView = (SliderActionView) ViewBindings.findChildViewById(viewInflate, R.id.slide_to_buy_slider_action_view_pma_fragment_shop_v3_confirmation_bottom_sheet);
                                                                                                                                        if (sliderActionView != null) {
                                                                                                                                            this.f14780R = new K(constraintLayout, group, textView, barrier, textView2, imageView, constraintLayout, constraintLayout2, button, group2, textView3, textView4, group3, textView5, space, guideline, viewFindChildViewById, imageView2, textView6, group4, textView7, textView8, guideline2, sliderActionView);
                                                                                                                                            Dialog dialog = getDialog();
                                                                                                                                            if (dialog != null) {
                                                                                                                                                dialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 7));
                                                                                                                                            }
                                                                                                                                            K k8 = this.f14780R;
                                                                                                                                            kotlin.jvm.internal.j.d(k8);
                                                                                                                                            ConstraintLayout constraintLayout3 = k8.f3696b;
                                                                                                                                            kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                                                                                                                                            return constraintLayout3;
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

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        q1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14780R = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2414c interfaceC2414c = this.f14783U;
        if (interfaceC2414c != null) {
            interfaceC2414c.Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        K k8 = this.f14780R;
        kotlin.jvm.internal.j.d(k8);
        k8.f3699k.setOnClickListener(new ViewOnClickListenerC2412a(this, 0));
        r1().setOnStateChangeListener(new C2070f1(this, 16));
        q1().j();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        m1(c1219h);
    }

    public final Button p1() {
        K k8 = this.f14780R;
        kotlin.jvm.internal.j.d(k8);
        Button button = (Button) k8.f3707t;
        kotlin.jvm.internal.j.f(button, "errorActionButtonPmaFrag…V3ConfirmationBottomSheet");
        return button;
    }

    public final j q1() {
        j jVar = this.f14779Q;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mShopV3ConfirmationBottomSheetFragmentPresenter");
        throw null;
    }

    public final SliderActionView r1() {
        K k8 = this.f14780R;
        kotlin.jvm.internal.j.d(k8);
        SliderActionView sliderActionView = (SliderActionView) k8.f3712y;
        kotlin.jvm.internal.j.f(sliderActionView, "slideToBuySliderActionVi…V3ConfirmationBottomSheet");
        return sliderActionView;
    }
}
