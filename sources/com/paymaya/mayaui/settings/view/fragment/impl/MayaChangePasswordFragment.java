package com.paymaya.mayaui.settings.view.fragment.impl;

import Ah.p;
import G6.v;
import Gc.h;
import Je.d;
import Lb.e;
import N5.C0447e;
import Rb.f;
import S5.c;
import Sb.o;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import yk.a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaChangePasswordFragment extends MayaBaseFragment implements f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final EnumC1215d f13946U = EnumC1215d.CHANGE_PASSWORD;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0447e f13947V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public MayaInputLayout f13948W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaInputLayout f13949X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MayaInputLayout f13950Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f13951Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f13952a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public o f13953b0;

    public static final String G1(MayaChangePasswordFragment mayaChangePasswordFragment, MayaInputLayout mayaInputLayout) {
        String string;
        Editable text = mayaInputLayout.getInputEditText().getText();
        return (text == null || (string = text.toString()) == null) ? "" : string;
    }

    public static final void J1(MayaChangePasswordFragment mayaChangePasswordFragment) {
        e eVarH1 = mayaChangePasswordFragment.H1();
        C0447e c0447e = ((MayaChangePasswordFragment) ((f) eVarH1.c.get())).f13947V;
        j.d(c0447e);
        ((MayaInputLayout) c0447e.f4080d).f();
        ((MayaInputLayout) c0447e.e).f();
        ((MayaInputLayout) c0447e.f).f();
        if (j.b(eVarH1.f2949g, eVarH1.h)) {
            ((MayaBaseFragment) ((f) eVarH1.c.get())).E1();
            S0 s02 = eVarH1.f2948d;
            String str = eVarH1.f;
            String str2 = eVarH1.f2949g;
            s02.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("current_password", str);
            } catch (JSONException unused) {
                a.e();
            }
            try {
                jSONObject.put("new_password", str2);
            } catch (JSONException unused2) {
                a.e();
            }
            p<Success> pVarChangePassword = s02.f11388d.changePassword(d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
            new Lh.d(new Lh.d(AbstractC1331a.l(pVarChangePassword, pVarChangePassword, b.a()), new v(eVarH1, 17), 2), new h(eVarH1, 15), 0).e();
            return;
        }
        MayaChangePasswordFragment mayaChangePasswordFragment2 = (MayaChangePasswordFragment) ((f) eVarH1.c.get());
        MayaInputLayout mayaInputLayout = mayaChangePasswordFragment2.f13950Y;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutRetypeNewPassword");
            throw null;
        }
        mayaInputLayout.s();
        mayaInputLayout.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_medium);
        mayaInputLayout.setHelperErrorText(mayaChangePasswordFragment2.getString(R.string.maya_change_password_error_retype_password_not_match_new));
        mayaInputLayout.p();
        Button button = ((MayaChangePasswordFragment) ((f) eVarH1.c.get())).f13951Z;
        if (button != null) {
            button.setEnabled(false);
        } else {
            j.n("mButtonSave");
            throw null;
        }
    }

    public final e H1() {
        e eVar = this.f13952a0;
        if (eVar != null) {
            return eVar;
        }
        j.n("mChangePasswordFragmentPresenter");
        throw null;
    }

    public final void I1(MayaInputLayout mayaInputLayout, boolean z4) {
        AppCompatEditText inputEditText = mayaInputLayout.getInputEditText();
        int selectionStart = inputEditText.getSelectionStart();
        int selectionEnd = inputEditText.getSelectionEnd();
        boolean zHasFocus = inputEditText.hasFocus();
        inputEditText.setTransformationMethod(z4 ? null : new PasswordTransformationMethod());
        if (zHasFocus) {
            inputEditText.requestFocus();
            inputEditText.setSelection(selectionStart, selectionEnd);
        }
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = requireContext().getTheme();
        if (theme != null) {
            theme.resolveAttribute(z4 ? R.attr.mayaDrawable_RegistrationMaskPasswordShown : R.attr.mayaDrawable_RegistrationMaskPasswordHidden, typedValue, true);
        }
        Drawable drawable = ContextCompat.getDrawable(requireContext(), typedValue.resourceId);
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(requireContext(), z4 ? R.drawable.maya_ic_mask_password_shown_light : R.drawable.maya_ic_mask_password_hidden_light);
        }
        mayaInputLayout.getPrimaryIconImageView().setImageDrawable(drawable);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f13953b0 = (o) getActivity();
        O5.a aVar = (O5.a) W4.a.e().y().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        S0 s0S = aVar.S();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f13952a0 = new e(s0S, preference, sessionSubject);
        H1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_change_password, viewGroup, false);
        int i = R.id.button_save;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_save);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.maya_input_layout_current_password;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_current_password);
            if (mayaInputLayout != null) {
                i = R.id.maya_input_layout_new_password;
                MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_new_password);
                if (mayaInputLayout2 != null) {
                    i = R.id.maya_input_layout_retype_password;
                    MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_retype_password);
                    if (mayaInputLayout3 != null) {
                        i = R.id.scroll_view;
                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view)) != null) {
                            this.f13947V = new C0447e(constraintLayout, button, mayaInputLayout, mayaInputLayout2, mayaInputLayout3, 12);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        H1().i();
        super.onDestroy();
        this.f13947V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f13953b0;
        if (oVar != null) {
            oVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13947V;
        j.d(c0447e);
        this.f13948W = (MayaInputLayout) c0447e.f4080d;
        C0447e c0447e2 = this.f13947V;
        j.d(c0447e2);
        this.f13949X = (MayaInputLayout) c0447e2.e;
        C0447e c0447e3 = this.f13947V;
        j.d(c0447e3);
        this.f13950Y = (MayaInputLayout) c0447e3.f;
        C0447e c0447e4 = this.f13947V;
        j.d(c0447e4);
        this.f13951Z = (Button) c0447e4.c;
        H1().j();
        C0447e c0447e5 = this.f13947V;
        j.d(c0447e5);
        final int i = 0;
        ((Button) c0447e5.c).setOnClickListener(new View.OnClickListener(this) { // from class: Sb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangePasswordFragment f5707b;

            {
                this.f5707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaChangePasswordFragment mayaChangePasswordFragment = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment.J1(mayaChangePasswordFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH1 = mayaChangePasswordFragment2.H1();
                            eVarH1.i = !eVarH1.i;
                            Rb.f fVar = (Rb.f) eVarH1.c.get();
                            boolean z4 = eVarH1.i;
                            MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) fVar;
                            MayaInputLayout mayaInputLayout = mayaChangePasswordFragment3.f13948W;
                            if (mayaInputLayout != null) {
                                mayaChangePasswordFragment3.I1(mayaInputLayout, z4);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 2:
                        MayaChangePasswordFragment mayaChangePasswordFragment4 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH12 = mayaChangePasswordFragment4.H1();
                            eVarH12.j = !eVarH12.j;
                            Rb.f fVar2 = (Rb.f) eVarH12.c.get();
                            boolean z5 = eVarH12.j;
                            MayaChangePasswordFragment mayaChangePasswordFragment5 = (MayaChangePasswordFragment) fVar2;
                            MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment5.f13949X;
                            if (mayaInputLayout2 != null) {
                                mayaChangePasswordFragment5.I1(mayaInputLayout2, z5);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 3:
                        MayaChangePasswordFragment mayaChangePasswordFragment6 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH13 = mayaChangePasswordFragment6.H1();
                            eVarH13.f2950k = !eVarH13.f2950k;
                            Rb.f fVar3 = (Rb.f) eVarH13.c.get();
                            boolean z8 = eVarH13.f2950k;
                            MayaChangePasswordFragment mayaChangePasswordFragment7 = (MayaChangePasswordFragment) fVar3;
                            MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment7.f13950Y;
                            if (mayaInputLayout3 != null) {
                                mayaChangePasswordFragment7.I1(mayaInputLayout3, z8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    default:
                        MayaChangePasswordFragment mayaChangePasswordFragment8 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment mayaChangePasswordFragment9 = (MayaChangePasswordFragment) ((Rb.f) mayaChangePasswordFragment8.H1().c.get());
                            mayaChangePasswordFragment9.getClass();
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.WHATS_THIS);
                            mayaChangePasswordFragment9.A1(c1219h);
                            o oVar = mayaChangePasswordFragment9.f13953b0;
                            if (oVar != null) {
                                oVar.o0();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((MayaInputLayout) c0447e5.f4080d).getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Sb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangePasswordFragment f5707b;

            {
                this.f5707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaChangePasswordFragment mayaChangePasswordFragment = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment.J1(mayaChangePasswordFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH1 = mayaChangePasswordFragment2.H1();
                            eVarH1.i = !eVarH1.i;
                            Rb.f fVar = (Rb.f) eVarH1.c.get();
                            boolean z4 = eVarH1.i;
                            MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) fVar;
                            MayaInputLayout mayaInputLayout = mayaChangePasswordFragment3.f13948W;
                            if (mayaInputLayout != null) {
                                mayaChangePasswordFragment3.I1(mayaInputLayout, z4);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 2:
                        MayaChangePasswordFragment mayaChangePasswordFragment4 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH12 = mayaChangePasswordFragment4.H1();
                            eVarH12.j = !eVarH12.j;
                            Rb.f fVar2 = (Rb.f) eVarH12.c.get();
                            boolean z5 = eVarH12.j;
                            MayaChangePasswordFragment mayaChangePasswordFragment5 = (MayaChangePasswordFragment) fVar2;
                            MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment5.f13949X;
                            if (mayaInputLayout2 != null) {
                                mayaChangePasswordFragment5.I1(mayaInputLayout2, z5);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 3:
                        MayaChangePasswordFragment mayaChangePasswordFragment6 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH13 = mayaChangePasswordFragment6.H1();
                            eVarH13.f2950k = !eVarH13.f2950k;
                            Rb.f fVar3 = (Rb.f) eVarH13.c.get();
                            boolean z8 = eVarH13.f2950k;
                            MayaChangePasswordFragment mayaChangePasswordFragment7 = (MayaChangePasswordFragment) fVar3;
                            MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment7.f13950Y;
                            if (mayaInputLayout3 != null) {
                                mayaChangePasswordFragment7.I1(mayaInputLayout3, z8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    default:
                        MayaChangePasswordFragment mayaChangePasswordFragment8 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment mayaChangePasswordFragment9 = (MayaChangePasswordFragment) ((Rb.f) mayaChangePasswordFragment8.H1().c.get());
                            mayaChangePasswordFragment9.getClass();
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.WHATS_THIS);
                            mayaChangePasswordFragment9.A1(c1219h);
                            o oVar = mayaChangePasswordFragment9.f13953b0;
                            if (oVar != null) {
                                oVar.o0();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0447e5.e;
        final int i6 = 2;
        mayaInputLayout.getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Sb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangePasswordFragment f5707b;

            {
                this.f5707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaChangePasswordFragment mayaChangePasswordFragment = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment.J1(mayaChangePasswordFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH1 = mayaChangePasswordFragment2.H1();
                            eVarH1.i = !eVarH1.i;
                            Rb.f fVar = (Rb.f) eVarH1.c.get();
                            boolean z4 = eVarH1.i;
                            MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) fVar;
                            MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment3.f13948W;
                            if (mayaInputLayout2 != null) {
                                mayaChangePasswordFragment3.I1(mayaInputLayout2, z4);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 2:
                        MayaChangePasswordFragment mayaChangePasswordFragment4 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH12 = mayaChangePasswordFragment4.H1();
                            eVarH12.j = !eVarH12.j;
                            Rb.f fVar2 = (Rb.f) eVarH12.c.get();
                            boolean z5 = eVarH12.j;
                            MayaChangePasswordFragment mayaChangePasswordFragment5 = (MayaChangePasswordFragment) fVar2;
                            MayaInputLayout mayaInputLayout22 = mayaChangePasswordFragment5.f13949X;
                            if (mayaInputLayout22 != null) {
                                mayaChangePasswordFragment5.I1(mayaInputLayout22, z5);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 3:
                        MayaChangePasswordFragment mayaChangePasswordFragment6 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH13 = mayaChangePasswordFragment6.H1();
                            eVarH13.f2950k = !eVarH13.f2950k;
                            Rb.f fVar3 = (Rb.f) eVarH13.c.get();
                            boolean z8 = eVarH13.f2950k;
                            MayaChangePasswordFragment mayaChangePasswordFragment7 = (MayaChangePasswordFragment) fVar3;
                            MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment7.f13950Y;
                            if (mayaInputLayout3 != null) {
                                mayaChangePasswordFragment7.I1(mayaInputLayout3, z8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    default:
                        MayaChangePasswordFragment mayaChangePasswordFragment8 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment mayaChangePasswordFragment9 = (MayaChangePasswordFragment) ((Rb.f) mayaChangePasswordFragment8.H1().c.get());
                            mayaChangePasswordFragment9.getClass();
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.WHATS_THIS);
                            mayaChangePasswordFragment9.A1(c1219h);
                            o oVar = mayaChangePasswordFragment9.f13953b0;
                            if (oVar != null) {
                                oVar.o0();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i10 = 3;
        ((MayaInputLayout) c0447e5.f).getPrimaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Sb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangePasswordFragment f5707b;

            {
                this.f5707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaChangePasswordFragment mayaChangePasswordFragment = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment.J1(mayaChangePasswordFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH1 = mayaChangePasswordFragment2.H1();
                            eVarH1.i = !eVarH1.i;
                            Rb.f fVar = (Rb.f) eVarH1.c.get();
                            boolean z4 = eVarH1.i;
                            MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) fVar;
                            MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment3.f13948W;
                            if (mayaInputLayout2 != null) {
                                mayaChangePasswordFragment3.I1(mayaInputLayout2, z4);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 2:
                        MayaChangePasswordFragment mayaChangePasswordFragment4 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH12 = mayaChangePasswordFragment4.H1();
                            eVarH12.j = !eVarH12.j;
                            Rb.f fVar2 = (Rb.f) eVarH12.c.get();
                            boolean z5 = eVarH12.j;
                            MayaChangePasswordFragment mayaChangePasswordFragment5 = (MayaChangePasswordFragment) fVar2;
                            MayaInputLayout mayaInputLayout22 = mayaChangePasswordFragment5.f13949X;
                            if (mayaInputLayout22 != null) {
                                mayaChangePasswordFragment5.I1(mayaInputLayout22, z5);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 3:
                        MayaChangePasswordFragment mayaChangePasswordFragment6 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH13 = mayaChangePasswordFragment6.H1();
                            eVarH13.f2950k = !eVarH13.f2950k;
                            Rb.f fVar3 = (Rb.f) eVarH13.c.get();
                            boolean z8 = eVarH13.f2950k;
                            MayaChangePasswordFragment mayaChangePasswordFragment7 = (MayaChangePasswordFragment) fVar3;
                            MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment7.f13950Y;
                            if (mayaInputLayout3 != null) {
                                mayaChangePasswordFragment7.I1(mayaInputLayout3, z8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    default:
                        MayaChangePasswordFragment mayaChangePasswordFragment8 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment mayaChangePasswordFragment9 = (MayaChangePasswordFragment) ((Rb.f) mayaChangePasswordFragment8.H1().c.get());
                            mayaChangePasswordFragment9.getClass();
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.WHATS_THIS);
                            mayaChangePasswordFragment9.A1(c1219h);
                            o oVar = mayaChangePasswordFragment9.f13953b0;
                            if (oVar != null) {
                                oVar.o0();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i11 = 4;
        mayaInputLayout.getSecondaryIconImageView().setOnClickListener(new View.OnClickListener(this) { // from class: Sb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaChangePasswordFragment f5707b;

            {
                this.f5707b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        MayaChangePasswordFragment mayaChangePasswordFragment = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment.J1(mayaChangePasswordFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaChangePasswordFragment mayaChangePasswordFragment2 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH1 = mayaChangePasswordFragment2.H1();
                            eVarH1.i = !eVarH1.i;
                            Rb.f fVar = (Rb.f) eVarH1.c.get();
                            boolean z4 = eVarH1.i;
                            MayaChangePasswordFragment mayaChangePasswordFragment3 = (MayaChangePasswordFragment) fVar;
                            MayaInputLayout mayaInputLayout2 = mayaChangePasswordFragment3.f13948W;
                            if (mayaInputLayout2 != null) {
                                mayaChangePasswordFragment3.I1(mayaInputLayout2, z4);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutCurrentPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 2:
                        MayaChangePasswordFragment mayaChangePasswordFragment4 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH12 = mayaChangePasswordFragment4.H1();
                            eVarH12.j = !eVarH12.j;
                            Rb.f fVar2 = (Rb.f) eVarH12.c.get();
                            boolean z5 = eVarH12.j;
                            MayaChangePasswordFragment mayaChangePasswordFragment5 = (MayaChangePasswordFragment) fVar2;
                            MayaInputLayout mayaInputLayout22 = mayaChangePasswordFragment5.f13949X;
                            if (mayaInputLayout22 != null) {
                                mayaChangePasswordFragment5.I1(mayaInputLayout22, z5);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    case 3:
                        MayaChangePasswordFragment mayaChangePasswordFragment6 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            Lb.e eVarH13 = mayaChangePasswordFragment6.H1();
                            eVarH13.f2950k = !eVarH13.f2950k;
                            Rb.f fVar3 = (Rb.f) eVarH13.c.get();
                            boolean z8 = eVarH13.f2950k;
                            MayaChangePasswordFragment mayaChangePasswordFragment7 = (MayaChangePasswordFragment) fVar3;
                            MayaInputLayout mayaInputLayout3 = mayaChangePasswordFragment7.f13950Y;
                            if (mayaInputLayout3 != null) {
                                mayaChangePasswordFragment7.I1(mayaInputLayout3, z8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mMayaInputLayoutRetypeNewPassword");
                                throw null;
                            }
                        } finally {
                        }
                    default:
                        MayaChangePasswordFragment mayaChangePasswordFragment8 = this.f5707b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaChangePasswordFragment mayaChangePasswordFragment9 = (MayaChangePasswordFragment) ((Rb.f) mayaChangePasswordFragment8.H1().c.get());
                            mayaChangePasswordFragment9.getClass();
                            C1219h c1219h = new C1219h();
                            c1219h.n(17);
                            c1219h.t(EnumC1217f.WHATS_THIS);
                            mayaChangePasswordFragment9.A1(c1219h);
                            o oVar = mayaChangePasswordFragment9.f13953b0;
                            if (oVar != null) {
                                oVar.o0();
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        MayaInputLayout mayaInputLayout2 = this.f13948W;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutCurrentPassword");
            throw null;
        }
        mayaInputLayout2.getInputEditText().addTextChangedListener(new Sb.p(this, 0));
        MayaInputLayout mayaInputLayout3 = this.f13949X;
        if (mayaInputLayout3 == null) {
            j.n("mMayaInputLayoutNewPassword");
            throw null;
        }
        mayaInputLayout3.getInputEditText().addTextChangedListener(new Sb.p(this, 1));
        MayaInputLayout mayaInputLayout4 = this.f13950Y;
        if (mayaInputLayout4 != null) {
            mayaInputLayout4.getInputEditText().addTextChangedListener(new Sb.p(this, 2));
        } else {
            j.n("mMayaInputLayoutRetypeNewPassword");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f13946U;
    }
}
