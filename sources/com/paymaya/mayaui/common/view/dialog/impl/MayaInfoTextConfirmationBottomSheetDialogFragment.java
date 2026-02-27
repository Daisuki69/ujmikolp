package com.paymaya.mayaui.common.view.dialog.impl;

import N5.C0447e;
import S.b;
import W6.g;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaInfoTextConfirmationBottomSheetDialogFragment extends BaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0447e f11853Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final EnumC1215d f11854R = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Function1 f11855S;

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return null;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1215d l1() {
        return this.f11854R;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        requireActivity();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new g());
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_info_description_confirmation_bottom_sheet, viewGroup, false);
        int i = R.id.button_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_primary);
        if (button != null) {
            i = R.id.description_layout;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.description_layout)) != null) {
                i = R.id.image_view_info_icon;
                if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_info_icon)) != null) {
                    i = R.id.text_view_description;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                    if (textView != null) {
                        i = R.id.text_view_info_description;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_info_description);
                        if (textView2 != null) {
                            i = R.id.text_view_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f11853Q = new C0447e(constraintLayout, button, textView, textView2, (View) textView3, 8);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11853Q = null;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            CharSequence charSequence = arguments.getCharSequence("title");
            CharSequence charSequence2 = arguments.getCharSequence("description");
            CharSequence charSequence3 = arguments.getCharSequence("info_description");
            String string = arguments.getString("button_primary_value");
            C0447e c0447e = this.f11853Q;
            j.d(c0447e);
            ((TextView) c0447e.e).setText(charSequence);
            C0447e c0447e2 = this.f11853Q;
            j.d(c0447e2);
            ((TextView) c0447e2.f).setText(charSequence2);
            C0447e c0447e3 = this.f11853Q;
            j.d(c0447e3);
            ((TextView) c0447e3.f4080d).setText(charSequence3);
            C0447e c0447e4 = this.f11853Q;
            j.d(c0447e4);
            Button button = (Button) c0447e4.c;
            button.setText(string);
            button.setOnClickListener(new b(this, 20));
        }
    }
}
