package F8;

import Ag.k;
import M8.C0415v;
import M8.K0;
import M8.T2;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bj.InterfaceC1031b;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.domain.model.DosriValidationResult;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import defpackage.AbstractC1414e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1555b;
    public final /* synthetic */ KycFieldType c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1031b f1556d;
    public final /* synthetic */ ConstraintLayout e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(G8.b bVar, KycFieldType kycFieldType, KycMayaDropDown kycMayaDropDown, Function2 function2) {
        this.f1554a = 0;
        this.f1555b = bVar;
        this.c = kycFieldType;
        this.e = kycMayaDropDown;
        this.f1556d = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.i] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        String string;
        String string2;
        KycFieldType kycFieldType = this.c;
        String str = "";
        Object obj = this.f1555b;
        InterfaceC1031b interfaceC1031b = this.f1556d;
        ConstraintLayout constraintLayout = this.e;
        switch (this.f1554a) {
            case 0:
                G8.b bVar = (G8.b) obj;
                KycFieldType fieldType = this.c;
                if (z4) {
                    G8.a aVar = (G8.a) bVar;
                    aVar.getClass();
                    j.g(fieldType, "fieldType");
                    aVar.c.invoke(fieldType);
                    return;
                }
                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) constraintLayout;
                Object selectedData = kycMayaDropDown.getSelectedData();
                if (selectedData != null && (string = selectedData.toString()) != null) {
                    str = string;
                }
                KycValidationResult kycValidationResult = (KycValidationResult) ((i) interfaceC1031b).invoke(fieldType, str);
                String labelText = kycMayaDropDown.getLabelText();
                if (labelText == null) {
                    labelText = fieldType.name();
                }
                G8.c.a(kycValidationResult, fieldType, labelText, bVar, new Ag.d(kycMayaDropDown, 16), new k(kycMayaDropDown, 11));
                return;
            case 1:
                G8.b bVar2 = (G8.b) obj;
                KycFieldType fieldType2 = this.c;
                if (z4) {
                    G8.a aVar2 = (G8.a) bVar2;
                    aVar2.getClass();
                    j.g(fieldType2, "fieldType");
                    aVar2.c.invoke(fieldType2);
                    return;
                }
                KycMayaInputLayout kycMayaInputLayout = (KycMayaInputLayout) constraintLayout;
                KycValidationResult kycValidationResult2 = (KycValidationResult) ((i) interfaceC1031b).invoke(fieldType2, fieldType2 == KycFieldType.NATIONAL_ID ? z.t(kycMayaInputLayout.getText(), Global.BLANK, "") : kycMayaInputLayout.getText());
                String labelText2 = kycMayaInputLayout.getLabelText();
                if (labelText2 == null) {
                    labelText2 = fieldType2.name();
                }
                G8.c.a(kycValidationResult2, fieldType2, labelText2, bVar2, new Ag.d(kycMayaInputLayout, 17), new k(kycMayaInputLayout, 12));
                return;
            case 2:
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) obj;
                if (!z4) {
                    MayaInputLayout mayaInputLayout = (MayaInputLayout) constraintLayout;
                    mayaKycDosriFragment.P1(mayaInputLayout, (DosriValidationResult) ((Function2) interfaceC1031b).invoke(kycFieldType, AbstractC1414e.g(mayaInputLayout)));
                    return;
                }
                j.d(view);
                int iO1 = mayaKycDosriFragment.O1(view);
                int i = K0.f3186a[kycFieldType.ordinal()];
                if (i == 1) {
                    string2 = mayaKycDosriFragment.getString(R.string.maya_kyc_dosri_relationship_label);
                } else if (i == 2) {
                    string2 = mayaKycDosriFragment.getString(R.string.maya_kyc_complete_personal_information_first_name_label);
                } else if (i == 3) {
                    string2 = mayaKycDosriFragment.getString(R.string.maya_kyc_complete_personal_information_middle_name_label);
                } else if (i != 4) {
                    return;
                } else {
                    string2 = mayaKycDosriFragment.getString(R.string.maya_kyc_complete_personal_information_last_name_label);
                }
                mayaKycDosriFragment.Q1(androidx.media3.datasource.cache.c.h(iO1, string2, Global.BLANK), "");
                return;
            default:
                if (z4) {
                    view.callOnClick();
                    return;
                }
                if (z4) {
                    throw new NoWhenBranchMatchedException();
                }
                MayaDropDown mayaDropDown = (MayaDropDown) constraintLayout;
                DosriValidationResult dosriValidationResult = (DosriValidationResult) ((C0415v) interfaceC1031b).invoke(kycFieldType, mayaDropDown.getDisplayText().getText().toString());
                MayaKycDosriFragment mayaKycDosriFragment2 = (MayaKycDosriFragment) obj;
                mayaKycDosriFragment2.getClass();
                if (j.b(dosriValidationResult, DosriValidationResult.Success.INSTANCE)) {
                    mayaDropDown.b();
                    return;
                }
                int iO12 = mayaKycDosriFragment2.O1(mayaDropDown);
                String string3 = dosriValidationResult instanceof DosriValidationResult.RequiredFieldError ? mayaDropDown.getContext().getString(R.string.maya_kyc_complete_personal_information_required_field, mayaDropDown.getLabel()) : dosriValidationResult instanceof DosriValidationResult.RegexpError ? ((DosriValidationResult.RegexpError) dosriValidationResult).getMessage() : null;
                if (string3 != null) {
                    mayaDropDown.setHelperErrorText(string3);
                    mayaDropDown.f12042k = true;
                    mayaDropDown.d();
                    T2.L(mayaKycDosriFragment2, androidx.media3.datasource.cache.c.h(iO12, mayaDropDown.getLabel(), Global.BLANK), string3, true);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c(G8.b bVar, KycFieldType kycFieldType, KycMayaInputLayout kycMayaInputLayout, Function2 function2) {
        this.f1554a = 1;
        this.f1555b = bVar;
        this.c = kycFieldType;
        this.e = kycMayaInputLayout;
        this.f1556d = (i) function2;
    }

    public /* synthetic */ c(MayaKycDosriFragment mayaKycDosriFragment, ConstraintLayout constraintLayout, Function2 function2, KycFieldType kycFieldType, int i) {
        this.f1554a = i;
        this.f1555b = mayaKycDosriFragment;
        this.e = constraintLayout;
        this.f1556d = function2;
        this.c = kycFieldType;
    }
}
