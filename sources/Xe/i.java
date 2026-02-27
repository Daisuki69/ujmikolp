package xe;

import N5.C0455g1;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import o6.C1967a;
import v.AbstractC2329d;
import we.InterfaceC2400E;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopV3ProvidersCollectionFragment f20963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1967a f20964b;
    public ShopProvider c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20965d;
    public final ImageView e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0455g1 c0455g1, FragmentActivity mContext, ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment) {
        super(c0455g1.f4099b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20963a = shopV3ProvidersCollectionFragment;
        ConstraintLayout constraintLayout = c0455g1.c;
        kotlin.jvm.internal.j.f(constraintLayout, "containerLayoutPmaViewSh…V3ProvidersCollectionItem");
        this.f20965d = c0455g1.e;
        this.e = c0455g1.f4100d;
        this.f20964b = new C1967a(this, 16);
        constraintLayout.setOnClickListener(new qf.d(this, 21));
    }

    public static final void D(i iVar) {
        ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = iVar.f20963a;
        if (shopV3ProvidersCollectionFragment != null) {
            ShopProvider shopProvider = iVar.c;
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.BRAND);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("brand", shopProvider != null ? shopProvider.getDisplayName() : null);
            shopV3ProvidersCollectionFragment.o1(c1219hH);
            se.l lVar = (se.l) shopV3ProvidersCollectionFragment.B1();
            if (shopProvider != null) {
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment2 = (ShopV3ProvidersCollectionFragment) ((ve.h) lVar.c.get());
                shopV3ProvidersCollectionFragment2.getClass();
                InterfaceC2400E interfaceC2400E = shopV3ProvidersCollectionFragment2.f14859e0;
                if (interfaceC2400E != null) {
                    ShopV3Activity shopV3Activity = (ShopV3Activity) interfaceC2400E;
                    String str = ShopV3ProviderProductsListFragment.f14827o0;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("shop_provider", shopProvider);
                    ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = new ShopV3ProviderProductsListFragment();
                    shopV3ProviderProductsListFragment.setArguments(bundle);
                    AbstractC1236z.h(shopV3Activity, R.id.pma_activity_shop_v3_fragment_container, shopV3ProviderProductsListFragment);
                    shopV3Activity.m1(shopProvider.getDisplayName());
                }
            }
        }
    }
}
