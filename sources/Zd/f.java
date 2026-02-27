package Zd;

import G5.A;
import G5.C0256f;
import android.text.InputFilter;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2509a implements Yd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6929d;

    public f(com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.f6929d = mPreference;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 4;
        super.j();
        RequestMoneyFormFragment requestMoneyFormFragment = (RequestMoneyFormFragment) ((ce.e) this.c.get());
        TextInputLayout textInputLayout = requestMoneyFormFragment.f14698V;
        if (textInputLayout == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        textInputLayout.setHelperText(requestMoneyFormFragment.getString(R.string.pma_label_maximum_amount, C.u(Double.valueOf(500000.0d))));
        TextInputEditText textInputEditText = requestMoneyFormFragment.f14699W;
        if (textInputEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        C0256f c0256f = new C0256f(textInputEditText, 0.01d, 500000.0d);
        c0256f.m = new C1258f0(requestMoneyFormFragment, 4);
        requestMoneyFormFragment.f14707e0 = c0256f;
        TextInputEditText textInputEditText2 = requestMoneyFormFragment.f14699W;
        if (textInputEditText2 == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        textInputEditText2.addTextChangedListener(c0256f);
        RequestMoneyFormFragment requestMoneyFormFragment2 = (RequestMoneyFormFragment) ((ce.e) this.c.get());
        TextInputLayout textInputLayout2 = requestMoneyFormFragment2.f14703a0;
        if (textInputLayout2 == null) {
            j.n("mLayoutMessage");
            throw null;
        }
        Ag.j jVar = new Ag.j(requestMoneyFormFragment2, 19);
        com.squareup.wire.internal.a aVar = new com.squareup.wire.internal.a(requestMoneyFormFragment2, i);
        EditText editText = textInputLayout2.getEditText();
        if (editText == null) {
            return;
        }
        A a8 = new A(2, textInputLayout2, jVar, editText, aVar);
        B b8 = new B(0);
        b8.f18173a.add(new InputFilter.LengthFilter(25));
        b8.a(C.G());
        ArrayList arrayList = b8.f18173a;
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
        editText.addTextChangedListener(a8);
        jVar.invoke(textInputLayout2, Integer.valueOf(25 - editText.getText().length()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zd.f.k():void");
    }
}
