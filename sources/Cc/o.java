package cc;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaShopProviderPageFragment f9348a;

    public o(MayaShopProviderPageFragment mayaShopProviderPageFragment) {
        this.f9348a = mayaShopProviderPageFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        String code;
        String name;
        ShopProviderSubcategory shopProviderSubcategory;
        ShopProviderSubcategory shopProviderSubcategory2;
        MayaShopProviderPageFragment mayaShopProviderPageFragment = this.f9348a;
        Callback.onPageSelected_enter(i);
        try {
            ac.x xVar = mayaShopProviderPageFragment.f14043p0;
            List list = xVar != null ? xVar.f7123b : null;
            if (mayaShopProviderPageFragment.t1().e().isShopEventsV2Enabled()) {
                String name2 = (list == null || (shopProviderSubcategory2 = (ShopProviderSubcategory) list.get(i)) == null) ? null : shopProviderSubcategory2.getName();
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(18));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hE.j;
                map.put("subcategory", name2);
                map.put("source_tab", mayaShopProviderPageFragment.f14041B0);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                ShopProvider shopProvider = mayaShopProviderPageFragment.f14049z0;
                String displayName = shopProvider != null ? shopProvider.getDisplayName() : null;
                if (displayName != null) {
                    c1219hE.j.put("provider_name", displayName);
                }
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                ShopProvider shopProvider2 = mayaShopProviderPageFragment.f14049z0;
                Object name3 = shopProvider2 != null ? shopProvider2.getName() : null;
                if (name3 != null) {
                    c1219hE.j.put("provider_code", name3);
                }
                mayaShopProviderPageFragment.o1().b(c1219hE);
                mayaShopProviderPageFragment.f14041B0 = name2;
            } else {
                String strTnTj78 = numX49.tnTj78("btQo");
                if (list == null || (shopProviderSubcategory = (ShopProviderSubcategory) list.get(i)) == null || (code = shopProviderSubcategory.getCode()) == null) {
                    code = strTnTj78;
                }
                String strValueOf = String.valueOf(i + 1);
                String strValueOf2 = String.valueOf(list != null ? Integer.valueOf(list.size()) : null);
                ShopProvider shopProvider3 = mayaShopProviderPageFragment.f14049z0;
                if (shopProvider3 != null && (name = shopProvider3.getName()) != null) {
                    strTnTj78 = name;
                }
                C1220i c1220iO1 = mayaShopProviderPageFragment.o1();
                FragmentActivity activity = mayaShopProviderPageFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP_PROVIDER);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.SUBCATEGORY);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map2 = c1219hD.j;
                map2.put("subcategory_code", code);
                map2.put("provider", strTnTj78);
                map2.put("subcategory_position", strValueOf);
                map2.put("subcategory_count", strValueOf2);
                c1220iO1.c(activity, c1219hD);
            }
            Callback.onPageSelected_exit();
        } catch (Throwable th2) {
            Callback.onPageSelected_exit();
            throw th2;
        }
    }
}
