package G5;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.jvm.functions.Function0;
import zj.C2576A;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f1754b;
    public TextInputLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MayaInputLayout f1755d;
    public Function0 e;
    public Function0 f;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s9) {
        kotlin.jvm.internal.j.g(s9, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s9, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(s9, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s9, int i, int i4, int i6) {
        kotlin.jvm.internal.j.g(s9, "s");
        if (C2576A.H(s9.toString())) {
            this.f1753a = false;
            boolean zBooleanValue = ((Boolean) this.f.invoke()).booleanValue();
            Function0 function0 = this.e;
            if (zBooleanValue) {
                function0.invoke();
                return;
            }
            return;
        }
        if (this.f1753a) {
            return;
        }
        this.f1753a = true;
        MayaInputLayout mayaInputLayout = this.f1755d;
        if (mayaInputLayout != null) {
            mayaInputLayout.f();
        } else {
            TextInputLayout textInputLayout = this.c;
            if (textInputLayout != null) {
                textInputLayout.setHintEnabled(true);
                textInputLayout.setHintAnimationEnabled(true);
                textInputLayout.setErrorEnabled(false);
                textInputLayout.setPadding(textInputLayout.getPaddingLeft(), textInputLayout.getResources().getDimensionPixelSize(R.dimen.pma_padding_0dp), textInputLayout.getPaddingRight(), textInputLayout.getPaddingBottom());
            }
        }
        Function0 function02 = this.f1754b;
        if (function02 != null) {
            function02.invoke();
        }
    }
}
