package ue;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20315b;

    public v(ArrayList arrayList, List list) {
        this.f20314a = new ArrayList(arrayList);
        this.f20315b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f20314a.get(i), this.f20315b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f20314a;
        ShopV3ProvidersCollectionItem shopV3ProvidersCollectionItem = (ShopV3ProvidersCollectionItem) arrayList.get(i);
        ShopV3ProvidersCollectionItem.ViewType viewTypeProvidersCollectionItem = shopV3ProvidersCollectionItem != null ? shopV3ProvidersCollectionItem.getViewTypeProvidersCollectionItem() : null;
        ArrayList arrayList2 = this.f20315b;
        ShopV3ProvidersCollectionItem shopV3ProvidersCollectionItem2 = (ShopV3ProvidersCollectionItem) arrayList2.get(i4);
        if (viewTypeProvidersCollectionItem != (shopV3ProvidersCollectionItem2 != null ? shopV3ProvidersCollectionItem2.getViewTypeProvidersCollectionItem() : null)) {
            return false;
        }
        ShopV3ProvidersCollectionItem shopV3ProvidersCollectionItem3 = (ShopV3ProvidersCollectionItem) arrayList.get(i);
        if ((shopV3ProvidersCollectionItem3 != null ? shopV3ProvidersCollectionItem3.getViewTypeProvidersCollectionItem() : null) != ShopV3ProvidersCollectionItem.ViewType.VIEW_TYPE_PROVIDER) {
            return true;
        }
        ShopProvider shopProvider = (ShopProvider) arrayList.get(i);
        ShopProvider shopProvider2 = (ShopProvider) arrayList2.get(i4);
        return kotlin.jvm.internal.j.b(shopProvider != null ? shopProvider.getId() : null, shopProvider2 != null ? shopProvider2.getId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f20315b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f20314a.size();
    }
}
