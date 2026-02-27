package we;

import com.paymaya.domain.model.FundSource;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import w5.InterfaceC2384b;

/* JADX INFO: renamed from: we.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2425n implements InterfaceC2384b, G5.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ShopV3PaymentFragment f20766a;

    @Override // G5.k
    public boolean a() {
        return this.f20766a.f14824n0;
    }

    @Override // w5.InterfaceC2384b
    public String b(Object obj) {
        ShopV3PaymentFragment shopV3PaymentFragment = this.f20766a;
        return ((se.f) shopV3PaymentFragment.G1()).k((FundSource) obj, shopV3PaymentFragment.f14819h0);
    }
}
