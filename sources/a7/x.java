package A7;

import N5.A1;
import N5.G0;
import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f246b;

    public /* synthetic */ x(A a8, int i) {
        this.f245a = i;
        this.f246b = a8;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f245a) {
            case 0:
                List it = (List) obj;
                kotlin.jvm.internal.j.g(it, "it");
                A a8 = this.f246b;
                a8.getClass();
                A1 a12 = ((MayaWalletFragment) ((F7.s) a8.c.get())).f12234Y0;
                if (a12 == null) {
                    kotlin.jvm.internal.j.n("mActionCardShimmer");
                    throw null;
                }
                a12.f3548b.setVisibility(8);
                if (it.isEmpty()) {
                    ((MayaWalletFragment) ((F7.s) a8.c.get())).Q1();
                    return;
                }
                return;
            case 1:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, "accountBalance");
                A a10 = this.f246b;
                a10.getClass();
                G0 g02 = ((MayaWalletFragment) ((F7.s) a10.c.get())).f12257z0;
                if (g02 == null) {
                    kotlin.jvm.internal.j.n("mViewLoadingBalanceV2");
                    throw null;
                }
                g02.f3627b.setVisibility(8);
                a10.n();
                accountBalance.mAvailableBalance().mCurrency();
                String formattedValue = accountBalance.mAvailableBalance().getFormattedValue();
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a10.c.get());
                TextView textView = mayaWalletFragment.t0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewCurrency");
                    throw null;
                }
                textView.setText(mayaWalletFragment.getString(R.string.pma_label_peso));
                TextView textView2 = mayaWalletFragment.u0;
                if (textView2 != null) {
                    textView2.setText(formattedValue);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mTextViewBalance");
                    throw null;
                }
            default:
                A a11 = this.f246b;
                PayMayaError payMayaErrorF = a11.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                a11.q(payMayaErrorF);
                return;
        }
    }
}
