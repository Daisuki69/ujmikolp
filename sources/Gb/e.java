package Gb;

import android.text.Editable;
import com.paymaya.R;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaSendMoneyFragment f1944b;

    public /* synthetic */ e(MayaSendMoneyFragment mayaSendMoneyFragment, int i) {
        this.f1943a = i;
        this.f1944b = mayaSendMoneyFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Editable text;
        switch (this.f1943a) {
            case 0:
                String string = this.f1944b.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                return string;
            case 1:
                MayaSendMoneyFragment mayaSendMoneyFragment = this.f1944b;
                MayaInputLayout mayaInputLayout = mayaSendMoneyFragment.f13784J0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                boolean z4 = mayaInputLayout.f12073w || (text = mayaInputLayout.getInputEditText().getText()) == null || text.length() == 0;
                MayaInputLayout mayaInputLayout2 = mayaSendMoneyFragment.f13784J0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutAmount");
                    throw null;
                }
                String strD = z4 ? Ke.d.d(mayaInputLayout2.getHelperErrorSpielTextView().getText().toString()) : null;
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                mayaSendMoneyFragment.V1("amount", strD, z4);
                return Unit.f18162a;
            case 2:
                Bb.n nVar = (Bb.n) this.f1944b.P1();
                ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).Z1();
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = ((MayaSendMoneyFragment) ((Fb.c) nVar.c.get())).f13782G0;
                if (mayaAutoCompleteInputLayout == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                    throw null;
                }
                mayaAutoCompleteInputLayout.getHelperErrorSpielTextView().setVisibility(0);
                nVar.A();
                return Unit.f18162a;
            default:
                Bb.n nVar2 = (Bb.n) this.f1944b.P1();
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout2 = ((MayaSendMoneyFragment) ((Fb.c) nVar2.c.get())).f13782G0;
                if (mayaAutoCompleteInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRecipient");
                    throw null;
                }
                mayaAutoCompleteInputLayout2.getHelperErrorSpielTextView().setVisibility(8);
                nVar2.A();
                return Unit.f18162a;
        }
    }
}
