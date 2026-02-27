package G8;

import M8.T2;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycValidationField;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycValidationRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import org.joda.time.LocalDate;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f1924a = new o("^(?!0{16}$)[0-9]{16}$");

    public static KycValidationResult a(KycFieldType field, String value, List validationRules, Function1 function1) {
        KycValidationField kycValidationField;
        Object next;
        KycValidationResult invalidUserAge;
        j.g(field, "field");
        j.g(value, "value");
        j.g(validationRules, "validationRules");
        if (value.length() == 0 && ((Boolean) function1.invoke(field)).booleanValue()) {
            return KycValidationResult.RequiredFieldError.INSTANCE;
        }
        Object obj = null;
        if (field.isDate() && value.length() > 0) {
            LocalDate localDateE = T2.E(value);
            if (localDateE == null) {
                invalidUserAge = KycValidationResult.InvalidDateFormat.INSTANCE;
            } else {
                LocalDate localDateNow = LocalDate.now();
                j.f(localDateNow, "now(...)");
                invalidUserAge = (field == KycFieldType.BIRTH_DATE && localDateE.isAfter(localDateNow.minusYears(7))) ? new KycValidationResult.InvalidUserAge(7) : (field == KycFieldType.ID_EXPIRATION_DATE && localDateE.isBefore(localDateNow)) ? KycValidationResult.InvalidIdDate.INSTANCE : (field == KycFieldType.AMLC_CERT_EXPIRY_DATE && localDateE.isBefore(localDateNow)) ? KycValidationResult.InvalidAmlcCertExpiryDate.INSTANCE : KycValidationResult.Success.INSTANCE;
            }
            if (j.b(invalidUserAge, KycValidationResult.Success.INSTANCE)) {
                invalidUserAge = null;
            }
            if (invalidUserAge != null) {
                return invalidUserAge;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : validationRules) {
            List<KycValidationField> fields = ((KycValidationRule) obj2).getFields();
            if (fields != null) {
                Iterator<T> it = fields.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (j.b(((KycValidationField) next).getName(), field.getCmsName())) {
                        break;
                    }
                }
                kycValidationField = (KycValidationField) next;
            } else {
                kycValidationField = null;
            }
            if (kycValidationField != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            String regex = ((KycValidationRule) next2).getRegex();
            if (regex == null) {
                regex = ".*";
            }
            if (!AbstractC1213b.U(regex, value)) {
                obj = next2;
                break;
            }
        }
        KycValidationRule kycValidationRule = (KycValidationRule) obj;
        if (value.length() <= 0 || kycValidationRule == null) {
            return value.length() > field.getMaxLength() ? new KycValidationResult.OutOfRangeError(field.getMaxLength()) : (field != KycFieldType.NATIONAL_ID || value.length() <= 0) ? KycValidationResult.Success.INSTANCE : f1924a.e(value) ? KycValidationResult.Success.INSTANCE : KycValidationResult.NationalIdError.INSTANCE;
        }
        String message = kycValidationRule.getMessage();
        if (message == null) {
            message = "";
        }
        return new KycValidationResult.RegexpError(message);
    }
}
