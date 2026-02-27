package com.paymaya.mayaui.paybills.view.dialog.impl;

import N5.k1;
import Q6.n;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import ea.m;
import f9.DialogInterfaceOnShowListenerC1475b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSpinnerBottomSheetDialogFragment<T> extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public k1 f13348S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public n f13349T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final m f13350U = new m(this);

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC1475b(this, 4));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_view_spinner_bottom_sheet, viewGroup, false);
        int i = R.id.pay_bills_spinner_recylerview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.pay_bills_spinner_recylerview);
        if (recyclerView != null) {
            i = R.id.pay_bills_spinner_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pay_bills_spinner_title);
            if (textView != null) {
                i = R.id.view_background_sheet;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_background_sheet);
                if (viewFindChildViewById != null) {
                    i = R.id.view_top_sheet_line;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_top_sheet_line);
                    if (viewFindChildViewById2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f13348S = new k1(8, recyclerView, viewFindChildViewById, viewFindChildViewById2, constraintLayout, textView);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title") : null;
        k1 k1Var = this.f13348S;
        j.d(k1Var);
        TextView textView = (TextView) k1Var.f4139d;
        textView.setText(string);
        textView.setVisibility((string == null || string.length() == 0) ? 8 : 0);
        k1 k1Var2 = this.f13348S;
        j.d(k1Var2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = (RecyclerView) k1Var2.f4138b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f13350U);
    }
}
