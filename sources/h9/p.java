package h9;

import android.text.Editable;
import androidx.appcompat.widget.AppCompatCheckBox;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f16958b;
    public final /* synthetic */ MayaRegistrationUserFragment c;

    public /* synthetic */ p(MayaInputLayout mayaInputLayout, MayaRegistrationUserFragment mayaRegistrationUserFragment, int i) {
        this.f16957a = i;
        this.f16958b = mayaInputLayout;
        this.c = mayaRegistrationUserFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        MayaInputLayout mayaInputLayout = this.f16958b;
        MayaRegistrationUserFragment mayaRegistrationUserFragment = this.c;
        Boolean bool = (Boolean) obj;
        switch (this.f16957a) {
            case 0:
                bool.getClass();
                Editable text = mayaInputLayout.getInputEditText().getText();
                string = text != null ? text.toString() : null;
                if (string == null || C2576A.H(string)) {
                    String string2 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_last_name));
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    M2.b.Q(mayaInputLayout, string2);
                }
                return Unit.f18162a;
            case 1:
                bool.booleanValue();
                AbstractC0983W.E(mayaInputLayout);
                MayaInputLayout mayaInputLayout2 = mayaRegistrationUserFragment.f12811b0;
                if (mayaInputLayout2 != null) {
                    mayaRegistrationUserFragment.M1(mayaInputLayout2.getLabel().toString(), mayaRegistrationUserFragment.f12824p0, mayaRegistrationUserFragment.f12821l0);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mMayaInputLayoutLastName");
                throw null;
            case 2:
                mayaRegistrationUserFragment.f12821l0 = bool.booleanValue();
                String string3 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_three_or_more_character_repetition);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                mayaRegistrationUserFragment.f12824p0 = string3;
                M2.b.Q(mayaInputLayout, string3);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 3:
                mayaRegistrationUserFragment.f12821l0 = bool.booleanValue();
                String string4 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_last_name));
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                mayaRegistrationUserFragment.f12824p0 = string4;
                M2.b.Q(mayaInputLayout, string4);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 4:
                mayaRegistrationUserFragment.f12821l0 = bool.booleanValue();
                String string5 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_maximum_character_limit);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                mayaRegistrationUserFragment.f12824p0 = string5;
                M2.b.Q(mayaInputLayout, string5);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 5:
                bool.booleanValue();
                AbstractC0983W.E(mayaInputLayout);
                MayaInputLayout mayaInputLayout3 = mayaRegistrationUserFragment.f12809Z;
                if (mayaInputLayout3 != null) {
                    mayaRegistrationUserFragment.M1(mayaInputLayout3.getLabel().toString(), mayaRegistrationUserFragment.f12822n0, mayaRegistrationUserFragment.f12819j0);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mMayaInputLayoutFirstName");
                throw null;
            case 6:
                mayaRegistrationUserFragment.f12821l0 = bool.booleanValue();
                String string6 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_last_name));
                kotlin.jvm.internal.j.f(string6, "getString(...)");
                mayaRegistrationUserFragment.f12824p0 = string6;
                M2.b.Q(mayaInputLayout, string6);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 7:
                mayaRegistrationUserFragment.f12819j0 = bool.booleanValue();
                String string7 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_three_or_more_character_repetition);
                kotlin.jvm.internal.j.f(string7, "getString(...)");
                mayaRegistrationUserFragment.f12822n0 = string7;
                M2.b.Q(mayaInputLayout, string7);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 8:
                mayaRegistrationUserFragment.f12819j0 = bool.booleanValue();
                String string8 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_first_name));
                kotlin.jvm.internal.j.f(string8, "getString(...)");
                mayaRegistrationUserFragment.f12822n0 = string8;
                M2.b.Q(mayaInputLayout, string8);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 9:
                mayaRegistrationUserFragment.f12819j0 = bool.booleanValue();
                String string9 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_maximum_character_limit);
                kotlin.jvm.internal.j.f(string9, "getString(...)");
                mayaRegistrationUserFragment.f12822n0 = string9;
                M2.b.Q(mayaInputLayout, string9);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 10:
                mayaRegistrationUserFragment.f12819j0 = bool.booleanValue();
                String string10 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_first_name));
                kotlin.jvm.internal.j.f(string10, "getString(...)");
                mayaRegistrationUserFragment.f12822n0 = string10;
                M2.b.Q(mayaInputLayout, string10);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 11:
                bool.getClass();
                Editable text2 = mayaInputLayout.getInputEditText().getText();
                string = text2 != null ? text2.toString() : null;
                if (string == null || C2576A.H(string)) {
                    String string11 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_registration_user_middle_name));
                    kotlin.jvm.internal.j.f(string11, "getString(...)");
                    M2.b.Q(mayaInputLayout, string11);
                }
                return Unit.f18162a;
            case 12:
                bool.booleanValue();
                AbstractC0983W.E(mayaInputLayout);
                MayaInputLayout mayaInputLayout4 = mayaRegistrationUserFragment.f12810a0;
                if (mayaInputLayout4 != null) {
                    mayaRegistrationUserFragment.M1(mayaInputLayout4.getLabel().toString(), mayaRegistrationUserFragment.f12823o0, mayaRegistrationUserFragment.f12820k0);
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n("mMayaInputLayoutMiddleName");
                throw null;
            case 13:
                bool.getClass();
                Editable text3 = mayaInputLayout.getInputEditText().getText();
                string = text3 != null ? text3.toString() : null;
                if (string == null || C2576A.H(string)) {
                    String string12 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_first_name));
                    kotlin.jvm.internal.j.f(string12, "getString(...)");
                    M2.b.Q(mayaInputLayout, string12);
                }
                return Unit.f18162a;
            case 14:
                mayaRegistrationUserFragment.f12820k0 = bool.booleanValue();
                String string13 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_three_or_more_character_repetition);
                kotlin.jvm.internal.j.f(string13, "getString(...)");
                mayaRegistrationUserFragment.f12823o0 = string13;
                M2.b.Q(mayaInputLayout, string13);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 15:
                mayaRegistrationUserFragment.f12820k0 = bool.booleanValue();
                AppCompatCheckBox appCompatCheckBox = mayaRegistrationUserFragment.f12815f0;
                if (appCompatCheckBox == null) {
                    kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                    throw null;
                }
                appCompatCheckBox.setVisibility(0);
                String string14 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_registration_user_middle_name));
                kotlin.jvm.internal.j.f(string14, "getString(...)");
                mayaRegistrationUserFragment.f12823o0 = string14;
                M2.b.Q(mayaInputLayout, string14);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            case 16:
                mayaRegistrationUserFragment.f12820k0 = bool.booleanValue();
                String string15 = mayaRegistrationUserFragment.getString(R.string.maya_format_error_maximum_character_limit);
                kotlin.jvm.internal.j.f(string15, "getString(...)");
                mayaRegistrationUserFragment.f12823o0 = string15;
                M2.b.Q(mayaInputLayout, string15);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
            default:
                mayaRegistrationUserFragment.f12820k0 = bool.booleanValue();
                AppCompatCheckBox appCompatCheckBox2 = mayaRegistrationUserFragment.f12815f0;
                if (appCompatCheckBox2 == null) {
                    kotlin.jvm.internal.j.n("mLegalMiddleNameCheckbox");
                    throw null;
                }
                appCompatCheckBox2.setVisibility(0);
                String string16 = mayaRegistrationUserFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationUserFragment.getString(R.string.maya_label_registration_user_middle_name));
                kotlin.jvm.internal.j.f(string16, "getString(...)");
                mayaRegistrationUserFragment.f12823o0 = string16;
                M2.b.Q(mayaInputLayout, string16);
                ((Z8.g) mayaRegistrationUserFragment.L1()).m();
                return Unit.f18162a;
        }
    }

    public /* synthetic */ p(MayaRegistrationUserFragment mayaRegistrationUserFragment, MayaInputLayout mayaInputLayout, int i) {
        this.f16957a = i;
        this.c = mayaRegistrationUserFragment;
        this.f16958b = mayaInputLayout;
    }
}
