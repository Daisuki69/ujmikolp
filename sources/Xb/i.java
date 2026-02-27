package Xb;

import android.os.Bundle;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.OrderV2;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6572b;
    public final /* synthetic */ PaymentConfirmationSummary c;

    public /* synthetic */ i(o oVar, PaymentConfirmationSummary paymentConfirmationSummary, int i) {
        this.f6571a = i;
        this.f6572b = oVar;
        this.c = paymentConfirmationSummary;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6571a) {
            case 0:
                OrderV2 orderV2 = (OrderV2) obj;
                kotlin.jvm.internal.j.g(orderV2, "orderV2");
                o oVar = this.f6572b;
                PaymentConfirmationSummary paymentConfirmationSummary = this.c;
                oVar.getClass();
                kotlin.jvm.internal.j.g(paymentConfirmationSummary, "paymentConfirmationSummary");
                ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).w1();
                String paymentId = orderV2.getPaymentId();
                if (paymentId != null) {
                    bc.e eVar = (bc.e) oVar.c.get();
                    String orderId = orderV2.getId();
                    MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) eVar;
                    mayaShopPaymentFragment.getClass();
                    kotlin.jvm.internal.j.g(orderId, "orderId");
                    cc.m mVar = mayaShopPaymentFragment.f14036s0;
                    if (mVar != null) {
                        MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) mVar;
                        mayaShopV2Activity.f13995w = paymentConfirmationSummary;
                        mayaShopV2Activity.f13994v = orderId;
                    }
                    MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                    mayaShopPaymentFragment2.getClass();
                    cc.m mVar2 = mayaShopPaymentFragment2.f14036s0;
                    if (mVar2 != null) {
                        ((MayaShopV2Activity) mVar2).d2(paymentId);
                    }
                }
                break;
            default:
                Order order = (Order) obj;
                kotlin.jvm.internal.j.g(order, "order");
                o oVar2 = this.f6572b;
                PaymentConfirmationSummary paymentConfirmationSummary2 = this.c;
                ((MayaShopPaymentFragment) ((bc.e) oVar2.c.get())).w1();
                MayaShopPaymentFragment mayaShopPaymentFragment3 = (MayaShopPaymentFragment) ((bc.e) oVar2.c.get());
                mayaShopPaymentFragment3.getClass();
                cc.m mVar3 = mayaShopPaymentFragment3.f14036s0;
                if (mVar3 != null) {
                    MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) mVar3;
                    com.paymaya.common.utility.C.Q(mayaShopV2Activity2, mayaShopV2Activity2.getCurrentFocus());
                    MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = new MayaShopPaymentConfirmationFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("payment_confirmation_summary", paymentConfirmationSummary2);
                    bundle.putParcelable("purchase_order", order);
                    mayaShopPaymentConfirmationFragment.setArguments(bundle);
                    if (!mayaShopV2Activity2.getSupportFragmentManager().isStateSaved()) {
                        mayaShopV2Activity2.getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_fragment_container, mayaShopPaymentConfirmationFragment, AbstractC1236z.d(mayaShopV2Activity2, MayaShopPaymentConfirmationFragment.class)).addToBackStack(AbstractC1236z.d(mayaShopV2Activity2, MayaShopPaymentConfirmationFragment.class)).commit();
                    }
                }
                break;
        }
    }
}
