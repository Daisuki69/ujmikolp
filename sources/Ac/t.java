package ac;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopV3ListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7117b;

    public t(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("buOP0"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buOPg"));
        this.f7116a = new ArrayList(arrayList);
        this.f7117b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f7116a.get(i), this.f7117b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f7116a;
        ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM viewTypeShopProductItem = ((ShopV3ListItem) arrayList.get(i)).getViewTypeShopProductItem();
        ArrayList arrayList2 = this.f7117b;
        if (viewTypeShopProductItem != ((ShopV3ListItem) arrayList2.get(i4)).getViewTypeShopProductItem()) {
            return false;
        }
        if (((ShopV3ListItem) arrayList.get(i)).getViewTypeShopProductItem() != ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM.VIEW_TYPE_PRODUCT) {
            return true;
        }
        ProductV3 productV3 = (ProductV3) arrayList.get(i);
        ProductV3 productV32 = (ProductV3) arrayList2.get(i4);
        return kotlin.jvm.internal.j.b(productV3 != null ? productV3.getId() : null, productV32 != null ? productV32.getId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f7117b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f7116a.size();
    }
}
