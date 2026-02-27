package G5;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import cj.C1132s;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements TextWatcher {
    public static final List c = C1132s.g(1, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1749b;

    public i(EditText mEditText) {
        kotlin.jvm.internal.j.g(mEditText, "mEditText");
        this.f1748a = mEditText;
        this.f1749b = "";
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (String.valueOf(editable).equals(this.f1749b)) {
            return;
        }
        if (kotlin.jvm.internal.j.b(((Object) editable) + "/", this.f1749b)) {
            return;
        }
        String strM = AbstractC1213b.M("[^0-9]*", String.valueOf(editable), "");
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int i4 = 0;
        while (i < strM.length()) {
            int i6 = i4 + 1;
            sb2.append(strM.charAt(i));
            if (c.contains(Integer.valueOf(i4))) {
                sb2.append("/");
            }
            i++;
            i4 = i6;
        }
        String string = sb2.toString();
        this.f1749b = string;
        EditText editText = this.f1748a;
        editText.setText(string);
        editText.setSelection(this.f1749b.length());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
    }
}
