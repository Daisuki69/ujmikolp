package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ah.p;
import G5.t;
import G6.r;
import G6.s;
import J6.d;
import K6.l;
import L6.u;
import L6.y;
import L6.z;
import N5.F;
import N5.O;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import k2.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import oi.C1986d;
import oi.C1989g;
import okhttp3.RequestBody;
import org.joda.time.DateTime;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import w.C2360b;
import w.C2361c;
import w5.AbstractC2385c;
import y5.f;
import yk.a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInViaCardFormFragment extends MayaBaseFragment implements l, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public O f11731U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public NestedScrollView f11732V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11733W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f11734X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f11735Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f11736Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ImageView f11737a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Group f11738b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f11739c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public RecyclerView f11740d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f11741e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public MayaInputLayout f11742f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Group f11743g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ImageView f11744h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView f11745i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ImageView f11746j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public MayaInputLayout f11747k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public MayaInputLayout f11748l0;
    public MayaInputLayout m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public HtmlTextView f11749n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Group f11750o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Button f11751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public s f11752q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public y f11753r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final InterfaceC1033d f11754s0;
    public final InterfaceC1033d t0;
    public d u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f11755v0 = true;

    public MayaCashInViaCardFormFragment() {
        final int i = 0;
        this.f11754s0 = C1034e.b(new Function0(this) { // from class: L6.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2848b;

            {
                this.f2848b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2848b;
                switch (i) {
                    case 0:
                        FragmentActivity activity = mayaCashInViaCardFormFragment.getActivity();
                        ArrayList arrayList = AbstractC2385c.f20699a;
                        return new com.paymaya.common.adapter.a(activity, AbstractC2385c.f20699a, new C1986d(5));
                    default:
                        FragmentActivity activity2 = mayaCashInViaCardFormFragment.getActivity();
                        ArrayList arrayList2 = AbstractC2385c.f20699a;
                        int year = DateTime.now().getYear();
                        int i4 = year + 50;
                        ArrayList arrayList3 = new ArrayList(50);
                        while (year <= i4) {
                            arrayList3.add(String.valueOf(year));
                            year++;
                        }
                        return new com.paymaya.common.adapter.a(activity2, arrayList3, new C1989g());
                }
            }
        });
        final int i4 = 1;
        this.t0 = C1034e.b(new Function0(this) { // from class: L6.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2848b;

            {
                this.f2848b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2848b;
                switch (i4) {
                    case 0:
                        FragmentActivity activity = mayaCashInViaCardFormFragment.getActivity();
                        ArrayList arrayList = AbstractC2385c.f20699a;
                        return new com.paymaya.common.adapter.a(activity, AbstractC2385c.f20699a, new C1986d(5));
                    default:
                        FragmentActivity activity2 = mayaCashInViaCardFormFragment.getActivity();
                        ArrayList arrayList2 = AbstractC2385c.f20699a;
                        int year = DateTime.now().getYear();
                        int i42 = year + 50;
                        ArrayList arrayList3 = new ArrayList(50);
                        while (year <= i42) {
                            arrayList3.add(String.valueOf(year));
                            year++;
                        }
                        return new com.paymaya.common.adapter.a(activity2, arrayList3, new C1989g());
                }
            }
        });
    }

    public static final void I1(MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment) {
        C1220i c1220iO1 = mayaCashInViaCardFormFragment.o1();
        FragmentActivity activity = mayaCashInViaCardFormFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaCashInViaCardFormFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.CONTINUE);
        c1220iO1.c(activity, c1219hD);
        s sVarH1 = mayaCashInViaCardFormFragment.H1();
        ((MayaBaseFragment) ((l) sVarH1.c.get())).E1();
        Bundle arguments = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).getArguments();
        AddMoneyViaCardSettings addMoneyViaCardSettings = arguments != null ? (AddMoneyViaCardSettings) arguments.getParcelable("settings") : null;
        String mCurrency = addMoneyViaCardSettings != null ? addMoneyViaCardSettings.getMCurrency() : null;
        String strValueOf = String.valueOf(sVarH1.f1814g);
        if (sVarH1.f) {
            C1295y0 c1295y0 = sVarH1.e;
            Bundle arguments2 = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).getArguments();
            VaultedCard vaultedCard = arguments2 != null ? (VaultedCard) arguments2.getParcelable("vaultedCard") : null;
            String strMCardTokenId = vaultedCard != null ? vaultedCard.mCardTokenId() : null;
            c1295y0.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("value", strValueOf);
            } catch (JSONException unused) {
                a.e();
            }
            try {
                jSONObject.put("currency", mCurrency);
            } catch (JSONException unused2) {
                a.e();
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("card_token_id", strMCardTokenId);
            } catch (JSONException unused3) {
                a.e();
            }
            try {
                jSONObject2.put("amount", jSONObject);
            } catch (JSONException unused4) {
                a.e();
            }
            p<CreatePullFunds> pVarCreatePullFunds = c1295y0.f11503b.createPullFunds(RequestBody.create(f.f21063a, jSONObject2.toString().getBytes(Charset.forName("UTF-8"))));
            new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreatePullFunds, pVarCreatePullFunds, b.a()), new C2360b(sVarH1, 28), 2), new C2361c(sVarH1, 25), 0).e();
            return;
        }
        C1295y0 c1295y02 = sVarH1.e;
        String strG1 = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).G1();
        MayaInputLayout mayaInputLayout = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).f11747k0;
        if (mayaInputLayout == null) {
            j.n("mMonthMayaInputLayout");
            throw null;
        }
        String strG = AbstractC1414e.g(mayaInputLayout);
        MayaInputLayout mayaInputLayout2 = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).f11748l0;
        if (mayaInputLayout2 == null) {
            j.n("mYearMayaInputLayout");
            throw null;
        }
        String strG2 = AbstractC1414e.g(mayaInputLayout2);
        MayaInputLayout mayaInputLayout3 = ((MayaCashInViaCardFormFragment) ((l) sVarH1.c.get())).m0;
        if (mayaInputLayout3 == null) {
            j.n("mCvvCodeMayaInput");
            throw null;
        }
        String strValueOf2 = String.valueOf(mayaInputLayout3.getInputEditText().getText());
        c1295y02.getClass();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("number", strG1);
        } catch (JSONException unused5) {
            a.e();
        }
        try {
            jSONObject3.put("month_expiry", strG);
        } catch (JSONException unused6) {
            a.e();
        }
        try {
            jSONObject3.put("year_expiry", strG2);
        } catch (JSONException unused7) {
            a.e();
        }
        try {
            jSONObject3.put("csc", strValueOf2);
        } catch (JSONException unused8) {
            a.e();
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("value", strValueOf);
        } catch (JSONException unused9) {
            a.e();
        }
        try {
            jSONObject4.put("currency", mCurrency);
        } catch (JSONException unused10) {
            a.e();
        }
        JSONObject jSONObject5 = new JSONObject();
        try {
            jSONObject5.put("card", jSONObject3);
        } catch (JSONException unused11) {
            a.e();
        }
        try {
            jSONObject5.put("amount", jSONObject4);
        } catch (JSONException unused12) {
            a.e();
        }
        try {
            jSONObject5.put("save_card", Boolean.TRUE);
        } catch (JSONException unused13) {
            a.e();
        }
        p<CreatePullFunds> pVarCreatePullFunds2 = c1295y02.f11503b.createPullFunds(RequestBody.create(f.f21063a, jSONObject5.toString().getBytes(Charset.forName("UTF-8"))));
        new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreatePullFunds2, pVarCreatePullFunds2, b.a()), new J5.a(sVarH1, 28), 2), new r(sVarH1, 0), 0).e();
    }

    public final String G1() {
        MayaInputLayout mayaInputLayout = this.f11742f0;
        if (mayaInputLayout != null) {
            return AbstractC1213b.M("\\s+", AbstractC1414e.g(mayaInputLayout), "");
        }
        j.n("mCardNumberMayaInputLayout");
        throw null;
    }

    public final s H1() {
        s sVar = this.f11752q0;
        if (sVar != null) {
            return sVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void J1(CreatePullFunds createPullFunds, int i) {
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.CREATE);
        A1(c1219hH);
        y yVar = this.f11753r0;
        if (yVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) yVar;
            MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment = new MayaCashInViaCardConfirmationFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("createPullFunds", createPullFunds);
            bundle.putInt("cardState", i);
            mayaCashInViaCardConfirmationFragment.setArguments(bundle);
            AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInViaCardConfirmationFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public final void K1() {
        new AlertDialog.Builder(requireContext()).setAdapter((com.paymaya.common.adapter.a) this.f11754s0.getValue(), new u(this, 0)).create().show();
        C.R(getActivity());
    }

    public final void L1() {
        new AlertDialog.Builder(requireContext()).setAdapter((com.paymaya.common.adapter.a) this.t0.getValue(), new u(this, 1)).create().show();
        C.R(getActivity());
    }

    @Override // G5.t
    public final void m(String str, View view) {
        y yVar = this.f11753r0;
        if (yVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) yVar;
            mayaCashInActivity.n1().k0(mayaCashInActivity, "https://www.paymaya.com/terms-and-condition/?in_app=true");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<Integer> mAllowedDenominations;
        super.onCreate(bundle);
        m1().r(EnumC1216e.VIA_CARD_FORM);
        this.f10338R = true;
        this.f11753r0 = (y) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11752q0 = new s(preference, c1295y0K, sessionSubject);
        H1().h(this);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        Bundle arguments = ((MayaCashInViaCardFormFragment) ((l) H1().c.get())).getArguments();
        AddMoneyViaCardSettings addMoneyViaCardSettings = arguments != null ? (AddMoneyViaCardSettings) arguments.getParcelable("settings") : null;
        if (addMoneyViaCardSettings == null || (mAllowedDenominations = addMoneyViaCardSettings.getMAllowedDenominations()) == null) {
            mAllowedDenominations = C1112C.f9377a;
        }
        this.u0 = new d(contextRequireContext, mAllowedDenominations, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_cash_in_via_card_form, viewGroup, false);
        int i = R.id.accepted_card_schemes_view;
        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.accepted_card_schemes_view)) != null) {
            i = R.id.accepted_cards_group;
            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.accepted_cards_group);
            if (group != null) {
                i = R.id.accepted_cards_title_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.accepted_cards_title_text_view)) != null) {
                    i = R.id.amount_title_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_title_text_view);
                    if (textView != null) {
                        i = R.id.card_details_title_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.card_details_title_text_view)) != null) {
                            i = R.id.card_number_maya_input_layout;
                            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.card_number_maya_input_layout);
                            if (mayaInputLayout != null) {
                                i = R.id.content_scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.content_scroll_view);
                                if (nestedScrollView != null) {
                                    i = R.id.continue_button;
                                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
                                    if (button != null) {
                                        i = R.id.cvv_hint_image_view;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.cvv_hint_image_view)) != null) {
                                            i = R.id.cvv_maya_input_layout;
                                            MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.cvv_maya_input_layout);
                                            if (mayaInputLayout2 != null) {
                                                i = R.id.dynamic_amounts_recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_amounts_recycler_view);
                                                if (recyclerView != null) {
                                                    i = R.id.jcb_logo_image_view;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.jcb_logo_image_view);
                                                    if (imageView != null) {
                                                        i = R.id.logos_guide_line;
                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.logos_guide_line)) != null) {
                                                            i = R.id.mastercard_logo_image_view;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.mastercard_logo_image_view);
                                                            if (imageView2 != null) {
                                                                i = R.id.month_maya_input_layout;
                                                                MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.month_maya_input_layout);
                                                                if (mayaInputLayout3 != null) {
                                                                    i = R.id.new_card_form_group;
                                                                    Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.new_card_form_group);
                                                                    if (group2 != null) {
                                                                        i = R.id.note_fee_text_view;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.note_fee_text_view);
                                                                        if (textView2 != null) {
                                                                            i = R.id.security_code_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.security_code_text_view)) != null) {
                                                                                i = R.id.terms_description_text_view;
                                                                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.terms_description_text_view);
                                                                                if (htmlTextView != null) {
                                                                                    i = R.id.terms_title_text_view_;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.terms_title_text_view_)) != null) {
                                                                                        i = R.id.title_header_text_view;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.validity_text_view;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.validity_text_view)) != null) {
                                                                                                i = R.id.vaulted_card_content_view;
                                                                                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.vaulted_card_content_view);
                                                                                                if (viewFindChildViewById != null) {
                                                                                                    i = R.id.vaulted_card_group;
                                                                                                    Group group3 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.vaulted_card_group);
                                                                                                    if (group3 != null) {
                                                                                                        i = R.id.vaulted_card_view;
                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.vaulted_card_view);
                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                            F fA = F.a(viewFindChildViewById2);
                                                                                                            i = R.id.visa_logo_image_view;
                                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.visa_logo_image_view);
                                                                                                            if (imageView3 != null) {
                                                                                                                i = R.id.year_maya_input_layout;
                                                                                                                MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.year_maya_input_layout);
                                                                                                                if (mayaInputLayout4 != null) {
                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                    this.f11731U = new O(constraintLayout, group, textView, mayaInputLayout, nestedScrollView, button, mayaInputLayout2, recyclerView, imageView, imageView2, mayaInputLayout3, group2, textView2, htmlTextView, textView3, viewFindChildViewById, group3, fA, imageView3, mayaInputLayout4);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        H1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11731U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y yVar = this.f11753r0;
        if (yVar != null) {
            ((MayaCashInActivity) yVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final int i = 2;
        final int i4 = 4;
        final int i6 = 3;
        final int i10 = 1;
        final int i11 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        O o8 = this.f11731U;
        j.d(o8);
        this.f11732V = (NestedScrollView) o8.f3817s;
        O o10 = this.f11731U;
        j.d(o10);
        this.f11733W = o10.f3810k;
        O o11 = this.f11731U;
        j.d(o11);
        F f = (F) o11.f3819u;
        this.f11734X = (ImageView) f.f3616g;
        this.f11735Y = (TextView) f.e;
        this.f11736Z = (TextView) f.c;
        this.f11737a0 = (ImageView) f.f;
        O o12 = this.f11731U;
        j.d(o12);
        this.f11738b0 = (Group) o12.j;
        O o13 = this.f11731U;
        j.d(o13);
        this.f11739c0 = o13.c;
        O o14 = this.f11731U;
        j.d(o14);
        this.f11740d0 = (RecyclerView) o14.m;
        O o15 = this.f11731U;
        j.d(o15);
        this.f11741e0 = o15.i;
        O o16 = this.f11731U;
        j.d(o16);
        this.f11742f0 = (MayaInputLayout) o16.f3813o;
        O o17 = this.f11731U;
        j.d(o17);
        this.f11743g0 = o17.f;
        O o18 = this.f11731U;
        j.d(o18);
        this.f11744h0 = (ImageView) o18.f3818t;
        O o19 = this.f11731U;
        j.d(o19);
        this.f11745i0 = o19.f3811l;
        O o20 = this.f11731U;
        j.d(o20);
        this.f11746j0 = o20.h;
        O o21 = this.f11731U;
        j.d(o21);
        this.f11747k0 = (MayaInputLayout) o21.f3815q;
        O o22 = this.f11731U;
        j.d(o22);
        this.f11748l0 = (MayaInputLayout) o22.f3816r;
        O o23 = this.f11731U;
        j.d(o23);
        this.m0 = (MayaInputLayout) o23.f3814p;
        O o24 = this.f11731U;
        j.d(o24);
        this.f11749n0 = (HtmlTextView) o24.e;
        O o25 = this.f11731U;
        j.d(o25);
        this.f11750o0 = o25.f3809g;
        O o26 = this.f11731U;
        j.d(o26);
        this.f11751p0 = (Button) o26.f3807b;
        H1().j();
        N6.a aVar = new N6.a(v0.o(7));
        RecyclerView recyclerView = this.f11740d0;
        if (recyclerView == null) {
            j.n("mDynamicAmountsRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new MayaCashInViaCardFormFragment$setupDynamicAmounts$1(getContext(), 4));
        RecyclerView recyclerView2 = this.f11740d0;
        if (recyclerView2 == null) {
            j.n("mDynamicAmountsRecyclerView");
            throw null;
        }
        recyclerView2.addItemDecoration(aVar);
        RecyclerView recyclerView3 = this.f11740d0;
        if (recyclerView3 == null) {
            j.n("mDynamicAmountsRecyclerView");
            throw null;
        }
        recyclerView3.setAdapter(this.u0);
        MayaInputLayout mayaInputLayout = this.f11742f0;
        if (mayaInputLayout == null) {
            j.n("mCardNumberMayaInputLayout");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        inputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(19)});
        inputEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        inputEditText.addTextChangedListener(new z(inputEditText, this));
        MayaInputLayout mayaInputLayout2 = this.f11747k0;
        if (mayaInputLayout2 == null) {
            j.n("mMonthMayaInputLayout");
            throw null;
        }
        mayaInputLayout2.getFormContainerLayout().setOnClickListener(new View.OnClickListener(this) { // from class: L6.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2846b;

            {
                this.f2846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInViaCardFormFragment.I1(mayaCashInViaCardFormFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment2.K1();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment3.K1();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment4.L1();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment5.L1();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.f11747k0;
        if (mayaInputLayout3 == null) {
            j.n("mMonthMayaInputLayout");
            throw null;
        }
        AppCompatEditText inputEditText2 = mayaInputLayout3.getInputEditText();
        inputEditText2.setInputType(0);
        inputEditText2.setOnClickListener(new View.OnClickListener(this) { // from class: L6.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2846b;

            {
                this.f2846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInViaCardFormFragment.I1(mayaCashInViaCardFormFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment2.K1();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment3.K1();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment4.L1();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment5.L1();
                            return;
                        } finally {
                        }
                }
            }
        });
        inputEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: L6.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2850b;

            {
                this.f2850b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i11) {
                    case 0:
                        if (z4) {
                            this.f2850b.K1();
                        }
                        break;
                    default:
                        if (z4) {
                            this.f2850b.L1();
                        }
                        break;
                }
            }
        });
        MayaInputLayout mayaInputLayout4 = this.f11748l0;
        if (mayaInputLayout4 == null) {
            j.n("mYearMayaInputLayout");
            throw null;
        }
        mayaInputLayout4.getFormContainerLayout().setOnClickListener(new View.OnClickListener(this) { // from class: L6.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2846b;

            {
                this.f2846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInViaCardFormFragment.I1(mayaCashInViaCardFormFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment2.K1();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment3.K1();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment4.L1();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment5.L1();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout5 = this.f11748l0;
        if (mayaInputLayout5 == null) {
            j.n("mYearMayaInputLayout");
            throw null;
        }
        AppCompatEditText inputEditText3 = mayaInputLayout5.getInputEditText();
        inputEditText3.setInputType(0);
        inputEditText3.setOnClickListener(new View.OnClickListener(this) { // from class: L6.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2846b;

            {
                this.f2846b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaCashInViaCardFormFragment.I1(mayaCashInViaCardFormFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment2.K1();
                            return;
                        } finally {
                        }
                    case 2:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment3.K1();
                            return;
                        } finally {
                        }
                    case 3:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment4.L1();
                            return;
                        } finally {
                        }
                    default:
                        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = this.f2846b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaCashInViaCardFormFragment5.L1();
                            return;
                        } finally {
                        }
                }
            }
        });
        inputEditText3.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: L6.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaCashInViaCardFormFragment f2850b;

            {
                this.f2850b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z4) {
                switch (i10) {
                    case 0:
                        if (z4) {
                            this.f2850b.K1();
                        }
                        break;
                    default:
                        if (z4) {
                            this.f2850b.L1();
                        }
                        break;
                }
            }
        });
        MayaInputLayout mayaInputLayout6 = this.m0;
        if (mayaInputLayout6 == null) {
            j.n("mCvvCodeMayaInput");
            throw null;
        }
        AppCompatEditText inputEditText4 = mayaInputLayout6.getInputEditText();
        inputEditText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
        inputEditText4.setInputType(2);
        inputEditText4.addTextChangedListener(new G5.F(this, i6));
        HtmlTextView htmlTextView = this.f11749n0;
        if (htmlTextView == null) {
            j.n("mTermsDescriptionHtmlTextView");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        NestedScrollView nestedScrollView = this.f11732V;
        if (nestedScrollView == null) {
            j.n("mScrollView");
            throw null;
        }
        TextView textView = this.f11733W;
        if (textView == null) {
            j.n("mTitleHeaderTextView");
            throw null;
        }
        G5.C.a(nestedScrollView, textView, new Ag.j(this, 5));
        Button button = this.f11751p0;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener(this) { // from class: L6.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MayaCashInViaCardFormFragment f2846b;

                {
                    this.f2846b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i11) {
                        case 0:
                            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = this.f2846b;
                            Callback.onClick_enter(view2);
                            try {
                                MayaCashInViaCardFormFragment.I1(mayaCashInViaCardFormFragment);
                                return;
                            } finally {
                            }
                        case 1:
                            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = this.f2846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaCashInViaCardFormFragment2.K1();
                                return;
                            } finally {
                            }
                        case 2:
                            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = this.f2846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaCashInViaCardFormFragment3.K1();
                                return;
                            } finally {
                            }
                        case 3:
                            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = this.f2846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaCashInViaCardFormFragment4.L1();
                                return;
                            } finally {
                            }
                        default:
                            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = this.f2846b;
                            Callback.onClick_enter(view2);
                            try {
                                mayaCashInViaCardFormFragment5.L1();
                                return;
                            } finally {
                            }
                    }
                }
            });
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
