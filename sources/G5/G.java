package G5;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatEditText f1723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1724b;

    public G(AppCompatEditText editText, zj.o oVar) {
        kotlin.jvm.internal.j.g(editText, "editText");
        this.f1723a = editText;
        editText.setFilters(new E[]{new E(oVar, 0)});
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strValueOf = String.valueOf(editable);
        if (strValueOf.length() != 0) {
            strValueOf = zj.z.h(strValueOf);
        }
        AppCompatEditText appCompatEditText = this.f1723a;
        if (kotlin.jvm.internal.j.b(strValueOf, appCompatEditText.getText().toString())) {
            return;
        }
        appCompatEditText.addTextChangedListener(new F(this, 0));
        appCompatEditText.setText(strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        this.f1724b = i + i6;
    }
}
