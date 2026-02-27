package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopV3ListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20309b;

    public s(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("bFlPH"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bFlPO"));
        this.f20308a = new ArrayList(arrayList);
        this.f20309b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f20308a.get(i), this.f20309b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f20308a;
        ShopV3ListItem.VIEW_TYPE_SHOP_PRODUCT_ITEM viewTypeShopProductItem = ((ShopV3ListItem) arrayList.get(i)).getViewTypeShopProductItem();
        ArrayList arrayList2 = this.f20309b;
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
        return this.f20309b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20308a.size();
    }
}
