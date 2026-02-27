package l9;

import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p9.InterfaceC2024i;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: renamed from: l9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1811i implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1812j f18269b;
    public final /* synthetic */ QRPHMerchantPaymentTransaction c;

    public /* synthetic */ C1811i(C1812j c1812j, QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction, int i) {
        this.f18268a = i;
        this.f18269b = c1812j;
        this.c = qRPHMerchantPaymentTransaction;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18268a) {
            case 0:
                MFAChallengeInformation it = (MFAChallengeInformation) obj;
                kotlin.jvm.internal.j.g(it, "it");
                o9.f fVar = (o9.f) this.f18269b.c.get();
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = this.c;
                InterfaceC2024i interfaceC2024i = ((MayaQRPHDynamicMerchantConfirmationFragment) fVar).f12892Z;
                if (interfaceC2024i != null) {
                    ((MayaQRPHMerchantActivity) interfaceC2024i).c2(qRPHMerchantPaymentTransaction);
                }
                break;
            default:
                C1812j c1812j = this.f18269b;
                PayMayaError payMayaErrorF = c1812j.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction2 = this.c;
                ((MayaBaseFragment) ((o9.f) c1812j.c.get())).w1();
                if (!payMayaErrorF.isSessionTimeout()) {
                    s sVar = (o9.f) c1812j.c.get();
                    C1219h c1219hH = AbstractC2329d.h(12);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                    if (payMayaErrorF.mErrorCode() != -317) {
                        MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment = (MayaQRPHDynamicMerchantConfirmationFragment) ((o9.f) c1812j.c.get());
                        InterfaceC2024i interfaceC2024i2 = mayaQRPHDynamicMerchantConfirmationFragment.f12892Z;
                        if (interfaceC2024i2 != null) {
                            ((MayaQRPHMerchantActivity) interfaceC2024i2).a(payMayaErrorF, mayaQRPHDynamicMerchantConfirmationFragment.getString(R.string.pma_toast_error_title_merchant_payment_error));
                        }
                    } else {
                        InterfaceC2024i interfaceC2024i3 = ((MayaQRPHDynamicMerchantConfirmationFragment) ((o9.f) c1812j.c.get())).f12892Z;
                        if (interfaceC2024i3 != null) {
                            ((MayaQRPHMerchantActivity) interfaceC2024i3).c2(qRPHMerchantPaymentTransaction2);
                        }
                    }
                }
                break;
        }
    }
}
