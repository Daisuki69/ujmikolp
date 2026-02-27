package cc;

import com.paymaya.R;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopPaymentFragment f9345b;

    public /* synthetic */ k(MayaShopPaymentFragment mayaShopPaymentFragment, int i) {
        this.f9344a = i;
        this.f9345b = mayaShopPaymentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaShopPaymentFragment mayaShopPaymentFragment = this.f9345b;
        switch (this.f9344a) {
            case 0:
                MayaInputLayout mayaInputLayoutQ1 = mayaShopPaymentFragment.Q1();
                String string = mayaShopPaymentFragment.getString(R.string.maya_label_account_number);
                kotlin.jvm.internal.j.f(string, numX49.tnTj78("btQm"));
                mayaInputLayoutQ1.requestFocus();
                mayaInputLayoutQ1.setHelperErrorText(mayaShopPaymentFragment.getString(R.string.maya_error_pay_bills_missing_field, string));
                mayaInputLayoutQ1.p();
                break;
            case 1:
                break;
            case 2:
                ProductV3 productV3 = mayaShopPaymentFragment.t0;
                if (productV3 != null) {
                    ((Xb.o) mayaShopPaymentFragment.Y1()).x(productV3);
                }
                break;
            case 3:
                mayaShopPaymentFragment.Q1().f();
                break;
            case 4:
                ProductV3 productV32 = mayaShopPaymentFragment.t0;
                if (productV32 != null) {
                    ((Xb.o) mayaShopPaymentFragment.Y1()).x(productV32);
                }
                break;
            default:
                ProductV3 productV33 = mayaShopPaymentFragment.t0;
                if (productV33 != null) {
                    ((Xb.o) mayaShopPaymentFragment.Y1()).x(productV33);
                }
                break;
        }
        return Unit.f18162a;
    }
}
