package com.paymaya.mayaui.paybills.view.fragment.impl;

import D.C0187u;
import N5.x1;
import O5.a;
import S5.c;
import X2.h;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import ba.D;
import cj.L;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.mayaui.common.view.widget.MayaExpandableContainerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import ga.f;
import ha.y;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import org.joda.time.LocalDateTime;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements f, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f13440A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f13441B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public TextView f13442C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f13443D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public TextView f13444E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Group f13445F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f13446G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f13447H0;
    public Group I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f13448J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public Group f13449K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public TextView f13450L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f13451M0;
    public TextView N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f13452O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public TextView f13453P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public CardView f13454Q0;
    public Group R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public CardView f13455S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public LinearLayout f13456T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public Group f13457U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public Group f13458V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public Group f13459W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public Group f13460X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public Group f13461Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Group f13462Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public View f13463a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f13464b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public MayaExpandableContainerView f13465c1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public D f13467e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public y f13468f1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public x1 f13469v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public TextView f13470x0;
    public TextView y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f13471z0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final b7.f f13466d1 = new b7.f();
    public final EnumC1215d g1 = EnumC1215d.RECEIPT;

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final String G1() {
        return "bills_pay";
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.f13468f1;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        return o2();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_pay_bills_receipt_details, (ViewGroup) null, false);
        int i = R.id.account_number_bottom_barrier;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.account_number_bottom_barrier)) != null) {
            i = R.id.account_number_constraint_group;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.account_number_constraint_group);
            if (group != null) {
                i = R.id.account_number_divider_bottom_space;
                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.account_number_divider_bottom_space)) != null) {
                    i = R.id.account_number_divider_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.account_number_divider_view);
                    if (viewFindChildViewById != null) {
                        i = R.id.account_number_label_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_label_text_view);
                        if (textView != null) {
                            i = R.id.account_number_value_text_view;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_value_text_view);
                            if (textView2 != null) {
                                i = R.id.barrier_bottom_amount_breakdown;
                                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_bottom_amount_breakdown)) != null) {
                                    i = R.id.barrier_bottom_payment_method;
                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_bottom_payment_method)) != null) {
                                        i = R.id.barrier_credit_breakdown;
                                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_credit_breakdown)) != null) {
                                            i = R.id.bill_amount_paid_bottom_barrier;
                                            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_bottom_barrier)) != null) {
                                                i = R.id.bill_amount_paid_constraint_group;
                                                Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_constraint_group);
                                                if (group2 != null) {
                                                    i = R.id.bill_amount_paid_divider_bottom_space;
                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_divider_bottom_space)) != null) {
                                                        i = R.id.bill_amount_paid_divider_view;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_divider_view);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.bill_amount_paid_label_text_view;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_label_text_view);
                                                            if (textView3 != null) {
                                                                i = R.id.bill_amount_paid_value_text_view;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.bill_amount_paid_value_text_view);
                                                                if (textView4 != null) {
                                                                    i = R.id.biller_convenience_fee_bottom_barrier;
                                                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_bottom_barrier)) != null) {
                                                                        i = R.id.biller_convenience_fee_constraint_group;
                                                                        Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_constraint_group);
                                                                        if (group3 != null) {
                                                                            i = R.id.biller_convenience_fee_divider_bottom_space;
                                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_divider_bottom_space)) != null) {
                                                                                i = R.id.biller_convenience_fee_divider_view;
                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_divider_view);
                                                                                if (viewFindChildViewById3 != null) {
                                                                                    i = R.id.biller_convenience_fee_label_text_view;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_label_text_view)) != null) {
                                                                                        i = R.id.biller_convenience_fee_value_text_view;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.biller_convenience_fee_value_text_view);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.card_view_amount_breakdown_section;
                                                                                            CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_amount_breakdown_section);
                                                                                            if (cardView != null) {
                                                                                                i = R.id.card_view_expandable_transaction_details_section;
                                                                                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_expandable_transaction_details_section);
                                                                                                if (cardView2 != null) {
                                                                                                    i = R.id.card_view_payment_method_section;
                                                                                                    if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_payment_method_section)) != null) {
                                                                                                        i = R.id.card_view_static_transaction_details_section;
                                                                                                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_static_transaction_details_section);
                                                                                                        if (cardView3 != null) {
                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                            i = R.id.details_section_center_guideline;
                                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.details_section_center_guideline)) != null) {
                                                                                                                i = R.id.dynamic_fields_container_linear_layout;
                                                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_container_linear_layout);
                                                                                                                if (linearLayout != null) {
                                                                                                                    i = R.id.expandable_container_view_transaction_details;
                                                                                                                    MayaExpandableContainerView mayaExpandableContainerView = (MayaExpandableContainerView) ViewBindings.findChildViewById(viewInflate, R.id.expandable_container_view_transaction_details);
                                                                                                                    if (mayaExpandableContainerView != null) {
                                                                                                                        i = R.id.group_bottom_spacers_credit_breakdown;
                                                                                                                        Group group4 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_bottom_spacers_credit_breakdown);
                                                                                                                        if (group4 != null) {
                                                                                                                            i = R.id.group_credit_breakdown_amount;
                                                                                                                            Group group5 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_breakdown_amount);
                                                                                                                            if (group5 != null) {
                                                                                                                                i = R.id.group_credit_breakdown_document_stamp_tax;
                                                                                                                                Group group6 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_breakdown_document_stamp_tax);
                                                                                                                                if (group6 != null) {
                                                                                                                                    i = R.id.group_credit_breakdown_service_fee;
                                                                                                                                    Group group7 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_breakdown_service_fee);
                                                                                                                                    if (group7 != null) {
                                                                                                                                        i = R.id.group_credit_total_amount_constraint;
                                                                                                                                        Group group8 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_credit_total_amount_constraint);
                                                                                                                                        if (group8 != null) {
                                                                                                                                            i = R.id.group_top_spacers_credit_breakdown;
                                                                                                                                            Group group9 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_top_spacers_credit_breakdown);
                                                                                                                                            if (group9 != null) {
                                                                                                                                                i = R.id.group_transaction_details_header;
                                                                                                                                                Group group10 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_transaction_details_header);
                                                                                                                                                if (group10 != null) {
                                                                                                                                                    i = R.id.guideline_center_amount_breakdown;
                                                                                                                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_center_amount_breakdown)) != null) {
                                                                                                                                                        i = R.id.payment_method_label_text_view;
                                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_label_text_view);
                                                                                                                                                        if (textView6 != null) {
                                                                                                                                                            i = R.id.payment_method_mobile_number_text_view;
                                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_mobile_number_text_view);
                                                                                                                                                            if (textView7 != null) {
                                                                                                                                                                i = R.id.payment_method_name_text_view;
                                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_name_text_view);
                                                                                                                                                                if (textView8 != null) {
                                                                                                                                                                    i = R.id.space_bottom_credit_breakdown;
                                                                                                                                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_credit_breakdown)) != null) {
                                                                                                                                                                        i = R.id.space_bottom_divider_amount_breakdown_bill_amount;
                                                                                                                                                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_divider_amount_breakdown_bill_amount)) != null) {
                                                                                                                                                                            i = R.id.space_bottom_divider_transaction_details_header;
                                                                                                                                                                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_divider_transaction_details_header)) != null) {
                                                                                                                                                                                i = R.id.space_top_credit_breakdown_;
                                                                                                                                                                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_top_credit_breakdown_)) != null) {
                                                                                                                                                                                    i = R.id.text_view_amount_breakdown_bill_amount_label;
                                                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount_breakdown_bill_amount_label);
                                                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                                                        i = R.id.text_view_amount_breakdown_bill_amount_value;
                                                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount_breakdown_bill_amount_value);
                                                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                                                            i = R.id.text_view_amount_breakdown_biller_fee_label;
                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount_breakdown_biller_fee_label)) != null) {
                                                                                                                                                                                                i = R.id.text_view_amount_breakdown_biller_fee_value;
                                                                                                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount_breakdown_biller_fee_value);
                                                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                                                    i = R.id.text_view_credit_breakdown_amount_label;
                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_amount_label)) != null) {
                                                                                                                                                                                                        i = R.id.text_view_credit_breakdown_amount_value;
                                                                                                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_amount_value);
                                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                                            i = R.id.text_view_credit_breakdown_document_stamp_tax_label;
                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_document_stamp_tax_label)) != null) {
                                                                                                                                                                                                                i = R.id.text_view_credit_breakdown_document_stamp_tax_value;
                                                                                                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_document_stamp_tax_value);
                                                                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                                                                    i = R.id.text_view_credit_breakdown_service_fee_label;
                                                                                                                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_service_fee_label)) != null) {
                                                                                                                                                                                                                        i = R.id.text_view_credit_breakdown_service_fee_value;
                                                                                                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_breakdown_service_fee_value);
                                                                                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                                                                                            i = R.id.text_view_credit_total_amount_label;
                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_total_amount_label)) != null) {
                                                                                                                                                                                                                                i = R.id.text_view_credit_total_amount_value;
                                                                                                                                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_credit_total_amount_value);
                                                                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                                                                    i = R.id.text_view_static_reference_id_label;
                                                                                                                                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_static_reference_id_label);
                                                                                                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                                                                                                        i = R.id.text_view_static_reference_id_value;
                                                                                                                                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_static_reference_id_value);
                                                                                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                                                                                            i = R.id.text_view_transaction_details_label;
                                                                                                                                                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_details_label)) != null) {
                                                                                                                                                                                                                                                i = R.id.top_section_center_guideline;
                                                                                                                                                                                                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.top_section_center_guideline)) != null) {
                                                                                                                                                                                                                                                    i = R.id.view_divider_amount_breakdown_bill_amount;
                                                                                                                                                                                                                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_amount_breakdown_bill_amount);
                                                                                                                                                                                                                                                    if (viewFindChildViewById4 != null) {
                                                                                                                                                                                                                                                        i = R.id.view_divider_credit_breakdown;
                                                                                                                                                                                                                                                        View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_credit_breakdown);
                                                                                                                                                                                                                                                        if (viewFindChildViewById5 != null) {
                                                                                                                                                                                                                                                            i = R.id.view_divider_transaction_details_header;
                                                                                                                                                                                                                                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_transaction_details_header);
                                                                                                                                                                                                                                                            if (viewFindChildViewById6 != null) {
                                                                                                                                                                                                                                                                i = R.id.view_top_divider_credit_breakdown;
                                                                                                                                                                                                                                                                View viewFindChildViewById7 = ViewBindings.findChildViewById(viewInflate, R.id.view_top_divider_credit_breakdown);
                                                                                                                                                                                                                                                                if (viewFindChildViewById7 != null) {
                                                                                                                                                                                                                                                                    this.f13469v0 = new x1(constraintLayout, group, viewFindChildViewById, textView, textView2, group2, viewFindChildViewById2, textView3, textView4, group3, viewFindChildViewById3, textView5, cardView, cardView2, cardView3, linearLayout, mayaExpandableContainerView, group4, group5, group6, group7, group8, group9, group10, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7);
                                                                                                                                                                                                                                                                    j.f(constraintLayout, "getRoot(...)");
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

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        y yVar = this.f13468f1;
        if (yVar != null) {
            ((MayaPayBillsActivity) yVar).f();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        y yVar = this.f13468f1;
        if (yVar != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) yVar;
            mayaPayBillsActivity.n1().u(mayaPayBillsActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaPayBillsActivity.getString(R.string.maya_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void X1() {
        D dO2 = o2();
        if (dO2.e.e().isBillsPayEventsV2Enabled()) {
            Map mapA = dO2.A();
            Map mapB = dO2.B();
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapA);
            linkedHashMap.putAll(mapB);
            MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) ((f) dO2.c.get());
            mayaPayBillsReceiptFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1173g.a(10));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String string = mayaPayBillsReceiptFragment.S1().getText().toString();
            HashMap map = c1219hE.j;
            map.put("status", string);
            TextView textView = mayaPayBillsReceiptFragment.f13470x0;
            if (textView == null) {
                j.n("mPaymentMethodNameTextView");
                throw null;
            }
            map.put("payment_method", textView.getText().toString());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            mayaPayBillsReceiptFragment.o1().b(c1219hE);
        }
        FavoriteDetails favoriteDetailsN2 = ((MayaPayBillsReceiptFragment) ((f) dO2.c.get())).n2();
        if (favoriteDetailsN2 != null) {
            f fVar = (f) dO2.c.get();
            BillerTransaction billerTransactionM2 = ((MayaPayBillsReceiptFragment) ((f) dO2.c.get())).m2();
            y yVar = ((MayaPayBillsReceiptFragment) fVar).f13468f1;
            if (yVar != null) {
                MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) yVar;
                mayaPayBillsActivity.n1();
                Intent intent = new Intent(mayaPayBillsActivity, (Class<?>) MayaAddFavoriteActivity.class);
                intent.putExtra("favorite_details", favoriteDetailsN2);
                intent.putExtra("biller_transaction", billerTransactionM2);
                intent.putExtra("is_result", false);
                mayaPayBillsActivity.startActivityForResult(intent, 600);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        D dO2 = o2();
        BillerTransaction billerTransactionM2 = m2();
        if (billerTransactionM2 != null) {
            f fVar = (f) dO2.c.get();
            String amountFormattedValue = billerTransactionM2.getAmountFormattedValue();
            String billerName = billerTransactionM2.getBillerName();
            String formattedPaymentId = billerTransactionM2.getFormattedPaymentId();
            MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) fVar;
            mayaPayBillsReceiptFragment.getClass();
            String strPrint = AbstractC1234x.f11253l.withLocale(AbstractC1234x.l()).print(LocalDateTime.now().toDateTime());
            String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
            mayaPayBillsReceiptFragment.Q1().setVisibility(4);
            MayaExpandableContainerView mayaExpandableContainerView = mayaPayBillsReceiptFragment.f13465c1;
            if (mayaExpandableContainerView == null) {
                j.n("mExpandableContainerViewTransactionDetails");
                throw null;
            }
            mayaExpandableContainerView.c();
            h0 h0VarD = h0.d(mayaPayBillsReceiptFragment.M1(), new h(mayaPayBillsReceiptFragment, amountFormattedValue, billerName, formattedPaymentId, strPrint));
            h0VarD.f(mayaPayBillsReceiptFragment.O1(), mayaPayBillsReceiptFragment.N1(), mayaPayBillsReceiptFragment.K1(), mayaPayBillsReceiptFragment.L1());
            h0VarD.b(str);
        }
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        y yVar = this.f13468f1;
        if (yVar == null) {
            return true;
        }
        ((MayaPayBillsActivity) yVar).f();
        return true;
    }

    public final BillerTransaction m2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (BillerTransaction) arguments.getParcelable("biller_transaction");
        }
        return null;
    }

    public final FavoriteDetails n2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (FavoriteDetails) arguments.getParcelable("favorite_details");
        }
        return null;
    }

    public final D o2() {
        D d10 = this.f13467e1;
        if (d10 != null) {
            return d10;
        }
        j.n("mMayaPayBillsReceiptFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        C1219h c1219hM1 = m1();
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("screen", "bills_pay");
        this.f13468f1 = (y) getActivity();
        a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        this.f13467e1 = new D((com.paymaya.data.preference.a) aVar.e.get(), aVar.q(), (c) aVar.f4724k.get());
        o2().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        o2().i();
        super.onDestroy();
        this.f13469v0 = null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        D dO2 = o2();
        if (dO2.e.e().isBillsPayEventsV2Enabled()) {
            FavoriteDetails favoriteDetailsN2 = ((MayaPayBillsReceiptFragment) ((f) dO2.c.get())).n2();
            if (favoriteDetailsN2 != null) {
                String strMId = favoriteDetailsN2.mId();
                z = !(strMId == null || C2576A.H(strMId));
            }
            Map mapC = L.c(new Pair(EnumC1212a.FAVORITE, String.valueOf(z)));
            Map mapA = dO2.A();
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapC);
            linkedHashMap.putAll(mapA);
            Map mapB = dO2.B();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap2.putAll(mapB);
            MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) ((f) dO2.c.get());
            mayaPayBillsReceiptFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1173g.b(12));
            String string = mayaPayBillsReceiptFragment.S1().getText().toString();
            HashMap map = c1219hE.j;
            map.put("status", string);
            TextView textView = mayaPayBillsReceiptFragment.f13470x0;
            if (textView == null) {
                j.n("mPaymentMethodNameTextView");
                throw null;
            }
            map.put("payment_method", textView.getText().toString());
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            mayaPayBillsReceiptFragment.o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y yVar = this.f13468f1;
        if (yVar != null) {
            ((MayaPayBillsActivity) yVar).Q(this);
        }
        Z1("pay_bills");
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        x1 x1Var = this.f13469v0;
        j.d(x1Var);
        this.w0 = x1Var.f4292x;
        x1 x1Var2 = this.f13469v0;
        j.d(x1Var2);
        this.f13470x0 = x1Var2.f4294z;
        x1 x1Var3 = this.f13469v0;
        j.d(x1Var3);
        this.y0 = x1Var3.f4293y;
        x1 x1Var4 = this.f13469v0;
        j.d(x1Var4);
        this.f13471z0 = x1Var4.f4267D;
        x1 x1Var5 = this.f13469v0;
        j.d(x1Var5);
        this.f13440A0 = x1Var5.f4269F;
        x1 x1Var6 = this.f13469v0;
        j.d(x1Var6);
        this.f13441B0 = x1Var6.f4268E;
        x1 x1Var7 = this.f13469v0;
        j.d(x1Var7);
        this.f13442C0 = x1Var7.f4270G;
        x1 x1Var8 = this.f13469v0;
        j.d(x1Var8);
        this.f13443D0 = x1Var8.e;
        x1 x1Var9 = this.f13469v0;
        j.d(x1Var9);
        this.f13444E0 = x1Var9.f4278d;
        x1 x1Var10 = this.f13469v0;
        j.d(x1Var10);
        this.f13445F0 = x1Var10.f4277b;
        x1 x1Var11 = this.f13469v0;
        j.d(x1Var11);
        this.f13446G0 = x1Var11.h;
        x1 x1Var12 = this.f13469v0;
        j.d(x1Var12);
        this.f13447H0 = x1Var12.i;
        x1 x1Var13 = this.f13469v0;
        j.d(x1Var13);
        this.I0 = x1Var13.f;
        x1 x1Var14 = this.f13469v0;
        j.d(x1Var14);
        this.f13448J0 = x1Var14.f4281l;
        x1 x1Var15 = this.f13469v0;
        j.d(x1Var15);
        this.f13449K0 = x1Var15.j;
        x1 x1Var16 = this.f13469v0;
        j.d(x1Var16);
        this.f13450L0 = x1Var16.f4271H;
        x1 x1Var17 = this.f13469v0;
        j.d(x1Var17);
        this.f13451M0 = x1Var17.f4272I;
        x1 x1Var18 = this.f13469v0;
        j.d(x1Var18);
        this.R0 = x1Var18.f4291w;
        x1 x1Var19 = this.f13469v0;
        j.d(x1Var19);
        this.f13456T0 = x1Var19.f4283o;
        x1 x1Var20 = this.f13469v0;
        j.d(x1Var20);
        this.N0 = x1Var20.f4264A;
        x1 x1Var21 = this.f13469v0;
        j.d(x1Var21);
        this.f13452O0 = x1Var21.f4265B;
        x1 x1Var22 = this.f13469v0;
        j.d(x1Var22);
        this.f13453P0 = x1Var22.f4266C;
        x1 x1Var23 = this.f13469v0;
        j.d(x1Var23);
        this.f13454Q0 = x1Var23.m;
        x1 x1Var24 = this.f13469v0;
        j.d(x1Var24);
        this.f13457U0 = x1Var24.f4286r;
        x1 x1Var25 = this.f13469v0;
        j.d(x1Var25);
        this.f13458V0 = x1Var25.f4288t;
        x1 x1Var26 = this.f13469v0;
        j.d(x1Var26);
        this.f13459W0 = x1Var26.f4287s;
        x1 x1Var27 = this.f13469v0;
        j.d(x1Var27);
        this.f13460X0 = x1Var27.f4289u;
        x1 x1Var28 = this.f13469v0;
        j.d(x1Var28);
        this.f13461Y0 = x1Var28.f4290v;
        x1 x1Var29 = this.f13469v0;
        j.d(x1Var29);
        this.f13462Z0 = x1Var29.f4285q;
        x1 x1Var30 = this.f13469v0;
        j.d(x1Var30);
        this.f13455S0 = x1Var30.f4282n;
        j.d(this.f13469v0);
        i2();
        U1();
        a2();
        b2(R.string.maya_label_pay_bills_receipt_title_paid_bill);
        l2();
        k2();
        P1().setVisibility(0);
        P1().setText(R.string.maya_label_pay_bills_receipt_transaction_processing_subtitle);
        x1 x1Var31 = this.f13469v0;
        j.d(x1Var31);
        MayaExpandableContainerView mayaExpandableContainerView = x1Var31.f4284p;
        this.f13465c1 = mayaExpandableContainerView;
        mayaExpandableContainerView.c();
        this.f13463a1 = mayaExpandableContainerView.findViewById(R.id.view_divider_dynamic_fields);
        RecyclerView recyclerView = (RecyclerView) mayaExpandableContainerView.findViewById(R.id.maya_review_info_recycler_view_dynamic_fields);
        if (recyclerView == null) {
            j.n("mRecyclerViewDynamicFields");
            throw null;
        }
        recyclerView.setAdapter(this.f13466d1);
        this.f13464b1 = (MayaLabelValueReviewInfoItem) mayaExpandableContainerView.findViewById(R.id.maya_label_review_info_item_biller_reference_number);
        o2().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.g1;
    }
}
