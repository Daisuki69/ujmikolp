package dc;

import N5.C0466m;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cc.InterfaceC1094g;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.n f16327b;
    public final Q6.n c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProductV3 f16328d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f16329g;
    public final TextView h;
    public final ImageView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0466m c0466m, Context mContext, ac.n nVar) {
        super((ConstraintLayout) c0466m.f4150b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f16326a = mContext;
        this.f16327b = nVar;
        ConstraintLayout shopListMostPopularItemContainer = (ConstraintLayout) c0466m.c;
        kotlin.jvm.internal.j.f(shopListMostPopularItemContainer, "shopListMostPopularItemContainer");
        this.e = (TextView) c0466m.f4152g;
        this.f = (TextView) c0466m.e;
        this.f16329g = (TextView) c0466m.i;
        this.h = (TextView) c0466m.h;
        this.i = (ImageView) c0466m.f;
        this.c = new Q6.n(this, 11);
        shopListMostPopularItemContainer.setOnClickListener(new Y6.o(this, 19));
    }

    public static final void D(j jVar) {
        Amount amountOriginal;
        ac.n nVar = jVar.f16327b;
        if (nVar != null) {
            ProductV3 productV3 = jVar.f16328d;
            MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) nVar;
            InterfaceC1094g interfaceC1094g = mayaShopHomePageFragment.w0;
            if (interfaceC1094g != null) {
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g;
                if (productV3 != null) {
                    mayaShopV2Activity.n1();
                    B5.i.E(mayaShopV2Activity, productV3.getId());
                }
            }
            if (!mayaShopHomePageFragment.t1().e().isShopEventsV2Enabled()) {
                C1220i c1220iO1 = mayaShopHomePageFragment.o1();
                FragmentActivity activity = mayaShopHomePageFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaShopHomePageFragment.u1());
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.POPULAR);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String str = mayaShopHomePageFragment.f14010x0;
                HashMap map = c1219hD.j;
                map.put("section", str);
                map.put("product", productV3 != null ? productV3.getName() : null);
                c1220iO1.c(activity, c1219hD);
                return;
            }
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(12));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map2 = c1219hE.j;
            map2.put("source_page", "Home");
            map2.put("section", "Most Popular");
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String productCode = productV3 != null ? productV3.getProductCode() : null;
            if (productCode != null) {
                c1219hE.j.put("product_code", productCode);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            String name = productV3 != null ? productV3.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            String provider = productV3 != null ? productV3.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            String currencyFormattedValue = (productV3 == null || (amountOriginal = productV3.getAmountOriginal()) == null) ? null : amountOriginal.getCurrencyFormattedValue();
            if (currencyFormattedValue != null) {
                c1219hE.j.put("price", currencyFormattedValue);
            }
            EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
            String string = productV3 != null ? Boolean.valueOf(productV3.isPromo()).toString() : null;
            if (string != null) {
                c1219hE.j.put("promo", string);
            }
            mayaShopHomePageFragment.o1().b(c1219hE);
        }
    }
}
