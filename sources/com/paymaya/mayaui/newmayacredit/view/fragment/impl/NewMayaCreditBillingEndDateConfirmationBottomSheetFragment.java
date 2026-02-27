package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Fa.c;
import L9.C0327e;
import N5.C0491z;
import Q9.u;
import Q9.z;
import W4.a;
import a.AbstractC0617a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateConfirmationBottomSheetFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditBillingEndDateConfirmationBottomSheetFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0491z f13182S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f13183T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f13184U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13185V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public z f13186W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public z f13187X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0327e f13188Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public u f13189Z;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) a.e().D().f4752a.f4716g.get();
        this.f13188Y = new C0327e(4);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateConfirmationBottomSheetFragment.NewMayaCreditBillingEndDateConfirmationBottomSheetFragmentListener");
        this.f13189Z = (u) componentRequireActivity;
        C0327e c0327e = this.f13188Y;
        if (c0327e == null) {
            j.n("mConfirmationBottomSheetFragmentPresenter");
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
        dialogOnCreateDialog.setOnShowListener(new c(this, 15));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_maya_credit_billing_end_date_confirmation_bottom_sheet, viewGroup, false);
        int i = R.id.billing_end_date_bottom_space;
        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_bottom_space)) != null) {
            i = R.id.billing_end_date_confirmation_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_confirmation_view);
            if (viewFindChildViewById != null) {
                i = R.id.billing_end_date_header_text_view;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_header_text_view)) != null) {
                    i = R.id.billing_end_date_message_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_message_text_view)) != null) {
                        i = R.id.billing_end_date_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.billing_end_date_text_view);
                        if (textView != null) {
                            i = R.id.change_button;
                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.change_button);
                            if (button != null) {
                                i = R.id.confirm_button;
                                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.confirm_button);
                                if (button2 != null) {
                                    i = R.id.left_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                                        i = R.id.right_guideline;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                            i = R.id.sheet_background_view;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                                            if (viewFindChildViewById2 != null) {
                                                i = R.id.title_text_view;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                                                    i = R.id.top_sheet_line_view;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.top_sheet_line_view);
                                                    if (viewFindChildViewById3 != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                        this.f13182S = new C0491z(constraintLayout, viewFindChildViewById, textView, button, button2, viewFindChildViewById2, viewFindChildViewById3);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0327e c0327e = this.f13188Y;
        if (c0327e != null) {
            c0327e.i();
        } else {
            j.n("mConfirmationBottomSheetFragmentPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u uVar = this.f13189Z;
        if (uVar != null) {
            ((NewMayaCreditActivity) uVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        final int i = 0;
        final int i4 = 1;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13182S;
        j.d(c0491z);
        this.f13183T = (TextView) c0491z.f4304d;
        C0491z c0491z2 = this.f13182S;
        j.d(c0491z2);
        this.f13184U = (Button) c0491z2.f;
        C0491z c0491z3 = this.f13182S;
        j.d(c0491z3);
        this.f13185V = (Button) c0491z3.c;
        C0327e c0327e = this.f13188Y;
        if (c0327e == null) {
            j.n("mConfirmationBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.j();
        if (getArguments() != null && (arguments = getArguments()) != null) {
            int i6 = arguments.getInt("end_of_day");
            TextView textView = this.f13183T;
            if (textView == null) {
                j.n("mSelectedDayTextView");
                throw null;
            }
            textView.setText(getString(R.string.maya_label_billing_end_date_confirmation_content, AbstractC0617a.A(i6)));
        }
        Button button = this.f13184U;
        if (button == null) {
            j.n("mConfirmButton");
            throw null;
        }
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewMayaCreditBillingEndDateConfirmationBottomSheetFragment f5335b;

            {
                this.f5335b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        NewMayaCreditBillingEndDateConfirmationBottomSheetFragment newMayaCreditBillingEndDateConfirmationBottomSheetFragment = this.f5335b;
                        Callback.onClick_enter(view2);
                        try {
                            C1220i c1220iN1 = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.n1();
                            FragmentActivity activity = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.getActivity();
                            C1219h c1219hD = C1219h.d(newMayaCreditBillingEndDateConfirmationBottomSheetFragment.p1());
                            c1219hD.r(null);
                            c1219hD.n(17);
                            c1219hD.t(EnumC1217f.SET);
                            c1220iN1.c(activity, c1219hD);
                            z zVar = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.f13186W;
                            if (zVar != null) {
                                zVar.invoke();
                            }
                            newMayaCreditBillingEndDateConfirmationBottomSheetFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        NewMayaCreditBillingEndDateConfirmationBottomSheetFragment newMayaCreditBillingEndDateConfirmationBottomSheetFragment2 = this.f5335b;
                        Callback.onClick_enter(view2);
                        try {
                            z zVar2 = newMayaCreditBillingEndDateConfirmationBottomSheetFragment2.f13187X;
                            if (zVar2 != null) {
                                zVar2.invoke();
                            }
                            newMayaCreditBillingEndDateConfirmationBottomSheetFragment2.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13185V;
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: Q9.t

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NewMayaCreditBillingEndDateConfirmationBottomSheetFragment f5335b;

                {
                    this.f5335b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i4) {
                        case 0:
                            NewMayaCreditBillingEndDateConfirmationBottomSheetFragment newMayaCreditBillingEndDateConfirmationBottomSheetFragment = this.f5335b;
                            Callback.onClick_enter(view2);
                            try {
                                C1220i c1220iN1 = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.n1();
                                FragmentActivity activity = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.getActivity();
                                C1219h c1219hD = C1219h.d(newMayaCreditBillingEndDateConfirmationBottomSheetFragment.p1());
                                c1219hD.r(null);
                                c1219hD.n(17);
                                c1219hD.t(EnumC1217f.SET);
                                c1220iN1.c(activity, c1219hD);
                                z zVar = newMayaCreditBillingEndDateConfirmationBottomSheetFragment.f13186W;
                                if (zVar != null) {
                                    zVar.invoke();
                                }
                                newMayaCreditBillingEndDateConfirmationBottomSheetFragment.dismiss();
                                return;
                            } finally {
                            }
                        default:
                            NewMayaCreditBillingEndDateConfirmationBottomSheetFragment newMayaCreditBillingEndDateConfirmationBottomSheetFragment2 = this.f5335b;
                            Callback.onClick_enter(view2);
                            try {
                                z zVar2 = newMayaCreditBillingEndDateConfirmationBottomSheetFragment2.f13187X;
                                if (zVar2 != null) {
                                    zVar2.invoke();
                                }
                                newMayaCreditBillingEndDateConfirmationBottomSheetFragment2.dismiss();
                                return;
                            } finally {
                            }
                    }
                }
            });
        } else {
            j.n("mChangeButton");
            throw null;
        }
    }
}
