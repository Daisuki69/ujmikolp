package ba;

import G5.C0256f;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import com.paymaya.R;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import dOYHB6.tiZVw8.numX49;
import e2.C1421c;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f8602b;

    public /* synthetic */ r(s sVar, int i) {
        this.f8601a = i;
        this.f8602b = sVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8601a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucLL"));
                s sVar = this.f8602b;
                PayMayaError payMayaErrorF = sVar.f(th2, true);
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("bucLr"));
                sVar.u(iMErrorCode, strMSpiel);
                sVar.z(payMayaErrorF);
                return;
            default:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, numX49.tnTj78("bucLP"));
                s sVar2 = this.f8602b;
                sVar2.getClass();
                Amount amountMAvailableBalance = accountBalance.mAvailableBalance();
                ga.c cVar = (ga.c) sVar2.c.get();
                double dDoubleValue = com.paymaya.common.utility.C.q0(amountMAvailableBalance.mValue()).doubleValue();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) cVar;
                AppCompatEditText appCompatEditText = mayaPayBillsBIRFragment.t0;
                String strTnTj78 = numX49.tnTj78("bucLb");
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                appCompatEditText.removeTextChangedListener(mayaPayBillsBIRFragment.f13390K0);
                String string = mayaPayBillsBIRFragment.getString(R.string.maya_currency_symbol_with_amount_value, String.valueOf(dDoubleValue));
                String strTnTj782 = numX49.tnTj78("bucL2");
                kotlin.jvm.internal.j.f(string, strTnTj782);
                AppCompatEditText appCompatEditText2 = mayaPayBillsBIRFragment.t0;
                if (appCompatEditText2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                C0256f c0256f = new C0256f(appCompatEditText2, AudioStats.AUDIO_AMPLITUDE_NONE, dDoubleValue);
                String string2 = mayaPayBillsBIRFragment.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string2, strTnTj782);
                c0256f.f1741o = string2;
                c0256f.f1742p = 0;
                c0256f.m = new C1421c(9, mayaPayBillsBIRFragment, string);
                mayaPayBillsBIRFragment.f13390K0 = c0256f;
                AppCompatEditText appCompatEditText3 = mayaPayBillsBIRFragment.t0;
                if (appCompatEditText3 != null) {
                    appCompatEditText3.addTextChangedListener(c0256f);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
        }
    }
}
