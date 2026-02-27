package com.paymaya.mayaui.forgotpassword.view.fragment.impl;

import Ag.l;
import Ke.b;
import M8.T2;
import M8.d3;
import N5.C0444d;
import N5.C0487x;
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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaAuthBaseFragment;
import i8.C1593a;
import j8.InterfaceC1671a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaForgotPasswordSuccessFragment extends MayaAuthBaseFragment {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0487x f12387V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12388W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12389X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final d3 f12390Y = new d3(true, 2);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C1593a f12391Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C1229s f12392a0;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        a aVar = W4.a.e().n().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12720U = (C1229s) aVar.f4684R.get();
        this.f12391Z = new C1593a(2);
        this.f12392a0 = (C1229s) aVar.f4684R.get();
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1593a c1593a = this.f12391Z;
        if (c1593a == null) {
            j.n("mMayaForgotPasswordSuccessFragmentPresenter");
            throw null;
        }
        c1593a.h(this);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12390Y);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_forgot_password_success, viewGroup, false);
        int i = R.id.bulleted_tips_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.bulleted_tips_text_view);
        if (textView != null) {
            i = R.id.constraint_layout_information_box;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_information_box)) != null) {
                i = R.id.image_view_success;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_success)) != null) {
                    i = R.id.login_button;
                    Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.login_button);
                    if (button != null) {
                        i = R.id.scrollable_nested_scroll_view;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollable_nested_scroll_view)) != null) {
                            i = R.id.text_view_header;
                            if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                i = R.id.text_view_header_subtext;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                                    i = R.id.text_view_information_description;
                                    if (((MultiColorTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information_description)) != null) {
                                        i = R.id.text_view_information_header;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_information_header)) != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            this.f12387V = new C0487x(constraintLayout, textView, button, 2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1593a c1593a = this.f12391Z;
        if (c1593a == null) {
            j.n("mMayaForgotPasswordSuccessFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
        this.f12387V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.forgotpassword.view.activity.IMayaForgotPasswordActivityView");
        InterfaceC1671a interfaceC1671a = (InterfaceC1671a) componentRequireActivity;
        C0444d c0444d = ((MayaForgotPasswordActivity) interfaceC1671a).m;
        j.d(c0444d);
        ((Toolbar) c0444d.f4073d.e).setVisibility(8);
        C0487x c0487x = this.f12387V;
        j.d(c0487x);
        this.f12388W = c0487x.c;
        C0487x c0487x2 = this.f12387V;
        j.d(c0487x2);
        this.f12389X = c0487x2.f4260d;
        TextView textView = this.f12388W;
        if (textView == null) {
            j.n("mBulletedTipsTextView");
            throw null;
        }
        textView.setText(T2.i(30, 5, ContextCompat.getColor(requireContext(), R.color.maya_shades_of_grey_6), getText(R.string.maya_label_success_password_tip_1), getText(R.string.maya_label_success_password_tip_2), getText(R.string.maya_label_success_password_tip_3)));
        Button button = this.f12389X;
        if (button != null) {
            b.b(button, new l(22, this, interfaceC1671a));
        } else {
            j.n("mLoginButton");
            throw null;
        }
    }
}
