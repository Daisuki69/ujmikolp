package G5;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f1751b;
    public k c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1752d = false;

    public l(TextInputLayout textInputLayout) {
        this.f1750a = textInputLayout;
    }

    public static void a(TextInputLayout textInputLayout) {
        textInputLayout.setHintEnabled(true);
        textInputLayout.setHintAnimationEnabled(true);
        textInputLayout.setErrorEnabled(false);
        textInputLayout.setPadding(textInputLayout.getPaddingLeft(), textInputLayout.getResources().getDimensionPixelSize(R.dimen.pma_padding_0dp), textInputLayout.getPaddingRight(), textInputLayout.getPaddingBottom());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        if (com.paymaya.common.utility.C.e(charSequence.toString())) {
            this.f1752d = false;
            k kVar = this.c;
            boolean z4 = kVar != null && kVar.a();
            if (com.paymaya.common.utility.C.e(this.f1751b) || !z4) {
                return;
            }
            this.f1751b.c();
            return;
        }
        if (this.f1752d) {
            return;
        }
        this.f1752d = true;
        TextInputLayout textInputLayout = this.f1750a;
        if (!com.paymaya.common.utility.C.e(textInputLayout)) {
            a(textInputLayout);
        } else {
            if (!com.paymaya.common.utility.C.e(null) || !com.paymaya.common.utility.C.e(null) || !com.paymaya.common.utility.C.e(null)) {
                throw null;
            }
            if (!com.paymaya.common.utility.C.e(null) && !com.paymaya.common.utility.C.e(null)) {
                throw null;
            }
        }
        if (!com.paymaya.common.utility.C.e(null)) {
            throw null;
        }
    }
}
