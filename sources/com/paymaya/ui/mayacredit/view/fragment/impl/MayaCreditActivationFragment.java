package com.paymaya.ui.mayacredit.view.fragment.impl;

import G5.t;
import Ie.c;
import N5.v1;
import S.b;
import Sd.a;
import Uh.d;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditActivationFragment extends BaseFragment implements a, t {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public v1 f14624S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f14625T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f14626U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14627V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f14628W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f14629X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f14630Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public HtmlTextView f14631Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f14632a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ImageView f14633b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f14634c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public RecyclerView f14635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Button f14636e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f14637f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Rd.a f14638g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Lb.a f14639h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final InterfaceC1033d f14640i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final InterfaceC1033d f14641j0;

    public MayaCreditActivationFragment() {
        final int i = 0;
        this.f14640i0 = C1034e.b(new Function0(this) { // from class: Td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditActivationFragment f5823b;

            {
                this.f5823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ResourcesCompat.getFont(this.f5823b.requireContext(), R.font.work_sans_medium);
                    default:
                        return ResourcesCompat.getFont(this.f5823b.requireContext(), R.font.work_sans_bold);
                }
            }
        });
        final int i4 = 1;
        this.f14641j0 = C1034e.b(new Function0(this) { // from class: Td.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCreditActivationFragment f5823b;

            {
                this.f5823b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return ResourcesCompat.getFont(this.f5823b.requireContext(), R.font.work_sans_medium);
                    default:
                        return ResourcesCompat.getFont(this.f5823b.requireContext(), R.font.work_sans_bold);
                }
            }
        });
    }

    public static final void s1(MayaCreditActivationFragment mayaCreditActivationFragment) {
        C1220i c1220i = mayaCreditActivationFragment.f10245B;
        FragmentActivity activity = mayaCreditActivationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaCreditActivationFragment.m1());
        c1219hD.r(EnumC1216e.ACTIVATION);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.ACTIVATE);
        c1220i.c(activity, c1219hD);
        Lb.a aVarR1 = mayaCreditActivationFragment.r1();
        TextView textView = ((MayaCreditActivationFragment) ((a) aVarR1.c.get())).f14628W;
        if (textView == null) {
            j.n("mTextViewBillingEndDateValue");
            throw null;
        }
        textView.setVisibility(0);
        MayaCreditActivationFragment mayaCreditActivationFragment2 = (MayaCreditActivationFragment) ((a) aVarR1.c.get());
        TextView textView2 = mayaCreditActivationFragment2.f14628W;
        if (textView2 == null) {
            j.n("mTextViewBillingEndDateValue");
            throw null;
        }
        textView2.setText(mayaCreditActivationFragment2.getString(R.string.pma_label_maya_credit_billing_end_date_error));
        TextView textView3 = mayaCreditActivationFragment2.f14628W;
        if (textView3 == null) {
            j.n("mTextViewBillingEndDateValue");
            throw null;
        }
        textView3.setTextColor(ContextCompat.getColor(mayaCreditActivationFragment2.requireContext(), R.color.pma_warning_100_base));
        Rd.a aVar = ((MayaCreditActivationFragment) ((a) aVarR1.c.get())).f14638g0;
        if (aVar != null) {
            ArrayList arrayList = aVar.f5489b;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((CreditAgreement) it.next()).isValid()) {
                    }
                }
                return;
            }
            return;
        }
        Rd.a aVar2 = ((MayaCreditActivationFragment) ((a) aVarR1.c.get())).f14638g0;
        if (aVar2 != null) {
            aVar2.c = true;
            aVar2.notifyDataSetChanged();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ACTIVATION;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        boolean zB = j.b(str, "Customize");
        EnumC1216e enumC1216e = EnumC1216e.ACTIVATION;
        if (!zB) {
            if (j.b(str, "KnowMore")) {
                C1220i c1220i = this.f10245B;
                FragmentActivity activity = getActivity();
                C1219h c1219hD = C1219h.d(m1());
                c1219hD.r(enumC1216e);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.SERVICE_FEE);
                c1220i.c(activity, c1219hD);
                return;
            }
            return;
        }
        C1220i c1220i2 = this.f10245B;
        FragmentActivity activity2 = getActivity();
        C1219h c1219hD2 = C1219h.d(m1());
        c1219hD2.r(enumC1216e);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.SET_END_DATE);
        c1220i2.c(activity2, c1219hD2);
        Lb.a aVarR1 = r1();
        CreditTerm creditTerm = (CreditTerm) aVarR1.f;
        if ((creditTerm != null ? creditTerm.getCreditTermScheduleSettings() : null) != null) {
            ((MayaCreditActivationFragment) ((a) aVarR1.c.get())).getClass();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        O5.a aVar = W4.a.e().k().f4754a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14639h0 = new Lb.a(aVar.A(), aVar.e(), (d) aVar.f4748y.get());
        j.e(requireActivity(), "null cannot be cast to non-null type com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditActivationFragment.MayaCreditActivationFragmentListener");
        throw new ClassCastException();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_maya_credit_activation, viewGroup, false);
        int i = R.id.amount_text_view_pma_fragment_maya_credit_activation;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_view_pma_fragment_maya_credit_activation);
        if (textView != null) {
            i = R.id.billing_bottom_barrier_pma_fragment_maya_credit_activation;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.billing_bottom_barrier_pma_fragment_maya_credit_activation)) != null) {
                i = R.id.billing_bottom_divider_view_pma_fragment_maya_credit_activation;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.billing_bottom_divider_view_pma_fragment_maya_credit_activation);
                if (viewFindChildViewById != null) {
                    i = R.id.billing_coverage_title_text_view_pma_fragment_maya_credit_activation;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_coverage_title_text_view_pma_fragment_maya_credit_activation)) != null) {
                        i = R.id.billing_coverage_value_text_view_pma_fragment_maya_credit_activation;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_coverage_value_text_view_pma_fragment_maya_credit_activation);
                        if (textView2 != null) {
                            i = R.id.billing_divider_view_pma_fragment_maya_credit_activation;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.billing_divider_view_pma_fragment_maya_credit_activation);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.billing_end_date_title_text_view_pma_fragment_maya_credit_activation;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_title_text_view_pma_fragment_maya_credit_activation)) != null) {
                                    i = R.id.billing_end_date_value_text_view_pma_fragment_maya_credit_activation;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_value_text_view_pma_fragment_maya_credit_activation);
                                    if (textView3 != null) {
                                        i = R.id.billing_statement_email_title_text_view_pma_fragment_maya_credit_activation;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_email_title_text_view_pma_fragment_maya_credit_activation)) != null) {
                                            i = R.id.billing_statement_email_value_text_view_pma_fragment_maya_credit_activation;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_email_value_text_view_pma_fragment_maya_credit_activation);
                                            if (textView4 != null) {
                                                i = R.id.billing_statement_verified_image_view_pma_fragment_maya_credit_activation;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.billing_statement_verified_image_view_pma_fragment_maya_credit_activation);
                                                if (imageView != null) {
                                                    i = R.id.card_shadow_view_pma_fragment_maya_credit_activation;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.card_shadow_view_pma_fragment_maya_credit_activation);
                                                    if (viewFindChildViewById3 != null) {
                                                        i = R.id.card_view_pma_fragment_maya_credit_activation;
                                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.card_view_pma_fragment_maya_credit_activation)) != null) {
                                                            i = R.id.center_guide_pma_fragment_maya_credit_activation;
                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.center_guide_pma_fragment_maya_credit_activation)) != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                i = R.id.customize_text_view_pma_fragment_maya_credit_activation;
                                                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.customize_text_view_pma_fragment_maya_credit_activation);
                                                                if (htmlTextView != null) {
                                                                    i = R.id.exclusive_offer_chip_view_pma_fragment_maya_credit_activation;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.exclusive_offer_chip_view_pma_fragment_maya_credit_activation);
                                                                    if (textView5 != null) {
                                                                        i = R.id.interest_rate_divider_view_pma_fragment_maya_credit_activation;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.interest_rate_divider_view_pma_fragment_maya_credit_activation);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            i = R.id.interest_rate_title_text_view_pma_fragment_maya_credit_activation;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.interest_rate_title_text_view_pma_fragment_maya_credit_activation)) != null) {
                                                                                i = R.id.interest_rate_value_text_view_pma_fragment_maya_credit_activation;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.interest_rate_value_text_view_pma_fragment_maya_credit_activation);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.know_more_text_view_pma_fragment_maya_credit_activation;
                                                                                    HtmlTextView htmlTextView2 = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.know_more_text_view_pma_fragment_maya_credit_activation);
                                                                                    if (htmlTextView2 != null) {
                                                                                        i = R.id.no_billing_statement_email_text_view_pma_fragment_maya_credit_activation;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_billing_statement_email_text_view_pma_fragment_maya_credit_activation);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.offer_expire_text_view_pma_fragment_maya_credit_activation;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.offer_expire_text_view_pma_fragment_maya_credit_activation);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.policies_content_recycler_view_pma_fragment_maya_credit_activation;
                                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.policies_content_recycler_view_pma_fragment_maya_credit_activation);
                                                                                                if (recyclerView != null) {
                                                                                                    i = R.id.policies_title_view_pma_fragment_maya_credit_activation;
                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.policies_title_view_pma_fragment_maya_credit_activation)) != null) {
                                                                                                        i = R.id.powered_by_lending_description_view_pma_fragment_maya_credit_activation;
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.powered_by_lending_description_view_pma_fragment_maya_credit_activation);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.submit_button_view_pma_fragment_maya_credit_activation;
                                                                                                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.submit_button_view_pma_fragment_maya_credit_activation);
                                                                                                            if (button != null) {
                                                                                                                i = R.id.thanks_for_joining_divider_view_pma_fragment_maya_credit_activation;
                                                                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.thanks_for_joining_divider_view_pma_fragment_maya_credit_activation);
                                                                                                                if (viewFindChildViewById5 != null) {
                                                                                                                    i = R.id.thanks_for_joining_text_view_pma_fragment_maya_credit_activation;
                                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.thanks_for_joining_text_view_pma_fragment_maya_credit_activation)) != null) {
                                                                                                                        i = R.id.top_card_guide_pma_fragment_maya_credit_activation;
                                                                                                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.top_card_guide_pma_fragment_maya_credit_activation)) != null) {
                                                                                                                            this.f14624S = new v1(nestedScrollView, textView, viewFindChildViewById, textView2, viewFindChildViewById2, textView3, textView4, imageView, viewFindChildViewById3, htmlTextView, textView5, viewFindChildViewById4, textView6, htmlTextView2, textView7, textView8, recyclerView, textView9, button, viewFindChildViewById5);
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
        r1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f14624S);
        v1 v1Var = this.f14624S;
        j.d(v1Var);
        this.f14625T = v1Var.i;
        v1 v1Var2 = this.f14624S;
        j.d(v1Var2);
        this.f14626U = (TextView) v1Var2.f4246r;
        v1 v1Var3 = this.f14624S;
        j.d(v1Var3);
        this.f14627V = v1Var3.j;
        v1 v1Var4 = this.f14624S;
        j.d(v1Var4);
        this.f14628W = (TextView) v1Var4.f4240k;
        v1 v1Var5 = this.f14624S;
        j.d(v1Var5);
        this.f14629X = (HtmlTextView) v1Var5.f4242n;
        v1 v1Var6 = this.f14624S;
        j.d(v1Var6);
        this.f14630Y = (TextView) v1Var6.f4243o;
        v1 v1Var7 = this.f14624S;
        j.d(v1Var7);
        this.f14631Z = (HtmlTextView) v1Var7.f4244p;
        v1 v1Var8 = this.f14624S;
        j.d(v1Var8);
        this.f14632a0 = (TextView) v1Var8.f4241l;
        v1 v1Var9 = this.f14624S;
        j.d(v1Var9);
        this.f14633b0 = (ImageView) v1Var9.m;
        v1 v1Var10 = this.f14624S;
        j.d(v1Var10);
        this.f14634c0 = (TextView) v1Var10.f4245q;
        v1 v1Var11 = this.f14624S;
        j.d(v1Var11);
        this.f14635d0 = (RecyclerView) v1Var11.f4247s;
        v1 v1Var12 = this.f14624S;
        j.d(v1Var12);
        this.f14636e0 = v1Var12.f;
        v1 v1Var13 = this.f14624S;
        j.d(v1Var13);
        this.f14637f0 = (TextView) v1Var13.f4248t;
        r1().j();
        HtmlTextView htmlTextView = this.f14629X;
        if (htmlTextView == null) {
            j.n("mTextViewCustomize");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        HtmlTextView htmlTextView2 = this.f14631Z;
        if (htmlTextView2 == null) {
            j.n("mTextViewKnowMore");
            throw null;
        }
        htmlTextView2.setOnLinkClickListener(this);
        HtmlTextView htmlTextView3 = this.f14629X;
        if (htmlTextView3 == null) {
            j.n("mTextViewCustomize");
            throw null;
        }
        InterfaceC1033d interfaceC1033d = this.f14640i0;
        htmlTextView3.setTypeface((Typeface) interfaceC1033d.getValue());
        HtmlTextView htmlTextView4 = this.f14631Z;
        if (htmlTextView4 == null) {
            j.n("mTextViewKnowMore");
            throw null;
        }
        htmlTextView4.setTypeface((Typeface) interfaceC1033d.getValue());
        TextView textView = this.f14637f0;
        if (textView == null) {
            j.n("mTextViewPoweredBy");
            throw null;
        }
        textView.setTypeface((Typeface) this.f14641j0.getValue());
        j.f(getString(R.string.pma_label_powered_by), "getString(...)");
        String string = getString(R.string.pma_label_maya_credit_lending_corporation);
        j.f(string, "getString(...)");
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new c((Typeface) interfaceC1033d.getValue()), 0, r8.length() - 1, 17);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.pma_gray_140_shade)), 0, string.length(), 17);
        TextView textView2 = this.f14637f0;
        if (textView2 == null) {
            j.n("mTextViewPoweredBy");
            throw null;
        }
        textView2.setText(spannableString);
        Button button = this.f14636e0;
        if (button != null) {
            button.setOnClickListener(new b(this, 13));
        } else {
            j.n("mButtonSubmit");
            throw null;
        }
    }

    public final Lb.a r1() {
        Lb.a aVar = this.f14639h0;
        if (aVar != null) {
            return aVar;
        }
        j.n("mMayaCreditActivationFragmentPresenter");
        throw null;
    }
}
