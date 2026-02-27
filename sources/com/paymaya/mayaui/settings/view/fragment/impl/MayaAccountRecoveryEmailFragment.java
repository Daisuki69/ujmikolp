package com.paymaya.mayaui.settings.view.fragment.impl;

import D.C0190x;
import E8.l;
import Kh.I;
import N5.C0447e;
import Rb.a;
import S.b;
import S5.c;
import Uh.d;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import dOYHB6.yFtIp6.svM7M6;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAccountRecoveryEmailFragment extends MayaBaseFragment implements a, e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0447e f13908U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13909V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13910W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaInputLayout f13911X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f13912Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Lb.a f13913Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Sb.e f13914a0;

    public static final void G1(MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment) {
        MayaInputLayout mayaInputLayout = mayaAccountRecoveryEmailFragment.f13911X;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutRecoveryEmail");
            throw null;
        }
        mayaInputLayout.r();
        MayaInputLayout mayaInputLayout2 = mayaAccountRecoveryEmailFragment.f13911X;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutRecoveryEmail");
            throw null;
        }
        mayaInputLayout2.p();
        Button button = mayaAccountRecoveryEmailFragment.f13912Y;
        if (button != null) {
            button.setEnabled(false);
        } else {
            j.n("mButtonSave");
            throw null;
        }
    }

    public static final void J1(MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment) {
        Lb.a aVarI1 = mayaAccountRecoveryEmailFragment.I1();
        BackUpIdentity backUpIdentityA = ((C1265j) aVarI1.e).a();
        if (backUpIdentityA == null || !j.b(((MayaAccountRecoveryEmailFragment) ((a) aVarI1.c.get())).H1(), backUpIdentityA.mValue())) {
            ((MayaAccountRecoveryEmailFragment) ((a) aVarI1.c.get())).K1();
            return;
        }
        MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment2 = (MayaAccountRecoveryEmailFragment) ((a) aVarI1.c.get());
        Sb.e eVar = mayaAccountRecoveryEmailFragment2.f13914a0;
        if (eVar != null) {
            ((MayaSettingsActivity) eVar).c2(mayaAccountRecoveryEmailFragment2.getString(R.string.maya_label_thats_not_it), mayaAccountRecoveryEmailFragment2.getString(R.string.maya_error_account_recovery_enter_reused_recovery_email));
        }
    }

    public final String H1() {
        MayaInputLayout mayaInputLayout = this.f13911X;
        if (mayaInputLayout != null) {
            return C2576A.b0(String.valueOf(mayaInputLayout.getInputEditText().getText())).toString();
        }
        j.n("mMayaInputLayoutRecoveryEmail");
        throw null;
    }

    public final Lb.a I1() {
        Lb.a aVar = this.f13913Z;
        if (aVar != null) {
            return aVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void K1() {
        Sb.e eVar = this.f13914a0;
        if (eVar != null) {
            String string = getString(R.string.maya_label_enter_password);
            j.f(string, "getString(...)");
            String string2 = getString(R.string.maya_label_account_recovery_enter_password_description);
            j.f(string2, "getString(...)");
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) eVar;
            I.j(string, string2, new Nb.a(mayaSettingsActivity, 2)).show(mayaSettingsActivity.getSupportFragmentManager(), "password_credential_dialog");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f13914a0 = (Sb.e) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1293x0 c1293x0J = aVar.J();
        S0 s0S = aVar.S();
        C1265j c1265jE = aVar.e();
        d sessionSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f13913Z = new Lb.a(preference, c1265jE, c1293x0J, s0S, sessionSubject);
        I1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_account_recovery_email, viewGroup, false);
        int i = R.id.button_save;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_save);
        if (button != null) {
            i = R.id.maya_input_layout_recovery_email;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_recovery_email);
            if (mayaInputLayout != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                i = R.id.text_view_header_description;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_description);
                if (textView != null) {
                    i = R.id.text_view_header_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_title);
                    if (textView2 != null) {
                        this.f13908U = new C0447e(11, button, mayaInputLayout, textView2, nestedScrollView, textView);
                        j.f(nestedScrollView, "getRoot(...)");
                        return nestedScrollView;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        I1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13908U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
        K1();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Sb.e eVar = this.f13914a0;
        if (eVar != null) {
            ((MayaSettingsActivity) eVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13908U;
        j.d(c0447e);
        this.f13909V = (TextView) c0447e.e;
        C0447e c0447e2 = this.f13908U;
        j.d(c0447e2);
        this.f13910W = (TextView) c0447e2.f;
        C0447e c0447e3 = this.f13908U;
        j.d(c0447e3);
        this.f13911X = (MayaInputLayout) c0447e3.f4080d;
        C0447e c0447e4 = this.f13908U;
        j.d(c0447e4);
        this.f13912Y = (Button) c0447e4.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z4 = arguments.getBoolean("has_no_recovery_email");
            Lb.a aVarI1 = I1();
            aVarI1.j();
            if (z4) {
                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = (MayaAccountRecoveryEmailFragment) ((a) aVarI1.c.get());
                TextView textView = mayaAccountRecoveryEmailFragment.f13909V;
                if (textView == null) {
                    j.n("mTextViewHeaderTitle");
                    throw null;
                }
                textView.setVisibility(8);
                TextView textView2 = mayaAccountRecoveryEmailFragment.f13910W;
                if (textView2 == null) {
                    j.n("mTextViewHeaderDescription");
                    throw null;
                }
                textView2.setVisibility(8);
            } else {
                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment2 = (MayaAccountRecoveryEmailFragment) ((a) aVarI1.c.get());
                TextView textView3 = mayaAccountRecoveryEmailFragment2.f13909V;
                if (textView3 == null) {
                    j.n("mTextViewHeaderTitle");
                    throw null;
                }
                textView3.setVisibility(0);
                TextView textView4 = mayaAccountRecoveryEmailFragment2.f13910W;
                if (textView4 == null) {
                    j.n("mTextViewHeaderDescription");
                    throw null;
                }
                textView4.setVisibility(0);
            }
            a aVar = (a) aVarI1.c.get();
            String string = svM7M6.getString(((com.paymaya.data.preference.a) aVarI1.f).f11330b, "key_email_regex", "([a-zA-Z0-9_\\-])([a-zA-Z0-9_\\-\\.]*)@(\\[((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}|((([a-zA-Z0-9\\-]+)\\.)+))([a-zA-Z]{2,}|(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\])");
            j.f(string, "getEmailRegexPattern(...)");
            MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment3 = (MayaAccountRecoveryEmailFragment) aVar;
            mayaAccountRecoveryEmailFragment3.getClass();
            MayaInputLayout mayaInputLayout = mayaAccountRecoveryEmailFragment3.f13911X;
            if (mayaInputLayout == null) {
                j.n("mMayaInputLayoutRecoveryEmail");
                throw null;
            }
            AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
            MayaInputLayout mayaInputLayout2 = mayaAccountRecoveryEmailFragment3.f13911X;
            if (mayaInputLayout2 == null) {
                j.n("mMayaInputLayoutRecoveryEmail");
                throw null;
            }
            AbstractC0983W.e(inputEditText, mayaInputLayout2, string, new C0190x(0, mayaAccountRecoveryEmailFragment3, MayaAccountRecoveryEmailFragment.class, "showEmailInputValid", "showEmailInputValid()V", 0, 26), new C0190x(0, mayaAccountRecoveryEmailFragment3, MayaAccountRecoveryEmailFragment.class, "showEmailInputInvalid", "showEmailInputInvalid()V", 0, 27), new C0190x(0, mayaAccountRecoveryEmailFragment3, MayaAccountRecoveryEmailFragment.class, "showEmailInputInvalid", "showEmailInputInvalid()V", 0, 28));
        }
        Button button = this.f13912Y;
        if (button == null) {
            j.n("mButtonSave");
            throw null;
        }
        button.setOnClickListener(new b(this, 7));
        MayaInputLayout mayaInputLayout3 = this.f13911X;
        if (mayaInputLayout3 != null) {
            mayaInputLayout3.postDelayed(new l(this, 8), 200L);
        } else {
            j.n("mMayaInputLayoutRecoveryEmail");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.ACCOUNT_RECOVERY;
    }
}
