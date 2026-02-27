package ac;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopSearchListItem;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7089b;

    public G(ArrayList arrayList, List list) {
        kotlin.jvm.internal.j.g(arrayList, numX49.tnTj78("buOl"));
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("buOW"));
        this.f7088a = new ArrayList(arrayList);
        this.f7089b = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        return kotlin.jvm.internal.j.b(this.f7088a.get(i), this.f7089b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        ArrayList arrayList = this.f7088a;
        ShopSearchListItem.VIEW_TYPE viewType = ((ShopSearchListItem) arrayList.get(i)).getViewType();
        ArrayList arrayList2 = this.f7089b;
        if (viewType != ((ShopSearchListItem) arrayList2.get(i4)).getViewType()) {
            return false;
        }
        if (((ShopSearchListItem) arrayList.get(i)).getViewType() != ShopSearchListItem.VIEW_TYPE.VIEW_TYPE_PRODUCT) {
            return true;
        }
        ProductV3 productV3 = (ProductV3) arrayList.get(i);
        ProductV3 productV32 = (ProductV3) arrayList2.get(i4);
        return kotlin.jvm.internal.j.b(productV3 != null ? productV3.getId() : null, productV32 != null ? productV32.getId() : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f7089b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f7088a.size();
    }
}
