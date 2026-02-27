package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Fa.c;
import L9.C0327e;
import M8.L;
import N5.C0447e;
import Q9.v;
import W4.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditContactReferenceLearnMoreBottomSheetFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f13190S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Button f13191T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0327e f13192U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public v f13193V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final EnumC1216e f13194W = EnumC1216e.CONTACT_REFERENCE;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f13194W;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) a.e().D().f4752a.f4716g.get();
        this.f13192U = new C0327e(5);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditContactReferenceLearnMoreBottomSheetFragment.NewMayaCreditContactReferenceLearnMoreBottomSheetFragmentListener");
        this.f13193V = (v) componentRequireActivity;
        C0327e c0327e = this.f13192U;
        if (c0327e == null) {
            j.n("mNewMayaCreditContactReferenceLearnMoreBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 16));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_maya_credit_contact_reference_learn_more_bottom_sheet, viewGroup, false);
        int i = R.id.learn_more_description_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.learn_more_description_text_view);
        if (textView != null) {
            i = R.id.learn_more_table_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.learn_more_table_view);
            if (viewFindChildViewById != null) {
                i = R.id.learn_more_title_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.learn_more_title_text_view);
                if (textView2 != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.return_button;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.return_button);
                        if (button != null) {
                            i = R.id.right_guideline;
                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                i = R.id.sheet_background_view;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.top_sheet_line_view;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.top_sheet_line_view);
                                    if (viewFindChildViewById3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f13190S = new C0447e(constraintLayout, textView, viewFindChildViewById, textView2, button, viewFindChildViewById2, viewFindChildViewById3);
                                        j.f(constraintLayout, "getRoot(...)");
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

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13192U;
        if (c0327e == null) {
            j.n("mNewMayaCreditContactReferenceLearnMoreBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v vVar = this.f13193V;
        if (vVar != null) {
            ((NewMayaCreditActivity) vVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13190S;
        j.d(c0447e);
        this.f13191T = (Button) c0447e.c;
        j.d(this.f13190S);
        j.d(this.f13190S);
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(p1());
        AbstractC1414e.m(c1219hD, EnumC1216e.ASSIGN_CONTACT_REFERENCE, 21);
        c1220iN1.c(activity, c1219hD);
        Button button = this.f13191T;
        if (button != null) {
            button.setOnClickListener(new L(this, 26));
        } else {
            j.n("mButtonReturn");
            throw null;
        }
    }
}
