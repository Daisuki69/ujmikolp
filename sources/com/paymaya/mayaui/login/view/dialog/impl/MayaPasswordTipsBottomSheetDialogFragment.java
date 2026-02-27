package com.paymaya.mayaui.login.view.dialog.impl;

import N5.C0487x;
import Q6.l;
import W4.a;
import Y6.o;
import android.app.Dialog;
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
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import f9.DialogInterfaceOnShowListenerC1475b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPasswordTipsBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0487x f12753S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f12754T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f12755U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public l f12756V;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) a.e().p().f4756a.f4716g.get();
        l lVar = new l(14);
        this.f12756V = lVar;
        lVar.h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 1));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_password_tips, viewGroup, false);
        int i = R.id.bulleted_tips_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.bulleted_tips_text_view);
        if (textView != null) {
            i = R.id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_button);
            if (button != null) {
                i = R.id.title_header_text_view;
                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f12753S = new C0487x(constraintLayout, textView, button, 0);
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        l lVar = this.f12756V;
        if (lVar == null) {
            j.n("mMayaPasswordTipsBottomSheetDialogFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
        this.f12753S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0487x c0487x = this.f12753S;
        j.d(c0487x);
        this.f12754T = c0487x.c;
        C0487x c0487x2 = this.f12753S;
        j.d(c0487x2);
        this.f12755U = c0487x2.f4260d;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        TextView textView = this.f12754T;
        if (textView == null) {
            j.n("mBulletedTipsTextView");
            throw null;
        }
        textView.setText(C.j(ContextCompat.getColor(requireContext(), R.color.maya_primary_grown_green), getText(R.string.maya_label_password_tips_item_1), getText(R.string.maya_label_password_tips_item_2), getText(R.string.maya_label_password_tips_item_3), getText(R.string.maya_label_password_tips_item_4), getText(R.string.maya_label_password_tips_item_5), getText(R.string.maya_label_password_tips_item_6)));
        Button button = this.f12755U;
        if (button != null) {
            button.setOnClickListener(new o(this, 29));
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
