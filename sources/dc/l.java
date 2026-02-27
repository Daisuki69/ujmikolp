package dc;

import N5.t1;
import Q6.s;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cc.InterfaceC1094g;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.n f16334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16335b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ShopHomeSectionCarousel f16336d;
    public ShopProvider e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f16337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t1 t1Var, Context mContext, ac.n nVar) {
        super(t1Var.f4216b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f16334a = nVar;
        this.c = -1;
        ConstraintLayout containerCardViewPmaShopViewV3ProviderLogoCard = t1Var.c;
        kotlin.jvm.internal.j.f(containerCardViewPmaShopViewV3ProviderLogoCard, "containerCardViewPmaShopViewV3ProviderLogoCard");
        this.f = t1Var.f4217d;
        this.f16337g = t1Var.e;
        this.f16335b = new s(this);
        containerCardViewPmaShopViewV3ProviderLogoCard.setOnClickListener(new Y6.o(this, 21));
    }

    public static final void D(l lVar) {
        ac.n nVar = lVar.f16334a;
        if (nVar != null) {
            int i = lVar.c;
            ShopHomeSectionCarousel shopHomeSectionCarousel = lVar.f16336d;
            ShopProvider shopProvider = lVar.e;
            MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) nVar;
            InterfaceC1094g interfaceC1094g = mayaShopHomePageFragment.w0;
            String str = "brands_for_you";
            if (interfaceC1094g != null) {
                mayaShopHomePageFragment.R1();
                String name = shopHomeSectionCarousel != null ? shopHomeSectionCarousel.getName() : null;
                ((MayaShopV2Activity) interfaceC1094g).getIntent().putExtra("origin_screen", kotlin.jvm.internal.j.b(name, "Load") ? "load" : kotlin.jvm.internal.j.b(name, "Brands for you") ? "brands_for_you" : null);
            }
            InterfaceC1094g interfaceC1094g2 = mayaShopHomePageFragment.w0;
            if (interfaceC1094g2 != null) {
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g2;
                mayaShopV2Activity.n1();
                Intent intent = new Intent(mayaShopV2Activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
                intent.setData(mayaShopV2Activity.getIntent().getData());
                intent.putExtra("flow_to_screen", "provider_product_list");
                intent.putExtra("shop_provider", shopProvider);
                B5.i.w0(mayaShopV2Activity, intent);
                B5.i.v0(mayaShopV2Activity, intent);
                mayaShopV2Activity.startActivityForResult(intent, 500);
            }
            if (mayaShopHomePageFragment.t1().e().isShopEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(2));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String name2 = shopProvider != null ? shopProvider.getName() : null;
                if (name2 != null) {
                    c1219hE.j.put("provider_code", name2);
                }
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                String displayName = shopProvider != null ? shopProvider.getDisplayName() : null;
                if (displayName != null) {
                    c1219hE.j.put("provider", displayName);
                }
                c1219hE.j.put("section", "Home");
                mayaShopHomePageFragment.o1().b(c1219hE);
                return;
            }
            C1219h c1219hD = C1219h.d(mayaShopHomePageFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PROVIDER);
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String str2 = mayaShopHomePageFragment.f14010x0;
            HashMap map = c1219hD.j;
            map.put("section", str2);
            map.put("provider_name", shopProvider != null ? shopProvider.getName() : null);
            map.put("provider_id", shopProvider != null ? shopProvider.getId() : null);
            map.put("position", String.valueOf(i + 1));
            map.put("module", "Shop");
            mayaShopHomePageFragment.R1();
            if (shopHomeSectionCarousel != null) {
                int position = shopHomeSectionCarousel.getPosition() - 1;
                String name3 = shopHomeSectionCarousel.getName();
                if (kotlin.jvm.internal.j.b(name3, "Load")) {
                    str = "load";
                } else if (!kotlin.jvm.internal.j.b(name3, "Brands for you")) {
                    str = null;
                }
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD.j.put("widget_position", String.valueOf(position));
                if (str != null) {
                    EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hD.j.put("widget_name", str);
                }
            }
            mayaShopHomePageFragment.o1().c(mayaShopHomePageFragment.getActivity(), c1219hD);
        }
    }
}
