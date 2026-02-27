package G8;

import android.content.Context;
import com.paymaya.R;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycValidationResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    /* JADX WARN: Type inference failed for: r4v21, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.a] */
    public static void a(KycValidationResult result, KycFieldType fieldType, String actualFieldLabel, b errorMessageProvider, Function1 function1, Function0 function0) {
        j.g(result, "result");
        j.g(fieldType, "fieldType");
        j.g(actualFieldLabel, "actualFieldLabel");
        j.g(errorMessageProvider, "errorMessageProvider");
        if (result.equals(KycValidationResult.Success.INSTANCE)) {
            function0.invoke();
            return;
        }
        a aVar = (a) errorMessageProvider;
        boolean zEquals = result.equals(KycValidationResult.RequiredFieldError.INSTANCE);
        Context context = aVar.f1922a;
        String string = zEquals ? context.getString(R.string.maya_kyc_complete_personal_information_required_field, actualFieldLabel) : result instanceof KycValidationResult.OutOfRangeError ? context.getString(R.string.maya_kyc_complete_personal_information_too_long_field, Integer.valueOf(((KycValidationResult.OutOfRangeError) result).getMaxLength())) : result.equals(KycValidationResult.InvalidDateFormat.INSTANCE) ? context.getString(R.string.maya_kyc_complete_personal_information_invalid_date_format) : result.equals(KycValidationResult.InvalidIdDate.INSTANCE) ? context.getString(R.string.maya_kyc_complete_personal_information_invalid_id_date) : result.equals(KycValidationResult.InvalidAmlcCertExpiryDate.INSTANCE) ? context.getString(R.string.maya_kyc_amlc_checkpoint_certificate_expiry_error_description) : result instanceof KycValidationResult.InvalidUserAge ? context.getString(R.string.maya_kyc_complete_personal_information_invalid_user_age, Integer.valueOf(((KycValidationResult.InvalidUserAge) result).getMinUserAge())) : result instanceof KycValidationResult.RegexpError ? ((KycValidationResult.RegexpError) result).getMessage() : result instanceof KycValidationResult.NonPhProvinceError ? context.getString(R.string.maya_kyc_complete_personal_information_contains_ph_province) : result.equals(KycValidationResult.NationalIdError.INSTANCE) ? context.getString(R.string.maya_kyc_verify_with_philsys_id_number_error_message) : "";
        j.d(string);
        if (string.length() > 0) {
            function1.invoke(string);
            aVar.f1923b.invoke(actualFieldLabel, string);
        }
    }
}
