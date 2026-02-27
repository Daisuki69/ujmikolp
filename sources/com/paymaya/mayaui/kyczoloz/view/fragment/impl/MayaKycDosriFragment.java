package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ad.a;
import B8.d;
import Bg.f0;
import C7.f;
import D.N;
import D8.C0217z;
import F8.c;
import G5.A;
import K8.InterfaceC0290o;
import Ld.b;
import M8.B0;
import M8.C0415v;
import M8.D0;
import M8.H0;
import M8.I0;
import M8.J0;
import M8.T2;
import N5.C0442c0;
import N5.C0466m;
import Xh.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.L;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.domain.model.DosriType;
import com.paymaya.domain.model.DosriValidationResult;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycDosriFragment extends MayaKycBaseFragment<C0442c0> implements InterfaceC0290o {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0217z f12519W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public KycFieldType f12520X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public DosriType f12521Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public List f12522Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ConstraintLayout f12523a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InterfaceC1033d f12524b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public J0 f12525c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final N f12526d0;

    public MayaKycDosriFragment() {
        super(I0.f3176a);
        this.f12524b0 = C1034e.b(new B0(this, 0));
        this.f12526d0 = new N(this, 11);
    }

    public final void K1() {
        int childCount = L1().getChildCount();
        InterfaceC1033d interfaceC1033d = this.f12524b0;
        if (childCount >= ((Number) interfaceC1033d.getValue()).intValue()) {
            return;
        }
        final C0466m c0466mA = C0466m.a(LayoutInflater.from(getContext()).inflate(R.layout.maya_kyc_relative_input_view_group, (ViewGroup) L1(), false));
        int childCount2 = L1().getChildCount();
        View view = c0466mA.f4151d;
        TextView textView = (TextView) c0466mA.i;
        if (childCount2 == 0) {
            textView.setVisibility(8);
            view.setVisibility(4);
        } else {
            textView.setVisibility(0);
            view.setVisibility(0);
        }
        MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) c0466mA.f;
        mayaProfileInputLayout.getInputEditText().setFilters(C.G());
        MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) c0466mA.h;
        mayaProfileInputLayout2.getInputEditText().setFilters(C.G());
        MayaProfileInputLayout mayaProfileInputLayout3 = (MayaProfileInputLayout) c0466mA.f4152g;
        mayaProfileInputLayout3.getInputEditText().setFilters(C.G());
        T1(mayaProfileInputLayout, KycFieldType.FIRST_NAME, new C0415v(2, M1(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;Z)Lcom/paymaya/domain/model/DosriValidationResult;", 0, 3));
        T1(mayaProfileInputLayout2, KycFieldType.MIDDLE_NAME, new H0(0, c0466mA, this));
        AppCompatEditText inputEditText = mayaProfileInputLayout2.getInputEditText();
        A a8 = new A();
        final int i = 0;
        a8.c = new Function0() { // from class: M8.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AppCompatCheckBox checkboxMiddleName = (AppCompatCheckBox) c0466mA.c;
                        kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                        checkboxMiddleName.setVisibility(0);
                        break;
                    default:
                        AppCompatCheckBox checkboxMiddleName2 = (AppCompatCheckBox) c0466mA.c;
                        kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                        checkboxMiddleName2.setVisibility(8);
                        break;
                }
                return Unit.f18162a;
            }
        };
        final int i4 = 1;
        a8.f1715d = new Function0() { // from class: M8.C0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        AppCompatCheckBox checkboxMiddleName = (AppCompatCheckBox) c0466mA.c;
                        kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
                        checkboxMiddleName.setVisibility(0);
                        break;
                    default:
                        AppCompatCheckBox checkboxMiddleName2 = (AppCompatCheckBox) c0466mA.c;
                        kotlin.jvm.internal.j.f(checkboxMiddleName2, "checkboxMiddleName");
                        checkboxMiddleName2.setVisibility(8);
                        break;
                }
                return Unit.f18162a;
            }
        };
        a8.e = new b(1, c0466mA, this, mayaProfileInputLayout2);
        inputEditText.addTextChangedListener(a8);
        ((AppCompatCheckBox) c0466mA.c).setOnCheckedChangeListener(new D0(0, this, c0466mA));
        T1(mayaProfileInputLayout3, KycFieldType.LAST_NAME, new C0415v(2, M1(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;Z)Lcom/paymaya/domain/model/DosriValidationResult;", 0, 4));
        final MayaDropDown mayaDropDown = (MayaDropDown) c0466mA.e;
        KycFieldType kycFieldType = KycFieldType.RELATION;
        final f fVar = new f(7, this, c0466mA);
        C0415v c0415v = new C0415v(2, M1(), d.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;Z)Lcom/paymaya/domain/model/DosriValidationResult;", 0, 5);
        mayaDropDown.setTag(kycFieldType);
        mayaDropDown.getDisplayText().setFocusable(true);
        mayaDropDown.getDisplayText().setFocusableInTouchMode(true);
        mayaDropDown.getDisplayText().setOnFocusChangeListener(new c(this, mayaDropDown, c0415v, kycFieldType, 3));
        final int i6 = 0;
        Ke.b.b(mayaDropDown.getDisplayText(), new Function0() { // from class: M8.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        MayaDropDown mayaDropDown2 = mayaDropDown;
                        fVar.invoke(mayaDropDown2.getDisplayText().getText().toString());
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        MayaDropDown mayaDropDown3 = mayaDropDown;
                        fVar.invoke(mayaDropDown3.getDisplayText().getText().toString());
                        mayaDropDown3.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i10 = 1;
        Ke.b.b(mayaDropDown.getDisplayText(), new Function0() { // from class: M8.E0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        MayaDropDown mayaDropDown2 = mayaDropDown;
                        fVar.invoke(mayaDropDown2.getDisplayText().getText().toString());
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        MayaDropDown mayaDropDown3 = mayaDropDown;
                        fVar.invoke(mayaDropDown3.getDisplayText().getText().toString());
                        mayaDropDown3.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
        textView.setOnClickListener(new a(18, this, c0466mA));
        L1().addView((ConstraintLayout) c0466mA.f4150b);
        N1().setVisibility(L1().getChildCount() < ((Number) interfaceC1033d.getValue()).intValue() ? 0 : 8);
        R1(false);
    }

    public final LinearLayout L1() {
        LinearLayout linearLayoutRelativesContainer = (LinearLayout) ((C0442c0) G1()).f4068b.e;
        j.f(linearLayoutRelativesContainer, "linearLayoutRelativesContainer");
        return linearLayoutRelativesContainer;
    }

    public final d M1() {
        C0217z c0217z = this.f12519W;
        if (c0217z != null) {
            return c0217z;
        }
        j.n("mPresenter");
        throw null;
    }

    public final TextView N1() {
        TextView textViewAddRelative = (TextView) ((C0442c0) G1()).f4068b.f4152g;
        j.f(textViewAddRelative, "textViewAddRelative");
        return textViewAddRelative;
    }

    public final int O1(View view) {
        while (true) {
            if (!((view != null ? view.getParent() : null) instanceof View) || j.b(view.getParent(), L1())) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return L1().indexOfChild(view) + 1;
    }

    public final void P1(MayaInputLayout mayaInputLayout, DosriValidationResult dosriValidationResult) {
        if (j.b(dosriValidationResult, DosriValidationResult.Success.INSTANCE)) {
            mayaInputLayout.f();
            ((C0217z) M1()).p();
            return;
        }
        int iO1 = O1(mayaInputLayout);
        String string = j.b(dosriValidationResult, DosriValidationResult.DuplicationRelativeError.INSTANCE) ? mayaInputLayout.getContext().getString(R.string.maya_kyc_dosri_relative_error_msg) : j.b(dosriValidationResult, DosriValidationResult.DuplicateUserRelativeError.INSTANCE) ? mayaInputLayout.getContext().getString(R.string.maya_kyc_dosri_current_user_relative_error_msg) : dosriValidationResult instanceof DosriValidationResult.RequiredFieldError ? mayaInputLayout.getContext().getString(R.string.maya_kyc_complete_personal_information_required_field, mayaInputLayout.getLabelTextView().getText().toString()) : dosriValidationResult instanceof DosriValidationResult.RegexpError ? ((DosriValidationResult.RegexpError) dosriValidationResult).getMessage() : null;
        if (string != null) {
            mayaInputLayout.setHelperErrorText(string);
            mayaInputLayout.getHelperErrorIconImageView().setImageResource(R.drawable.maya_ic_information_error_small);
            mayaInputLayout.p();
            T2.L(this, ((Object) mayaInputLayout.getLabelTextView().getText()) + Global.BLANK + iO1, string, true);
            if ((dosriValidationResult instanceof DosriValidationResult.RequiredFieldError) || (dosriValidationResult instanceof DosriValidationResult.RegexpError)) {
                R1(false);
            }
        }
    }

    public final void Q1(String str, String str2) {
        T2.P(this, str, str2, L.c(new Pair(EnumC1212a.CALLER, "mobile-app-kyc")), true);
    }

    public final void R1(boolean z4) {
        ((Button) ((C0442c0) G1()).f4068b.c).setEnabled(z4);
    }

    public final void S1() {
        C0466m c0466m = ((C0442c0) G1()).f4068b;
        View viewDivider = c0466m.f4151d;
        j.f(viewDivider, "viewDivider");
        viewDivider.setVisibility(8);
        LinearLayout linearLayoutRelativesContainer = (LinearLayout) c0466m.e;
        j.f(linearLayoutRelativesContainer, "linearLayoutRelativesContainer");
        linearLayoutRelativesContainer.setVisibility(8);
        TextView textViewAddRelative = (TextView) c0466m.f4152g;
        j.f(textViewAddRelative, "textViewAddRelative");
        textViewAddRelative.setVisibility(8);
        R1(false);
        K1();
        N1().setVisibility(8);
    }

    public final void T1(MayaInputLayout mayaInputLayout, KycFieldType kycFieldType, Function2 function2) {
        mayaInputLayout.setTag(kycFieldType);
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new c(this, mayaInputLayout, function2, kycFieldType, 2));
        mayaInputLayout.getInputEditText().addTextChangedListener(new A(4, mayaInputLayout, this, function2, kycFieldType));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.DOSRI;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        J0 j02 = (J0) getActivity();
        this.f12525c0 = j02;
        if (j02 != null) {
            O5.a aVar = (O5.a) W4.a.e().f().c;
            this.f10334B = (C1220i) aVar.f4716g.get();
            this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
            this.f10336P = (S5.c) aVar.f4724k.get();
            com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
            com.paymaya.domain.store.L l6 = new com.paymaya.domain.store.L((ComplianceApi) aVar.f4703a1.get());
            Z0 z0X = aVar.X();
            j.g(preference, "preference");
            this.f12519W = new C0217z(preference, l6, z0X);
        }
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12526d0);
        ((AbstractC2509a) M1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) M1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        T2.G(this, L.c(new Pair(EnumC1212a.CALLER, "mobile-app-kyc")), true);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ((C0217z) M1()).j();
        J0 j02 = this.f12525c0;
        if (j02 != null) {
            MayaKycActivity mayaKycActivity = (MayaKycActivity) j02;
            mayaKycActivity.t2();
            mayaKycActivity.s1();
            mayaKycActivity.r1();
            mayaKycActivity.t1();
            mayaKycActivity.s2(R.color.maya_shades_of_grey_1, R.color.maya_primary_black);
            mayaKycActivity.p2(new I8.d(mayaKycActivity, 0));
        }
        S1();
        N1().setOnClickListener(new M8.L(this, 3));
        Ke.b.b((Button) ((C0442c0) G1()).f4068b.c, new B0(this, 1));
        i.E(this, z.a(MayaKycSingleSelectionBottomSheetDialogFragment.class), new f0(1, this, MayaKycDosriFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/KycSelectionItem;)Lkotlin/Unit;", 8, 1));
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        J0 j02 = this.f12525c0;
        if (j02 != null) {
            ((MayaKycActivity) j02).q();
        }
    }
}
