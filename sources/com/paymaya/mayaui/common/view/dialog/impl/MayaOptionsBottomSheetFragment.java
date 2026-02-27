package com.paymaya.mayaui.common.view.dialog.impl;

import Fa.c;
import L9.C0327e;
import N5.C0468n;
import O5.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.common.view.dialog.impl.MayaOptionsBottomSheetFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaOptionsBottomSheetFragment extends MayaBaseBottomSheetDialogFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0468n f11859S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f11860T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f11861U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f11862V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final EnumC1215d f11863W = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f11864X = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0327e f11865Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Function1 f11866Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Function1 f11867a0;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10325B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        this.f11865Y = new C0327e(26);
        C0327e c0327e = this.f11865Y;
        if (c0327e != null) {
            c0327e.h(this);
        } else {
            j.n("mFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 25));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_options_bottom_sheet, viewGroup, false);
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_option;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_option);
            if (button2 != null) {
                i = R.id.text_view_options_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_options_title);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f11859S = new C0468n(constraintLayout, button, button2, textView, 1);
                    j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f11865Y;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11859S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0468n c0468n = this.f11859S;
        j.d(c0468n);
        this.f11860T = c0468n.e;
        C0468n c0468n2 = this.f11859S;
        j.d(c0468n2);
        this.f11861U = c0468n2.f4161d;
        C0468n c0468n3 = this.f11859S;
        j.d(c0468n3);
        this.f11862V = c0468n3.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            CharSequence charSequence = arguments.getCharSequence("title");
            String string = arguments.getString("option_value");
            String string2 = arguments.getString("cancel_value");
            TextView textView = this.f11860T;
            if (textView == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView.setText(charSequence);
            if (string == null) {
                Button button = this.f11861U;
                if (button == null) {
                    j.n("mButtonOption");
                    throw null;
                }
                button.setText("");
                Button button2 = this.f11861U;
                if (button2 == null) {
                    j.n("mButtonOption");
                    throw null;
                }
                final int i = 0;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: W6.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaOptionsBottomSheetFragment f6320b;

                    {
                        this.f6320b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i) {
                            case 0:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment2 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaOptionsBottomSheetFragment2.f11866Z;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment2.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment3 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment3.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment4 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaOptionsBottomSheetFragment4.f11867a0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment4.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            } else {
                Button button3 = this.f11861U;
                if (button3 == null) {
                    j.n("mButtonOption");
                    throw null;
                }
                button3.setText(string);
                Button button4 = this.f11861U;
                if (button4 == null) {
                    j.n("mButtonOption");
                    throw null;
                }
                final int i4 = 1;
                button4.setOnClickListener(new View.OnClickListener(this) { // from class: W6.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaOptionsBottomSheetFragment f6320b;

                    {
                        this.f6320b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i4) {
                            case 0:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment2 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaOptionsBottomSheetFragment2.f11866Z;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment2.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment3 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment3.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment4 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaOptionsBottomSheetFragment4.f11867a0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment4.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            String string3 = getString(R.string.pma_label_cancel);
            j.f(string3, "getString(...)");
            if (string2 == null) {
                Button button5 = this.f11862V;
                if (button5 == null) {
                    j.n("mButtonCancel");
                    throw null;
                }
                button5.setText(string3);
                Button button6 = this.f11862V;
                if (button6 == null) {
                    j.n("mButtonCancel");
                    throw null;
                }
                final int i6 = 2;
                button6.setOnClickListener(new View.OnClickListener(this) { // from class: W6.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaOptionsBottomSheetFragment f6320b;

                    {
                        this.f6320b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i6) {
                            case 0:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment2 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaOptionsBottomSheetFragment2.f11866Z;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment2.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment3 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment3.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment4 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaOptionsBottomSheetFragment4.f11867a0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment4.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            } else {
                Button button7 = this.f11862V;
                if (button7 == null) {
                    j.n("mButtonCancel");
                    throw null;
                }
                button7.setText(string2);
                Button button8 = this.f11862V;
                if (button8 == null) {
                    j.n("mButtonCancel");
                    throw null;
                }
                final int i10 = 3;
                button8.setOnClickListener(new View.OnClickListener(this) { // from class: W6.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MayaOptionsBottomSheetFragment f6320b;

                    {
                        this.f6320b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i10) {
                            case 0:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment.dismiss();
                                    return;
                                } finally {
                                }
                            case 1:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment2 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function1 = mayaOptionsBottomSheetFragment2.f11866Z;
                                    if (function1 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function1.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment2.dismiss();
                                    return;
                                } finally {
                                }
                            case 2:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment3 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    mayaOptionsBottomSheetFragment3.dismiss();
                                    return;
                                } finally {
                                }
                            default:
                                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment4 = this.f6320b;
                                Callback.onClick_enter(view2);
                                try {
                                    Function1 function12 = mayaOptionsBottomSheetFragment4.f11867a0;
                                    if (function12 != null) {
                                        kotlin.jvm.internal.j.d(view2);
                                        function12.invoke(view2);
                                    }
                                    mayaOptionsBottomSheetFragment4.dismiss();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
            }
            C0327e c0327e = this.f11865Y;
            if (c0327e != null) {
                c0327e.j();
            } else {
                j.n("mFragmentPresenter");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return this.f11863W;
    }
}
