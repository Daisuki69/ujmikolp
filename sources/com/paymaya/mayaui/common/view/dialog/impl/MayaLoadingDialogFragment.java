package com.paymaya.mayaui.common.view.dialog.impl;

import L9.C0327e;
import N5.A;
import V6.d;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.paymaya.R;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaLoadingDialogFragment extends DialogFragment implements d {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public A f11856B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0327e f11857K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public TextView f11858P;

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.MayaFullScreenDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object obj = a.e().a().f2990b;
        C0327e c0327e = new C0327e(24);
        this.f11857K = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_loading, viewGroup, false);
        int i = R.id.lottie_view;
        if (((LottieAnimationView) ViewBindings.findChildViewById(viewInflate, R.id.lottie_view)) != null) {
            i = R.id.text_view_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_message);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f11856B = new A(constraintLayout, textView, 0);
                j.f(constraintLayout, "getRoot(...)");
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f11857K;
        if (c0327e == null) {
            j.n("mPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f11856B = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        A a8 = this.f11856B;
        j.d(a8);
        this.f11858P = a8.c;
        Bundle arguments = getArguments();
        setCancelable(arguments != null ? arguments.getBoolean("cancelable", false) : false);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("message");
            C0327e c0327e = this.f11857K;
            if (c0327e == null) {
                j.n("mPresenter");
                throw null;
            }
            if (string != null) {
                MayaLoadingDialogFragment mayaLoadingDialogFragment = (MayaLoadingDialogFragment) ((d) c0327e.c.get());
                mayaLoadingDialogFragment.getClass();
                TextView textView = mayaLoadingDialogFragment.f11858P;
                if (textView != null) {
                    textView.setText(string);
                } else {
                    j.n("mTextViewMessage");
                    throw null;
                }
            }
        }
    }
}
