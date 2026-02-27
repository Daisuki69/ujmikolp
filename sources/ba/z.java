package ba;

import G5.C0256f;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.video.AudioStats;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f8632b;

    public /* synthetic */ z(C c, int i) {
        this.f8631a = i;
        this.f8632b = c;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8631a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucZt"));
                C c = this.f8632b;
                PayMayaError payMayaErrorF = c.f(th2, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, numX49.tnTj78("bucZU"));
                c.A(payMayaErrorF);
                return;
            default:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, numX49.tnTj78("bucZH"));
                C c10 = this.f8632b;
                c10.getClass();
                Amount amountMAvailableBalance = accountBalance.mAvailableBalance();
                ga.e eVar = (ga.e) c10.c.get();
                double dDoubleValue = com.paymaya.common.utility.C.q0(amountMAvailableBalance.mValue()).doubleValue();
                MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) eVar;
                AppCompatEditText appCompatEditText = mayaPayBillsFormFragment.u0;
                String strTnTj78 = numX49.tnTj78("bucZO");
                if (appCompatEditText == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                appCompatEditText.removeTextChangedListener(mayaPayBillsFormFragment.f13418B0);
                AppCompatEditText appCompatEditText2 = mayaPayBillsFormFragment.u0;
                if (appCompatEditText2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                C0256f c0256f = new C0256f(appCompatEditText2, AudioStats.AUDIO_AMPLITUDE_NONE, dDoubleValue);
                String str = (String) mayaPayBillsFormFragment.f13420D0.getValue();
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bucZQ"));
                c0256f.f1741o = str;
                c0256f.f1742p = 0;
                mayaPayBillsFormFragment.f13418B0 = c0256f;
                AppCompatEditText appCompatEditText3 = mayaPayBillsFormFragment.u0;
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
