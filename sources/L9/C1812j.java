package l9;

import We.s;
import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: l9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1812j extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18270d;
    public final C1268k0 e;
    public final C1278p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812j(C1268k0 c1268k0, C1278p0 c1278p0, Uh.d sessionSubject, int i) {
        super(sessionSubject);
        this.f18270d = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
                super(sessionSubject);
                this.e = c1268k0;
                this.f = c1278p0;
                break;
            default:
                kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
                this.e = c1268k0;
                this.f = c1278p0;
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        switch (this.f18270d) {
            case 0:
                super.j();
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = ((MayaQRPHDynamicMerchantConfirmationFragment) ((o9.f) this.c.get())).f12891Y;
                if (qRPHMerchantPaymentTransaction == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentTransaction");
                    throw null;
                }
                o9.f fVar = (o9.f) this.c.get();
                String name = qRPHMerchantPaymentTransaction.getMerchantDetails().getName();
                MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment = (MayaQRPHDynamicMerchantConfirmationFragment) fVar;
                mayaQRPHDynamicMerchantConfirmationFragment.getClass();
                kotlin.jvm.internal.j.g(name, "name");
                TextView textView = mayaQRPHDynamicMerchantConfirmationFragment.f12889W;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mMerchantInfo");
                    throw null;
                }
                textView.setText(name);
                o9.f fVar2 = (o9.f) this.c.get();
                String formattedValue = qRPHMerchantPaymentTransaction.getAmount().getFormattedValue();
                kotlin.jvm.internal.j.f(formattedValue, "getFormattedValue(...)");
                MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment2 = (MayaQRPHDynamicMerchantConfirmationFragment) fVar2;
                mayaQRPHDynamicMerchantConfirmationFragment2.getClass();
                String strI = s.i(mayaQRPHDynamicMerchantConfirmationFragment2.getString(R.string.maya_php_currency), C.v(formattedValue));
                TextView textView2 = mayaQRPHDynamicMerchantConfirmationFragment2.f12890X;
                if (textView2 != null) {
                    textView2.setText(strI);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mPriceLabel");
                    throw null;
                }
            default:
                super.j();
                QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction2 = ((MayaQRPHMerchantConfirmationFragment) ((o9.h) this.c.get())).f12905a0;
                if (qRPHMerchantPaymentTransaction2 == null) {
                    kotlin.jvm.internal.j.n("mQRPHMerchantPaymentTransaction");
                    throw null;
                }
                o9.h hVar = (o9.h) this.c.get();
                String name2 = qRPHMerchantPaymentTransaction2.getMerchantDetails().getName();
                MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment = (MayaQRPHMerchantConfirmationFragment) hVar;
                mayaQRPHMerchantConfirmationFragment.getClass();
                kotlin.jvm.internal.j.g(name2, "name");
                TextView textView3 = mayaQRPHMerchantConfirmationFragment.f12900V;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mMerchantInfo");
                    throw null;
                }
                textView3.setText(name2);
                o9.h hVar2 = (o9.h) this.c.get();
                String formattedValue2 = qRPHMerchantPaymentTransaction2.getAmount().getFormattedValue();
                kotlin.jvm.internal.j.f(formattedValue2, "getFormattedValue(...)");
                MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment2 = (MayaQRPHMerchantConfirmationFragment) hVar2;
                mayaQRPHMerchantConfirmationFragment2.getClass();
                String strI2 = s.i(mayaQRPHMerchantConfirmationFragment2.getString(R.string.maya_php_currency), C.v(formattedValue2));
                TextView textView4 = mayaQRPHMerchantConfirmationFragment2.f12901W;
                if (textView4 != null) {
                    textView4.setText(strI2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mPriceLabel");
                    throw null;
                }
        }
    }
}
