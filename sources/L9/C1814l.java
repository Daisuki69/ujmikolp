package l9;

import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p9.InterfaceC2026k;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: renamed from: l9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1814l implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1812j f18274b;
    public final /* synthetic */ QRPHMerchantPaymentTransaction c;

    public /* synthetic */ C1814l(C1812j c1812j, QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction, int i) {
        this.f18273a = i;
        this.f18274b = c1812j;
        this.c = qRPHMerchantPaymentTransaction;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18273a) {
            case 0:
                MFAChallengeInformation it = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(it, "it");
                o9.h hVar = (o9.h) this.f18274b.c.get();
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = this.c;
                InterfaceC2026k interfaceC2026k = ((MayaQRPHMerchantConfirmationFragment) hVar).f12904Z;
                if (interfaceC2026k != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2026k).c2(qRPHMerchantPaymentTransaction);
                }
                break;
            default:
                C1812j c1812j = this.f18274b;
                PayMayaError payMayaErrorF = c1812j.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction2 = this.c;
                ((MayaBaseFragment) ((o9.h) c1812j.c.get())).w1();
                if (!payMayaErrorF.isSessionTimeout()) {
                    s sVar = (o9.h) c1812j.c.get();
                    C1219h c1219hH = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                    if (payMayaErrorF.mErrorCode() != -317) {
                        MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment = (MayaQRPHMerchantConfirmationFragment) ((o9.h) c1812j.c.get());
                        InterfaceC2026k interfaceC2026k2 = mayaQRPHMerchantConfirmationFragment.f12904Z;
                        if (interfaceC2026k2 != null) {
                            ((MayaQRPHMerchantActivity) interfaceC2026k2).a(payMayaErrorF, mayaQRPHMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
                        }
                    } else {
                        InterfaceC2026k interfaceC2026k3 = ((MayaQRPHMerchantConfirmationFragment) ((o9.h) c1812j.c.get())).f12904Z;
                        if (interfaceC2026k3 != null) {
                            ((MayaQRPHMerchantActivity) interfaceC2026k3).c2(qRPHMerchantPaymentTransaction2);
                        }
                    }
                }
                break;
        }
    }
}
