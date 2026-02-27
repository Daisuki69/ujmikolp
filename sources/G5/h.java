package G5;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes3.dex */
public class h implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1746b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1747d;
    public String e;

    public h(EditText editText) {
        this.f1745a = editText;
    }

    public void a() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.f1747d) {
            return;
        }
        this.f1747d = true;
        String strReplaceAll = editable.toString().replaceAll("\\s+", "");
        if (this.e.equals(Global.BLANK)) {
            strReplaceAll = strReplaceAll.substring(0, this.f1746b) + strReplaceAll.substring(this.f1746b + 1);
        }
        if (strReplaceAll.length() > 16) {
            strReplaceAll = strReplaceAll.substring(0, 16);
        }
        strReplaceAll.getClass();
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        int length = 0;
        while (i < strReplaceAll.length()) {
            sb2.append(strReplaceAll.charAt(i));
            i++;
            if (i % 4 == 0 && sb2.toString().length() < 19) {
                sb2.append(Global.BLANK);
            }
            if (i == this.f1746b) {
                length = sb2.toString().length();
            }
        }
        String string = sb2.toString();
        EditText editText = this.f1745a;
        editText.setText(string);
        editText.setSelection(Math.min(length, sb2.toString().length()));
        a();
        this.f1747d = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        if (this.f1747d) {
            return;
        }
        if (i6 != 0) {
            this.c = false;
            this.e = "";
        } else {
            this.c = true;
            String string = charSequence.subSequence(i, i4 + i).toString();
            this.e = string;
            this.f1746b = charSequence.subSequence(0, i - (string.equals(Global.BLANK) ? 1 : 0)).toString().replaceAll("\\s+", "").length();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        if (this.f1747d || this.c) {
            return;
        }
        this.f1746b = charSequence.subSequence(0, i + i6).toString().replaceAll("\\s+", "").length();
    }
}
