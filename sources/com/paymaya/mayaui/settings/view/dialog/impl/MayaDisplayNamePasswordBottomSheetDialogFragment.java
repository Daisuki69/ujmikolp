package com.paymaya.mayaui.settings.view.dialog.impl;

import A7.j;
import Fa.c;
import G5.F;
import G6.u;
import G7.t;
import Gc.h;
import Hh.f;
import N5.C0435a;
import Pb.a;
import Uh.d;
import W6.e;
import android.app.Dialog;
import android.content.DialogInterface;
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
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.store.J0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import defpackage.AbstractC1414e;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDisplayNamePasswordBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements a, e {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0435a f13853S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f13854T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public MayaInputLayout f13855U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13856V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f13857W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public j f13858X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Qb.e f13859Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public u f13860Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13861a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final EnumC1215d f13862b0 = EnumC1215d.SET_PUBLIC_NAME;

    public static final void t1(MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment) {
        mayaDisplayNamePasswordBottomSheetDialogFragment.f13861a0 = !mayaDisplayNamePasswordBottomSheetDialogFragment.f13861a0;
        MayaInputLayout mayaInputLayout = mayaDisplayNamePasswordBottomSheetDialogFragment.f13855U;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        int selectionStart = inputEditText.getSelectionStart();
        int selectionEnd = inputEditText.getSelectionEnd();
        boolean zHasFocus = inputEditText.hasFocus();
        inputEditText.setTransformationMethod(mayaDisplayNamePasswordBottomSheetDialogFragment.f13861a0 ? null : new PasswordTransformationMethod());
        if (zHasFocus) {
            inputEditText.requestFocus();
            inputEditText.setSelection(selectionStart, selectionEnd);
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = mayaDisplayNamePasswordBottomSheetDialogFragment.requireContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(mayaDisplayNamePasswordBottomSheetDialogFragment.f13861a0 ? R.attr.mayaDrawable_RegistrationMaskPasswordShown : R.attr.mayaDrawable_RegistrationMaskPasswordHidden, typedValue, true);
        }
        Drawable drawable = ContextCompat.getDrawable(mayaDisplayNamePasswordBottomSheetDialogFragment.requireContext(), typedValue.resourceId);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(mayaDisplayNamePasswordBottomSheetDialogFragment.requireContext(), mayaDisplayNamePasswordBottomSheetDialogFragment.f13861a0 ? R.drawable.maya_ic_mask_password_shown_light : R.drawable.maya_ic_mask_password_hidden_light);
        }
        MayaInputLayout mayaInputLayout2 = mayaDisplayNamePasswordBottomSheetDialogFragment.f13855U;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getPrimaryIconImageView().setImageDrawable(drawable);
        } else {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
    }

    public static final void u1(MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment) {
        j jVarS1 = mayaDisplayNamePasswordBottomSheetDialogFragment.s1();
        MayaInputLayout mayaInputLayout = mayaDisplayNamePasswordBottomSheetDialogFragment.f13855U;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
        String strG = AbstractC1414e.g(mayaInputLayout);
        Bundle arguments = mayaDisplayNamePasswordBottomSheetDialogFragment.getArguments();
        boolean z4 = arguments != null ? arguments.getBoolean("is_enabled") : false;
        Qb.e eVar = ((MayaDisplayNamePasswordBottomSheetDialogFragment) ((a) jVarS1.c.get())).f13859Y;
        if (eVar != null) {
            MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) eVar;
            Bundle bundle = new Bundle();
            bundle.putString("message", "");
            bundle.putBoolean("cancelable", false);
            MayaLoadingDialogFragment mayaLoadingDialogFragment = new MayaLoadingDialogFragment();
            mayaLoadingDialogFragment.setArguments(bundle);
            mayaLoadingDialogFragment.show(mayaSettingsActivity.getSupportFragmentManager(), "loading_fragment");
            mayaSettingsActivity.f13842p = mayaLoadingDialogFragment;
        }
        J0 j02 = (J0) jVarS1.e;
        j02.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Constants.ENABLED, Boolean.valueOf(z4));
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject.put("password", strG);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject.put("data", jSONObject2);
        } catch (JSONException unused3) {
            yk.a.e();
        }
        jVarS1.e(new f(j02.f11362b.updateSettingsByType("public_display_name", RequestBody.create(y5.f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8")))).f(Th.e.c), b.a(), 0).a(new t(jVarS1, 22)).b(new h(jVarS1, 16)).c());
        Dialog dialog = mayaDisplayNamePasswordBottomSheetDialogFragment.getDialog();
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialog) {
        kotlin.jvm.internal.j.g(dialog, "dialog");
        super.onCancel(dialog);
        u uVar = this.f13860Z;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13859Y = (Qb.e) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        J0 j02 = new J0();
        j02.f11362b = payMayaClientApi;
        this.f13858X = new j(j02, aVar.S(), (d) aVar.f4748y.get(), 7);
        s1().h(this);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 19));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_display_name_password, viewGroup, false);
        int i = R.id.button_cancel;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_cancel);
        if (button != null) {
            i = R.id.button_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_confirm);
            if (button2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.input_layout_password;
                MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.input_layout_password);
                if (mayaInputLayout != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.right_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                            i = R.id.text_view_password_instruction;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_password_instruction);
                            if (textView != null) {
                                i = R.id.text_view_password_title;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_password_title)) != null) {
                                    i = R.id.view_sheet_background;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_sheet_background);
                                    if (viewFindChildViewById != null) {
                                        this.f13853S = new C0435a(viewFindChildViewById, button, button2, textView, constraintLayout, constraintLayout, mayaInputLayout);
                                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
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
        s1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13853S = null;
        super.onDestroyView();
    }

    @Override // W6.e
    public final void onDismiss() {
        dismiss();
        u uVar = this.f13860Z;
        if (uVar != null) {
            uVar.c();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Qb.e eVar = this.f13859Y;
        if (eVar != null) {
            ((MayaSettingsActivity) eVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        kotlin.jvm.internal.j.d(this.f13853S);
        C0435a c0435a = this.f13853S;
        kotlin.jvm.internal.j.d(c0435a);
        this.f13854T = (TextView) c0435a.f4049g;
        C0435a c0435a2 = this.f13853S;
        kotlin.jvm.internal.j.d(c0435a2);
        this.f13855U = (MayaInputLayout) c0435a2.e;
        C0435a c0435a3 = this.f13853S;
        kotlin.jvm.internal.j.d(c0435a3);
        this.f13856V = (Button) c0435a3.c;
        C0435a c0435a4 = this.f13853S;
        kotlin.jvm.internal.j.d(c0435a4);
        this.f13857W = (Button) c0435a4.f4048d;
        MayaInputLayout mayaInputLayout = this.f13855U;
        if (mayaInputLayout == null) {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
        final int i = 0;
        mayaInputLayout.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Qb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDisplayNamePasswordBottomSheetDialogFragment f5348b;

            {
                this.f5348b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.t1(mayaDisplayNamePasswordBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment2 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.u1(mayaDisplayNamePasswordBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment3 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDisplayNamePasswordBottomSheetDialogFragment3.onDismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout2 = this.f13855U;
        if (mayaInputLayout2 == null) {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
        mayaInputLayout2.getInputEditText().addTextChangedListener(new F(this, 6));
        Button button = this.f13857W;
        if (button == null) {
            kotlin.jvm.internal.j.n("mConfirmButton");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDisplayNamePasswordBottomSheetDialogFragment f5348b;

            {
                this.f5348b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.t1(mayaDisplayNamePasswordBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment2 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.u1(mayaDisplayNamePasswordBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment3 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDisplayNamePasswordBottomSheetDialogFragment3.onDismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13856V;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mCancelButton");
            throw null;
        }
        final int i6 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Qb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaDisplayNamePasswordBottomSheetDialogFragment f5348b;

            {
                this.f5348b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.t1(mayaDisplayNamePasswordBottomSheetDialogFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment2 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaDisplayNamePasswordBottomSheetDialogFragment.u1(mayaDisplayNamePasswordBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                    default:
                        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment3 = this.f5348b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaDisplayNamePasswordBottomSheetDialogFragment3.onDismiss();
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout3 = this.f13855U;
        if (mayaInputLayout3 == null) {
            kotlin.jvm.internal.j.n("mPasswordInputLayout");
            throw null;
        }
        mayaInputLayout3.getInputEditText().requestFocus();
        j jVarS1 = s1();
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("is_enabled") : false) {
            MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = (MayaDisplayNamePasswordBottomSheetDialogFragment) ((a) jVarS1.c.get());
            TextView textView = mayaDisplayNamePasswordBottomSheetDialogFragment.f13854T;
            if (textView != null) {
                textView.setText(mayaDisplayNamePasswordBottomSheetDialogFragment.getString(R.string.maya_label_show_my_name_password_command_show));
                return;
            } else {
                kotlin.jvm.internal.j.n("mDescriptionTextView");
                throw null;
            }
        }
        MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment2 = (MayaDisplayNamePasswordBottomSheetDialogFragment) ((a) jVarS1.c.get());
        TextView textView2 = mayaDisplayNamePasswordBottomSheetDialogFragment2.f13854T;
        if (textView2 != null) {
            textView2.setText(mayaDisplayNamePasswordBottomSheetDialogFragment2.getString(R.string.maya_label_show_my_name_password_command_hide));
        } else {
            kotlin.jvm.internal.j.n("mDescriptionTextView");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1215d p1() {
        return this.f13862b0;
    }

    public final j s1() {
        j jVar = this.f13858X;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mDisplayNamePasswordDialogFragmentPresenter");
        throw null;
    }
}
