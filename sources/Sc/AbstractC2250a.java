package sc;

import We.s;
import cj.C1110A;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.UpdateProfileValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import dOYHB6.tiZVw8.numX49;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.n;
import zj.o;
import zj.x;
import zj.z;

/* JADX INFO: renamed from: sc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2250a {
    public static final String a(String str) {
        String strTnTj78 = numX49.tnTj78("bFXP");
        String strTnTj782 = numX49.tnTj78("bFXb");
        String strM = AbstractC1213b.M(strTnTj78, str, strTnTj782);
        if (C2576A.H(strM)) {
            return strTnTj782;
        }
        String strTnTj783 = numX49.tnTj78("bFX2");
        List listT = C2576A.T(strM, new String[]{strTnTj783}, 6);
        Object obj = listT.get(0);
        String str2 = (String) C1110A.C(1, listT);
        if (str2 != null) {
            strTnTj782 = str2;
        }
        String str3 = (String) obj;
        Double dE = x.e(str3);
        if (dE != null) {
            String str4 = NumberFormat.getNumberInstance(Locale.ENGLISH).format(dE.doubleValue());
            if (str4 != null) {
                str3 = str4;
            }
        }
        int length = strTnTj782.length();
        return s.j(numX49.tnTj78("bFXZ"), str3, length != 0 ? length != 1 ? strTnTj783.concat(strTnTj782) : s.j(strTnTj783, strTnTj782, numX49.tnTj78("bFXL")) : numX49.tnTj78("bFXr"));
    }

    public static final String b(Function1 function1, Object obj) {
        String str;
        return (obj == null || (str = (String) function1.invoke(obj)) == null) ? numX49.tnTj78("bFXk") : str;
    }

    public static final void c(MayaProfileInputLayout mayaProfileInputLayout, UpdateProfileValidationResult updateProfileValidationResult, Function0 function0) {
        j.g(mayaProfileInputLayout, numX49.tnTj78("bFXB"));
        j.g(updateProfileValidationResult, numX49.tnTj78("bFXu"));
        if (updateProfileValidationResult.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            mayaProfileInputLayout.f();
            return;
        }
        if (updateProfileValidationResult instanceof UpdateProfileValidationResult.RequiredFieldError) {
            mayaProfileInputLayout.setHelperErrorText(mayaProfileInputLayout.getContext().getString(R.string.maya_update_profile_required_field, mayaProfileInputLayout.getLabel()));
            mayaProfileInputLayout.p();
            function0.invoke();
            return;
        }
        if (updateProfileValidationResult instanceof UpdateProfileValidationResult.RegExError) {
            i(mayaProfileInputLayout, ((UpdateProfileValidationResult.RegExError) updateProfileValidationResult).getMessage());
            function0.invoke();
            return;
        }
        boolean z4 = updateProfileValidationResult instanceof UpdateProfileValidationResult.DuplicationError;
        String strTnTj78 = numX49.tnTj78("bFXV");
        if (z4) {
            String string = mayaProfileInputLayout.getContext().getString(R.string.maya_update_profile_mother_name_consecutive_char_error);
            j.f(string, strTnTj78);
            i(mayaProfileInputLayout, string);
            function0.invoke();
            return;
        }
        if (updateProfileValidationResult instanceof UpdateProfileValidationResult.DuplicateContactNumberError) {
            String string2 = mayaProfileInputLayout.getContext().getString(R.string.maya_update_profile_duplicate_contact_error, ((UpdateProfileValidationResult.DuplicateContactNumberError) updateProfileValidationResult).getFieldName());
            j.f(string2, strTnTj78);
            i(mayaProfileInputLayout, string2);
            function0.invoke();
        }
    }

    public static void d(MayaDropDown mayaDropDown, UpdateProfileValidationResult updateProfileValidationResult) {
        j.g(mayaDropDown, numX49.tnTj78("bFXS"));
        j.g(updateProfileValidationResult, numX49.tnTj78("bFXj"));
        if (updateProfileValidationResult.equals(UpdateProfileValidationResult.Success.INSTANCE)) {
            mayaDropDown.b();
            return;
        }
        if (updateProfileValidationResult instanceof UpdateProfileValidationResult.RequiredFieldError) {
            String string = mayaDropDown.getContext().getString(R.string.maya_update_profile_required_field, mayaDropDown.getLabel());
            j.f(string, numX49.tnTj78("bFXd"));
            h(mayaDropDown, string);
            Unit unit = Unit.f18162a;
            return;
        }
        if (updateProfileValidationResult instanceof UpdateProfileValidationResult.RegExError) {
            h(mayaDropDown, ((UpdateProfileValidationResult.RegExError) updateProfileValidationResult).getMessage());
            Unit unit2 = Unit.f18162a;
        }
    }

    public static final String f(String str) {
        j.g(str, numX49.tnTj78("bFXi"));
        n nVarB = new o(numX49.tnTj78("bFXH")).b(z.t(str, numX49.tnTj78("bFXE"), numX49.tnTj78("bFXF")));
        if (nVarB != null) {
            return nVarB.getValue();
        }
        return null;
    }

    public static String g(String str, o oVar) {
        j.g(oVar, numX49.tnTj78("bFXO"));
        return oVar.f(numX49.tnTj78("bFXQ"), str);
    }

    public static final void h(MayaDropDown mayaDropDown, String str) {
        j.g(mayaDropDown, numX49.tnTj78("bFXt"));
        j.g(str, numX49.tnTj78("bFXU"));
        mayaDropDown.setHelperErrorText(str);
        mayaDropDown.f12042k = true;
        mayaDropDown.d();
    }

    public static final void i(MayaProfileInputLayout mayaProfileInputLayout, String str) {
        j.g(mayaProfileInputLayout, numX49.tnTj78("bFXe"));
        j.g(str, numX49.tnTj78("bFX8"));
        mayaProfileInputLayout.setHelperErrorText(str);
        mayaProfileInputLayout.p();
    }
}
