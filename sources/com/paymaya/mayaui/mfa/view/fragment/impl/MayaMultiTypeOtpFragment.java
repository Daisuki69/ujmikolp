package com.paymaya.mayaui.mfa.view.fragment.impl;

import A7.j;
import E5.a;
import G5.A;
import Ke.b;
import N5.C0435a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.store.C1270l0;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import n0.e;
import of.p;
import x9.c;
import y5.k;
import y5.l;
import y9.d;
import y9.f;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMultiTypeOtpFragment extends MayaAuthBaseFragment implements c, a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0435a f12942V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public f f12943W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaProfileInputLayout f12944X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f12945Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public HtmlTextView f12946Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f12947a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f12948b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public k f12949c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f12950d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f12951e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final long f12952f0 = 600;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public j f12953g0;

    public final j I1() {
        j jVar = this.f12953g0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mMayaMultiTypeOtpFragmentPresenter");
        throw null;
    }

    public final MfaMeta J1() {
        f fVar = this.f12943W;
        if (fVar != null) {
            return ((MayaMfaActivity) fVar).f12930q;
        }
        return null;
    }

    public final OpenMfaMeta K1() {
        f fVar = this.f12943W;
        if (fVar != null) {
            return ((MayaMfaActivity) fVar).g0();
        }
        return null;
    }

    public final void L1(Boolean bool) {
        if (!bool.booleanValue()) {
            f fVar = this.f12943W;
            if (fVar != null) {
                ((MayaMfaActivity) fVar).i2(2131231472, getString(R.string.maya_label_that_didnt_load_right), getString(R.string.maya_label_please_check_your_internet), new e(8));
                return;
            }
            return;
        }
        f fVar2 = this.f12943W;
        if (fVar2 != null) {
            String string = getString(R.string.maya_label_that_didnt_load_right);
            String string2 = getString(R.string.maya_label_please_check_your_internet);
            String string3 = getString(R.string.maya_label_close);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            ((MayaMfaActivity) fVar2).h2(2131231472, string, string2, string3, new e(9));
        }
    }

    public final void M1() {
        int i = 2;
        int i4 = 1;
        f fVar = this.f12943W;
        if (fVar != null) {
            ((MayaMfaActivity) fVar).k2(new y9.e(this, i4), new y9.e(this, i));
        }
        f fVar2 = this.f12943W;
        if (fVar2 != null) {
            String strS = AbstractC1213b.s(12);
            kotlin.jvm.internal.j.f(strS, "viewed(...)");
            Pair pair = new Pair(EnumC1212a.SCREEN_NAME, "Authentication expired (Dialog)");
            EnumC1212a enumC1212a = EnumC1212a.CHALLENGE_ID;
            MfaMeta mfaMetaJ1 = J1();
            String challengeId = mfaMetaJ1 != null ? mfaMetaJ1.getChallengeId() : null;
            if (challengeId == null) {
                challengeId = "";
            }
            ((MayaMfaActivity) fVar2).f2(strS, "Enter the OTP", M.h(pair, new Pair(enumC1212a, challengeId)));
        }
    }

    public final void N1() {
        HtmlTextView htmlTextView = this.f12946Z;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mResendCodeHtmlTextView");
            throw null;
        }
        htmlTextView.setClickable(false);
        k kVar = this.f12949c0;
        if (kVar != null) {
            kVar.cancel();
        }
        k kVar2 = new k(this, I1().d() - this.f12950d0);
        this.f12949c0 = kVar2;
        kVar2.start();
    }

    @Override // E5.a
    public final void b(String str) {
        String strGroup;
        j jVarI1 = I1();
        if (jVarI1.g()) {
            Matcher matcher = Pattern.compile(".*OTP is ([0-9]{6}).*").matcher(z.t(str, Global.NEWLINE, ""));
            if (!matcher.matches() || (strGroup = matcher.group(1)) == null) {
                return;
            }
            MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) ((c) jVarI1.c.get());
            mayaMultiTypeOtpFragment.getClass();
            MayaProfileInputLayout mayaProfileInputLayout = mayaMultiTypeOtpFragment.f12944X;
            if (mayaProfileInputLayout != null) {
                mayaProfileInputLayout.getInputEditText().setText(strGroup);
            } else {
                kotlin.jvm.internal.j.n("mOtpInput");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        O5.a aVar = W4.a.e().r().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        C1270l0 c1270l0C = aVar.C();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f12953g0 = new j(25, c1270l0C, preference);
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12943W = (f) requireActivity();
        I1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_multitype_otp, viewGroup, false);
        int i = R.id.maya_input_layout_otp;
        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_otp);
        if (mayaProfileInputLayout != null) {
            i = R.id.otp_helper_error_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.otp_helper_error_text_view);
            if (textView != null) {
                i = R.id.otp_verify_button;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.otp_verify_button);
                if (button != null) {
                    i = R.id.resend_timer_html_text_view;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.resend_timer_html_text_view);
                    if (htmlTextView != null) {
                        i = R.id.scrollable_nested_scroll_view;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view)) != null) {
                            i = R.id.text_view_enter_otp_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_enter_otp_header)) != null) {
                                i = R.id.text_view_enter_otp_sub_header;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_enter_otp_sub_header)) != null) {
                                    i = R.id.text_view_identity;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_identity);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f12942V = new C0435a((ViewGroup) constraintLayout, (Object) mayaProfileInputLayout, (Object) textView, (Object) button, (View) htmlTextView, (Object) textView2, 15);
                                        return constraintLayout;
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
        Object obj = this.f12943W;
        if (obj != null) {
            ((l) obj).W1();
        }
        I1().i();
        super.onDestroy();
        this.f12942V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        Object obj = this.f12943W;
        if (obj != null) {
            ((l) obj).W1();
        }
        k kVar = this.f12949c0;
        if (kVar != null) {
            kVar.cancel();
        }
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String sourceScreen;
        int i = 0;
        super.onResume();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        if (p.v(contextRequireContext)) {
            SmsRetrieverClient client = SmsRetriever.getClient(requireContext());
            kotlin.jvm.internal.j.f(client, "getClient(...)");
            Task<Void> taskStartSmsRetriever = client.startSmsRetriever();
            kotlin.jvm.internal.j.f(taskStartSmsRetriever, "startSmsRetriever(...)");
            taskStartSmsRetriever.addOnSuccessListener(new d(new com.squareup.wire.internal.a(this, 24), i));
        }
        f fVar = this.f12943W;
        if (fVar != null) {
            ((MayaMfaActivity) fVar).Q(this);
        }
        f fVar2 = this.f12943W;
        if (fVar2 != null) {
            String strS = AbstractC1213b.s(9);
            kotlin.jvm.internal.j.f(strS, "viewed(...)");
            MfaMeta mfaMetaJ1 = J1();
            if (mfaMetaJ1 == null || (sourceScreen = mfaMetaJ1.getFallbackSourceScreen()) == null) {
                MfaMeta mfaMetaJ12 = J1();
                sourceScreen = mfaMetaJ12 != null ? mfaMetaJ12.getSourceScreen() : null;
                if (sourceScreen == null) {
                    sourceScreen = "";
                }
            }
            Pair pair = new Pair(EnumC1212a.SCREEN_NAME, "Enter the OTP");
            EnumC1212a enumC1212a = EnumC1212a.CHALLENGE_ID;
            MfaMeta mfaMetaJ13 = J1();
            String challengeId = mfaMetaJ13 != null ? mfaMetaJ13.getChallengeId() : null;
            ((MayaMfaActivity) fVar2).f2(strS, sourceScreen, M.h(pair, new Pair(enumC1212a, challengeId != null ? challengeId : "")));
        }
        N1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.f12942V;
        kotlin.jvm.internal.j.d(c0435a);
        this.f12944X = (MayaProfileInputLayout) c0435a.c;
        C0435a c0435a2 = this.f12942V;
        kotlin.jvm.internal.j.d(c0435a2);
        this.f12945Y = (TextView) c0435a2.f4048d;
        C0435a c0435a3 = this.f12942V;
        kotlin.jvm.internal.j.d(c0435a3);
        this.f12947a0 = (Button) c0435a3.e;
        C0435a c0435a4 = this.f12942V;
        kotlin.jvm.internal.j.d(c0435a4);
        this.f12946Z = (HtmlTextView) c0435a4.f;
        TextView textView = this.f12945Y;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mOtpErrorTextView");
            throw null;
        }
        textView.setText("");
        TextView textView2 = this.f12945Y;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mOtpErrorTextView");
            throw null;
        }
        textView2.setVisibility(8);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("mobile_number");
            this.f12948b0 = string != null ? string : "";
            C0435a c0435a5 = this.f12942V;
            kotlin.jvm.internal.j.d(c0435a5);
            TextView textView3 = (TextView) c0435a5.f4049g;
            String str = this.f12948b0;
            if (str == null) {
                kotlin.jvm.internal.j.n("mMobileNumber");
                throw null;
            }
            textView3.setText(C.p(str));
        }
        Button button = this.f12947a0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mVerifyButton");
            throw null;
        }
        b.b(button, new y9.e(this, 0));
        HtmlTextView htmlTextView = this.f12946Z;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mResendCodeHtmlTextView");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new d(this, 1));
        MayaProfileInputLayout mayaProfileInputLayout = this.f12944X;
        if (mayaProfileInputLayout == null) {
            kotlin.jvm.internal.j.n("mOtpInput");
            throw null;
        }
        AppCompatEditText inputEditText = mayaProfileInputLayout.getInputEditText();
        A a8 = new A();
        a8.f1715d = new Ag.l(27, mayaProfileInputLayout, this);
        inputEditText.addTextChangedListener(a8);
        I1().j();
    }
}
