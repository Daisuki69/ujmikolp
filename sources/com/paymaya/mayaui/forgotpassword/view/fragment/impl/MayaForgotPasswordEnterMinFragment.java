package com.paymaya.mayaui.forgotpassword.view.fragment.impl;

import C7.f;
import G5.A;
import Ke.b;
import N5.C0453g;
import O5.a;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.data.api.ForgotPasswordApi;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import i8.C1594b;
import kotlin.jvm.internal.j;
import m8.InterfaceC1854a;
import n8.C1933a;
import n8.InterfaceC1935c;

/* JADX INFO: loaded from: classes4.dex */
public class MayaForgotPasswordEnterMinFragment extends MayaAuthBaseFragment implements InterfaceC1854a {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0453g f12366V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaProfileInputLayout f12367W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12368X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f12369Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC1935c f12370Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f12371a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C1594b f12372b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C1229s f12373c0;

    public final void I1(String str) {
        TextView textView = this.f12368X;
        if (textView == null) {
            j.n("mMobileNumberHelperErrorTextView");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f12368X;
        if (textView2 != null) {
            textView2.setText(str);
        } else {
            j.n("mMobileNumberHelperErrorTextView");
            throw null;
        }
    }

    public final C1594b J1() {
        C1594b c1594b = this.f12372b0;
        if (c1594b != null) {
            return c1594b;
        }
        j.n("mMayaForgotPasswordEnterMinFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        a aVar = W4.a.e().n().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12372b0 = new C1594b(new L((ForgotPasswordApi) aVar.f4723j1.get()));
        this.f12373c0 = (C1229s) aVar.f4684R.get();
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12370Z = (InterfaceC1935c) requireActivity();
        J1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_forgot_password_enter_min, viewGroup, false);
        int i = R.id.image_view_country_badge_icon;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_country_badge_icon)) != null) {
            i = R.id.maya_input_layout_current_mobile_number;
            MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_current_mobile_number);
            if (mayaProfileInputLayout != null) {
                i = R.id.mobile_number_helper_error_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.mobile_number_helper_error_text_view);
                if (textView != null) {
                    i = R.id.next_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.next_button);
                    if (button != null) {
                        i = R.id.scrollable_nested_scroll_view;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view)) != null) {
                            i = R.id.text_view_enter_your_number_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_enter_your_number_header)) != null) {
                                i = R.id.text_view_enter_your_number_sub_header;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_enter_your_number_sub_header)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.f12366V = new C0453g(11, constraintLayout, mayaProfileInputLayout, textView, button);
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        J1().i();
        super.onDestroy();
        this.f12366V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1935c interfaceC1935c = this.f12370Z;
        if (interfaceC1935c != null) {
            ((MayaForgotPasswordActivity) interfaceC1935c).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12366V;
        j.d(c0453g);
        this.f12367W = (MayaProfileInputLayout) c0453g.c;
        C0453g c0453g2 = this.f12366V;
        j.d(c0453g2);
        this.f12368X = (TextView) c0453g2.f4095d;
        C0453g c0453g3 = this.f12366V;
        j.d(c0453g3);
        this.f12369Y = (Button) c0453g3.e;
        MayaProfileInputLayout mayaProfileInputLayout = this.f12367W;
        if (mayaProfileInputLayout == null) {
            j.n("mMayaInputLayoutCurrentMobileNumber");
            throw null;
        }
        mayaProfileInputLayout.getFloatingPrefix().setText("+63");
        Button button = this.f12369Y;
        if (button == null) {
            j.n("mNextButton");
            throw null;
        }
        b.b(button, new W4.b(this, 22));
        MayaProfileInputLayout mayaProfileInputLayout2 = this.f12367W;
        if (mayaProfileInputLayout2 == null) {
            j.n("mMayaInputLayoutCurrentMobileNumber");
            throw null;
        }
        AbstractC0983W.A(mayaProfileInputLayout2, new f(25, mayaProfileInputLayout2, this), null, 2);
        AppCompatEditText inputEditText = mayaProfileInputLayout2.getInputEditText();
        A a8 = new A();
        a8.c = new C1933a(this, mayaProfileInputLayout2);
        a8.f1715d = new C1933a(mayaProfileInputLayout2, this);
        inputEditText.addTextChangedListener(a8);
        J1().j();
    }
}
