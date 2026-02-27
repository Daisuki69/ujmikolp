package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Fa.c;
import L9.C0327e;
import M8.L;
import N5.C0462k;
import P9.l;
import Q9.H;
import W4.a;
import We.s;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import java.text.DecimalFormat;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditInterestRateBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements l {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Double f13287S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f13288T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f13289U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0462k f13290V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f13291W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13292X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13293Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13294Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C0327e f13295a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public H f13296b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final EnumC1216e f13297c0 = EnumC1216e.SERVICE_FEE;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f13297c0;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) a.e().D().f4752a.f4716g.get();
        this.f13295a0 = new C0327e(6);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditInterestRateBottomSheetFragment.NewMayaCreditInterestRateBottomSheetFragmentListener");
        this.f13296b0 = (H) componentRequireActivity;
        C0327e c0327e = this.f13295a0;
        if (c0327e == null) {
            j.n("mInterestRateBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 17));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_maya_credit_interest_rate_bottom_sheet, viewGroup, false);
        int i = R.id.coverage_period_divider_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.coverage_period_divider_view);
        if (viewFindChildViewById != null) {
            i = R.id.coverage_period_title_text_view;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.coverage_period_title_text_view)) != null) {
                i = R.id.coverage_period_value_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.coverage_period_value_text_view)) != null) {
                    i = R.id.done_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.done_button);
                    if (button != null) {
                        i = R.id.fees_divider_view;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.fees_divider_view);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.interest_rate_table_bottom_space;
                            if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.interest_rate_table_bottom_space)) != null) {
                                i = R.id.interest_rate_table_view;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.interest_rate_table_view);
                                if (viewFindChildViewById3 != null) {
                                    i = R.id.left_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                        i = R.id.right_guideline;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                            i = R.id.service_fee_caption_text_view;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_caption_text_view);
                                            if (textView != null) {
                                                i = R.id.service_fee_title_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_title_text_view)) != null) {
                                                    i = R.id.service_fee_value_text_view;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_value_text_view);
                                                    if (textView2 != null) {
                                                        i = R.id.sheet_background_view;
                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                                        if (viewFindChildViewById4 != null) {
                                                            i = R.id.stamp_tax_caption_text_view;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.stamp_tax_caption_text_view)) != null) {
                                                                i = R.id.stamp_tax_title_text_view;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.stamp_tax_title_text_view)) != null) {
                                                                    i = R.id.stamp_tax_value_text_view;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.stamp_tax_value_text_view)) != null) {
                                                                        i = R.id.title_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                                                                            i = R.id.top_sheet_line_view;
                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.top_sheet_line_view);
                                                                            if (viewFindChildViewById5 != null) {
                                                                                i = R.id.total_bill_amount_title_text_view;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.total_bill_amount_title_text_view)) != null) {
                                                                                    i = R.id.total_bill_amount_value_text_view;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.total_bill_amount_value_text_view);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.used_limit_title_text_view;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.used_limit_title_text_view)) != null) {
                                                                                            i = R.id.used_limit_value_text_view;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.used_limit_value_text_view)) != null) {
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                this.f13290V = new C0462k(constraintLayout, viewFindChildViewById, button, viewFindChildViewById2, viewFindChildViewById3, textView, textView2, viewFindChildViewById4, viewFindChildViewById5, textView3);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13295a0;
        if (c0327e == null) {
            j.n("mInterestRateBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        H h = this.f13296b0;
        if (h != null) {
            ((NewMayaCreditActivity) h).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13287S = Double.valueOf(arguments.getDouble("fee_rate"));
            this.f13289U = arguments.getString("button_click_event");
            this.f13288T = arguments.getString("render_view_event");
        }
        C0462k c0462k = this.f13290V;
        j.d(c0462k);
        this.f13291W = (Button) c0462k.f4133g;
        C0462k c0462k2 = this.f13290V;
        j.d(c0462k2);
        this.f13292X = (TextView) c0462k2.f4132d;
        C0462k c0462k3 = this.f13290V;
        j.d(c0462k3);
        this.f13293Y = (TextView) c0462k3.c;
        C0462k c0462k4 = this.f13290V;
        j.d(c0462k4);
        this.f13294Z = (TextView) c0462k4.e;
        C0327e c0327e = this.f13295a0;
        if (c0327e == null) {
            j.n("mInterestRateBottomSheetFragmentPresenter");
            throw null;
        }
        Double d10 = this.f13287S;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        c0327e.j();
        if (d10 != null) {
            double dDoubleValue = (d10.doubleValue() * 1000.0d) / ((double) 100);
            double d11 = 1000.0d + dDoubleValue + 0.62d;
            String str = decimalFormat.format(d10.doubleValue());
            l lVar = (l) c0327e.c.get();
            String serviceFee = s.i(str, "%");
            NewMayaCreditInterestRateBottomSheetFragment newMayaCreditInterestRateBottomSheetFragment = (NewMayaCreditInterestRateBottomSheetFragment) lVar;
            newMayaCreditInterestRateBottomSheetFragment.getClass();
            j.g(serviceFee, "serviceFee");
            TextView textView = newMayaCreditInterestRateBottomSheetFragment.f13293Y;
            if (textView == null) {
                j.n("mTextViewServiceFeeCaption");
                throw null;
            }
            textView.setText(newMayaCreditInterestRateBottomSheetFragment.getString(R.string.maya_label_interest_rate_service_fee_caption_value, serviceFee));
            l lVar2 = (l) c0327e.c.get();
            String value = decimalFormat.format(dDoubleValue).toString();
            NewMayaCreditInterestRateBottomSheetFragment newMayaCreditInterestRateBottomSheetFragment2 = (NewMayaCreditInterestRateBottomSheetFragment) lVar2;
            newMayaCreditInterestRateBottomSheetFragment2.getClass();
            j.g(value, "value");
            TextView textView2 = newMayaCreditInterestRateBottomSheetFragment2.f13292X;
            if (textView2 == null) {
                j.n("mTextViewServiceFeeValue");
                throw null;
            }
            textView2.setText(value);
            NewMayaCreditInterestRateBottomSheetFragment newMayaCreditInterestRateBottomSheetFragment3 = (NewMayaCreditInterestRateBottomSheetFragment) ((l) c0327e.c.get());
            newMayaCreditInterestRateBottomSheetFragment3.getClass();
            TextView textView3 = newMayaCreditInterestRateBottomSheetFragment3.f13294Z;
            if (textView3 == null) {
                j.n("mTextViewTotalBillAmountValue");
                throw null;
            }
            textView3.setText(newMayaCreditInterestRateBottomSheetFragment3.getString(R.string.maya_label_interest_rate_total_bill_amount_value_format, "₱", Double.valueOf(d11)));
        }
        String str2 = this.f13288T;
        if (str2 != null) {
            C1220i c1220iN1 = n1();
            FragmentActivity activity = getActivity();
            C1219h c1219hE = C1219h.e(str2);
            c1219hE.i();
            c1220iN1.c(activity, c1219hE);
        }
        Button button = this.f13291W;
        if (button != null) {
            button.setOnClickListener(new L(this, 27));
        } else {
            j.n("mButtonDone");
            throw null;
        }
    }
}
