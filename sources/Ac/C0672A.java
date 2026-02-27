package ac;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProvidersCollectionItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ac.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0672A extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7079b;

    public C0672A(ArrayList arrayList, List list) {
        this.f7078a = new ArrayList(arrayList);
        this.f7079b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f7078a.get(i), this.f7079b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f7078a;
        ShopV3ProvidersCollectionItem shopV3ProvidersCollectionItem = (ShopV3ProvidersCollectionItem) arrayList.get(i);
        ShopV3ProvidersCollectionItem.ViewType viewTypeProvidersCollectionItem = shopV3ProvidersCollectionItem != null ? shopV3ProvidersCollectionItem.getViewTypeProvidersCollectionItem() : null;
        ArrayList arrayList2 = this.f7079b;
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
        return this.f7079b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f7078a.size();
    }
}
