package com.paymaya.mayaui.cashin.view.fragment.impl;

import A5.l;
import Ah.p;
import G5.C0256f;
import G5.InterfaceC0254d;
import G6.i;
import G6.j;
import G6.k;
import J5.c;
import K6.f;
import Kh.T;
import Lh.d;
import N5.C0466m;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1274n0;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.widget.MayaCashInAccountLimitSection;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import v.AbstractC2329d;
import w.C2360b;
import zh.b;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInCodeFormFragment extends MayaBaseLoadingFragment implements f, InterfaceC0254d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f11650A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f11651B0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0466m f11652o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NestedScrollView f11653p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f11654q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaInputLayout f11655r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f11656s0;
    public MayaCashInAccountLimitSection t0;
    public HtmlTextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Button f11657v0;
    public k w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public L6.k f11658x0;
    public String y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f11659z0 = true;

    public static final void U1(MayaCashInCodeFormFragment mayaCashInCodeFormFragment) {
        BankPullPaymentOption bankPullPaymentOption;
        int i = 5;
        int i4 = 25;
        int i6 = 2;
        final int i10 = 0;
        k kVarR1 = mayaCashInCodeFormFragment.R1();
        String str = mayaCashInCodeFormFragment.y0;
        if (((a) kVarR1.f1794g).e().isAppEventsV2CashInEnabled()) {
            kVarR1.t("Continue");
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.CONTINUE);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("bank", str);
            c1219hH.j.put("screen_name", "form");
            c1219hH.i();
            ((MayaBaseFragment) ((f) kVarR1.c.get())).z1(c1219hH);
        }
        final k kVarR12 = mayaCashInCodeFormFragment.R1();
        if (((MayaCashInCodeFormFragment) ((f) kVarR12.c.get())).Q1() != null) {
            LoadUpPartner loadUpPartner = (LoadUpPartner) kVarR12.f1795k;
            if (loadUpPartner != null) {
                String strP1 = ((MayaCashInCodeFormFragment) ((f) kVarR12.c.get())).P1();
                ((MayaBaseFragment) ((f) kVarR12.c.get())).E1();
                p pVarA = ((C1274n0) kVarR12.h).a(loadUpPartner.mChannel(), loadUpPartner.mLimitMax().mCurrency(), strP1);
                new d(new d(AbstractC1331a.l(pVarA, pVarA, b.a()), new j(strP1, kVarR12), i6), new C2360b(kVarR12, i4), i10).e();
                return;
            }
            return;
        }
        if (((MayaCashInCodeFormFragment) ((f) kVarR12.c.get())).S1() == null || (bankPullPaymentOption = (BankPullPaymentOption) kVarR12.f1796l) == null) {
            return;
        }
        ((MayaBaseFragment) ((f) kVarR12.c.get())).E1();
        if (bankPullPaymentOption.getPaymentOption() == null) {
            C1295y0 c1295y0 = (C1295y0) kVarR12.i;
            String id = bankPullPaymentOption.getId();
            String strP12 = ((MayaCashInCodeFormFragment) ((f) kVarR12.c.get())).P1();
            c1295y0.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("value", strP12);
            } catch (JSONException unused) {
                yk.a.e();
            }
            try {
                jSONObject.put("currency", "PHP");
            } catch (JSONException unused2) {
                yk.a.e();
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("amount", jSONObject);
            } catch (JSONException unused3) {
                yk.a.e();
            }
            p<CreatePullFunds> pVarCreateBankPullFundsV2 = c1295y0.f11503b.createBankPullFundsV2(id, RequestBody.create(y5.f.f21063a, jSONObject2.toString().getBytes(Charset.forName("UTF-8"))));
            new T(i, new d(new d(AbstractC1331a.l(pVarCreateBankPullFundsV2, pVarCreateBankPullFundsV2, b.a()), new i(kVarR12, i10), i6), new c(kVarR12, 26), i10), new Ch.a() { // from class: G6.h
                @Override // Ch.a
                public final void run() {
                    switch (i10) {
                        case 0:
                            ((MayaBaseFragment) ((K6.f) kVarR12.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((K6.f) kVarR12.c.get())).w1();
                            break;
                    }
                }
            }).e();
            return;
        }
        C1295y0 c1295y02 = (C1295y0) kVarR12.i;
        String id2 = bankPullPaymentOption.getId();
        String strP13 = ((MayaCashInCodeFormFragment) ((f) kVarR12.c.get())).P1();
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        String paymentId = paymentOption != null ? paymentOption.getPaymentId() : null;
        c1295y02.getClass();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("value", strP13);
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject3.put("currency", "PHP");
        } catch (JSONException unused5) {
            yk.a.e();
        }
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject4.put("amount", jSONObject3);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        try {
            jSONObject4.put("payment_token_id", paymentId);
        } catch (JSONException unused7) {
            yk.a.e();
        }
        p<CreatePullFunds> pVarCreateBankPullFundsV22 = c1295y02.f11503b.createBankPullFundsV2(id2, RequestBody.create(y5.f.f21063a, jSONObject4.toString().getBytes(Charset.forName("UTF-8"))));
        d dVar = new d(new d(AbstractC1331a.l(pVarCreateBankPullFundsV22, pVarCreateBankPullFundsV22, b.a()), new V2.c(kVarR12, i4), i6), new l(kVarR12, 22), i10);
        final int i11 = 1;
        new T(i, dVar, new Ch.a() { // from class: G6.h
            @Override // Ch.a
            public final void run() {
                switch (i11) {
                    case 0:
                        ((MayaBaseFragment) ((K6.f) kVarR12.c.get())).w1();
                        break;
                    default:
                        ((MayaBaseFragment) ((K6.f) kVarR12.c.get())).w1();
                        break;
                }
            }
        }).e();
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_cash_in_code_form, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.maya_input_layout_amount;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_amount);
            if (mayaInputLayout != null) {
                i = R.id.scroll_view_content;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_content);
                if (nestedScrollView != null) {
                    i = R.id.text_view_footer_spiel;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_footer_spiel);
                    if (htmlTextView != null) {
                        i = R.id.text_view_note;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_note);
                        if (textView != null) {
                            i = R.id.text_view_title_header;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                            if (textView2 != null) {
                                i = R.id.view_account_limit_amount_section;
                                MayaCashInAccountLimitSection mayaCashInAccountLimitSection = (MayaCashInAccountLimitSection) ViewBindings.findChildViewById(viewInflate, R.id.view_account_limit_amount_section);
                                if (mayaCashInAccountLimitSection != null) {
                                    this.f11652o0 = new C0466m((ViewGroup) constraintLayout, (Object) button, (View) mayaInputLayout, (Object) nestedScrollView, (Object) htmlTextView, (Object) textView, (View) textView2, (View) mayaCashInAccountLimitSection, 4);
                                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                                    return constraintLayout;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_dialog_fragment_loading, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final String P1() {
        String string;
        String string2;
        MayaInputLayout mayaInputLayout = this.f11655r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        Editable text = mayaInputLayout.getInputEditText().getText();
        if (text != null && (string = text.toString()) != null) {
            int length = string.length() - 1;
            int i = 0;
            boolean z4 = false;
            while (i <= length) {
                boolean z5 = kotlin.jvm.internal.j.i(string.charAt(!z4 ? i : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    }
                    length--;
                } else if (z5) {
                    i++;
                } else {
                    z4 = true;
                }
            }
            String string3 = string.subSequence(i, length + 1).toString();
            if (string3 != null && (string2 = C2576A.b0(z.t(z.t(z.t(string3, T1(), ""), Global.BLANK, ""), ",", "")).toString()) != null) {
                return string2;
            }
        }
        return "";
    }

    public final LoadUpPartner Q1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (LoadUpPartner) arguments.getParcelable("loadup_partner");
        }
        return null;
    }

    public final k R1() {
        k kVar = this.w0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.j.n("mFragmentPresenter");
        throw null;
    }

    public final BankPullPaymentOption S1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (BankPullPaymentOption) arguments.getParcelable("payment_option");
        }
        return null;
    }

    @Override // G5.InterfaceC0254d
    public final void T() {
        MayaInputLayout mayaInputLayout = this.f11655r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.r();
        MayaInputLayout mayaInputLayout2 = this.f11655r0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout2.p();
        MayaInputLayout mayaInputLayout3 = this.f11655r0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.g();
        k kVarR1 = R1();
        kVarR1.e = false;
        kVarR1.r();
    }

    public final String T1() {
        String string = getString(R.string.pma_label_peso);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        if (Q1() != null) {
            return EnumC1216e.ENTER_AMOUNT;
        }
        if (S1() != null) {
            return EnumC1216e.FORM;
        }
        return null;
    }

    public final void V1(double d10, double d11) {
        MayaInputLayout mayaInputLayout = this.f11655r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        MayaInputLayout mayaInputLayout2 = this.f11655r0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        C0256f c0256f = new C0256f(mayaInputLayout2.getInputEditText(), d10, d11);
        c0256f.f1741o = T1();
        c0256f.f1742p = 0;
        c0256f.m = this;
        inputEditText.addTextChangedListener(c0256f);
    }

    public final void W1() {
        L1();
        MayaInputLayout mayaInputLayout = this.f11655r0;
        if (mayaInputLayout != null) {
            mayaInputLayout.c();
        } else {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f11658x0 = (L6.k) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        a preference = (a) aVar.e.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        C1274n0 c1274n0 = new C1274n0();
        c1274n0.f11465b = payMayaClientApi;
        C1295y0 c1295y0K = aVar.K();
        C1249b c1249bB = aVar.b();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.w0 = new k(preference, c1274n0, c1295y0K, c1249bB, sessionSubject);
        R1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        R1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11652o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        k kVarR1 = R1();
        if (((a) kVarR1.f1794g).e().isAppEventsV2CashInEnabled()) {
            f fVar = (f) kVarR1.c.get();
            LoadUpPartner loadUpPartner = (LoadUpPartner) kVarR1.f1795k;
            String strMName = loadUpPartner != null ? loadUpPartner.mName() : null;
            MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) fVar;
            mayaCashInCodeFormFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.r(8));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("partner", strMName);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str = mayaCashInCodeFormFragment.f11651B0;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            mayaCashInCodeFormFragment.o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        L6.k kVar = this.f11658x0;
        if (kVar != null) {
            ((MayaCashInActivity) kVar).Q(this);
        }
        String str = this.f11651B0;
        if (str == null || C2576A.H(str)) {
            L6.k kVar2 = this.f11658x0;
            this.f11651B0 = kVar2 != null ? ((MayaCashInActivity) kVar2).getIntent().getStringExtra("analytics_source_page") : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x052e  */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // G5.InterfaceC0254d
    public final void u() {
        MayaInputLayout mayaInputLayout = this.f11655r0;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.h();
        MayaInputLayout mayaInputLayout2 = this.f11655r0;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout2.f();
        MayaInputLayout mayaInputLayout3 = this.f11655r0;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
            throw null;
        }
        mayaInputLayout3.q();
        k kVarR1 = R1();
        kVarR1.e = true;
        kVarR1.r();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        LoadUpPartner loadUpPartnerQ1 = Q1();
        EnumC1215d enumC1215d = EnumC1215d.CASH_IN;
        return (loadUpPartnerQ1 == null && S1() != null) ? EnumC1215d.BANK_PULL : enumC1215d;
    }
}
