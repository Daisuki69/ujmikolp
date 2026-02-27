package Va;

import android.text.Editable;
import android.text.TextWatcher;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import sc.C2251b;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6091a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FieldType f6092b;
    public final /* synthetic */ Function2 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f6093d;
    public final /* synthetic */ MayaProfileInputLayout e;
    public final /* synthetic */ Function0 f;

    public d(FieldType fieldType, Function2 function2, Function1 function1, MayaProfileInputLayout mayaProfileInputLayout, Function0 function0) {
        this.f6092b = fieldType;
        this.c = function2;
        this.f6093d = function1;
        this.e = mayaProfileInputLayout;
        this.f = function0;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i, int i4, int i6) {
    }

    private final void d(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.f6091a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        int i10 = this.f6091a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        switch (this.f6091a) {
            case 0:
                if (i4 != i6) {
                    Function1 function1 = this.f6093d;
                    if (function1 != null) {
                        String string = charSequence != null ? charSequence.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        function1.invoke(string);
                    }
                    f.b(this.e, (ValidationResult) this.c.invoke(this.f6092b, String.valueOf(charSequence)), new e(this.f));
                }
                break;
            default:
                if (i4 != i6) {
                    String string2 = charSequence != null ? charSequence.toString() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                    Function2 function2 = this.c;
                    Function1 function12 = this.f6093d;
                    MayaProfileInputLayout mayaProfileInputLayout = this.e;
                    Function0 function0 = this.f;
                    FieldType fieldType = this.f6092b;
                    ValidationResult validationResult = (ValidationResult) function2.invoke(fieldType, C2251b.b(fieldType, string2));
                    function12.invoke(Boolean.valueOf(validationResult instanceof ValidationResult.Success));
                    f.b(mayaProfileInputLayout, validationResult, new O7.a(2, function0));
                }
                break;
        }
    }

    public d(Function1 function1, MayaProfileInputLayout mayaProfileInputLayout, Function2 function2, FieldType fieldType, Function0 function0) {
        this.f6093d = function1;
        this.e = mayaProfileInputLayout;
        this.c = function2;
        this.f6092b = fieldType;
        this.f = function0;
    }
}
