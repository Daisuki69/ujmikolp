package Va;

import C7.g;
import G5.ViewOnFocusChangeListenerC0253c;
import android.view.View;
import com.paymaya.R;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import sc.C2251b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final void a(MayaDropDown mayaDropDown, ValidationResult result) {
        j.g(mayaDropDown, "<this>");
        j.g(result, "result");
        if (result instanceof ValidationResult.Success) {
            mayaDropDown.setLastValidationResult(new Pair<>(Boolean.TRUE, ""));
            mayaDropDown.b();
            return;
        }
        if (result instanceof ValidationResult.RequiredFieldError) {
            String message = ((ValidationResult.RequiredFieldError) result).getMessage();
            if (message == null) {
                message = mayaDropDown.getContext().getString(R.string.maya_label_error_required_field, mayaDropDown.getLabel().toString());
                j.f(message, "getString(...)");
            }
            mayaDropDown.setLastValidationResult(new Pair<>(Boolean.FALSE, message));
            c(mayaDropDown, message);
            return;
        }
        if (!(result instanceof ValidationResult.RegExError)) {
            if (result instanceof ValidationResult.DuplicationError) {
                String message2 = ((ValidationResult.DuplicationError) result).getMessage();
                if (message2 == null) {
                    message2 = mayaDropDown.getContext().getString(R.string.maya_label_error_three_consecutive_characters);
                    j.f(message2, "getString(...)");
                }
                mayaDropDown.setLastValidationResult(new Pair<>(Boolean.FALSE, message2));
                c(mayaDropDown, message2);
                return;
            }
            return;
        }
        ValidationResult.RegExError regExError = (ValidationResult.RegExError) result;
        FieldType fieldType = regExError.getFieldType();
        String string = j.b(fieldType, FieldType.MobileNumber.INSTANCE) ? mayaDropDown.getContext().getString(R.string.maya_label_error_invalid_mobile_number) : j.b(fieldType, FieldType.EmailAddress.INSTANCE) ? mayaDropDown.getContext().getString(R.string.maya_label_error_invalid_email) : mayaDropDown.getContext().getString(R.string.maya_label_error_invalid_name);
        j.d(string);
        Boolean bool = Boolean.FALSE;
        String message3 = regExError.getMessage();
        if (message3 == null) {
            message3 = string;
        }
        mayaDropDown.setLastValidationResult(new Pair<>(bool, message3));
        String message4 = regExError.getMessage();
        if (message4 != null) {
            string = message4;
        }
        c(mayaDropDown, string);
    }

    public static final void b(MayaProfileInputLayout mayaProfileInputLayout, ValidationResult result, Function0 function0) {
        j.g(mayaProfileInputLayout, "<this>");
        j.g(result, "result");
        if (result instanceof ValidationResult.Success) {
            mayaProfileInputLayout.setLastValidationResult(new Pair<>(Boolean.TRUE, ""));
            mayaProfileInputLayout.f();
            return;
        }
        if (result instanceof ValidationResult.RequiredFieldError) {
            String message = ((ValidationResult.RequiredFieldError) result).getMessage();
            if (message == null) {
                message = mayaProfileInputLayout.getContext().getString(R.string.maya_label_error_required_field, mayaProfileInputLayout.getLabel().toString());
                j.f(message, "getString(...)");
            }
            mayaProfileInputLayout.setLastValidationResult(new Pair<>(Boolean.FALSE, message));
            d(mayaProfileInputLayout, message);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (result instanceof ValidationResult.RegExError) {
            ValidationResult.RegExError regExError = (ValidationResult.RegExError) result;
            FieldType fieldType = regExError.getFieldType();
            String string = j.b(fieldType, FieldType.MobileNumber.INSTANCE) ? mayaProfileInputLayout.getContext().getString(R.string.maya_label_error_invalid_mobile_number) : j.b(fieldType, FieldType.EmailAddress.INSTANCE) ? mayaProfileInputLayout.getContext().getString(R.string.maya_label_error_invalid_email) : mayaProfileInputLayout.getContext().getString(R.string.maya_label_error_invalid_name);
            j.d(string);
            Boolean bool = Boolean.FALSE;
            String message2 = regExError.getMessage();
            if (message2 == null) {
                message2 = string;
            }
            mayaProfileInputLayout.setLastValidationResult(new Pair<>(bool, message2));
            String message3 = regExError.getMessage();
            if (message3 != null) {
                string = message3;
            }
            d(mayaProfileInputLayout, string);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (result instanceof ValidationResult.DuplicationError) {
            String message4 = ((ValidationResult.DuplicationError) result).getMessage();
            if (message4 == null) {
                message4 = mayaProfileInputLayout.getContext().getString(R.string.maya_label_error_three_consecutive_characters);
                j.f(message4, "getString(...)");
            }
            mayaProfileInputLayout.setLastValidationResult(new Pair<>(Boolean.FALSE, message4));
            d(mayaProfileInputLayout, message4);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (!(result instanceof ValidationResult.DuplicateContactNumberError)) {
            throw new NoWhenBranchMatchedException();
        }
        ValidationResult.DuplicateContactNumberError duplicateContactNumberError = (ValidationResult.DuplicateContactNumberError) result;
        String message5 = duplicateContactNumberError.getMessage();
        if (message5 == null) {
            message5 = mayaProfileInputLayout.getContext().getString(R.string.maya_update_profile_duplicate_contact_error, duplicateContactNumberError.getFieldType().getFieldName());
            j.f(message5, "getString(...)");
        }
        mayaProfileInputLayout.setLastValidationResult(new Pair<>(Boolean.FALSE, message5));
        d(mayaProfileInputLayout, message5);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void c(MayaDropDown mayaDropDown, String str) {
        j.g(mayaDropDown, "<this>");
        mayaDropDown.setHelperErrorText(str);
        mayaDropDown.f12042k = true;
        mayaDropDown.d();
    }

    public static final void d(MayaProfileInputLayout mayaProfileInputLayout, String str) {
        j.g(mayaProfileInputLayout, "<this>");
        mayaProfileInputLayout.setHelperErrorText(str);
        mayaProfileInputLayout.p();
    }

    public static void e(final MayaProfileInputLayout mayaProfileInputLayout, final FieldType type, final Function2 function2, Function1 function1, Function1 function12, Function0 function0, int i) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        final Function1 function13 = (i & 8) != 0 ? null : function12;
        if ((i & 16) != 0) {
            function0 = null;
        }
        j.g(mayaProfileInputLayout, "<this>");
        j.g(type, "type");
        mayaProfileInputLayout.setTag(type);
        mayaProfileInputLayout.getInputEditText().addTextChangedListener(new d(function1, mayaProfileInputLayout, function2, type, function0));
        if (function13 != null) {
            final Function0 function02 = function0;
            mayaProfileInputLayout.setOnMayaProfileInputFocusChangeListener(new Function2() { // from class: Va.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Boolean bool = (Boolean) obj2;
                    boolean zBooleanValue = bool.booleanValue();
                    j.g((View) obj, "<unused var>");
                    if (zBooleanValue) {
                        MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                        f.b(mayaProfileInputLayout2, (ValidationResult) function2.invoke(type, jk.b.p(mayaProfileInputLayout2)), new O7.a(1, function02));
                    }
                    function13.invoke(bool);
                    return Unit.f18162a;
                }
            });
        }
    }

    public static final void f(final MayaDropDown mayaDropDown, FieldType type, final Function1 function1, Function2 function2, final Function1 function12) {
        j.g(type, "type");
        mayaDropDown.setTag(type);
        ViewOnFocusChangeListenerC0253c viewOnFocusChangeListenerC0253c = new ViewOnFocusChangeListenerC0253c(function12, 2);
        mayaDropDown.setOnSelectionChangeListener(new g(5, mayaDropDown, function2, type));
        final int i = 0;
        Ke.b.b(mayaDropDown.getDisplayText(), new Function0(function1, mayaDropDown, function12, i) { // from class: Va.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f6089b;
            public final /* synthetic */ MayaDropDown c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f6090d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f6088a = i;
                this.f6089b = (i) function1;
                this.c = mayaDropDown;
                this.f6090d = function12;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (this.f6088a) {
                    case 0:
                        MayaDropDown mayaDropDown2 = this.c;
                        this.f6089b.invoke(mayaDropDown2.getSelectedData());
                        Function1 function13 = this.f6090d;
                        if (function13 != null) {
                            function13.invoke(Boolean.TRUE);
                        }
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        MayaDropDown mayaDropDown3 = this.c;
                        this.f6089b.invoke(mayaDropDown3.getSelectedData());
                        Function1 function14 = this.f6090d;
                        if (function14 != null) {
                            function14.invoke(Boolean.TRUE);
                        }
                        mayaDropDown3.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
        final int i4 = 1;
        Ke.b.b(mayaDropDown.getLayoutContainer(), new Function0(function1, mayaDropDown, function12, i4) { // from class: Va.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f6088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f6089b;
            public final /* synthetic */ MayaDropDown c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function1 f6090d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f6088a = i4;
                this.f6089b = (i) function1;
                this.c = mayaDropDown;
                this.f6090d = function12;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (this.f6088a) {
                    case 0:
                        MayaDropDown mayaDropDown2 = this.c;
                        this.f6089b.invoke(mayaDropDown2.getSelectedData());
                        Function1 function13 = this.f6090d;
                        if (function13 != null) {
                            function13.invoke(Boolean.TRUE);
                        }
                        mayaDropDown2.requestFocus();
                        break;
                    default:
                        MayaDropDown mayaDropDown3 = this.c;
                        this.f6089b.invoke(mayaDropDown3.getSelectedData());
                        Function1 function14 = this.f6090d;
                        if (function14 != null) {
                            function14.invoke(Boolean.TRUE);
                        }
                        mayaDropDown3.requestFocus();
                        break;
                }
                return Unit.f18162a;
            }
        });
        mayaDropDown.setOnFocusChangeListener(viewOnFocusChangeListenerC0253c);
        mayaDropDown.getDisplayText().setOnFocusChangeListener(viewOnFocusChangeListenerC0253c);
        mayaDropDown.getLayoutContainer().setOnFocusChangeListener(viewOnFocusChangeListenerC0253c);
    }

    public static final void g(final FieldType type, final MayaProfileInputLayout mayaProfileInputLayout, final Function0 function0, final Function1 function1, final Function1 function12, final Function2 function2) {
        j.g(type, "type");
        mayaProfileInputLayout.setTag(type);
        mayaProfileInputLayout.getInputEditText().addTextChangedListener(new d(type, function2, function1, mayaProfileInputLayout, function0));
        mayaProfileInputLayout.setOnMayaProfileInputFocusChangeListener(new Function2() { // from class: Va.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                j.g((View) obj, "<unused var>");
                if (zBooleanValue) {
                    MayaProfileInputLayout mayaProfileInputLayout2 = mayaProfileInputLayout;
                    String strP = jk.b.p(mayaProfileInputLayout2);
                    Function2 function22 = function2;
                    Function1 function13 = function1;
                    Function0 function02 = function0;
                    FieldType fieldType = type;
                    ValidationResult validationResult = (ValidationResult) function22.invoke(fieldType, C2251b.b(fieldType, strP));
                    function13.invoke(Boolean.valueOf(validationResult instanceof ValidationResult.Success));
                    f.b(mayaProfileInputLayout2, validationResult, new O7.a(2, function02));
                }
                function12.invoke(bool);
                return Unit.f18162a;
            }
        });
    }
}
