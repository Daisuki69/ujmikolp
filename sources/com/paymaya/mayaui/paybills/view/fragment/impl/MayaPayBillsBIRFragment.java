package com.paymaya.mayaui.paybills.view.fragment.impl;

import C7.f;
import Ci.b;
import G5.A;
import G5.C0256f;
import Lh.h;
import N5.H;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.lifecycle.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import ba.s;
import bg.AbstractC0983W;
import cj.C1112C;
import cj.t;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UIValue;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaBIRReminderDialogFragment;
import dOYHB6.tiZVw8.numX49;
import g4.C1499a;
import ga.c;
import ha.C1555h;
import ha.C1556i;
import ha.C1557j;
import ha.ViewOnClickListenerC1553f;
import ha.k;
import ha.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import of.p;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsBIRFragment extends MayaBaseLoadingFragment implements c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MayaInputLayout f13381A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public MayaInputLayout f13382B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Button f13383C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public LinearLayout f13384D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public ImageView f13385E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Group f13386F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f13387G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f13388H0;
    public s I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public b f13389J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public C0256f f13390K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public m f13391L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f13392M0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public H f13393o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImageView f13394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f13395q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaInputLayout f13396r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public AppCompatEditText f13397s0;
    public AppCompatEditText t0;
    public MayaInputLayout u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public AppCompatEditText f13398v0;
    public MayaInputLayout w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MayaInputLayout f13399x0;
    public AppCompatEditText y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public MayaInputLayout f13400z0;

    public static void P1(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, UIComponent uIComponent, final MayaInputLayout mayaInputLayout, ArrayList arrayList, String str, Function1 function1, int i) {
        final int i4 = 1;
        final int i6 = 0;
        Object obj = (i & 4) != 0 ? null : arrayList;
        String str2 = (i & 8) != 0 ? null : str;
        String strI = We.s.i(mayaPayBillsBIRFragment.getClass().getSimpleName(), uIComponent.parameter());
        if (obj == null) {
            List<UIValue> listValues = uIComponent.values();
            if (listValues != null) {
                List<UIValue> list = listValues;
                ArrayList arrayList2 = new ArrayList(t.l(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((UIValue) it.next()).display());
                }
                obj = arrayList2;
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = C1112C.f9377a;
            }
        }
        Object obj2 = obj;
        mayaPayBillsBIRFragment.X1(uIComponent.parameter(), strI);
        b bVar = mayaPayBillsBIRFragment.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        Ag.b bVar2 = new Ag.b(2, function1);
        final C1556i c1556i = new C1556i(mayaPayBillsBIRFragment, uIComponent, obj2, strI, mayaInputLayout, 0);
        C1557j c1557j = new C1557j(mayaPayBillsBIRFragment, uIComponent, i6);
        j.g(mayaInputLayout, "mayaInputLayout");
        mayaInputLayout.setLabel(uIComponent.placeholder());
        Context contextS = bVar.s();
        j.f(contextS, "<get-mContext>(...)");
        mayaInputLayout.t(contextS, R.drawable.maya_ic_chevron_down_primary);
        jk.b.b(mayaInputLayout.getPrimaryIconImageView(), R.attr.mayaColorIconTint);
        mayaInputLayout.getInputEditText().setInputType(0);
        b.j(mayaInputLayout, uIComponent, str2);
        Dh.c cVar = (Dh.c) bVar.e;
        if (cVar == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        AppCompatEditText afterTextChangeEvents = mayaInputLayout.getInputEditText();
        j.h(afterTextChangeEvents, "$this$afterTextChangeEvents");
        cVar.a(b.i(new C1499a(new j4.c(afterTextChangeEvents, 1), 0), new f(20, bVar2, c1557j)));
        String strDefaultValue = uIComponent.defaultValue();
        AppCompatEditText focusChanges = mayaInputLayout.getInputEditText();
        Dh.c cVar2 = (Dh.c) bVar.e;
        if (cVar2 == null) {
            j.n("mInputFieldsDisposable");
            throw null;
        }
        j.h(focusChanges, "$this$focusChanges");
        cVar2.c(b.i(new j4.c(focusChanges, 0), new Function1() { // from class: ha.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i6) {
                    case 0:
                        if (((Boolean) obj3).booleanValue()) {
                            Handler handler = new Handler(Looper.getMainLooper());
                            final C1556i c1556i2 = c1556i;
                            final MayaInputLayout mayaInputLayout2 = mayaInputLayout;
                            final int i10 = 1;
                            handler.postDelayed(new Runnable() { // from class: ha.H
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            c1556i2.invoke();
                                            mayaInputLayout2.d();
                                            break;
                                        default:
                                            c1556i2.invoke();
                                            mayaInputLayout2.d();
                                            break;
                                    }
                                }
                            }, 500L);
                        }
                        break;
                    default:
                        kotlin.jvm.internal.j.g((Unit) obj3, numX49.tnTj78("bSH2"));
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        final C1556i c1556i3 = c1556i;
                        final MayaInputLayout mayaInputLayout3 = mayaInputLayout;
                        final int i11 = 0;
                        handler2.postDelayed(new Runnable() { // from class: ha.H
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        c1556i3.invoke();
                                        mayaInputLayout3.d();
                                        break;
                                    default:
                                        c1556i3.invoke();
                                        mayaInputLayout3.d();
                                        break;
                                }
                            }
                        }, 500L);
                        break;
                }
                return Unit.f18162a;
            }
        }), b.i(jk.b.d(mayaInputLayout.getFormContainerLayout()), new Function1() { // from class: ha.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i4) {
                    case 0:
                        if (((Boolean) obj3).booleanValue()) {
                            Handler handler = new Handler(Looper.getMainLooper());
                            final C1556i c1556i2 = c1556i;
                            final MayaInputLayout mayaInputLayout2 = mayaInputLayout;
                            final int i10 = 1;
                            handler.postDelayed(new Runnable() { // from class: ha.H
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            c1556i2.invoke();
                                            mayaInputLayout2.d();
                                            break;
                                        default:
                                            c1556i2.invoke();
                                            mayaInputLayout2.d();
                                            break;
                                    }
                                }
                            }, 500L);
                        }
                        break;
                    default:
                        kotlin.jvm.internal.j.g((Unit) obj3, numX49.tnTj78("bSH2"));
                        Handler handler2 = new Handler(Looper.getMainLooper());
                        final C1556i c1556i3 = c1556i;
                        final MayaInputLayout mayaInputLayout3 = mayaInputLayout;
                        final int i11 = 0;
                        handler2.postDelayed(new Runnable() { // from class: ha.H
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        c1556i3.invoke();
                                        mayaInputLayout3.d();
                                        break;
                                    default:
                                        c1556i3.invoke();
                                        mayaInputLayout3.d();
                                        break;
                                }
                            }
                        }, 500L);
                        break;
                }
                return Unit.f18162a;
            }
        }));
        if (strDefaultValue != null && !C2576A.H(strDefaultValue)) {
            focusChanges.setText(strDefaultValue);
        }
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ((HashMap) bVar.f).get(uIComponent.parameter());
        if (mayaInputLayout2 != null) {
            ((LinearLayout) bVar.f785b).removeView(mayaInputLayout2);
        }
        ((HashMap) bVar.f).remove(uIComponent.parameter());
        ((HashMap) bVar.f).put(uIComponent.parameter(), mayaInputLayout);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_pay_bills_bir, viewGroup, false);
        int i = R.id.account_number_bir_text_input;
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.account_number_bir_text_input);
        if (mayaInputLayout != null) {
            i = R.id.amount_bir_text_input_layout;
            MayaInputLayout mayaInputLayout2 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.amount_bir_text_input_layout);
            if (mayaInputLayout2 != null) {
                i = R.id.biller_bir_image_view;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.biller_bir_image_view);
                if (imageView != null) {
                    i = R.id.biller_information_bir_image_view;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.biller_information_bir_image_view);
                    if (imageView2 != null) {
                        i = R.id.biller_name_bir_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.biller_name_bir_text_view);
                        if (textView != null) {
                            i = R.id.branch_code_bir_text_input_layout;
                            MayaInputLayout mayaInputLayout3 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.branch_code_bir_text_input_layout);
                            if (mayaInputLayout3 != null) {
                                i = R.id.continue_bir_button;
                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.continue_bir_button);
                                if (button != null) {
                                    i = R.id.dynamic_fields_bir_container_linear_layout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_fields_bir_container_linear_layout);
                                    if (linearLayout != null) {
                                        i = R.id.end_guide_pay_bills_form_bir;
                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.end_guide_pay_bills_form_bir)) != null) {
                                            i = R.id.form_series_bir_text_input_layout;
                                            MayaInputLayout mayaInputLayout4 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_series_bir_text_input_layout);
                                            if (mayaInputLayout4 != null) {
                                                i = R.id.form_type_bir_text_input_layout;
                                                MayaInputLayout mayaInputLayout5 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.form_type_bir_text_input_layout);
                                                if (mayaInputLayout5 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    i = R.id.paying_label_text_view;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.paying_label_text_view)) != null) {
                                                        i = R.id.rdo_code_bit_text_input_layout;
                                                        MayaInputLayout mayaInputLayout6 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.rdo_code_bit_text_input_layout);
                                                        if (mayaInputLayout6 != null) {
                                                            i = R.id.reminder_group;
                                                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.reminder_group);
                                                            if (group != null) {
                                                                i = R.id.reminder_icon_image_view;
                                                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.reminder_icon_image_view)) != null) {
                                                                    i = R.id.reminder_notes_text_view;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reminder_notes_text_view);
                                                                    if (textView2 != null) {
                                                                        i = R.id.reminder_title_text_view;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.reminder_title_text_view);
                                                                        if (textView3 != null) {
                                                                            i = R.id.start_guide_pay_bills_form_bir;
                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.start_guide_pay_bills_form_bir)) != null) {
                                                                                i = R.id.tax_type_bir_text_input_layout;
                                                                                MayaInputLayout mayaInputLayout7 = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.tax_type_bir_text_input_layout);
                                                                                if (mayaInputLayout7 != null) {
                                                                                    this.f13393o0 = new H(constraintLayout, mayaInputLayout, mayaInputLayout2, imageView, imageView2, textView, mayaInputLayout3, button, linearLayout, mayaInputLayout4, mayaInputLayout5, mayaInputLayout6, group, textView2, textView3, mayaInputLayout7);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void Q1(UIComponent uIComponent) {
        int i = 3;
        int i4 = 1;
        MayaInputLayout mayaInputLayout = this.w0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutBranchCode");
            throw null;
        }
        mayaInputLayout.setLabel(uIComponent.placeholder());
        MayaInputLayout mayaInputLayout2 = this.w0;
        if (mayaInputLayout2 == null) {
            j.n("mTextInputLayoutBranchCode");
            throw null;
        }
        mayaInputLayout2.setHint(getString(R.string.maya_label_pay_bills_enter_tin_branch_code));
        aa.b bVarV1 = V1();
        if (this.f13389J0 == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        AppCompatEditText appCompatEditText = this.f13398v0;
        if (appCompatEditText == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        ((s) bVarV1).j.c((io.reactivex.rxjava3.disposables.b[]) Arrays.copyOf(new io.reactivex.rxjava3.disposables.b[]{b.i(p.E(appCompatEditText), new C1555h(this, uIComponent, 3))}, 1));
        AppCompatEditText appCompatEditText2 = this.f13398v0;
        if (appCompatEditText2 == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        appCompatEditText2.setText(uIComponent.defaultValue());
        AppCompatEditText appCompatEditText3 = this.f13398v0;
        if (appCompatEditText3 == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        appCompatEditText3.setSelection(appCompatEditText3.length());
        AppCompatEditText appCompatEditText4 = this.f13398v0;
        if (appCompatEditText4 == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        appCompatEditText4.setOnFocusChangeListener(new k(this, 0));
        AppCompatEditText appCompatEditText5 = this.f13398v0;
        if (appCompatEditText5 == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        appCompatEditText5.addTextChangedListener(new A((Function0) null, new C1557j(this, uIComponent, i4), new C1557j(this, uIComponent, 2), 9));
        String strRegex = uIComponent.regex();
        if (strRegex == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppCompatEditText appCompatEditText6 = this.f13398v0;
        if (appCompatEditText6 == null) {
            j.n("mEditTextBranchCode");
            throw null;
        }
        MayaInputLayout mayaInputLayout3 = this.w0;
        if (mayaInputLayout3 == null) {
            j.n("mTextInputLayoutBranchCode");
            throw null;
        }
        AbstractC0983W.e(appCompatEditText6, mayaInputLayout3, strRegex, new C1557j(this, uIComponent, i), new C1557j(this, uIComponent, 4), null);
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        HashMap map = (HashMap) bVar.f;
        String strParameter = uIComponent.parameter();
        MayaInputLayout mayaInputLayout4 = this.w0;
        if (mayaInputLayout4 != null) {
            map.put(strParameter, mayaInputLayout4);
        } else {
            j.n("mTextInputLayoutBranchCode");
            throw null;
        }
    }

    public final void R1(UIComponent component, ArrayList arrayList) {
        j.g(component, "component");
        MayaInputLayout mayaInputLayout = this.f13400z0;
        if (mayaInputLayout != null) {
            P1(this, component, mayaInputLayout, arrayList, null, new C1555h(this, component, 0), 8);
        } else {
            j.n("mTextInputLayoutFormSeries");
            throw null;
        }
    }

    public final void S1(UIComponent uIComponent) {
        MayaInputLayout mayaInputLayout = this.f13381A0;
        if (mayaInputLayout != null) {
            P1(this, uIComponent, mayaInputLayout, null, null, new C1555h(this, uIComponent, 2), 12);
        } else {
            j.n("mTextInputLayoutFormType");
            throw null;
        }
    }

    public final void T1(UIComponent uIComponent) {
        String string = getString(R.string.maya_label_pay_bills_select_rdo_code);
        j.f(string, "getString(...)");
        MayaInputLayout mayaInputLayout = this.f13399x0;
        if (mayaInputLayout != null) {
            P1(this, uIComponent, mayaInputLayout, null, string, new C1555h(this, uIComponent, 1), 4);
        } else {
            j.n("mTextInputLayoutRDOCode");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.FORM;
    }

    public final void U1(UIComponent uIComponent) {
        MayaInputLayout mayaInputLayout = this.f13382B0;
        if (mayaInputLayout != null) {
            P1(this, uIComponent, mayaInputLayout, null, null, new C1555h(this, uIComponent, 4), 12);
        } else {
            j.n("mTextInputLayoutTaxType");
            throw null;
        }
    }

    public final aa.b V1() {
        s sVar = this.I0;
        if (sVar != null) {
            return sVar;
        }
        j.n("mPayBillsBIRFragmentPresenter");
        throw null;
    }

    public final void W1(String str) {
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((HashMap) bVar.f).get(str);
        if (mayaInputLayout != null) {
            mayaInputLayout.f();
            mayaInputLayout.i();
        }
    }

    public final void X1(String str, String str2) {
        getParentFragmentManager().clearFragmentResultListener(str2);
        getParentFragmentManager().setFragmentResultListener(str2, this, new a(29, this, str));
    }

    public final void Y1() {
        MayaInputLayout mayaInputLayout = this.f13396r0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAccountNumber");
            throw null;
        }
        String string = mayaInputLayout.getLabel().toString();
        String string2 = getString(R.string.maya_format_missing_field_is_required, string);
        j.f(string2, "getString(...)");
        ((s) V1()).t(string, string2);
    }

    public final void Z1() {
        MayaInputLayout mayaInputLayout = this.u0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        String string = mayaInputLayout.getLabel().toString();
        String string2 = getString(R.string.maya_error_pay_bills_missing_field, string);
        j.f(string2, "getString(...)");
        ((s) V1()).t(string, string2);
    }

    public final void a2(String str) {
        AppCompatEditText appCompatEditText = this.f13397s0;
        if (appCompatEditText == null) {
            j.n("mEditTextAccountNumber");
            throw null;
        }
        appCompatEditText.setText(str);
        AppCompatEditText appCompatEditText2 = this.f13397s0;
        if (appCompatEditText2 == null) {
            j.n("mEditTextAccountNumber");
            throw null;
        }
        if (appCompatEditText2 != null) {
            appCompatEditText2.setSelection(appCompatEditText2.length());
        } else {
            j.n("mEditTextAccountNumber");
            throw null;
        }
    }

    public final void b2(String str) {
        AppCompatEditText appCompatEditText = this.t0;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.setText(getString(R.string.maya_currency_symbol_with_amount_value, str));
        AppCompatEditText appCompatEditText2 = this.t0;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setSelection(appCompatEditText2.length());
        } else {
            j.n("mEditTextAmount");
            throw null;
        }
    }

    public final void c2() {
        MayaInputLayout mayaInputLayout = this.u0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout.setHelperErrorText(getString(R.string.maya_error_pay_bills_missing_field, mayaInputLayout.getLabel()));
        MayaInputLayout mayaInputLayout2 = this.u0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
        } else {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
    }

    public final void d2(boolean z4) {
        Button button = this.f13383C0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            j.n("mButtonContinue");
            throw null;
        }
    }

    public final void e2(String str, String str2) {
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((HashMap) bVar.f).get(str);
        if (mayaInputLayout != null) {
            mayaInputLayout.setHelperErrorText(getString(R.string.maya_error_pay_bills_missing_field, str2));
            mayaInputLayout.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
        }
    }

    public final void f2() {
        MayaInputLayout mayaInputLayout = this.f13396r0;
        if (mayaInputLayout == null) {
            j.n("mTextInputLayoutAccountNumber");
            throw null;
        }
        mayaInputLayout.setHelperErrorText(getString(R.string.maya_error_pay_bills_missing_field, getString(R.string.maya_label_pay_bills_hint_tin)));
        MayaInputLayout mayaInputLayout2 = this.f13396r0;
        if (mayaInputLayout2 != null) {
            mayaInputLayout2.p();
        } else {
            j.n("mTextInputLayoutAccountNumber");
            throw null;
        }
    }

    public final void g2(List formTypes, String str, String str2, String str3, boolean z4) {
        j.g(formTypes, "formTypes");
        String str4 = getClass().getSimpleName() + str;
        X1(str, str4);
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        MayaInputLayout mayaInputLayout = this.f13381A0;
        if (mayaInputLayout != null) {
            bVar.P(mayaInputLayout, str3, formTypes, z4, new E8.p(this, str2, formTypes, str4));
        } else {
            j.n("mTextInputLayoutFormType");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        return getActivity();
    }

    public final void h2(List taxTypes, String str, String str2, String str3, boolean z4) {
        j.g(taxTypes, "taxTypes");
        String str4 = getClass().getSimpleName() + str;
        X1(str, str4);
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        MayaInputLayout mayaInputLayout = this.f13382B0;
        if (mayaInputLayout != null) {
            bVar.P(mayaInputLayout, str3, taxTypes, z4, new E8.p((Object) this, str2, (Object) taxTypes, str4, 5));
        } else {
            j.n("mTextInputLayoutTaxType");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        setHasOptionsMenu(true);
        this.f13391L0 = (m) getActivity();
        O5.a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.I0 = new s((com.paymaya.data.preference.a) aVar.e.get(), aVar.g(), aVar.h(), aVar.a(), aVar.s(), aVar.q(), (d) aVar.f4748y.get());
        ((AbstractC2509a) V1()).h(this);
        m mVar = this.f13391L0;
        if (mVar != null) {
            new MayaBIRReminderDialogFragment().show(((MayaPayBillsActivity) mVar).getSupportFragmentManager(), "bir_reminder");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        b bVar = this.f13389J0;
        if (bVar == null) {
            j.n("mMayaPayBillsUIComponentBuilder");
            throw null;
        }
        ((HashMap) bVar.f).clear();
        ((s) V1()).i();
        super.onDestroy();
        this.f13393o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        BillerDetails billerDetails;
        AppCompatEditText appCompatEditText = this.t0;
        String string = null;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText.removeTextChangedListener(this.f13390K0);
        super.onPause();
        s sVar = (s) V1();
        if (!sVar.f8603d.e().isBillsPayEventsV2Enabled() || (billerDetails = sVar.f8616w) == null) {
            return;
        }
        MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) ((c) sVar.c.get());
        mayaPayBillsBIRFragment.getClass();
        C1219h c1219hE = C1219h.e(AbstractC1173g.b(11));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        m mVar = mayaPayBillsBIRFragment.f13391L0;
        if (mVar != null) {
            MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) mVar;
            String str = mayaPayBillsActivity.f13344w;
            if (str == null) {
                Bundle extras = mayaPayBillsActivity.getIntent().getExtras();
                if (extras != null) {
                    string = extras.getString("analytics_source_page");
                }
            } else {
                string = str;
            }
        }
        if (string != null) {
            c1219hE.j.put("source_page", string);
        }
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategory = billerDetails.mCategory();
        if (strMCategory != null) {
            c1219hE.j.put("category_name", strMCategory);
        }
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        String strMCategorySlug = billerDetails.mCategorySlug();
        if (strMCategorySlug != null) {
            c1219hE.j.put("category_slug", strMCategorySlug);
        }
        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
        String strMName = billerDetails.mName();
        if (strMName != null) {
            c1219hE.j.put("biller_name", strMName);
        }
        c1219hE.k(EnumC1212a.BILLER_SLUG, billerDetails.mSlug());
        mayaPayBillsBIRFragment.o1().b(c1219hE);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 0;
        super.onResume();
        m mVar = this.f13391L0;
        if (mVar != null) {
            ((MayaPayBillsActivity) mVar).Q(this);
        }
        s sVar = (s) V1();
        sVar.e(new Lh.d(new h(sVar.f8604g.a(), zh.b.a(), 0), new ba.p(sVar, 0), i).e());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f13393o0;
        j.d(h);
        this.f13394p0 = (ImageView) h.i;
        H h6 = this.f13393o0;
        j.d(h6);
        this.f13395q0 = h6.c;
        H h7 = this.f13393o0;
        j.d(h7);
        MayaInputLayout mayaInputLayout = (MayaInputLayout) h7.e;
        this.f13396r0 = mayaInputLayout;
        this.f13397s0 = mayaInputLayout.getInputEditText();
        H h8 = this.f13393o0;
        j.d(h8);
        MayaInputLayout mayaInputLayout2 = (MayaInputLayout) h8.h;
        this.u0 = mayaInputLayout2;
        this.t0 = mayaInputLayout2.getInputEditText();
        H h10 = this.f13393o0;
        j.d(h10);
        MayaInputLayout mayaInputLayout3 = (MayaInputLayout) h10.m;
        this.w0 = mayaInputLayout3;
        this.f13398v0 = mayaInputLayout3.getInputEditText();
        H h11 = this.f13393o0;
        j.d(h11);
        MayaInputLayout mayaInputLayout4 = (MayaInputLayout) h11.f3639o;
        this.f13399x0 = mayaInputLayout4;
        mayaInputLayout4.getInputEditText();
        H h12 = this.f13393o0;
        j.d(h12);
        MayaInputLayout mayaInputLayout5 = (MayaInputLayout) h12.j;
        this.f13400z0 = mayaInputLayout5;
        this.y0 = mayaInputLayout5.getInputEditText();
        H h13 = this.f13393o0;
        j.d(h13);
        MayaInputLayout mayaInputLayout6 = (MayaInputLayout) h13.f3636k;
        this.f13381A0 = mayaInputLayout6;
        mayaInputLayout6.getInputEditText();
        H h14 = this.f13393o0;
        j.d(h14);
        MayaInputLayout mayaInputLayout7 = (MayaInputLayout) h14.f3641q;
        this.f13382B0 = mayaInputLayout7;
        mayaInputLayout7.getInputEditText();
        H h15 = this.f13393o0;
        j.d(h15);
        this.f13383C0 = (Button) h15.f3634d;
        H h16 = this.f13393o0;
        j.d(h16);
        this.f13384D0 = (LinearLayout) h16.f3638n;
        H h17 = this.f13393o0;
        j.d(h17);
        this.f13385E0 = (ImageView) h17.f3637l;
        H h18 = this.f13393o0;
        j.d(h18);
        this.f13386F0 = (Group) h18.f3640p;
        H h19 = this.f13393o0;
        j.d(h19);
        this.f13387G0 = h19.f3635g;
        H h20 = this.f13393o0;
        j.d(h20);
        this.f13388H0 = h20.f;
        LinearLayout linearLayout = this.f13384D0;
        if (linearLayout == null) {
            j.n("mUIContainer");
            throw null;
        }
        b bVar = new b(linearLayout);
        bVar.f = new HashMap();
        Dh.c inputFieldsDisposable = ((s) V1()).j;
        j.g(inputFieldsDisposable, "inputFieldsDisposable");
        bVar.e = inputFieldsDisposable;
        this.f13389J0 = bVar;
        this.f13392M0 = true;
        Button button = this.f13383C0;
        if (button == null) {
            j.n("mButtonContinue");
            throw null;
        }
        button.setOnClickListener(new ViewOnClickListenerC1553f(this, 0));
        ImageView imageView = this.f13385E0;
        if (imageView == null) {
            j.n("mImageViewBillerInfo");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC1553f(this, 1));
        MayaInputLayout mayaInputLayout8 = this.f13399x0;
        if (mayaInputLayout8 == null) {
            j.n("mTextInputLayoutRDOCode");
            throw null;
        }
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        mayaInputLayout8.t(contextRequireContext, 2131231351);
        MayaInputLayout mayaInputLayout9 = this.f13400z0;
        if (mayaInputLayout9 == null) {
            j.n("mTextInputLayoutFormSeries");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        j.f(contextRequireContext2, "requireContext(...)");
        mayaInputLayout9.t(contextRequireContext2, 2131231351);
        MayaInputLayout mayaInputLayout10 = this.f13381A0;
        if (mayaInputLayout10 == null) {
            j.n("mTextInputLayoutFormType");
            throw null;
        }
        Context contextRequireContext3 = requireContext();
        j.f(contextRequireContext3, "requireContext(...)");
        mayaInputLayout10.t(contextRequireContext3, 2131231351);
        MayaInputLayout mayaInputLayout11 = this.f13382B0;
        if (mayaInputLayout11 == null) {
            j.n("mTextInputLayoutTaxType");
            throw null;
        }
        Context contextRequireContext4 = requireContext();
        j.f(contextRequireContext4, "requireContext(...)");
        mayaInputLayout11.t(contextRequireContext4, 2131231351);
        MayaInputLayout mayaInputLayout12 = this.u0;
        if (mayaInputLayout12 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout12.setHelperInfoText(getString(R.string.maya_label_pay_bills_admin_fee_may_apply));
        MayaInputLayout mayaInputLayout13 = this.u0;
        if (mayaInputLayout13 == null) {
            j.n("mTextInputLayoutAmount");
            throw null;
        }
        mayaInputLayout13.q();
        ((s) V1()).j();
    }
}
