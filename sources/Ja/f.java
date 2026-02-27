package Ja;

import G5.A;
import G5.C0256f;
import android.text.Editable;
import android.text.InputFilter;
import androidx.appcompat.widget.AppCompatEditText;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaRequestMoneyFormFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2509a implements Ia.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2505d;

    public f(com.paymaya.data.preference.a mPreference) {
        j.g(mPreference, "mPreference");
        this.f2505d = mPreference;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment = (MayaRequestMoneyFormFragment) ((Ma.c) this.c.get());
        MayaInputLayout mayaInputLayout = mayaRequestMoneyFormFragment.f13614U;
        if (mayaInputLayout == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout.setHelperInfoText(mayaRequestMoneyFormFragment.getString(R.string.maya_label_maximum_amount, C.u(Double.valueOf(500000.0d))));
        MayaInputLayout mayaInputLayout2 = mayaRequestMoneyFormFragment.f13614U;
        if (mayaInputLayout2 == null) {
            j.n("mLayoutAmount");
            throw null;
        }
        mayaInputLayout2.setHelperErrorText(mayaRequestMoneyFormFragment.getString(R.string.maya_label_maximum_amount, C.u(Double.valueOf(500000.0d))));
        AppCompatEditText appCompatEditText = mayaRequestMoneyFormFragment.f13615V;
        if (appCompatEditText == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        C0256f c0256f = new C0256f(appCompatEditText, 0.01d, 500000.0d);
        String string = mayaRequestMoneyFormFragment.getString(R.string.pma_label_peso);
        j.f(string, "getString(...)");
        c0256f.f1741o = string;
        c0256f.f1740n = null;
        c0256f.m = mayaRequestMoneyFormFragment;
        mayaRequestMoneyFormFragment.f13624e0 = c0256f;
        AppCompatEditText appCompatEditText2 = mayaRequestMoneyFormFragment.f13615V;
        if (appCompatEditText2 == null) {
            j.n("mEditTextAmount");
            throw null;
        }
        appCompatEditText2.addTextChangedListener(c0256f);
        MayaRequestMoneyFormFragment mayaRequestMoneyFormFragment2 = (MayaRequestMoneyFormFragment) ((Ma.c) this.c.get());
        MayaInputLayout mayaInputLayout3 = mayaRequestMoneyFormFragment2.f13619Z;
        if (mayaInputLayout3 == null) {
            j.n("mLayoutMessage");
            throw null;
        }
        Ag.j jVar = new Ag.j(mayaRequestMoneyFormFragment2, 9);
        N9.f fVar = new N9.f(mayaRequestMoneyFormFragment2, 2);
        AppCompatEditText inputEditText = mayaInputLayout3.getInputEditText();
        A a8 = new A(3, mayaInputLayout3, jVar, inputEditText, fVar);
        B b8 = new B(0);
        b8.f18173a.add(new InputFilter.LengthFilter(25));
        b8.a(C.G());
        ArrayList arrayList = b8.f18173a;
        inputEditText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
        inputEditText.addTextChangedListener(a8);
        Editable text = inputEditText.getText();
        jVar.invoke(mayaInputLayout3, Integer.valueOf(25 - (text != null ? text.length() : 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ja.f.k():void");
    }
}
