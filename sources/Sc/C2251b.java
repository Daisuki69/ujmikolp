package sc;

import ac.m;
import cj.C1110A;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.domain.model.ValidationRule;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import yj.e;
import yj.q;
import zj.o;
import zj.z;

/* JADX INFO: renamed from: sc.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2251b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2251b f20034a = new C2251b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f20035b = new o(numX49.tnTj78("bFXC"));

    public static ValidationRule a(C2251b c2251b, List list, FieldType fieldType, String str) {
        c2251b.getClass();
        j.g(fieldType, numX49.tnTj78("bFX4"));
        j.g(str, numX49.tnTj78("bFXo"));
        String cmsName = fieldType.getCmsName();
        Object obj = null;
        if (list == null) {
            return null;
        }
        e eVar = new e(q.h(C1110A.u(list), new m(cmsName, 3)));
        while (true) {
            if (!eVar.hasNext()) {
                break;
            }
            Object next = eVar.next();
            String regex = ((ValidationRule) next).getRegex();
            if (regex == null) {
                regex = numX49.tnTj78("bFXK");
            }
            if (!AbstractC1213b.U(regex, str)) {
                obj = next;
                break;
            }
        }
        return (ValidationRule) obj;
    }

    public static String b(FieldType fieldType, String str) {
        j.g(fieldType, numX49.tnTj78("bFXw"));
        j.g(str, numX49.tnTj78("bFXc"));
        boolean zEquals = fieldType.equals(FieldType.MonthlyTakeHomePay.INSTANCE);
        String strTnTj78 = numX49.tnTj78("bFXm");
        if (!zEquals) {
            return (fieldType.equals(FieldType.TIN.INSTANCE) || fieldType.equals(FieldType.SSS.INSTANCE)) ? AbstractC1213b.M(numX49.tnTj78("bFXh"), str, strTnTj78) : fieldType.equals(FieldType.AlternativeContactNumber.INSTANCE) ? z.t(str, numX49.tnTj78("bFXD"), strTnTj78) : str;
        }
        String strF = AbstractC2250a.f(str);
        return strF == null ? strTnTj78 : strF;
    }

    public static ValidationResult.RequiredFieldError d(FieldType fieldType, Object obj, Function2 function2) {
        j.g(fieldType, numX49.tnTj78("bFXM"));
        if (((Boolean) function2.invoke(fieldType, obj)).booleanValue()) {
            return new ValidationResult.RequiredFieldError(fieldType, null, 2, null);
        }
        return null;
    }

    public final ValidationResult.RegExError c(List list, FieldType fieldType, String str) {
        j.g(fieldType, numX49.tnTj78("bFXN"));
        j.g(str, numX49.tnTj78("bFX6"));
        ValidationRule validationRuleA = a(this, list, fieldType, str);
        if (str.length() <= 0 || validationRuleA == null) {
            return null;
        }
        String message = validationRuleA.getMessage();
        if (message == null) {
            message = numX49.tnTj78("bFXa");
        }
        return new ValidationResult.RegExError(fieldType, message);
    }
}
