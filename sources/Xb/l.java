package Xb;

import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6578b;

    public /* synthetic */ l(o oVar, int i) {
        this.f6577a = i;
        this.f6578b = oVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6577a) {
            case 0:
                ProductV3 product = (ProductV3) obj;
                kotlin.jvm.internal.j.g(product, "product");
                this.f6578b.w(product);
                break;
            default:
                AccountBalance accountBalance = (AccountBalance) obj;
                kotlin.jvm.internal.j.g(accountBalance, "accountBalance");
                o oVar = this.f6578b;
                oVar.getClass();
                MayaShopPaymentFragment mayaShopPaymentFragment = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                mayaShopPaymentFragment.getClass();
                mayaShopPaymentFragment.f14037v0 = accountBalance;
                List listA = oVar.f6585g.a();
                kotlin.jvm.internal.j.f(listA, "getFundSources(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA) {
                    if (kotlin.jvm.internal.j.b(((FundSource) obj2).mTransactionEnabled(), Boolean.TRUE)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty() || oVar.f6584d.e().isMayaShopWithCheckoutFlowEnabled()) {
                    ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).T1().setVisibility(8);
                } else {
                    ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(oVar.k((FundSource) it.next(), ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).f14037v0));
                    }
                    MayaShopPaymentFragment mayaShopPaymentFragment2 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                    mayaShopPaymentFragment2.getClass();
                    mayaShopPaymentFragment2.f14039z0 = arrayList2;
                    ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).T1().setVisibility(0);
                }
                for (FundSource fundSource : oVar.f6585g.a()) {
                    if (fundSource.isTypeVirtual()) {
                        String fundSourceText = oVar.k(fundSource, accountBalance);
                        MayaShopPaymentFragment mayaShopPaymentFragment3 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                        mayaShopPaymentFragment3.getClass();
                        mayaShopPaymentFragment3.y0 = fundSource;
                        MayaShopPaymentFragment mayaShopPaymentFragment4 = (MayaShopPaymentFragment) ((bc.e) oVar.c.get());
                        mayaShopPaymentFragment4.getClass();
                        kotlin.jvm.internal.j.g(fundSourceText, "fundSourceText");
                        mayaShopPaymentFragment4.T1().getInputEditText().setText(fundSourceText);
                        break;
                    }
                }
                break;
        }
    }
}
