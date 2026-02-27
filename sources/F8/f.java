package F8;

import G5.h;
import G5.i;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaInputLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final void a(KycMayaInputLayout kycMayaInputLayout, KycFieldType fieldType) {
        j.g(fieldType, "fieldType");
        switch (d.f1557a[fieldType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                kycMayaInputLayout.getInputEditText().setInputType(8193);
                break;
            case 4:
            case 5:
                kycMayaInputLayout.getInputEditText().setInputType(2);
                kycMayaInputLayout.getInputEditText().addTextChangedListener(new i(kycMayaInputLayout.getInputEditText()));
                break;
            case 6:
                kycMayaInputLayout.getInputEditText().setInputType(2);
                kycMayaInputLayout.getInputEditText().addTextChangedListener(new h(kycMayaInputLayout.getInputEditText()));
                break;
            default:
                kycMayaInputLayout.getInputEditText().setInputType(1);
                break;
        }
    }

    public static final void b(G8.b errorMessageProvider, KycFieldType fieldType, KycMayaInputLayout kycMayaInputLayout, Function1 function1, Function2 function2) {
        j.g(fieldType, "fieldType");
        j.g(errorMessageProvider, "errorMessageProvider");
        kycMayaInputLayout.setTag(fieldType);
        a(kycMayaInputLayout, fieldType);
        kycMayaInputLayout.getInputEditText().setFilters(C.G());
        kycMayaInputLayout.getInputEditText().setOnFocusChangeListener(new c(errorMessageProvider, fieldType, kycMayaInputLayout, function2));
        kycMayaInputLayout.getInputEditText().addTextChangedListener(new e(errorMessageProvider, fieldType, kycMayaInputLayout, function1, function2));
    }
}
