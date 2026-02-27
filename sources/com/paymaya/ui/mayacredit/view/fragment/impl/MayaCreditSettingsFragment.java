package com.paymaya.ui.mayacredit.view.fragment.impl;

import Bb.f;
import N5.C0462k;
import O5.a;
import Sd.c;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditSettingsFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditSettingsFragment extends BaseFragment implements c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0462k f14648S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f14649T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f14650U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14651V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f14652W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f14653X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public HtmlTextView f14654Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public f f14655Z;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SETTINGS;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        a aVar = W4.a.e().k().f4754a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14655Z = new f(aVar.e(), 12);
        j.e(requireActivity(), "null cannot be cast to non-null type com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditSettingsFragment.MayaCreditSettingsFragmentListener");
        throw new ClassCastException();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_maya_credit_settings, viewGroup, false);
        int i = R.id.account_number_label_text_view_pma_fragment_maya_credit_settings;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_label_text_view_pma_fragment_maya_credit_settings)) != null) {
            i = R.id.account_number_value_text_view_pma_fragment_maya_credit_settings;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.account_number_value_text_view_pma_fragment_maya_credit_settings);
            if (textView != null) {
                i = R.id.balance_container_pma_fragment_maya_credit_settings;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.balance_container_pma_fragment_maya_credit_settings)) != null) {
                    i = R.id.billing_end_date_divider_view_pma_fragment_maya_credit_settings;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_divider_view_pma_fragment_maya_credit_settings);
                    if (viewFindChildViewById != null) {
                        i = R.id.billing_end_date_title_text_view_pma_fragment_maya_credit_settings;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_title_text_view_pma_fragment_maya_credit_settings)) != null) {
                            i = R.id.billing_end_date_value_text_view_pma_fragment_maya_credit_settings;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_value_text_view_pma_fragment_maya_credit_settings);
                            if (textView2 != null) {
                                i = R.id.billing_statement_email_title_text_view_pma_fragment_maya_credit_settings;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_email_title_text_view_pma_fragment_maya_credit_settings)) != null) {
                                    i = R.id.billing_statement_email_value_text_view_pma_fragment_maya_credit_settings;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_email_value_text_view_pma_fragment_maya_credit_settings);
                                    if (textView3 != null) {
                                        i = R.id.billing_statement_verified_image_view_pma_fragment_maya_credit_settings;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_verified_image_view_pma_fragment_maya_credit_settings);
                                        if (imageView != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                            i = R.id.credit_activated_label_text_view_pma_fragment_maya_credit_settings;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_activated_label_text_view_pma_fragment_maya_credit_settings)) != null) {
                                                i = R.id.credit_activated_value_text_view_pma_fragment_maya_credit_settings;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_activated_value_text_view_pma_fragment_maya_credit_settings);
                                                if (textView4 != null) {
                                                    i = R.id.credit_limit_divider_view_pma_fragment_maya_credit_settings;
                                                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.credit_limit_divider_view_pma_fragment_maya_credit_settings);
                                                    if (viewFindChildViewById2 != null) {
                                                        i = R.id.credit_limit_title_text_view_pma_fragment_maya_credit_settings;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_limit_title_text_view_pma_fragment_maya_credit_settings)) != null) {
                                                            i = R.id.credit_limit_value_text_view_pma_fragment_maya_credit_settings;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.credit_limit_value_text_view_pma_fragment_maya_credit_settings);
                                                            if (textView5 != null) {
                                                                i = R.id.guideline_pma_fragment_maya_credit_settings;
                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_pma_fragment_maya_credit_settings)) != null) {
                                                                    i = R.id.no_email_value_text_view_pma_fragment_maya_credit_settings;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_email_value_text_view_pma_fragment_maya_credit_settings);
                                                                    if (textView6 != null) {
                                                                        i = R.id.powered_by_lending_description_view_pma_fragment_maya_credit_settings;
                                                                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.powered_by_lending_description_view_pma_fragment_maya_credit_settings);
                                                                        if (htmlTextView != null) {
                                                                            i = R.id.service_fee_divider_view_pma_fragment_maya_credit_settings;
                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.service_fee_divider_view_pma_fragment_maya_credit_settings);
                                                                            if (viewFindChildViewById3 != null) {
                                                                                i = R.id.service_fee_title_text_view_pma_fragment_maya_credit_settings;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_title_text_view_pma_fragment_maya_credit_settings)) != null) {
                                                                                    i = R.id.service_fee_value_text_view_pma_fragment_maya_credit_settings;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_value_text_view_pma_fragment_maya_credit_settings);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.update_email_text_view_pma_fragment_maya_credit_settings;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.update_email_text_view_pma_fragment_maya_credit_settings);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.view_service_fee_text_view_pma_fragment_maya_credit_settings;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.view_service_fee_text_view_pma_fragment_maya_credit_settings);
                                                                                            if (textView9 != null) {
                                                                                                this.f14648S = new C0462k(nestedScrollView, textView, viewFindChildViewById, textView2, textView3, imageView, textView4, viewFindChildViewById2, textView5, textView6, htmlTextView, viewFindChildViewById3, textView7, textView8, textView9);
                                                                                                j.f(nestedScrollView, "getRoot(...)");
                                                                                                return nestedScrollView;
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
        f fVar = this.f14655Z;
        if (fVar == null) {
            j.n("mMayaCreditSettingsFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f14648S);
        j.d(this.f14648S);
        j.d(this.f14648S);
        j.d(this.f14648S);
        j.d(this.f14648S);
        C0462k c0462k = this.f14648S;
        j.d(c0462k);
        this.f14649T = (TextView) c0462k.c;
        C0462k c0462k2 = this.f14648S;
        j.d(c0462k2);
        this.f14650U = (TextView) c0462k2.i;
        C0462k c0462k3 = this.f14648S;
        j.d(c0462k3);
        this.f14651V = (TextView) c0462k3.e;
        C0462k c0462k4 = this.f14648S;
        j.d(c0462k4);
        this.f14652W = (ImageView) c0462k4.f4133g;
        C0462k c0462k5 = this.f14648S;
        j.d(c0462k5);
        this.f14653X = (TextView) c0462k5.f4132d;
        C0462k c0462k6 = this.f14648S;
        j.d(c0462k6);
        this.f14654Y = (HtmlTextView) c0462k6.h;
        f fVar = this.f14655Z;
        if (fVar == null) {
            j.n("mMayaCreditSettingsFragmentPresenter");
            throw null;
        }
        fVar.j();
        TextView textView = this.f14650U;
        if (textView == null) {
            j.n("mTextViewViewServiceFee");
            throw null;
        }
        final int i = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Td.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditSettingsFragment f5825b;

            {
                this.f5825b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaCreditSettingsFragment mayaCreditSettingsFragment = this.f5825b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220i = mayaCreditSettingsFragment.f10245B;
                            FragmentActivity activity = mayaCreditSettingsFragment.getActivity();
                            C1219h c1219hD = C1219h.d(mayaCreditSettingsFragment.m1());
                            c1219hD.r(EnumC1216e.SETTINGS);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.VIEW);
                            c1220i.c(activity, c1219hD);
                            return;
                        } finally {
                        }
                    default:
                        MayaCreditSettingsFragment mayaCreditSettingsFragment2 = this.f5825b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220i2 = mayaCreditSettingsFragment2.f10245B;
                            FragmentActivity activity2 = mayaCreditSettingsFragment2.getActivity();
                            C1219h c1219hD2 = C1219h.d(mayaCreditSettingsFragment2.m1());
                            c1219hD2.r(EnumC1216e.SETTINGS);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.UPDATE_EMAIL);
                            c1220i2.c(activity2, c1219hD2);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView2 = this.f14651V;
        if (textView2 == null) {
            j.n("mTextViewUpdateEmail");
            throw null;
        }
        final int i4 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: Td.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditSettingsFragment f5825b;

            {
                this.f5825b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaCreditSettingsFragment mayaCreditSettingsFragment = this.f5825b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220i = mayaCreditSettingsFragment.f10245B;
                            FragmentActivity activity = mayaCreditSettingsFragment.getActivity();
                            C1219h c1219hD = C1219h.d(mayaCreditSettingsFragment.m1());
                            c1219hD.r(EnumC1216e.SETTINGS);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.VIEW);
                            c1220i.c(activity, c1219hD);
                            return;
                        } finally {
                        }
                    default:
                        MayaCreditSettingsFragment mayaCreditSettingsFragment2 = this.f5825b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220i2 = mayaCreditSettingsFragment2.f10245B;
                            FragmentActivity activity2 = mayaCreditSettingsFragment2.getActivity();
                            C1219h c1219hD2 = C1219h.d(mayaCreditSettingsFragment2.m1());
                            c1219hD2.r(EnumC1216e.SETTINGS);
                            c1219hD2.n(17);
                            c1219hD2.t(EnumC1217f.UPDATE_EMAIL);
                            c1220i2.c(activity2, c1219hD2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Typeface font = ResourcesCompat.getFont(requireContext(), R.font.work_sans_medium);
        Typeface font2 = ResourcesCompat.getFont(requireContext(), R.font.work_sans_bold);
        HtmlTextView htmlTextView = this.f14654Y;
        if (htmlTextView == null) {
            j.n("mTextViewPoweredBy");
            throw null;
        }
        htmlTextView.setTypeface(font2);
        j.f(getString(R.string.pma_label_powered_by), "getString(...)");
        String string = getString(R.string.pma_label_maya_credit_lending_corporation);
        j.f(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new Ie.c(font), 0, r0.length() - 1, 17);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.pma_gray_140_shade)), 0, string.length(), 17);
        HtmlTextView htmlTextView2 = this.f14654Y;
        if (htmlTextView2 != null) {
            htmlTextView2.setText(spannableString);
        } else {
            j.n("mTextViewPoweredBy");
            throw null;
        }
    }
}
