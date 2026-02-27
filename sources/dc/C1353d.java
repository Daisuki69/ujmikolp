package dc;

import N5.C0491z;
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
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.HashMap;

/* JADX INFO: renamed from: dc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1353d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ac.n f16309b;
    public final R4.i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16310d;
    public ShopPurchaseHistory e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f16311g;
    public final TextView h;
    public final ImageView i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1353d(C0491z c0491z, Context mContext, ac.n nVar) {
        super((ConstraintLayout) c0491z.f4303b);
        kotlin.jvm.internal.j.g(mContext, "mContext");
        this.f16308a = mContext;
        this.f16309b = nVar;
        this.f16310d = -1;
        ConstraintLayout shopListItemContainer = (ConstraintLayout) c0491z.f4305g;
        kotlin.jvm.internal.j.f(shopListItemContainer, "shopListItemContainer");
        this.f = (TextView) c0491z.h;
        this.f16311g = (TextView) c0491z.f4304d;
        this.h = (TextView) c0491z.e;
        this.i = (ImageView) c0491z.c;
        this.c = new R4.i(this);
        shopListItemContainer.setOnClickListener(new Y6.o(this, 15));
    }

    public static final void D(C1353d c1353d) {
        ac.n nVar = c1353d.f16309b;
        if (nVar != null) {
            int i = c1353d.f16310d;
            ShopPurchaseHistory shopPurchaseHistory = c1353d.e;
            MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) nVar;
            InterfaceC1094g interfaceC1094g = mayaShopHomePageFragment.w0;
            if (interfaceC1094g != null) {
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g;
                if (shopPurchaseHistory != null) {
                    mayaShopV2Activity.n1();
                    B5.i.E(mayaShopV2Activity, shopPurchaseHistory.mProductId());
                }
            }
            if (!mayaShopHomePageFragment.t1().e().isShopEventsV2Enabled()) {
                C1220i c1220iO1 = mayaShopHomePageFragment.o1();
                FragmentActivity activity = mayaShopHomePageFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaShopHomePageFragment.u1());
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.PRODUCT);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hD.j;
                map.put("location", "buy again");
                map.put("product", shopPurchaseHistory != null ? shopPurchaseHistory.mProductName() : null);
                map.put("position", String.valueOf(i + 1));
                c1220iO1.c(activity, c1219hD);
                return;
            }
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(12));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map2 = c1219hE.j;
            map2.put("source_page", "Home");
            map2.put("product_code", shopPurchaseHistory != null ? shopPurchaseHistory.mCode() : null);
            map2.put("section", "Buy Again");
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String strMProductName = shopPurchaseHistory != null ? shopPurchaseHistory.mProductName() : null;
            if (strMProductName != null) {
                c1219hE.j.put("product_name", strMProductName);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            String strMNetwork = shopPurchaseHistory != null ? shopPurchaseHistory.mNetwork() : null;
            if (strMNetwork != null) {
                c1219hE.j.put("provider", strMNetwork);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("price", String.valueOf(shopPurchaseHistory != null ? Double.valueOf(shopPurchaseHistory.mPrice()) : null));
            mayaShopHomePageFragment.o1().b(c1219hE);
        }
    }
}
