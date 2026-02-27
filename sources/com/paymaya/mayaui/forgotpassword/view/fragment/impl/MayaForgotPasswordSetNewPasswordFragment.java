package com.paymaya.mayaui.forgotpassword.view.fragment.impl;

import Ag.l;
import G5.A;
import Ke.b;
import N5.C0447e;
import O5.a;
import S5.c;
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
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.data.api.ForgotPasswordApi;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import i8.C1594b;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import m8.InterfaceC1855b;
import n8.C1937e;
import n8.f;

/* JADX INFO: loaded from: classes4.dex */
public class MayaForgotPasswordSetNewPasswordFragment extends MayaAuthBaseFragment implements InterfaceC1855b {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0447e f12374V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaProfileInputLayout f12375W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaProfileInputLayout f12376X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f12377Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f12378Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f12379a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12380b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f12381c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f12382d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f12383e0 = "";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f12384f0 = "";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public f f12385g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public C1594b f12386h0;

    public final void I1(String str, String str2, String str3) {
        C1219h c1219hE = C1219h.e(str);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", "Set a new password");
        map.put("button", str2);
        map.put("destination_page", str3);
        c1219hE.i();
        o1().c(requireActivity(), c1219hE);
    }

    public final void J1(boolean z4) {
        Button button = this.f12378Z;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mNextButton");
            throw null;
        }
    }

    public final void K1(String str) {
        MayaProfileInputLayout mayaProfileInputLayout = this.f12376X;
        if (mayaProfileInputLayout == null) {
            j.n("mMayaProfileInputLayoutConfirmNewPassword");
            throw null;
        }
        mayaProfileInputLayout.setHelperErrorText(str);
        mayaProfileInputLayout.p();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        a aVar = W4.a.e().n().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12386h0 = new C1594b(new L((ForgotPasswordApi) aVar.f4723j1.get()));
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12385g0 = (f) requireActivity();
        C1594b c1594b = this.f12386h0;
        if (c1594b != null) {
            c1594b.h(this);
        } else {
            j.n("mMayaForgotPasswordSetNewPasswordFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_forgot_password_set_new_password, viewGroup, false);
        int i = R.id.maya_input_layout_confirm_new_password;
        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_confirm_new_password);
        if (mayaProfileInputLayout != null) {
            i = R.id.maya_input_layout_set_new_password;
            MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_set_new_password);
            if (mayaProfileInputLayout2 != null) {
                i = R.id.next_button;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                if (button != null) {
                    i = R.id.scrollable_nested_scroll_view;
                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view)) != null) {
                        i = R.id.text_view_password_helper_error;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_password_helper_error);
                        if (textView != null) {
                            i = R.id.text_view_set_new_password_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_set_new_password_header)) != null) {
                                i = R.id.text_view_set_new_password_sub_header;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_set_new_password_sub_header)) != null) {
                                    i = R.id.text_view_tips_secure_password;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_tips_secure_password);
                                    if (textView2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f12374V = new C0447e(constraintLayout, mayaProfileInputLayout, mayaProfileInputLayout2, button, textView, textView2);
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
        C1594b c1594b = this.f12386h0;
        if (c1594b == null) {
            j.n("mMayaForgotPasswordSetNewPasswordFragmentPresenter");
            throw null;
        }
        c1594b.i();
        super.onDestroy();
        this.f12374V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f fVar = this.f12385g0;
        if (fVar != null) {
            ((MayaForgotPasswordActivity) fVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f12374V;
        j.d(c0447e);
        this.f12375W = (MayaProfileInputLayout) c0447e.e;
        C0447e c0447e2 = this.f12374V;
        j.d(c0447e2);
        this.f12376X = (MayaProfileInputLayout) c0447e2.f4080d;
        j.d(this.f12374V);
        C0447e c0447e3 = this.f12374V;
        j.d(c0447e3);
        this.f12377Y = (TextView) c0447e3.f;
        C0447e c0447e4 = this.f12374V;
        j.d(c0447e4);
        this.f12378Z = (Button) c0447e4.c;
        MayaProfileInputLayout mayaProfileInputLayout = this.f12375W;
        if (mayaProfileInputLayout == null) {
            j.n("mMayaProfileInputLayoutSetNewPassword");
            throw null;
        }
        final int i = 1;
        b.b(mayaProfileInputLayout.getPrimaryIconImageView(), new Function0(this) { // from class: n8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18632b;

            {
                this.f18632b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.C1936d.invoke():java.lang.Object");
            }
        });
        MayaProfileInputLayout mayaProfileInputLayout2 = this.f12376X;
        if (mayaProfileInputLayout2 == null) {
            j.n("mMayaProfileInputLayoutConfirmNewPassword");
            throw null;
        }
        final int i4 = 2;
        b.b(mayaProfileInputLayout2.getPrimaryIconImageView(), new Function0(this) { // from class: n8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18632b;

            {
                this.f18632b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.C1936d.invoke():java.lang.Object");
            }
        });
        Button button = this.f12378Z;
        if (button == null) {
            j.n("mNextButton");
            throw null;
        }
        final int i6 = 0;
        b.b(button, new Function0(this) { // from class: n8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18632b;

            {
                this.f18632b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.C1936d.invoke():java.lang.Object");
            }
        });
        TextView textView = this.f12377Y;
        if (textView == null) {
            j.n("mTextViewTipsSecurePassword");
            throw null;
        }
        final int i10 = 3;
        b.b(textView, new Function0(this) { // from class: n8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18632b;

            {
                this.f18632b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.C1936d.invoke():java.lang.Object");
            }
        });
        MayaProfileInputLayout mayaProfileInputLayout3 = this.f12375W;
        if (mayaProfileInputLayout3 == null) {
            j.n("mMayaProfileInputLayoutSetNewPassword");
            throw null;
        }
        AbstractC0983W.z(mayaProfileInputLayout3, new C1937e(this, 3), new C1937e(this, 5));
        final int i11 = 4;
        AbstractC0983W.c(mayaProfileInputLayout3.getInputEditText(), mayaProfileInputLayout3, new Function0(this) { // from class: n8.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18632b;

            {
                this.f18632b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x019c  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instruction units count: 514
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.C1936d.invoke():java.lang.Object");
            }
        }, new l(21, this, mayaProfileInputLayout3), new A5.j(11));
        AppCompatEditText inputEditText = mayaProfileInputLayout3.getInputEditText();
        MayaProfileInputLayout mayaProfileInputLayout4 = this.f12376X;
        if (mayaProfileInputLayout4 == null) {
            j.n("mMayaProfileInputLayoutConfirmNewPassword");
            throw null;
        }
        inputEditText.addTextChangedListener(new A(mayaProfileInputLayout3, mayaProfileInputLayout4, new C1937e(this, 6), new C1937e(this, 7)));
        MayaProfileInputLayout mayaProfileInputLayout5 = this.f12376X;
        if (mayaProfileInputLayout5 == null) {
            j.n("mMayaProfileInputLayoutConfirmNewPassword");
            throw null;
        }
        AbstractC0983W.z(mayaProfileInputLayout5, new C1937e(this, 8), new C1937e(this, 0));
        AppCompatEditText inputEditText2 = mayaProfileInputLayout5.getInputEditText();
        MayaProfileInputLayout mayaProfileInputLayout6 = this.f12375W;
        if (mayaProfileInputLayout6 == null) {
            j.n("mMayaProfileInputLayoutSetNewPassword");
            throw null;
        }
        inputEditText2.addTextChangedListener(new A(mayaProfileInputLayout6, mayaProfileInputLayout5, new C7.f(26, this, mayaProfileInputLayout5), new C1937e(this, 4)));
        C1594b c1594b = this.f12386h0;
        if (c1594b != null) {
            c1594b.j();
        } else {
            j.n("mMayaForgotPasswordSetNewPasswordFragmentPresenter");
            throw null;
        }
    }
}
