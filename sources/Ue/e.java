package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderListItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20294b;

    public e(ArrayList arrayList, List list) {
        this.f20293a = new ArrayList(arrayList);
        this.f20294b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f20293a.get(i), this.f20294b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f20293a;
        ShopProviderListItem shopProviderListItem = (ShopProviderListItem) arrayList.get(i);
        ShopProviderListItem.VIEW_TYPE viewType = shopProviderListItem != null ? shopProviderListItem.getViewType() : null;
        ArrayList arrayList2 = this.f20294b;
        ShopProviderListItem shopProviderListItem2 = (ShopProviderListItem) arrayList2.get(i4);
        if (viewType != (shopProviderListItem2 != null ? shopProviderListItem2.getViewType() : null)) {
            return false;
        }
        ShopProviderListItem shopProviderListItem3 = (ShopProviderListItem) arrayList.get(i);
        if ((shopProviderListItem3 != null ? shopProviderListItem3.getViewType() : null) != ShopProviderListItem.VIEW_TYPE.VIEW_TYPE_PROVIDER) {
            return true;
        }
        ShopProvider shopProvider = (ShopProvider) arrayList.get(i);
        ShopProvider shopProvider2 = (ShopProvider) arrayList2.get(i4);
        return kotlin.jvm.internal.j.b(shopProvider != null ? shopProvider.getId() : null, shopProvider2 != null ? shopProvider2.getId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20294b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20293a.size();
    }
}
