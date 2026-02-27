package M8;

import android.view.View;
import com.paymaya.R;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import defpackage.AbstractC1414e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class J implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycCompletePersonalInformationFragment f3180b;
    public final /* synthetic */ MayaInputLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i f3181d;
    public final /* synthetic */ KycFieldType e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ J(MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment, MayaInputLayout mayaInputLayout, Function2 function2, KycFieldType kycFieldType, int i) {
        this.f3179a = i;
        this.f3180b = mayaKycCompletePersonalInformationFragment;
        this.c = mayaInputLayout;
        this.f3181d = (kotlin.jvm.internal.i) function2;
        this.e = kycFieldType;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r0v24, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.f3179a) {
            case 0:
                if (z4) {
                    view.callOnClick();
                    return;
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MayaInputLayout mayaInputLayout = this.c;
                    this.f3180b.Y2(mayaInputLayout, (KycValidationResult) this.f3181d.invoke(this.e, AbstractC1414e.g(mayaInputLayout)));
                    return;
                }
            case 1:
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = this.f3180b;
                KycFieldType kycFieldType = this.e;
                if (!z4) {
                    MayaInputLayout mayaInputLayout2 = this.c;
                    mayaKycCompletePersonalInformationFragment.Y2(mayaInputLayout2, (KycValidationResult) this.f3181d.invoke(kycFieldType, AbstractC1414e.g(mayaInputLayout2)));
                    return;
                }
                mayaKycCompletePersonalInformationFragment.getClass();
                switch (P.f3206a[kycFieldType.ordinal()]) {
                    case 1:
                        String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_nature_of_work_others_label);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string, null, null, 14);
                        return;
                    case 2:
                        String string2 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_company_name_label);
                        kotlin.jvm.internal.j.f(string2, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string2, null, null, 14);
                        return;
                    case 3:
                        String string3 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_first_name_label);
                        kotlin.jvm.internal.j.f(string3, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string3, null, null, 14);
                        return;
                    case 4:
                        String string4 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_middle_name_label);
                        kotlin.jvm.internal.j.f(string4, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string4, null, null, 14);
                        return;
                    case 5:
                        String string5 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_last_name_label);
                        kotlin.jvm.internal.j.f(string5, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string5, null, null, 14);
                        return;
                    case 6:
                        String string6 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_date_label);
                        kotlin.jvm.internal.j.f(string6, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string6, null, null, 14);
                        return;
                    case 7:
                        String string7 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_birth_place_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string7, AbstractC1414e.i(string7, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_birth_city_label, "getString(...)")), null, null, 14);
                        return;
                    case 8:
                        String string8 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string8, AbstractC1414e.i(string8, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_state_label, "getString(...)")), null, null, 14);
                        return;
                    case 9:
                        String string9 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string9, AbstractC1414e.i(string9, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_city_label, "getString(...)")), null, null, 14);
                        return;
                    case 10:
                        String string10 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string10, AbstractC1414e.i(string10, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_district_label, "getString(...)")), null, null, 14);
                        return;
                    case 11:
                        String string11 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string11, AbstractC1414e.i(string11, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_full_address_label, "getString(...)")), null, null, 14);
                        return;
                    case 12:
                        String string12 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string12, zj.z.t(AbstractC1414e.i(string12, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_additional_info_label, "getString(...)"), " (optional)", "")), null, null, 14);
                        return;
                    case 13:
                        String string13 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_current_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string13, AbstractC1414e.i(string13, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_zip_code_label, "getString(...)")), null, null, 14);
                        return;
                    case 14:
                        String string14 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string14, AbstractC1414e.i(string14, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_state_label, "getString(...)")), null, null, 14);
                        return;
                    case 15:
                        String string15 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string15, AbstractC1414e.i(string15, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_city_label, "getString(...)")), null, null, 14);
                        return;
                    case 16:
                        String string16 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string16, AbstractC1414e.i(string16, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_district_label, "getString(...)")), null, null, 14);
                        return;
                    case 17:
                        String string17 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string17, AbstractC1414e.i(string17, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_full_address_label, "getString(...)")), null, null, 14);
                        return;
                    case 18:
                        String string18 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string18, zj.z.t(AbstractC1414e.i(string18, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_additional_info_label, "getString(...)"), " (optional)", "")), null, null, 14);
                        return;
                    case 19:
                        String string19 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_permanent_address_header);
                        T2.Q(mayaKycCompletePersonalInformationFragment, MayaKycCompletePersonalInformationFragment.f3(string19, AbstractC1414e.i(string19, "getString(...)", mayaKycCompletePersonalInformationFragment, R.string.maya_kyc_complete_personal_information_address_zip_code_label, "getString(...)")), null, null, 14);
                        return;
                    case 20:
                        String string20 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_id_number_label);
                        kotlin.jvm.internal.j.f(string20, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string20, null, null, 14);
                        return;
                    case 21:
                        String string21 = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_id_expiration_date_label);
                        kotlin.jvm.internal.j.f(string21, "getString(...)");
                        T2.Q(mayaKycCompletePersonalInformationFragment, string21, null, null, 14);
                        return;
                    default:
                        return;
                }
            default:
                if (z4) {
                    view.callOnClick();
                    return;
                } else {
                    if (z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MayaInputLayout mayaInputLayout3 = this.c;
                    this.f3180b.Y2(mayaInputLayout3, (KycValidationResult) this.f3181d.invoke(this.e, AbstractC1414e.g(mayaInputLayout3)));
                    return;
                }
        }
    }
}
