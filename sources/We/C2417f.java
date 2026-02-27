package we;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.InterfaceC1227p;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;
import v.AbstractC2329d;

/* JADX INFO: renamed from: we.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2417f implements Toolbar.OnMenuItemClickListener, InterfaceC1227p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3Fragment f20758b;

    public /* synthetic */ C2417f(ShopV3Fragment shopV3Fragment, int i) {
        this.f20757a = i;
        this.f20758b = shopV3Fragment;
    }

    @Override // com.paymaya.common.utility.InterfaceC1227p
    public void a() {
        switch (this.f20757a) {
            case 1:
                this.f20758b.F1();
                break;
            default:
                this.f20758b.F1();
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        kotlin.jvm.internal.j.g(item, "item");
        int itemId = item.getItemId();
        ShopV3Fragment shopV3Fragment = this.f20758b;
        if (itemId == R.id.pma_menu_shop_purchase_history_icon) {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.PURCHASE_HISTORY);
            shopV3Fragment.o1(c1219hH);
            InterfaceC2418g interfaceC2418g = shopV3Fragment.f14787d0;
            if (interfaceC2418g == null) {
                return false;
            }
            MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2418g;
            mayaShopActivity.e.Y(mayaShopActivity, null);
            return false;
        }
        if (itemId != R.id.pma_menu_shop_search_icon) {
            return false;
        }
        C1219h c1219hH2 = AbstractC2329d.h(17);
        c1219hH2.t(EnumC1217f.SEARCH);
        shopV3Fragment.o1(c1219hH2);
        InterfaceC2418g interfaceC2418g2 = shopV3Fragment.f14787d0;
        if (interfaceC2418g2 == null) {
            return false;
        }
        MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2418g2;
        mayaShopActivity2.e.getClass();
        B5.i.c0(mayaShopActivity2, "");
        return false;
    }
}
