package xe;

import android.content.Context;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import java.util.HashMap;
import we.InterfaceC2422k;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue.m f20957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o6.f f20958b;
    public ShopProvider c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Z4.a aVar, Context mContext, ue.m mVar) {
        super(aVar.f6889b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f20957a = mVar;
        CardView containerCardViewPmaShopViewV3ProviderLogoCard = (CardView) aVar.c;
        kotlin.jvm.internal.j.f(containerCardViewPmaShopViewV3ProviderLogoCard, "containerCardViewPmaShopViewV3ProviderLogoCard");
        this.f20959d = (ImageView) aVar.f6890d;
        this.f20958b = new o6.f(this, 12);
        containerCardViewPmaShopViewV3ProviderLogoCard.setOnClickListener(new qf.d(this, 19));
    }

    public static final void D(g gVar) {
        ue.m mVar = gVar.f20957a;
        if (mVar != null) {
            ShopProvider shopProvider = gVar.c;
            ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) mVar;
            InterfaceC2422k interfaceC2422k = shopV3HomePageFragment.f14800i0;
            if (interfaceC2422k != null) {
                MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2422k;
                mayaShopActivity.e.getClass();
                B5.i.a0(mayaShopActivity, shopProvider);
            }
            C1220i c1220i = shopV3HomePageFragment.f10245B;
            FragmentActivity activity = shopV3HomePageFragment.getActivity();
            C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PROVIDER);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = shopV3HomePageFragment.f14801j0;
            HashMap map = c1219hD.j;
            map.put("section", str);
            map.put("provider", shopProvider != null ? shopProvider.getName() : null);
            c1220i.c(activity, c1219hD);
        }
    }
}
