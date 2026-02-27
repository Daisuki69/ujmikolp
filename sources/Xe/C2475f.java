package xe;

import N5.G1;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import java.util.HashMap;
import oi.C1983a;
import we.InterfaceC2432u;

/* JADX INFO: renamed from: xe.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2475f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f20953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20954b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20955d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1983a f20956g;
    public final ShopV3ProviderProductsListFragment h;
    public ProductV3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2475f(G1 g1, ShopV3ProviderProductsListFragment listener) {
        super(g1.f3629b);
        kotlin.jvm.internal.j.g(listener, "listener");
        ConstraintLayout layoutContainerPmaViewShopV3ProductItem = g1.c;
        kotlin.jvm.internal.j.f(layoutContainerPmaViewShopV3ProductItem, "layoutContainerPmaViewShopV3ProductItem");
        this.f20953a = g1.e;
        this.f20954b = g1.f;
        this.c = g1.f3630d;
        this.f20955d = g1.f3631g;
        this.e = g1.h;
        this.f = g1.i;
        this.f20956g = new C1983a(this, 14);
        this.h = listener;
        layoutContainerPmaViewShopV3ProductItem.setOnClickListener(new qf.d(this, 18));
    }

    public static final void D(C2475f c2475f) {
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = c2475f.h;
        ProductV3 productV3 = c2475f.i;
        se.i iVar = (se.i) shopV3ProviderProductsListFragment.A1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (productV3 != null && productV3.isDisabled()) {
            ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment2 = (ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get());
            C1220i c1220i = shopV3ProviderProductsListFragment2.f10245B;
            FragmentActivity activity = shopV3ProviderProductsListFragment2.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode = productV3.getProductCode();
            HashMap map = c1219hD.j;
            map.put("product", productCode);
            ShopProvider shopProvider = shopV3ProviderProductsListFragment2.f14844n0;
            if (shopProvider == null) {
                kotlin.jvm.internal.j.n("mShopProvider");
                throw null;
            }
            map.put("provider", shopProvider.getName());
            c1220i.c(activity, c1219hD);
            return;
        }
        ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment3 = (ShopV3ProviderProductsListFragment) ((ve.f) iVar.c.get());
        C1220i c1220i2 = shopV3ProviderProductsListFragment3.f10245B;
        FragmentActivity activity2 = shopV3ProviderProductsListFragment3.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.PRODUCT);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String productCode2 = productV3 != null ? productV3.getProductCode() : null;
        HashMap map2 = c1219hD2.j;
        map2.put("product", productCode2);
        ShopProvider shopProvider2 = shopV3ProviderProductsListFragment3.f14844n0;
        if (shopProvider2 == null) {
            kotlin.jvm.internal.j.n("mShopProvider");
            throw null;
        }
        map2.put("provider", shopProvider2.getName());
        c1220i2.c(activity2, c1219hD2);
        InterfaceC2432u interfaceC2432u = shopV3ProviderProductsListFragment3.f14842k0;
        if (interfaceC2432u == null) {
            kotlin.jvm.internal.j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        ShopV3Activity shopV3Activity = (ShopV3Activity) interfaceC2432u;
        String id = productV3 != null ? productV3.getId() : null;
        ShopV3PaymentFragment shopV3PaymentFragment = new ShopV3PaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("product_id", id);
        shopV3PaymentFragment.setArguments(bundle);
        AbstractC1236z.h(shopV3Activity, R.id.pma_activity_shop_v3_fragment_container, shopV3PaymentFragment);
    }
}
