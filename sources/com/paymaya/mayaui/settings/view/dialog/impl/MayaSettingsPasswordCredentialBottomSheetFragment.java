package com.paymaya.mayaui.settings.view.dialog.impl;

import G5.A;
import L9.C0327e;
import N5.C0491z;
import O5.a;
import Pb.c;
import Uh.d;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaSettingsPasswordCredentialBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSettingsPasswordCredentialBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements c {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0491z f13865S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f13866T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f13867U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13868V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f13869W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaInputLayout f13870X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public AppCompatEditText f13871Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0327e f13872Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Function1 f13873a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13874b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f13875c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f13876d0 = "MODULE";

    public static final void s1(MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment) {
        mayaSettingsPasswordCredentialBottomSheetFragment.f13874b0 = !mayaSettingsPasswordCredentialBottomSheetFragment.f13874b0;
        MayaInputLayout mayaInputLayout = mayaSettingsPasswordCredentialBottomSheetFragment.f13870X;
        if (mayaInputLayout == null) {
            j.n("mInputLayoutPasswordField");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        int selectionStart = inputEditText.getSelectionStart();
        int selectionEnd = inputEditText.getSelectionEnd();
        boolean zHasFocus = inputEditText.hasFocus();
        inputEditText.setTransformationMethod(mayaSettingsPasswordCredentialBottomSheetFragment.f13874b0 ? null : new PasswordTransformationMethod());
        if (zHasFocus) {
            inputEditText.requestFocus();
            inputEditText.setSelection(selectionStart, selectionEnd);
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = mayaSettingsPasswordCredentialBottomSheetFragment.requireContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(mayaSettingsPasswordCredentialBottomSheetFragment.f13874b0 ? R.attr.mayaDrawable_RegistrationMaskPasswordShown : R.attr.mayaDrawable_RegistrationMaskPasswordHidden, typedValue, true);
        }
        Drawable drawable = ContextCompat.getDrawable(mayaSettingsPasswordCredentialBottomSheetFragment.requireContext(), typedValue.resourceId);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(mayaSettingsPasswordCredentialBottomSheetFragment.requireContext(), mayaSettingsPasswordCredentialBottomSheetFragment.f13874b0 ? R.drawable.maya_ic_mask_password_shown_light : R.drawable.maya_ic_mask_password_hidden_light);
        }
        MayaInputLayout mayaInputLayout2 = mayaSettingsPasswordCredentialBottomSheetFragment.f13870X;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getPrimaryIconImageView().setImageDrawable(drawable);
        } else {
            j.n("mInputLayoutPasswordField");
            throw null;
        }
    }

    public static final void t1(MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment) {
        AppCompatEditText appCompatEditText = mayaSettingsPasswordCredentialBottomSheetFragment.f13871Y;
        if (appCompatEditText == null) {
            j.n("mTextViewPassword");
            throw null;
        }
        String string = C2576A.b0(appCompatEditText.getText().toString()).toString();
        if (mayaSettingsPasswordCredentialBottomSheetFragment.getTargetFragment() == null) {
            Function1 function1 = mayaSettingsPasswordCredentialBottomSheetFragment.f13873a0;
            if (function1 != null) {
                function1.invoke(string);
            }
        } else {
            Intent intent = new Intent();
            intent.putExtra("input", string);
            Fragment targetFragment = mayaSettingsPasswordCredentialBottomSheetFragment.getTargetFragment();
            if (targetFragment != null) {
                targetFragment.onActivityResult(mayaSettingsPasswordCredentialBottomSheetFragment.getTargetRequestCode(), -1, intent);
            }
        }
        mayaSettingsPasswordCredentialBottomSheetFragment.dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f13875c0) {
            C1219h c1219hM1 = m1();
            c1219hM1.q(this.f13876d0);
            c1219hM1.r(null);
            c1219hM1.i();
            this.f10327P = true;
        }
        a aVar = (a) W4.a.e().y().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f13872Z = new C0327e((d) aVar.f4748y.get(), 12);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.settings.view.dialog.impl.MayaSettingsPasswordCredentialBottomSheetFragment.MayaSettingsPasswordCredentialBottomSheetFragmentListener");
        C0327e c0327e = this.f13872Z;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
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
        dialogOnCreateDialog.setOnShowListener(new Fa.c(this, 21));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_password_credential_bottom_sheet, viewGroup, false);
        int i = R.id.button_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_primary);
        if (button != null) {
            i = R.id.button_secondary;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_secondary);
            if (button2 != null) {
                i = R.id.left_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                    i = R.id.password_input_layout;
                    MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.password_input_layout);
                    if (mayaInputLayout != null) {
                        i = R.id.right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                            i = R.id.text_view_description;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description);
                            if (textView != null) {
                                i = R.id.text_view_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                                if (textView2 != null) {
                                    i = R.id.view_background_sheet;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_background_sheet);
                                    if (viewFindChildViewById != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f13865S = new C0491z(constraintLayout, (View) button, (View) button2, (View) mayaInputLayout, textView, textView2, (Object) viewFindChildViewById, 2);
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
        C0327e c0327e = this.f13872Z;
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
        this.f13865S = null;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13865S;
        j.d(c0491z);
        this.f13866T = (TextView) c0491z.h;
        C0491z c0491z2 = this.f13865S;
        j.d(c0491z2);
        this.f13867U = (TextView) c0491z2.f4304d;
        C0491z c0491z3 = this.f13865S;
        j.d(c0491z3);
        this.f13868V = (Button) c0491z3.c;
        C0491z c0491z4 = this.f13865S;
        j.d(c0491z4);
        this.f13869W = (Button) c0491z4.e;
        C0491z c0491z5 = this.f13865S;
        j.d(c0491z5);
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0491z5.f;
        this.f13870X = mayaInputLayout;
        this.f13871Y = mayaInputLayout.getInputEditText();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("title");
            String string2 = arguments.getString("description");
            C0327e c0327e = this.f13872Z;
            if (c0327e == null) {
                j.n("mFragmentPresenter");
                throw null;
            }
            TextView textView = ((MayaSettingsPasswordCredentialBottomSheetFragment) ((c) c0327e.c.get())).f13866T;
            if (textView == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView.setText(string);
            TextView textView2 = ((MayaSettingsPasswordCredentialBottomSheetFragment) ((c) c0327e.c.get())).f13867U;
            if (textView2 == null) {
                j.n("mTextViewDescription");
                throw null;
            }
            textView2.setText(string2);
        }
        MayaInputLayout mayaInputLayout2 = this.f13870X;
        if (mayaInputLayout2 == null) {
            j.n("mInputLayoutPasswordField");
            throw null;
        }
        final int i = 0;
        mayaInputLayout2.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Qb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSettingsPasswordCredentialBottomSheetFragment f5350b;

            {
                this.f5350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Fragment targetFragment;
                switch (i) {
                    case 0:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.s1(mayaSettingsPasswordCredentialBottomSheetFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment2 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.t1(mayaSettingsPasswordCredentialBottomSheetFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment3 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment() != null && (targetFragment = mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment()) != null) {
                                targetFragment.onActivityResult(mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetRequestCode(), 0, null);
                            }
                            mayaSettingsPasswordCredentialBottomSheetFragment3.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        AppCompatEditText appCompatEditText = this.f13871Y;
        if (appCompatEditText == null) {
            j.n("mTextViewPassword");
            throw null;
        }
        final int i4 = 0;
        final int i6 = 1;
        appCompatEditText.addTextChangedListener(new A((Function0) null, new Function0(this) { // from class: Qb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSettingsPasswordCredentialBottomSheetFragment f5352b;

            {
                this.f5352b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        Button button = this.f5352b.f13868V;
                        if (button != null) {
                            button.setEnabled(false);
                            return Unit.f18162a;
                        }
                        j.n("mButtonPrimary");
                        throw null;
                    default:
                        Button button2 = this.f5352b.f13868V;
                        if (button2 != null) {
                            button2.setEnabled(true);
                            return Unit.f18162a;
                        }
                        j.n("mButtonPrimary");
                        throw null;
                }
            }
        }, new Function0(this) { // from class: Qb.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSettingsPasswordCredentialBottomSheetFragment f5352b;

            {
                this.f5352b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        Button button = this.f5352b.f13868V;
                        if (button != null) {
                            button.setEnabled(false);
                            return Unit.f18162a;
                        }
                        j.n("mButtonPrimary");
                        throw null;
                    default:
                        Button button2 = this.f5352b.f13868V;
                        if (button2 != null) {
                            button2.setEnabled(true);
                            return Unit.f18162a;
                        }
                        j.n("mButtonPrimary");
                        throw null;
                }
            }
        }, 9));
        Button button = this.f13868V;
        if (button == null) {
            j.n("mButtonPrimary");
            throw null;
        }
        final int i10 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSettingsPasswordCredentialBottomSheetFragment f5350b;

            {
                this.f5350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Fragment targetFragment;
                switch (i10) {
                    case 0:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.s1(mayaSettingsPasswordCredentialBottomSheetFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment2 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.t1(mayaSettingsPasswordCredentialBottomSheetFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment3 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment() != null && (targetFragment = mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment()) != null) {
                                targetFragment.onActivityResult(mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetRequestCode(), 0, null);
                            }
                            mayaSettingsPasswordCredentialBottomSheetFragment3.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13869W;
        if (button2 == null) {
            j.n("mButtonSecondary");
            throw null;
        }
        final int i11 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSettingsPasswordCredentialBottomSheetFragment f5350b;

            {
                this.f5350b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Fragment targetFragment;
                switch (i11) {
                    case 0:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.s1(mayaSettingsPasswordCredentialBottomSheetFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment2 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSettingsPasswordCredentialBottomSheetFragment.t1(mayaSettingsPasswordCredentialBottomSheetFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment3 = this.f5350b;
                        Callback.onClick_enter(view2);
                        try {
                            if (mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment() != null && (targetFragment = mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetFragment()) != null) {
                                targetFragment.onActivityResult(mayaSettingsPasswordCredentialBottomSheetFragment3.getTargetRequestCode(), 0, null);
                            }
                            mayaSettingsPasswordCredentialBottomSheetFragment3.dismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.f13870X;
        if (mayaInputLayout3 != null) {
            mayaInputLayout3.getInputEditText().requestFocus();
        } else {
            j.n("mInputLayoutPasswordField");
            throw null;
        }
    }
}
