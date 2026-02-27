package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ag.l;
import B5.g;
import B8.c;
import D.N;
import D8.C0209q;
import D8.C0212u;
import G5.A;
import H8.b;
import J8.j;
import K8.InterfaceC0282g;
import Lh.d;
import Lh.h;
import M8.C0333a0;
import M8.C0344d;
import M8.C0348e;
import M8.C0419w;
import M8.D1;
import M8.G;
import M8.H;
import M8.I;
import M8.J;
import M8.O;
import M8.P;
import M8.Q;
import M8.T;
import M8.Y;
import N5.C0450f;
import N5.C0453g;
import N5.G0;
import N5.W;
import N5.Z;
import O5.a;
import R4.i;
import Y.e;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.navigation.Navigation;
import androidx.webkit.ProxyConfig;
import bj.AbstractC1039j;
import bj.C1037h;
import cj.C1110A;
import cj.C1112C;
import cj.C1129o;
import cj.r;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.data.api.KycProfileRegulatoryApi;
import com.paymaya.data.api.KycRegulatoryProfileCmsApi;
import com.paymaya.domain.model.KycAddress;
import com.paymaya.domain.model.KycBirthPlace;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycCountry;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycIncomeSource;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.domain.model.KycNationality;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycWorkNature;
import com.paymaya.domain.model.PersonalInfoConfirmAction;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.L;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.y;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycCompletePersonalInformationFragment extends MayaKycBaseFragment<W> implements InterfaceC0282g {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0212u f12485W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public KycPreSubmissionContent f12486X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public KycFieldType f12487Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f12488Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public j f12489a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f12490b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f12491c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f12492d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final N f12493e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public O f12494f0;

    public MayaKycCompletePersonalInformationFragment() {
        super(M8.N.f3201a);
        this.f12493e0 = new N(this, 6);
    }

    public static final void K1(MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment, PersonalInfoConfirmAction personalInfoConfirmAction) {
        TextView textViewN2;
        mayaKycCompletePersonalInformationFragment.getClass();
        if (!(personalInfoConfirmAction instanceof PersonalInfoConfirmAction.Edit)) {
            if (!kotlin.jvm.internal.j.b(personalInfoConfirmAction, PersonalInfoConfirmAction.Submit.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            mayaKycCompletePersonalInformationFragment.f12492d0 = true;
            Z zW2 = mayaKycCompletePersonalInformationFragment.w2();
            zW2.f4041b.setVisibility(0);
            zW2.f4042d.setVisibility(0);
            zW2.c.setVisibility(0);
            MayaKycActivity mayaKycActivity = (MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment);
            mayaKycActivity.b2();
            mayaKycActivity.r1();
            mayaKycActivity.s1();
            return;
        }
        switch (P.f3207b[((PersonalInfoConfirmAction.Edit) personalInfoConfirmAction).getSection().ordinal()]) {
            case 1:
                textViewN2 = ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f4004c0;
                break;
            case 2:
                textViewN2 = ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f3998Y;
                break;
            case 3:
                textViewN2 = ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f3992S;
                break;
            case 4:
                textViewN2 = ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f3999Z;
                break;
            case 5:
                textViewN2 = mayaKycCompletePersonalInformationFragment.N2();
                break;
            case 6:
                textViewN2 = ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f3996W;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        mayaKycCompletePersonalInformationFragment.f12490b0 = textViewN2;
        mayaKycCompletePersonalInformationFragment.f12491c0 = true;
    }

    public static void d3(Flow flow) {
        int[] referencedIds = flow.getReferencedIds();
        kotlin.jvm.internal.j.f(referencedIds, "getReferencedIds(...)");
        int length = referencedIds.length;
        ArrayList arrayListW = C1110A.W(length != 0 ? length != 1 ? C1129o.A(referencedIds) : r.c(Integer.valueOf(referencedIds[0])) : C1112C.f9377a);
        if (arrayListW.contains(Integer.valueOf(R.id.container_current_zip_code))) {
            arrayListW.remove(Integer.valueOf(R.id.container_current_zip_code));
            arrayListW.add(arrayListW.size() - 1, Integer.valueOf(R.id.container_current_zip_code));
        }
        if (arrayListW.contains(Integer.valueOf(R.id.container_permanent_zip_code))) {
            arrayListW.remove(Integer.valueOf(R.id.container_permanent_zip_code));
            arrayListW.add(Integer.valueOf(R.id.container_permanent_zip_code));
        }
        flow.setReferencedIds(C1110A.U(arrayListW));
    }

    public static String f3(String str, String str2) {
        String strT = z.t(str, ProxyConfig.MATCH_ALL_SCHEMES, "");
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        return strT + Global.BLANK + lowerCase;
    }

    public final MayaInputLayout A2() {
        MayaInputLayout mayaInputNatureOfWorkOthers = ((W) G1()).f3971b.f3983I;
        kotlin.jvm.internal.j.f(mayaInputNatureOfWorkOthers, "mayaInputNatureOfWorkOthers");
        return mayaInputNatureOfWorkOthers;
    }

    public final void A3() {
        TextView textViewM2 = M2();
        String string = getString(R.string.maya_kyc_complete_personal_information_permanent_address_foreign_info);
        String strI = AbstractC1414e.i(string, "getString(...)", this, R.string.maya_kyc_complete_personal_information_permanent_address, "getString(...)");
        String string2 = getString(R.string.maya_kyc_complete_personal_information_philippines);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        v3(textViewM2, string, strI, string2);
        M2().setVisibility(0);
    }

    public final MayaInputLayout B2() {
        MayaInputLayout mayaInputPermanentAdditionalAddress = ((W) G1()).f3971b.J;
        kotlin.jvm.internal.j.f(mayaInputPermanentAdditionalAddress, "mayaInputPermanentAdditionalAddress");
        return mayaInputPermanentAdditionalAddress;
    }

    public final void B3() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.f12446n = new C0344d(5, bVar);
        mayaKycActivity.f12447o = new C0348e(5, bVar);
        FrameLayout frameLayout = ((W) G1()).f3970a;
        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
        Navigation.findNavController(frameLayout).navigate(new Y(R.string.maya_label_that_didnt_load_right, R.string.maya_label_connection_issue_split, ((MayaKycActivity) D1.b(this)).s().toString(), 40200));
    }

    public final MayaInputLayout C2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f4015l.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void C3() {
        w2().f4041b.setVisibility(0);
        ((W) G1()).c.f4042d.setVisibility(0);
        ((W) G1()).c.c.setVisibility(0);
        ((W) G1()).f3971b.f4000a.setVisibility(8);
        MayaKycActivity mayaKycActivity = (MayaKycActivity) D1.b(this);
        mayaKycActivity.b2();
        mayaKycActivity.r1();
        mayaKycActivity.s1();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return ((C0212u) I2()).S();
    }

    public final MayaInputLayout D2() {
        MayaInputLayout mayaInputPermanentCountry = ((W) G1()).f3971b.f3984K;
        kotlin.jvm.internal.j.f(mayaInputPermanentCountry, "mayaInputPermanentCountry");
        return mayaInputPermanentCountry;
    }

    public final void D3(MayaInputLayout mayaInputLayout, KycFieldType kycFieldType, Function2 function2) {
        mayaInputLayout.setTag(kycFieldType);
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new J(this, mayaInputLayout, function2, kycFieldType, 1));
        mayaInputLayout.getInputEditText().addTextChangedListener(new Q(this, mayaInputLayout, function2, kycFieldType, 1));
    }

    public final MayaInputLayout E2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.m.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final MayaInputLayout F2() {
        MayaInputLayout mayaInputPermanentFullAddress = ((W) G1()).f3971b.f3985L;
        kotlin.jvm.internal.j.f(mayaInputPermanentFullAddress, "mayaInputPermanentFullAddress");
        return mayaInputPermanentFullAddress;
    }

    public final MayaInputLayout G2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f4016n.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final MayaInputLayout H2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f4017o.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final c I2() {
        C0212u c0212u = this.f12485W;
        if (c0212u != null) {
            return c0212u;
        }
        kotlin.jvm.internal.j.n("mPresenter");
        throw null;
    }

    public final MayaInputLayout J2() {
        MayaInputLayout mayaInputSecondIdExpirationDate = ((W) G1()).f3971b.f3986M;
        kotlin.jvm.internal.j.f(mayaInputSecondIdExpirationDate, "mayaInputSecondIdExpirationDate");
        return mayaInputSecondIdExpirationDate;
    }

    public final MayaInputLayout K2() {
        MayaInputLayout mayaInputSecondIdNumber = ((W) G1()).f3971b.f3987N;
        kotlin.jvm.internal.j.f(mayaInputSecondIdNumber, "mayaInputSecondIdNumber");
        return mayaInputSecondIdNumber;
    }

    public final void L1() {
        o2().getInputEditText().setText("");
        k2().getInputEditText().setText("");
        m2().getInputEditText().setText("");
        j2().getInputEditText().setText("");
        n2().getInputEditText().setText("");
        p2().getInputEditText().setText("");
    }

    public final TextView L2() {
        TextView textViewCurrentAddressForeignTitle = ((W) G1()).f3971b.f3993T;
        kotlin.jvm.internal.j.f(textViewCurrentAddressForeignTitle, "textViewCurrentAddressForeignTitle");
        return textViewCurrentAddressForeignTitle;
    }

    public final void M1() {
        G2().getInputEditText().setText("");
        C2().getInputEditText().setText("");
        E2().getInputEditText().setText("");
        B2().getInputEditText().setText("");
        F2().getInputEditText().setText("");
        H2().getInputEditText().setText("");
    }

    public final TextView M2() {
        TextView textViewPermanentAddressForeignTitle = ((W) G1()).f3971b.f4001a0;
        kotlin.jvm.internal.j.f(textViewPermanentAddressForeignTitle, "textViewPermanentAddressForeignTitle");
        return textViewPermanentAddressForeignTitle;
    }

    public final void N1(MayaInputLayout mayaInputLayout, KycFieldType kycFieldType, Function1 function1, Function2 function2) {
        mayaInputLayout.setTag(kycFieldType);
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new J(this, mayaInputLayout, function2, kycFieldType, 2));
        C.r0(mayaInputLayout.getInputEditText(), new H(function1, mayaInputLayout, 3));
        C.r0(mayaInputLayout.getFormContainerLayout(), new H(function1, mayaInputLayout, 0));
    }

    public final AppCompatCheckBox N2() {
        AppCompatCheckBox checkboxUseCurrentAddress = ((W) G1()).f3971b.f4005d;
        kotlin.jvm.internal.j.f(checkboxUseCurrentAddress, "checkboxUseCurrentAddress");
        return checkboxUseCurrentAddress;
    }

    public final void O1(MayaInputLayout mayaInputLayout, KycFieldType kycFieldType, Function1 function1, Function2 function2) {
        mayaInputLayout.setTag(kycFieldType);
        mayaInputLayout.getInputEditText().setOnFocusChangeListener(new J(this, mayaInputLayout, function2, kycFieldType, 0));
        C.r0(mayaInputLayout.getInputEditText(), new H(mayaInputLayout, function1, 1));
        C.r0(mayaInputLayout.getFormContainerLayout(), new H(mayaInputLayout, function1, 2));
        mayaInputLayout.getInputEditText().addTextChangedListener(new Q(this, mayaInputLayout, function2, kycFieldType, 0));
    }

    public final MayaInputLayout O2() {
        MayaInputLayout mayaInputWorkNature = ((W) G1()).f3971b.f3988O;
        kotlin.jvm.internal.j.f(mayaInputWorkNature, "mayaInputWorkNature");
        return mayaInputWorkNature;
    }

    public final String P1() {
        return String.valueOf(d2().getInputEditText().getText());
    }

    public final List P2() {
        KycCmsContentData kycCmsContentDataI2 = i2();
        List<KycNationality> nationalities = kycCmsContentDataI2 != null ? kycCmsContentDataI2.getNationalities() : null;
        return nationalities == null ? C1112C.f9377a : nationalities;
    }

    public final String Q1() {
        return String.valueOf(e2().getInputEditText().getText());
    }

    public final String Q2() {
        return String.valueOf(C2().getInputEditText().getText());
    }

    public final String R1() {
        return String.valueOf(g2().getInputEditText().getText());
    }

    public final String R2() {
        return String.valueOf(D2().getInputEditText().getText());
    }

    public final List S1() {
        return ((MayaKycActivity) D1.b(this)).Z1().f1042g;
    }

    public final String S2() {
        return String.valueOf(E2().getInputEditText().getText());
    }

    public final List T1() {
        KycCmsContentData kycCmsContentDataI2 = i2();
        List<KycCountry> countries = kycCmsContentDataI2 != null ? kycCmsContentDataI2.getCountries() : null;
        return countries == null ? C1112C.f9377a : countries;
    }

    public final String T2() {
        return String.valueOf(G2().getInputEditText().getText());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PERSONAL_INFORMATION;
    }

    public final String U1() {
        return String.valueOf(k2().getInputEditText().getText());
    }

    public final KycPreSubmissionContent U2() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().m;
    }

    public final String V1() {
        return String.valueOf(l2().getInputEditText().getText());
    }

    public final List V2() {
        return ((MayaKycActivity) D1.b(this)).a2();
    }

    public final String W1() {
        return String.valueOf(m2().getInputEditText().getText());
    }

    public final String W2() {
        return String.valueOf(O2().getInputEditText().getText());
    }

    public final String X1() {
        return String.valueOf(o2().getInputEditText().getText());
    }

    public final List X2() {
        KycCmsContentData kycCmsContentDataI2 = i2();
        List<KycWorkNature> workNatures = kycCmsContentDataI2 != null ? kycCmsContentDataI2.getWorkNatures() : null;
        return workNatures == null ? C1112C.f9377a : workNatures;
    }

    public final String Y1() {
        return String.valueOf(q2().getInputEditText().getText());
    }

    public final void Y2(MayaInputLayout mayaInputLayout, KycValidationResult kycValidationResult) {
        if (kotlin.jvm.internal.j.b(kycValidationResult, KycValidationResult.Success.INSTANCE)) {
            mayaInputLayout.f();
            return;
        }
        String string = kotlin.jvm.internal.j.b(kycValidationResult, KycValidationResult.RequiredFieldError.INSTANCE) ? getString(R.string.maya_kyc_complete_personal_information_required_field, mayaInputLayout.getLabelTextView().getText().toString()) : kycValidationResult instanceof KycValidationResult.OutOfRangeError ? getString(R.string.maya_kyc_complete_personal_information_too_long_field, Integer.valueOf(((KycValidationResult.OutOfRangeError) kycValidationResult).getMaxLength())) : kotlin.jvm.internal.j.b(kycValidationResult, KycValidationResult.InvalidDateFormat.INSTANCE) ? getString(R.string.maya_kyc_complete_personal_information_invalid_date_format) : kotlin.jvm.internal.j.b(kycValidationResult, KycValidationResult.InvalidIdDate.INSTANCE) ? getString(R.string.maya_kyc_complete_personal_information_invalid_id_date) : kycValidationResult instanceof KycValidationResult.InvalidUserAge ? getString(R.string.maya_kyc_complete_personal_information_invalid_user_age, Integer.valueOf(((KycValidationResult.InvalidUserAge) kycValidationResult).getMinUserAge())) : kycValidationResult instanceof KycValidationResult.RegexpError ? ((KycValidationResult.RegexpError) kycValidationResult).getMessage() : kycValidationResult instanceof KycValidationResult.NonPhProvinceError ? getString(R.string.maya_kyc_complete_personal_information_contains_ph_province) : null;
        if (string != null) {
            mayaInputLayout.setHelperErrorText(string);
            mayaInputLayout.getHelperErrorIconImageView().setImageResource(R.drawable.maya_ic_information_error_small);
            mayaInputLayout.p();
            I1(mayaInputLayout.getLabelTextView().getText().toString(), string);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    public final List Z1() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f1043k;
    }

    public final void Z2() {
        A2().setVisibility(8);
    }

    public final String a2() {
        return String.valueOf(u2().getInputEditText().getText());
    }

    public final void a3(boolean z4) {
        o2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_state_label));
        k2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_city_label));
        m2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_district_label));
        p2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_zip_code_label));
        if (z4) {
            o2().setHint(getString(R.string.maya_kyc_single_selection_state_name));
            k2().setHint(getString(R.string.maya_kyc_single_selection_city_name));
            m2().setHint(getString(R.string.maya_kyc_single_selection_barangay_name));
            p2().setHint(getString(R.string.maya_kyc_single_selection_zipcode_name));
            return;
        }
        o2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_state_hint));
        k2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_city_hint));
        m2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_district_hint));
        p2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_zip_code_hint));
    }

    public final List b2() {
        KycCmsContentData kycCmsContentDataI2 = i2();
        List<KycIncomeSource> incomeSources = kycCmsContentDataI2 != null ? kycCmsContentDataI2.getIncomeSources() : null;
        return incomeSources == null ? C1112C.f9377a : incomeSources;
    }

    public final void b3(boolean z4) {
        G2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_state_label));
        C2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_city_label));
        E2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_district_label));
        H2().setLabel(getString(R.string.maya_kyc_complete_personal_information_address_zip_code_label));
        if (z4) {
            G2().setHint(getString(R.string.maya_kyc_single_selection_state_name));
            C2().setHint(getString(R.string.maya_kyc_single_selection_city_name));
            E2().setHint(getString(R.string.maya_kyc_single_selection_barangay_name));
            H2().setHint(getString(R.string.maya_kyc_single_selection_zipcode_name));
            return;
        }
        G2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_state_hint));
        C2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_city_hint));
        E2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_district_hint));
        H2().setHint(getString(R.string.maya_kyc_complete_personal_information_address_zip_code_hint));
    }

    public final Boolean c2() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().j;
    }

    public final boolean c3() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).f2();
    }

    public final MayaInputLayout d2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final MayaInputLayout e2() {
        MayaInputLayout mayaInputBirthCountry = ((W) G1()).f3971b.f4024v;
        kotlin.jvm.internal.j.f(mayaInputBirthCountry, "mayaInputBirthCountry");
        return mayaInputBirthCountry;
    }

    public final void e3(KycSelectionModel kycSelectionModel, KycFieldType kycFieldType) {
        this.f12487Y = kycFieldType;
        try {
            C1037h.a aVar = C1037h.f9166b;
            FrameLayout frameLayout = ((W) G1()).f3970a;
            kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
            Navigation.findNavController(frameLayout).navigate(new C0333a0(kycSelectionModel));
            Unit unit = Unit.f18162a;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            AbstractC1039j.a(th2);
        }
    }

    public final MayaInputLayout f2() {
        MayaInputLayout mayaInputBirthDate = ((W) G1()).f3971b.f4025w;
        kotlin.jvm.internal.j.f(mayaInputBirthDate, "mayaInputBirthDate");
        return mayaInputBirthDate;
    }

    public final MayaInputLayout g2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f4009g.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void g3(View view) {
        kotlin.jvm.internal.j.g(view, "<this>");
        y yVar = new y();
        yVar.f18195a = view;
        while (true) {
            Object obj = yVar.f18195a;
            if (obj == null) {
                break;
            }
            ViewParent parent = ((View) obj).getParent();
            View view2 = null;
            if ((parent != null ? parent.getParent() : null) instanceof NestedScrollView) {
                break;
            }
            Object parent2 = ((View) yVar.f18195a).getParent();
            if (parent2 instanceof View) {
                view2 = (View) parent2;
            }
            yVar.f18195a = view2;
        }
        View view3 = (View) yVar.f18195a;
        if (view3 != null) {
            view3.post(new g(7, this, yVar));
        }
    }

    public final C0450f h2() {
        C0450f containerBirthState = ((W) G1()).f3971b.f4009g;
        kotlin.jvm.internal.j.f(containerBirthState, "containerBirthState");
        return containerBirthState;
    }

    public final void h3(String str) {
        d2().getInputEditText().setText(str);
        d2().f();
    }

    public final void i1() {
        u2().setVisibility(8);
    }

    public final KycCmsContentData i2() {
        KycCmsContent kycCmsContent = ((MayaKycActivity) D1.b(this)).Z1().f;
        if (kycCmsContent != null) {
            return kycCmsContent.getData();
        }
        return null;
    }

    public final void i3(boolean z4) {
        if (!z4) {
            d2().setHint(getString(R.string.maya_kyc_complete_personal_information_birth_city_hint));
        } else {
            g2().setHint(getString(R.string.maya_kyc_complete_personal_information_select_birth_state_hint));
            d2().setHint(getString(R.string.maya_kyc_complete_personal_information_select_birth_city_hint));
        }
    }

    public final MayaInputLayout j2() {
        MayaInputLayout mayaInputCurrentAdditionalAddress = ((W) G1()).f3971b.f4026x;
        kotlin.jvm.internal.j.f(mayaInputCurrentAdditionalAddress, "mayaInputCurrentAdditionalAddress");
        return mayaInputCurrentAdditionalAddress;
    }

    public final void j3(String str) {
        g2().getInputEditText().setText(str);
        g2().f();
        d2().e();
    }

    public final MayaInputLayout k2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.h.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void k3(String str) {
        k2().getInputEditText().setText(str);
    }

    public final MayaInputLayout l2() {
        MayaInputLayout mayaInputCurrentCountry = ((W) G1()).f3971b.f4027y;
        kotlin.jvm.internal.j.f(mayaInputCurrentCountry, "mayaInputCurrentCountry");
        return mayaInputCurrentCountry;
    }

    public final void l3(String str) {
        m2().getInputEditText().setText(str);
    }

    public final MayaInputLayout m2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.i.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void m3(String str) {
        o2().getInputEditText().setText(str);
    }

    public final MayaInputLayout n2() {
        MayaInputLayout mayaInputCurrentFullAddress = ((W) G1()).f3971b.f4028z;
        kotlin.jvm.internal.j.f(mayaInputCurrentFullAddress, "mayaInputCurrentFullAddress");
        return mayaInputCurrentFullAddress;
    }

    public final void n3(String str) {
        p2().getInputEditText().setText(str);
    }

    public final MayaInputLayout o2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.j.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void o3(String str) {
        q2().getInputEditText().setText(str);
        q2().f();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12494f0 = (O) getActivity();
        this.f10338R = true;
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        L lZ = aVar.z();
        i iVarW = aVar.w();
        e eVar = new e((KycProfileRegulatoryApi) aVar.f4698Y0.get(), (KycRegulatoryProfileCmsApi) aVar.f4700Z0.get());
        i iVar = new i((ComplianceApi) aVar.f4703a1.get());
        C1293x0 c1293x0J = aVar.J();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        kotlin.jvm.internal.j.g(preference, "preference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(resourceManager, "resourceManager");
        this.f12485W = new C0212u(lZ, iVarW, eVar, iVar, c1293x0J, preference, flagConfigurationService, resourceManager);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12493e0);
        ((AbstractC2509a) I2()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) I2()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((C0212u) I2()).m0();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0212u c0212u = (C0212u) I2();
        if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).c3()) {
            ((W) ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).G1()).f3971b.f4004c0.setVisibility(0);
            return;
        }
        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
        ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f4019q.setVisibility(8);
        ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f4004c0.setVisibility(8);
        ((W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f3995V.setVisibility(8);
        Integer num = (Integer) E8.C.a(null, "work_nature_id");
        c0212u.f1098t = (KycJobTitle) E8.C.a(null, "job_title_object");
        Integer num2 = (Integer) E8.C.a(null, "income_source_id");
        String str = (String) E8.C.a(null, "company_name");
        if (num != null) {
            c0212u.g0(num.intValue());
        }
        if (num2 != null) {
            c0212u.Z(num2.intValue());
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).o3(str);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        KycAddress permanentAddress;
        KycAddress permanentAddress2;
        KycAddress permanentAddress3;
        KycAddress permanentAddress4;
        KycAddress permanentAddress5;
        KycAddress presentAddress;
        KycAddress presentAddress2;
        KycAddress presentAddress3;
        KycAddress presentAddress4;
        KycBirthPlace birthPlace;
        KycBirthPlace birthPlace2;
        super.onStart();
        C0212u c0212u = (C0212u) I2();
        if (((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).U2() != null) {
            String strQ1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).Q1();
            if (c0212u.j.e().isShortenedFlowAddressDropdownEnabled()) {
                boolean zEqualsIgnoreCase = strQ1.equalsIgnoreCase("Philippines");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                mayaKycCompletePersonalInformationFragment.g2().n(zEqualsIgnoreCase, true);
                mayaKycCompletePersonalInformationFragment.d2().n(zEqualsIgnoreCase, true);
                if (zEqualsIgnoreCase) {
                    mayaKycCompletePersonalInformationFragment.d2().setEnabled(true);
                    mayaKycCompletePersonalInformationFragment.g2().e();
                    ((FrameLayout) mayaKycCompletePersonalInformationFragment.h2().c).setVisibility(0);
                } else {
                    mayaKycCompletePersonalInformationFragment.w3();
                }
                mayaKycCompletePersonalInformationFragment.g2().setLabel(mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_state_label));
                mayaKycCompletePersonalInformationFragment.d2().setLabel(mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_city_label));
                mayaKycCompletePersonalInformationFragment.i3(zEqualsIgnoreCase);
                if (!zEqualsIgnoreCase) {
                    ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).d2().e();
                }
            }
            String strV1 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).V1();
            if (c0212u.j.e().isShortenedFlowAddressDropdownEnabled()) {
                boolean zEqualsIgnoreCase2 = strV1.equalsIgnoreCase("Philippines");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                MayaInputLayout mayaInputLayoutO2 = mayaKycCompletePersonalInformationFragment2.o2();
                mayaInputLayoutO2.n(zEqualsIgnoreCase2, true);
                mayaInputLayoutO2.e();
                MayaInputLayout mayaInputLayoutK2 = mayaKycCompletePersonalInformationFragment2.k2();
                mayaInputLayoutK2.n(zEqualsIgnoreCase2, true);
                mayaInputLayoutK2.e();
                MayaInputLayout mayaInputLayoutM2 = mayaKycCompletePersonalInformationFragment2.m2();
                mayaInputLayoutM2.n(zEqualsIgnoreCase2, true);
                mayaInputLayoutM2.e();
                MayaInputLayout mayaInputLayoutP2 = mayaKycCompletePersonalInformationFragment2.p2();
                mayaInputLayoutP2.n(zEqualsIgnoreCase2, true);
                mayaInputLayoutP2.e();
                mayaKycCompletePersonalInformationFragment2.a3(zEqualsIgnoreCase2);
            }
            String strR2 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).R2();
            if (c0212u.j.e().isShortenedFlowAddressDropdownEnabled()) {
                boolean zEqualsIgnoreCase3 = strR2.equalsIgnoreCase("Philippines");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                MayaInputLayout mayaInputLayoutG2 = mayaKycCompletePersonalInformationFragment3.G2();
                mayaInputLayoutG2.n(zEqualsIgnoreCase3, true);
                mayaInputLayoutG2.e();
                MayaInputLayout mayaInputLayoutC2 = mayaKycCompletePersonalInformationFragment3.C2();
                mayaInputLayoutC2.n(zEqualsIgnoreCase3, true);
                mayaInputLayoutC2.e();
                MayaInputLayout mayaInputLayoutE2 = mayaKycCompletePersonalInformationFragment3.E2();
                mayaInputLayoutE2.n(zEqualsIgnoreCase3, true);
                mayaInputLayoutE2.e();
                MayaInputLayout mayaInputLayoutH2 = mayaKycCompletePersonalInformationFragment3.H2();
                mayaInputLayoutH2.n(zEqualsIgnoreCase3, true);
                mayaInputLayoutH2.e();
                mayaKycCompletePersonalInformationFragment3.b3(zEqualsIgnoreCase3);
            }
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            String strR1 = mayaKycCompletePersonalInformationFragment4.R1();
            String zipCode = null;
            if (strR1.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU2 = mayaKycCompletePersonalInformationFragment4.U2();
                strR1 = (kycPreSubmissionContentU2 == null || (birthPlace2 = kycPreSubmissionContentU2.getBirthPlace()) == null) ? null : birthPlace2.getState();
            }
            mayaKycCompletePersonalInformationFragment4.g2().getInputEditText().setText(strR1);
            String strP1 = mayaKycCompletePersonalInformationFragment4.P1();
            if (strP1.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU22 = mayaKycCompletePersonalInformationFragment4.U2();
                strP1 = (kycPreSubmissionContentU22 == null || (birthPlace = kycPreSubmissionContentU22.getBirthPlace()) == null) ? null : birthPlace.getCity();
            }
            mayaKycCompletePersonalInformationFragment4.d2().getInputEditText().setText(strP1);
            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment5 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
            String strX1 = mayaKycCompletePersonalInformationFragment5.X1();
            if (strX1.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU23 = mayaKycCompletePersonalInformationFragment5.U2();
                strX1 = (kycPreSubmissionContentU23 == null || (presentAddress4 = kycPreSubmissionContentU23.getPresentAddress()) == null) ? null : presentAddress4.getState();
            }
            mayaKycCompletePersonalInformationFragment5.o2().getInputEditText().setText(strX1);
            String strU1 = mayaKycCompletePersonalInformationFragment5.U1();
            if (strU1.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU24 = mayaKycCompletePersonalInformationFragment5.U2();
                strU1 = (kycPreSubmissionContentU24 == null || (presentAddress3 = kycPreSubmissionContentU24.getPresentAddress()) == null) ? null : presentAddress3.getCity();
            }
            mayaKycCompletePersonalInformationFragment5.k2().getInputEditText().setText(strU1);
            String strW1 = mayaKycCompletePersonalInformationFragment5.W1();
            if (strW1.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU25 = mayaKycCompletePersonalInformationFragment5.U2();
                strW1 = (kycPreSubmissionContentU25 == null || (presentAddress2 = kycPreSubmissionContentU25.getPresentAddress()) == null) ? null : presentAddress2.getLocality();
            }
            mayaKycCompletePersonalInformationFragment5.m2().getInputEditText().setText(strW1);
            String strValueOf = String.valueOf(mayaKycCompletePersonalInformationFragment5.p2().getInputEditText().getText());
            if (strValueOf.length() == 0) {
                KycPreSubmissionContent kycPreSubmissionContentU26 = mayaKycCompletePersonalInformationFragment5.U2();
                strValueOf = (kycPreSubmissionContentU26 == null || (presentAddress = kycPreSubmissionContentU26.getPresentAddress()) == null) ? null : presentAddress.getZipCode();
            }
            mayaKycCompletePersonalInformationFragment5.p2().getInputEditText().setText(strValueOf);
            if (c0212u.f1094p) {
                InterfaceC0282g interfaceC0282g = (InterfaceC0282g) c0212u.c.get();
                KycPreSubmissionContent kycPreSubmissionContentU27 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).U2();
                c0212u.y((kycPreSubmissionContentU27 == null || (permanentAddress5 = kycPreSubmissionContentU27.getPermanentAddress()) == null) ? null : permanentAddress5.getCountry());
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment6 = (MayaKycCompletePersonalInformationFragment) interfaceC0282g;
                AppCompatCheckBox appCompatCheckBoxN2 = mayaKycCompletePersonalInformationFragment6.N2();
                appCompatCheckBoxN2.setChecked(false);
                appCompatCheckBoxN2.setVisibility(0);
                ((C0212u) mayaKycCompletePersonalInformationFragment6.I2()).q();
                mayaKycCompletePersonalInformationFragment6.D2().getInputEditText().setText(mayaKycCompletePersonalInformationFragment6.R2());
                String strT2 = mayaKycCompletePersonalInformationFragment6.T2();
                if (strT2.length() == 0) {
                    KycPreSubmissionContent kycPreSubmissionContentU28 = mayaKycCompletePersonalInformationFragment6.U2();
                    strT2 = (kycPreSubmissionContentU28 == null || (permanentAddress4 = kycPreSubmissionContentU28.getPermanentAddress()) == null) ? null : permanentAddress4.getState();
                }
                mayaKycCompletePersonalInformationFragment6.G2().getInputEditText().setText(strT2);
                String strQ2 = mayaKycCompletePersonalInformationFragment6.Q2();
                if (strQ2.length() == 0) {
                    KycPreSubmissionContent kycPreSubmissionContentU29 = mayaKycCompletePersonalInformationFragment6.U2();
                    strQ2 = (kycPreSubmissionContentU29 == null || (permanentAddress3 = kycPreSubmissionContentU29.getPermanentAddress()) == null) ? null : permanentAddress3.getCity();
                }
                mayaKycCompletePersonalInformationFragment6.C2().getInputEditText().setText(strQ2);
                String strS2 = mayaKycCompletePersonalInformationFragment6.S2();
                if (strS2.length() == 0) {
                    KycPreSubmissionContent kycPreSubmissionContentU210 = mayaKycCompletePersonalInformationFragment6.U2();
                    strS2 = (kycPreSubmissionContentU210 == null || (permanentAddress2 = kycPreSubmissionContentU210.getPermanentAddress()) == null) ? null : permanentAddress2.getLocality();
                }
                mayaKycCompletePersonalInformationFragment6.E2().getInputEditText().setText(strS2);
                String strValueOf2 = String.valueOf(mayaKycCompletePersonalInformationFragment6.H2().getInputEditText().getText());
                if (strValueOf2.length() == 0) {
                    KycPreSubmissionContent kycPreSubmissionContentU211 = mayaKycCompletePersonalInformationFragment6.U2();
                    if (kycPreSubmissionContentU211 != null && (permanentAddress = kycPreSubmissionContentU211.getPermanentAddress()) != null) {
                        zipCode = permanentAddress.getZipCode();
                    }
                    strValueOf2 = zipCode;
                }
                mayaKycCompletePersonalInformationFragment6.H2().getInputEditText().setText(strValueOf2);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (((C0212u) I2()).S()) {
            KeyEventDispatcher.Component componentRequireActivity = requireActivity();
            kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
            mayaKycActivity.m2();
            mayaKycActivity.l2();
        }
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 8;
        int i4 = 2;
        final int i6 = 1;
        final int i10 = 0;
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        ((C0212u) I2()).j();
        C0212u c0212u = (C0212u) I2();
        com.paymaya.data.preference.a aVar = c0212u.j;
        if (aVar.e().isFatcaEnabled() || aVar.e().isDosriEnabled()) {
            c0212u.e(new d(new d(new h(((KycProfileRegulatoryApi) c0212u.f1089g.f6708b).getProfileEligibilityStatus().h(Th.e.c), zh.b.a(), i10), new C0209q(c0212u, i10), i4), new D8.r(c0212u, i10), i10).e());
        } else {
            c0212u.p();
        }
        MayaKycActivity mayaKycActivity = (MayaKycActivity) D1.b(this);
        mayaKycActivity.r1();
        mayaKycActivity.s1();
        mayaKycActivity.t1();
        mayaKycActivity.b2();
        A2().getInputEditText().setFilters(C.G());
        q2().getInputEditText().setFilters(C.G());
        r2().getInputEditText().setFilters(C.G());
        x2().getInputEditText().setFilters(C.G());
        v2().getInputEditText().setFilters(C.G());
        d2().getInputEditText().setFilters(C.G());
        o2().getInputEditText().setFilters(C.G());
        k2().getInputEditText().setFilters(C.G());
        m2().getInputEditText().setFilters(C.G());
        n2().getInputEditText().setFilters(C.G());
        j2().getInputEditText().setFilters(C.G());
        p2().getInputEditText().setFilters(C.G());
        G2().getInputEditText().setFilters(C.G());
        C2().getInputEditText().setFilters(C.G());
        E2().getInputEditText().setFilters(C.G());
        F2().getInputEditText().setFilters(C.G());
        B2().getInputEditText().setFilters(C.G());
        H2().getInputEditText().setFilters(C.G());
        t2().getInputEditText().setFilters(C.G());
        K2().getInputEditText().setFilters(C.G());
        a3(false);
        b3(false);
        g2().setLabel(getString(R.string.maya_kyc_complete_personal_information_birth_state_label));
        d2().setLabel(getString(R.string.maya_kyc_complete_personal_information_birth_city_label));
        i3(false);
        N1(O2(), KycFieldType.WORK_NATION, new C0419w(1, I2(), c.class, "onWorkNatureClicked", "onWorkNatureClicked(Ljava/lang/String;)V", 0, 12), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 15));
        D3(A2(), KycFieldType.NATURE_OF_WORK_OTHERS, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 24));
        N1(u2(), KycFieldType.INCOME_SOURCE, new C0419w(1, I2(), c.class, "onIncomeSourceClicked", "onIncomeSourceClicked(Ljava/lang/String;)V", 0, 23), new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 9));
        D3(q2(), KycFieldType.COMPANY_NAME, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 10));
        D3(r2(), KycFieldType.FIRST_NAME, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 11));
        MayaInputLayout mayaInputLayoutX2 = x2();
        D3(mayaInputLayoutX2, KycFieldType.MIDDLE_NAME, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 12));
        AppCompatEditText inputEditText = mayaInputLayoutX2.getInputEditText();
        A a8 = new A();
        a8.c = new G(this, i10);
        a8.f1715d = new G(this, i4);
        a8.e = new l(i, this, mayaInputLayoutX2);
        inputEditText.addTextChangedListener(a8);
        y2().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: M8.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompletePersonalInformationFragment f3196b;

            {
                this.f3196b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                Integer numI;
                switch (i10) {
                    case 0:
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = this.f3196b;
                        C0212u c0212u2 = (C0212u) mayaKycCompletePersonalInformationFragment.I2();
                        c0212u2.f1093o = !z4;
                        if (z4) {
                            MayaInputLayout mayaInputLayoutX22 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).x2();
                            mayaInputLayoutX22.setEnabled(false);
                            mayaInputLayoutX22.getFormContainerLayout().setEnabled(false);
                            mayaInputLayoutX22.getFormContainerLayout().setClickable(false);
                            D1.a(mayaInputLayoutX22);
                        } else {
                            MayaInputLayout mayaInputLayoutX23 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).x2();
                            mayaInputLayoutX23.setEnabled(true);
                            mayaInputLayoutX23.getFormContainerLayout().setEnabled(true);
                            mayaInputLayoutX23.getFormContainerLayout().setClickable(true);
                        }
                        T2.Q(mayaKycCompletePersonalInformationFragment, mayaKycCompletePersonalInformationFragment.y2().getText().toString(), null, null, 14);
                        break;
                    default:
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = this.f3196b;
                        C0212u c0212u3 = (C0212u) mayaKycCompletePersonalInformationFragment2.I2();
                        c0212u3.f1094p = !z4;
                        if (z4) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                            ((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f4021s.setVisibility(8);
                            D1.a(mayaKycCompletePersonalInformationFragment3.D2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.G2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.C2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.E2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.F2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.B2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.H2());
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).M2().setVisibility(8);
                            if (c0212u3.j.e().isShortenedFlowAddressDropdownEnabled()) {
                                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                                mayaKycCompletePersonalInformationFragment4.G2().b();
                                mayaKycCompletePersonalInformationFragment4.C2().b();
                                mayaKycCompletePersonalInformationFragment4.E2().b();
                                mayaKycCompletePersonalInformationFragment4.H2().b();
                            }
                        } else {
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).z3();
                            if (c0212u3.f1104z) {
                                if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).R2().equalsIgnoreCase("Philippines") && (numI = c0212u3.I()) != null) {
                                    c0212u3.c0(numI.intValue());
                                }
                                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment5 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                                MayaInputLayout mayaInputLayoutD2 = mayaKycCompletePersonalInformationFragment5.D2();
                                mayaInputLayoutD2.setEnabled(false);
                                mayaInputLayoutD2.f12074x = false;
                                mayaInputLayoutD2.l();
                                mayaKycCompletePersonalInformationFragment5.G2().e();
                                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).A3();
                            }
                        }
                        T2.Q(mayaKycCompletePersonalInformationFragment2, mayaKycCompletePersonalInformationFragment2.N2().getText().toString(), null, null, 14);
                        break;
                }
            }
        });
        D3(v2(), KycFieldType.LAST_NAME, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 4));
        N1(z2(), KycFieldType.NATIONALITY, new C0419w(1, I2(), c.class, "onNationalityClicked", "onNationalityClicked(Ljava/lang/String;)V", 0, 8), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 5));
        D3(f2(), KycFieldType.BIRTH_DATE, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 6));
        qk.i.c(f2());
        N1(e2(), KycFieldType.BIRTH_COUNTRY, new C0419w(1, I2(), c.class, "onBirthCountryClicked", "onBirthCountryClicked(Ljava/lang/String;)V", 0, 9), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 7));
        N1(g2(), KycFieldType.BIRTH_STATE, new C0419w(1, I2(), c.class, "onBirthStateClicked", "onBirthStateClicked(Ljava/lang/String;)V", 0, 10), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 8));
        MayaInputLayout mayaInputLayoutD2 = d2();
        KycFieldType kycFieldType = KycFieldType.BIRTH_CITY;
        O1(mayaInputLayoutD2, kycFieldType, new C0419w(1, I2(), c.class, "onBirthCityClicked", "onBirthCityClicked(Ljava/lang/String;)V", 0, 11), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 9));
        D3(d2(), kycFieldType, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 10));
        N1(l2(), KycFieldType.CURRENT_COUNTRY, new C0419w(1, I2(), c.class, "onCurrentCountryClicked", "onCurrentCountryClicked(Ljava/lang/String;)V", 0, 13), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 11));
        MayaInputLayout mayaInputLayoutO2 = o2();
        KycFieldType kycFieldType2 = KycFieldType.CURRENT_STATE;
        O1(mayaInputLayoutO2, kycFieldType2, new C0419w(1, I2(), c.class, "onCurrentStateClicked", "onCurrentStateClicked(Ljava/lang/String;)V", 0, 14), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 12));
        MayaInputLayout mayaInputLayoutK2 = k2();
        KycFieldType kycFieldType3 = KycFieldType.CURRENT_CITY;
        O1(mayaInputLayoutK2, kycFieldType3, new C0419w(1, I2(), c.class, "onCurrentCityClicked", "onCurrentCityClicked(Ljava/lang/String;)V", 0, 15), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 13));
        MayaInputLayout mayaInputLayoutM2 = m2();
        KycFieldType kycFieldType4 = KycFieldType.CURRENT_BARANGAY;
        O1(mayaInputLayoutM2, kycFieldType4, new C0419w(1, I2(), c.class, "onCurrentBarangayClicked", "onCurrentBarangayClicked(Ljava/lang/String;)V", 0, 16), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 14));
        MayaInputLayout mayaInputLayoutP2 = p2();
        KycFieldType kycFieldType5 = KycFieldType.CURRENT_ZIP_CODE;
        O1(mayaInputLayoutP2, kycFieldType5, new C0419w(1, I2(), c.class, "onCurrentZipcodeClicked", "onCurrentZipcodeClicked(Ljava/lang/String;)V", 0, 17), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 16));
        D3(o2(), kycFieldType2, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 17));
        D3(k2(), kycFieldType3, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 18));
        D3(m2(), kycFieldType4, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 19));
        MayaInputLayout mayaInputLayoutN2 = n2();
        D3(mayaInputLayoutN2, KycFieldType.CURRENT_FULL_ADDRESS, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 20));
        if (((C0212u) I2()).S()) {
            mayaInputLayoutN2.getInputEditText().setOnKeyListener(new I());
        }
        D3(j2(), KycFieldType.CURRENT_ADDITIONAL_ADDRESS, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 21));
        D3(p2(), kycFieldType5, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 22));
        N2().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: M8.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycCompletePersonalInformationFragment f3196b;

            {
                this.f3196b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                Integer numI;
                switch (i6) {
                    case 0:
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = this.f3196b;
                        C0212u c0212u2 = (C0212u) mayaKycCompletePersonalInformationFragment.I2();
                        c0212u2.f1093o = !z4;
                        if (z4) {
                            MayaInputLayout mayaInputLayoutX22 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).x2();
                            mayaInputLayoutX22.setEnabled(false);
                            mayaInputLayoutX22.getFormContainerLayout().setEnabled(false);
                            mayaInputLayoutX22.getFormContainerLayout().setClickable(false);
                            D1.a(mayaInputLayoutX22);
                        } else {
                            MayaInputLayout mayaInputLayoutX23 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u2.c.get())).x2();
                            mayaInputLayoutX23.setEnabled(true);
                            mayaInputLayoutX23.getFormContainerLayout().setEnabled(true);
                            mayaInputLayoutX23.getFormContainerLayout().setClickable(true);
                        }
                        T2.Q(mayaKycCompletePersonalInformationFragment, mayaKycCompletePersonalInformationFragment.y2().getText().toString(), null, null, 14);
                        break;
                    default:
                        MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = this.f3196b;
                        C0212u c0212u3 = (C0212u) mayaKycCompletePersonalInformationFragment2.I2();
                        c0212u3.f1094p = !z4;
                        if (z4) {
                            MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                            ((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f4021s.setVisibility(8);
                            D1.a(mayaKycCompletePersonalInformationFragment3.D2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.G2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.C2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.E2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.F2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.B2());
                            D1.a(mayaKycCompletePersonalInformationFragment3.H2());
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).M2().setVisibility(8);
                            if (c0212u3.j.e().isShortenedFlowAddressDropdownEnabled()) {
                                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment4 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                                mayaKycCompletePersonalInformationFragment4.G2().b();
                                mayaKycCompletePersonalInformationFragment4.C2().b();
                                mayaKycCompletePersonalInformationFragment4.E2().b();
                                mayaKycCompletePersonalInformationFragment4.H2().b();
                            }
                        } else {
                            ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).z3();
                            if (c0212u3.f1104z) {
                                if (!((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).R2().equalsIgnoreCase("Philippines") && (numI = c0212u3.I()) != null) {
                                    c0212u3.c0(numI.intValue());
                                }
                                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment5 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get());
                                MayaInputLayout mayaInputLayoutD22 = mayaKycCompletePersonalInformationFragment5.D2();
                                mayaInputLayoutD22.setEnabled(false);
                                mayaInputLayoutD22.f12074x = false;
                                mayaInputLayoutD22.l();
                                mayaKycCompletePersonalInformationFragment5.G2().e();
                                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u3.c.get())).A3();
                            }
                        }
                        T2.Q(mayaKycCompletePersonalInformationFragment2, mayaKycCompletePersonalInformationFragment2.N2().getText().toString(), null, null, 14);
                        break;
                }
            }
        });
        N1(D2(), KycFieldType.PERMANENT_COUNTRY, new C0419w(1, I2(), c.class, "onPermanentCountryClicked", "onPermanentCountryClicked(Ljava/lang/String;)V", 0, 18), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 23));
        MayaInputLayout mayaInputLayoutG2 = G2();
        KycFieldType kycFieldType6 = KycFieldType.PERMANENT_STATE;
        O1(mayaInputLayoutG2, kycFieldType6, new C0419w(1, I2(), c.class, "onPermanentStateClicked", "onPermanentStateClicked(Ljava/lang/String;)V", 0, 19), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 25));
        MayaInputLayout mayaInputLayoutC2 = C2();
        KycFieldType kycFieldType7 = KycFieldType.PERMANENT_CITY;
        O1(mayaInputLayoutC2, kycFieldType7, new C0419w(1, I2(), c.class, "onPermanentCityClicked", "onPermanentCityClicked(Ljava/lang/String;)V", 0, 20), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 26));
        MayaInputLayout mayaInputLayoutE2 = E2();
        KycFieldType kycFieldType8 = KycFieldType.PERMANENT_BARANGAY;
        O1(mayaInputLayoutE2, kycFieldType8, new C0419w(1, I2(), c.class, "onPermanentBarangayClicked", "onPermanentBarangayClicked(Ljava/lang/String;)V", 0, 21), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 27));
        MayaInputLayout mayaInputLayoutH2 = H2();
        KycFieldType kycFieldType9 = KycFieldType.PERMANENT_ZIP_CODE;
        O1(mayaInputLayoutH2, kycFieldType9, new C0419w(1, I2(), c.class, "onPermanentZipcodeClicked", "onPermanentZipcodeClicked(Ljava/lang/String;)V", 0, 22), new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 28));
        D3(G2(), kycFieldType6, new I6.e(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 29));
        D3(C2(), kycFieldType7, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 0));
        D3(E2(), kycFieldType8, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 1));
        MayaInputLayout mayaInputLayoutF2 = F2();
        D3(mayaInputLayoutF2, KycFieldType.PERMANENT_FULL_ADDRESS, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 2));
        if (((C0212u) I2()).S()) {
            mayaInputLayoutF2.getInputEditText().setOnKeyListener(new I());
        }
        D3(B2(), KycFieldType.PERMANENT_ADDITIONAL_ADDRESS, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 3));
        D3(H2(), kycFieldType9, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 4));
        MayaInputLayout mayaInputLayoutT2 = t2();
        KycFieldType kycFieldType10 = KycFieldType.ID_NUMBER;
        D3(mayaInputLayoutT2, kycFieldType10, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 5));
        MayaInputLayout mayaInputLayoutS2 = s2();
        KycFieldType kycFieldType11 = KycFieldType.ID_EXPIRATION_DATE;
        D3(mayaInputLayoutS2, kycFieldType11, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 6));
        qk.i.c(s2());
        D3(K2(), kycFieldType10, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 7));
        D3(J2(), kycFieldType11, new T(2, I2(), c.class, "validateField", "validateField(Lcom/paymaya/domain/model/KycFieldType;Ljava/lang/String;)Lcom/paymaya/domain/model/KycValidationResult;", 0, 8));
        qk.i.c(J2());
        C.r0(((W) G1()).f3971b.f4022t, new G(this, i));
        C.r0(((W) G1()).f3971b.f4002b, new G(this, 9));
        Xh.i.E(this, kotlin.jvm.internal.z.a(MayaKycSingleSelectionBottomSheetDialogFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handleSingleSelectionResult", "handleSingleSelectionResult(Lcom/paymaya/domain/model/KycSelectionItem;)V", 0, 2));
        Xh.i.D(this, kotlin.jvm.internal.z.a(MayaKycConfirmationBottomSheetDialogFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handleFormConfirmationResult", "handleFormConfirmationResult(Z)V", 0, 3));
        Xh.i.D(this, kotlin.jvm.internal.z.a(MayaKycChangeYourMindBottomSheetDialogFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handleFormCancellationResult", "handleFormCancellationResult(Z)V", 0, 4));
        Xh.i.F(this, kotlin.jvm.internal.z.a(MayaKycAdditionalDocumentsFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handleMinorFlowResult", "handleMinorFlowResult(Lcom/paymaya/domain/model/KycMinorPhotos;)V", 0, 5), "confirmation_result_parcelable_minor_flow");
        Xh.i.F(this, kotlin.jvm.internal.z.a(MayaKycPersonalInfoConfirmSubmissionFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handlePersonalInfoConfirmSubmissionFlowResult", "handlePersonalInfoConfirmSubmissionFlowResult(Lcom/paymaya/domain/model/PersonalInfoConfirmAction;)V", 0, 6), "confirmation_result_parcelable");
        Xh.i.F(this, kotlin.jvm.internal.z.a(MayaKycAdditionalDocumentsFragment.class), new C0419w(1, this, MayaKycCompletePersonalInformationFragment.class, "handlePersonalInfoConfirmSubmissionFlowResult", "handlePersonalInfoConfirmSubmissionFlowResult(Lcom/paymaya/domain/model/PersonalInfoConfirmAction;)V", 0, 7), "confirmation_result_parcelable_adult_flow");
        String name = getParentFragmentManager().getBackStackEntryAt(getParentFragmentManager().getBackStackEntryCount() - 1).getName();
        KeyEventDispatcher.Component activity = getActivity();
        kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) activity)).Z1().f1045n = name;
    }

    public final MayaInputLayout p2() {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) ((W) G1()).f3971b.f4014k.f4088d;
        kotlin.jvm.internal.j.f(mayaInputLayout, "mayaInputLayout");
        return mayaInputLayout;
    }

    public final void p3(String str) {
        u2().getInputEditText().setText(str);
        u2().f();
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        ((MayaKycActivity) D1.b(this)).q();
    }

    public final MayaInputLayout q2() {
        MayaInputLayout mayaInputEmploymentDetail = ((W) G1()).f3971b.f3975A;
        kotlin.jvm.internal.j.f(mayaInputEmploymentDetail, "mayaInputEmploymentDetail");
        return mayaInputEmploymentDetail;
    }

    public final void q3(String str) {
        C2().getInputEditText().setText(str);
    }

    public final MayaInputLayout r2() {
        MayaInputLayout mayaInputFirstName = ((W) G1()).f3971b.f3976B;
        kotlin.jvm.internal.j.f(mayaInputFirstName, "mayaInputFirstName");
        return mayaInputFirstName;
    }

    public final void r3(String str) {
        E2().getInputEditText().setText(str);
    }

    public final MayaInputLayout s2() {
        MayaInputLayout mayaInputIdExpirationDate = ((W) G1()).f3971b.f3977C;
        kotlin.jvm.internal.j.f(mayaInputIdExpirationDate, "mayaInputIdExpirationDate");
        return mayaInputIdExpirationDate;
    }

    public final void s3(String str) {
        G2().getInputEditText().setText(str);
    }

    public final MayaInputLayout t2() {
        MayaInputLayout mayaInputIdNumber = ((W) G1()).f3971b.f3978D;
        kotlin.jvm.internal.j.f(mayaInputIdNumber, "mayaInputIdNumber");
        return mayaInputIdNumber;
    }

    public final void t3(String str) {
        H2().getInputEditText().setText(str);
    }

    public final MayaInputLayout u2() {
        MayaInputLayout mayaInputIncomeSource = ((W) G1()).f3971b.f3979E;
        kotlin.jvm.internal.j.f(mayaInputIncomeSource, "mayaInputIncomeSource");
        return mayaInputIncomeSource;
    }

    public final void u3(KycPreSubmissionContent kycPreSubmissionContent) {
        this.f12486X = kycPreSubmissionContent;
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).Z1().m = kycPreSubmissionContent;
    }

    public final MayaInputLayout v2() {
        MayaInputLayout mayaInputLastName = ((W) G1()).f3971b.f3980F;
        kotlin.jvm.internal.j.f(mayaInputLastName, "mayaInputLastName");
        return mayaInputLastName;
    }

    public final void v3(TextView textView, String str, String str2, String str3) {
        String str4 = String.format(str, Arrays.copyOf(new Object[]{str2, str3}, 2));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str4);
        int iF = C2576A.F(str4, str2, 0, false, 6);
        int length = str2.length() + iF;
        int iF2 = C2576A.F(str4, str3, 0, false, 6);
        int length2 = str3.length() + iF2;
        spannableStringBuilder.setSpan(new TextAppearanceSpan(requireContext(), R.style.CerebriBoldSmallText), iF, length, 33);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(requireContext(), R.style.CerebriBoldSmallText), iF2, length2, 33);
        TextViewCompat.setTextAppearance(textView, R.style.CerebriBookSmallText_Info);
        textView.setText(spannableStringBuilder);
    }

    public final void w0() {
        q2().setVisibility(8);
    }

    public final Z w2() {
        Z layoutLoading = ((W) G1()).c;
        kotlin.jvm.internal.j.f(layoutLoading, "layoutLoading");
        return layoutLoading;
    }

    public final void w3() {
        d2().e();
        d2().setEnabled(true);
        g2().b();
        FrameLayout frameLayout = (FrameLayout) h2().c;
        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
        frameLayout.setVisibility(8);
    }

    public final MayaInputLayout x2() {
        MayaInputLayout mayaInputMiddleName = ((W) G1()).f3971b.f3981G;
        kotlin.jvm.internal.j.f(mayaInputMiddleName, "mayaInputMiddleName");
        return mayaInputMiddleName;
    }

    public final void x3() {
        w2().f4041b.setVisibility(8);
        ((W) G1()).f3971b.f4000a.setVisibility(0);
        MayaKycActivity mayaKycActivity = (MayaKycActivity) D1.b(this);
        mayaKycActivity.t2();
        H8.a aVar = H8.a.f2142d;
        mayaKycActivity.R1();
        mayaKycActivity.E1(100);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.p2(new M8.L(this, 0));
    }

    public final AppCompatCheckBox y2() {
        AppCompatCheckBox checkboxMiddleName = ((W) G1()).f3971b.c;
        kotlin.jvm.internal.j.f(checkboxMiddleName, "checkboxMiddleName");
        return checkboxMiddleName;
    }

    public final void y3(C0450f c0450f, boolean z4) {
        MayaInputLayout mayaInputLayout = (MayaInputLayout) c0450f.f4088d;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) c0450f.f4087b;
        if (z4) {
            lottieAnimationView.setVisibility(0);
            mayaInputLayout.setVisibility(4);
            C0453g c0453g = ((MayaKycActivity) D1.b(this)).f12451s;
            kotlin.jvm.internal.j.d(c0453g);
            ((G0) c0453g.c).f3627b.setVisibility(0);
            return;
        }
        lottieAnimationView.setVisibility(8);
        mayaInputLayout.setVisibility(0);
        C0453g c0453g2 = ((MayaKycActivity) D1.b(this)).f12451s;
        kotlin.jvm.internal.j.d(c0453g2);
        ((G0) c0453g2.c).f3627b.setVisibility(8);
    }

    public final MayaInputLayout z2() {
        MayaInputLayout mayaInputNationality = ((W) G1()).f3971b.f3982H;
        kotlin.jvm.internal.j.f(mayaInputNationality, "mayaInputNationality");
        return mayaInputNationality;
    }

    public final void z3() {
        ((W) G1()).f3971b.f4021s.setVisibility(0);
        if (((C0212u) I2()).S()) {
            B2().setVisibility(8);
        }
    }
}
