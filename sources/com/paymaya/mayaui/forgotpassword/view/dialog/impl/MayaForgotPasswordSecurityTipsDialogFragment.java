package com.paymaya.mayaui.forgotpassword.view.dialog.impl;

import Ke.b;
import M8.T2;
import N5.C0487x;
import W4.a;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import f9.DialogInterfaceOnShowListenerC1475b;
import i8.C1593a;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaForgotPasswordSecurityTipsDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final /* synthetic */ int f12361W = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0487x f12362S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f12363T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f12364U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C1593a f12365V;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        this.f10325B = (C1220i) a.e().n().f4751a.f4716g.get();
        this.f12365V = new C1593a(1);
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        C1593a c1593a = this.f12365V;
        if (c1593a != null) {
            c1593a.h(this);
        } else {
            j.n("mMayaForgotPasswordSecurityTipsDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 6));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_forgot_password_security_tips, viewGroup, false);
        int i = R.id.bulleted_tips_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.bulleted_tips_text_view);
        if (textView != null) {
            i = R.id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
            if (button != null) {
                i = R.id.title_header_text_view;
                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f12362S = new C0487x(constraintLayout, textView, button, 1);
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1593a c1593a = this.f12365V;
        if (c1593a == null) {
            j.n("mMayaForgotPasswordSecurityTipsDialogFragmentPresenter");
            throw null;
        }
        c1593a.i();
        super.onDestroy();
        this.f12362S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0487x c0487x = this.f12362S;
        j.d(c0487x);
        this.f12363T = c0487x.c;
        C0487x c0487x2 = this.f12362S;
        j.d(c0487x2);
        this.f12364U = c0487x2.f4260d;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        TextView textView = this.f12363T;
        if (textView == null) {
            j.n("mBulletedTipsTextView");
            throw null;
        }
        textView.setText(T2.i(30, 5, ContextCompat.getColor(requireContext(), R.color.maya_shades_of_grey_6), getText(R.string.maya_label_password_tips_item_1), getText(R.string.maya_label_tips_secure_password_length), getText(R.string.maya_label_password_tips_item_3), getText(R.string.maya_label_password_tips_item_4), getText(R.string.maya_label_password_tips_item_5), getText(R.string.maya_label_password_tips_item_6)));
        Button button = this.f12364U;
        if (button != null) {
            b.b(button, new W4.b(this, 21));
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
